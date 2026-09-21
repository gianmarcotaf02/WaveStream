package j$.time.chrono;

public final class D implements m {
    public static final D BEFORE_ROC;
    public static final D ROC;

    public static final D[] f23590a;

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f23590a.clone();
    }

    static {
        D d4 = new D("BEFORE_ROC", 0);
        BEFORE_ROC = d4;
        D d6 = new D("ROC", 1);
        ROC = d6;
        f23590a = new D[]{d4, d6};
    }

    @Override
    public final int p() {
        return ordinal();
    }
}
