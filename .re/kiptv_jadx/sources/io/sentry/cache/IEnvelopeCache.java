package io.sentry.cache;

/* JADX INFO: loaded from: classes4.dex */
public interface IEnvelopeCache extends java.lang.Iterable<io.sentry.SentryEnvelope> {
    void discard(io.sentry.SentryEnvelope sentryEnvelope);

    default void store(io.sentry.SentryEnvelope sentryEnvelope) {
        store(sentryEnvelope, new io.sentry.Hint());
    }

    void store(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint);
}
