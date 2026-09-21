package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ObjectReader extends java.io.Closeable {
    static java.util.Date dateOrNull(java.lang.String str, io.sentry.ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return io.sentry.DateUtils.getDateTime(str);
            } catch (java.lang.Exception e6) {
                iLogger.log(io.sentry.SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e6);
                return null;
            }
        } catch (java.lang.Exception unused) {
            return io.sentry.DateUtils.getDateTimeWithMillisPrecision(str);
        }
    }

    void beginArray();

    void beginObject();

    void endArray();

    void endObject();

    boolean hasNext();

    boolean nextBoolean();

    java.lang.Boolean nextBooleanOrNull();

    java.util.Date nextDateOrNull(io.sentry.ILogger iLogger);

    double nextDouble();

    java.lang.Double nextDoubleOrNull();

    float nextFloat();

    java.lang.Float nextFloatOrNull();

    int nextInt();

    java.lang.Integer nextIntegerOrNull();

    <T> java.util.List<T> nextListOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer);

    long nextLong();

    java.lang.Long nextLongOrNull();

    <T> java.util.Map<java.lang.String, java.util.List<T>> nextMapOfListOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer);

    <T> java.util.Map<java.lang.String, T> nextMapOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer);

    java.lang.String nextName();

    void nextNull();

    java.lang.Object nextObjectOrNull();

    <T> T nextOrNull(io.sentry.ILogger iLogger, io.sentry.JsonDeserializer<T> jsonDeserializer);

    java.lang.String nextString();

    java.lang.String nextStringOrNull();

    java.util.TimeZone nextTimeZoneOrNull(io.sentry.ILogger iLogger);

    void nextUnknown(io.sentry.ILogger iLogger, java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str);

    io.sentry.vendor.gson.stream.JsonToken peek();

    void setLenient(boolean z6);

    void skipValue();
}
