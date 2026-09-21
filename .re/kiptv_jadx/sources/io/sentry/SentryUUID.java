package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryUUID {
    private SentryUUID() {
    }

    public static java.lang.String generateSentryId() {
        return io.sentry.util.UUIDStringUtils.toSentryIdString(io.sentry.util.UUIDGenerator.randomUUID());
    }

    public static java.lang.String generateSpanId() {
        return io.sentry.util.UUIDStringUtils.toSentrySpanIdString(io.sentry.util.UUIDGenerator.randomHalfLengthUUID());
    }
}
