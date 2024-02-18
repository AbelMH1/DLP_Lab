package ast.definition;

import ast.AbstractASTNode;
import ast.Definition;
import ast.Statement;
import ast.Type;

public class VariableDefinition extends AbstractASTNode implements Definition, Statement {
    private String name;

    public VariableDefinition(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public Type getType() {
        // TODO
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
