package ast.expression;

import ast.Expression;

public abstract class AbstractExpression1Param extends AbstractExpression {
    private Expression expression;

    public AbstractExpression1Param(int line, int column, Expression expression) {
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
