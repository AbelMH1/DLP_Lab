package ast.expression;

import ast.Expression;

public class UnaryMinus extends AbstractExpression1Param implements Expression {
    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column, expression);
    }
}
