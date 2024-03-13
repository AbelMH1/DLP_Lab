package visitor;

import ast.Program;
import ast.RecordField;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;

public class AbstractVisitor<TP,TR> implements Visitor<TP,TR> {

    // General
    @Override
    public TR visit(Program e, TP param) {
        e.getBody().forEach(definition -> definition.accept(this, param));
        return null;
    }

    @Override
    public TR visit(RecordField e, TP param) {
        e.getType().accept(this, param);
        return null;
    }

    // Definitions
    @Override
    public TR visit(FunctionDefinition e, TP param) {
        e.getType().accept(this, param);
        e.getBody().forEach(definition -> definition.accept(this, param));
        return null;
    }

    @Override
    public TR visit(VariableDefinition e, TP param) {
        return null;
    }

    // Expressions
    @Override
    public TR visit(Arithmetic e, TP param) {
        return null;
    }

    @Override
    public TR visit(ArrayAccess e, TP param) {
        return null;
    }

    @Override
    public TR visit(Cast e, TP param) {
        return null;
    }

    @Override
    public TR visit(CharLiteral e, TP param) {
        return null;
    }

    @Override
    public TR visit(Comparison e, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleLiteral e, TP param) {
        return null;
    }

    @Override
    public TR visit(IntLiteral e, TP param) {
        return null;
    }

    @Override
    public TR visit(Logical e, TP param) {
        return null;
    }

    @Override
    public TR visit(LogicalNot e, TP param) {
        return null;
    }

    @Override
    public TR visit(StructAccess e, TP param) {
        return null;
    }

    @Override
    public TR visit(UnaryMinus e, TP param) {
        return null;
    }

    @Override
    public TR visit(Variable e, TP param) {
        return null;
    }

    // Statements
    @Override
    public TR visit(Assignment e, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionInvocation e, TP param) {
        return null;
    }

    @Override
    public TR visit(If e, TP param) {
        return null;
    }

    @Override
    public TR visit(Input e, TP param) {
        return null;
    }

    @Override
    public TR visit(Print e, TP param) {
        return null;
    }

    @Override
    public TR visit(Return e, TP param) {
        return null;
    }

    @Override
    public TR visit(While e, TP param) {
        return null;
    }

    // Types
    @Override
    public TR visit(ErrorType e, TP param) {
        return null;
    }

    @Override
    public TR visit(ArrayType e, TP param) {
        return null;
    }

    @Override
    public TR visit(CharType e, TP param) {
        return null;
    }

    @Override
    public TR visit(DoubleType e, TP param) {
        return null;
    }

    @Override
    public TR visit(IntType e, TP param) {
        return null;
    }

    @Override
    public TR visit(StructType e, TP param) {
        return null;
    }

    @Override
    public TR visit(VoidType e, TP param) {
        return null;
    }

    @Override
    public TR visit(FunctionType e, TP param) {
        return null;
    }
}
