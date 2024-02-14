package ast.model.expression;

import ast.model.AbstractASTNode;
import ast.model.Expression;

public abstract class IntLiteral extends AbstractASTNode implements Expression {
    private int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}