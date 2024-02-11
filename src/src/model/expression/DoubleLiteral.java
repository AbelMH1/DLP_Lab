package model.expression;

import model.AbstractASTNode;
import model.Expression;

public abstract class DoubleLiteral extends AbstractASTNode implements Expression {
    private double value;

    public DoubleLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
