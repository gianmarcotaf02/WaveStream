package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpEnvelopeReader implements io.sentry.IEnvelopeReader {
    private static final io.sentry.NoOpEnvelopeReader instance = new io.sentry.NoOpEnvelopeReader();

    private NoOpEnvelopeReader() {
    }

    public static io.sentry.NoOpEnvelopeReader getInstance() {
        return instance;
    }

    @Override // io.sentry.IEnvelopeReader
    public io.sentry.SentryEnvelope read(java.io.InputStream inputStream) {
        return null;
    }
}
