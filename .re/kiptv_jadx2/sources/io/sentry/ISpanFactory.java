package io.sentry;

public interface ISpanFactory {
    ISpan createSpan(IScopes iScopes, SpanOptions spanOptions, SpanContext spanContext, ISpan iSpan);

    ITransaction createTransaction(TransactionContext transactionContext, IScopes iScopes, TransactionOptions transactionOptions, TransactionPerformanceCollector transactionPerformanceCollector);
}
