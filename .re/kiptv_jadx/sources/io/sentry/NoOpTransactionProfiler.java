package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpTransactionProfiler implements io.sentry.ITransactionProfiler {
    private static final io.sentry.NoOpTransactionProfiler instance = new io.sentry.NoOpTransactionProfiler();

    private NoOpTransactionProfiler() {
    }

    public static io.sentry.NoOpTransactionProfiler getInstance() {
        return instance;
    }

    @Override // io.sentry.ITransactionProfiler
    public void bindTransaction(io.sentry.ITransaction iTransaction) {
    }

    @Override // io.sentry.ITransactionProfiler
    public void close() {
    }

    @Override // io.sentry.ITransactionProfiler
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.ITransactionProfiler
    public io.sentry.ProfilingTraceData onTransactionFinish(io.sentry.ITransaction iTransaction, java.util.List<io.sentry.PerformanceCollectionData> list, io.sentry.SentryOptions sentryOptions) {
        return null;
    }

    @Override // io.sentry.ITransactionProfiler
    public void start() {
    }
}
