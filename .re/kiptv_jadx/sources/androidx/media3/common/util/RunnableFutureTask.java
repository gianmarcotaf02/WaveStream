package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public abstract class RunnableFutureTask<R, E extends java.lang.Exception> implements java.util.concurrent.RunnableFuture<R> {
    private boolean canceled;
    private java.lang.Exception exception;
    private R result;
    private java.lang.Thread workThread;
    private final androidx.media3.common.util.ConditionVariable started = new androidx.media3.common.util.ConditionVariable();
    private final androidx.media3.common.util.ConditionVariable finished = new androidx.media3.common.util.ConditionVariable();
    private final java.lang.Object cancelLock = new java.lang.Object();

    private R getResult() throws java.util.concurrent.ExecutionException {
        if (this.canceled) {
            throw new java.util.concurrent.CancellationException();
        }
        if (this.exception == null) {
            return this.result;
        }
        throw new java.util.concurrent.ExecutionException(this.exception);
    }

    public final void blockUntilFinished() {
        this.finished.blockUninterruptible();
    }

    public final void blockUntilStarted() {
        this.started.blockUninterruptible();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        synchronized (this.cancelLock) {
            try {
                if (!this.canceled && !this.finished.isOpen()) {
                    this.canceled = true;
                    cancelWork();
                    java.lang.Thread thread = this.workThread;
                    if (thread == null) {
                        this.started.open();
                        this.finished.open();
                    } else if (z6) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void cancelWork() {
    }

    public abstract R doWork();

    @Override // java.util.concurrent.Future
    public final R get() {
        this.finished.block();
        return getResult();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.canceled;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.finished.isOpen();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.cancelLock) {
            try {
                if (this.canceled) {
                    return;
                }
                this.workThread = java.lang.Thread.currentThread();
                this.started.open();
                try {
                    try {
                        this.result = doWork();
                        synchronized (this.cancelLock) {
                            this.finished.open();
                            this.workThread = null;
                            java.lang.Thread.interrupted();
                        }
                    } catch (java.lang.Throwable th) {
                        synchronized (this.cancelLock) {
                            this.finished.open();
                            this.workThread = null;
                            java.lang.Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (java.lang.Exception e6) {
                    this.exception = e6;
                    synchronized (this.cancelLock) {
                        this.finished.open();
                        this.workThread = null;
                        java.lang.Thread.interrupted();
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        if (this.finished.block(java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, timeUnit))) {
            return getResult();
        }
        throw new java.util.concurrent.TimeoutException();
    }
}
