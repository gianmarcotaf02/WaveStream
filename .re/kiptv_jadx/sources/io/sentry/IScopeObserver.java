package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface IScopeObserver {
    void addBreadcrumb(io.sentry.Breadcrumb breadcrumb);

    void removeExtra(java.lang.String str);

    void removeTag(java.lang.String str);

    void setBreadcrumbs(java.util.Collection<io.sentry.Breadcrumb> collection);

    void setContexts(io.sentry.protocol.Contexts contexts);

    void setExtra(java.lang.String str, java.lang.String str2);

    void setExtras(java.util.Map<java.lang.String, java.lang.Object> map);

    void setFingerprint(java.util.Collection<java.lang.String> collection);

    void setLevel(io.sentry.SentryLevel sentryLevel);

    void setReplayId(io.sentry.protocol.SentryId sentryId);

    void setRequest(io.sentry.protocol.Request request);

    void setTag(java.lang.String str, java.lang.String str2);

    void setTags(java.util.Map<java.lang.String, java.lang.String> map);

    void setTrace(io.sentry.SpanContext spanContext, io.sentry.IScope iScope);

    void setTransaction(java.lang.String str);

    void setUser(io.sentry.protocol.User user);
}
