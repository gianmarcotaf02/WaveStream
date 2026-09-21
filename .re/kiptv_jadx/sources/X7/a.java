package X7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N6.A f10898a = new N6.A("CLOSED", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N6.A f10899b = new N6.A("UNDEFINED", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N6.A f10900c = new N6.A("REUSABLE_CLAIMED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N6.A f10901d = new N6.A("NO_THREAD_ELEMENTS", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B.C0063a f10902e = new B.C0063a(28);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B.C0063a f10903f = new B.C0063a(29);
    public static final X7.t g = new X7.t(0);

    public static final void a(int i3) {
        if (i3 < 1) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final java.lang.Object b(X7.q qVar, long j, p194x6.m mVar) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (qVar.j >= j && !qVar.d()) {
                return qVar;
            }
            java.lang.Object obj = X7.b.f10904h.get(qVar);
            N6.A a2 = f10898a;
            if (obj == a2) {
                return a2;
            }
            X7.q qVar2 = (X7.q) ((X7.b) obj);
            if (qVar2 == null) {
                qVar2 = (X7.q) mVar.invoke(java.lang.Long.valueOf(qVar.j + 1), qVar);
                do {
                    atomicReferenceFieldUpdater = X7.b.f10904h;
                    if (atomicReferenceFieldUpdater.compareAndSet(qVar, null, qVar2)) {
                        if (qVar.d()) {
                            qVar.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(qVar) == null);
            }
            qVar = qVar2;
        }
    }

    public static final X7.q c(java.lang.Object obj) {
        if (obj != f10898a) {
            return (X7.q) obj;
        }
        throw new java.lang.IllegalStateException("Does not contain segment");
    }

    public static final void d(p100l6.h hVar, java.lang.Throwable th) {
        java.lang.Throwable runtimeException;
        java.util.Iterator it = X7.d.f10907a.iterator();
        while (it.hasNext()) {
            try {
                ((S7.InterfaceC0908y) it.next()).handleException(hVar, th);
            } catch (java.lang.Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
                    com.google.common.util.concurrent.AbstractC1903s.j(runtimeException, th);
                }
                java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            com.google.common.util.concurrent.AbstractC1903s.j(th, new X7.e(hVar));
        } catch (java.lang.Throwable unused) {
        }
        java.lang.Thread threadCurrentThread2 = java.lang.Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(java.lang.Object obj) {
        return obj == f10898a;
    }

    public static final java.lang.Object f(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof java.util.ArrayList) {
            ((java.util.ArrayList) obj).add(obj2);
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(p100l6.h hVar, java.lang.Object obj) {
        if (obj == f10901d) {
            return;
        }
        if (!(obj instanceof X7.v)) {
            java.lang.Object objFold = hVar.fold(null, f10903f);
            kotlin.jvm.internal.m.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((p018b8.a) objFold).V(obj);
            return;
        }
        X7.v vVar = (X7.v) obj;
        p018b8.a[] aVarArr = vVar.f10941c;
        int length = aVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            p018b8.a aVar = aVarArr[length];
            kotlin.jvm.internal.m.b(aVar);
            aVar.V(vVar.f10940b[length]);
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }

    public static final void h(java.lang.Object obj, p100l6.c cVar) throws S7.J {
        if (!(cVar instanceof X7.f)) {
            cVar.resumeWith(obj);
            return;
        }
        X7.f fVar = (X7.f) cVar;
        java.lang.Throwable thA = p070h6.n.a(obj);
        java.lang.Object c0903t = thA == null ? obj : new S7.C0903t(thA, false);
        S7.AbstractC0906w abstractC0906w = fVar.f10910k;
        p117n6.c cVar2 = fVar.f10911l;
        if (j(abstractC0906w, cVar2.getContext())) {
            fVar.f10912m = c0903t;
            fVar.j = 1;
            i(abstractC0906w, cVar2.getContext(), fVar);
            return;
        }
        S7.X xA = S7.z0.a();
        if (xA.f9563i >= 4294967296L) {
            fVar.f10912m = c0903t;
            fVar.j = 1;
            xA.a0(fVar);
            return;
        }
        xA.c0(true);
        try {
            S7.InterfaceC0891h0 interfaceC0891h0 = (S7.InterfaceC0891h0) cVar2.getContext().get(S7.C0889g0.f9584h);
            if (interfaceC0891h0 == null || interfaceC0891h0.isActive()) {
                java.lang.Object obj2 = fVar.f10913n;
                p100l6.h context = cVar2.getContext();
                java.lang.Object objN = n(context, obj2);
                S7.F0 f0J = objN != f10901d ? S7.C.J(cVar2, context, objN) : null;
                try {
                    cVar2.resumeWith(obj);
                    if (f0J == null || f0J.d0()) {
                        g(context, objN);
                    }
                } catch (java.lang.Throwable th) {
                    if (f0J == null || f0J.d0()) {
                        g(context, objN);
                    }
                    throw th;
                }
            } else {
                fVar.resumeWith(com.google.common.util.concurrent.P.T(interfaceC0891h0.t()));
            }
            while (xA.e0()) {
            }
        } catch (java.lang.Throwable th2) {
            try {
                fVar.f(th2);
            } finally {
                xA.Z(true);
            }
        }
    }

    public static final void i(S7.AbstractC0906w abstractC0906w, p100l6.h hVar, java.lang.Runnable runnable) throws S7.J {
        try {
            abstractC0906w.V(hVar, runnable);
        } catch (java.lang.Throwable th) {
            throw new S7.J(th, abstractC0906w, hVar);
        }
    }

    public static final boolean j(S7.AbstractC0906w abstractC0906w, p100l6.h hVar) throws S7.J {
        try {
            return abstractC0906w.X(hVar);
        } catch (java.lang.Throwable th) {
            throw new S7.J(th, abstractC0906w, hVar);
        }
    }

    public static final long k(java.lang.String str, long j, long j9, long j10) {
        java.lang.String property;
        int i3 = X7.s.f10935a;
        try {
            property = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        java.lang.Long lA0 = O7.x.A0(property);
        if (lA0 == null) {
            throw new java.lang.IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lA0.longValue();
        if (j9 <= jLongValue && jLongValue <= j10) {
            return jLongValue;
        }
        throw new java.lang.IllegalStateException(("System property '" + str + "' should be in range " + j9 + ".." + j10 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int l(int i3, int i9, java.lang.String str) {
        return (int) k(str, i3, 1, (i9 & 8) != 0 ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : 2097150);
    }

    public static final java.lang.Object m(p100l6.h hVar) {
        java.lang.Object objFold = hVar.fold(0, f10902e);
        kotlin.jvm.internal.m.b(objFold);
        return objFold;
    }

    public static final java.lang.Object n(p100l6.h hVar, java.lang.Object obj) {
        if (obj == null) {
            obj = m(hVar);
        }
        if (obj == 0) {
            return f10901d;
        }
        return obj instanceof java.lang.Integer ? hVar.fold(new X7.v(((java.lang.Number) obj).intValue(), hVar), g) : ((p018b8.a) obj).X(hVar);
    }
}
