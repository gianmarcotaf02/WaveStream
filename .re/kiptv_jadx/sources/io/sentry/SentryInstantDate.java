package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryInstantDate extends io.sentry.SentryDate {
    private final j$.time.Instant date;

    public SentryInstantDate() {
        this(j$.time.Instant.now());
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return io.sentry.DateUtils.secondsToNanos(this.date.getEpochSecond()) + ((long) this.date.getNano());
    }

    public SentryInstantDate(j$.time.Instant instant) {
        this.date = instant;
    }
}
