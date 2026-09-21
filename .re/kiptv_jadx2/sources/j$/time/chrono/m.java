package j$.time.chrono;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

public interface m extends TemporalAccessor, j$.time.temporal.n {
    int p();

    @Override
    default boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.ERA;
        }
        return qVar != null && qVar.Y(this);
    }

    @Override
    default int j(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return p();
        }
        return super.j(qVar);
    }

    @Override
    default long f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return p();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }

    @Override
    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return j$.time.temporal.b.ERAS;
        }
        return super.b(temporalQuery);
    }

    @Override
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(p(), j$.time.temporal.a.ERA);
    }
}
