package ast.statement;

import ast.Expression;
import ast.Statement;
import visitor.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
