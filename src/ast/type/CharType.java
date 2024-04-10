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
        if (other == this || other instanceof IntType) return IntType.getInstance();
        return super.arithmetic(other, ast);
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return IntType.getInstance();
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
        return "CharType";
    }
}
