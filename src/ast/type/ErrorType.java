package ast.type;

import ast.Type;
import errorhandler.ErrorHandler;

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
}
