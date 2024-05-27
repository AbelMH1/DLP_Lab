package ast.type;

import ast.ASTNode;
import ast.Type;
import visitor.Visitor;

public class BooleanType extends AbstractType {
    private static BooleanType instance;

    private BooleanType() {
        super(0, 0);
    }

    public static BooleanType getInstance() {
        if (instance == null) {
            instance = new BooleanType();
        }
        return instance;
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
    public Type logic(Type other, ASTNode ast) {
        if (other == this) return other;
        return super.logic(other, ast);
    }

    @Override
    public Type logic(ASTNode ast) {
        return this;
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
    public Type asLogical(ASTNode ast) {
        return this;
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
        return "BooleanType";
    }
}
