package Z;

public final class A0 {

    public static final A0 f12185h;

    public static final A0[] f12186i;

    static {
        A0 a2 = new A0("Dismissed", 0);
        f12185h = a2;
        f12186i = new A0[]{a2, new A0("ActionPerformed", 1)};
    }

    public static A0 valueOf(String str) {
        return (A0) Enum.valueOf(A0.class, str);
    }

    public static A0[] values() {
        return (A0[]) f12186i.clone();
    }
}
