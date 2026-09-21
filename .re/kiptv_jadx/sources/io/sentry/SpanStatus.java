package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public enum SpanStatus implements io.sentry.JsonSerializable {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NOT_FOUND),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.FORBIDDEN),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST),
    ABORTED(409),
    OUT_OF_RANGE(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.BAD_REQUEST),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.UNAUTHORIZED);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class Deserializer implements io.sentry.JsonDeserializer<io.sentry.SpanStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public io.sentry.SpanStatus deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger) {
            return io.sentry.SpanStatus.valueOf(objectReader.nextString().toUpperCase(java.util.Locale.ROOT));
        }
    }

    SpanStatus(int i3) {
        this.minHttpStatusCode = i3;
        this.maxHttpStatusCode = i3;
    }

    public static io.sentry.SpanStatus fromApiNameSafely(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(java.util.Locale.ROOT));
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public static io.sentry.SpanStatus fromHttpStatusCode(int i3) {
        for (io.sentry.SpanStatus spanStatus : values()) {
            if (spanStatus.matches(i3)) {
                return spanStatus;
            }
        }
        return null;
    }

    private boolean matches(int i3) {
        return i3 >= this.minHttpStatusCode && i3 <= this.maxHttpStatusCode;
    }

    public java.lang.String apiName() {
        return name().toLowerCase(java.util.Locale.ROOT);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(io.sentry.ObjectWriter objectWriter, io.sentry.ILogger iLogger) {
        objectWriter.value(apiName());
    }

    public static io.sentry.SpanStatus fromHttpStatusCode(java.lang.Integer num, io.sentry.SpanStatus spanStatus) {
        io.sentry.SpanStatus spanStatusFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : spanStatus;
        return spanStatusFromHttpStatusCode != null ? spanStatusFromHttpStatusCode : spanStatus;
    }

    SpanStatus(int i3, int i9) {
        this.minHttpStatusCode = i3;
        this.maxHttpStatusCode = i9;
    }
}
