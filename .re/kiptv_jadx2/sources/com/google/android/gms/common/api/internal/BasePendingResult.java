package com.google.android.gms.common.api.internal;

import B4.a;
import E3.k;
import F3.HandlerC0365e;
import F3.o;
import F3.v;
import H3.q;
import O2.g;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p199y3.n;

public abstract class BasePendingResult<R extends k> extends g {

    public static final a f18693x = new a(6);

    public final HandlerC0365e f18695m;

    public n f18698p;

    public k f18700r;

    public Status f18701s;

    public volatile boolean f18702t;

    public boolean f18703u;

    public boolean f18704v;

    public final Object f18694l = new Object();

    public final CountDownLatch f18696n = new CountDownLatch(1);

    public final ArrayList f18697o = new ArrayList();

    public final AtomicReference f18699q = new AtomicReference();

    public boolean f18705w = false;

    public BasePendingResult(v vVar) {
        this.f18695m = new HandlerC0365e(vVar != null ? vVar.f3640b.f2834f : Looper.getMainLooper(), 0);
        new WeakReference(vVar);
    }

    public final void i0(o oVar) {
        synchronized (this.f18694l) {
            try {
                if (m0()) {
                    oVar.a(this.f18701s);
                } else {
                    this.f18697o.add(oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j0() {
        synchronized (this.f18694l) {
            try {
                if (!this.f18703u && !this.f18702t) {
                    this.f18703u = true;
                    q0(k0(Status.f18689p));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract k k0(Status status);

    public final void l0(Status status) {
        synchronized (this.f18694l) {
            try {
                if (!m0()) {
                    n0(k0(status));
                    this.f18704v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m0() {
        return this.f18696n.getCount() == 0;
    }

    public final void n0(k kVar) {
        synchronized (this.f18694l) {
            try {
                if (this.f18704v || this.f18703u) {
                    return;
                }
                m0();
                q.i("Results have already been set", !m0());
                q.i("Result has already been consumed", !this.f18702t);
                q0(kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o0(n nVar) {
        boolean z6;
        synchronized (this.f18694l) {
            try {
                q.i("Result has already been consumed.", !this.f18702t);
                synchronized (this.f18694l) {
                    z6 = this.f18703u;
                }
                if (z6) {
                    return;
                }
                if (m0()) {
                    HandlerC0365e handlerC0365e = this.f18695m;
                    k kVarP0 = p0();
                    handlerC0365e.getClass();
                    handlerC0365e.sendMessage(handlerC0365e.obtainMessage(1, new Pair(nVar, kVarP0)));
                } else {
                    this.f18698p = nVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final k p0() {
        k kVar;
        synchronized (this.f18694l) {
            q.i("Result has already been consumed.", !this.f18702t);
            q.i("Result is not ready.", m0());
            kVar = this.f18700r;
            this.f18700r = null;
            this.f18698p = null;
            this.f18702t = true;
        }
        if (this.f18699q.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        q.g(kVar);
        return kVar;
    }

    public final void q0(k kVar) {
        this.f18700r = kVar;
        this.f18701s = kVar.getStatus();
        this.f18696n.countDown();
        if (this.f18703u) {
            this.f18698p = null;
        } else {
            n nVar = this.f18698p;
            if (nVar != null) {
                HandlerC0365e handlerC0365e = this.f18695m;
                handlerC0365e.removeMessages(2);
                handlerC0365e.sendMessage(handlerC0365e.obtainMessage(1, new Pair(nVar, p0())));
            }
        }
        ArrayList arrayList = this.f18697o;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((o) arrayList.get(i3)).a(this.f18701s);
        }
        arrayList.clear();
    }
}
