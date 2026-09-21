package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public class I1 implements com.google.android.gms.internal.play_billing.U {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f19227k = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.logging.Logger f19228l = java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.I1.class.getName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p199y3.e f19229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final java.lang.Object f19230n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.Object f19231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.K0 f19232i;
    public volatile com.google.android.gms.internal.play_billing.H1 j;

    static {
        p199y3.e g9;
        try {
            g9 = new com.google.android.gms.internal.play_billing.C1851j1(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.H1.class, java.lang.Thread.class, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.H1.class, com.google.android.gms.internal.play_billing.H1.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.I1.class, com.google.android.gms.internal.play_billing.H1.class, "j"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.I1.class, com.google.android.gms.internal.play_billing.K0.class, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_INIT_SEGMENT), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.I1.class, java.lang.Object.class, androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_HLS));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            g9 = new com.google.android.gms.internal.play_billing.G1();
        }
        java.lang.Throwable th2 = th;
        f19229m = g9;
        if (th2 != null) {
            f19228l.logp(java.util.logging.Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f19230n = new java.lang.Object();
    }

    public static void c(com.google.android.gms.internal.play_billing.I1 i3) {
        com.google.android.gms.internal.play_billing.H1 h9;
        p199y3.e eVar;
        com.google.android.gms.internal.play_billing.K0 k1;
        com.google.android.gms.internal.play_billing.K0 k9;
        com.google.android.gms.internal.play_billing.K0 k10;
        do {
            h9 = i3.j;
            eVar = f19229m;
        } while (!eVar.K(i3, h9, com.google.android.gms.internal.play_billing.H1.f19223c));
        while (true) {
            k1 = null;
            if (h9 == null) {
                break;
            }
            java.lang.Thread thread = h9.f19224a;
            if (thread != null) {
                h9.f19224a = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            h9 = h9.f19225b;
        }
        do {
            k9 = i3.f19232i;
        } while (!eVar.I(i3, k9, com.google.android.gms.internal.play_billing.K0.f19246d));
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
            java.lang.Runnable runnable = k10.f19247a;
            com.google.android.gms.internal.play_billing.K0 k11 = k10.f19249c;
            e(runnable, k10.f19248b);
            k10 = k11;
        }
    }

    public static void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e6) {
            f19228l.logp(java.util.logging.Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", B2.a.m("RuntimeException while executing runnable ", java.lang.String.valueOf(runnable), " with executor ", java.lang.String.valueOf(executor)), (java.lang.Throwable) e6);
        }
    }

    public static final java.lang.Object g(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.android.gms.internal.play_billing.C1832d0) {
            java.util.concurrent.CancellationException cancellationException = ((com.google.android.gms.internal.play_billing.C1832d0) obj).f19317a;
            java.util.concurrent.CancellationException cancellationException2 = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.A0) {
            throw new java.util.concurrent.ExecutionException(((com.google.android.gms.internal.play_billing.A0) obj).f19188a);
        }
        if (obj == f19230n) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.U
    public final void a(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        executor.getClass();
        com.google.android.gms.internal.play_billing.K0 k1 = this.f19232i;
        com.google.android.gms.internal.play_billing.K0 k9 = com.google.android.gms.internal.play_billing.K0.f19246d;
        if (k1 != k9) {
            com.google.android.gms.internal.play_billing.K0 k10 = new com.google.android.gms.internal.play_billing.K0(runnable, executor);
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

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String b() {
        if (this instanceof java.util.concurrent.ScheduledFuture) {
            return B2.a.k(((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        com.google.android.gms.internal.play_billing.C1832d0 c1832d0;
        java.lang.Object obj = this.f19231h;
        if (obj != null) {
            return false;
        }
        if (f19227k) {
            c1832d0 = new com.google.android.gms.internal.play_billing.C1832d0(new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            c1832d0 = z6 ? com.google.android.gms.internal.play_billing.C1832d0.f19315b : com.google.android.gms.internal.play_billing.C1832d0.f19316c;
        }
        if (!f19229m.J(this, obj, c1832d0)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void d(java.lang.StringBuilder sb) {
        java.lang.Object obj;
        boolean z6 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    if (z6) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (java.util.concurrent.CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (java.lang.RuntimeException e6) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e6.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (java.util.concurrent.ExecutionException e9) {
                sb.append("FAILURE, cause=[");
                sb.append(e9.getCause());
                sb.append("]");
                return;
            }
        }
        if (z6) {
            java.lang.Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : java.lang.String.valueOf(obj));
        sb.append("]");
    }

    public final void f(com.google.android.gms.internal.play_billing.H1 h9) {
        h9.f19224a = null;
        while (true) {
            com.google.android.gms.internal.play_billing.H1 h10 = this.j;
            if (h10 != com.google.android.gms.internal.play_billing.H1.f19223c) {
                com.google.android.gms.internal.play_billing.H1 h11 = null;
                while (h10 != null) {
                    com.google.android.gms.internal.play_billing.H1 h12 = h10.f19225b;
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

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.f19231h;
        if (obj2 != null) {
            return g(obj2);
        }
        com.google.android.gms.internal.play_billing.H1 h9 = this.j;
        com.google.android.gms.internal.play_billing.H1 h10 = com.google.android.gms.internal.play_billing.H1.f19223c;
        if (h9 != h10) {
            com.google.android.gms.internal.play_billing.H1 h11 = new com.google.android.gms.internal.play_billing.H1();
            do {
                p199y3.e eVar = f19229m;
                eVar.G(h11, h9);
                if (eVar.K(this, h9, h11)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            f(h11);
                            throw new java.lang.InterruptedException();
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19231h instanceof com.google.android.gms.internal.play_billing.C1832d0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19231h != null;
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f19231h instanceof com.google.android.gms.internal.play_billing.C1832d0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                strConcat = b();
            } catch (java.lang.RuntimeException e6) {
                strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(e6.getClass()));
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

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj = this.f19231h;
            if (obj != null) {
                return g(obj);
            }
            long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                com.google.android.gms.internal.play_billing.H1 h9 = this.j;
                com.google.android.gms.internal.play_billing.H1 h10 = com.google.android.gms.internal.play_billing.H1.f19223c;
                if (h9 != h10) {
                    com.google.android.gms.internal.play_billing.H1 h11 = new com.google.android.gms.internal.play_billing.H1();
                    while (true) {
                        p199y3.e eVar = f19229m;
                        eVar.G(h11, h9);
                        if (eVar.K(this, h9, h11)) {
                            do {
                                java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                                if (!java.lang.Thread.interrupted()) {
                                    java.lang.Object obj2 = this.f19231h;
                                    if (obj2 != null) {
                                        return g(obj2);
                                    }
                                    nanos = jNanoTime - java.lang.System.nanoTime();
                                } else {
                                    f(h11);
                                    throw new java.lang.InterruptedException();
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
                java.lang.Object obj3 = this.f19231h;
                if (obj3 != null) {
                    return g(obj3);
                }
                if (!java.lang.Thread.interrupted()) {
                    nanos = jNanoTime - java.lang.System.nanoTime();
                } else {
                    throw new java.lang.InterruptedException();
                }
            }
            java.lang.String string = toString();
            java.lang.String string2 = timeUnit.toString();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = string2.toLowerCase(locale);
            java.lang.String strConcat = "Waited " + j + io.ktor.sse.ServerSentEventKt.SPACE + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                java.lang.String strConcat2 = strConcat.concat(" (plus ");
                long j9 = -nanos;
                long jConvert = timeUnit.convert(j9, java.util.concurrent.TimeUnit.NANOSECONDS);
                long nanos2 = j9 - timeUnit.toNanos(jConvert);
                boolean z6 = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z6 = false;
                }
                if (jConvert > 0) {
                    java.lang.String strConcat3 = strConcat2 + jConvert + io.ktor.sse.ServerSentEventKt.SPACE + lowerCase;
                    if (z6) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(io.ktor.sse.ServerSentEventKt.SPACE);
                }
                if (z6) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new java.util.concurrent.TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new java.util.concurrent.TimeoutException(p121o0.p.p(strConcat, " for ", string));
        }
        throw new java.lang.InterruptedException();
    }
}
