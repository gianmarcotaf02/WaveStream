package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface IPerformanceContinuousCollector extends io.sentry.IPerformanceCollector {
    void clear();

    void onSpanFinished(io.sentry.ISpan iSpan);

    void onSpanStarted(io.sentry.ISpan iSpan);
}
