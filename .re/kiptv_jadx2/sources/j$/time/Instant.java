package j$.time;

import androidx.media3.common.C;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public final class Instant implements j$.time.temporal.m, j$.time.temporal.n, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    public final long f23562a;

    public final int f23563b;

    public static final Instant f23561c = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochSecond(long j, long j9) {
        return r(Math.addExact(j, Math.floorDiv(j9, C.NANOS_PER_SECOND)), (int) Math.floorMod(j9, C.NANOS_PER_SECOND));
    }

    public static Instant ofEpochMilli(long j) {
        long j9 = 1000;
        return r(Math.floorDiv(j, j9), ((int) Math.floorMod(j, j9)) * 1000000);
    }

    public static Instant B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.f(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.j(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (DateTimeException e6) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e6);
        }
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.f23663i.parse(charSequence, new e(0));
    }

    public static Instant r(long j, int i3) {
        if ((((long) i3) | j) == 0) {
            return f23561c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i3);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.r(getEpochSecond(), getNano(), zoneId);
    }

    public Instant(long j, int i3) {
        this.f23562a = j;
        this.f23563b = i3;
    }

    @Override
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return qVar != null && qVar.Y(this);
    }

    @Override
    public final int j(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return super.l(qVar).a(qVar.r(this), qVar);
        }
        int i3 = f.f23648a[((j$.time.temporal.a) qVar).ordinal()];
        int i9 = this.f23563b;
        if (i3 == 1) {
            return i9;
        }
        if (i3 == 2) {
            return i9 / 1000;
        }
        if (i3 == 3) {
            return i9 / 1000000;
        }
        if (i3 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f23783b.a(this.f23562a, aVar);
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override
    public final long f(j$.time.temporal.q qVar) {
        int i3;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i9 = f.f23648a[((j$.time.temporal.a) qVar).ordinal()];
        int i10 = this.f23563b;
        if (i9 == 1) {
            return i10;
        }
        if (i9 == 2) {
            i3 = i10 / 1000;
        } else {
            if (i9 != 3) {
                if (i9 == 4) {
                    return this.f23562a;
                }
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
            }
            i3 = i10 / 1000000;
        }
        return i3;
    }

    public long getEpochSecond() {
        return this.f23562a;
    }

    public int getNano() {
        return this.f23563b;
    }

    @Override
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (Instant) localDate.c(this);
    }

    @Override
    public final j$.time.temporal.m e(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.b0(j);
        int i3 = f.f23648a[aVar.ordinal()];
        int i9 = this.f23563b;
        long j9 = this.f23562a;
        if (i3 != 1) {
            if (i3 == 2) {
                int i10 = ((int) j) * 1000;
                if (i10 != i9) {
                    return r(j9, i10);
                }
            } else if (i3 == 3) {
                int i11 = ((int) j) * 1000000;
                if (i11 != i9) {
                    return r(j9, i11);
                }
            } else {
                if (i3 != 4) {
                    throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
                }
                if (j != j9) {
                    return r(j, i9);
                }
            }
        } else if (j != i9) {
            return r(j9, (int) j);
        }
        return this;
    }

    @Override
    public final Instant i(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (Instant) sVar.p(this, j);
        }
        switch (f.f23649b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return J(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusSeconds(Math.multiplyExact(j, 60));
            case 6:
                return plusSeconds(Math.multiplyExact(j, 3600));
            case 7:
                return plusSeconds(Math.multiplyExact(j, 43200));
            case 8:
                return plusSeconds(Math.multiplyExact(j, 86400));
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public Instant plusSeconds(long j) {
        return J(j, 0L);
    }

    public Instant plusMillis(long j) {
        return J(j / 1000, (j % 1000) * 1000000);
    }

    public Instant plusNanos(long j) {
        return J(0L, j);
    }

    public final Instant J(long j, long j9) {
        if ((j | j9) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.f23562a, j), j9 / C.NANOS_PER_SECOND), ((long) this.f23563b) + (j9 % C.NANOS_PER_SECOND));
    }

    @Override
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, sVar).i(1L, sVar) : i(-j, sVar);
    }

    @Override
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return j$.time.temporal.b.NANOS;
        }
        if (temporalQuery == j$.time.temporal.r.f23803b || temporalQuery == j$.time.temporal.r.f23802a || temporalQuery == j$.time.temporal.r.f23806e || temporalQuery == j$.time.temporal.r.f23805d || temporalQuery == j$.time.temporal.r.f23807f || temporalQuery == j$.time.temporal.r.g) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(this.f23562a, j$.time.temporal.a.INSTANT_SECONDS).e(this.f23563b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        long j = this.f23562a;
        int i3 = this.f23563b;
        return (j >= 0 || i3 <= 0) ? Math.addExact(Math.multiplyExact(j, 1000), i3 / 1000000) : Math.addExact(Math.multiplyExact(j + 1, 1000), (i3 / 1000000) - 1000);
    }

    @Override
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.f23562a, instant.f23562a);
        return iCompare != 0 ? iCompare : this.f23563b - instant.f23563b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f23562a == instant.f23562a && this.f23563b == instant.f23563b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f23562a;
        return (this.f23563b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return DateTimeFormatter.f23663i.format(this);
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
