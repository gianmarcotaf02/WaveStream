package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

final class NoOpSerializer implements ISerializer {
    private static final NoOpSerializer instance = new NoOpSerializer();

    private NoOpSerializer() {
    }

    public static NoOpSerializer getInstance() {
        return instance;
    }

    @Override
    public <T> T deserialize(Reader reader, Class<T> cls) {
        return null;
    }

    @Override
    public <T, R> T deserializeCollection(Reader reader, Class<T> cls, JsonDeserializer<R> jsonDeserializer) {
        return null;
    }

    @Override
    public SentryEnvelope deserializeEnvelope(InputStream inputStream) {
        return null;
    }

    @Override
    public void serialize(SentryEnvelope sentryEnvelope, OutputStream outputStream) {
    }

    @Override
    public <T> void serialize(T t9, Writer writer) {
    }

    @Override
    public String serialize(Map<String, Object> map) {
        return "";
    }
}
