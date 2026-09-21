package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class NoOpSerializer implements io.sentry.ISerializer {
    private static final io.sentry.NoOpSerializer instance = new io.sentry.NoOpSerializer();

    private NoOpSerializer() {
    }

    public static io.sentry.NoOpSerializer getInstance() {
        return instance;
    }

    @Override // io.sentry.ISerializer
    public <T> T deserialize(java.io.Reader reader, java.lang.Class<T> cls) {
        return null;
    }

    @Override // io.sentry.ISerializer
    public <T, R> T deserializeCollection(java.io.Reader reader, java.lang.Class<T> cls, io.sentry.JsonDeserializer<R> jsonDeserializer) {
        return null;
    }

    @Override // io.sentry.ISerializer
    public io.sentry.SentryEnvelope deserializeEnvelope(java.io.InputStream inputStream) {
        return null;
    }

    @Override // io.sentry.ISerializer
    public void serialize(io.sentry.SentryEnvelope sentryEnvelope, java.io.OutputStream outputStream) {
    }

    @Override // io.sentry.ISerializer
    public <T> void serialize(T t9, java.io.Writer writer) {
    }

    @Override // io.sentry.ISerializer
    public java.lang.String serialize(java.util.Map<java.lang.String, java.lang.Object> map) {
        return "";
    }
}
