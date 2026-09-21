package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import java.util.List;

public final class NoOpScopes implements IScopes {
    private static final NoOpScopes instance = new NoOpScopes();
    private final SentryOptions emptyOptions = SentryOptions.empty();

    private NoOpScopes() {
    }

    public static NoOpScopes getInstance() {
        return instance;
    }

    @Override
    public void addBreadcrumb(Breadcrumb breadcrumb) {
    }

    @Override
    public void bindClient(ISentryClient iSentryClient) {
    }

    @Override
    public SentryId captureCheckIn(CheckIn checkIn) {
        return SentryId.EMPTY_ID;
    }

    @Override
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override
    public SentryId captureEvent(SentryEvent sentryEvent, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override
    public SentryId captureException(Throwable th, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override
    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return SentryId.EMPTY_ID;
    }

    @Override
    public SentryId captureReplay(SentryReplayEvent sentryReplayEvent, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override
    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint, ProfilingTraceData profilingTraceData) {
        return SentryId.EMPTY_ID;
    }

    @Override
    public void captureUserFeedback(UserFeedback userFeedback) {
    }

    @Override
    public void clearBreadcrumbs() {
    }

    @Override
    public void close() {
    }

    @Override
    public void configureScope(ScopeType scopeType, ScopeCallback scopeCallback) {
    }

    @Override
    public TransactionContext continueTrace(String str, List<String> list) {
        return null;
    }

    @Override
    public void endSession() {
    }

    @Override
    public void flush(long j) {
    }

    @Override
    public IScopes forkedCurrentScope(String str) {
        return getInstance();
    }

    @Override
    public IScopes forkedRootScopes(String str) {
        return getInstance();
    }

    @Override
    public IScopes forkedScopes(String str) {
        return getInstance();
    }

    @Override
    public BaggageHeader getBaggage() {
        return null;
    }

    @Override
    public IScope getGlobalScope() {
        return NoOpScope.getInstance();
    }

    @Override
    public IScope getIsolationScope() {
        return NoOpScope.getInstance();
    }

    @Override
    public SentryId getLastEventId() {
        return SentryId.EMPTY_ID;
    }

    @Override
    public SentryOptions getOptions() {
        return this.emptyOptions;
    }

    @Override
    public IScopes getParentScopes() {
        return null;
    }

    @Override
    public RateLimiter getRateLimiter() {
        return null;
    }

    @Override
    public IScope getScope() {
        return NoOpScope.getInstance();
    }

    @Override
    public ISpan getSpan() {
        return null;
    }

    @Override
    public SentryTraceHeader getTraceparent() {
        return null;
    }

    @Override
    public ITransaction getTransaction() {
        return null;
    }

    @Override
    public boolean isAncestorOf(IScopes iScopes) {
        return false;
    }

    @Override
    public Boolean isCrashedLastRun() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean isHealthy() {
        return true;
    }

    @Override
    public boolean isNoOp() {
        return true;
    }

    @Override
    public ISentryLifecycleToken makeCurrent() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override
    @Deprecated
    public void popScope() {
    }

    @Override
    public ISentryLifecycleToken pushIsolationScope() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override
    public ISentryLifecycleToken pushScope() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override
    public void removeExtra(String str) {
    }

    @Override
    public void removeTag(String str) {
    }

    @Override
    public void reportFullyDisplayed() {
    }

    @Override
    public void setActiveSpan(ISpan iSpan) {
    }

    @Override
    public void setExtra(String str, String str2) {
    }

    @Override
    public void setFingerprint(List<String> list) {
    }

    @Override
    public void setLevel(SentryLevel sentryLevel) {
    }

    @Override
    public void setSpanContext(Throwable th, ISpan iSpan, String str) {
    }

    @Override
    public void setTag(String str, String str2) {
    }

    @Override
    public void setTransaction(String str) {
    }

    @Override
    public void setUser(User user) {
    }

    @Override
    public void startSession() {
    }

    @Override
    public ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        return NoOpTransaction.getInstance();
    }

    @Override
    public void withIsolationScope(ScopeCallback scopeCallback) {
        scopeCallback.run(NoOpScope.getInstance());
    }

    @Override
    public void withScope(ScopeCallback scopeCallback) {
        scopeCallback.run(NoOpScope.getInstance());
    }

    @Override
    public void addBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
    }

    @Override
    public SentryId captureEvent(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override
    public SentryId captureException(Throwable th, Hint hint, ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override
    public SentryId captureMessage(String str, SentryLevel sentryLevel, ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override
    @Deprecated
    public IHub m506clone() {
        return NoOpHub.getInstance();
    }

    @Override
    public void close(boolean z6) {
    }
}
