package j$.time.chrono;

public final class r implements m {
    public static final r AH;

    public static final r[] f23628a;

    @Override
    public final int p() {
        return 1;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f23628a.clone();
    }

    static {
        r rVar = new r("AH", 0);
        AH = rVar;
        f23628a = new r[]{rVar};
    }

    @Override
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.u.f(1L, 1L);
        }
        return super.l(qVar);
    }
}
