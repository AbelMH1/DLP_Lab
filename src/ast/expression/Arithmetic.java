package ast.expression;

import ast.Expression;

public abstract class Arithmetic extends AbstractExpression2Param implements Expression {
    public Arithmetic(int line, int column, String operator, Expression left, Expression right) {
        super(line, column, operator, left, right);
    }
}
