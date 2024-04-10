package ast;

import java.util.List;

public interface Type extends ASTNode {
    int numberOfBytes();

    Type arithmetic(Type other,ASTNode ast); // Para operaciones aritméticas
    Type arithmetic(ASTNode ast); // Para operaciones aritméticas unarias (el Minus)
    Type comparison(Type other,ASTNode ast); // Para los 6 operadores de comparación (>, <, >=, <=, == y !=)
    Type logic(Type other,ASTNode ast); // Para operaciones lógicas (&& y ||)
    Type logic(ASTNode ast); // Para operaciones lógicas unarias (el Not)
    Type squareBrackets(Type other,ASTNode ast); // Para operaciones de indexado (arrays)
    Type dot(String field,ASTNode ast); // Para expresiones de acceso a campo (records/ structs)
    Type canBeCastTo(Type other,ASTNode ast); // Para conversiones de tipos (Cast)
    Type parenthesis(List<Type> others, ASTNode ast); // Para invocación a función
    Type promotesTo(Type other,ASTNode ast); // Para promociones implícitas de tipos (solo los básicos promocionan a sí mismos, nada más)
    boolean canPromoteTo(Type other); // Para promociones implícitas de tipos (solo los básicos promocionan a sí mismos, nada más), pero sin generar errores
    Type asBuiltInType(ASTNode ast); // Para los tipos básicos (Int, Double, Char)
    boolean isBuiltInType(); // Para los tipos básicos (Int, Double, Char), pero sin generar errores
    Type asLogical(ASTNode ast); // Para los tipos básicos (Int, Double, Char)
}
