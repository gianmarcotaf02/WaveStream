package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public enum SentryLevel implements io.sentry.JsonSerializable {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SentryLevel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SentryLevel deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            return io.sentry.SentryLevel.valueOf(objectReader.nextString().toUpperCase(java.util.Locale.ROOT));
        }
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.value(name().toLowerCase(java.util.Locale.ROOT));
    }
}
