package ast.statement;

import ast.Expression;
import ast.Statement;
import ast.SwitchCase;
import visitor.Visitor;

import java.util.List;

public class Switch extends AbstractStatement {
    private Expression condition;
    private List<SwitchCase> body;

    public Switch(int line, int column, Expression condition, List<SwitchCase> body) {
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

    public List<SwitchCase> getBody() {
        return body;
    }

    public void setBody(List<SwitchCase> body) {
        this.body = body;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Switch{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }
}
