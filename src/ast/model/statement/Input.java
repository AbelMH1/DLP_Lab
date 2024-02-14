package ast.model.statement;

import ast.model.AbstractASTNode;
import ast.model.Expression;
import ast.model.Statement;

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
