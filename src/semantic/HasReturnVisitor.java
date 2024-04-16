package semantic;

import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.statement.*;
import ast.type.ErrorType;
import ast.type.FunctionType;
import ast.type.VoidType;
import visitor.AbstractVisitor;

public class HasReturnVisitor extends AbstractVisitor<Void, Boolean> {

    @Override
    public Boolean visit(FunctionDefinition e, Void param) {
        if (!(((FunctionType)e.getType()).getReturnType() instanceof VoidType)) {
            boolean hasReturn = e.getBody().stream().anyMatch(statement -> statement.accept(this, param));
            if (!hasReturn) {
                new ErrorType(e.getLine(), e.getColumn(), "La función \"" + e.getName() + "\" no devuelve nada (Return) en alguno de sus caminos lógicos");
            }
        }
        return null;
    }

    @Override
    public Boolean visit(Return e, Void param) {
        return true;
    }

    @Override
    public Boolean visit(If e, Void param) {
        boolean ifHasReturn = e.getIfPart().stream().anyMatch(statement -> statement.accept(this, param));
        boolean elseHasReturn = e.getElsePart().stream().anyMatch(statement -> statement.accept(this, param));
        return ifHasReturn && elseHasReturn;
    }

    @Override
    public Boolean visit(VariableDefinition e, Void param) {
        return false;
    }

    @Override
    public Boolean visit(Assignment e, Void param) {
        return false;
    }

    @Override
    public Boolean visit(FunctionInvocation e, Void param) {
        return false;
    }

    @Override
    public Boolean visit(Input e, Void param) {
        return false;
    }

    @Override
    public Boolean visit(Print e, Void param) {
        return false;
    }

    @Override
    public Boolean visit(While e, Void param) {
        return false;
    }
}
