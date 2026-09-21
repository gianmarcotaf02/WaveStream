package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends S7.W implements java.lang.Runnable {
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final S7.D f9535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f9536q;

    static {
        java.lang.Long l2;
        S7.D d4 = new S7.D();
        f9535p = d4;
        d4.c0(false);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        try {
            l2 = java.lang.Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (java.lang.SecurityException unused) {
            l2 = 1000L;
        }
        f9536q = timeUnit.toNanos(l2.longValue());
    }

    @Override // S7.W, S7.H
    public final S7.O T(long j, java.lang.Runnable runnable, p100l6.h hVar) {
        long j9 = 0;
        if (j > 0) {
            j9 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j9 >= 4611686018427387903L) {
            return S7.t0.f9621h;
        }
        long jNanoTime = java.lang.System.nanoTime();
        S7.T t9 = new S7.T(j9 + jNanoTime, runnable);
        k0(jNanoTime, t9);
        return t9;
    }

    @Override // S7.X
    public final java.lang.Thread b0() {
        java.lang.Thread thread;
        java.lang.Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new java.lang.Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f9535p.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // S7.X
    public final void f0(long j, S7.U u6) {
        throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // S7.W
    public final void g0(java.lang.Runnable runnable) {
        if (debugStatus == 4) {
            throw new java.util.concurrent.RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.g0(runnable);
    }

    public final synchronized void l0() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            S7.W.f9559m.set(this, null);
            S7.W.f9560n.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        S7.z0.f9629a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    _thread = null;
                    l0();
                    if (j0()) {
                        return;
                    }
                    b0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    java.lang.Thread.interrupted();
                    long jD0 = d0();
                    if (jD0 == Long.MAX_VALUE) {
                        long jNanoTime = java.lang.System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f9536q + jNanoTime;
                        }
                        long j9 = j - jNanoTime;
                        if (j9 <= 0) {
                            _thread = null;
                            l0();
                            if (j0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        if (jD0 > j9) {
                            jD0 = j9;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jD0 > 0) {
                        int i9 = debugStatus;
                        if (i9 == 2 || i9 == 3) {
                            _thread = null;
                            l0();
                            if (j0()) {
                                return;
                            }
                            b0();
                            return;
                        }
                        java.util.concurrent.locks.LockSupport.parkNanos(this, jD0);
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            _thread = null;
            l0();
            if (!j0()) {
                b0();
            }
            throw th;
        }
    }

    @Override // S7.W, S7.X
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // S7.AbstractC0906w
    public final java.lang.String toString() {
        return "DefaultExecutor";
    }
}
