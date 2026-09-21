package p062g7;

import p110m7.p;

public enum A implements p {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);


    public final int f21901h;

    A(int i3) {
        this.f21901h = i3;
    }

    @Override
    public final int a() {
        return this.f21901h;
    }
}
