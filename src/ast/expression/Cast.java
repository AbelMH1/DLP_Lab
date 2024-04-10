package ast.expression;

import ast.Expression;
import ast.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression1Param {
    private Type castType;

    public Cast(int line, int column, Expression expression, Type castType) {
        super(line, column, expression);
        this.castType = castType;
    }

    public Type getCastType() {
        return castType;
    }

    public void setCastType(Type castType) {
        this.castType = castType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "Cast{" +
                "(" + castType.toString() + ")" +
                getExpression().toString() +
                '}';
    }
}
