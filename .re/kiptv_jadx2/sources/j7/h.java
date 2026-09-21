package j7;

import p110m7.p;

public enum h implements p {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);


    public final int f24300h;

    h(int i3) {
        this.f24300h = i3;
    }

    @Override
    public final int a() {
        return this.f24300h;
    }
}
