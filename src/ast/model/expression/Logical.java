package ast.model.expression;

import ast.model.AbstractASTNode;
import ast.model.Expression;

public abstract class Logical extends AbstractASTNode implements Expression {
    private String operator;
    private Expression left;
    private Expression right;

    public Logical(int line, int column, String operator, Expression left, Expression right) {
        super(line, column);
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
}