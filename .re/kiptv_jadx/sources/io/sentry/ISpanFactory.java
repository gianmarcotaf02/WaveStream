package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ISpanFactory {
    io.sentry.ISpan createSpan(io.sentry.IScopes iScopes, io.sentry.SpanOptions spanOptions, io.sentry.SpanContext spanContext, io.sentry.ISpan iSpan);

    io.sentry.ITransaction createTransaction(io.sentry.TransactionContext transactionContext, io.sentry.IScopes iScopes, io.sentry.TransactionOptions transactionOptions, io.sentry.TransactionPerformanceCollector transactionPerformanceCollector);
}
