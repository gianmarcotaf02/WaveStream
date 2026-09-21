package j$.time.temporal;

import io.ktor.sse.ServerSentEventKt;
import j$.time.DateTimeException;
import j$.time.format.C;
import j$.time.format.D;
import java.util.HashMap;

public enum k implements q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    public final transient String f23796a;

    public final transient u f23797b;

    public final transient long f23798c;

    @Override
    public final boolean W() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.f23796a = str;
        this.f23797b = u.f((-365243219162L) + j, 365241780471L + j);
        this.f23798c = j;
    }

    @Override
    public final u B() {
        return this.f23797b;
    }

    @Override
    public final u K(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.d(a.EPOCH_DAY)) {
            return this.f23797b;
        }
        throw new DateTimeException("Unsupported field: " + this);
    }

    @Override
    public final boolean Y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.d(a.EPOCH_DAY);
    }

    @Override
    public final long r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY) + this.f23798c;
    }

    @Override
    public final m p(m mVar, long j) {
        if (!this.f23797b.e(j)) {
            throw new DateTimeException("Invalid value: " + this.f23796a + ServerSentEventKt.SPACE + j);
        }
        return mVar.e(Math.subtractExact(j, this.f23798c), a.EPOCH_DAY);
    }

    @Override
    public final TemporalAccessor J(HashMap map, C c9, D d4) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.l lVarF = j$.time.chrono.l.F(c9);
        D d6 = D.LENIENT;
        long j = this.f23798c;
        if (d4 == d6) {
            return lVarF.q(Math.subtractExact(jLongValue, j));
        }
        this.f23797b.b(jLongValue, this);
        return lVarF.q(jLongValue - j);
    }

    @Override
    public final String toString() {
        return this.f23796a;
    }
}
