package io.sentry;

public interface ObjectWriter {
    ObjectWriter beginArray();

    ObjectWriter beginObject();

    ObjectWriter endArray();

    ObjectWriter endObject();

    ObjectWriter jsonValue(String str);

    ObjectWriter name(String str);

    ObjectWriter nullValue();

    void setLenient(boolean z6);

    ObjectWriter value(double d4);

    ObjectWriter value(long j);

    ObjectWriter value(ILogger iLogger, Object obj);

    ObjectWriter value(Boolean bool);

    ObjectWriter value(Number number);

    ObjectWriter value(String str);

    ObjectWriter value(boolean z6);
}
