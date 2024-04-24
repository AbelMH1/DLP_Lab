package ast.type;

import ast.ASTNode;
import ast.Type;
import ast.definition.VariableDefinition;
import visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {
    private Type returnType;
    private List<VariableDefinition> params;
    private int bytesParamSum;

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

    public int getBytesParamSum() {
        return bytesParamSum;
    }

    public void setBytesParamSum(int bytesParamSum) {
        this.bytesParamSum = bytesParamSum;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type parenthesis(List<Type> others, ASTNode ast) {
        if (others.size() != params.size()) {
            return new ErrorType(ast.getLine(), ast.getColumn(), "La función esperaba \"" + params.size() + "\" parámetros, se recibieron \"" + others.size() + "\"");
        }
        for (int i = 0; i < params.size(); i++){
            if (!others.get(i).canPromoteTo(params.get(i).getType())){
                return new ErrorType(ast.getLine(), ast.getColumn(), "La función esperaba un \"" + params.get(i).getType() + "\" en el parámetro \"" + i + "\", se recibió un \"" + others.get(i).toString() + "\"");
            }
        }
        return returnType;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("FunctionType{ (");
        params.forEach(varDef -> str.append(varDef.toString()).append(", "));
        str.replace(str.length()-2, str.length(), ")");
        str.append(" : ").append(returnType.toString()).append("}");
        return str.toString();
    }
}
