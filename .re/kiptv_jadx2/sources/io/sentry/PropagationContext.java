package io.sentry;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.sentry.exception.InvalidSentryTraceHeaderException;
import io.sentry.protocol.SentryId;
import io.sentry.util.TracingUtils;
import java.util.Arrays;
import java.util.List;

public final class PropagationContext {
    private final Baggage baggage;
    private SpanId parentSpanId;
    private Boolean sampled;
    private SpanId spanId;
    private SentryId traceId;

    public PropagationContext() {
        this(new SentryId(), new SpanId(), null, null, null);
    }

    public static PropagationContext fromExistingTrace(String str, String str2, Double d4, Double d6) {
        return new PropagationContext(new SentryId(str), new SpanId(), new SpanId(str2), TracingUtils.ensureBaggage(null, null, d4, d6), null);
    }

    public static PropagationContext fromHeaders(ILogger iLogger, String str, String str2) {
        return fromHeaders(iLogger, str, (List<String>) Arrays.asList(str2));
    }

    public Baggage getBaggage() {
        return this.baggage;
    }

    public SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    public Double getSampleRand() {
        Double sampleRandDouble = this.baggage.getSampleRandDouble();
        return Double.valueOf(sampleRandDouble == null ? 0.0d : sampleRandDouble.doubleValue());
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public Boolean isSampled() {
        return this.sampled;
    }

    public void setParentSpanId(SpanId spanId) {
        this.parentSpanId = spanId;
    }

    public void setSampled(Boolean bool) {
        this.sampled = bool;
    }

    public void setSpanId(SpanId spanId) {
        this.spanId = spanId;
    }

    public void setTraceId(SentryId sentryId) {
        this.traceId = sentryId;
    }

    public SpanContext toSpanContext() {
        SpanContext spanContext = new SpanContext(this.traceId, this.spanId, "default", null, null);
        spanContext.setOrigin(TtmlNode.TEXT_EMPHASIS_AUTO);
        return spanContext;
    }

    public TraceContext traceContext() {
        Baggage baggage = this.baggage;
        if (baggage != null) {
            return baggage.toTraceContext();
        }
        return null;
    }

    public PropagationContext(PropagationContext propagationContext) {
        this(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.getParentSpanId(), propagationContext.getBaggage(), propagationContext.isSampled());
    }

    public static PropagationContext fromHeaders(ILogger iLogger, String str, List<String> list) {
        if (str == null) {
            return new PropagationContext();
        }
        try {
            return fromHeaders(new SentryTraceHeader(str), Baggage.fromHeader(list, iLogger), (SpanId) null);
        } catch (InvalidSentryTraceHeaderException e6) {
            iLogger.log(SentryLevel.DEBUG, e6, "Failed to parse Sentry trace header: %s", e6.getMessage());
            return new PropagationContext();
        }
    }

    public PropagationContext(SentryId sentryId, SpanId spanId, SpanId spanId2, Baggage baggage, Boolean bool) {
        this.traceId = sentryId;
        this.spanId = spanId;
        this.parentSpanId = spanId2;
        this.baggage = TracingUtils.ensureBaggage(baggage, bool, null, null);
        this.sampled = bool;
    }

    public static PropagationContext fromHeaders(SentryTraceHeader sentryTraceHeader, Baggage baggage, SpanId spanId) {
        if (spanId == null) {
            spanId = new SpanId();
        }
        return new PropagationContext(sentryTraceHeader.getTraceId(), spanId, sentryTraceHeader.getSpanId(), baggage, sentryTraceHeader.isSampled());
    }
}
