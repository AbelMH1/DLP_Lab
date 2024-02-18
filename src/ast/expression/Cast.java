package ast.expression;

import ast.Expression;
import ast.Type;

public class Cast extends AbstractExpression1Param implements Expression {
    private Type type;

    public Cast(int line, int column, Expression expression, Type type) {
        super(line, column, expression);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
