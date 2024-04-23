package codegenerator;

import ast.expression.*;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {
    private CodeGenerator cg;
    private AddressCGVisitor address;

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        this.cg = codeGenerator;
    }

    public void setAddress(AddressCGVisitor address) {
        this.address = address;
    }

    /**
     * value[[Arithmetic: expression1 -> expression2 OP expression3]]() =
     *      value[[expression2]]()
     *      cg.convert(expression2.type, expression1.type);
     *      value[[expression3]]()
     *      cg.convert(expression3.type, expression1.type);
     *      cg.arithmetic(OP, expression1.type);
     *
     */
    @Override
    public Void visit(Arithmetic e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[ArrayAccess: expression1 -> expression2 expression3]]() =
     *      address[[expression1]]()
     *      <load> expression1.type.sufix()
     */
    @Override
    public Void visit(ArrayAccess e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[Cast: expression1 -> type expression2]]() =
     *      cg.convert(expression2.type, type);
     */
    @Override
    public Void visit(Cast e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[CharLiteral: expression -> CHAR_CONSTANT]]() =
     *      <pushb > (int)expression.value
     */
    @Override
    public Void visit(CharLiteral e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[Comparison: expression1 -> expression2 OP expression3]]() =
     *      value[[expression2]]()
     *      cg.convert(expression2.type, expression1.type);
     *      value[[expression3]]()
     *      cg.convert(expression3.type, expression1.type);
     *      cg.comparison(OP, expression1.type);
     */
    @Override
    public Void visit(Comparison e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[DoubleLiteral: expression -> REAL_CONSTANT]]() =
     *      <pushf > expression.value
     */
    @Override
    public Void visit(DoubleLiteral e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[IntLiteral: expression -> INT_CONSTANT]]() =
     *      <pushi > expression.value
     */
    @Override
    public Void visit(IntLiteral e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[Logical: expression1 -> expression2 OP expression3]]() =
     *      value[[expression2]]()
     *      cg.convert(expression2.type, expression1.type);
     *      value[[expression3]]()
     *      cg.convert(expression3.type, expression1.type);
     *      cg.logical(OP);
     */
    @Override
    public Void visit(Logical e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[LogicalNot: expression1 -> expression2]]() =
     *      value[[expression2]]()
     *      cg.convert(expression2.type, expression1.type);
     *      <not>
     */
    @Override
    public Void visit(LogicalNot e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[StructAccess: expression1 -> expression2 ID]]() =
     *      address[[expression1]]()
     *      <load> expression1.type.sufix()
     */
    @Override
    public Void visit(StructAccess e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[UnaryMinus: expression1 -> expression2]]() =
     *      value[[expression2]]()
     *      cg.convert(expression2.type, expression1.type);
     *      <pushi -1>
     *      <i2> expression1.type.sufix()
     *      <mul> expression1.type.sufix()
     */
    @Override
    public Void visit(UnaryMinus e, Void param) {
        return super.visit(e, param);
    }

    /**
     * value[[Variable: expression -> ID]]() =
     *      address[[expression]]()
     *      <load> expression.type.sufix()
     */
    @Override
    public Void visit(Variable e, Void param) {
        return super.visit(e, param);
    }
}
