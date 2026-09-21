package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

public interface ISerializer {
    <T> T deserialize(Reader reader, Class<T> cls);

    <T, R> T deserializeCollection(Reader reader, Class<T> cls, JsonDeserializer<R> jsonDeserializer);

    SentryEnvelope deserializeEnvelope(InputStream inputStream);

    String serialize(Map<String, Object> map);

    void serialize(SentryEnvelope sentryEnvelope, OutputStream outputStream);

    <T> void serialize(T t9, Writer writer);
}
