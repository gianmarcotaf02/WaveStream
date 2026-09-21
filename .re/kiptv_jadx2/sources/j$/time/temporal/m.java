package j$.time.temporal;

import j$.time.LocalDate;

public interface m extends TemporalAccessor {
    m e(long j, q qVar);

    m m(LocalDate localDate);

    m i(long j, s sVar);

    default m a(long j, s sVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, sVar).i(1L, sVar) : i(-j, sVar);
    }
}
