package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpSpan implements io.sentry.ISpan {
    private static final io.sentry.NoOpSpan instance = new io.sentry.NoOpSpan();

    private NoOpSpan() {
    }

    public static io.sentry.NoOpSpan getInstance() {
        return instance;
    }

    @Override // io.sentry.ISpan
    public void finish() {
    }

    @Override // io.sentry.ISpan
    public io.sentry.protocol.Contexts getContexts() {
        return new io.sentry.protocol.Contexts();
    }

    @Override // io.sentry.ISpan
    public java.lang.Object getData(java.lang.String str) {
        return null;
    }

    @Override // io.sentry.ISpan
    public java.lang.String getDescription() {
        return null;
    }

    @Override // io.sentry.ISpan
    public io.sentry.SentryDate getFinishDate() {
        return new io.sentry.SentryNanotimeDate();
    }

    @Override // io.sentry.ISpan
    public java.lang.String getOperation() {
        return "";
    }

    @Override // io.sentry.ISpan
    public io.sentry.TracesSamplingDecision getSamplingDecision() {
        return null;
    }

    @Override // io.sentry.ISpan
    public io.sentry.SpanContext getSpanContext() {
        return new io.sentry.SpanContext(io.sentry.protocol.SentryId.EMPTY_ID, io.sentry.SpanId.EMPTY_ID, "op", null, null);
    }

    @Override // io.sentry.ISpan
    public io.sentry.SentryDate getStartDate() {
        return new io.sentry.SentryNanotimeDate();
    }

    @Override // io.sentry.ISpan
    public io.sentry.SpanStatus getStatus() {
        return null;
    }

    @Override // io.sentry.ISpan
    public java.lang.String getTag(java.lang.String str) {
        return null;
    }

    @Override // io.sentry.ISpan
    public java.lang.Throwable getThrowable() {
        return null;
    }

    @Override // io.sentry.ISpan
    public boolean isFinished() {
        return false;
    }

    @Override // io.sentry.ISpan
    public boolean isNoOp() {
        return true;
    }

    @Override // io.sentry.ISpan
    public java.lang.Boolean isSampled() {
        return null;
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISentryLifecycleToken makeCurrent() {
        return io.sentry.NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.ISpan
    public void setContext(java.lang.String str, java.lang.Object obj) {
    }

    @Override // io.sentry.ISpan
    public void setData(java.lang.String str, java.lang.Object obj) {
    }

    @Override // io.sentry.ISpan
    public void setDescription(java.lang.String str) {
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(java.lang.String str, java.lang.Number number) {
    }

    @Override // io.sentry.ISpan
    public void setOperation(java.lang.String str) {
    }

    @Override // io.sentry.ISpan
    public void setStatus(io.sentry.SpanStatus spanStatus) {
    }

    @Override // io.sentry.ISpan
    public void setTag(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.sentry.ISpan
    public void setThrowable(java.lang.Throwable th) {
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(java.lang.String str) {
        return getInstance();
    }

    @Override // io.sentry.ISpan
    public io.sentry.BaggageHeader toBaggageHeader(java.util.List<java.lang.String> list) {
        return null;
    }

    @Override // io.sentry.ISpan
    public io.sentry.SentryTraceHeader toSentryTrace() {
        return new io.sentry.SentryTraceHeader(io.sentry.protocol.SentryId.EMPTY_ID, io.sentry.SpanId.EMPTY_ID, java.lang.Boolean.FALSE);
    }

    @Override // io.sentry.ISpan
    public io.sentry.TraceContext traceContext() {
        return new io.sentry.TraceContext(io.sentry.protocol.SentryId.EMPTY_ID, "");
    }

    @Override // io.sentry.ISpan
    public boolean updateEndDate(io.sentry.SentryDate sentryDate) {
        return false;
    }

    @Override // io.sentry.ISpan
    public void finish(io.sentry.SpanStatus spanStatus) {
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(java.lang.String str, java.lang.Number number, io.sentry.MeasurementUnit measurementUnit) {
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2, io.sentry.SpanOptions spanOptions) {
        return getInstance();
    }

    @Override // io.sentry.ISpan
    public void finish(io.sentry.SpanStatus spanStatus, io.sentry.SentryDate sentryDate) {
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(io.sentry.SpanContext spanContext, io.sentry.SpanOptions spanOptions) {
        return getInstance();
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2, io.sentry.SentryDate sentryDate, io.sentry.Instrumenter instrumenter) {
        return getInstance();
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2, io.sentry.SentryDate sentryDate, io.sentry.Instrumenter instrumenter, io.sentry.SpanOptions spanOptions) {
        return getInstance();
    }

    @Override // io.sentry.ISpan
    public io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2) {
        return getInstance();
    }
}
