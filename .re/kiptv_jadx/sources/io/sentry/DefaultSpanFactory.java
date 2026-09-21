package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultSpanFactory implements io.sentry.ISpanFactory {
    @Override // io.sentry.ISpanFactory
    public io.sentry.ISpan createSpan(io.sentry.IScopes iScopes, io.sentry.SpanOptions spanOptions, io.sentry.SpanContext spanContext, io.sentry.ISpan iSpan) {
        return io.sentry.NoOpSpan.getInstance();
    }

    @Override // io.sentry.ISpanFactory
    public io.sentry.ITransaction createTransaction(io.sentry.TransactionContext transactionContext, io.sentry.IScopes iScopes, io.sentry.TransactionOptions transactionOptions, io.sentry.TransactionPerformanceCollector transactionPerformanceCollector) {
        return new io.sentry.SentryTracer(transactionContext, iScopes, transactionOptions, transactionPerformanceCollector);
    }
}
