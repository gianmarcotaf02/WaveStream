package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class J implements j$.time.chrono.m {
    public static final j$.time.chrono.J BE;
    public static final j$.time.chrono.J BEFORE_BE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j$.time.chrono.J[] f23597a;

    public static j$.time.chrono.J valueOf(java.lang.String str) {
        return (j$.time.chrono.J) java.lang.Enum.valueOf(j$.time.chrono.J.class, str);
    }

    public static j$.time.chrono.J[] values() {
        return (j$.time.chrono.J[]) f23597a.clone();
    }

    static {
        j$.time.chrono.J j = new j$.time.chrono.J("BEFORE_BE", 0);
        BEFORE_BE = j;
        j$.time.chrono.J j9 = new j$.time.chrono.J("BE", 1);
        BE = j9;
        f23597a = new j$.time.chrono.J[]{j, j9};
    }

    @Override // j$.time.chrono.m
    public final int p() {
        return ordinal();
    }
}
