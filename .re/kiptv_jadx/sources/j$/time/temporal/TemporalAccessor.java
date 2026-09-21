package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public interface TemporalAccessor {
    boolean d(j$.time.temporal.q qVar);

    long f(j$.time.temporal.q qVar);

    default j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            java.util.Objects.requireNonNull(qVar, "field");
            return qVar.K(this);
        }
        if (d(qVar)) {
            return ((j$.time.temporal.a) qVar).f23783b;
        }
        throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
    }

    default int j(j$.time.temporal.q qVar) {
        j$.time.temporal.u uVarL = l(qVar);
        if (!uVarL.d()) {
            throw new j$.time.temporal.t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jF = f(qVar);
        if (uVarL.e(jF)) {
            return (int) jF;
        }
        throw new j$.time.DateTimeException("Invalid value for " + qVar + " (valid values " + uVarL + "): " + jF);
    }

    default java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23802a || temporalQuery == j$.time.temporal.r.f23803b || temporalQuery == j$.time.temporal.r.f23804c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }
}
