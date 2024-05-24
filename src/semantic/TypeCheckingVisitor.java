package semantic;

import ast.Expression;
import ast.Type;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Boolean> {

    @Override
    public Boolean visit(FunctionDefinition e, Type param) {
        e.getType().accept(this, param);
        Type retType = ((FunctionType)e.getType()).getReturnType();
        boolean hasReturn = e.getBody().stream().map(statement -> statement.accept(this, retType)).toList()
                .stream().anyMatch(Boolean::booleanValue);
        if (!(retType instanceof VoidType || hasReturn)) {
            new ErrorType(e.getLine(), e.getColumn(), "La función \"" + e.getName() + "\" no devuelve nada (Return) en alguno de sus caminos lógicos");
        }
        return null;
    }

    // Statements checking

    @Override
    public Boolean visit(VariableDefinition e, Type param) {
        return false;
    }

    @Override
    public Boolean visit(FunctionInvocation e, Type param) {
        e.getName().accept(this, param);
        e.getParameters().forEach(expression -> expression.accept(this, param));
        e.setType(e.getName().getType().parenthesis(e.getParameters().stream().map(Expression::getType).toList(), e));
        return false;
    }

    @Override
    public Boolean visit(Print e, Type param) {
        e.getParameters().forEach(expression -> expression.accept(this, param));
        e.getParameters().forEach(expression -> expression.getType().asBuiltInType(e));
        return false;
    }

    @Override
    public Boolean visit(Return e, Type returnType) {
        e.getExpression().accept(this, returnType);
        e.getExpression().getType().promotesTo(returnType, e);
        return true;
    }

    @Override
    public Boolean visit(Input e, Type param) {
        e.getInput().accept(this, param);
        if (!e.getInput().getLvalue()) {
            new ErrorType(e.getLine(), e.getColumn(), "No se puede asignar un valor a algo que no sea un lValue (" + e.getInput().toString() + ")");
        }
        e.getInput().getType().asBuiltInType(e);
        return false;
    }

    @Override
    public Boolean visit(While e, Type param) {
        e.getCondition().accept(this, param);
        e.getBody().forEach(statement -> statement.accept(this, param));
        e.getCondition().getType().asLogical(e);
        return false;
    }

    @Override
    public Boolean visit(If e, Type param) {
        e.getCondition().accept(this, param);
        boolean ifHasReturn = e.getIfPart().stream().map(statement -> statement.accept(this, param)).toList()
                .stream().anyMatch(Boolean::booleanValue);
        boolean elseHasReturn = e.getElsePart().stream().map(statement -> statement.accept(this, param)).toList()
                .stream().anyMatch(Boolean::booleanValue);
        e.getCondition().getType().asLogical(e);
        return ifHasReturn && elseHasReturn;
    }

    @Override
    public Boolean visit(Assignment e, Type param) {
        e.getLeft().accept(this, param);
        e.getRight().accept(this, param);
        if (!e.getLeft().getLvalue()) {
            new ErrorType(e.getLine(), e.getColumn(), "No se puede realizar una asignación donde la parte izquierda no sea un lValue (" + e.getLeft().toString() + ")");
        }
        e.getRight().getType().promotesTo(e.getLeft().getType(), e);
        return false;
    }

    // Expressions checking

    @Override
    public Boolean visit(Variable e, Type param) {
        e.setLvalue(true);
        e.setType(e.getVarDef().getType());
        return null;
    }

    @Override
    public Boolean visit(IntLiteral e, Type param) {
        e.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Boolean visit(DoubleLiteral e, Type param) {
        e.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public Boolean visit(CharLiteral e, Type param) {
        e.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Boolean visit(Arithmetic e, Type param) {
        e.getLeft().accept(this, param);
        e.getRight().accept(this, param);
        e.setType(e.getLeft().getType().arithmetic(e.getRight().getType(), e));
        return null;
    }

    @Override
    public Boolean visit(Comparison e, Type param) {
        e.getLeft().accept(this, param);
        e.getRight().accept(this, param);
        e.setType(e.getLeft().getType().comparison(e.getRight().getType(), e));
        return null;
    }

    @Override
    public Boolean visit(Logical e, Type param) {
        e.getLeft().accept(this, param);
        e.getRight().accept(this, param);
        e.setType(e.getLeft().getType().logic(e.getRight().getType(), e));
        return null;
    }

    @Override
    public Boolean visit(ArrayAccess e, Type param) {
        e.setLvalue(true);
        e.getLeft().accept(this, param);
        e.getAccess().accept(this, param);
        e.setType(e.getLeft().getType().squareBrackets(e.getAccess().getType(), e));
        return null;
    }

    @Override
    public Boolean visit(StructAccess e, Type param) {
        e.setLvalue(true);
        e.getExpression().accept(this, param);
        e.setType(e.getLeft().getType().dot(e.getField(), e));
        return null;
    }

    @Override
    public Boolean visit(LogicalNot e, Type param) {
        e.getExpression().accept(this, param);
        e.setType(e.getExpression().getType().logic(e));
        return null;
    }

    @Override
    public Boolean visit(UnaryMinus e, Type param) {
        e.getExpression().accept(this, param);
        e.setType(e.getExpression().getType().arithmetic(e));
        return null;
    }

    @Override
    public Boolean visit(Cast e, Type param) {
        e.getCastType().accept(this, param);
        e.getExpression().accept(this, param);
        e.setType(e.getExpression().getType().canBeCastTo(e.getCastType(), e));
        return null;
    }
}
