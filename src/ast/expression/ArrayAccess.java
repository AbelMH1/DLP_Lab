package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class ArrayAccess extends AbstractExpression implements Expression {
    private Expression left;
    private Expression access;

    public ArrayAccess(int line, int column, Expression left, Expression access) {
        super(line, column);
        this.left = left;
        this.access = access;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getAccess() {
        return access;
    }

    public void setAccess(Expression access) {
        this.access = access;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "ArrayAccess{" +
                left.toString() +
                "[" + access.toString() + "]" +
                '}';
    }
}
