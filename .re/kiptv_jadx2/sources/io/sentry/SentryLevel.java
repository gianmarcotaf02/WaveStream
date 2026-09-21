package io.sentry;

import java.util.Locale;

public enum SentryLevel implements JsonSerializable {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class Deserializer implements JsonDeserializer<SentryLevel> {
        @Override
        public SentryLevel deserialize(ObjectReader objectReader, ILogger iLogger) {
            return SentryLevel.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
        }
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(name().toLowerCase(Locale.ROOT));
    }
}
