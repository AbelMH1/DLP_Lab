package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class UnaryMinus extends AbstractExpression1Param implements Expression {
    public UnaryMinus(int line, int column, Expression expression) {
        super(line, column, expression);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "UnaryMinus{" +
                "-" + getExpression().toString() +
                "}";
    }
}
