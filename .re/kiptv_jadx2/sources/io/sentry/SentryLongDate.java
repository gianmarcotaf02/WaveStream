package io.sentry;

public final class SentryLongDate extends SentryDate {
    private final long nanos;

    public SentryLongDate(long j) {
        this.nanos = j;
    }

    @Override
    public long nanoTimestamp() {
        return this.nanos;
    }
}
