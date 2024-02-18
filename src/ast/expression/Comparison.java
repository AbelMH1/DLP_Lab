package ast.expression;

import ast.Expression;

public abstract class Comparison extends AbstractExpression2Param implements Expression {
    public Comparison(int line, int column, String operator, Expression left, Expression right) {
        super(line, column, operator, left, right);
    }
}
