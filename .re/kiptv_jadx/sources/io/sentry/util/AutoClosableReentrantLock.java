package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoClosableReentrantLock extends java.util.concurrent.locks.ReentrantLock {
    private static final long serialVersionUID = -3283069816958445549L;

    public static final class AutoClosableReentrantLockLifecycleToken implements io.sentry.ISentryLifecycleToken {
        private final java.util.concurrent.locks.ReentrantLock lock;

        public AutoClosableReentrantLockLifecycleToken(java.util.concurrent.locks.ReentrantLock reentrantLock) {
            this.lock = reentrantLock;
        }

        @Override // io.sentry.ISentryLifecycleToken, java.lang.AutoCloseable
        public void close() {
            this.lock.unlock();
        }
    }

    public io.sentry.ISentryLifecycleToken acquire() {
        lock();
        return new io.sentry.util.AutoClosableReentrantLock.AutoClosableReentrantLockLifecycleToken(this);
    }
}
