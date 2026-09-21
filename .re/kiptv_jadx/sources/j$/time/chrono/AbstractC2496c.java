package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2496c implements j$.time.chrono.ChronoLocalDate, j$.time.temporal.m, j$.time.temporal.n, java.io.Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public abstract j$.time.chrono.ChronoLocalDate B(long j);

    public abstract j$.time.chrono.ChronoLocalDate J(long j);

    public abstract j$.time.chrono.ChronoLocalDate K(long j);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return a(j, sVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m e(long j, j$.time.temporal.q qVar) {
        return e(j, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ j$.time.temporal.m m(j$.time.LocalDate localDate) {
        return m(localDate);
    }

    public static j$.time.chrono.ChronoLocalDate r(j$.time.chrono.l lVar, j$.time.temporal.m mVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = (j$.time.chrono.ChronoLocalDate) mVar;
        if (lVar.equals(chronoLocalDate.h())) {
            return chronoLocalDate;
        }
        throw new java.lang.ClassCastException("Chronology mismatch, expected: " + lVar.s() + ", actual: " + chronoLocalDate.h().s());
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public j$.time.chrono.ChronoLocalDate i(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return super.i(j, sVar);
        }
        switch (j$.time.chrono.AbstractC2495b.f23600a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return B(j);
            case 2:
                return B(java.lang.Math.multiplyExact(j, 7));
            case 3:
                return J(j);
            case 4:
                return K(j);
            case 5:
                return K(java.lang.Math.multiplyExact(j, 10));
            case 6:
                return K(java.lang.Math.multiplyExact(j, 100));
            case 7:
                return K(java.lang.Math.multiplyExact(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return e(java.lang.Math.addExact(f(aVar), j), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j$.time.chrono.ChronoLocalDate) && compareTo((j$.time.chrono.ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ h().hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final java.lang.String toString() {
        long jF = f(j$.time.temporal.a.YEAR_OF_ERA);
        long jF2 = f(j$.time.temporal.a.MONTH_OF_YEAR);
        long jF3 = f(j$.time.temporal.a.DAY_OF_MONTH);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        sb.append(h().toString());
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        sb.append(u());
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        sb.append(jF);
        sb.append(jF2 < 10 ? "-0" : "-");
        sb.append(jF2);
        sb.append(jF3 < 10 ? "-0" : "-");
        sb.append(jF3);
        return sb.toString();
    }
}
