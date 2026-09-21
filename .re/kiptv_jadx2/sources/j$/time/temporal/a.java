package j$.time.temporal;

import androidx.media3.common.C;

public enum a implements q {
    NANO_OF_SECOND("NanoOfSecond", u.f(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", u.f(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", u.f(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", u.f(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", u.f(0, 999)),
    MILLI_OF_DAY("MilliOfDay", u.f(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", u.f(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", u.f(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", u.f(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", u.f(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", u.f(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", u.f(1, 12)),
    HOUR_OF_DAY("HourOfDay", u.f(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", u.f(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", u.f(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", u.f(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", u.f(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", u.f(1, 7)),
    DAY_OF_MONTH("DayOfMonth", u.g(1, 28, 31), 0),
    DAY_OF_YEAR("DayOfYear", u.g(1, 365, 366)),
    EPOCH_DAY("EpochDay", u.f(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", u.g(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", u.f(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", u.f(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", u.f(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", u.g(1, 999999999, C.NANOS_PER_SECOND)),
    YEAR("Year", u.f(-999999999, 999999999), 0),
    ERA("Era", u.f(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", u.f(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", u.f(-64800, 64800));


    public final String f23782a;

    public final u f23783b;

    static {
        b bVar = b.NANOS;
    }

    a(String str, u uVar) {
        this.f23782a = str;
        this.f23783b = uVar;
    }

    a(String str, u uVar, int i3) {
        this.f23782a = str;
        this.f23783b = uVar;
    }

    @Override
    public final u B() {
        return this.f23783b;
    }

    @Override
    public final boolean W() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean c0() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final void b0(long j) {
        this.f23783b.b(j, this);
    }

    @Override
    public final boolean Y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.d(this);
    }

    @Override
    public final u K(TemporalAccessor temporalAccessor) {
        return temporalAccessor.l(this);
    }

    @Override
    public final long r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(this);
    }

    @Override
    public final m p(m mVar, long j) {
        return mVar.e(j, this);
    }

    @Override
    public final String toString() {
        return this.f23782a;
    }
}
