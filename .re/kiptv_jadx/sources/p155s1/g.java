package p155s1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements com.google.common.util.concurrent.J {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f27240k = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.logging.Logger f27241l = java.util.logging.Logger.getLogger(p155s1.g.class.getName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.common.util.concurrent.U f27242m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final java.lang.Object f27243n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.Object f27244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile p155s1.c f27245i;
    public volatile p155s1.f j;

    static {
        com.google.common.util.concurrent.U eVar;
        try {
            eVar = new p155s1.d(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p155s1.f.class, java.lang.Thread.class, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p155s1.f.class, p155s1.f.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p155s1.g.class, p155s1.f.class, "j"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p155s1.g.class, p155s1.c.class, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_INIT_SEGMENT), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p155s1.g.class, java.lang.Object.class, androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_HLS));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            eVar = new p155s1.e();
        }
        f27242m = eVar;
        if (th != null) {
            f27241l.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f27243n = new java.lang.Object();
    }

    public static void c(p155s1.g gVar) {
        p155s1.f fVar;
        p155s1.c cVar;
        p155s1.c cVar2;
        p155s1.c cVar3;
        do {
            fVar = gVar.j;
        } while (!f27242m.h0(gVar, fVar, p155s1.f.f27237c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            java.lang.Thread thread = fVar.f27238a;
            if (thread != null) {
                fVar.f27238a = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            fVar = fVar.f27239b;
        }
        do {
            cVar2 = gVar.f27245i;
        } while (!f27242m.f0(gVar, cVar2, p155s1.c.f27228d));
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
            p155s1.c cVar4 = cVar3.f27231c;
            d(cVar3.f27229a, cVar3.f27230b);
            cVar3 = cVar4;
        }
    }

    public static void d(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e6) {
            f27241l.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e6);
        }
    }

    public static java.lang.Object e(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof p155s1.a) {
            java.util.concurrent.CancellationException cancellationException = ((p155s1.a) obj).f27226a;
            java.util.concurrent.CancellationException cancellationException2 = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof p155s1.b) {
            throw new java.util.concurrent.ExecutionException(((p155s1.b) obj).f27227a);
        }
        if (obj == f27243n) {
            return null;
        }
        return obj;
    }

    public static java.lang.Object f(p155s1.g gVar) {
        java.lang.Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z6 = true;
            } catch (java.lang.Throwable th) {
                if (z6) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.J
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        executor.getClass();
        p155s1.c cVar = this.f27245i;
        p155s1.c cVar2 = p155s1.c.f27228d;
        if (cVar != cVar2) {
            p155s1.c cVar3 = new p155s1.c(runnable, executor);
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

    public final void b(java.lang.StringBuilder sb) {
        try {
            java.lang.Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : java.lang.String.valueOf(objF));
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.lang.RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (java.util.concurrent.ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        p155s1.a aVar;
        java.lang.Object obj = this.f27244h;
        if (obj != null) {
            return false;
        }
        if (f27240k) {
            aVar = new p155s1.a(z6, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            aVar = z6 ? p155s1.a.f27224b : p155s1.a.f27225c;
        }
        if (!f27242m.g0(this, obj, aVar)) {
            return false;
        }
        c(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String g() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.f27244h;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            p155s1.f fVar = this.j;
            p155s1.f fVar2 = p155s1.f.f27237c;
            if (fVar != fVar2) {
                p155s1.f fVar3 = new p155s1.f();
                while (true) {
                    com.google.common.util.concurrent.U u6 = f27242m;
                    u6.B0(fVar3, fVar);
                    if (u6.h0(this, fVar, fVar3)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                h(fVar3);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.f27244h;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
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
            java.lang.Object obj3 = this.f27244h;
            if (obj3 != null) {
                return e(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = jNanoTime - java.lang.System.nanoTime();
        }
        java.lang.String string = toString();
        java.lang.String string2 = timeUnit.toString();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = string2.toLowerCase(locale);
        java.lang.StringBuilder sbU = p121o0.p.u(j, "Waited ", io.ktor.sse.ServerSentEventKt.SPACE);
        sbU.append(timeUnit.toString().toLowerCase(locale));
        java.lang.String string3 = sbU.toString();
        if (nanos + 1000 < 0) {
            java.lang.String strO = p121o0.p.o(string3, " (plus ");
            long j9 = -nanos;
            long jConvert = timeUnit.convert(j9, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(jConvert);
            boolean z6 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                java.lang.String strO2 = strO + jConvert + io.ktor.sse.ServerSentEventKt.SPACE + lowerCase;
                if (z6) {
                    strO2 = p121o0.p.o(strO2, ",");
                }
                strO = p121o0.p.o(strO2, io.ktor.sse.ServerSentEventKt.SPACE);
            }
            if (z6) {
                strO = strO + nanos2 + " nanoseconds ";
            }
            string3 = p121o0.p.o(strO, "delay)");
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(p121o0.p.o(string3, " but future completed as timeout expired"));
        }
        throw new java.util.concurrent.TimeoutException(p121o0.p.p(string3, " for ", string));
    }

    public final void h(p155s1.f fVar) {
        fVar.f27238a = null;
        while (true) {
            p155s1.f fVar2 = this.j;
            if (fVar2 == p155s1.f.f27237c) {
                return;
            }
            p155s1.f fVar3 = null;
            while (fVar2 != null) {
                p155s1.f fVar4 = fVar2.f27239b;
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

    public boolean i(java.lang.Throwable th) {
        if (!f27242m.g0(this, null, new p155s1.b(th))) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27244h instanceof p155s1.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f27244h != null;
    }

    public final java.lang.String toString() {
        java.lang.String strG;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f27244h instanceof p155s1.a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strG = g();
            } catch (java.lang.RuntimeException e6) {
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

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj2 = this.f27244h;
            if (obj2 != null) {
                return e(obj2);
            }
            p155s1.f fVar = this.j;
            p155s1.f fVar2 = p155s1.f.f27237c;
            if (fVar != fVar2) {
                p155s1.f fVar3 = new p155s1.f();
                do {
                    com.google.common.util.concurrent.U u6 = f27242m;
                    u6.B0(fVar3, fVar);
                    if (u6.h0(this, fVar, fVar3)) {
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (!java.lang.Thread.interrupted()) {
                                obj = this.f27244h;
                            } else {
                                h(fVar3);
                                throw new java.lang.InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    fVar = this.j;
                } while (fVar != fVar2);
            }
            return e(this.f27244h);
        }
        throw new java.lang.InterruptedException();
    }
}
