package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryLongDate extends io.sentry.SentryDate {
    private final long nanos;

    public SentryLongDate(long j) {
        this.nanos = j;
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return this.nanos;
    }
}
