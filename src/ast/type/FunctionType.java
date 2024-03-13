package ast.type;

import ast.Type;
import ast.definition.VariableDefinition;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType implements Type {
    private Type returnType;
    private List<VariableDefinition> params;

    public FunctionType(Type returnType, List<VariableDefinition> params) {
        super(0, 0);
        this.returnType = returnType;
        this.params = params;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public List<VariableDefinition> getParams() {
        return params;
    }

    public void setParams(List<VariableDefinition> params) {
        this.params = params;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
