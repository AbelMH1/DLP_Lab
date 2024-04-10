package ast.type;

import ast.ASTNode;
import ast.Type;
import errorhandler.ErrorHandler;
import visitor.Visitor;

import java.util.List;

public class ErrorType extends AbstractType {
    private final String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "Error en la línea " + getLine() + ", columna " + getColumn() + ": " + message;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return this;
    }

    @Override
    public Type comparison(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type logic(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type logic(ASTNode ast) {
        return this;
    }

    @Override
    public Type squareBrackets(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type dot(String field, ASTNode ast) {
        return this;
    }

    @Override
    public Type canBeCastTo(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type parenthesis(List<Type> other, ASTNode ast) {
        return this;
    }

    @Override
    public Type promotesTo(Type other, ASTNode ast) {
        return this;
    }

    @Override
    public Type asBuiltInType(ASTNode ast) {
        return this;
    }
}
