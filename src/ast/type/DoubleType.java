package ast.type;

import ast.Type;

public class DoubleType extends AbstractType implements Type {
    private static DoubleType instance;

    private DoubleType() {
        super(0, 0);
    }

    public static DoubleType getInstance() {
        if (instance == null) {
            instance = new DoubleType();
        }
        return instance;
    }
}
