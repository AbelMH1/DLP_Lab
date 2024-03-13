package semantic;

import ast.RecordField;
import ast.expression.*;
import visitor.Visitor;

public class TypeCheckingVisitor implements Visitor<Void, Void> {

    @Override
    public Void visit(Arithmetic e, Void param) {
        e.setLvalue(false);
        e.getLeft().accept(this, param);
        e.getRight().accept(this, param);
        return null;
    }

    @Override
    public Void visit(ArrayAccess e, Void param) {
        e.setLvalue(true);
        e.getLeft().accept(this, param);
        e.getAccess().accept(this, param);
        return null;
    }

    @Override
    public Void visit(Cast e, Void param) {
        e.setLvalue(false);
        return null;
    }

    @Override
    public Void visit(CharLiteral e, Void param) {
        return null;
    }

    @Override
    public Void visit(Comparison e, Void param) {
        return null;
    }

    @Override
    public Void visit(DoubleLiteral e, Void param) {
        return null;
    }

    @Override
    public Void visit(IntLiteral e, Void param) {
        return null;
    }

    @Override
    public Void visit(Logical e, Void param) {
        return null;
    }

    @Override
    public Void visit(LogicalNot e, Void param) {
        return null;
    }

    @Override
    public Void visit(StructAccess e, Void param) {
        return null;
    }

    @Override
    public Void visit(UnaryMinus e, Void param) {
        return null;
    }

    @Override
    public Void visit(Variable e, Void param) {
        return null;
    }

    @Override
    public Void visit(RecordField e, Void param) {
        return null;
    }
}
