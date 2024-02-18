package ast.statement;

import ast.Expression;
import ast.Statement;

import java.util.List;

public class Print extends AbstractStatement implements Statement {
    private List<Expression> parameters;

    public Print(int line, int column, List<Expression> parameters) {
        super(line, column);
        this.parameters = parameters;
    }

    public List<Expression> getParameters() {
        return parameters;
    }

    public void setParameters(List<Expression> parameters) {
        this.parameters = parameters;
    }
}
