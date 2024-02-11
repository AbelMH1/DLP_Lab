package model.expression;

import model.AbstractASTNode;
import model.Expression;

public class UnaryMinus extends AbstractASTNode implements Expression {
    private Expression expression;

    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
