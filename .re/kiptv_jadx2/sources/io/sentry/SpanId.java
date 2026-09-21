package io.sentry;

import io.sentry.util.LazyEvaluator;
import io.sentry.util.StringUtils;
import java.util.Objects;

public final class SpanId implements JsonSerializable {
    public static final SpanId EMPTY_ID = new SpanId(StringUtils.PROPER_NIL_UUID.replace("-", "").substring(0, 16));
    private final LazyEvaluator<String> lazyValue;

    public static final class Deserializer implements JsonDeserializer<SpanId> {
        @Override
        public SpanId deserialize(ObjectReader objectReader, ILogger iLogger) {
            return new SpanId(objectReader.nextString());
        }
    }

    public SpanId(String str) {
        Objects.requireNonNull(str, "value is required");
        this.lazyValue = new LazyEvaluator<>(new m(str));
    }

    public static String lambda$new$0(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SpanId.class != obj.getClass()) {
            return false;
        }
        return this.lazyValue.getValue().equals(((SpanId) obj).lazyValue.getValue());
    }

    public int hashCode() {
        return this.lazyValue.getValue().hashCode();
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(this.lazyValue.getValue());
    }

    public String toString() {
        return this.lazyValue.getValue();
    }

    public SpanId() {
        this.lazyValue = new LazyEvaluator<>(new g(9));
    }
}
