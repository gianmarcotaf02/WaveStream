package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ITransactionProfiler {
    void bindTransaction(io.sentry.ITransaction iTransaction);

    void close();

    boolean isRunning();

    io.sentry.ProfilingTraceData onTransactionFinish(io.sentry.ITransaction iTransaction, java.util.List<io.sentry.PerformanceCollectionData> list, io.sentry.SentryOptions sentryOptions);

    void start();
}
