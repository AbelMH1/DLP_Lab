package ast.expression;

import ast.Expression;

public abstract class LogicalNot extends AbstractExpression1Param implements Expression {
    public LogicalNot(int line, int column, Expression expression) {
        super(line, column, expression);
    }
}