package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements j$.time.chrono.m {
    public static final j$.time.chrono.t BCE;
    public static final j$.time.chrono.t CE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j$.time.chrono.t[] f23630a;

    public static j$.time.chrono.t valueOf(java.lang.String str) {
        return (j$.time.chrono.t) java.lang.Enum.valueOf(j$.time.chrono.t.class, str);
    }

    public static j$.time.chrono.t[] values() {
        return (j$.time.chrono.t[]) f23630a.clone();
    }

    static {
        j$.time.chrono.t tVar = new j$.time.chrono.t("BCE", 0);
        BCE = tVar;
        j$.time.chrono.t tVar2 = new j$.time.chrono.t("CE", 1);
        CE = tVar2;
        f23630a = new j$.time.chrono.t[]{tVar, tVar2};
    }

    @Override // j$.time.chrono.m
    public final int p() {
        return ordinal();
    }
}
