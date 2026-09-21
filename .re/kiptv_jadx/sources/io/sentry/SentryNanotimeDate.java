package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryNanotimeDate extends io.sentry.SentryDate {
    private final java.util.Date date;
    private final long nanos;

    public SentryNanotimeDate() {
        this(io.sentry.DateUtils.getCurrentDateTime(), java.lang.System.nanoTime());
    }

    private long nanotimeDiff(io.sentry.SentryNanotimeDate sentryNanotimeDate, io.sentry.SentryNanotimeDate sentryNanotimeDate2) {
        return sentryNanotimeDate.nanoTimestamp() + (sentryNanotimeDate2.nanos - sentryNanotimeDate.nanos);
    }

    @Override // io.sentry.SentryDate
    public long diff(io.sentry.SentryDate sentryDate) {
        return sentryDate instanceof io.sentry.SentryNanotimeDate ? this.nanos - ((io.sentry.SentryNanotimeDate) sentryDate).nanos : super.diff(sentryDate);
    }

    @Override // io.sentry.SentryDate
    public long laterDateNanosTimestampByDiff(io.sentry.SentryDate sentryDate) {
        if (sentryDate == null || !(sentryDate instanceof io.sentry.SentryNanotimeDate)) {
            return super.laterDateNanosTimestampByDiff(sentryDate);
        }
        io.sentry.SentryNanotimeDate sentryNanotimeDate = (io.sentry.SentryNanotimeDate) sentryDate;
        return compareTo(sentryDate) < 0 ? nanotimeDiff(this, sentryNanotimeDate) : nanotimeDiff(sentryNanotimeDate, this);
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return io.sentry.DateUtils.dateToNanos(this.date);
    }

    public SentryNanotimeDate(java.util.Date date, long j) {
        this.date = date;
        this.nanos = j;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.sentry.SentryDate, java.lang.Comparable
    public int compareTo(io.sentry.SentryDate sentryDate) {
        if (!(sentryDate instanceof io.sentry.SentryNanotimeDate)) {
            return super.compareTo(sentryDate);
        }
        io.sentry.SentryNanotimeDate sentryNanotimeDate = (io.sentry.SentryNanotimeDate) sentryDate;
        long time = this.date.getTime();
        long time2 = sentryNanotimeDate.date.getTime();
        return time == time2 ? java.lang.Long.valueOf(this.nanos).compareTo(java.lang.Long.valueOf(sentryNanotimeDate.nanos)) : java.lang.Long.valueOf(time).compareTo(java.lang.Long.valueOf(time2));
    }
}
