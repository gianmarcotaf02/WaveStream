package j$.time.chrono;

public final class t implements m {
    public static final t BCE;
    public static final t CE;

    public static final t[] f23630a;

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f23630a.clone();
    }

    static {
        t tVar = new t("BCE", 0);
        BCE = tVar;
        t tVar2 = new t("CE", 1);
        CE = tVar2;
        f23630a = new t[]{tVar, tVar2};
    }

    @Override
    public final int p() {
        return ordinal();
    }
}
