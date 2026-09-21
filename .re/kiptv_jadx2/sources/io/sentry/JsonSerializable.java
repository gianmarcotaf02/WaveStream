package io.sentry;

public interface JsonSerializable {
    void serialize(ObjectWriter objectWriter, ILogger iLogger);
}
