package ast.type;

import ast.Type;
import ast.definition.VariableDefinition;

import java.util.List;

public class FunctionType implements Type {
    private Type returnType;
    private List<VariableDefinition> params;

    public FunctionType(Type returnType, List<VariableDefinition> params) {
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
}
