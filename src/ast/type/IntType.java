package ast.type;

import ast.Type;

public class IntType extends AbstractType implements Type {
    private static IntType instance;

    private IntType() {
        super(0, 0);
    }

    public static IntType getInstance() {
        if (instance == null) {
            instance = new IntType();
        }
        return instance;
    }
}
