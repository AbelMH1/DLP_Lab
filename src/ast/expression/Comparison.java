package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class Comparison extends AbstractExpression2Param implements Expression {
    public Comparison(int line, int column, String operator, Expression left, Expression right) {
        super(line, column, operator, left, right);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Comparison{" +
                getLeft().toString() +
                " " + getOperator() + " " +
                getRight().toString() +
                "}";
    }
}
