package ast.expression;

import ast.Expression;

public abstract class Logical extends AbstractExpression2Param implements Expression {
    public Logical(int line, int column, String operator, Expression left, Expression right) {
        super(line, column, operator, left, right);
    }
}
