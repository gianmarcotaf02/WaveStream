package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface ITransaction extends io.sentry.ISpan {
    void finish(io.sentry.SpanStatus spanStatus, io.sentry.SentryDate sentryDate, boolean z6, io.sentry.Hint hint);

    void forceFinish(io.sentry.SpanStatus spanStatus, boolean z6, io.sentry.Hint hint);

    io.sentry.protocol.SentryId getEventId();

    io.sentry.ISpan getLatestActiveSpan();

    java.lang.String getName();

    java.util.List<io.sentry.Span> getSpans();

    io.sentry.protocol.TransactionNameSource getTransactionNameSource();

    java.lang.Boolean isProfileSampled();

    void scheduleFinish();

    void setName(java.lang.String str);

    void setName(java.lang.String str, io.sentry.protocol.TransactionNameSource transactionNameSource);

    io.sentry.ISpan startChild(java.lang.String str, java.lang.String str2, io.sentry.SentryDate sentryDate);
}
