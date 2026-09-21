package io.sentry.rrweb;

/* JADX INFO: loaded from: classes4.dex */
public enum RRWebEventType implements io.sentry.JsonSerializable {
    DomContentLoaded,
    Load,
    FullSnapshot,
    IncrementalSnapshot,
    Meta,
    Custom,
    Plugin;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.rrweb.RRWebEventType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.rrweb.RRWebEventType deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            return io.sentry.rrweb.RRWebEventType.values()[objectReader.nextInt()];
        }
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.value(ordinal());
    }
}
