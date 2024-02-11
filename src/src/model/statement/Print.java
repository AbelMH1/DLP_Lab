package model.statement;

import model.AbstractASTNode;
import model.Expression;
import model.Statement;

import java.util.List;

public class Print extends AbstractASTNode implements Statement {
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
