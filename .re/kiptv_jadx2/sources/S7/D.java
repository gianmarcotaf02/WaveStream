package S7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class D extends W implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    public static final D f9535p;

    public static final long f9536q;

    static {
        Long l2;
        D d4 = new D();
        f9535p = d4;
        d4.c0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f9536q = timeUnit.toNanos(l2.longValue());
    }

    @Override
    public final O T(long j, Runnable runnable, p100l6.h hVar) {
        long j9 = 0;
        if (j > 0) {
            j9 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j9 >= 4611686018427387903L) {
            return t0.f9621h;
        }
        long jNanoTime = System.nanoTime();
        T t9 = new T(j9 + jNanoTime, runnable);
        k0(jNanoTime, t9);
        return t9;
    }

    @Override
    public final Thread b0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f9535p.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override
    public final void f0(long j, U u6) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override
    public final void g0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.g0(runnable);
    }

    public final synchronized void l0() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            W.f9559m.set(this, null);
            W.f9560n.set(this, null);
            notifyAll();
        }
    }

    @Override
    public final void run() {
        z0.f9629a.set(this);
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
                    Thread.interrupted();
                    long jD0 = d0();
                    if (jD0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
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
                        LockSupport.parkNanos(this, jD0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            l0();
            if (!j0()) {
                b0();
            }
            throw th;
        }
    }

    @Override
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override
    public final String toString() {
        return "DefaultExecutor";
    }
}
