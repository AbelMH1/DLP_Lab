package ast.type;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class ArrayType extends AbstractType {
    private int size;
    private Type of;

    public ArrayType(int size, Type of) {
        super(0, 0);
        this.size = size;
        this.of = of;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getOf() {
        return of;
    }

    public void setOf(Type of) {
        this.of = of;
    }

    @Override
    public int numberOfBytes() {
        return size * of.numberOfBytes();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type squareBrackets(Type other, ASTNode ast) {
        if (other instanceof IntType) return of;
        return new ErrorType(ast.getLine(), ast.getColumn(), "Se esperaba un entero en el índice, se recibió un \"" + other.toString() + "\"");
    }

    @Override
    public Type squareBracketsComparison(Type other, ASTNode ast) {
        if (other == of) return other;
        return new ErrorType(ast.getLine(), ast.getColumn(), "No se pueden realizar operaciones de comparación de arrays entre \"" + of + "\" y \"" + other.toString() + "\"");
    }

    @Override
    public String toString() {
        return "ArrayType{" + of.toString() + "[" + size + "]" + '}';
    }
}
