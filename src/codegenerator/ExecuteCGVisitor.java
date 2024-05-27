package codegenerator;

import ast.Definition;
import ast.Expression;
import ast.Program;
import ast.Statement;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.statement.*;
import ast.type.FunctionType;
import ast.type.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor<FunctionDefinition, Void> {

    private CodeGenerator cg;
    private AddressCGVisitor address;
    private ValueCGVisitor value;

    public ExecuteCGVisitor(CodeGenerator codeGenerator) {
        this.cg = codeGenerator;
        this.address = new AddressCGVisitor(codeGenerator);
        this.value = new ValueCGVisitor(codeGenerator);
        this.address.setValue(value);
        this.value.setAddress(address);
    }


    /**
     * execute[[Program: program -> definition*]]() =
     *      <' * Global variables:>
     *      for (Definition def: definition*) {
     *          if (def instanceof VarDEf) {
     *              execute[[def]]()
     *          }
     *      }
     *      <call main>
     *      <halt>
     *      for (Definition def: definition*) {
     *          if (def instanceof FuncDef) {
     *              execute[[def]]()
     *          }
     *      }
     */
    @Override
    public Void visit(Program e, FunctionDefinition param) {
        cg.commentOL("* Global variables:", 0);
        for(Definition def: e.getBody()) {
            if (def instanceof VariableDefinition) {
                def.accept(this, param);
            }
        }
        cg.commentOL("Invocation to the main function", 0);
        cg.call("main", 0);
        cg.halt();
        for(Definition def: e.getBody()) {
            if (def instanceof FunctionDefinition) {
                cg.line(def.getLine());
                def.accept(this, param);
            }
        }
        return null;
    }

    /**
     * execute[[FunctionDefinition: funcDefinition -> type ID vardefinition* statement*]]() =
     *      ID < :>
     *      <' * Parameters:>
     *      execute[[type]]() // Para añadir comentarios de los parámetros
     *      <' * Local Variables:>
     *      vardefinition*.forEach(varDef -> execute[[varDef]]) // Para añadir comentarios de las variables
     *
     *      int bytesLocals = vardefinition*.isEmpty() ? 0 : -vardefinition*.get(vardefinition*.size()-1).offset;
     *      <enter > bytesLocals
     *
     *      // type is FunctionType
     *      int bytesParams = type.parameters.stream().mapToInt(
     *                          param -> param.type.numberOfBytes()).sum();
     *      int bytesReturn = type.returnType.numberOfBytes();
     *
     *      statement*.forEach(stmt -> execute[[stmt]](bytesLocals, bytesParams, bytesReturn))
     *      if (bytesReturn==0) // sin sentencia return
     *          <ret > bytesReturn < , > bytesLocals < , > bytesParams
     */
    @Override
    public Void visit(FunctionDefinition e, FunctionDefinition param) {
        cg.label(e.getName());
        // Añadir comentarios de variables y parámetros
        cg.commentOL("* Parameters", 1);
        e.getType().accept(this, param);
        cg.commentOL("* Local variables", 1);
        var varDefinitions = e.getBody().stream()
                .filter(stm -> stm instanceof VariableDefinition)
                .map(stm -> (VariableDefinition)stm).toList();
        varDefinitions.forEach(varDef -> varDef.accept(this, param));

        int bytesLocals = e.getBytesLocalSum(); // varDefinitions.isEmpty() ? 0 : -varDefinitions.get(varDefinitions.size()-1).getOffset();
        cg.enter(bytesLocals);

        var funcType = (FunctionType)e.getType();
        int bytesParams = funcType.getBytesParamSum(); // funcType.getParams().stream().mapToInt(varDef -> varDef.getType().numberOfBytes()).sum();
        int bytesReturn = funcType.getReturnType().numberOfBytes();

        for(Statement stm: e.getBody()) {
            if (!(stm instanceof VariableDefinition)) {
                cg.line(stm.getLine());
                stm.accept(this, e);
            }
        }

        if (bytesReturn == 0) {
            cg.ret(bytesReturn, bytesLocals, bytesParams);
        }
        return null;
    }

    /**
     * execute[[FunctionType: type1 -> type varDefinition*]]() =
     *      vardefinition*.forEach(varDef -> execute[[varDef]]) // Para añadir comentarios de los parámetros
     */
    @Override
    public Void visit(FunctionType e, FunctionDefinition param) {
        e.getParams().forEach(varDef -> varDef.accept(this, param));
        return null;
    }

    /**
     * execute[[VariableDefinition: varDefinition -> type ID]]() =
     *      <' * > type.toString() < > ID < (offset > varDefinition.offset() <)>
     */
    @Override
    public Void visit(VariableDefinition e, FunctionDefinition param) {
        String str = String.format("* %s %s (offset %d)", e.getType().toString(), e.getName(), e.getOffset());
        cg.commentOL(str, 1);
        return null;
    }

    /**
     * execute[[Assignment: statement -> expression1 expression2]]() =
     *      address[[expression1]]()
     *      value[[expression2]]()
     *      <store> expression1.type.sufix()
     */
    @Override
    public Void visit(Assignment e, FunctionDefinition param) {
        cg.commentOL("* Assignment", 1);
        e.getLeft().accept(address, null);
        e.getRight().accept(value, null);
        cg.store(e.getLeft().getType());
        return null;
    }

    /**
     * execute[[FunctionInvocation: statement -> expression1 expression2*]]() =
     *      expression2*.forEach(exp -> value[[exp]]())
     *      <call > expression1.name
     *      if(!(expression1.type.returnType instanceof VoidType))
     *          <pop > expression1.type.returnType.sufix()
     */
    @Override
    public Void visit(FunctionInvocation e, FunctionDefinition param) {
        var funcType = (FunctionType)e.getName().getType();
        for(int i = 0; i < e.getParameters().size(); i++) {
            e.getParameters().get(i).accept(value, null);
            // FIXME: No está generando bien las instrucciones de conversión de tipos
            cg.convert(e.getParameters().get(i).getType(), funcType.getParams().get(i).getType());
        }
        cg.call(e.getName().getName(), 1);
        var retType = funcType.getReturnType();
        if (!(retType instanceof VoidType)) {
            cg.pop(retType);
        }
        return null;
    }

    /**
     * execute[[If: statement1 -> expression statement2+ statement3*]]() =
     *      String else = cg.nextLabel();
     *      String end = cg.nextLabel();
     *      value[[expression]]()
     *      <jz > else
     *      statement2+.forEach(stmt -> execute[[stmt]]())
     *      <jmp > end
     *      else < :>
     *      statement3*.forEach(stmt -> execute[[stmt]]())
     *      end < :>
     */
    @Override
    public Void visit(If e, FunctionDefinition param) {
        cg.commentOL("* If", 1);
        String elsePart = cg.getNextLabel();
        String end = cg.getNextLabel();
        e.getCondition().accept(value, null);
        cg.jz(elsePart);
        cg.commentOL("* if body", 1);
        e.getIfPart().forEach(stm -> {
            cg.line(stm.getLine());
            stm.accept(this, param);
        });
        cg.jmp(end);
        cg.label(elsePart);
        cg.commentOL("* else body", 1);
        e.getElsePart().forEach(stm -> {
            cg.line(stm.getLine());
            stm.accept(this, param);
        });
        cg.label(end);
        return null;
    }

    /**
     * execute[[Input: statement -> expression]]() =
     *      address[[expression]]()
     *      <in> expression.type.sufix()
     *      <store> expression.type.sufix()
     */
    @Override
    public Void visit(Input e, FunctionDefinition param) {
        cg.commentOL("* Read", 1);
        e.getInput().accept(address, null);
        cg.in(e.getInput().getType());
        cg.store(e.getInput().getType());
        return null;
    }

    /**
     * execute[[Print: statement -> expression*]]() =
     *      for (Expression exp: expression*) {
     *          value[[exp]]()
     *          <out> exp.type.sufix()
     *      }
     */
    @Override
    public Void visit(Print e, FunctionDefinition param) {
        for (Expression exp: e.getParameters()) {
            cg.commentOL("* Write", 1);
            exp.accept(value, null);
            cg.out(exp.getType());
        }
        return null;
    }

    /**
     * execute[[Return: statement -> expression]](int bytesLocals, int bytesParams, int bytesReturn) =
     *      value[[expression]]()
     *      <ret > bytesReturn < , > bytesLocals < , > bytesParams
     */
    @Override
    public Void visit(Return e, FunctionDefinition funcDef) {
        cg.commentOL("* Return", 1);
        e.getExpression().accept(value, null);
        var type = (FunctionType)funcDef.getType();
        cg.convert(e.getExpression().getType(), type.getReturnType());
        cg.ret(type.getReturnType().numberOfBytes(), funcDef.getBytesLocalSum(), type.getBytesParamSum());
        return null;
    }

    /**
     * execute[[While: statement1 -> expression statement2*]]() =
     *      String condition = cg.nextLabel();
     *      String end = cg.nextLabel();
     *      condition < :>
     *      value[[expression]]()
     *      <jz > end
     *      statement2*.forEach(stmt -> execute[[stmt]]())
     *      <jmp > condition
     *      end < :>
     */
    @Override
    public Void visit(While e, FunctionDefinition param) {
        cg.commentOL("* While", 1);
        String condition = cg.getNextLabel();
        String end = cg.getNextLabel();
        cg.label(condition);
        e.getCondition().accept(value, null);
        cg.jz(end);
        cg.commentOL("* While body", 1);
        e.getBody().forEach(stm -> {
            cg.line(stm.getLine());
            stm.accept(this, param);
        });
        cg.jmp(condition);
        cg.label(end);
        return null;
    }
}
