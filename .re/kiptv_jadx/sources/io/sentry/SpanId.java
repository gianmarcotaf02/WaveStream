package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SpanId implements io.sentry.JsonSerializable {
    public static final io.sentry.SpanId EMPTY_ID = new io.sentry.SpanId(io.sentry.util.StringUtils.PROPER_NIL_UUID.replace("-", "").substring(0, 16));
    private final io.sentry.util.LazyEvaluator<java.lang.String> lazyValue;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SpanId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SpanId deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            return new io.sentry.SpanId(objectReader.nextString());
        }
    }

    public SpanId(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "value is required");
        this.lazyValue = new io.sentry.util.LazyEvaluator<>(new io.sentry.m(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.String lambda$new$0(java.lang.String str) {
        return str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.sentry.SpanId.class != obj.getClass()) {
            return false;
        }
        return this.lazyValue.getValue().equals(((io.sentry.SpanId) obj).lazyValue.getValue());
    }

    public int hashCode() {
        return this.lazyValue.getValue().hashCode();
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.value(this.lazyValue.getValue());
    }

    public java.lang.String toString() {
        return this.lazyValue.getValue();
    }

    public SpanId() {
        this.lazyValue = new io.sentry.util.LazyEvaluator<>(new io.sentry.g(9));
    }
}
