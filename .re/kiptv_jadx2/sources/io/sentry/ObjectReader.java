package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public interface ObjectReader extends Closeable {
    static Date dateOrNull(String str, ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return DateUtils.getDateTime(str);
            } catch (Exception e6) {
                iLogger.log(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e6);
                return null;
            }
        } catch (Exception unused) {
            return DateUtils.getDateTimeWithMillisPrecision(str);
        }
    }

    void beginArray();

    void beginObject();

    void endArray();

    void endObject();

    boolean hasNext();

    boolean nextBoolean();

    Boolean nextBooleanOrNull();

    Date nextDateOrNull(ILogger iLogger);

    double nextDouble();

    Double nextDoubleOrNull();

    float nextFloat();

    Float nextFloatOrNull();

    int nextInt();

    Integer nextIntegerOrNull();

    <T> List<T> nextListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer);

    long nextLong();

    Long nextLongOrNull();

    <T> Map<String, List<T>> nextMapOfListOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer);

    <T> Map<String, T> nextMapOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer);

    String nextName();

    void nextNull();

    Object nextObjectOrNull();

    <T> T nextOrNull(ILogger iLogger, JsonDeserializer<T> jsonDeserializer);

    String nextString();

    String nextStringOrNull();

    TimeZone nextTimeZoneOrNull(ILogger iLogger);

    void nextUnknown(ILogger iLogger, Map<String, Object> map, String str);

    JsonToken peek();

    void setLenient(boolean z6);

    void skipValue();
}
