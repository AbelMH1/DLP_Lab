package ast.definition;

import ast.Definition;
import ast.Statement;
import ast.Type;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition implements Definition {
    private List<Statement> body;

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
}
