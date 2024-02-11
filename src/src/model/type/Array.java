package model.type;

import model.Type;

public class Array implements Type {
    private int size;
    private Type of;

    public Array(int size, Type of) {
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
