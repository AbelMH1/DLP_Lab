package visitor;

import ast.Program;
import ast.RecordField;
import ast.definition.FunctionDefinition;
import ast.definition.VariableDefinition;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;

/*
Una clase Visitor debe plantearse para cada método siempre tres cuestiones:
    ¿Tengo que Calcular algo?
    ¿Tengo que Verificar algo?
    ¿Tengo que Recorrer algo?
**/
public interface Visitor<TP, TR> {

    // General
    TR visit(Program e, TP param);

    TR visit(RecordField e, TP param);

    // Definitions
    TR visit(FunctionDefinition e, TP param);

    TR visit(VariableDefinition e, TP param);

    // Expressions
    TR visit(Arithmetic e, TP param);

    TR visit(ArrayAccess e, TP param);

    TR visit(Cast e, TP param);

    TR visit(CharLiteral e, TP param);

    TR visit(Comparison e, TP param);

    TR visit(DoubleLiteral e, TP param);

    TR visit(IntLiteral e, TP param);

    TR visit(Logical e, TP param);

    TR visit(LogicalNot e, TP param);

    TR visit(StructAccess e, TP param);

    TR visit(UnaryMinus e, TP param);

    TR visit(Variable e, TP param);

    // Statements
    TR visit(Assignment e, TP param);

    TR visit(FunctionInvocation e, TP param);

    TR visit(If e, TP param);

    TR visit(Input e, TP param);

    TR visit(Print e, TP param);

    TR visit(Return e, TP param);

    TR visit(While e, TP param);

    // Types
    TR visit(ErrorType e, TP param);

    TR visit(ArrayType e, TP param);

    TR visit(CharType e, TP param);

    TR visit(DoubleType e, TP param);

    TR visit(IntType e, TP param);

    TR visit(StructType e, TP param);

    TR visit(VoidType e, TP param);

    TR visit(FunctionType e, TP param);

    TR visit(BooleanType e, TP param);
}
