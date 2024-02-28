package ast.expression;

import ast.AbstractASTNode;
import ast.Expression;

public class AbstractExpression extends AbstractASTNode implements Expression {
    public AbstractExpression(int line, int column) {
        super(line, column);
    }
}