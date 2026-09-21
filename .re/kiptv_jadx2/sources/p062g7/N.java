package p062g7;

import p110m7.p;

public enum N implements p {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);


    public final int f21997h;

    N(int i3) {
        this.f21997h = i3;
    }

    @Override
    public final int a() {
        return this.f21997h;
    }
}
