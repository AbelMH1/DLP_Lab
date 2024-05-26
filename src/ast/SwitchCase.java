package ast;

import visitor.Visitor;

import java.util.List;

public class SwitchCase extends AbstractASTNode {
    private Expression condition;
    private List<Statement> body;

    public SwitchCase(int line, int column, Expression condition, List<Statement> body) {
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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "SwitchCase{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }
}
