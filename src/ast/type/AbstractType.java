package ast.type;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Type;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {
    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public int numberOfBytes() {
        throw new IllegalStateException();
    }

    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se pueden realizar operaciones aritmétricas entre \"" + this + "\" y \"" + other.toString() + "\"");
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se pueden realizar operaciones aritmétricas con \"" + this + "\"");
    }

    @Override
    public Type comparison(Type other, ASTNode ast) {
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se pueden realizar operaciones comparativas entre \"" + this + "\" y \"" + other.toString() + "\"");
    }

    @Override
    public Type logic(Type other, ASTNode ast) {
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se pueden realizar operaciones lógicas entre \"" + this + "\" y \"" + other.toString() + "\"");
    }

    @Override
    public Type logic(ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se pueden realizar operaciones lógicas con \"" + this + "\"");
    }

    @Override
    public Type squareBrackets(Type other, ASTNode ast) {
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se pueden realizar operaciones de indexado en \"" + this + "\"");
    }

    @Override
    public Type dot(String field, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se pueden realizar operaciones de acceso a campos en \"" + this + "\"");
    }

    @Override
    public Type canBeCastTo(Type other, ASTNode ast) {
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se pueden realizar operaciones de conversión de tipos con \"" + this + "\"");
    }

    @Override
    public Type parenthesis(List<Type> others, ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se pueden invocar un \"" + this + "\"");
    }

    @Override
    public Type promotesTo(Type other, ASTNode ast) {
        if(other instanceof ErrorType){
            return other;
        }
        return new ErrorType(ast.getLine(), ast.getColumn(), "El tipo \"" + this +  "\" no puede promocionar a ningún tipo");
    }

    @Override
    public boolean canPromoteTo(Type other) {
        return false;
    }

    @Override
    public Type asBuiltInType(ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "El tipo \"" + this +  "\" no es un tipo primitivo");
    }

    @Override
    public boolean isBuiltInType() {
        return false;
    }

    @Override
    public Type asLogical(ASTNode ast) {
        return new ErrorType(ast.getLine(), ast.getColumn(), "El tipo \"" + this +  "\" no es un tipo lógico");
    }
}
