package io.sentry;

public final class DefaultSpanFactory implements ISpanFactory {
    @Override
    public ISpan createSpan(IScopes iScopes, SpanOptions spanOptions, SpanContext spanContext, ISpan iSpan) {
        return NoOpSpan.getInstance();
    }

    @Override
    public ITransaction createTransaction(TransactionContext transactionContext, IScopes iScopes, TransactionOptions transactionOptions, TransactionPerformanceCollector transactionPerformanceCollector) {
        return new SentryTracer(transactionContext, iScopes, transactionOptions, transactionPerformanceCollector);
    }
}
