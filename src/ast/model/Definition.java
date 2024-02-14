package ast.model;

public interface Definition extends ASTNode {
    Type getType();
    String getName();
}
