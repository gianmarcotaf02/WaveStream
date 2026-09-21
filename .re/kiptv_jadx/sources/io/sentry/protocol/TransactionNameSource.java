package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public enum TransactionNameSource {
    CUSTOM,
    URL,
    ROUTE,
    VIEW,
    COMPONENT,
    TASK;

    public java.lang.String apiName() {
        return name().toLowerCase(java.util.Locale.ROOT);
    }
}
