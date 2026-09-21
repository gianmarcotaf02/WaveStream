package com.google.android.gms.internal.play_billing;

import androidx.media3.exoplayer.upstream.CmcdData;
import io.ktor.sse.ServerSentEventKt;
import java.util.Locale;
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

public class I1 implements U {

    public static final boolean f19227k = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    public static final Logger f19228l = Logger.getLogger(I1.class.getName());

    public static final p199y3.e f19229m;

    public static final Object f19230n;

    public volatile Object f19231h;

    public volatile K0 f19232i;
    public volatile H1 j;

    static {
        p199y3.e g9;
        try {
            g9 = new C1851j1(AtomicReferenceFieldUpdater.newUpdater(H1.class, Thread.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY), AtomicReferenceFieldUpdater.newUpdater(H1.class, H1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(I1.class, H1.class, "j"), AtomicReferenceFieldUpdater.newUpdater(I1.class, K0.class, CmcdData.OBJECT_TYPE_INIT_SEGMENT), AtomicReferenceFieldUpdater.newUpdater(I1.class, Object.class, CmcdData.STREAMING_FORMAT_HLS));
            th = null;
        } catch (Throwable th) {
            th = th;
            g9 = new G1();
        }
        Throwable th2 = th;
        f19229m = g9;
        if (th2 != null) {
            f19228l.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f19230n = new Object();
    }

    public static void c(I1 i3) {
        H1 h9;
        p199y3.e eVar;
        K0 k1;
        K0 k9;
        K0 k10;
        do {
            h9 = i3.j;
            eVar = f19229m;
        } while (!eVar.K(i3, h9, H1.f19223c));
        while (true) {
            k1 = null;
            if (h9 == null) {
                break;
            }
            Thread thread = h9.f19224a;
            if (thread != null) {
                h9.f19224a = null;
                LockSupport.unpark(thread);
            }
            h9 = h9.f19225b;
        }
        do {
            k9 = i3.f19232i;
        } while (!eVar.I(i3, k9, K0.f19246d));
        while (true) {
            k10 = k1;
            k1 = k9;
            if (k1 == null) {
                break;
            }
            k9 = k1.f19249c;
            k1.f19249c = k10;
        }
        while (k10 != null) {
            Runnable runnable = k10.f19247a;
            K0 k11 = k10.f19249c;
            e(runnable, k10.f19248b);
            k10 = k11;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f19228l.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", B2.a.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e6);
        }
    }

    public static final Object g(Object obj) throws ExecutionException {
        if (obj instanceof C1832d0) {
            CancellationException cancellationException = ((C1832d0) obj).f19317a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof A0) {
            throw new ExecutionException(((A0) obj).f19188a);
        }
        if (obj == f19230n) {
            return null;
        }
        return obj;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        K0 k1 = this.f19232i;
        K0 k9 = K0.f19246d;
        if (k1 != k9) {
            K0 k10 = new K0(runnable, executor);
            do {
                k10.f19249c = k1;
                if (f19229m.I(this, k1, k10)) {
                    return;
                } else {
                    k1 = this.f19232i;
                }
            } while (k1 != k9);
        }
        e(runnable, executor);
    }

    public String b() {
        if (this instanceof ScheduledFuture) {
            return B2.a.k(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override
    public final boolean cancel(boolean z6) {
        C1832d0 c1832d0;
        Object obj = this.f19231h;
        if (obj != null) {
            return false;
        }
        if (f19227k) {
            c1832d0 = new C1832d0(new CancellationException("Future.cancel() was called."));
        } else {
            c1832d0 = z6 ? C1832d0.f19315b : C1832d0.f19316c;
        }
        if (!f19229m.J(this, obj, c1832d0)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void d(StringBuilder sb) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z6 = true;
                } catch (Throwable th) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e6) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e6.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e9) {
                sb.append("FAILURE, cause=[");
                sb.append(e9.getCause());
                sb.append("]");
                return;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void f(H1 h9) {
        h9.f19224a = null;
        while (true) {
            H1 h10 = this.j;
            if (h10 != H1.f19223c) {
                H1 h11 = null;
                while (h10 != null) {
                    H1 h12 = h10.f19225b;
                    if (h10.f19224a != null) {
                        h11 = h10;
                    } else if (h11 != null) {
                        h11.f19225b = h12;
                        if (h11.f19224a == null) {
                        }
                    } else if (!f19229m.K(this, h10, h12)) {
                    }
                    h10 = h12;
                }
                return;
            }
            return;
        }
    }

    @Override
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f19231h;
        if (obj2 != null) {
            return g(obj2);
        }
        H1 h9 = this.j;
        H1 h10 = H1.f19223c;
        if (h9 != h10) {
            H1 h11 = new H1();
            do {
                p199y3.e eVar = f19229m;
                eVar.G(h11, h9);
                if (eVar.K(this, h9, h11)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            f(h11);
                            throw new InterruptedException();
                        }
                        obj = this.f19231h;
                    } while (obj == null);
                    return g(obj);
                }
                h9 = this.j;
            } while (h9 != h10);
        }
        return g(this.f19231h);
    }

    @Override
    public final boolean isCancelled() {
        return this.f19231h instanceof C1832d0;
    }

    @Override
    public final boolean isDone() {
        return this.f19231h != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f19231h instanceof C1832d0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                strConcat = b();
            } catch (RuntimeException e6) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e6.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f19231h;
            if (obj != null) {
                return g(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                H1 h9 = this.j;
                H1 h10 = H1.f19223c;
                if (h9 != h10) {
                    H1 h11 = new H1();
                    while (true) {
                        p199y3.e eVar = f19229m;
                        eVar.G(h11, h9);
                        if (eVar.K(this, h9, h11)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f19231h;
                                    if (obj2 != null) {
                                        return g(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    f(h11);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(h11);
                            break;
                        }
                        h9 = this.j;
                        if (h9 == h10) {
                        }
                    }
                }
                return g(this.f19231h);
            }
            while (nanos > 0) {
                Object obj3 = this.f19231h;
                if (obj3 != null) {
                    return g(obj3);
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
