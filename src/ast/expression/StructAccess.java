package ast.expression;

import ast.Expression;
import visitor.Visitor;

public class StructAccess extends AbstractExpression1Param {
    private String field;

    public StructAccess(int line, int column, Expression left, String field) {
        super(line, column, left);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    /*
     * Acceso al parámetro "expression" del padre mediante otro nombre
     * */
    public Expression getLeft() {
        return super.getExpression();
    }

    /*
     * Modificación del parámetro "expression" del padre mediante otro nombre
     * */
    public void setLeft(Expression left) {
        super.setExpression(left);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public String toString() {
        return "StructAccess{" +
                getLeft().toString() +
                "." + field +
                '}';
    }
}
