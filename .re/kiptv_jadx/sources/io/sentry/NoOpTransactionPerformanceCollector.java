package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpTransactionPerformanceCollector implements io.sentry.TransactionPerformanceCollector {
    private static final io.sentry.NoOpTransactionPerformanceCollector instance = new io.sentry.NoOpTransactionPerformanceCollector();

    private NoOpTransactionPerformanceCollector() {
    }

    public static io.sentry.NoOpTransactionPerformanceCollector getInstance() {
        return instance;
    }

    @Override // io.sentry.TransactionPerformanceCollector
    public void close() {
    }

    @Override // io.sentry.TransactionPerformanceCollector
    public void onSpanFinished(io.sentry.ISpan iSpan) {
    }

    @Override // io.sentry.TransactionPerformanceCollector
    public void onSpanStarted(io.sentry.ISpan iSpan) {
    }

    @Override // io.sentry.TransactionPerformanceCollector
    public void start(io.sentry.ITransaction iTransaction) {
    }

    @Override // io.sentry.TransactionPerformanceCollector
    public java.util.List<io.sentry.PerformanceCollectionData> stop(io.sentry.ITransaction iTransaction) {
        return null;
    }
}
