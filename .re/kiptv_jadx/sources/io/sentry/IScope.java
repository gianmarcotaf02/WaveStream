package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public interface IScope {
    void addAttachment(io.sentry.Attachment attachment);

    void addBreadcrumb(io.sentry.Breadcrumb breadcrumb);

    void addBreadcrumb(io.sentry.Breadcrumb breadcrumb, io.sentry.Hint hint);

    void addEventProcessor(io.sentry.EventProcessor eventProcessor);

    void assignTraceContext(io.sentry.SentryEvent sentryEvent);

    void bindClient(io.sentry.ISentryClient iSentryClient);

    void clear();

    void clearAttachments();

    void clearBreadcrumbs();

    void clearSession();

    void clearTransaction();

    /* JADX INFO: renamed from: clone */
    io.sentry.IScope m507clone();

    io.sentry.Session endSession();

    java.util.List<io.sentry.Attachment> getAttachments();

    java.util.Queue<io.sentry.Breadcrumb> getBreadcrumbs();

    io.sentry.ISentryClient getClient();

    io.sentry.protocol.Contexts getContexts();

    java.util.List<io.sentry.EventProcessor> getEventProcessors();

    java.util.List<io.sentry.internal.eventprocessor.EventProcessorAndOrder> getEventProcessorsWithOrder();

    java.util.Map<java.lang.String, java.lang.Object> getExtras();

    java.util.List<java.lang.String> getFingerprint();

    io.sentry.protocol.SentryId getLastEventId();

    io.sentry.SentryLevel getLevel();

    io.sentry.SentryOptions getOptions();

    io.sentry.PropagationContext getPropagationContext();

    io.sentry.protocol.SentryId getReplayId();

    io.sentry.protocol.Request getRequest();

    java.lang.String getScreen();

    io.sentry.Session getSession();

    io.sentry.ISpan getSpan();

    java.util.Map<java.lang.String, java.lang.String> getTags();

    io.sentry.ITransaction getTransaction();

    java.lang.String getTransactionName();

    io.sentry.protocol.User getUser();

    void removeContexts(java.lang.String str);

    void removeExtra(java.lang.String str);

    void removeTag(java.lang.String str);

    void replaceOptions(io.sentry.SentryOptions sentryOptions);

    void setActiveSpan(io.sentry.ISpan iSpan);

    void setContexts(java.lang.String str, java.lang.Boolean bool);

    void setContexts(java.lang.String str, java.lang.Character ch);

    void setContexts(java.lang.String str, java.lang.Number number);

    void setContexts(java.lang.String str, java.lang.Object obj);

    void setContexts(java.lang.String str, java.lang.String str2);

    void setContexts(java.lang.String str, java.util.Collection<?> collection);

    void setContexts(java.lang.String str, java.lang.Object[] objArr);

    void setExtra(java.lang.String str, java.lang.String str2);

    void setFingerprint(java.util.List<java.lang.String> list);

    void setLastEventId(io.sentry.protocol.SentryId sentryId);

    void setLevel(io.sentry.SentryLevel sentryLevel);

    void setPropagationContext(io.sentry.PropagationContext propagationContext);

    void setReplayId(io.sentry.protocol.SentryId sentryId);

    void setRequest(io.sentry.protocol.Request request);

    void setScreen(java.lang.String str);

    void setSpanContext(java.lang.Throwable th, io.sentry.ISpan iSpan, java.lang.String str);

    void setTag(java.lang.String str, java.lang.String str2);

    void setTransaction(io.sentry.ITransaction iTransaction);

    void setTransaction(java.lang.String str);

    void setUser(io.sentry.protocol.User user);

    io.sentry.Scope.SessionPair startSession();

    io.sentry.PropagationContext withPropagationContext(io.sentry.Scope.IWithPropagationContext iWithPropagationContext);

    io.sentry.Session withSession(io.sentry.Scope.IWithSession iWithSession);

    void withTransaction(io.sentry.Scope.IWithTransaction iWithTransaction);
}
