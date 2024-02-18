package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class StructAccess extends AbstractASTNode implements Expression {
    private String field;
    private Expression left;

    public StructAccess(int line, int column, String field, Expression left) {
        super(line, column);
        this.field = field;
        this.left = left;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }
}
