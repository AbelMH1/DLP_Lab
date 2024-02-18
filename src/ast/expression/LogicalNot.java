package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public abstract class LogicalNot extends AbstractASTNode implements Expression {
    private Expression expression;

    public LogicalNot(int line, int column, Expression expression) {
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