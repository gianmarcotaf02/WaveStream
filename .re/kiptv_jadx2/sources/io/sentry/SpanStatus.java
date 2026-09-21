package io.sentry;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Locale;

public enum SpanStatus implements JsonSerializable {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(RCHTTPStatusCodes.BAD_REQUEST),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(RCHTTPStatusCodes.NOT_FOUND),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(RCHTTPStatusCodes.FORBIDDEN),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(RCHTTPStatusCodes.BAD_REQUEST),
    ABORTED(409),
    OUT_OF_RANGE(RCHTTPStatusCodes.BAD_REQUEST),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(RCHTTPStatusCodes.UNAUTHORIZED);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class Deserializer implements JsonDeserializer<SpanStatus> {
        @Override
        public SpanStatus deserialize(ObjectReader objectReader, ILogger iLogger) {
            return SpanStatus.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
        }
    }

    SpanStatus(int i3) {
        this.minHttpStatusCode = i3;
        this.maxHttpStatusCode = i3;
    }

    public static SpanStatus fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static SpanStatus fromHttpStatusCode(int i3) {
        for (SpanStatus spanStatus : values()) {
            if (spanStatus.matches(i3)) {
                return spanStatus;
            }
        }
        return null;
    }

    private boolean matches(int i3) {
        return i3 >= this.minHttpStatusCode && i3 <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(apiName());
    }

    public static SpanStatus fromHttpStatusCode(Integer num, SpanStatus spanStatus) {
        SpanStatus spanStatusFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : spanStatus;
        return spanStatusFromHttpStatusCode != null ? spanStatusFromHttpStatusCode : spanStatus;
    }

    SpanStatus(int i3, int i9) {
        this.minHttpStatusCode = i3;
        this.maxHttpStatusCode = i9;
    }
}
