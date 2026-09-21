package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ISpan {
    void finish();

    void finish(io.sentry.SpanStatus spanStatus);

    void finish(io.sentry.SpanStatus spanStatus, io.sentry.SentryDate sentryDate);

    io.sentry.protocol.Contexts getContexts();

    java.lang.Object getData(java.lang.String str);

    java.lang.String getDescription();

    io.sentry.SentryDate getFinishDate();

    java.lang.String getOperation();

    io.sentry.TracesSamplingDecision getSamplingDecision();

    io.sentry.SpanContext getSpanContext();

    io.sentry.SentryDate getStartDate();

    io.sentry.SpanStatus getStatus();

    java.lang.String getTag(java.lang.String str);

    java.lang.Throwable getThrowable();

    boolean isFinished();

    boolean isNoOp();

    java.lang.Boolean isSampled();

    io.sentry.ISentryLifecycleToken makeCurrent();

    void setContext(java.lang.String str, java.lang.Object obj);

    void setData(java.lang.String str, java.lang.Object obj);

    void setDescription(java.lang.String str);

    void setMeasurement(java.lang.String str, java.lang.Number number);

    void setMeasurement(java.lang.String str, java.lang.Number number, io.sentry.MeasurementUnit measurementUnit);

    void setOperation(java.lang.String str);

    void setStatus(io.sentry.SpanStatus spanStatus);

    void setTag(java.lang.String str, java.lang.String str2);

    void setThrowable(java.lang.Throwable th);

    io.sentry.ISpan startChild(io.sentry.SpanContext spanContext, io.sentry.SpanOptions spanOptions);

    io.sentry.ISpan startChild(java.lang.String str);

    io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2);

    io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2, io.sentry.SentryDate sentryDate, io.sentry.Instrumenter instrumenter);

    io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2, io.sentry.SentryDate sentryDate, io.sentry.Instrumenter instrumenter, io.sentry.SpanOptions spanOptions);

    io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2, io.sentry.SpanOptions spanOptions);

    io.sentry.BaggageHeader toBaggageHeader(java.util.List<java.lang.String> list);

    io.sentry.SentryTraceHeader toSentryTrace();

    io.sentry.TraceContext traceContext();

    boolean updateEndDate(io.sentry.SentryDate sentryDate);
}
