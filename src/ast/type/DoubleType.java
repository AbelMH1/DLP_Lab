package ast.type;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class DoubleType extends AbstractType {
    private static DoubleType instance;

    private DoubleType() {
        super(0, 0);
    }

    public static DoubleType getInstance() {
        if (instance == null) {
            instance = new DoubleType();
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
    public Type canBeCastTo(Type other, ASTNode ast) {
        if (other == this || other instanceof IntType || other instanceof ErrorType) return other; // TODO: Se permiten operaciones? Cast a sí mismo o a entero?
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
    public String toString() {
        return "DoubleType";
    }
}
