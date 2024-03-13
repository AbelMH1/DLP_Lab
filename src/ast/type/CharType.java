package ast.type;

import ast.Type;
import visitor.Visitor;

public class CharType extends AbstractType implements Type {
    private static CharType instance;

    private CharType() {
        super(0, 0);
    }

    public static CharType getInstance() {
        if (instance == null) {
            instance = new CharType();
        }
        return instance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
        return visitor.visit(this, param);
    }
}
