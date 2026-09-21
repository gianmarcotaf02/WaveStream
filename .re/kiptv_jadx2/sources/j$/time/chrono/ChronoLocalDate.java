package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.TemporalQuery;

public interface ChronoLocalDate extends j$.time.temporal.m, j$.time.temporal.n, Comparable<ChronoLocalDate> {
    boolean equals(Object obj);

    l h();

    int hashCode();

    String toString();

    default InterfaceC2497d M(LocalTime localTime) {
        return new C2499f(this, localTime);
    }

    default m u() {
        return h().R(j(j$.time.temporal.a.ERA));
    }

    default boolean Q() {
        return h().D(f(j$.time.temporal.a.YEAR));
    }

    default int L() {
        return Q() ? 366 : 365;
    }

    @Override
    default boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).W();
        }
        return qVar != null && qVar.Y(this);
    }

    @Override
    default ChronoLocalDate m(j$.time.temporal.n nVar) {
        return AbstractC2496c.r(h(), nVar.c(this));
    }

    @Override
    default ChronoLocalDate e(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return AbstractC2496c.r(h(), qVar.p(this, j));
    }

    default ChronoLocalDate P(j$.time.temporal.p pVar) {
        return AbstractC2496c.r(h(), pVar.p(this));
    }

    @Override
    default ChronoLocalDate i(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        return AbstractC2496c.r(h(), sVar.p(this, j));
    }

    @Override
    default ChronoLocalDate a(long j, j$.time.temporal.s sVar) {
        return AbstractC2496c.r(h(), super.a(j, sVar));
    }

    @Override
    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23802a || temporalQuery == j$.time.temporal.r.f23806e || temporalQuery == j$.time.temporal.r.f23805d || temporalQuery == j$.time.temporal.r.g) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.r.f23803b) {
            return h();
        }
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return j$.time.temporal.b.DAYS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    default long toEpochDay() {
        return f(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC2494a) h()).s().compareTo(chronoLocalDate.h().s());
    }
}
