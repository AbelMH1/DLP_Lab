package codegenerator;

import ast.definition.VariableDefinition;
import ast.expression.ArrayAccess;
import ast.expression.StructAccess;
import ast.expression.Variable;
import ast.type.IntType;
import ast.type.StructType;

public class AddressCGVisitor extends AbstractCGVisitor<Void, Void> {
    private CodeGenerator cg;
    private ValueCGVisitor value;

    public AddressCGVisitor(CodeGenerator codeGenerator) {
        this.cg = codeGenerator;
    }

    public void setValue(ValueCGVisitor value) {
        this.value = value;
    }

    /**
     * address[[ArrayAccess: expression1 -> expression2 expression3]]() =
     *      address[[expression2]]()
     *      value[[expression3]]()
     *      <pushi > expression1.type.numberOfBytes()
     *      <multi>
     *      <addi>
     */
    @Override
    public Void visit(ArrayAccess e, Void param) {
        e.getLeft().accept(this, null);
        e.getAccess().accept(value, null);
        cg.push(e.getType().numberOfBytes());
        cg.mul(IntType.getInstance());
        cg.add(IntType.getInstance());
        return null;
    }

    /**
     * address[[StructAccess: expression1 -> expression2 ID]]() =
     *      address[[expression2]]()
     *      <pushi > expression2.type.getField(ID).offset()
     *      <addi>
     */
    @Override
    public Void visit(StructAccess e, Void param) {
        e.getLeft().accept(this, null);
        cg.push(((StructType)e.getLeft().getType()).getField(e.getField()).getOffset());
        cg.add(IntType.getInstance());
        return null;
    }

    /**
     * address[[Variable: expression1 -> ID]]() =
     *      if (expression1.definition.scope==0)
     *          <pusha > expression1.definition.offset
     *      else {
     *          <push bp>
     *          <pushi > expression1.definition.offset
     *          <addi>
     *      }
     */
    @Override
    public Void visit(Variable e, Void param) {
        if (e.getVarDef().getScope() == 0) {
            cg.pusha(((VariableDefinition)e.getVarDef()).getOffset());
        } else {
            cg.pusha();
            cg.push(((VariableDefinition)e.getVarDef()).getOffset());
            cg.add(IntType.getInstance());
        }
        return null;
    }
}
