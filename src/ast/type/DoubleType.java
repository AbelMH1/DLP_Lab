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
    public int numberOfBytes() {
        return 4;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        if (other == this) return other;
        return super.arithmetic(other, ast);
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return this;
    }

    @Override
    public Type comparison(Type other, ASTNode ast) {
        if (other == this) return other;
        return super.comparison(other, ast);
    }

    @Override
    public Type canBeCastTo(Type other, ASTNode ast) {
        if (other.isBuiltInType()) return other;
        return super.canBeCastTo(other, ast);
    }

    @Override
    public Type promotesTo(Type other, ASTNode ast) {
        if (other == this) return other;
        return super.promotesTo(other, ast);
    }

    @Override
    public boolean canPromoteTo(Type other) {
        return other == this;
    }

    @Override
    public Type asBuiltInType(ASTNode ast) {
        return this;
    }

    @Override
    public boolean isBuiltInType() {
        return true;
    }

    @Override
    public String toString() {
        return "DoubleType";
    }
}
