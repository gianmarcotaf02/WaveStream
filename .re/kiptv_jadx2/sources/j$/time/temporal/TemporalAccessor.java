package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

public interface TemporalAccessor {
    boolean d(q qVar);

    long f(q qVar);

    default u l(q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.K(this);
        }
        if (d(qVar)) {
            return ((a) qVar).f23783b;
        }
        throw new t(j$.time.b.a("Unsupported field: ", qVar));
    }

    default int j(q qVar) {
        u uVarL = l(qVar);
        if (!uVarL.d()) {
            throw new t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jF = f(qVar);
        if (uVarL.e(jF)) {
            return (int) jF;
        }
        throw new DateTimeException("Invalid value for " + qVar + " (valid values " + uVarL + "): " + jF);
    }

    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == r.f23802a || temporalQuery == r.f23803b || temporalQuery == r.f23804c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }
}
