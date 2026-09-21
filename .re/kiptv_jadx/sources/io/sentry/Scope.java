package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class Scope implements io.sentry.IScope {
    private java.lang.ref.WeakReference<io.sentry.ISpan> activeSpan;
    private java.util.List<io.sentry.Attachment> attachments;
    private volatile java.util.Queue<io.sentry.Breadcrumb> breadcrumbs;
    private io.sentry.ISentryClient client;
    private io.sentry.protocol.Contexts contexts;
    private java.util.List<io.sentry.internal.eventprocessor.EventProcessorAndOrder> eventProcessors;
    private java.util.Map<java.lang.String, java.lang.Object> extra;
    private java.util.List<java.lang.String> fingerprint;
    private volatile io.sentry.protocol.SentryId lastEventId;
    private io.sentry.SentryLevel level;
    private volatile io.sentry.SentryOptions options;
    private io.sentry.PropagationContext propagationContext;
    private final io.sentry.util.AutoClosableReentrantLock propagationContextLock;
    private io.sentry.protocol.SentryId replayId;
    private io.sentry.protocol.Request request;
    private java.lang.String screen;
    private volatile io.sentry.Session session;
    private final io.sentry.util.AutoClosableReentrantLock sessionLock;
    private java.util.Map<java.lang.String, java.lang.String> tags;
    private final java.util.Map<java.lang.Throwable, io.sentry.util.Pair<java.lang.ref.WeakReference<io.sentry.ISpan>, java.lang.String>> throwableToSpan;
    private io.sentry.ITransaction transaction;
    private final io.sentry.util.AutoClosableReentrantLock transactionLock;
    private java.lang.String transactionName;
    private io.sentry.protocol.User user;

    public interface IWithPropagationContext {
        void accept(io.sentry.PropagationContext propagationContext);
    }

    public interface IWithSession {
        void accept(io.sentry.Session session);
    }

    public interface IWithTransaction {
        void accept(io.sentry.ITransaction iTransaction);
    }

    public static final class SessionPair {
        private final io.sentry.Session current;
        private final io.sentry.Session previous;

        public SessionPair(io.sentry.Session session, io.sentry.Session session2) {
            this.current = session;
            this.previous = session2;
        }

        public io.sentry.Session getCurrent() {
            return this.current;
        }

        public io.sentry.Session getPrevious() {
            return this.previous;
        }
    }

    public Scope(io.sentry.SentryOptions sentryOptions) {
        this.activeSpan = new java.lang.ref.WeakReference<>(null);
        this.fingerprint = new java.util.ArrayList();
        this.tags = new java.util.concurrent.ConcurrentHashMap();
        this.extra = new java.util.concurrent.ConcurrentHashMap();
        this.eventProcessors = new java.util.concurrent.CopyOnWriteArrayList();
        this.sessionLock = new io.sentry.util.AutoClosableReentrantLock();
        this.transactionLock = new io.sentry.util.AutoClosableReentrantLock();
        this.propagationContextLock = new io.sentry.util.AutoClosableReentrantLock();
        this.contexts = new io.sentry.protocol.Contexts();
        this.attachments = new java.util.concurrent.CopyOnWriteArrayList();
        io.sentry.protocol.SentryId sentryId = io.sentry.protocol.SentryId.EMPTY_ID;
        this.replayId = sentryId;
        this.client = io.sentry.NoOpSentryClient.getInstance();
        this.throwableToSpan = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
        this.options = (io.sentry.SentryOptions) io.sentry.util.Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.breadcrumbs = createBreadcrumbsList(this.options.getMaxBreadcrumbs());
        this.propagationContext = new io.sentry.PropagationContext();
        this.lastEventId = sentryId;
    }

    public static java.util.Queue<io.sentry.Breadcrumb> createBreadcrumbsList(int i3) {
        return i3 > 0 ? io.sentry.SynchronizedQueue.synchronizedQueue(new io.sentry.CircularFifoQueue(i3)) : io.sentry.SynchronizedQueue.synchronizedQueue(new io.sentry.DisabledQueue());
    }

    private io.sentry.Breadcrumb executeBeforeBreadcrumb(io.sentry.SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback, io.sentry.Breadcrumb breadcrumb, io.sentry.Hint hint) {
        try {
            return beforeBreadcrumbCallback.execute(breadcrumb, hint);
        } catch (java.lang.Throwable th) {
            this.options.getLogger().log(io.sentry.SentryLevel.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
            if (th.getMessage() != null) {
                breadcrumb.setData("sentry:message", th.getMessage());
            }
            return breadcrumb;
        }
    }

    @Override // io.sentry.IScope
    public void addAttachment(io.sentry.Attachment attachment) {
        this.attachments.add(attachment);
    }

    @Override // io.sentry.IScope
    public void addBreadcrumb(io.sentry.Breadcrumb breadcrumb, io.sentry.Hint hint) {
        if (breadcrumb == null) {
            return;
        }
        if (hint == null) {
            hint = new io.sentry.Hint();
        }
        io.sentry.SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumb = this.options.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            breadcrumb = executeBeforeBreadcrumb(beforeBreadcrumb, breadcrumb, hint);
        }
        if (breadcrumb == null) {
            this.options.getLogger().log(io.sentry.SentryLevel.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new java.lang.Object[0]);
            return;
        }
        this.breadcrumbs.add(breadcrumb);
        for (io.sentry.IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.addBreadcrumb(breadcrumb);
            iScopeObserver.setBreadcrumbs(this.breadcrumbs);
        }
    }

    @Override // io.sentry.IScope
    public void addEventProcessor(io.sentry.EventProcessor eventProcessor) {
        this.eventProcessors.add(new io.sentry.internal.eventprocessor.EventProcessorAndOrder(eventProcessor, eventProcessor.getOrder()));
    }

    @Override // io.sentry.IScope
    public void assignTraceContext(io.sentry.SentryEvent sentryEvent) {
        io.sentry.util.Pair<java.lang.ref.WeakReference<io.sentry.ISpan>, java.lang.String> pair;
        io.sentry.ISpan iSpan;
        if (!this.options.isTracingEnabled() || sentryEvent.getThrowable() == null || (pair = this.throwableToSpan.get(io.sentry.util.ExceptionUtils.findRootCause(sentryEvent.getThrowable()))) == null) {
            return;
        }
        java.lang.ref.WeakReference<io.sentry.ISpan> first = pair.getFirst();
        if (sentryEvent.getContexts().getTrace() == null && first != null && (iSpan = first.get()) != null) {
            sentryEvent.getContexts().setTrace(iSpan.getSpanContext());
        }
        java.lang.String second = pair.getSecond();
        if (sentryEvent.getTransaction() != null || second == null) {
            return;
        }
        sentryEvent.setTransaction(second);
    }

    @Override // io.sentry.IScope
    public void bindClient(io.sentry.ISentryClient iSentryClient) {
        this.client = iSentryClient;
    }

    @Override // io.sentry.IScope
    public void clear() {
        this.level = null;
        this.user = null;
        this.request = null;
        this.screen = null;
        this.fingerprint.clear();
        clearBreadcrumbs();
        this.tags.clear();
        this.extra.clear();
        this.eventProcessors.clear();
        clearTransaction();
        clearAttachments();
    }

    @Override // io.sentry.IScope
    public void clearAttachments() {
        this.attachments.clear();
    }

    @Override // io.sentry.IScope
    public void clearBreadcrumbs() {
        this.breadcrumbs.clear();
        java.util.Iterator<io.sentry.IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setBreadcrumbs(this.breadcrumbs);
        }
    }

    @Override // io.sentry.IScope
    public void clearSession() {
        this.session = null;
    }

    @Override // io.sentry.IScope
    public void clearTransaction() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.transactionLock.acquire();
        try {
            this.transaction = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            this.transactionName = null;
            for (io.sentry.IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                iScopeObserver.setTransaction(null);
                iScopeObserver.setTrace(null, this);
            }
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public io.sentry.Session endSession() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        try {
            io.sentry.Session session = null;
            if (this.session != null) {
                this.session.end();
                io.sentry.Session sessionM510clone = this.session.m510clone();
                this.session = null;
                session = sessionM510clone;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return session;
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public java.util.List<io.sentry.Attachment> getAttachments() {
        return new java.util.concurrent.CopyOnWriteArrayList(this.attachments);
    }

    @Override // io.sentry.IScope
    public java.util.Queue<io.sentry.Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    @Override // io.sentry.IScope
    public io.sentry.ISentryClient getClient() {
        return this.client;
    }

    @Override // io.sentry.IScope
    public io.sentry.protocol.Contexts getContexts() {
        return this.contexts;
    }

    @Override // io.sentry.IScope
    public java.util.List<io.sentry.EventProcessor> getEventProcessors() {
        return io.sentry.util.EventProcessorUtils.unwrap(this.eventProcessors);
    }

    @Override // io.sentry.IScope
    public java.util.List<io.sentry.internal.eventprocessor.EventProcessorAndOrder> getEventProcessorsWithOrder() {
        return this.eventProcessors;
    }

    @Override // io.sentry.IScope
    public java.util.Map<java.lang.String, java.lang.Object> getExtras() {
        return this.extra;
    }

    @Override // io.sentry.IScope
    public java.util.List<java.lang.String> getFingerprint() {
        return this.fingerprint;
    }

    @Override // io.sentry.IScope
    public io.sentry.protocol.SentryId getLastEventId() {
        return this.lastEventId;
    }

    @Override // io.sentry.IScope
    public io.sentry.SentryLevel getLevel() {
        return this.level;
    }

    @Override // io.sentry.IScope
    public io.sentry.SentryOptions getOptions() {
        return this.options;
    }

    @Override // io.sentry.IScope
    public io.sentry.PropagationContext getPropagationContext() {
        return this.propagationContext;
    }

    @Override // io.sentry.IScope
    public io.sentry.protocol.SentryId getReplayId() {
        return this.replayId;
    }

    @Override // io.sentry.IScope
    public io.sentry.protocol.Request getRequest() {
        return this.request;
    }

    @Override // io.sentry.IScope
    public java.lang.String getScreen() {
        return this.screen;
    }

    @Override // io.sentry.IScope
    public io.sentry.Session getSession() {
        return this.session;
    }

    @Override // io.sentry.IScope
    public io.sentry.ISpan getSpan() {
        io.sentry.ISpan latestActiveSpan;
        io.sentry.ISpan iSpan = this.activeSpan.get();
        if (iSpan != null) {
            return iSpan;
        }
        io.sentry.ITransaction iTransaction = this.transaction;
        return (iTransaction == null || (latestActiveSpan = iTransaction.getLatestActiveSpan()) == null) ? iTransaction : latestActiveSpan;
    }

    @Override // io.sentry.IScope
    public java.util.Map<java.lang.String, java.lang.String> getTags() {
        return io.sentry.util.CollectionUtils.newConcurrentHashMap(this.tags);
    }

    @Override // io.sentry.IScope
    public io.sentry.ITransaction getTransaction() {
        return this.transaction;
    }

    @Override // io.sentry.IScope
    public java.lang.String getTransactionName() {
        io.sentry.ITransaction iTransaction = this.transaction;
        return iTransaction != null ? iTransaction.getName() : this.transactionName;
    }

    @Override // io.sentry.IScope
    public io.sentry.protocol.User getUser() {
        return this.user;
    }

    @Override // io.sentry.IScope
    public void removeContexts(java.lang.String str) {
        if (str == null) {
            return;
        }
        this.contexts.remove(str);
    }

    @Override // io.sentry.IScope
    public void removeExtra(java.lang.String str) {
        if (str == null) {
            return;
        }
        this.extra.remove(str);
        for (io.sentry.IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.removeExtra(str);
            iScopeObserver.setExtras(this.extra);
        }
    }

    @Override // io.sentry.IScope
    public void removeTag(java.lang.String str) {
        if (str == null) {
            return;
        }
        this.tags.remove(str);
        for (io.sentry.IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.removeTag(str);
            iScopeObserver.setTags(this.tags);
        }
    }

    @Override // io.sentry.IScope
    public void replaceOptions(io.sentry.SentryOptions sentryOptions) {
        this.options = sentryOptions;
        java.util.Queue<io.sentry.Breadcrumb> queue = this.breadcrumbs;
        this.breadcrumbs = createBreadcrumbsList(sentryOptions.getMaxBreadcrumbs());
        java.util.Iterator<io.sentry.Breadcrumb> it = queue.iterator();
        while (it.hasNext()) {
            addBreadcrumb(it.next());
        }
    }

    @Override // io.sentry.IScope
    public void setActiveSpan(io.sentry.ISpan iSpan) {
        this.activeSpan = new java.lang.ref.WeakReference<>(iSpan);
    }

    @Override // io.sentry.IScope
    public void setContexts(java.lang.String str, java.lang.Object obj) {
        if (str == null) {
            return;
        }
        this.contexts.put(str, obj);
        java.util.Iterator<io.sentry.IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setContexts(this.contexts);
        }
    }

    @Override // io.sentry.IScope
    public void setExtra(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            removeExtra(str);
            return;
        }
        this.extra.put(str, str2);
        for (io.sentry.IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.setExtra(str, str2);
            iScopeObserver.setExtras(this.extra);
        }
    }

    @Override // io.sentry.IScope
    public void setFingerprint(java.util.List<java.lang.String> list) {
        if (list == null) {
            return;
        }
        this.fingerprint = new java.util.ArrayList(list);
        java.util.Iterator<io.sentry.IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setFingerprint(list);
        }
    }

    @Override // io.sentry.IScope
    public void setLastEventId(io.sentry.protocol.SentryId sentryId) {
        this.lastEventId = sentryId;
    }

    @Override // io.sentry.IScope
    public void setLevel(io.sentry.SentryLevel sentryLevel) {
        this.level = sentryLevel;
        java.util.Iterator<io.sentry.IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setLevel(sentryLevel);
        }
    }

    @Override // io.sentry.IScope
    public void setPropagationContext(io.sentry.PropagationContext propagationContext) {
        this.propagationContext = propagationContext;
        io.sentry.SpanContext spanContext = propagationContext.toSpanContext();
        java.util.Iterator<io.sentry.IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setTrace(spanContext, this);
        }
    }

    @Override // io.sentry.IScope
    public void setReplayId(io.sentry.protocol.SentryId sentryId) {
        this.replayId = sentryId;
        java.util.Iterator<io.sentry.IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setReplayId(sentryId);
        }
    }

    @Override // io.sentry.IScope
    public void setRequest(io.sentry.protocol.Request request) {
        this.request = request;
        java.util.Iterator<io.sentry.IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setRequest(request);
        }
    }

    @Override // io.sentry.IScope
    public void setScreen(java.lang.String str) {
        this.screen = str;
        io.sentry.protocol.Contexts contexts = getContexts();
        io.sentry.protocol.App app = contexts.getApp();
        if (app == null) {
            app = new io.sentry.protocol.App();
            contexts.setApp(app);
        }
        if (str == null) {
            app.setViewNames(null);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            arrayList.add(str);
            app.setViewNames(arrayList);
        }
        java.util.Iterator<io.sentry.IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setContexts(contexts);
        }
    }

    @Override // io.sentry.IScope
    public void setSpanContext(java.lang.Throwable th, io.sentry.ISpan iSpan, java.lang.String str) {
        io.sentry.util.Objects.requireNonNull(th, "throwable is required");
        io.sentry.util.Objects.requireNonNull(iSpan, "span is required");
        io.sentry.util.Objects.requireNonNull(str, "transactionName is required");
        java.lang.Throwable thFindRootCause = io.sentry.util.ExceptionUtils.findRootCause(th);
        if (this.throwableToSpan.containsKey(thFindRootCause)) {
            return;
        }
        this.throwableToSpan.put(thFindRootCause, new io.sentry.util.Pair<>(new java.lang.ref.WeakReference(iSpan), str));
    }

    @Override // io.sentry.IScope
    public void setTag(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            removeTag(str);
            return;
        }
        this.tags.put(str, str2);
        for (io.sentry.IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.setTag(str, str2);
            iScopeObserver.setTags(this.tags);
        }
    }

    @Override // io.sentry.IScope
    public void setTransaction(java.lang.String str) {
        if (str == null) {
            this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Transaction cannot be null", new java.lang.Object[0]);
            return;
        }
        io.sentry.ITransaction iTransaction = this.transaction;
        if (iTransaction != null) {
            iTransaction.setName(str, io.sentry.protocol.TransactionNameSource.CUSTOM);
        }
        this.transactionName = str;
        java.util.Iterator<io.sentry.IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setTransaction(str);
        }
    }

    @Override // io.sentry.IScope
    public void setUser(io.sentry.protocol.User user) {
        this.user = user;
        java.util.Iterator<io.sentry.IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setUser(user);
        }
    }

    @Override // io.sentry.IScope
    public io.sentry.Scope.SessionPair startSession() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        try {
            if (this.session != null) {
                this.session.end();
            }
            io.sentry.Session session = this.session;
            io.sentry.Scope.SessionPair sessionPair = null;
            if (this.options.getRelease() != null) {
                this.session = new io.sentry.Session(this.options.getDistinctId(), this.user, this.options.getEnvironment(), this.options.getRelease());
                sessionPair = new io.sentry.Scope.SessionPair(this.session.m510clone(), session != null ? session.m510clone() : null);
            } else {
                this.options.getLogger().log(io.sentry.SentryLevel.WARNING, "Release is not set on SentryOptions. Session could not be started", new java.lang.Object[0]);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return sessionPair;
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public io.sentry.PropagationContext withPropagationContext(io.sentry.Scope.IWithPropagationContext iWithPropagationContext) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.propagationContextLock.acquire();
        try {
            iWithPropagationContext.accept(this.propagationContext);
            io.sentry.PropagationContext propagationContext = new io.sentry.PropagationContext(this.propagationContext);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return propagationContext;
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public io.sentry.Session withSession(io.sentry.Scope.IWithSession iWithSession) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        try {
            iWithSession.accept(this.session);
            io.sentry.Session sessionM510clone = this.session != null ? this.session.m510clone() : null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return sessionM510clone;
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public void withTransaction(io.sentry.Scope.IWithTransaction iWithTransaction) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.transactionLock.acquire();
        try {
            iWithTransaction.accept(this.transaction);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public io.sentry.IScope m507clone() {
        return new io.sentry.Scope(this);
    }

    @Override // io.sentry.IScope
    public void setContexts(java.lang.String str, java.lang.Boolean bool) {
        if (str == null) {
            return;
        }
        if (bool == null) {
            setContexts(str, (java.lang.Object) null);
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("value", bool);
        setContexts(str, map);
    }

    @Override // io.sentry.IScope
    public void setTransaction(io.sentry.ITransaction iTransaction) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.transactionLock.acquire();
        try {
            this.transaction = iTransaction;
            for (io.sentry.IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                if (iTransaction != null) {
                    iScopeObserver.setTransaction(iTransaction.getName());
                    iScopeObserver.setTrace(iTransaction.getSpanContext(), this);
                } else {
                    iScopeObserver.setTransaction(null);
                    iScopeObserver.setTrace(null, this);
                }
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public void setContexts(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            setContexts(str, (java.lang.Object) null);
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("value", str2);
        setContexts(str, map);
    }

    @Override // io.sentry.IScope
    public void addBreadcrumb(io.sentry.Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, null);
    }

    @Override // io.sentry.IScope
    public void setContexts(java.lang.String str, java.lang.Number number) {
        if (str == null) {
            return;
        }
        if (number == null) {
            setContexts(str, (java.lang.Object) null);
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("value", number);
        setContexts(str, map);
    }

    @Override // io.sentry.IScope
    public void setContexts(java.lang.String str, java.util.Collection<?> collection) {
        if (str == null) {
            return;
        }
        if (collection == null) {
            setContexts(str, (java.lang.Object) null);
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("value", collection);
        setContexts(str, map);
    }

    private Scope(io.sentry.Scope scope) {
        this.activeSpan = new java.lang.ref.WeakReference<>(null);
        this.fingerprint = new java.util.ArrayList();
        this.tags = new java.util.concurrent.ConcurrentHashMap();
        this.extra = new java.util.concurrent.ConcurrentHashMap();
        this.eventProcessors = new java.util.concurrent.CopyOnWriteArrayList();
        this.sessionLock = new io.sentry.util.AutoClosableReentrantLock();
        this.transactionLock = new io.sentry.util.AutoClosableReentrantLock();
        this.propagationContextLock = new io.sentry.util.AutoClosableReentrantLock();
        this.contexts = new io.sentry.protocol.Contexts();
        this.attachments = new java.util.concurrent.CopyOnWriteArrayList();
        this.replayId = io.sentry.protocol.SentryId.EMPTY_ID;
        this.client = io.sentry.NoOpSentryClient.getInstance();
        this.throwableToSpan = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
        this.transaction = scope.transaction;
        this.transactionName = scope.transactionName;
        this.session = scope.session;
        this.options = scope.options;
        this.level = scope.level;
        this.client = scope.client;
        this.lastEventId = scope.getLastEventId();
        io.sentry.protocol.User user = scope.user;
        this.user = user != null ? new io.sentry.protocol.User(user) : null;
        this.screen = scope.screen;
        this.replayId = scope.replayId;
        io.sentry.protocol.Request request = scope.request;
        this.request = request != null ? new io.sentry.protocol.Request(request) : null;
        this.fingerprint = new java.util.ArrayList(scope.fingerprint);
        this.eventProcessors = new java.util.concurrent.CopyOnWriteArrayList(scope.eventProcessors);
        io.sentry.Breadcrumb[] breadcrumbArr = (io.sentry.Breadcrumb[]) scope.breadcrumbs.toArray(new io.sentry.Breadcrumb[0]);
        java.util.Queue<io.sentry.Breadcrumb> queueCreateBreadcrumbsList = createBreadcrumbsList(scope.options.getMaxBreadcrumbs());
        for (io.sentry.Breadcrumb breadcrumb : breadcrumbArr) {
            queueCreateBreadcrumbsList.add(new io.sentry.Breadcrumb(breadcrumb));
        }
        this.breadcrumbs = queueCreateBreadcrumbsList;
        java.util.Map<java.lang.String, java.lang.String> map = scope.tags;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.tags = concurrentHashMap;
        java.util.Map<java.lang.String, java.lang.Object> map2 = scope.extra;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.extra = concurrentHashMap2;
        this.contexts = new io.sentry.protocol.Contexts(scope.contexts);
        this.attachments = new java.util.concurrent.CopyOnWriteArrayList(scope.attachments);
        this.propagationContext = new io.sentry.PropagationContext(scope.propagationContext);
    }

    @Override // io.sentry.IScope
    public void setContexts(java.lang.String str, java.lang.Object[] objArr) {
        if (str == null) {
            return;
        }
        if (objArr == null) {
            setContexts(str, (java.lang.Object) null);
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("value", objArr);
        setContexts(str, map);
    }

    @Override // io.sentry.IScope
    public void setContexts(java.lang.String str, java.lang.Character ch) {
        if (str == null) {
            return;
        }
        if (ch == null) {
            setContexts(str, (java.lang.Object) null);
            return;
        }
        java.util.HashMap map = new java.util.HashMap();
        map.put("value", ch);
        setContexts(str, map);
    }
}
