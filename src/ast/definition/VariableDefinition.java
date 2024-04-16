package ast.definition;

import ast.Statement;
import ast.Type;
import visitor.Visitor;

public class VariableDefinition extends AbstractDefinition implements Statement {

    private int offset;

    public VariableDefinition(int line, int column, Type type, String name) {
        super(line, column, type, name);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "VariableDefinition{" +
                getName() + " : " +
                getType().toString() +
                "}";
    }
}
