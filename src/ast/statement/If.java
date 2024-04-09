package ast.statement;

import ast.Expression;
import ast.Statement;
import visitor.Visitor;

import java.util.List;

public class If extends AbstractStatement {
    private Expression condition;
    private List<Statement> ifPart;
    private List<Statement> elsePart;

    public If(int line, int column, Expression condition, List<Statement> ifPart, List<Statement> elsePart) {
        super(line, column);
        this.condition = condition;
        this.ifPart = ifPart;
        this.elsePart = elsePart;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public List<Statement> getIfPart() {
        return ifPart;
    }

    public void setIfPart(List<Statement> ifPart) {
        this.ifPart = ifPart;
    }

    public List<Statement> getElsePart() {
        return elsePart;
    }

    public void setElsePart(List<Statement> elsePart) {
        this.elsePart = elsePart;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
