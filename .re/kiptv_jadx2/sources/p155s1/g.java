package p155s1;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.common.util.concurrent.J;
import com.google.common.util.concurrent.U;
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
import p121o0.p;

public abstract class g implements J {

    public static final boolean f27240k = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    public static final Logger f27241l = Logger.getLogger(g.class.getName());

    public static final U f27242m;

    public static final Object f27243n;

    public volatile Object f27244h;

    public volatile c f27245i;
    public volatile f j;

    static {
        U eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "j"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, CmcdData.OBJECT_TYPE_INIT_SEGMENT), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, CmcdData.STREAMING_FORMAT_HLS));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f27242m = eVar;
        if (th != null) {
            f27241l.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f27243n = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.j;
        } while (!f27242m.h0(gVar, fVar, f.f27237c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f27238a;
            if (thread != null) {
                fVar.f27238a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f27239b;
        }
        do {
            cVar2 = gVar.f27245i;
        } while (!f27242m.f0(gVar, cVar2, c.f27228d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f27231c;
            cVar.f27231c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f27231c;
            d(cVar3.f27229a, cVar3.f27230b);
            cVar3 = cVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f27241l.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            CancellationException cancellationException = ((a) obj).f27226a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f27227a);
        }
        if (obj == f27243n) {
            return null;
        }
        return obj;
    }

    public static Object f(g gVar) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = gVar.get();
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
    public final void addListener(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f27245i;
        c cVar2 = c.f27228d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f27231c = cVar;
                if (f27242m.f0(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f27245i;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    @Override
    public final boolean cancel(boolean z6) {
        a aVar;
        Object obj = this.f27244h;
        if (obj != null) {
            return false;
        }
        if (f27240k) {
            aVar = new a(z6, new CancellationException("Future.cancel() was called."));
        } else {
            aVar = z6 ? a.f27224b : a.f27225c;
        }
        if (!f27242m.g0(this, obj, aVar)) {
            return false;
        }
        c(this);
        return true;
    }

    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f27244h;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.j;
            f fVar2 = f.f27237c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                while (true) {
                    U u6 = f27242m;
                    u6.B0(fVar3, fVar);
                    if (u6.h0(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f27244h;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(fVar3);
                        break;
                    }
                    fVar = this.j;
                    if (fVar == fVar2) {
                    }
                }
            }
            return e(this.f27244h);
        }
        while (nanos > 0) {
            Object obj3 = this.f27244h;
            if (obj3 != null) {
                return e(obj3);
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
        StringBuilder sbU = p.u(j, "Waited ", ServerSentEventKt.SPACE);
        sbU.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbU.toString();
        if (nanos + 1000 < 0) {
            String strO = p.o(string3, " (plus ");
            long j9 = -nanos;
            long jConvert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(jConvert);
            boolean z6 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strO2 = strO + jConvert + ServerSentEventKt.SPACE + lowerCase;
                if (z6) {
                    strO2 = p.o(strO2, ",");
                }
                strO = p.o(strO2, ServerSentEventKt.SPACE);
            }
            if (z6) {
                strO = strO + nanos2 + " nanoseconds ";
            }
            string3 = p.o(strO, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(p.o(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(p.p(string3, " for ", string));
    }

    public final void h(f fVar) {
        fVar.f27238a = null;
        while (true) {
            f fVar2 = this.j;
            if (fVar2 == f.f27237c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f27239b;
                if (fVar2.f27238a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f27239b = fVar4;
                    if (fVar3.f27238a == null) {
                    }
                } else if (!f27242m.h0(this, fVar2, fVar4)) {
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public boolean i(Throwable th) {
        if (!f27242m.g0(this, null, new b(th))) {
            return false;
        }
        c(this);
        return true;
    }

    @Override
    public final boolean isCancelled() {
        return this.f27244h instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.f27244h != null;
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f27244h instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e6) {
                strG = "Exception thrown from implementation: " + e6.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f27244h;
            if (obj2 != null) {
                return e(obj2);
            }
            f fVar = this.j;
            f fVar2 = f.f27237c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    U u6 = f27242m;
                    u6.B0(fVar3, fVar);
                    if (u6.h0(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f27244h;
                            } else {
                                h(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    fVar = this.j;
                } while (fVar != fVar2);
            }
            return e(this.f27244h);
        }
        throw new InterruptedException();
    }
}
