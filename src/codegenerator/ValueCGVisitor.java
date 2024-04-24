package codegenerator;

import ast.expression.*;
import ast.statement.FunctionInvocation;
import ast.type.IntType;

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
     * execute[[FunctionInvocation: expression1 -> expression2 expression3*]]() =
     *      expression3*.forEach(exp -> value[[exp]]())
     *      <call > expression2.name
     */
    @Override
    public Void visit(FunctionInvocation e, Void param) {
        e.getParameters().forEach(exp -> exp.accept(this, null));
        cg.call(e.getName().getName(), 1);
        return null;
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
        e.getLeft().accept(this, null);
        cg.convert(e.getLeft().getType(), e.getType());
        e.getRight().accept(this, null);
        cg.convert(e.getRight().getType(), e.getType());
        cg.arithmetic(e.getOperator(), e.getType());
        return null;
    }

    /**
     * value[[ArrayAccess: expression1 -> expression2 expression3]]() =
     *      address[[expression1]]()
     *      <load> expression1.type.sufix()
     */
    @Override
    public Void visit(ArrayAccess e, Void param) {
        e.accept(address, null);
        cg.load(e.getType());
        return null;
    }

    /**
     * value[[Cast: expression1 -> type expression2]]() =
     *      value[[expression2]]()
     *      cg.convert(expression2.type, type);
     */
    @Override
    public Void visit(Cast e, Void param) {
        e.getExpression().accept(this, null);
        cg.convert(e.getExpression().getType(), e.getCastType());
        return null;
    }

    /**
     * value[[CharLiteral: expression -> CHAR_CONSTANT]]() =
     *      <pushb > (int)expression.value
     */
    @Override
    public Void visit(CharLiteral e, Void param) {
        cg.push(e.getValue());
        return null;
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
        e.getLeft().accept(this, null);
        cg.convert(e.getLeft().getType(), e.getType());
        e.getRight().accept(this, null);
        cg.convert(e.getRight().getType(), e.getType());
        cg.comparison(e.getOperator(), e.getType());
        return null;
    }

    /**
     * value[[DoubleLiteral: expression -> REAL_CONSTANT]]() =
     *      <pushf > expression.value
     */
    @Override
    public Void visit(DoubleLiteral e, Void param) {
        cg.push(e.getValue());
        return null;
    }

    /**
     * value[[IntLiteral: expression -> INT_CONSTANT]]() =
     *      <pushi > expression.value
     */
    @Override
    public Void visit(IntLiteral e, Void param) {
        cg.push(e.getValue());
        return null;
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
        e.getLeft().accept(this, null);
        cg.convert(e.getLeft().getType(), e.getType());
        e.getRight().accept(this, null);
        cg.convert(e.getRight().getType(), e.getType());
        cg.logical(e.getOperator());
        return null;
    }

    /**
     * value[[LogicalNot: expression1 -> expression2]]() =
     *      value[[expression2]]()
     *      cg.convert(expression2.type, expression1.type);
     *      <not>
     */
    @Override
    public Void visit(LogicalNot e, Void param) {
        e.getExpression().accept(this, null);
        cg.convert(e.getExpression().getType(), e.getType());
        cg.not();
        return null;
    }

    /**
     * value[[StructAccess: expression1 -> expression2 ID]]() =
     *      address[[expression1]]()
     *      <load> expression1.type.sufix()
     */
    @Override
    public Void visit(StructAccess e, Void param) {
        e.accept(address, null);
        cg.load(e.getType());
        return null;
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
        e.getExpression().accept(this, null);
        cg.convert(e.getExpression().getType(), e.getType());
        cg.push(-1);
        cg.convert(IntType.getInstance(), e.getType());
        cg.mul(e.getType());
        return null;
    }

    /**
     * value[[Variable: expression -> ID]]() =
     *      address[[expression]]()
     *      <load> expression.type.sufix()
     */
    @Override
    public Void visit(Variable e, Void param) {
        e.accept(address, null);
        cg.load(e.getType());
        return null;
    }
}
