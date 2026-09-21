package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class D implements j$.time.chrono.m {
    public static final j$.time.chrono.D BEFORE_ROC;
    public static final j$.time.chrono.D ROC;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j$.time.chrono.D[] f23590a;

    public static j$.time.chrono.D valueOf(java.lang.String str) {
        return (j$.time.chrono.D) java.lang.Enum.valueOf(j$.time.chrono.D.class, str);
    }

    public static j$.time.chrono.D[] values() {
        return (j$.time.chrono.D[]) f23590a.clone();
    }

    static {
        j$.time.chrono.D d4 = new j$.time.chrono.D("BEFORE_ROC", 0);
        BEFORE_ROC = d4;
        j$.time.chrono.D d6 = new j$.time.chrono.D("ROC", 1);
        ROC = d6;
        f23590a = new j$.time.chrono.D[]{d4, d6};
    }

    @Override // j$.time.chrono.m
    public final int p() {
        return ordinal();
    }
}
