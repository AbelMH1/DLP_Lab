package ast.statement;

import ast.Expression;
import ast.Statement;

public class Input extends AbstractStatement implements Statement {
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
