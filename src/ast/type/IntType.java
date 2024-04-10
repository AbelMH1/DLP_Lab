package ast.type;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class IntType extends AbstractType {
    private static IntType instance;

    private IntType() {
        super(0, 0);
    }

    public static IntType getInstance() {
        if (instance == null) {
            instance = new IntType();
        }
        return instance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        if (other == this || other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se puede realizar la operación con \"" + other.toString() + "\"");
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return this; // TODO: Esto está bien?
    }

    @Override
    public Type comparison(Type other, ASTNode ast) {
        if (other == this || other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se puede realizar la comparación con \"" + other.toString() + "\"");
    }

    @Override
    public Type logic(Type other, ASTNode ast) {
        if (other == this || other instanceof ErrorType) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se puede realizar la operación lógica con \"" + other.toString() + "\"");
    }

    @Override
    public Type logic(ASTNode ast) {
        return this;
    }

    @Override
    public Type canBeCastTo(Type other, ASTNode ast) {
        if (other == this || other instanceof DoubleType|| other instanceof CharType || other instanceof ErrorType) return other; // TODO: Se permiten operaciones? Cast a sí mismo, a char y a double?
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se puede realizar la conversión a \"" + other.toString() + "\"");
    }

    @Override
    public Type promotesTo(Type other, ASTNode ast) {
        if (other == this || other instanceof ErrorType) return other; // TODO: Esto es asi?
        return new ErrorType(ast.getLine(), ast.getColumn(), "El tipo \"" + this + "\" no promociona a \"" + other.toString() + "\"");
    }

    @Override
    public Type asBuiltInType(ASTNode ast) {
        return this;
    }

    @Override
    public Type asLogical(ASTNode ast) {
        return this;
    }

    @Override
    public String toString() {
        return "IntType";
    }
}
