package j$.time.chrono;

/* JADX INFO: loaded from: classes3.dex */
public interface ChronoLocalDate extends j$.time.temporal.m, j$.time.temporal.n, java.lang.Comparable<j$.time.chrono.ChronoLocalDate> {
    boolean equals(java.lang.Object obj);

    j$.time.chrono.l h();

    int hashCode();

    java.lang.String toString();

    default j$.time.chrono.InterfaceC2497d M(j$.time.LocalTime localTime) {
        return new j$.time.chrono.C2499f(this, localTime);
    }

    default j$.time.chrono.m u() {
        return h().R(j(j$.time.temporal.a.ERA));
    }

    default boolean Q() {
        return h().D(f(j$.time.temporal.a.YEAR));
    }

    default int L() {
        return Q() ? 366 : 365;
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).W();
        }
        return qVar != null && qVar.Y(this);
    }

    @Override // j$.time.temporal.m
    default j$.time.chrono.ChronoLocalDate m(j$.time.temporal.n nVar) {
        return j$.time.chrono.AbstractC2496c.r(h(), nVar.c(this));
    }

    @Override // j$.time.temporal.m
    default j$.time.chrono.ChronoLocalDate e(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return j$.time.chrono.AbstractC2496c.r(h(), qVar.p(this, j));
    }

    default j$.time.chrono.ChronoLocalDate P(j$.time.temporal.p pVar) {
        return j$.time.chrono.AbstractC2496c.r(h(), pVar.p(this));
    }

    @Override // j$.time.temporal.m
    default j$.time.chrono.ChronoLocalDate i(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        return j$.time.chrono.AbstractC2496c.r(h(), sVar.p(this, j));
    }

    @Override // j$.time.temporal.m
    default j$.time.chrono.ChronoLocalDate a(long j, j$.time.temporal.s sVar) {
        return j$.time.chrono.AbstractC2496c.r(h(), super.a(j, sVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
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

    @Override // j$.time.temporal.n
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    default long toEpochDay() {
        return f(j$.time.temporal.a.EPOCH_DAY);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        int iCompare = java.lang.Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((j$.time.chrono.AbstractC2494a) h()).s().compareTo(chronoLocalDate.h().s());
    }
}
