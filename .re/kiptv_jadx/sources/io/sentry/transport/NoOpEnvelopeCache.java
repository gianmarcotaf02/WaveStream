package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpEnvelopeCache implements io.sentry.cache.IEnvelopeCache {
    private static final io.sentry.transport.NoOpEnvelopeCache instance = new io.sentry.transport.NoOpEnvelopeCache();

    public static io.sentry.transport.NoOpEnvelopeCache getInstance() {
        return instance;
    }

    @Override // io.sentry.cache.IEnvelopeCache
    public void discard(io.sentry.SentryEnvelope sentryEnvelope) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<io.sentry.SentryEnvelope> iterator() {
        return java.util.Collections.emptyIterator();
    }

    @Override // io.sentry.cache.IEnvelopeCache
    public void store(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint) {
    }
}
