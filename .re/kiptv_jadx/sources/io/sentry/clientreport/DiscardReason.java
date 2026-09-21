package io.sentry.clientreport;

/* JADX INFO: loaded from: classes4.dex */
public enum DiscardReason {
    QUEUE_OVERFLOW("queue_overflow"),
    CACHE_OVERFLOW("cache_overflow"),
    RATELIMIT_BACKOFF("ratelimit_backoff"),
    NETWORK_ERROR("network_error"),
    SAMPLE_RATE(io.sentry.TraceContext.JsonKeys.SAMPLE_RATE),
    BEFORE_SEND("before_send"),
    EVENT_PROCESSOR("event_processor"),
    BACKPRESSURE("backpressure");

    private final java.lang.String reason;

    DiscardReason(java.lang.String str) {
        this.reason = str;
    }

    public java.lang.String getReason() {
        return this.reason;
    }
}
