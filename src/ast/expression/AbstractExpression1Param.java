package ast.expression;

import ast.Expression;

public class AbstractExpression1Param extends AbstractExpression implements Expression {
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
