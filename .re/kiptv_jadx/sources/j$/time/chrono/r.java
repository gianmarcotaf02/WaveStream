package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements j$.time.chrono.m {
    public static final j$.time.chrono.r AH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j$.time.chrono.r[] f23628a;

    @Override // j$.time.chrono.m
    public final int p() {
        return 1;
    }

    public static j$.time.chrono.r valueOf(java.lang.String str) {
        return (j$.time.chrono.r) java.lang.Enum.valueOf(j$.time.chrono.r.class, str);
    }

    public static j$.time.chrono.r[] values() {
        return (j$.time.chrono.r[]) f23628a.clone();
    }

    static {
        j$.time.chrono.r rVar = new j$.time.chrono.r("AH", 0);
        AH = rVar;
        f23628a = new j$.time.chrono.r[]{rVar};
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.u.f(1L, 1L);
        }
        return super.l(qVar);
    }
}
