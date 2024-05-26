package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class ArrayComparison extends AbstractExpression2Param {

    public ArrayComparison(int line, int column, String operator, Expression left, Expression right) {
        super(line, column, operator, left, right);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "ArrayComparison{" +
                getLeft().toString() +
                " []" + getOperator() + " " +
                getRight().toString() +
                "}";
    }
}
