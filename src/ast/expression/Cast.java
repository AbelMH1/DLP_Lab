package ast.expression;

import ast.Expression;
import ast.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression1Param {
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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Cast{" +
                "(" + type.toString() + ")" +
                getExpression().toString() +
                '}';
    }
}
