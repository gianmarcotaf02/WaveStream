package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public enum CheckInStatus {
    IN_PROGRESS,
    OK,
    ERROR;

    public java.lang.String apiName() {
        return name().toLowerCase(java.util.Locale.ROOT);
    }
}
