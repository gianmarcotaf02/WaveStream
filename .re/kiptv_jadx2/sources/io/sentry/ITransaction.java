package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import java.util.List;

public interface ITransaction extends ISpan {
    void finish(SpanStatus spanStatus, SentryDate sentryDate, boolean z6, Hint hint);

    void forceFinish(SpanStatus spanStatus, boolean z6, Hint hint);

    SentryId getEventId();

    ISpan getLatestActiveSpan();

    String getName();

    List<Span> getSpans();

    TransactionNameSource getTransactionNameSource();

    Boolean isProfileSampled();

    void scheduleFinish();

    void setName(String str);

    void setName(String str, TransactionNameSource transactionNameSource);

    ISpan startChild(String str, String str2, SentryDate sentryDate);
}
