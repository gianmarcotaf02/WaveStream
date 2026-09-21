package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface TransactionPerformanceCollector {
    void close();

    void onSpanFinished(io.sentry.ISpan iSpan);

    void onSpanStarted(io.sentry.ISpan iSpan);

    void start(io.sentry.ITransaction iTransaction);

    java.util.List<io.sentry.PerformanceCollectionData> stop(io.sentry.ITransaction iTransaction);
}
