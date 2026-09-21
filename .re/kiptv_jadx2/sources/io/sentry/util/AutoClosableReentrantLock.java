package io.sentry.util;

import io.sentry.ISentryLifecycleToken;
import java.util.concurrent.locks.ReentrantLock;

public final class AutoClosableReentrantLock extends ReentrantLock {
    private static final long serialVersionUID = -3283069816958445549L;

    public static final class AutoClosableReentrantLockLifecycleToken implements ISentryLifecycleToken {
        private final ReentrantLock lock;

        public AutoClosableReentrantLockLifecycleToken(ReentrantLock reentrantLock) {
            this.lock = reentrantLock;
        }

        @Override
        public void close() {
            this.lock.unlock();
        }
    }

    public ISentryLifecycleToken acquire() {
        lock();
        return new AutoClosableReentrantLockLifecycleToken(this);
    }
}
