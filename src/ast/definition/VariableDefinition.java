package ast.definition;

import ast.Definition;
import ast.Statement;
import ast.Type;

public class VariableDefinition extends AbstractDefinition implements Definition, Statement {

    public VariableDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }
}
