package ast.model.statement;

import ast.model.AbstractASTNode;
import ast.model.Expression;
import ast.model.Statement;
import ast.model.expression.Variable;

import java.util.List;

public class FunctionInvocation extends AbstractASTNode implements Expression, Statement {
    private Variable name;
    private List<Expression> parameters;

    public FunctionInvocation(int line, int column, Variable name, List<Expression> parameters) {
        super(line, column);
        this.name = name;
        this.parameters = parameters;
    }

    public Variable getName() {
        return name;
    }

    public void setName(Variable name) {
        this.name = name;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public void setParameters(List<Expression> parameters) {
        this.parameters = parameters;
    }
}