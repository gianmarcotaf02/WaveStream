package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ISerializer {
    <T> T deserialize(java.io.Reader reader, java.lang.Class<T> cls);

    <T, R> T deserializeCollection(java.io.Reader reader, java.lang.Class<T> cls, io.sentry.JsonDeserializer<R> jsonDeserializer);

    io.sentry.SentryEnvelope deserializeEnvelope(java.io.InputStream inputStream);

    java.lang.String serialize(java.util.Map<java.lang.String, java.lang.Object> map);

    void serialize(io.sentry.SentryEnvelope sentryEnvelope, java.io.OutputStream outputStream);

    <T> void serialize(T t9, java.io.Writer writer);
}
