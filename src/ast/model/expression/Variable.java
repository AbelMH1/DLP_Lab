package ast.model.expression;

import ast.model.AbstractASTNode;
import ast.model.Expression;

public abstract class Variable extends AbstractASTNode implements Expression {
    private String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
