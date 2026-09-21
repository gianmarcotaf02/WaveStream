package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SentryDate implements java.lang.Comparable<io.sentry.SentryDate> {
    public long diff(io.sentry.SentryDate sentryDate) {
        return nanoTimestamp() - sentryDate.nanoTimestamp();
    }

    public final boolean isAfter(io.sentry.SentryDate sentryDate) {
        return diff(sentryDate) > 0;
    }

    public final boolean isBefore(io.sentry.SentryDate sentryDate) {
        return diff(sentryDate) < 0;
    }

    public long laterDateNanosTimestampByDiff(io.sentry.SentryDate sentryDate) {
        return (sentryDate == null || compareTo(sentryDate) >= 0) ? nanoTimestamp() : sentryDate.nanoTimestamp();
    }

    public abstract long nanoTimestamp();

    @Override // java.lang.Comparable
    public int compareTo(io.sentry.SentryDate sentryDate) {
        return java.lang.Long.valueOf(nanoTimestamp()).compareTo(java.lang.Long.valueOf(sentryDate.nanoTimestamp()));
    }
}
