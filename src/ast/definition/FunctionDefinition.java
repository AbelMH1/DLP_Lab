package ast.definition;

import ast.Statement;
import ast.Type;
import visitor.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {
    private List<Statement> body;
    private int bytesLocalSum;

    public FunctionDefinition(int line, int column, Type type, String name, List<Statement> body) {
        super(line, column, type, name);
        this.body = body;
    }

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }

    public int getBytesLocalSum() {
        return bytesLocalSum;
    }

    public void setBytesLocalSum(int bytesLocalSum) {
        this.bytesLocalSum = bytesLocalSum;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
