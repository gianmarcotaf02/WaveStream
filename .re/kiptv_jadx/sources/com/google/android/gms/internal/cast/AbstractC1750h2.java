package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1750h2 extends com.google.android.gms.internal.cast.H implements com.google.common.util.concurrent.J {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f18918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.U f18919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.H f18920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final java.lang.Object f18921q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile java.lang.Object f18922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile com.google.android.gms.internal.cast.C1726b2 f18923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile com.google.android.gms.internal.cast.C1746g2 f18924m;

    static {
        boolean z6;
        com.google.android.gms.internal.cast.H c1734d2;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        int i3 = 9;
        try {
            z6 = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z6 = false;
        }
        f18918n = z6;
        f18919o = new com.google.android.gms.internal.cast.U();
        try {
            c1734d2 = new com.google.android.gms.internal.cast.C1742f2(i3);
            th = null;
            th2 = null;
        } catch (java.lang.Error | java.lang.Exception e6) {
            try {
                th2 = e6;
                c1734d2 = new com.google.android.gms.internal.cast.C1730c2(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.cast.C1746g2.class, java.lang.Thread.class, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.cast.C1746g2.class, com.google.android.gms.internal.cast.C1746g2.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.cast.AbstractC1750h2.class, com.google.android.gms.internal.cast.C1746g2.class, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_MANIFEST), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.cast.AbstractC1750h2.class, com.google.android.gms.internal.cast.C1726b2.class, androidx.media3.exoplayer.upstream.CmcdData.STREAM_TYPE_LIVE), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.cast.AbstractC1750h2.class, java.lang.Object.class, "k"));
                th = null;
            } catch (java.lang.Error | java.lang.Exception e9) {
                c1734d2 = new com.google.android.gms.internal.cast.C1734d2(i3);
                th = e9;
                th2 = e6;
            }
        }
        f18920p = c1734d2;
        if (th != null) {
            com.google.android.gms.internal.cast.U u6 = f18919o;
            java.util.logging.Logger loggerA = u6.a();
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            u6.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f18921q = new java.lang.Object();
    }

    public static final java.lang.Object A(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.android.gms.internal.cast.Y1) {
            java.lang.RuntimeException runtimeException = ((com.google.android.gms.internal.cast.Y1) obj).f18850b;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof com.google.android.gms.internal.cast.C1722a2) {
            throw new java.util.concurrent.ExecutionException(((com.google.android.gms.internal.cast.C1722a2) obj).f18864a);
        }
        if (obj == f18921q) {
            return null;
        }
        return obj;
    }

    public static java.lang.Object v(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2) {
        java.lang.Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = abstractC1750h2.get();
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

    public static void x(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2) {
        for (com.google.android.gms.internal.cast.C1746g2 c1746g2K = f18920p.k(abstractC1750h2); c1746g2K != null; c1746g2K = c1746g2K.f18915b) {
            java.lang.Thread thread = c1746g2K.f18914a;
            if (thread != null) {
                c1746g2K.f18914a = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
        }
        abstractC1750h2.u();
        com.google.android.gms.internal.cast.C1726b2 c1726b2D = f18920p.d(abstractC1750h2);
        com.google.android.gms.internal.cast.C1726b2 c1726b2 = null;
        while (c1726b2D != null) {
            com.google.android.gms.internal.cast.C1726b2 c1726b3 = c1726b2D.f18876c;
            c1726b2D.f18876c = c1726b2;
            c1726b2 = c1726b2D;
            c1726b2D = c1726b3;
        }
        while (c1726b2 != null) {
            java.lang.Runnable runnable = c1726b2.f18874a;
            com.google.android.gms.internal.cast.C1726b2 c1726b4 = c1726b2.f18876c;
            java.util.Objects.requireNonNull(runnable);
            java.util.concurrent.Executor executor = c1726b2.f18875b;
            java.util.Objects.requireNonNull(executor);
            y(runnable, executor);
            c1726b2 = c1726b4;
        }
    }

    public static void y(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e6) {
            f18919o.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", B2.a.m("RuntimeException while executing runnable ", java.lang.String.valueOf(runnable), " with executor ", java.lang.String.valueOf(executor)), (java.lang.Throwable) e6);
        }
    }

    @Override // com.google.common.util.concurrent.J
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.cast.C1726b2 c1726b2;
        com.google.android.gms.internal.cast.C1726b2 c1726b3;
        if (executor == null) {
            throw new java.lang.NullPointerException("Executor was null.");
        }
        if (!isDone() && (c1726b2 = this.f18923l) != (c1726b3 = com.google.android.gms.internal.cast.C1726b2.f18873d)) {
            com.google.android.gms.internal.cast.C1726b2 c1726b4 = new com.google.android.gms.internal.cast.C1726b2(runnable, executor);
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        com.google.android.gms.internal.cast.Y1 y9;
        java.lang.Object obj = this.f18922k;
        if (obj != null) {
            return false;
        }
        if (f18918n) {
            y9 = new com.google.android.gms.internal.cast.Y1(z6, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            y9 = z6 ? com.google.android.gms.internal.cast.Y1.f18847c : com.google.android.gms.internal.cast.Y1.f18848d;
            java.util.Objects.requireNonNull(y9);
        }
        if (!f18920p.r(this, obj, y9)) {
            return false;
        }
        x(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.f18922k;
        if (obj2 != null) {
            return A(obj2);
        }
        com.google.android.gms.internal.cast.C1746g2 c1746g2 = this.f18924m;
        com.google.android.gms.internal.cast.C1746g2 c1746g3 = com.google.android.gms.internal.cast.C1746g2.f18913c;
        if (c1746g2 != c1746g3) {
            com.google.android.gms.internal.cast.C1746g2 c1746g4 = new com.google.android.gms.internal.cast.C1746g2();
            do {
                com.google.android.gms.internal.cast.H h9 = f18920p;
                h9.m(c1746g4, c1746g2);
                if (h9.s(this, c1746g2, c1746g4)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            z(c1746g4);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.f18922k;
                    } while (obj == null);
                    return A(obj);
                }
                c1746g2 = this.f18924m;
            } while (c1746g2 != c1746g3);
        }
        java.lang.Object obj3 = this.f18922k;
        java.util.Objects.requireNonNull(obj3);
        return A(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f18922k instanceof com.google.android.gms.internal.cast.Y1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f18922k != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String t() {
        if (this instanceof java.util.concurrent.ScheduledFuture) {
            return B2.a.k(((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cast.H
    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f18922k instanceof com.google.android.gms.internal.cast.Y1) {
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
            } catch (java.lang.Exception | java.lang.StackOverflowError e6) {
                strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(e6.getClass()));
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

    public final void w(java.lang.StringBuilder sb) {
        try {
            java.lang.Object objV = v(this);
            sb.append("SUCCESS, result=[");
            if (objV == null) {
                sb.append("null");
            } else if (objV == this) {
                sb.append("this future");
            } else {
                sb.append(objV.getClass().getName());
                sb.append("@");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(objV)));
            }
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            sb.append("CANCELLED");
        } catch (java.util.concurrent.ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        } catch (java.lang.Exception e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final void z(com.google.android.gms.internal.cast.C1746g2 c1746g2) {
        c1746g2.f18914a = null;
        while (true) {
            com.google.android.gms.internal.cast.C1746g2 c1746g3 = this.f18924m;
            if (c1746g3 != com.google.android.gms.internal.cast.C1746g2.f18913c) {
                com.google.android.gms.internal.cast.C1746g2 c1746g4 = null;
                while (c1746g3 != null) {
                    com.google.android.gms.internal.cast.C1746g2 c1746g5 = c1746g3.f18915b;
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

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj = this.f18922k;
            if (obj != null) {
                return A(obj);
            }
            long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                com.google.android.gms.internal.cast.C1746g2 c1746g2 = this.f18924m;
                com.google.android.gms.internal.cast.C1746g2 c1746g3 = com.google.android.gms.internal.cast.C1746g2.f18913c;
                if (c1746g2 != c1746g3) {
                    com.google.android.gms.internal.cast.C1746g2 c1746g4 = new com.google.android.gms.internal.cast.C1746g2();
                    while (true) {
                        com.google.android.gms.internal.cast.H h9 = f18920p;
                        h9.m(c1746g4, c1746g2);
                        if (h9.s(this, c1746g2, c1746g4)) {
                            do {
                                java.util.concurrent.locks.LockSupport.parkNanos(this, java.lang.Math.min(nanos, 2147483647999999999L));
                                if (!java.lang.Thread.interrupted()) {
                                    java.lang.Object obj2 = this.f18922k;
                                    if (obj2 != null) {
                                        return A(obj2);
                                    }
                                    nanos = jNanoTime - java.lang.System.nanoTime();
                                } else {
                                    z(c1746g4);
                                    throw new java.lang.InterruptedException();
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
                java.lang.Object obj3 = this.f18922k;
                java.util.Objects.requireNonNull(obj3);
                return A(obj3);
            }
            while (nanos > 0) {
                java.lang.Object obj4 = this.f18922k;
                if (obj4 != null) {
                    return A(obj4);
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
