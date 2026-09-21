package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class Stack {
    private final java.util.Deque<io.sentry.Stack.StackItem> items;
    private final io.sentry.util.AutoClosableReentrantLock itemsLock;
    private final io.sentry.ILogger logger;

    public Stack(io.sentry.ILogger iLogger, io.sentry.Stack.StackItem stackItem) {
        java.util.concurrent.LinkedBlockingDeque linkedBlockingDeque = new java.util.concurrent.LinkedBlockingDeque();
        this.items = linkedBlockingDeque;
        this.itemsLock = new io.sentry.util.AutoClosableReentrantLock();
        this.logger = (io.sentry.ILogger) io.sentry.util.Objects.requireNonNull(iLogger, "logger is required");
        linkedBlockingDeque.push((io.sentry.Stack.StackItem) io.sentry.util.Objects.requireNonNull(stackItem, "rootStackItem is required"));
    }

    public io.sentry.Stack.StackItem peek() {
        return this.items.peek();
    }

    public void pop() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.itemsLock.acquire();
        try {
            if (this.items.size() != 1) {
                this.items.pop();
            } else {
                this.logger.log(io.sentry.SentryLevel.WARNING, "Attempt to pop the root scope.", new java.lang.Object[0]);
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

    public void push(io.sentry.Stack.StackItem stackItem) {
        this.items.push(stackItem);
    }

    public int size() {
        return this.items.size();
    }

    public static final class StackItem {
        private volatile io.sentry.ISentryClient client;
        private final io.sentry.SentryOptions options;
        private volatile io.sentry.IScope scope;

        public StackItem(io.sentry.SentryOptions sentryOptions, io.sentry.ISentryClient iSentryClient, io.sentry.IScope iScope) {
            this.client = (io.sentry.ISentryClient) io.sentry.util.Objects.requireNonNull(iSentryClient, "ISentryClient is required.");
            this.scope = (io.sentry.IScope) io.sentry.util.Objects.requireNonNull(iScope, "Scope is required.");
            this.options = (io.sentry.SentryOptions) io.sentry.util.Objects.requireNonNull(sentryOptions, "Options is required");
        }

        public io.sentry.ISentryClient getClient() {
            return this.client;
        }

        public io.sentry.SentryOptions getOptions() {
            return this.options;
        }

        public io.sentry.IScope getScope() {
            return this.scope;
        }

        public void setClient(io.sentry.ISentryClient iSentryClient) {
            this.client = iSentryClient;
        }

        public StackItem(io.sentry.Stack.StackItem stackItem) {
            this.options = stackItem.options;
            this.client = stackItem.client;
            this.scope = stackItem.scope.m505clone();
        }
    }

    public Stack(io.sentry.Stack stack) {
        this(stack.logger, new io.sentry.Stack.StackItem(stack.items.getLast()));
        java.util.Iterator<io.sentry.Stack.StackItem> itDescendingIterator = stack.items.descendingIterator();
        if (itDescendingIterator.hasNext()) {
            itDescendingIterator.next();
        }
        while (itDescendingIterator.hasNext()) {
            push(new io.sentry.Stack.StackItem(itDescendingIterator.next()));
        }
    }
}
