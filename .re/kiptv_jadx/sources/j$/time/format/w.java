package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements j$.time.temporal.TemporalAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.ChronoLocalDate f23742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j$.time.temporal.TemporalAccessor f23743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.l f23744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j$.time.ZoneId f23745d;

    public w(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.chrono.l lVar, j$.time.ZoneId zoneId) {
        this.f23742a = chronoLocalDate;
        this.f23743b = temporalAccessor;
        this.f23744c = lVar;
        this.f23745d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.q qVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f23742a;
        if (chronoLocalDate != null && qVar.W()) {
            return chronoLocalDate.d(qVar);
        }
        return this.f23743b.d(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f23742a;
        if (chronoLocalDate != null && qVar.W()) {
            return chronoLocalDate.l(qVar);
        }
        return this.f23743b.l(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.q qVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = this.f23742a;
        if (chronoLocalDate != null && qVar.W()) {
            return chronoLocalDate.f(qVar);
        }
        return this.f23743b.f(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23803b) {
            return this.f23744c;
        }
        if (temporalQuery == j$.time.temporal.r.f23802a) {
            return this.f23745d;
        }
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return this.f23743b.b(temporalQuery);
        }
        return temporalQuery.queryFrom(this);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = "";
        j$.time.chrono.l lVar = this.f23744c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = "";
        }
        j$.time.ZoneId zoneId = this.f23745d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f23743b + str + str2;
    }
}
