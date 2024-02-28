package ast.type;

import ast.Type;

public class ArrayType extends AbstractType implements Type {
    private int size;
    private Type of;

    public ArrayType(int size, Type of) {
        super(0, 0);
        this.size = size;
        this.of = of;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getOf() {
        return of;
    }

    public void setOf(Type of) {
        this.of = of;
    }
}
