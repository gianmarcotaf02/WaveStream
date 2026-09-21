package j$.time.chrono;

public final class J implements m {
    public static final J BE;
    public static final J BEFORE_BE;

    public static final J[] f23597a;

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f23597a.clone();
    }

    static {
        J j = new J("BEFORE_BE", 0);
        BEFORE_BE = j;
        J j9 = new J("BE", 1);
        BE = j9;
        f23597a = new J[]{j, j9};
    }

    @Override
    public final int p() {
        return ordinal();
    }
}
