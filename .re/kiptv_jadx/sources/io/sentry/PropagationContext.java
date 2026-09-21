package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class PropagationContext {
    private final io.sentry.Baggage baggage;
    private io.sentry.SpanId parentSpanId;
    private java.lang.Boolean sampled;
    private io.sentry.SpanId spanId;
    private io.sentry.protocol.SentryId traceId;

    public PropagationContext() {
        this(new io.sentry.protocol.SentryId(), new io.sentry.SpanId(), null, null, null);
    }

    public static io.sentry.PropagationContext fromExistingTrace(java.lang.String str, java.lang.String str2, java.lang.Double d4, java.lang.Double d6) {
        return new io.sentry.PropagationContext(new io.sentry.protocol.SentryId(str), new io.sentry.SpanId(), new io.sentry.SpanId(str2), io.sentry.util.TracingUtils.ensureBaggage(null, null, d4, d6), null);
    }

    public static io.sentry.PropagationContext fromHeaders(io.sentry.ILogger iLogger, java.lang.String str, java.lang.String str2) {
        return fromHeaders(iLogger, str, (java.util.List<java.lang.String>) java.util.Arrays.asList(str2));
    }

    public io.sentry.Baggage getBaggage() {
        return this.baggage;
    }

    public io.sentry.SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    public java.lang.Double getSampleRand() {
        java.lang.Double sampleRandDouble = this.baggage.getSampleRandDouble();
        return java.lang.Double.valueOf(sampleRandDouble == null ? 0.0d : sampleRandDouble.doubleValue());
    }

    public io.sentry.SpanId getSpanId() {
        return this.spanId;
    }

    public io.sentry.protocol.SentryId getTraceId() {
        return this.traceId;
    }

    public java.lang.Boolean isSampled() {
        return this.sampled;
    }

    public void setParentSpanId(io.sentry.SpanId spanId) {
        this.parentSpanId = spanId;
    }

    public void setSampled(java.lang.Boolean bool) {
        this.sampled = bool;
    }

    public void setSpanId(io.sentry.SpanId spanId) {
        this.spanId = spanId;
    }

    public void setTraceId(io.sentry.protocol.SentryId sentryId) {
        this.traceId = sentryId;
    }

    public io.sentry.SpanContext toSpanContext() {
        io.sentry.SpanContext spanContext = new io.sentry.SpanContext(this.traceId, this.spanId, "default", null, null);
        spanContext.setOrigin(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO);
        return spanContext;
    }

    public io.sentry.TraceContext traceContext() {
        io.sentry.Baggage baggage = this.baggage;
        if (baggage != null) {
            return baggage.toTraceContext();
        }
        return null;
    }

    public PropagationContext(io.sentry.PropagationContext propagationContext) {
        this(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.getParentSpanId(), propagationContext.getBaggage(), propagationContext.isSampled());
    }

    public static io.sentry.PropagationContext fromHeaders(io.sentry.ILogger iLogger, java.lang.String str, java.util.List<java.lang.String> list) {
        if (str == null) {
            return new io.sentry.PropagationContext();
        }
        try {
            return fromHeaders(new io.sentry.SentryTraceHeader(str), io.sentry.Baggage.fromHeader(list, iLogger), (io.sentry.SpanId) null);
        } catch (io.sentry.exception.InvalidSentryTraceHeaderException e6) {
            iLogger.log(io.sentry.SentryLevel.DEBUG, e6, "Failed to parse Sentry trace header: %s", e6.getMessage());
            return new io.sentry.PropagationContext();
        }
    }

    public PropagationContext(io.sentry.protocol.SentryId sentryId, io.sentry.SpanId spanId, io.sentry.SpanId spanId2, io.sentry.Baggage baggage, java.lang.Boolean bool) {
        this.traceId = sentryId;
        this.spanId = spanId;
        this.parentSpanId = spanId2;
        this.baggage = io.sentry.util.TracingUtils.ensureBaggage(baggage, bool, null, null);
        this.sampled = bool;
    }

    public static io.sentry.PropagationContext fromHeaders(io.sentry.SentryTraceHeader sentryTraceHeader, io.sentry.Baggage baggage, io.sentry.SpanId spanId) {
        if (spanId == null) {
            spanId = new io.sentry.SpanId();
        }
        return new io.sentry.PropagationContext(sentryTraceHeader.getTraceId(), spanId, sentryTraceHeader.getSpanId(), baggage, sentryTraceHeader.isSampled());
    }
}
