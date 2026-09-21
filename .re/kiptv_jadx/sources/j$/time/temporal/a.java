package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public enum a implements j$.time.temporal.q {
    NANO_OF_SECOND("NanoOfSecond", j$.time.temporal.u.f(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", j$.time.temporal.u.f(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", j$.time.temporal.u.f(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", j$.time.temporal.u.f(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", j$.time.temporal.u.f(0, 999)),
    MILLI_OF_DAY("MilliOfDay", j$.time.temporal.u.f(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", j$.time.temporal.u.f(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", j$.time.temporal.u.f(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", j$.time.temporal.u.f(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", j$.time.temporal.u.f(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", j$.time.temporal.u.f(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", j$.time.temporal.u.f(1, 12)),
    HOUR_OF_DAY("HourOfDay", j$.time.temporal.u.f(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", j$.time.temporal.u.f(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", j$.time.temporal.u.f(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", j$.time.temporal.u.f(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", j$.time.temporal.u.f(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", j$.time.temporal.u.f(1, 7)),
    DAY_OF_MONTH("DayOfMonth", j$.time.temporal.u.g(1, 28, 31), 0),
    DAY_OF_YEAR("DayOfYear", j$.time.temporal.u.g(1, 365, 366)),
    EPOCH_DAY("EpochDay", j$.time.temporal.u.f(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", j$.time.temporal.u.g(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", j$.time.temporal.u.f(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", j$.time.temporal.u.f(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", j$.time.temporal.u.f(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", j$.time.temporal.u.g(1, 999999999, androidx.media3.common.C.NANOS_PER_SECOND)),
    YEAR("Year", j$.time.temporal.u.f(-999999999, 999999999), 0),
    ERA("Era", j$.time.temporal.u.f(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", j$.time.temporal.u.f(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", j$.time.temporal.u.f(-64800, 64800));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f23782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j$.time.temporal.u f23783b;

    static {
        j$.time.temporal.b bVar = j$.time.temporal.b.NANOS;
    }

    a(java.lang.String str, j$.time.temporal.u uVar) {
        this.f23782a = str;
        this.f23783b = uVar;
    }

    a(java.lang.String str, j$.time.temporal.u uVar, int i3) {
        this.f23782a = str;
        this.f23783b = uVar;
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.u B() {
        return this.f23783b;
    }

    @Override // j$.time.temporal.q
    public final boolean W() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean c0() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final void b0(long j) {
        this.f23783b.b(j, this);
    }

    @Override // j$.time.temporal.q
    public final boolean Y(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.d(this);
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.u K(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.l(this);
    }

    @Override // j$.time.temporal.q
    public final long r(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(this);
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(j$.time.temporal.m mVar, long j) {
        return mVar.e(j, this);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f23782a;
    }
}
