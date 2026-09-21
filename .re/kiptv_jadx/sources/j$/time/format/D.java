package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class D {
    public static final j$.time.format.D LENIENT;
    public static final j$.time.format.D SMART;
    public static final j$.time.format.D STRICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j$.time.format.D[] f23661a;

    public static j$.time.format.D valueOf(java.lang.String str) {
        return (j$.time.format.D) java.lang.Enum.valueOf(j$.time.format.D.class, str);
    }

    public static j$.time.format.D[] values() {
        return (j$.time.format.D[]) f23661a.clone();
    }

    static {
        j$.time.format.D d4 = new j$.time.format.D("STRICT", 0);
        STRICT = d4;
        j$.time.format.D d6 = new j$.time.format.D("SMART", 1);
        SMART = d6;
        j$.time.format.D d9 = new j$.time.format.D("LENIENT", 2);
        LENIENT = d9;
        f23661a = new j$.time.format.D[]{d4, d6, d9};
    }
}
