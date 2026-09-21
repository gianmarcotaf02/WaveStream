package io.sentry;

import java.util.List;

public final class NoOpTransactionPerformanceCollector implements TransactionPerformanceCollector {
    private static final NoOpTransactionPerformanceCollector instance = new NoOpTransactionPerformanceCollector();

    private NoOpTransactionPerformanceCollector() {
    }

    public static NoOpTransactionPerformanceCollector getInstance() {
        return instance;
    }

    @Override
    public void close() {
    }

    @Override
    public void onSpanFinished(ISpan iSpan) {
    }

    @Override
    public void onSpanStarted(ISpan iSpan) {
    }

    @Override
    public void start(ITransaction iTransaction) {
    }

    @Override
    public List<PerformanceCollectionData> stop(ITransaction iTransaction) {
        return null;
    }
}
