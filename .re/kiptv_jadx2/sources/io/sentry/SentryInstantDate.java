package io.sentry;

import j$.time.Instant;

public final class SentryInstantDate extends SentryDate {
    private final Instant date;

    public SentryInstantDate() {
        this(Instant.now());
    }

    @Override
    public long nanoTimestamp() {
        return DateUtils.secondsToNanos(this.date.getEpochSecond()) + ((long) this.date.getNano());
    }

    public SentryInstantDate(Instant instant) {
        this.date = instant;
    }
}
