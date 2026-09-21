package U;

public final class I {

    public static final I f9912h;

    public static final I f9913i;
    public static final I j;

    public static final I[] f9914k;

    static {
        I i3 = new I("Left", 0);
        f9912h = i3;
        I i9 = new I("Middle", 1);
        f9913i = i9;
        I i10 = new I("Right", 2);
        j = i10;
        I[] iArr = {i3, i9, i10};
        f9914k = iArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(iArr);
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f9914k.clone();
    }
}
