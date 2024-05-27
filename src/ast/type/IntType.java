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
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix() {
        return 'i';
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type arithmetic(Type other, ASTNode ast) {
        if (other.canPromoteTo(this)) return this;
        if (this.canPromoteTo(other)) return other;
        return super.arithmetic(other, ast);
    }

    @Override
    public Type arithmetic(ASTNode ast) {
        return this;
    }

    @Override
    public Type comparison(Type other, ASTNode ast) {
        if (other.canPromoteTo(this)) return this;
        if (this.canPromoteTo(other)) return other;
        return super.comparison(other, ast);
    }

    @Override
    public Type logic(Type other, ASTNode ast) {
        if (other == this) return other;
        return super.logic(other, ast);
    }

    @Override
    public Type logic(ASTNode ast) {
        return this;
    }

    @Override
    public Type canBeCastTo(Type other, ASTNode ast) {
        if (other.isBuiltInType()) return other;
        return super.canBeCastTo(other, ast);
    }

    @Override
    public Type promotesTo(Type other, ASTNode ast) {
        if (other == this || other == DoubleType.getInstance()) return other;
        return super.promotesTo(other, ast);
    }

    @Override
    public boolean canPromoteTo(Type other) {
        return other == this || other == DoubleType.getInstance();
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
    public Type asLogical(ASTNode ast) {
        return this;
    }

    @Override
    public String toString() {
        return "IntType";
    }
}
