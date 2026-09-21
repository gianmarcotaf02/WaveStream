package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public interface m extends j$.time.temporal.TemporalAccessor {
    j$.time.temporal.m e(long j, j$.time.temporal.q qVar);

    /* JADX INFO: renamed from: g */
    j$.time.temporal.m m(j$.time.LocalDate localDate);

    j$.time.temporal.m i(long j, j$.time.temporal.s sVar);

    default j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, sVar).i(1L, sVar) : i(-j, sVar);
    }
}
