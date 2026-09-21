package j$.time.format;

import io.ktor.sse.ServerSentEventKt;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.InterfaceC2502i;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class C implements TemporalAccessor {

    public ZoneId f23655b;

    public j$.time.chrono.l f23656c;

    public boolean f23657d;

    public D f23658e;

    public ChronoLocalDate f23659f;
    public LocalTime g;

    public final HashMap f23654a = new HashMap();

    public j$.time.q f23660h = j$.time.q.f23771d;

    @Override
    public final boolean d(j$.time.temporal.q qVar) {
        if (this.f23654a.containsKey(qVar)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f23659f;
        if (chronoLocalDate != null && chronoLocalDate.d(qVar)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime == null || !localTime.d(qVar)) {
            return (qVar == null || (qVar instanceof j$.time.temporal.a) || !qVar.Y(this)) ? false : true;
        }
        return true;
    }

    @Override
    public final long f(j$.time.temporal.q qVar) {
        Objects.requireNonNull(qVar, "field");
        Long l2 = (Long) this.f23654a.get(qVar);
        if (l2 != null) {
            return l2.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f23659f;
        if (chronoLocalDate != null && chronoLocalDate.d(qVar)) {
            return this.f23659f.f(qVar);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.d(qVar)) {
            return this.g.f(qVar);
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }

    @Override
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23802a) {
            return this.f23655b;
        }
        if (temporalQuery == j$.time.temporal.r.f23803b) {
            return this.f23656c;
        }
        if (temporalQuery == j$.time.temporal.r.f23807f) {
            ChronoLocalDate chronoLocalDate = this.f23659f;
            if (chronoLocalDate != null) {
                return LocalDate.J(chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == j$.time.temporal.r.g) {
            return this.g;
        }
        if (temporalQuery == j$.time.temporal.r.f23805d) {
            Long l2 = (Long) this.f23654a.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                return ZoneOffset.ofTotalSeconds(l2.intValue());
            }
            ZoneId zoneId = this.f23655b;
            return zoneId instanceof ZoneOffset ? zoneId : temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.r.f23806e) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    public final void z(j$.time.temporal.q qVar, j$.time.temporal.a aVar, Long l2) {
        Long l9 = (Long) this.f23654a.put(aVar, l2);
        if (l9 == null || l9.longValue() == l2.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + aVar + ServerSentEventKt.SPACE + l9 + " differs from " + aVar + ServerSentEventKt.SPACE + l2 + " while resolving  " + qVar);
    }

    public final void r() {
        HashMap map = this.f23654a;
        if (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f23655b;
            if (zoneId != null) {
                s(zoneId);
                return;
            }
            Long l2 = (Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l2 != null) {
                s(ZoneOffset.ofTotalSeconds(l2.intValue()));
            }
        }
    }

    public final void s(ZoneId zoneId) {
        HashMap map = this.f23654a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        InterfaceC2502i interfaceC2502iX = this.f23656c.x(Instant.r(((Long) map.remove(aVar)).longValue(), 0), zoneId);
        x(interfaceC2502iX.o());
        z(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(interfaceC2502iX.n().toSecondOfDay()));
    }

    public final void x(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f23659f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate == null || chronoLocalDate2.equals(chronoLocalDate)) {
                return;
            }
            throw new DateTimeException("Conflict found: Fields resolved to two different dates: " + this.f23659f + ServerSentEventKt.SPACE + chronoLocalDate);
        }
        if (chronoLocalDate != null) {
            if (!this.f23656c.equals(chronoLocalDate.h())) {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.f23656c);
            }
            this.f23659f = chronoLocalDate;
        }
    }

    public final void v() {
        HashMap map = this.f23654a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (map.containsKey(aVar)) {
            long jLongValue = ((Long) map.remove(aVar)).longValue();
            D d4 = this.f23658e;
            if (d4 == D.STRICT || (d4 == D.SMART && jLongValue != 0)) {
                aVar.b0(jLongValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            z(aVar, aVar2, Long.valueOf(jLongValue));
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (map.containsKey(aVar3)) {
            long jLongValue2 = ((Long) map.remove(aVar3)).longValue();
            D d6 = this.f23658e;
            if (d6 == D.STRICT || (d6 == D.SMART && jLongValue2 != 0)) {
                aVar3.b0(jLongValue2);
            }
            z(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (map.containsKey(aVar4)) {
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (map.containsKey(aVar5)) {
                long jLongValue3 = ((Long) map.remove(aVar4)).longValue();
                long jLongValue4 = ((Long) map.remove(aVar5)).longValue();
                if (this.f23658e == D.LENIENT) {
                    z(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(Math.addExact(Math.multiplyExact(jLongValue3, 12), jLongValue4)));
                } else {
                    aVar4.b0(jLongValue3);
                    aVar5.b0(jLongValue3);
                    z(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (map.containsKey(aVar6)) {
            long jLongValue5 = ((Long) map.remove(aVar6)).longValue();
            if (this.f23658e != D.LENIENT) {
                aVar6.b0(jLongValue5);
            }
            z(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            z(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            z(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / androidx.media3.common.C.NANOS_PER_SECOND) % 60));
            z(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(jLongValue5 % androidx.media3.common.C.NANOS_PER_SECOND));
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (map.containsKey(aVar7)) {
            long jLongValue6 = ((Long) map.remove(aVar7)).longValue();
            if (this.f23658e != D.LENIENT) {
                aVar7.b0(jLongValue6);
            }
            z(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            z(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (map.containsKey(aVar8)) {
            long jLongValue7 = ((Long) map.remove(aVar8)).longValue();
            if (this.f23658e != D.LENIENT) {
                aVar8.b0(jLongValue7);
            }
            z(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            z(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (map.containsKey(aVar9)) {
            long jLongValue8 = ((Long) map.remove(aVar9)).longValue();
            if (this.f23658e != D.LENIENT) {
                aVar9.b0(jLongValue8);
            }
            z(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            z(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            z(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (map.containsKey(aVar10)) {
            long jLongValue9 = ((Long) map.remove(aVar10)).longValue();
            if (this.f23658e != D.LENIENT) {
                aVar10.b0(jLongValue9);
            }
            z(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            z(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (map.containsKey(aVar11)) {
            long jLongValue10 = ((Long) map.get(aVar11)).longValue();
            D d9 = this.f23658e;
            D d10 = D.LENIENT;
            if (d9 != d10) {
                aVar11.b0(jLongValue10);
            }
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (map.containsKey(aVar12)) {
                long jLongValue11 = ((Long) map.remove(aVar12)).longValue();
                if (this.f23658e != d10) {
                    aVar12.b0(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                z(aVar12, aVar11, Long.valueOf(jLongValue10));
            }
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (map.containsKey(aVar13)) {
                long jLongValue12 = ((Long) map.remove(aVar13)).longValue();
                if (this.f23658e != d10) {
                    aVar13.b0(jLongValue12);
                }
                z(aVar13, aVar11, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (map.containsKey(aVar14)) {
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (map.containsKey(aVar15)) {
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (map.containsKey(aVar16) && map.containsKey(aVar11)) {
                    t(((Long) map.remove(aVar14)).longValue(), ((Long) map.remove(aVar15)).longValue(), ((Long) map.remove(aVar16)).longValue(), ((Long) map.remove(aVar11)).longValue());
                }
            }
        }
    }

    public final void t(long j, long j9, long j10, long j11) {
        if (this.f23658e == D.LENIENT) {
            long jAddExact = Math.addExact(Math.addExact(Math.addExact(Math.multiplyExact(j, 3600000000000L), Math.multiplyExact(j9, 60000000000L)), Math.multiplyExact(j10, androidx.media3.common.C.NANOS_PER_SECOND)), j11);
            w(LocalTime.K(Math.floorMod(jAddExact, 86400000000000L)), j$.time.q.a(0, 0, (int) Math.floorDiv(jAddExact, 86400000000000L)));
            return;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.MINUTE_OF_HOUR;
        int iA = aVar.f23783b.a(j9, aVar);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
        int iA2 = aVar2.f23783b.a(j11, aVar2);
        if (this.f23658e == D.SMART && j == 24 && iA == 0 && j10 == 0 && iA2 == 0) {
            w(LocalTime.f23567e, j$.time.q.a(0, 0, 1));
            return;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
        int iA3 = aVar3.f23783b.a(j, aVar3);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.SECOND_OF_MINUTE;
        w(LocalTime.of(iA3, iA, aVar4.f23783b.a(j10, aVar4), iA2), j$.time.q.f23771d);
    }

    public final void w(LocalTime localTime, j$.time.q qVar) {
        LocalTime localTime2 = this.g;
        if (localTime2 != null) {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException("Conflict found: Fields resolved to different times: " + this.g + ServerSentEventKt.SPACE + localTime);
            }
            j$.time.q qVar2 = this.f23660h;
            qVar2.getClass();
            j$.time.q qVar3 = j$.time.q.f23771d;
            if (qVar2 != qVar3 && qVar != qVar3 && !this.f23660h.equals(qVar)) {
                throw new DateTimeException("Conflict found: Fields resolved to different excess periods: " + this.f23660h + ServerSentEventKt.SPACE + qVar);
            }
            this.f23660h = qVar;
            return;
        }
        this.g = localTime;
        this.f23660h = qVar;
    }

    public final void q(TemporalAccessor temporalAccessor) {
        Iterator it = this.f23654a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.q qVar = (j$.time.temporal.q) entry.getKey();
            if (temporalAccessor.d(qVar)) {
                try {
                    long jF = temporalAccessor.f(qVar);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jF != jLongValue) {
                        throw new DateTimeException("Conflict found: Field " + qVar + ServerSentEventKt.SPACE + jF + " differs from " + qVar + ServerSentEventKt.SPACE + jLongValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.f23654a);
        sb.append(',');
        sb.append(this.f23656c);
        if (this.f23655b != null) {
            sb.append(',');
            sb.append(this.f23655b);
        }
        if (this.f23659f != null || this.g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f23659f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
