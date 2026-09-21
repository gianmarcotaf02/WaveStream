package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

public final class w implements TemporalAccessor {

    public final ChronoLocalDate f23742a;

    public final TemporalAccessor f23743b;

    public final j$.time.chrono.l f23744c;

    public final ZoneId f23745d;

    public w(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, j$.time.chrono.l lVar, ZoneId zoneId) {
        this.f23742a = chronoLocalDate;
        this.f23743b = temporalAccessor;
        this.f23744c = lVar;
        this.f23745d = zoneId;
    }

    @Override
    public final boolean d(j$.time.temporal.q qVar) {
        ChronoLocalDate chronoLocalDate = this.f23742a;
        if (chronoLocalDate != null && qVar.W()) {
            return chronoLocalDate.d(qVar);
        }
        return this.f23743b.d(qVar);
    }

    @Override
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        ChronoLocalDate chronoLocalDate = this.f23742a;
        if (chronoLocalDate != null && qVar.W()) {
            return chronoLocalDate.l(qVar);
        }
        return this.f23743b.l(qVar);
    }

    @Override
    public final long f(j$.time.temporal.q qVar) {
        ChronoLocalDate chronoLocalDate = this.f23742a;
        if (chronoLocalDate != null && qVar.W()) {
            return chronoLocalDate.f(qVar);
        }
        return this.f23743b.f(qVar);
    }

    @Override
    public final Object b(TemporalQuery temporalQuery) {
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

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.l lVar = this.f23744c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f23745d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f23743b + str + str2;
    }
}
