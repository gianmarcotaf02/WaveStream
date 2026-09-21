package io.sentry;

public interface JsonDeserializer<T> {
    T deserialize(ObjectReader objectReader, ILogger iLogger);
}
