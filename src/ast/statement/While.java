package ast.statement;

import ast.Expression;
import ast.Statement;

import java.util.List;

public class While extends AbstractStatement implements Statement {
    private Expression condition;
    private List<Statement> body;

    public While(int line, int column, Expression condition, List<Statement> body) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }
}