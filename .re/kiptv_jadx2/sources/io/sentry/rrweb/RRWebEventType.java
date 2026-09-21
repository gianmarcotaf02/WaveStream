package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;

public enum RRWebEventType implements JsonSerializable {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    public static final class Deserializer implements JsonDeserializer<RRWebEventType> {
        @Override
        public RRWebEventType deserialize(ObjectReader objectReader, ILogger iLogger) {
            return RRWebEventType.values()[objectReader.nextInt()];
        }
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(ordinal());
    }
}
