package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ObjectWriter {
    io.sentry.ObjectWriter beginArray();

    io.sentry.ObjectWriter beginObject();

    io.sentry.ObjectWriter endArray();

    io.sentry.ObjectWriter endObject();

    io.sentry.ObjectWriter jsonValue(java.lang.String str);

    io.sentry.ObjectWriter name(java.lang.String str);

    io.sentry.ObjectWriter nullValue();

    void setLenient(boolean z6);

    io.sentry.ObjectWriter value(double d4);

    io.sentry.ObjectWriter value(long j);

    io.sentry.ObjectWriter value(io.sentry.ILogger iLogger, java.lang.Object obj);

    io.sentry.ObjectWriter value(java.lang.Boolean bool);

    io.sentry.ObjectWriter value(java.lang.Number number);

    io.sentry.ObjectWriter value(java.lang.String str);

    io.sentry.ObjectWriter value(boolean z6);
}
