package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionContext extends io.sentry.SpanContext {
    private static final io.sentry.protocol.TransactionNameSource DEFAULT_NAME_SOURCE = io.sentry.protocol.TransactionNameSource.CUSTOM;
    private static final java.lang.String DEFAULT_OPERATION = "default";
    public static final java.lang.String DEFAULT_TRANSACTION_NAME = "<unlabeled transaction>";
    private boolean isForNextAppStart;
    private java.lang.String name;
    private io.sentry.TracesSamplingDecision parentSamplingDecision;
    private io.sentry.protocol.TransactionNameSource transactionNameSource;

    public TransactionContext(java.lang.String str, java.lang.String str2) {
        this(str, str2, (io.sentry.TracesSamplingDecision) null);
    }

    public static io.sentry.TransactionContext fromPropagationContext(io.sentry.PropagationContext propagationContext) {
        java.lang.Boolean boolIsSampled = propagationContext.isSampled();
        io.sentry.Baggage baggage = propagationContext.getBaggage();
        return new io.sentry.TransactionContext(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.getParentSpanId(), boolIsSampled == null ? null : new io.sentry.TracesSamplingDecision(boolIsSampled, baggage.getSampleRateDouble(), propagationContext.getSampleRand()), baggage);
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.Boolean getParentSampled() {
        io.sentry.TracesSamplingDecision tracesSamplingDecision = this.parentSamplingDecision;
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampled();
    }

    public io.sentry.TracesSamplingDecision getParentSamplingDecision() {
        return this.parentSamplingDecision;
    }

    public io.sentry.protocol.TransactionNameSource getTransactionNameSource() {
        return this.transactionNameSource;
    }

    public boolean isForNextAppStart() {
        return this.isForNextAppStart;
    }

    public void setForNextAppStart(boolean z6) {
        this.isForNextAppStart = z6;
    }

    public void setName(java.lang.String str) {
        this.name = (java.lang.String) io.sentry.util.Objects.requireNonNull(str, "name is required");
    }

    public void setParentSampled(java.lang.Boolean bool) {
        if (bool == null) {
            this.parentSamplingDecision = null;
        } else {
            this.parentSamplingDecision = new io.sentry.TracesSamplingDecision(bool);
        }
    }

    public void setTransactionNameSource(io.sentry.protocol.TransactionNameSource transactionNameSource) {
        this.transactionNameSource = transactionNameSource;
    }

    public TransactionContext(java.lang.String str, io.sentry.protocol.TransactionNameSource transactionNameSource, java.lang.String str2) {
        this(str, transactionNameSource, str2, null);
    }

    public TransactionContext(java.lang.String str, java.lang.String str2, io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        this(str, io.sentry.protocol.TransactionNameSource.CUSTOM, str2, tracesSamplingDecision);
    }

    public void setParentSampled(java.lang.Boolean bool, java.lang.Boolean bool2) {
        if (bool == null) {
            this.parentSamplingDecision = null;
        } else if (bool2 == null) {
            this.parentSamplingDecision = new io.sentry.TracesSamplingDecision(bool);
        } else {
            this.parentSamplingDecision = new io.sentry.TracesSamplingDecision(bool, null, bool2, null);
        }
    }

    public TransactionContext(java.lang.String str, io.sentry.protocol.TransactionNameSource transactionNameSource, java.lang.String str2, io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        super(str2);
        this.isForNextAppStart = false;
        this.name = (java.lang.String) io.sentry.util.Objects.requireNonNull(str, "name is required");
        this.transactionNameSource = transactionNameSource;
        setSamplingDecision(tracesSamplingDecision);
        this.baggage = io.sentry.util.TracingUtils.ensureBaggage(null, tracesSamplingDecision);
    }

    public TransactionContext(io.sentry.protocol.SentryId sentryId, io.sentry.SpanId spanId, io.sentry.SpanId spanId2, io.sentry.TracesSamplingDecision tracesSamplingDecision, io.sentry.Baggage baggage) {
        super(sentryId, spanId, DEFAULT_OPERATION, spanId2, null);
        this.isForNextAppStart = false;
        this.name = DEFAULT_TRANSACTION_NAME;
        this.parentSamplingDecision = tracesSamplingDecision;
        this.transactionNameSource = DEFAULT_NAME_SOURCE;
        this.baggage = io.sentry.util.TracingUtils.ensureBaggage(baggage, tracesSamplingDecision);
    }
}
