package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult<R extends E3.k> extends O2.g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final B4.a f18693x = new B4.a(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F3.HandlerC0365e f18695m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p199y3.n f18698p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E3.k f18700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.google.android.gms.common.api.Status f18701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f18702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f18703u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18704v;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Object f18694l = new java.lang.Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f18696n = new java.util.concurrent.CountDownLatch(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f18697o = new java.util.ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f18699q = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18705w = false;

    public BasePendingResult(F3.v vVar) {
        this.f18695m = new F3.HandlerC0365e(vVar != null ? vVar.f3640b.f2834f : android.os.Looper.getMainLooper(), 0);
        new java.lang.ref.WeakReference(vVar);
    }

    public final void i0(F3.o oVar) {
        synchronized (this.f18694l) {
            try {
                if (m0()) {
                    oVar.a(this.f18701s);
                } else {
                    this.f18697o.add(oVar);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void j0() {
        synchronized (this.f18694l) {
            try {
                if (!this.f18703u && !this.f18702t) {
                    this.f18703u = true;
                    q0(k0(com.google.android.gms.common.api.Status.f18689p));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public abstract E3.k k0(com.google.android.gms.common.api.Status status);

    public final void l0(com.google.android.gms.common.api.Status status) {
        synchronized (this.f18694l) {
            try {
                if (!m0()) {
                    n0(k0(status));
                    this.f18704v = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m0() {
        return this.f18696n.getCount() == 0;
    }

    public final void n0(E3.k kVar) {
        synchronized (this.f18694l) {
            try {
                if (this.f18704v || this.f18703u) {
                    return;
                }
                m0();
                H3.q.i("Results have already been set", !m0());
                H3.q.i("Result has already been consumed", !this.f18702t);
                q0(kVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void o0(p199y3.n nVar) {
        boolean z6;
        synchronized (this.f18694l) {
            try {
                H3.q.i("Result has already been consumed.", !this.f18702t);
                synchronized (this.f18694l) {
                    z6 = this.f18703u;
                }
                if (z6) {
                    return;
                }
                if (m0()) {
                    F3.HandlerC0365e handlerC0365e = this.f18695m;
                    E3.k kVarP0 = p0();
                    handlerC0365e.getClass();
                    handlerC0365e.sendMessage(handlerC0365e.obtainMessage(1, new android.util.Pair(nVar, kVarP0)));
                } else {
                    this.f18698p = nVar;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final E3.k p0() {
        E3.k kVar;
        synchronized (this.f18694l) {
            H3.q.i("Result has already been consumed.", !this.f18702t);
            H3.q.i("Result is not ready.", m0());
            kVar = this.f18700r;
            this.f18700r = null;
            this.f18698p = null;
            this.f18702t = true;
        }
        if (this.f18699q.getAndSet(null) != null) {
            throw new java.lang.ClassCastException();
        }
        H3.q.g(kVar);
        return kVar;
    }

    public final void q0(E3.k kVar) {
        this.f18700r = kVar;
        this.f18701s = kVar.getStatus();
        this.f18696n.countDown();
        if (this.f18703u) {
            this.f18698p = null;
        } else {
            p199y3.n nVar = this.f18698p;
            if (nVar != null) {
                F3.HandlerC0365e handlerC0365e = this.f18695m;
                handlerC0365e.removeMessages(2);
                handlerC0365e.sendMessage(handlerC0365e.obtainMessage(1, new android.util.Pair(nVar, p0())));
            }
        }
        java.util.ArrayList arrayList = this.f18697o;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((F3.o) arrayList.get(i3)).a(this.f18701s);
        }
        arrayList.clear();
    }
}
