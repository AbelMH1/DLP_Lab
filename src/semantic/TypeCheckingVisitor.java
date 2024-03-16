package semantic;

import ast.expression.ArrayAccess;
import ast.expression.StructAccess;
import ast.expression.Variable;
import ast.statement.Assignment;
import ast.statement.Input;
import ast.type.ErrorType;
import visitor.AbstractVisitor;
import visitor.Visitor;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> implements Visitor<Void, Void> {

    @Override
    public Void visit(Assignment e, Void param) {
        e.getLeft().accept(this, param);
        e.getRight().accept(this, param);
        if (!e.getLeft().getLvalue()) {
            new ErrorType(e.getLine(), e.getColumn(), "No se puede realizar una asignación donde la parte izquierda no sea un lValue (" + e.getLeft().toString() + ")");
        }
        return null;
    }

    @Override
    public Void visit(Input e, Void param) {
        e.getInput().accept(this, param);
        if (!e.getInput().getLvalue()) {
            new ErrorType(e.getLine(), e.getColumn(), "No se puede asignar un valor a algo que no sea un lValue (" + e.getInput().toString() + ")");
        }
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
    public Void visit(StructAccess e, Void param) {
        e.setLvalue(true);
        e.getExpression().accept(this, param);
        return null;
    }

    @Override
    public Void visit(Variable e, Void param) {
        e.setLvalue(true);
        return null;
    }
}
