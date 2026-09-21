package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryTraceHeader {
    public static final java.lang.String SENTRY_TRACE_HEADER = "sentry-trace";
    private final java.lang.Boolean sampled;
    private final io.sentry.SpanId spanId;
    private final io.sentry.protocol.SentryId traceId;

    public SentryTraceHeader(io.sentry.protocol.SentryId sentryId, io.sentry.SpanId spanId, java.lang.Boolean bool) {
        this.traceId = sentryId;
        this.spanId = spanId;
        this.sampled = bool;
    }

    public java.lang.String getName() {
        return SENTRY_TRACE_HEADER;
    }

    public io.sentry.SpanId getSpanId() {
        return this.spanId;
    }

    public io.sentry.protocol.SentryId getTraceId() {
        return this.traceId;
    }

    public java.lang.String getValue() {
        java.lang.Boolean bool = this.sampled;
        if (bool == null) {
            return this.traceId + "-" + this.spanId;
        }
        return this.traceId + "-" + this.spanId + "-" + (bool.booleanValue() ? androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
    }

    public java.lang.Boolean isSampled() {
        return this.sampled;
    }

    public SentryTraceHeader(java.lang.String str) throws io.sentry.exception.InvalidSentryTraceHeaderException {
        java.lang.String[] strArrSplit = str.split("-", -1);
        if (strArrSplit.length >= 2) {
            if (strArrSplit.length == 3) {
                this.sampled = java.lang.Boolean.valueOf(androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strArrSplit[2]));
            } else {
                this.sampled = null;
            }
            try {
                this.traceId = new io.sentry.protocol.SentryId(strArrSplit[0]);
                this.spanId = new io.sentry.SpanId(strArrSplit[1]);
                return;
            } catch (java.lang.Throwable th) {
                throw new io.sentry.exception.InvalidSentryTraceHeaderException(str, th);
            }
        }
        throw new io.sentry.exception.InvalidSentryTraceHeaderException(str);
    }
}
