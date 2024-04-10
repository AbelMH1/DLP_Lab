package semantic;

import ast.Expression;
import ast.Type;
import ast.definition.FunctionDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void> {

    @Override
    public Void visit(FunctionDefinition e, Type param) {
        e.getType().accept(this, param);
        e.getBody().forEach(statement -> statement.accept(this, ((FunctionType)e.getType()).getReturnType()));
        return null;
    }

    @Override
    public Void visit(FunctionInvocation e, Type param) {
        e.getName().accept(this, param);
        e.getParameters().forEach(expression -> expression.accept(this, param));
        e.setType(e.getName().getType().parenthesis(e.getParameters().stream().map(Expression::getType).toList(), e));
        return null;
    }

    @Override
    public Void visit(Print e, Type param) {
        e.getParameters().forEach(expression -> expression.accept(this, param));
        e.getParameters().forEach(expression -> expression.getType().asBuiltInType(e));
        return null;
    }

    @Override
    public Void visit(Return e, Type returnType) {
        e.getExpression().accept(this, returnType);
        e.getExpression().getType().promotesTo(returnType, e);
        return null;
    }

    @Override
    public Void visit(Input e, Type param) {
        e.getInput().accept(this, param);
        if (!e.getInput().getLvalue()) {
            new ErrorType(e.getLine(), e.getColumn(), "No se puede asignar un valor a algo que no sea un lValue (" + e.getInput().toString() + ")");
        }
        e.getInput().getType().asBuiltInType(e);
        return null;
    }

    @Override
    public Void visit(While e, Type param) {
        e.getCondition().accept(this, param);
        e.getBody().forEach(statement -> statement.accept(this, param));
        e.getCondition().getType().asLogical(e);
        return null;
    }

    @Override
    public Void visit(If e, Type param) {
        e.getCondition().accept(this, param);
        e.getIfPart().forEach(statement -> statement.accept(this, param));
        e.getElsePart().forEach(statement -> statement.accept(this, param));
        e.getCondition().getType().asLogical(e);
        return null;
    }

    @Override
    public Void visit(Assignment e, Type param) {
        e.getLeft().accept(this, param);
        e.getRight().accept(this, param);
        if (!e.getLeft().getLvalue()) {
            new ErrorType(e.getLine(), e.getColumn(), "No se puede realizar una asignación donde la parte izquierda no sea un lValue (" + e.getLeft().toString() + ")");
        }
        e.getRight().getType().promotesTo(e.getLeft().getType(), e);
        return null;
    }

    @Override
    public Void visit(Variable e, Type param) {
        e.setLvalue(true);
        e.setType(e.getVarDef().getType());
        return null;
    }

    @Override
    public Void visit(IntLiteral e, Type param) {
        e.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(DoubleLiteral e, Type param) {
        e.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public Void visit(CharLiteral e, Type param) {
        e.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(Arithmetic e, Type param) {
        e.getLeft().accept(this, param);
        e.getRight().accept(this, param);
        e.setType(e.getLeft().getType().arithmetic(e.getRight().getType(), e));
        return null;
    }

    @Override
    public Void visit(Comparison e, Type param) {
        e.getLeft().accept(this, param);
        e.getRight().accept(this, param);
        e.setType(e.getLeft().getType().comparison(e.getRight().getType(), e));
        return null;
    }

    @Override
    public Void visit(Logical e, Type param) {
        e.getLeft().accept(this, param);
        e.getRight().accept(this, param);
        e.setType(e.getLeft().getType().logic(e.getRight().getType(), e));
        return null;
    }

    @Override
    public Void visit(ArrayAccess e, Type param) {
        e.setLvalue(true);
        e.getLeft().accept(this, param);
        e.getAccess().accept(this, param);
        e.setType(e.getLeft().getType().squareBrackets(e.getAccess().getType(), e));
        return null;
    }

    @Override
    public Void visit(StructAccess e, Type param) {
        e.setLvalue(true);
        e.getExpression().accept(this, param);
        e.setType(e.getLeft().getType().dot(e.getField(), e));
        return null;
    }

    @Override
    public Void visit(LogicalNot e, Type param) {
        e.getExpression().accept(this, param);
        e.setType(e.getExpression().getType().logic(e));
        return null;
    }

    @Override
    public Void visit(UnaryMinus e, Type param) {
        e.getExpression().accept(this, param);
        e.setType(e.getExpression().getType().arithmetic(e));
        return null;
    }

    @Override
    public Void visit(Cast e, Type param) {
        e.getCastType().accept(this, param);
        e.getExpression().accept(this, param);
        e.setType(e.getExpression().getType().canBeCastTo(e.getCastType(), e));
        return null;
    }
}
