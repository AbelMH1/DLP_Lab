package codegenerator;

import ast.Program;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.statement.*;

import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

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
    public Void visit(Program e, Void param) {
        return super.visit(e, param);
    }

    /**
     * execute[[FunctionDefinition: definition -> type ID vardefinition* statement*]]() =
     *      ID < :>
     *      int bytesLocals = vardefinition*.isEmpty() ? 0 : -vardefinition*.get(vardefinition*.size()-1).offset;
     *      <enter > bytesLocals
     *
     *      // type is FunctionType
     *      int bytesParams = type.parameters.stream().mapToInt(
     *                          param -> param.type.numberOfBytes()).sum();
     *      int bytesReturn = type.returnType.numberOfBytes();
     *      statement*.forEach(stmt -> execute[[stmt]])
     *      if (bytesReturn==0) // sin sentencia return
     *          ret bytesReturn , bytesLocals , bytesParams
     */
    @Override
    public Void visit(FunctionDefinition e, Void param) {
        return super.visit(e, param);
    }

    /**
     * execute[[VariableDefinition: statement -> type ID]]() =
     *      <' * > type.toString() < > ID < (offset > statement.offset() <)>
     */
    @Override
    public Void visit(VariableDefinition e, Void param) {
        return super.visit(e, param);
    }

    /**
     * execute[[Assignment: statement -> expression1 expression2]]() =
     *      address[[expression1]]()
     *      value[[expression2]]()
     *      <store> expression1.type.sufix()
     */
    @Override
    public Void visit(Assignment e, Void param) {
        return super.visit(e, param);
    }

    /**
     * execute[[FunctionInvocation: statement -> expression1 expression2*]]() =
     *      expression2*.forEach(exp -> value[[exp]]())
     *      <call > expression1.name
     *      if(!(expression1.type.returnType instanceof VoidType))
     *          <pop > expression1.type.returnType.sufix()
     */
    @Override
    public Void visit(FunctionInvocation e, Void param) {
        return super.visit(e, param);
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
    public Void visit(If e, Void param) {
        return super.visit(e, param);
    }

    /**
     * execute[[Input: statement -> expression]]() =
     *      address[[expression]]()
     *      <in> expression.type.sufix()
     *      <store> expression.type.sufix()
     */
    @Override
    public Void visit(Input e, Void param) {
        return super.visit(e, param);
    }

    /**
     * execute[[Print: statement -> expression*]]() =
     *      for (Expression exp: expression*) {
     *          value[[exp]]()
     *          <out> exp.type.sufix()
     *      }
     */
    @Override
    public Void visit(Print e, Void param) {
        return super.visit(e, param);
    }

    /**
     * execute[[Return: statement -> expression]](int bytesLocals, int bytesParams, int bytesReturn) =
     *      value[[expression]]()
     *      <ret > bytesReturn < , > bytesLocals < , > bytesParams
     */
    @Override
    public Void visit(Return e, Void param) {
        return super.visit(e, param);
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
    public Void visit(While e, Void param) {
        return super.visit(e, param);
    }
}
