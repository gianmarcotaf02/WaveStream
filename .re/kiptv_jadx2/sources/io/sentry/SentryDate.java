package io.sentry;

public abstract class SentryDate implements Comparable<SentryDate> {
    public long diff(SentryDate sentryDate) {
        return nanoTimestamp() - sentryDate.nanoTimestamp();
    }

    public final boolean isAfter(SentryDate sentryDate) {
        return diff(sentryDate) > 0;
    }

    public final boolean isBefore(SentryDate sentryDate) {
        return diff(sentryDate) < 0;
    }

    public long laterDateNanosTimestampByDiff(SentryDate sentryDate) {
        return (sentryDate == null || compareTo(sentryDate) >= 0) ? nanoTimestamp() : sentryDate.nanoTimestamp();
    }

    public abstract long nanoTimestamp();

    @Override
    public int compareTo(SentryDate sentryDate) {
        return Long.valueOf(nanoTimestamp()).compareTo(Long.valueOf(sentryDate.nanoTimestamp()));
    }
}
