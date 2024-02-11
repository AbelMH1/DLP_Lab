package model.definition;

import model.AbstractASTNode;
import model.Definition;
import model.Statement;
import model.Type;

import java.util.List;

public class FunctionDefinition extends AbstractASTNode implements Definition {
    private List<Statement> body;

    public FunctionDefinition(int line, int column, List<Statement> body) {
        super(line, column);
        this.body = body;
    }

    public List<Statement> getBody() {
        return body;
    }

    public void setBody(List<Statement> body) {
        this.body = body;
    }

    @Override
    public Type getType() {
        // TODO
        return null;
    }

    @Override
    public String getName() {
        // TODO
        return null;
    }
}
