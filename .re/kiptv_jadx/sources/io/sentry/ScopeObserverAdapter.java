package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ScopeObserverAdapter implements io.sentry.IScopeObserver {
    @Override // io.sentry.IScopeObserver
    public void addBreadcrumb(io.sentry.Breadcrumb breadcrumb) {
    }

    @Override // io.sentry.IScopeObserver
    public void removeExtra(java.lang.String str) {
    }

    @Override // io.sentry.IScopeObserver
    public void removeTag(java.lang.String str) {
    }

    @Override // io.sentry.IScopeObserver
    public void setBreadcrumbs(java.util.Collection<io.sentry.Breadcrumb> collection) {
    }

    @Override // io.sentry.IScopeObserver
    public void setContexts(io.sentry.protocol.Contexts contexts) {
    }

    @Override // io.sentry.IScopeObserver
    public void setExtra(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.sentry.IScopeObserver
    public void setExtras(java.util.Map<java.lang.String, java.lang.Object> map) {
    }

    @Override // io.sentry.IScopeObserver
    public void setFingerprint(java.util.Collection<java.lang.String> collection) {
    }

    @Override // io.sentry.IScopeObserver
    public void setLevel(io.sentry.SentryLevel sentryLevel) {
    }

    @Override // io.sentry.IScopeObserver
    public void setReplayId(io.sentry.protocol.SentryId sentryId) {
    }

    @Override // io.sentry.IScopeObserver
    public void setRequest(io.sentry.protocol.Request request) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTag(java.lang.String str, java.lang.String str2) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTags(java.util.Map<java.lang.String, java.lang.String> map) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTrace(io.sentry.SpanContext spanContext, io.sentry.IScope iScope) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTransaction(java.lang.String str) {
    }

    @Override // io.sentry.IScopeObserver
    public void setUser(io.sentry.protocol.User user) {
    }
}
