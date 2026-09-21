package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpScopes implements io.sentry.IScopes {
    private static final io.sentry.NoOpScopes instance = new io.sentry.NoOpScopes();
    private final io.sentry.SentryOptions emptyOptions = io.sentry.SentryOptions.empty();

    private NoOpScopes() {
    }

    public static io.sentry.NoOpScopes getInstance() {
        return instance;
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(io.sentry.Breadcrumb breadcrumb) {
    }

    @Override // io.sentry.IScopes
    public void bindClient(io.sentry.ISentryClient iSentryClient) {
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId captureCheckIn(io.sentry.CheckIn checkIn) {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId captureEnvelope(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint) {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint) {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.Hint hint) {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId captureMessage(java.lang.String str, io.sentry.SentryLevel sentryLevel) {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId captureReplay(io.sentry.SentryReplayEvent sentryReplayEvent, io.sentry.Hint hint) {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId captureTransaction(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.TraceContext traceContext, io.sentry.Hint hint, io.sentry.ProfilingTraceData profilingTraceData) {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public void captureUserFeedback(io.sentry.UserFeedback userFeedback) {
    }

    @Override // io.sentry.IScopes
    public void clearBreadcrumbs() {
    }

    @Override // io.sentry.IScopes
    public void close() {
    }

    @Override // io.sentry.IScopes
    public void configureScope(io.sentry.ScopeType scopeType, io.sentry.ScopeCallback scopeCallback) {
    }

    @Override // io.sentry.IScopes
    public io.sentry.TransactionContext continueTrace(java.lang.String str, java.util.List<java.lang.String> list) {
        return null;
    }

    @Override // io.sentry.IScopes
    public void endSession() {
    }

    @Override // io.sentry.IScopes
    public void flush(long j) {
    }

    @Override // io.sentry.IScopes
    public io.sentry.IScopes forkedCurrentScope(java.lang.String str) {
        return getInstance();
    }

    @Override // io.sentry.IScopes
    public io.sentry.IScopes forkedRootScopes(java.lang.String str) {
        return getInstance();
    }

    @Override // io.sentry.IScopes
    public io.sentry.IScopes forkedScopes(java.lang.String str) {
        return getInstance();
    }

    @Override // io.sentry.IScopes
    public io.sentry.BaggageHeader getBaggage() {
        return null;
    }

    @Override // io.sentry.IScopes
    public io.sentry.IScope getGlobalScope() {
        return io.sentry.NoOpScope.getInstance();
    }

    @Override // io.sentry.IScopes
    public io.sentry.IScope getIsolationScope() {
        return io.sentry.NoOpScope.getInstance();
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId getLastEventId() {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public io.sentry.SentryOptions getOptions() {
        return this.emptyOptions;
    }

    @Override // io.sentry.IScopes
    public io.sentry.IScopes getParentScopes() {
        return null;
    }

    @Override // io.sentry.IScopes
    public io.sentry.transport.RateLimiter getRateLimiter() {
        return null;
    }

    @Override // io.sentry.IScopes
    public io.sentry.IScope getScope() {
        return io.sentry.NoOpScope.getInstance();
    }

    @Override // io.sentry.IScopes
    public io.sentry.ISpan getSpan() {
        return null;
    }

    @Override // io.sentry.IScopes
    public io.sentry.SentryTraceHeader getTraceparent() {
        return null;
    }

    @Override // io.sentry.IScopes
    public io.sentry.ITransaction getTransaction() {
        return null;
    }

    @Override // io.sentry.IScopes
    public boolean isAncestorOf(io.sentry.IScopes iScopes) {
        return false;
    }

    @Override // io.sentry.IScopes
    public java.lang.Boolean isCrashedLastRun() {
        return null;
    }

    @Override // io.sentry.IScopes
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.IScopes
    public boolean isHealthy() {
        return true;
    }

    @Override // io.sentry.IScopes
    public boolean isNoOp() {
        return true;
    }

    @Override // io.sentry.IScopes
    public io.sentry.ISentryLifecycleToken makeCurrent() {
        return io.sentry.NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    @java.lang.Deprecated
    public void popScope() {
    }

    @Override // io.sentry.IScopes
    public io.sentry.ISentryLifecycleToken pushIsolationScope() {
        return io.sentry.NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    public io.sentry.ISentryLifecycleToken pushScope() {
        return io.sentry.NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    public void removeExtra(java.lang.String str) {
    }

    @Override // io.sentry.IScopes
    public void removeTag(java.lang.String str) {
    }

    @Override // io.sentry.IScopes
    public void reportFullyDisplayed() {
    }

    @Override // io.sentry.IScopes
    public void setActiveSpan(io.sentry.ISpan iSpan) {
    }

    @Override // io.sentry.IScopes
    public void setExtra(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.sentry.IScopes
    public void setFingerprint(java.util.List<java.lang.String> list) {
    }

    @Override // io.sentry.IScopes
    public void setLevel(io.sentry.SentryLevel sentryLevel) {
    }

    @Override // io.sentry.IScopes
    public void setSpanContext(java.lang.Throwable th, io.sentry.ISpan iSpan, java.lang.String str) {
    }

    @Override // io.sentry.IScopes
    public void setTag(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.sentry.IScopes
    public void setTransaction(java.lang.String str) {
    }

    @Override // io.sentry.IScopes
    public void setUser(io.sentry.protocol.User user) {
    }

    @Override // io.sentry.IScopes
    public void startSession() {
    }

    @Override // io.sentry.IScopes
    public io.sentry.ITransaction startTransaction(io.sentry.TransactionContext transactionContext, io.sentry.TransactionOptions transactionOptions) {
        return io.sentry.NoOpTransaction.getInstance();
    }

    @Override // io.sentry.IScopes
    public void withIsolationScope(io.sentry.ScopeCallback scopeCallback) {
        scopeCallback.run(io.sentry.NoOpScope.getInstance());
    }

    @Override // io.sentry.IScopes
    public void withScope(io.sentry.ScopeCallback scopeCallback) {
        scopeCallback.run(io.sentry.NoOpScope.getInstance());
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(io.sentry.Breadcrumb breadcrumb, io.sentry.Hint hint) {
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint, io.sentry.ScopeCallback scopeCallback) {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.Hint hint, io.sentry.ScopeCallback scopeCallback) {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public io.sentry.protocol.SentryId captureMessage(java.lang.String str, io.sentry.SentryLevel sentryLevel, io.sentry.ScopeCallback scopeCallback) {
        return io.sentry.protocol.SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @java.lang.Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public io.sentry.IHub m506clone() {
        return io.sentry.NoOpHub.getInstance();
    }

    @Override // io.sentry.IScopes
    public void close(boolean z6) {
    }
}
