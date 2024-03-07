package ast.type;

import ast.Type;

public class VoidType extends AbstractType implements Type {
    private static VoidType instance;

    private VoidType() {
        super(0, 0);
    }

    public static VoidType getInstance() {
        if (instance == null) {
            instance = new VoidType();
        }
        return instance;
    }
}
