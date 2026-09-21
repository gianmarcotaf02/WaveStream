package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface IScopes {
    void addBreadcrumb(io.sentry.Breadcrumb breadcrumb);

    void addBreadcrumb(io.sentry.Breadcrumb breadcrumb, io.sentry.Hint hint);

    default void addBreadcrumb(java.lang.String str) {
        addBreadcrumb(new io.sentry.Breadcrumb(str));
    }

    void bindClient(io.sentry.ISentryClient iSentryClient);

    io.sentry.protocol.SentryId captureCheckIn(io.sentry.CheckIn checkIn);

    default io.sentry.protocol.SentryId captureEnvelope(io.sentry.SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, new io.sentry.Hint());
    }

    io.sentry.protocol.SentryId captureEnvelope(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint);

    default io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, new io.sentry.Hint());
    }

    io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint);

    io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint, io.sentry.ScopeCallback scopeCallback);

    default io.sentry.protocol.SentryId captureException(java.lang.Throwable th) {
        return captureException(th, new io.sentry.Hint());
    }

    io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.Hint hint);

    io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.Hint hint, io.sentry.ScopeCallback scopeCallback);

    default io.sentry.protocol.SentryId captureMessage(java.lang.String str) {
        return captureMessage(str, io.sentry.SentryLevel.INFO);
    }

    io.sentry.protocol.SentryId captureMessage(java.lang.String str, io.sentry.SentryLevel sentryLevel);

    io.sentry.protocol.SentryId captureMessage(java.lang.String str, io.sentry.SentryLevel sentryLevel, io.sentry.ScopeCallback scopeCallback);

    io.sentry.protocol.SentryId captureReplay(io.sentry.SentryReplayEvent sentryReplayEvent, io.sentry.Hint hint);

    default io.sentry.protocol.SentryId captureTransaction(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.TraceContext traceContext, io.sentry.Hint hint) {
        return captureTransaction(sentryTransaction, traceContext, hint, null);
    }

    io.sentry.protocol.SentryId captureTransaction(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.TraceContext traceContext, io.sentry.Hint hint, io.sentry.ProfilingTraceData profilingTraceData);

    void captureUserFeedback(io.sentry.UserFeedback userFeedback);

    void clearBreadcrumbs();

    @java.lang.Deprecated
    /* JADX INFO: renamed from: clone */
    io.sentry.IHub m508clone();

    void close();

    void close(boolean z6);

    default void configureScope(io.sentry.ScopeCallback scopeCallback) {
        configureScope(null, scopeCallback);
    }

    void configureScope(io.sentry.ScopeType scopeType, io.sentry.ScopeCallback scopeCallback);

    io.sentry.TransactionContext continueTrace(java.lang.String str, java.util.List<java.lang.String> list);

    void endSession();

    void flush(long j);

    io.sentry.IScopes forkedCurrentScope(java.lang.String str);

    io.sentry.IScopes forkedRootScopes(java.lang.String str);

    io.sentry.IScopes forkedScopes(java.lang.String str);

    io.sentry.BaggageHeader getBaggage();

    io.sentry.IScope getGlobalScope();

    io.sentry.IScope getIsolationScope();

    io.sentry.protocol.SentryId getLastEventId();

    io.sentry.SentryOptions getOptions();

    io.sentry.IScopes getParentScopes();

    io.sentry.transport.RateLimiter getRateLimiter();

    io.sentry.IScope getScope();

    io.sentry.ISpan getSpan();

    io.sentry.SentryTraceHeader getTraceparent();

    io.sentry.ITransaction getTransaction();

    boolean isAncestorOf(io.sentry.IScopes iScopes);

    java.lang.Boolean isCrashedLastRun();

    boolean isEnabled();

    boolean isHealthy();

    default boolean isNoOp() {
        return false;
    }

    io.sentry.ISentryLifecycleToken makeCurrent();

    @java.lang.Deprecated
    void popScope();

    io.sentry.ISentryLifecycleToken pushIsolationScope();

    io.sentry.ISentryLifecycleToken pushScope();

    void removeExtra(java.lang.String str);

    void removeTag(java.lang.String str);

    void reportFullyDisplayed();

    void setActiveSpan(io.sentry.ISpan iSpan);

    void setExtra(java.lang.String str, java.lang.String str2);

    void setFingerprint(java.util.List<java.lang.String> list);

    void setLevel(io.sentry.SentryLevel sentryLevel);

    void setSpanContext(java.lang.Throwable th, io.sentry.ISpan iSpan, java.lang.String str);

    void setTag(java.lang.String str, java.lang.String str2);

    void setTransaction(java.lang.String str);

    void setUser(io.sentry.protocol.User user);

    void startSession();

    default io.sentry.ITransaction startTransaction(io.sentry.TransactionContext transactionContext) {
        return startTransaction(transactionContext, new io.sentry.TransactionOptions());
    }

    io.sentry.ITransaction startTransaction(io.sentry.TransactionContext transactionContext, io.sentry.TransactionOptions transactionOptions);

    void withIsolationScope(io.sentry.ScopeCallback scopeCallback);

    void withScope(io.sentry.ScopeCallback scopeCallback);

    default void addBreadcrumb(java.lang.String str, java.lang.String str2) {
        io.sentry.Breadcrumb breadcrumb = new io.sentry.Breadcrumb(str);
        breadcrumb.setCategory(str2);
        addBreadcrumb(breadcrumb);
    }

    default io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.ScopeCallback scopeCallback) {
        return captureEvent(sentryEvent, new io.sentry.Hint(), scopeCallback);
    }

    default io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.ScopeCallback scopeCallback) {
        return captureException(th, new io.sentry.Hint(), scopeCallback);
    }

    default io.sentry.protocol.SentryId captureMessage(java.lang.String str, io.sentry.ScopeCallback scopeCallback) {
        return captureMessage(str, io.sentry.SentryLevel.INFO, scopeCallback);
    }

    default io.sentry.protocol.SentryId captureTransaction(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.Hint hint) {
        return captureTransaction(sentryTransaction, null, hint);
    }

    default io.sentry.ITransaction startTransaction(java.lang.String str, java.lang.String str2) {
        return startTransaction(str, str2, new io.sentry.TransactionOptions());
    }

    default io.sentry.protocol.SentryId captureTransaction(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.TraceContext traceContext) {
        return captureTransaction(sentryTransaction, traceContext, null);
    }

    default io.sentry.ITransaction startTransaction(java.lang.String str, java.lang.String str2, io.sentry.TransactionOptions transactionOptions) {
        return startTransaction(new io.sentry.TransactionContext(str, str2), transactionOptions);
    }
}
