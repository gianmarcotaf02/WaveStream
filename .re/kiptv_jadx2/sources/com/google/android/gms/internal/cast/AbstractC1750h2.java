package com.google.android.gms.internal.cast;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.ktor.sse.ServerSentEventKt;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractC1750h2 extends H implements com.google.common.util.concurrent.J {

    public static final boolean f18918n;

    public static final U f18919o;

    public static final H f18920p;

    public static final Object f18921q;

    public volatile Object f18922k;

    public volatile C1726b2 f18923l;

    public volatile C1746g2 f18924m;

    static {
        boolean z6;
        H c1734d2;
        Throwable th;
        Throwable th2;
        int i3 = 9;
        try {
            z6 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z6 = false;
        }
        f18918n = z6;
        f18919o = new U();
        try {
            c1734d2 = new C1742f2(i3);
            th = null;
            th2 = null;
        } catch (Error | Exception e6) {
            try {
                th2 = e6;
                c1734d2 = new C1730c2(AtomicReferenceFieldUpdater.newUpdater(C1746g2.class, Thread.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY), AtomicReferenceFieldUpdater.newUpdater(C1746g2.class, C1746g2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1750h2.class, C1746g2.class, CmcdData.OBJECT_TYPE_MANIFEST), AtomicReferenceFieldUpdater.newUpdater(AbstractC1750h2.class, C1726b2.class, CmcdData.STREAM_TYPE_LIVE), AtomicReferenceFieldUpdater.newUpdater(AbstractC1750h2.class, Object.class, "k"));
                th = null;
            } catch (Error | Exception e9) {
                c1734d2 = new C1734d2(i3);
                th = e9;
                th2 = e6;
            }
        }
        f18920p = c1734d2;
        if (th != null) {
            U u6 = f18919o;
            Logger loggerA = u6.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            u6.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f18921q = new Object();
    }

    public static final Object A(Object obj) throws ExecutionException {
        if (obj instanceof Y1) {
            RuntimeException runtimeException = ((Y1) obj).f18850b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C1722a2) {
            throw new ExecutionException(((C1722a2) obj).f18864a);
        }
        if (obj == f18921q) {
            return null;
        }
        return obj;
    }

    public static Object v(AbstractC1750h2 abstractC1750h2) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = abstractC1750h2.get();
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

    public static void x(AbstractC1750h2 abstractC1750h2) {
        for (C1746g2 c1746g2K = f18920p.k(abstractC1750h2); c1746g2K != null; c1746g2K = c1746g2K.f18915b) {
            Thread thread = c1746g2K.f18914a;
            if (thread != null) {
                c1746g2K.f18914a = null;
                LockSupport.unpark(thread);
            }
        }
        abstractC1750h2.u();
        C1726b2 c1726b2D = f18920p.d(abstractC1750h2);
        C1726b2 c1726b2 = null;
        while (c1726b2D != null) {
            C1726b2 c1726b3 = c1726b2D.f18876c;
            c1726b2D.f18876c = c1726b2;
            c1726b2 = c1726b2D;
            c1726b2D = c1726b3;
        }
        while (c1726b2 != null) {
            Runnable runnable = c1726b2.f18874a;
            C1726b2 c1726b4 = c1726b2.f18876c;
            Objects.requireNonNull(runnable);
            Executor executor = c1726b2.f18875b;
            Objects.requireNonNull(executor);
            y(runnable, executor);
            c1726b2 = c1726b4;
        }
    }

    public static void y(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            f18919o.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", B2.a.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e6);
        }
    }

    @Override
    public final void addListener(Runnable runnable, Executor executor) {
        C1726b2 c1726b2;
        C1726b2 c1726b3;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (c1726b2 = this.f18923l) != (c1726b3 = C1726b2.f18873d)) {
            C1726b2 c1726b4 = new C1726b2(runnable, executor);
            do {
                c1726b4.f18876c = c1726b2;
                if (f18920p.q(this, c1726b2, c1726b4)) {
                    return;
                } else {
                    c1726b2 = this.f18923l;
                }
            } while (c1726b2 != c1726b3);
        }
        y(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z6) {
        Y1 y9;
        Object obj = this.f18922k;
        if (obj != null) {
            return false;
        }
        if (f18918n) {
            y9 = new Y1(z6, new CancellationException("Future.cancel() was called."));
        } else {
            y9 = z6 ? Y1.f18847c : Y1.f18848d;
            Objects.requireNonNull(y9);
        }
        if (!f18920p.r(this, obj, y9)) {
            return false;
        }
        x(this);
        return true;
    }

    @Override
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f18922k;
        if (obj2 != null) {
            return A(obj2);
        }
        C1746g2 c1746g2 = this.f18924m;
        C1746g2 c1746g3 = C1746g2.f18913c;
        if (c1746g2 != c1746g3) {
            C1746g2 c1746g4 = new C1746g2();
            do {
                H h9 = f18920p;
                h9.m(c1746g4, c1746g2);
                if (h9.s(this, c1746g2, c1746g4)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            z(c1746g4);
                            throw new InterruptedException();
                        }
                        obj = this.f18922k;
                    } while (obj == null);
                    return A(obj);
                }
                c1746g2 = this.f18924m;
            } while (c1746g2 != c1746g3);
        }
        Object obj3 = this.f18922k;
        Objects.requireNonNull(obj3);
        return A(obj3);
    }

    @Override
    public final boolean isCancelled() {
        return this.f18922k instanceof Y1;
    }

    @Override
    public final boolean isDone() {
        return this.f18922k != null;
    }

    public String t() {
        if (this instanceof ScheduledFuture) {
            return B2.a.k(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override
    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f18922k instanceof Y1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            w(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                strConcat = t();
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (Exception | StackOverflowError e6) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e6.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                w(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void u() {
    }

    public final void w(StringBuilder sb) {
        try {
            Object objV = v(this);
            sb.append("SUCCESS, result=[");
            if (objV == null) {
                sb.append("null");
            } else if (objV == this) {
                sb.append("this future");
            } else {
                sb.append(objV.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objV)));
            }
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

    public final void z(C1746g2 c1746g2) {
        c1746g2.f18914a = null;
        while (true) {
            C1746g2 c1746g3 = this.f18924m;
            if (c1746g3 != C1746g2.f18913c) {
                C1746g2 c1746g4 = null;
                while (c1746g3 != null) {
                    C1746g2 c1746g5 = c1746g3.f18915b;
                    if (c1746g3.f18914a != null) {
                        c1746g4 = c1746g3;
                    } else if (c1746g4 != null) {
                        c1746g4.f18915b = c1746g5;
                        if (c1746g4.f18914a == null) {
                        }
                    } else if (!f18920p.s(this, c1746g3, c1746g5)) {
                    }
                    c1746g3 = c1746g5;
                }
                return;
            }
            return;
        }
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f18922k;
            if (obj != null) {
                return A(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C1746g2 c1746g2 = this.f18924m;
                C1746g2 c1746g3 = C1746g2.f18913c;
                if (c1746g2 != c1746g3) {
                    C1746g2 c1746g4 = new C1746g2();
                    while (true) {
                        H h9 = f18920p;
                        h9.m(c1746g4, c1746g2);
                        if (h9.s(this, c1746g2, c1746g4)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f18922k;
                                    if (obj2 != null) {
                                        return A(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    z(c1746g4);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            z(c1746g4);
                            break;
                        }
                        c1746g2 = this.f18924m;
                        if (c1746g2 == c1746g3) {
                        }
                    }
                }
                Object obj3 = this.f18922k;
                Objects.requireNonNull(obj3);
                return A(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f18922k;
                if (obj4 != null) {
                    return A(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j + ServerSentEventKt.SPACE + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j9 = -nanos;
                long jConvert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
                long nanos2 = j9 - timeUnit.toNanos(jConvert);
                boolean z6 = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z6 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + ServerSentEventKt.SPACE + lowerCase;
                    if (z6) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(ServerSentEventKt.SPACE);
                }
                if (z6) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(p121o0.p.p(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
