package ast;

public interface Expression extends ASTNode {
    boolean getLvalue();

    void setLvalue(Boolean lvalue);
}
