package p062g7;

import p110m7.p;

public enum V implements p {
    IN(0),
    OUT(1),
    INV(2);


    public final int f22072h;

    V(int i3) {
        this.f22072h = i3;
    }

    @Override
    public final int a() {
        return this.f22072h;
    }
}
