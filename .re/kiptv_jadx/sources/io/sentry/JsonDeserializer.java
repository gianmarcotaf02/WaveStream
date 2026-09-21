package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface JsonDeserializer<T> {
    T deserialize(io.sentry.ObjectReader objectReader, io.sentry.ILogger iLogger);
}
