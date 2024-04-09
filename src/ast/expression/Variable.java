package ast.expression;

import ast.Definition;
import visitor.Visitor;

public class Variable extends AbstractExpression {
    private String name;
    private Definition varDef;
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

    public Definition getVarDef() {
        return varDef;
    }

    public void setVarDef(Definition varDef) {
        this.varDef = varDef;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Variable{" +
                name +
                '}';
    }
}
