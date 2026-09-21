package io.sentry.transport;

/* JADX INFO: loaded from: classes4.dex */
public final class ReusableCountLatch {
    private final io.sentry.transport.ReusableCountLatch.Sync sync;

    public static final class Sync extends java.util.concurrent.locks.AbstractQueuedSynchronizer {
        private static final long serialVersionUID = 5970133580157457018L;

        public Sync(int i3) {
            setState(i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void decrement() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getCount() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void increment() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i3) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i3) {
            int state;
            int i9;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i9 = state - 1;
            } while (!compareAndSetState(state, i9));
            return i9 == 0;
        }
    }

    public ReusableCountLatch(int i3) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i3, "negative initial count '", "' is not allowed"));
        }
        this.sync = new io.sentry.transport.ReusableCountLatch.Sync(i3);
    }

    public void decrement() {
        this.sync.decrement();
    }

    public int getCount() {
        return this.sync.getCount();
    }

    public void increment() {
        this.sync.increment();
    }

    public void waitTillZero() throws java.lang.InterruptedException {
        this.sync.acquireSharedInterruptibly(1);
    }

    public boolean waitTillZero(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.sync.tryAcquireSharedNanos(1, timeUnit.toNanos(j));
    }

    public ReusableCountLatch() {
        this(0);
    }
}
