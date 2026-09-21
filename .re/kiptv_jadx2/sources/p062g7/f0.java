package p062g7;

import p110m7.p;

public enum f0 implements p {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    PRIVATE_TO_THIS(4),
    LOCAL(5);


    public final int f22193h;

    f0(int i3) {
        this.f22193h = i3;
    }

    @Override
    public final int a() {
        return this.f22193h;
    }
}
