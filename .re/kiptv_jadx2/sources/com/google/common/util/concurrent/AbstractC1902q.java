package com.google.common.util.concurrent;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import io.ktor.sse.ServerSentEventKt;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractC1902q extends p115n4.a implements J {
    private static final AbstractC1887b ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final I log;
    private volatile C1890e listeners;
    private volatile Object value;
    private volatile C1901p waiters;

    static {
        boolean z6;
        Throwable th;
        AbstractC1887b c1893h;
        try {
            z6 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z6 = false;
        }
        GENERATE_CANCELLATION_CAUSES = z6;
        log = new I(AbstractC1902q.class);
        Throwable th2 = null;
        try {
            c1893h = new C1900o();
            th = null;
        } catch (Error | Exception e6) {
            th = e6;
            try {
                c1893h = new C1891f(AtomicReferenceFieldUpdater.newUpdater(C1901p.class, Thread.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY), AtomicReferenceFieldUpdater.newUpdater(C1901p.class, C1901p.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1902q.class, C1901p.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1902q.class, C1890e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1902q.class, Object.class, "value"));
            } catch (Error | Exception e9) {
                th2 = e9;
                c1893h = new C1893h();
            }
        }
        ATOMIC_HELPER = c1893h;
        if (th2 != null) {
            I i3 = log;
            Logger loggerA = i3.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            i3.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        NULL = new Object();
    }

    public static void d(AbstractC1902q abstractC1902q, boolean z6) {
        C1890e c1890e = null;
        while (true) {
            abstractC1902q.getClass();
            for (C1901p c1901pE = ATOMIC_HELPER.e(abstractC1902q); c1901pE != null; c1901pE = c1901pE.f19450b) {
                Thread thread = c1901pE.f19449a;
                if (thread != null) {
                    c1901pE.f19449a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z6) {
                abstractC1902q.interruptTask();
                z6 = false;
            }
            abstractC1902q.afterDone();
            C1890e c1890e2 = c1890e;
            C1890e c1890eD = ATOMIC_HELPER.d(abstractC1902q);
            C1890e c1890e3 = c1890e2;
            while (c1890eD != null) {
                C1890e c1890e4 = c1890eD.f19434c;
                c1890eD.f19434c = c1890e3;
                c1890e3 = c1890eD;
                c1890eD = c1890e4;
            }
            while (c1890e3 != null) {
                c1890e = c1890e3.f19434c;
                Runnable runnable = c1890e3.f19432a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC1892g) {
                    RunnableC1892g runnableC1892g = (RunnableC1892g) runnable;
                    abstractC1902q = runnableC1892g.f19440h;
                    if (abstractC1902q.value == runnableC1892g) {
                        if (ATOMIC_HELPER.b(abstractC1902q, runnableC1892g, g(runnableC1892g.f19441i))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c1890e3.f19433b;
                    Objects.requireNonNull(executor);
                    e(runnable, executor);
                }
                c1890e3 = c1890e;
            }
            return;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            log.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof C1888c) {
            RuntimeException runtimeException = ((C1888c) obj).f19428b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C1889d) {
            throw new ExecutionException(((C1889d) obj).f19430a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static Object g(J j) {
        Throwable thTryInternalFastPathGetFailure;
        if (j instanceof InterfaceC1894i) {
            Object c1888c = ((AbstractC1902q) j).value;
            if (c1888c instanceof C1888c) {
                C1888c c1888c2 = (C1888c) c1888c;
                if (c1888c2.f19427a) {
                    c1888c = c1888c2.f19428b != null ? new C1888c(false, c1888c2.f19428b) : C1888c.f19426d;
                }
            }
            Objects.requireNonNull(c1888c);
            return c1888c;
        }
        if ((j instanceof p115n4.a) && (thTryInternalFastPathGetFailure = ((p115n4.a) j).tryInternalFastPathGetFailure()) != null) {
            return new C1889d(thTryInternalFastPathGetFailure);
        }
        boolean zIsCancelled = j.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            C1888c c1888c3 = C1888c.f19426d;
            Objects.requireNonNull(c1888c3);
            return c1888c3;
        }
        try {
            try {
                try {
                    Object objH = h(j);
                    if (!zIsCancelled) {
                        return objH == null ? NULL : objH;
                    }
                    return new C1888c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + j));
                } catch (Error | Exception e6) {
                    e = e6;
                    return new C1889d(e);
                }
            } catch (Error e9) {
                e = e9;
                return new C1889d(e);
            }
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new C1888c(false, e10);
            }
            return new C1889d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + j, e10));
        } catch (ExecutionException e11) {
            if (!zIsCancelled) {
                return new C1889d(e11.getCause());
            }
            return new C1888c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + j, e11));
        }
    }

    public static Object h(J j) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = j.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override
    public void addListener(Runnable runnable, Executor executor) {
        C1890e c1890e;
        C1890e c1890e2;
        AbstractC1864o0.U(runnable, "Runnable was null.");
        AbstractC1864o0.U(executor, "Executor was null.");
        if (!isDone() && (c1890e = this.listeners) != (c1890e2 = C1890e.f19431d)) {
            C1890e c1890e3 = new C1890e(runnable, executor);
            do {
                c1890e3.f19434c = c1890e;
                if (ATOMIC_HELPER.a(this, c1890e, c1890e3)) {
                    return;
                } else {
                    c1890e = this.listeners;
                }
            } while (c1890e != c1890e2);
        }
        e(runnable, executor);
    }

    public void afterDone() {
    }

    public final void b(StringBuilder sb) {
        try {
            Object objH = h(this);
            sb.append("SUCCESS, result=[");
            c(objH, sb);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        } catch (Exception e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final void c(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override
    public boolean cancel(boolean z6) {
        C1888c c1888c;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof RunnableC1892g)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            c1888c = new C1888c(z6, new CancellationException("Future.cancel() was called."));
        } else {
            c1888c = z6 ? C1888c.f19425c : C1888c.f19426d;
            Objects.requireNonNull(c1888c);
        }
        AbstractC1902q abstractC1902q = this;
        boolean z9 = false;
        while (true) {
            if (ATOMIC_HELPER.b(abstractC1902q, obj, c1888c)) {
                d(abstractC1902q, z6);
                if (obj instanceof RunnableC1892g) {
                    J j = ((RunnableC1892g) obj).f19441i;
                    if (j instanceof InterfaceC1894i) {
                        abstractC1902q = (AbstractC1902q) j;
                        obj = abstractC1902q.value;
                        if ((obj == null) | (obj instanceof RunnableC1892g)) {
                            z9 = true;
                        }
                    } else {
                        j.cancel(z6);
                    }
                }
                return true;
            }
            obj = abstractC1902q.value;
            if (!(obj instanceof RunnableC1892g)) {
                return z9;
            }
        }
    }

    @Override
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z6;
        long j9;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof RunnableC1892g))) {
            return f(obj);
        }
        long j10 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1901p c1901p = this.waiters;
            C1901p c1901p2 = C1901p.f19448c;
            if (c1901p != c1901p2) {
                C1901p c1901p3 = new C1901p();
                z6 = true;
                while (true) {
                    ATOMIC_HELPER.f(c1901p3, c1901p);
                    if (ATOMIC_HELPER.c(this, c1901p, c1901p3)) {
                        j9 = j10;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                i(c1901p3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC1892g))) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(c1901p3);
                        break;
                    }
                    long j11 = j10;
                    c1901p = this.waiters;
                    if (c1901p != c1901p2) {
                        j10 = j11;
                    }
                }
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return f(obj3);
        }
        z6 = true;
        j9 = 0;
        while (nanos > j9) {
            Object obj4 = this.value;
            if ((obj4 != null ? z6 : false) && (!(obj4 instanceof RunnableC1892g))) {
                return f(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbU = p121o0.p.u(j, "Waited ", ServerSentEventKt.SPACE);
        sbU.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbU.toString();
        if (nanos + 1000 < j9) {
            String strO = p121o0.p.o(string3, " (plus ");
            long j12 = -nanos;
            long jConvert = timeUnit.convert(j12, TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(jConvert);
            boolean z9 = (jConvert == j9 || nanos2 > 1000) ? z6 : false;
            if (jConvert > j9) {
                String strO2 = strO + jConvert + ServerSentEventKt.SPACE + lowerCase;
                if (z9) {
                    strO2 = p121o0.p.o(strO2, ",");
                }
                strO = p121o0.p.o(strO2, ServerSentEventKt.SPACE);
            }
            if (z9) {
                strO = strO + nanos2 + " nanoseconds ";
            }
            string3 = p121o0.p.o(strO, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(p121o0.p.o(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(p121o0.p.p(string3, " for ", string));
    }

    public final void i(C1901p c1901p) {
        c1901p.f19449a = null;
        while (true) {
            C1901p c1901p2 = this.waiters;
            if (c1901p2 == C1901p.f19448c) {
                return;
            }
            C1901p c1901p3 = null;
            while (c1901p2 != null) {
                C1901p c1901p4 = c1901p2.f19450b;
                if (c1901p2.f19449a != null) {
                    c1901p3 = c1901p2;
                } else if (c1901p3 != null) {
                    c1901p3.f19450b = c1901p4;
                    if (c1901p3.f19449a == null) {
                    }
                } else if (!ATOMIC_HELPER.c(this, c1901p2, c1901p4)) {
                }
                c1901p2 = c1901p4;
            }
            return;
        }
    }

    public void interruptTask() {
    }

    @Override
    public boolean isCancelled() {
        return this.value instanceof C1888c;
    }

    @Override
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof RunnableC1892g)) & (obj != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        d(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        th.getClass();
        if (!ATOMIC_HELPER.b(this, null, new C1889d(th))) {
            return false;
        }
        d(this, false);
        return true;
    }

    public boolean setFuture(J j) {
        C1889d c1889d;
        j.getClass();
        Object obj = this.value;
        if (obj != null) {
            if (obj instanceof C1888c) {
                j.cancel(((C1888c) obj).f19427a);
            }
        } else if (j.isDone()) {
            if (ATOMIC_HELPER.b(this, null, g(j))) {
                d(this, false);
                return true;
            }
        } else {
            RunnableC1892g runnableC1892g = new RunnableC1892g(this, j);
            if (ATOMIC_HELPER.b(this, null, runnableC1892g)) {
                try {
                    j.addListener(runnableC1892g, z.f19464h);
                    return true;
                } catch (Throwable th) {
                    try {
                        c1889d = new C1889d(th);
                    } catch (Error | Exception unused) {
                        c1889d = C1889d.f19429b;
                    }
                    ATOMIC_HELPER.b(this, runnableC1892g, c1889d);
                    return true;
                }
            }
            obj = this.value;
            if (obj instanceof C1888c) {
                j.cancel(((C1888c) obj).f19427a);
            }
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.value;
            if (obj instanceof RunnableC1892g) {
                sb.append(", setFuture=[");
                J j = ((RunnableC1892g) obj).f19441i;
                try {
                    if (j == this) {
                        sb.append("this future");
                    } else {
                        sb.append(j);
                    }
                } catch (Exception e6) {
                    e = e6;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e9) {
                    e = e9;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strPendingToString = pendingToString();
                    if (strPendingToString == null || strPendingToString.isEmpty()) {
                        strPendingToString = null;
                    }
                } catch (Exception | StackOverflowError e10) {
                    strPendingToString = "Exception thrown from implementation: " + e10.getClass();
                }
                if (strPendingToString != null) {
                    sb.append(", info=[");
                    sb.append(strPendingToString);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                b(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof InterfaceC1894i)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof C1889d) {
            return ((C1889d) obj).f19430a;
        }
        return null;
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof C1888c) && ((C1888c) obj).f19427a;
    }

    @Override
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC1892g))) {
                return f(obj2);
            }
            C1901p c1901p = this.waiters;
            C1901p c1901p2 = C1901p.f19448c;
            if (c1901p != c1901p2) {
                C1901p c1901p3 = new C1901p();
                do {
                    ATOMIC_HELPER.f(c1901p3, c1901p);
                    if (ATOMIC_HELPER.c(this, c1901p, c1901p3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                i(c1901p3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC1892g))));
                        return f(obj);
                    }
                    c1901p = this.waiters;
                } while (c1901p != c1901p2);
            }
            Object obj3 = this.value;
            Objects.requireNonNull(obj3);
            return f(obj3);
        }
        throw new InterruptedException();
    }
}
