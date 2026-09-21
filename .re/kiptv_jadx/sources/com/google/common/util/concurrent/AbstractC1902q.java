package com.google.common.util.concurrent;

/* JADX INFO: renamed from: com.google.common.util.concurrent.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1902q extends p115n4.a implements com.google.common.util.concurrent.J {
    private static final com.google.common.util.concurrent.AbstractC1887b ATOMIC_HELPER;
    static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final java.lang.Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final com.google.common.util.concurrent.I log;
    private volatile com.google.common.util.concurrent.C1890e listeners;
    private volatile java.lang.Object value;
    private volatile com.google.common.util.concurrent.C1901p waiters;

    static {
        boolean z6;
        java.lang.Throwable th;
        com.google.common.util.concurrent.AbstractC1887b c1893h;
        try {
            z6 = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z6 = false;
        }
        GENERATE_CANCELLATION_CAUSES = z6;
        log = new com.google.common.util.concurrent.I(com.google.common.util.concurrent.AbstractC1902q.class);
        java.lang.Throwable th2 = null;
        try {
            c1893h = new com.google.common.util.concurrent.C1900o();
            th = null;
        } catch (java.lang.Error | java.lang.Exception e6) {
            th = e6;
            try {
                c1893h = new com.google.common.util.concurrent.C1891f(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.C1901p.class, java.lang.Thread.class, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.C1901p.class, com.google.common.util.concurrent.C1901p.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractC1902q.class, com.google.common.util.concurrent.C1901p.class, "waiters"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractC1902q.class, com.google.common.util.concurrent.C1890e.class, "listeners"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.common.util.concurrent.AbstractC1902q.class, java.lang.Object.class, "value"));
            } catch (java.lang.Error | java.lang.Exception e9) {
                th2 = e9;
                c1893h = new com.google.common.util.concurrent.C1893h();
            }
        }
        ATOMIC_HELPER = c1893h;
        if (th2 != null) {
            com.google.common.util.concurrent.I i3 = log;
            java.util.logging.Logger loggerA = i3.a();
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            i3.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        NULL = new java.lang.Object();
    }

    public static void d(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, boolean z6) {
        com.google.common.util.concurrent.C1890e c1890e = null;
        while (true) {
            abstractC1902q.getClass();
            for (com.google.common.util.concurrent.C1901p c1901pE = ATOMIC_HELPER.e(abstractC1902q); c1901pE != null; c1901pE = c1901pE.f19450b) {
                java.lang.Thread thread = c1901pE.f19449a;
                if (thread != null) {
                    c1901pE.f19449a = null;
                    java.util.concurrent.locks.LockSupport.unpark(thread);
                }
            }
            if (z6) {
                abstractC1902q.interruptTask();
                z6 = false;
            }
            abstractC1902q.afterDone();
            com.google.common.util.concurrent.C1890e c1890e2 = c1890e;
            com.google.common.util.concurrent.C1890e c1890eD = ATOMIC_HELPER.d(abstractC1902q);
            com.google.common.util.concurrent.C1890e c1890e3 = c1890e2;
            while (c1890eD != null) {
                com.google.common.util.concurrent.C1890e c1890e4 = c1890eD.f19434c;
                c1890eD.f19434c = c1890e3;
                c1890e3 = c1890eD;
                c1890eD = c1890e4;
            }
            while (c1890e3 != null) {
                c1890e = c1890e3.f19434c;
                java.lang.Runnable runnable = c1890e3.f19432a;
                java.util.Objects.requireNonNull(runnable);
                if (runnable instanceof com.google.common.util.concurrent.RunnableC1892g) {
                    com.google.common.util.concurrent.RunnableC1892g runnableC1892g = (com.google.common.util.concurrent.RunnableC1892g) runnable;
                    abstractC1902q = runnableC1892g.f19440h;
                    if (abstractC1902q.value == runnableC1892g) {
                        if (ATOMIC_HELPER.b(abstractC1902q, runnableC1892g, g(runnableC1892g.f19441i))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    java.util.concurrent.Executor executor = c1890e3.f19433b;
                    java.util.Objects.requireNonNull(executor);
                    e(runnable, executor);
                }
                c1890e3 = c1890e;
            }
            return;
        }
    }

    public static void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e6) {
            log.a().log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e6);
        }
    }

    public static java.lang.Object f(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.common.util.concurrent.C1888c) {
            java.lang.RuntimeException runtimeException = ((com.google.common.util.concurrent.C1888c) obj).f19428b;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof com.google.common.util.concurrent.C1889d) {
            throw new java.util.concurrent.ExecutionException(((com.google.common.util.concurrent.C1889d) obj).f19430a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object g(com.google.common.util.concurrent.J j) {
        java.lang.Throwable thTryInternalFastPathGetFailure;
        if (j instanceof com.google.common.util.concurrent.InterfaceC1894i) {
            java.lang.Object c1888c = ((com.google.common.util.concurrent.AbstractC1902q) j).value;
            if (c1888c instanceof com.google.common.util.concurrent.C1888c) {
                com.google.common.util.concurrent.C1888c c1888c2 = (com.google.common.util.concurrent.C1888c) c1888c;
                if (c1888c2.f19427a) {
                    c1888c = c1888c2.f19428b != null ? new com.google.common.util.concurrent.C1888c(false, c1888c2.f19428b) : com.google.common.util.concurrent.C1888c.f19426d;
                }
            }
            java.util.Objects.requireNonNull(c1888c);
            return c1888c;
        }
        if ((j instanceof p115n4.a) && (thTryInternalFastPathGetFailure = ((p115n4.a) j).tryInternalFastPathGetFailure()) != null) {
            return new com.google.common.util.concurrent.C1889d(thTryInternalFastPathGetFailure);
        }
        boolean zIsCancelled = j.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            com.google.common.util.concurrent.C1888c c1888c3 = com.google.common.util.concurrent.C1888c.f19426d;
            java.util.Objects.requireNonNull(c1888c3);
            return c1888c3;
        }
        try {
            try {
                try {
                    java.lang.Object objH = h(j);
                    if (!zIsCancelled) {
                        return objH == null ? NULL : objH;
                    }
                    return new com.google.common.util.concurrent.C1888c(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + j));
                } catch (java.lang.Error | java.lang.Exception e6) {
                    e = e6;
                    return new com.google.common.util.concurrent.C1889d(e);
                }
            } catch (java.lang.Error e9) {
                e = e9;
                return new com.google.common.util.concurrent.C1889d(e);
            }
        } catch (java.util.concurrent.CancellationException e10) {
            if (zIsCancelled) {
                return new com.google.common.util.concurrent.C1888c(false, e10);
            }
            return new com.google.common.util.concurrent.C1889d(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + j, e10));
        } catch (java.util.concurrent.ExecutionException e11) {
            if (!zIsCancelled) {
                return new com.google.common.util.concurrent.C1889d(e11.getCause());
            }
            return new com.google.common.util.concurrent.C1888c(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + j, e11));
        }
    }

    public static java.lang.Object h(com.google.common.util.concurrent.J j) {
        java.lang.Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = j.get();
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
    public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.common.util.concurrent.C1890e c1890e;
        com.google.common.util.concurrent.C1890e c1890e2;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(runnable, "Runnable was null.");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(executor, "Executor was null.");
        if (!isDone() && (c1890e = this.listeners) != (c1890e2 = com.google.common.util.concurrent.C1890e.f19431d)) {
            com.google.common.util.concurrent.C1890e c1890e3 = new com.google.common.util.concurrent.C1890e(runnable, executor);
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

    public final void b(java.lang.StringBuilder sb) {
        try {
            java.lang.Object objH = h(this);
            sb.append("SUCCESS, result=[");
            c(objH, sb);
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

    public final void c(java.lang.Object obj, java.lang.StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        com.google.common.util.concurrent.C1888c c1888c;
        java.lang.Object obj = this.value;
        if (!(obj == null) && !(obj instanceof com.google.common.util.concurrent.RunnableC1892g)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            c1888c = new com.google.common.util.concurrent.C1888c(z6, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            c1888c = z6 ? com.google.common.util.concurrent.C1888c.f19425c : com.google.common.util.concurrent.C1888c.f19426d;
            java.util.Objects.requireNonNull(c1888c);
        }
        com.google.common.util.concurrent.AbstractC1902q abstractC1902q = this;
        boolean z9 = false;
        while (true) {
            if (ATOMIC_HELPER.b(abstractC1902q, obj, c1888c)) {
                d(abstractC1902q, z6);
                if (obj instanceof com.google.common.util.concurrent.RunnableC1892g) {
                    com.google.common.util.concurrent.J j = ((com.google.common.util.concurrent.RunnableC1892g) obj).f19441i;
                    if (j instanceof com.google.common.util.concurrent.InterfaceC1894i) {
                        abstractC1902q = (com.google.common.util.concurrent.AbstractC1902q) j;
                        obj = abstractC1902q.value;
                        if ((obj == null) | (obj instanceof com.google.common.util.concurrent.RunnableC1892g)) {
                            z9 = true;
                        }
                    } else {
                        j.cancel(z6);
                    }
                }
                return true;
            }
            obj = abstractC1902q.value;
            if (!(obj instanceof com.google.common.util.concurrent.RunnableC1892g)) {
                return z9;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        boolean z6;
        long j9;
        long nanos = timeUnit.toNanos(j);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.value;
        if ((obj != null) && (!(obj instanceof com.google.common.util.concurrent.RunnableC1892g))) {
            return f(obj);
        }
        long j10 = 0;
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            com.google.common.util.concurrent.C1901p c1901p = this.waiters;
            com.google.common.util.concurrent.C1901p c1901p2 = com.google.common.util.concurrent.C1901p.f19448c;
            if (c1901p != c1901p2) {
                com.google.common.util.concurrent.C1901p c1901p3 = new com.google.common.util.concurrent.C1901p();
                z6 = true;
                while (true) {
                    ATOMIC_HELPER.f(c1901p3, c1901p);
                    if (ATOMIC_HELPER.c(this, c1901p, c1901p3)) {
                        j9 = j10;
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, java.lang.Math.min(nanos, 2147483647999999999L));
                            if (java.lang.Thread.interrupted()) {
                                i(c1901p3);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof com.google.common.util.concurrent.RunnableC1892g))) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
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
            java.lang.Object obj3 = this.value;
            java.util.Objects.requireNonNull(obj3);
            return f(obj3);
        }
        z6 = true;
        j9 = 0;
        while (nanos > j9) {
            java.lang.Object obj4 = this.value;
            if ((obj4 != null ? z6 : false) && (!(obj4 instanceof com.google.common.util.concurrent.RunnableC1892g))) {
                return f(obj4);
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
        if (nanos + 1000 < j9) {
            java.lang.String strO = p121o0.p.o(string3, " (plus ");
            long j12 = -nanos;
            long jConvert = timeUnit.convert(j12, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j12 - timeUnit.toNanos(jConvert);
            boolean z9 = (jConvert == j9 || nanos2 > 1000) ? z6 : false;
            if (jConvert > j9) {
                java.lang.String strO2 = strO + jConvert + io.ktor.sse.ServerSentEventKt.SPACE + lowerCase;
                if (z9) {
                    strO2 = p121o0.p.o(strO2, ",");
                }
                strO = p121o0.p.o(strO2, io.ktor.sse.ServerSentEventKt.SPACE);
            }
            if (z9) {
                strO = strO + nanos2 + " nanoseconds ";
            }
            string3 = p121o0.p.o(strO, "delay)");
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(p121o0.p.o(string3, " but future completed as timeout expired"));
        }
        throw new java.util.concurrent.TimeoutException(p121o0.p.p(string3, " for ", string));
    }

    public final void i(com.google.common.util.concurrent.C1901p c1901p) {
        c1901p.f19449a = null;
        while (true) {
            com.google.common.util.concurrent.C1901p c1901p2 = this.waiters;
            if (c1901p2 == com.google.common.util.concurrent.C1901p.f19448c) {
                return;
            }
            com.google.common.util.concurrent.C1901p c1901p3 = null;
            while (c1901p2 != null) {
                com.google.common.util.concurrent.C1901p c1901p4 = c1901p2.f19450b;
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

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof com.google.common.util.concurrent.C1888c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        java.lang.Object obj = this.value;
        return (!(obj instanceof com.google.common.util.concurrent.RunnableC1892g)) & (obj != null);
    }

    public final void maybePropagateCancellationTo(java.util.concurrent.Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.String pendingToString() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(java.lang.Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, obj)) {
            return false;
        }
        d(this, false);
        return true;
    }

    public boolean setException(java.lang.Throwable th) {
        th.getClass();
        if (!ATOMIC_HELPER.b(this, null, new com.google.common.util.concurrent.C1889d(th))) {
            return false;
        }
        d(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean setFuture(com.google.common.util.concurrent.J j) {
        com.google.common.util.concurrent.C1889d c1889d;
        j.getClass();
        java.lang.Object obj = this.value;
        if (obj != null) {
            if (obj instanceof com.google.common.util.concurrent.C1888c) {
                j.cancel(((com.google.common.util.concurrent.C1888c) obj).f19427a);
            }
        } else if (j.isDone()) {
            if (ATOMIC_HELPER.b(this, null, g(j))) {
                d(this, false);
                return true;
            }
        } else {
            com.google.common.util.concurrent.RunnableC1892g runnableC1892g = new com.google.common.util.concurrent.RunnableC1892g(this, j);
            if (ATOMIC_HELPER.b(this, null, runnableC1892g)) {
                try {
                    j.addListener(runnableC1892g, com.google.common.util.concurrent.z.f19464h);
                    return true;
                } catch (java.lang.Throwable th) {
                    try {
                        c1889d = new com.google.common.util.concurrent.C1889d(th);
                    } catch (java.lang.Error | java.lang.Exception unused) {
                        c1889d = com.google.common.util.concurrent.C1889d.f19429b;
                    }
                    ATOMIC_HELPER.b(this, runnableC1892g, c1889d);
                    return true;
                }
            }
            obj = this.value;
            if (obj instanceof com.google.common.util.concurrent.C1888c) {
                j.cancel(((com.google.common.util.concurrent.C1888c) obj).f19427a);
            }
        }
        return false;
    }

    public java.lang.String toString() {
        java.lang.String strPendingToString;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            java.lang.Object obj = this.value;
            if (obj instanceof com.google.common.util.concurrent.RunnableC1892g) {
                sb.append(", setFuture=[");
                com.google.common.util.concurrent.J j = ((com.google.common.util.concurrent.RunnableC1892g) obj).f19441i;
                try {
                    if (j == this) {
                        sb.append("this future");
                    } else {
                        sb.append(j);
                    }
                } catch (java.lang.Exception e6) {
                    e = e6;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (java.lang.StackOverflowError e9) {
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
                } catch (java.lang.Exception | java.lang.StackOverflowError e10) {
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

    @Override // p115n4.a
    public final java.lang.Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof com.google.common.util.concurrent.InterfaceC1894i)) {
            return null;
        }
        java.lang.Object obj = this.value;
        if (obj instanceof com.google.common.util.concurrent.C1889d) {
            return ((com.google.common.util.concurrent.C1889d) obj).f19430a;
        }
        return null;
    }

    public final boolean wasInterrupted() {
        java.lang.Object obj = this.value;
        return (obj instanceof com.google.common.util.concurrent.C1888c) && ((com.google.common.util.concurrent.C1888c) obj).f19427a;
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (!java.lang.Thread.interrupted()) {
            java.lang.Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof com.google.common.util.concurrent.RunnableC1892g))) {
                return f(obj2);
            }
            com.google.common.util.concurrent.C1901p c1901p = this.waiters;
            com.google.common.util.concurrent.C1901p c1901p2 = com.google.common.util.concurrent.C1901p.f19448c;
            if (c1901p != c1901p2) {
                com.google.common.util.concurrent.C1901p c1901p3 = new com.google.common.util.concurrent.C1901p();
                do {
                    ATOMIC_HELPER.f(c1901p3, c1901p);
                    if (ATOMIC_HELPER.c(this, c1901p, c1901p3)) {
                        do {
                            java.util.concurrent.locks.LockSupport.park(this);
                            if (!java.lang.Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                i(c1901p3);
                                throw new java.lang.InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof com.google.common.util.concurrent.RunnableC1892g))));
                        return f(obj);
                    }
                    c1901p = this.waiters;
                } while (c1901p != c1901p2);
            }
            java.lang.Object obj3 = this.value;
            java.util.Objects.requireNonNull(obj3);
            return f(obj3);
        }
        throw new java.lang.InterruptedException();
    }
}
