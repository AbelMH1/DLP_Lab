package ast.type;

import ast.Type;
import errorhandler.ErrorHandler;
import visitor.Visitor;

public class ErrorType extends AbstractType implements Type {
    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "Error en la línea " + getLine() +
                ", columna " + getColumn() + ": " +
                message;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
