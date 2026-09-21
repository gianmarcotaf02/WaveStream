package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public enum k implements j$.time.temporal.q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient java.lang.String f23796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.temporal.u f23797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient long f23798c;

    @Override // j$.time.temporal.q
    public final boolean W() {
        return true;
    }

    static {
        j$.time.temporal.b bVar = j$.time.temporal.b.NANOS;
    }

    k(java.lang.String str, long j) {
        this.f23796a = str;
        this.f23797b = j$.time.temporal.u.f((-365243219162L) + j, 365241780471L + j);
        this.f23798c = j;
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.u B() {
        return this.f23797b;
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.u K(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
            return this.f23797b;
        }
        throw new j$.time.DateTimeException("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.q
    public final boolean Y(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final long r(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(j$.time.temporal.a.EPOCH_DAY) + this.f23798c;
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(j$.time.temporal.m mVar, long j) {
        if (!this.f23797b.e(j)) {
            throw new j$.time.DateTimeException("Invalid value: " + this.f23796a + io.ktor.sse.ServerSentEventKt.SPACE + j);
        }
        return mVar.e(java.lang.Math.subtractExact(j, this.f23798c), j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.TemporalAccessor J(java.util.HashMap map, j$.time.format.C c9, j$.time.format.D d4) {
        long jLongValue = ((java.lang.Long) map.remove(this)).longValue();
        j$.time.chrono.l lVarF = j$.time.chrono.l.F(c9);
        j$.time.format.D d6 = j$.time.format.D.LENIENT;
        long j = this.f23798c;
        if (d4 == d6) {
            return lVarF.q(java.lang.Math.subtractExact(jLongValue, j));
        }
        this.f23797b.b(jLongValue, this);
        return lVarF.q(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f23796a;
    }
}
