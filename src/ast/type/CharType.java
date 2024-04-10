package ast.type;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class CharType extends AbstractType {
    private static CharType instance;

    private CharType() {
        super(0, 0);
    }

    public static CharType getInstance() {
        if (instance == null) {
            instance = new CharType();
        }
        return instance;
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        if (other instanceof ErrorType) return other;
        if (other == this || other instanceof IntType) return IntType.getInstance();
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se puede realizar la operación con \"" + other.toString() + "\"");
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return IntType.getInstance();
    }

    @Override
    public Type comparison(Type other, ASTNode ast) {
        if (other == this || other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se puede realizar la comparación con \"" + other.toString() + "\"");
    }

    @Override
    public Type canBeCastTo(Type other, ASTNode ast) {
        if (other == this || other instanceof IntType || other instanceof ErrorType) return other; // TODO: Todos los tipos básicos se pueden castear a todos los tipos básicos
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se puede realizar la conversión a \"" + other.toString() + "\"");
    }

    @Override
    public Type promotesTo(Type other, ASTNode ast) {
        if (other == this || other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "El tipo \"" + this + "\" no promociona a \"" + other.toString() + "\"");
    }

    @Override
    public Type asBuiltInType(ASTNode ast) {
        return this;
    }

    @Override
    public String toString() {
        return "CharType";
    }
}
