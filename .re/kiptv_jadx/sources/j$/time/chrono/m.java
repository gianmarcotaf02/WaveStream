package j$.time.chrono;

/* JADX INFO: loaded from: classes3.dex */
public interface m extends j$.time.temporal.TemporalAccessor, j$.time.temporal.n {
    int p();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.ERA;
        }
        return qVar != null && qVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int j(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return p();
        }
        return super.j(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return p();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return j$.time.temporal.b.ERAS;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(p(), j$.time.temporal.a.ERA);
    }
}
