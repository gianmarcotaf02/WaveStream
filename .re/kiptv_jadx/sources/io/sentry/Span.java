package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class Span implements io.sentry.ISpan {
    private final io.sentry.SpanContext context;
    private final io.sentry.SpanOptions options;
    private final io.sentry.IScopes scopes;
    private io.sentry.SpanFinishedCallback spanFinishedCallback;
    private io.sentry.SentryDate startTimestamp;
    private java.lang.Throwable throwable;
    private io.sentry.SentryDate timestamp;
    private final io.sentry.SentryTracer transaction;
    private boolean finished = false;
    private final java.util.concurrent.atomic.AtomicBoolean isFinishing = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.Map<java.lang.String, java.lang.Object> data = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.Map<java.lang.String, io.sentry.protocol.MeasurementValue> measurements = new java.util.concurrent.ConcurrentHashMap();
    private final io.sentry.protocol.Contexts contexts = new io.sentry.protocol.Contexts();

    public Span(io.sentry.SentryTracer sentryTracer, io.sentry.IScopes iScopes, io.sentry.SpanContext spanContext, io.sentry.SpanOptions spanOptions, io.sentry.SpanFinishedCallback spanFinishedCallback) {
        this.context = spanContext;
        spanContext.setOrigin(spanOptions.getOrigin());
        this.transaction = (io.sentry.SentryTracer) io.sentry.util.Objects.requireNonNull(sentryTracer, "transaction is required");
        this.scopes = (io.sentry.IScopes) io.sentry.util.Objects.requireNonNull(iScopes, "Scopes are required");
        this.options = spanOptions;
        this.spanFinishedCallback = spanFinishedCallback;
        io.sentry.SentryDate startTimestamp = spanOptions.getStartTimestamp();
        if (startTimestamp != null) {
            this.startTimestamp = startTimestamp;
        } else {
            this.startTimestamp = iScopes.getOptions().getDateProvider().now();
        }
    }

    private java.util.List<io.sentry.Span> getDirectChildren() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (io.sentry.Span span : this.transaction.getSpans()) {
            if (span.getParentSpanId() != null && span.getParentSpanId().equals(getSpanId())) {
                arrayList.add(span);
            }
        }
        return arrayList;
    }

    private void updateStartDate(io.sentry.SentryDate sentryDate) {
        this.startTimestamp = sentryDate;
    }

    @Override // io.sentry.ISpan
    public void finish() {
        finish(this.context.getStatus());
    }

    @Override // io.sentry.ISpan
    public io.sentry.protocol.Contexts getContexts() {
        return this.contexts;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getData() {
        return this.data;
    }

    @Override // io.sentry.ISpan
    public java.lang.String getDescription() {
        return this.context.getDescription();
    }

    @Override // io.sentry.ISpan
    public io.sentry.SentryDate getFinishDate() {
        return this.timestamp;
    }

    public java.util.Map<java.lang.String, io.sentry.protocol.MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    @Override // io.sentry.ISpan
    public java.lang.String getOperation() {
        return this.context.getOperation();
    }

    public io.sentry.SpanOptions getOptions() {
        return this.options;
    }

    public io.sentry.SpanId getParentSpanId() {
        return this.context.getParentSpanId();
    }

    @Override // io.sentry.ISpan
    public io.sentry.TracesSamplingDecision getSamplingDecision() {
        return this.context.getSamplingDecision();
    }

    @Override // io.sentry.ISpan
    public io.sentry.SpanContext getSpanContext() {
        return this.context;
    }

    public io.sentry.SpanFinishedCallback getSpanFinishedCallback() {
        return this.spanFinishedCallback;
    }

    public io.sentry.SpanId getSpanId() {
        return this.context.getSpanId();
    }

    @Override // io.sentry.ISpan
    public io.sentry.SentryDate getStartDate() {
        return this.startTimestamp;
    }

    @Override // io.sentry.ISpan
    public io.sentry.SpanStatus getStatus() {
        return this.context.getStatus();
    }

    @Override // io.sentry.ISpan
    public java.lang.String getTag(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.context.getTags().get(str);
    }

    public java.util.Map<java.lang.String, java.lang.String> getTags() {
        return this.context.getTags();
    }

    @Override // io.sentry.ISpan
    public java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public io.sentry.protocol.SentryId getTraceId() {
        return this.context.getTraceId();
    }

    @Override // io.sentry.ISpan
    public boolean isFinished() {
        return this.finished;
    }

    @Override // io.sentry.ISpan
    public boolean isNoOp() {
        return false;
    }

    public java.lang.Boolean isProfileSampled() {
        return this.context.getProfileSampled();
    }

    @Override // io.sentry.ISpan
    public java.lang.Boolean isSampled() {
        return this.context.getSampled();
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISentryLifecycleToken makeCurrent() {
        return io.sentry.NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.ISpan
    public void setContext(java.lang.String str, java.lang.Object obj) {
        this.contexts.put(str, obj);
    }

    @Override // io.sentry.ISpan
    public void setData(java.lang.String str, java.lang.Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.data.remove(str);
        } else {
            this.data.put(str, obj);
        }
    }

    @Override // io.sentry.ISpan
    public void setDescription(java.lang.String str) {
        this.context.setDescription(str);
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(java.lang.String str, java.lang.Number number) {
        if (isFinished()) {
            this.scopes.getOptions().getLogger().log(io.sentry.SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.measurements.put(str, new io.sentry.protocol.MeasurementValue(number, null));
        if (this.transaction.getRoot() != this) {
            this.transaction.setMeasurementFromChild(str, number);
        }
    }

    @Override // io.sentry.ISpan
    public void setOperation(java.lang.String str) {
        this.context.setOperation(str);
    }

    public void setSpanFinishedCallback(io.sentry.SpanFinishedCallback spanFinishedCallback) {
        this.spanFinishedCallback = spanFinishedCallback;
    }

    @Override // io.sentry.ISpan
    public void setStatus(io.sentry.SpanStatus spanStatus) {
        this.context.setStatus(spanStatus);
    }

    @Override // io.sentry.ISpan
    public void setTag(java.lang.String str, java.lang.String str2) {
        this.context.setTag(str, str2);
    }

    @Override // io.sentry.ISpan
    public void setThrowable(java.lang.Throwable th) {
        this.throwable = th;
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(java.lang.String str) {
        return startChild(str, (java.lang.String) null);
    }

    @Override // io.sentry.ISpan
    public io.sentry.BaggageHeader toBaggageHeader(java.util.List<java.lang.String> list) {
        return this.transaction.toBaggageHeader(list);
    }

    @Override // io.sentry.ISpan
    public io.sentry.SentryTraceHeader toSentryTrace() {
        return new io.sentry.SentryTraceHeader(this.context.getTraceId(), this.context.getSpanId(), this.context.getSampled());
    }

    @Override // io.sentry.ISpan
    public io.sentry.TraceContext traceContext() {
        return this.transaction.traceContext();
    }

    @Override // io.sentry.ISpan
    public boolean updateEndDate(io.sentry.SentryDate sentryDate) {
        if (this.timestamp == null) {
            return false;
        }
        this.timestamp = sentryDate;
        return true;
    }

    @Override // io.sentry.ISpan
    public void finish(io.sentry.SpanStatus spanStatus) {
        finish(spanStatus, this.scopes.getOptions().getDateProvider().now());
    }

    @Override // io.sentry.ISpan
    public java.lang.Object getData(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.data.get(str);
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2, io.sentry.SentryDate sentryDate, io.sentry.Instrumenter instrumenter, io.sentry.SpanOptions spanOptions) {
        return this.finished ? io.sentry.NoOpSpan.getInstance() : this.transaction.startChild(this.context.getSpanId(), str, str2, sentryDate, instrumenter, spanOptions);
    }

    @Override // io.sentry.ISpan
    public void finish(io.sentry.SpanStatus spanStatus, io.sentry.SentryDate sentryDate) {
        java.util.List<io.sentry.Span> directChildren;
        io.sentry.SentryDate sentryDate2;
        if (this.finished || !this.isFinishing.compareAndSet(false, true)) {
            return;
        }
        this.context.setStatus(spanStatus);
        if (sentryDate == null) {
            sentryDate = this.scopes.getOptions().getDateProvider().now();
        }
        this.timestamp = sentryDate;
        if (this.options.isTrimStart() || this.options.isTrimEnd()) {
            if (this.transaction.getRoot().getSpanId().equals(getSpanId())) {
                directChildren = this.transaction.getChildren();
            } else {
                directChildren = getDirectChildren();
            }
            io.sentry.SentryDate startDate = null;
            io.sentry.SentryDate finishDate = null;
            for (io.sentry.Span span : directChildren) {
                if (startDate == null || span.getStartDate().isBefore(startDate)) {
                    startDate = span.getStartDate();
                }
                if (finishDate == null || (span.getFinishDate() != null && span.getFinishDate().isAfter(finishDate))) {
                    finishDate = span.getFinishDate();
                }
            }
            if (this.options.isTrimStart() && startDate != null && this.startTimestamp.isBefore(startDate)) {
                updateStartDate(startDate);
            }
            if (this.options.isTrimEnd() && finishDate != null && ((sentryDate2 = this.timestamp) == null || sentryDate2.isAfter(finishDate))) {
                updateEndDate(finishDate);
            }
        }
        java.lang.Throwable th = this.throwable;
        if (th != null) {
            this.scopes.setSpanContext(th, this, this.transaction.getName());
        }
        io.sentry.SpanFinishedCallback spanFinishedCallback = this.spanFinishedCallback;
        if (spanFinishedCallback != null) {
            spanFinishedCallback.execute(this);
        }
        this.finished = true;
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2) {
        if (this.finished) {
            return io.sentry.NoOpSpan.getInstance();
        }
        return this.transaction.startChild(this.context.getSpanId(), str, str2);
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(java.lang.String str, java.lang.Number number, io.sentry.MeasurementUnit measurementUnit) {
        if (isFinished()) {
            this.scopes.getOptions().getLogger().log(io.sentry.SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.measurements.put(str, new io.sentry.protocol.MeasurementValue(number, measurementUnit.apiName()));
        if (this.transaction.getRoot() != this) {
            this.transaction.setMeasurementFromChild(str, number, measurementUnit);
        }
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2, io.sentry.SpanOptions spanOptions) {
        if (this.finished) {
            return io.sentry.NoOpSpan.getInstance();
        }
        return this.transaction.startChild(this.context.getSpanId(), str, str2, spanOptions);
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(io.sentry.SpanContext spanContext, io.sentry.SpanOptions spanOptions) {
        return this.transaction.startChild(spanContext, spanOptions);
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2, io.sentry.SentryDate sentryDate, io.sentry.Instrumenter instrumenter) {
        return startChild(str, str2, sentryDate, instrumenter, new io.sentry.SpanOptions());
    }

    public Span(io.sentry.TransactionContext transactionContext, io.sentry.SentryTracer sentryTracer, io.sentry.IScopes iScopes, io.sentry.SpanOptions spanOptions) {
        io.sentry.SpanContext spanContext = (io.sentry.SpanContext) io.sentry.util.Objects.requireNonNull(transactionContext, "context is required");
        this.context = spanContext;
        spanContext.setOrigin(spanOptions.getOrigin());
        this.transaction = (io.sentry.SentryTracer) io.sentry.util.Objects.requireNonNull(sentryTracer, "sentryTracer is required");
        this.scopes = (io.sentry.IScopes) io.sentry.util.Objects.requireNonNull(iScopes, "scopes are required");
        this.spanFinishedCallback = null;
        io.sentry.SentryDate startTimestamp = spanOptions.getStartTimestamp();
        if (startTimestamp != null) {
            this.startTimestamp = startTimestamp;
        } else {
            this.startTimestamp = iScopes.getOptions().getDateProvider().now();
        }
        this.options = spanOptions;
    }
}
