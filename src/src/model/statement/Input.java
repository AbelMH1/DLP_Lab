package model.statement;

import model.AbstractASTNode;
import model.Expression;
import model.Statement;

public class Input extends AbstractASTNode implements Statement {
    private Expression input;

    public Input(int line, int column, Expression input) {
        super(line, column);
        this.input = input;
    }

    public Expression getInput() {
        return input;
    }

    public void setInput(Expression input) {
        this.input = input;
    }
}
