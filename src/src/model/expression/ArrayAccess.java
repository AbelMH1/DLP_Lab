package model.expression;

import model.AbstractASTNode;
import model.Expression;

public class ArrayAccess extends AbstractASTNode implements Expression {
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
}
