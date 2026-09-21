package F3;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p136q.C2661e;
import p136q.C2662f;

public final class s implements E3.g, E3.h {

    public final E3.c f3622d;

    public final C0362b f3623e;

    public final S.p f3624f;

    public final int f3626i;
    public final D j;

    public boolean f3627k;

    public final C0366f f3631o;

    public final LinkedList f3621c = new LinkedList();
    public final HashSet g = new HashSet();

    public final HashMap f3625h = new HashMap();

    public final ArrayList f3628l = new ArrayList();

    public D3.b f3629m = null;

    public int f3630n = 0;

    public s(C0366f c0366f, E3.f fVar) {
        this.f3631o = c0366f;
        Looper looper = c0366f.f3596u.getLooper();
        android.support.v4.media.session.q qVarA = fVar.a();
        p179v4.o oVar = new p179v4.o((String) qVarA.j, (String) qVarA.f15618k, (C2662f) qVarA.f15617i);
        N3.a aVar = (N3.a) fVar.f2831c.f9153i;
        H3.q.g(aVar);
        E3.c cVarL = aVar.l(fVar.f2829a, looper, oVar, fVar.f2832d, this, this);
        String str = fVar.f2830b;
        if (str != null && (cVarL instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) cVarL).f18729z = str;
        }
        if (str != null && (cVarL instanceof AbstractServiceConnectionC0370j)) {
            B2.a.u(cVarL);
            throw null;
        }
        this.f3622d = cVarL;
        this.f3623e = fVar.f2833e;
        this.f3624f = new S.p(14);
        this.f3626i = fVar.g;
        if (!cVarL.k()) {
            this.j = null;
            return;
        }
        Context context = c0366f.f3587l;
        Z3.d dVar = c0366f.f3596u;
        android.support.v4.media.session.q qVarA2 = fVar.a();
        this.j = new D(context, dVar, new p179v4.o((String) qVarA2.j, (String) qVarA2.f15618k, (C2662f) qVarA2.f15617i));
    }

    @Override
    public final void J(int i3) {
        Looper looperMyLooper = Looper.myLooper();
        C0366f c0366f = this.f3631o;
        if (looperMyLooper == c0366f.f3596u.getLooper()) {
            g(i3);
        } else {
            c0366f.f3596u.post(new A1.a(this, i3, 2));
        }
    }

    public final D3.d a(D3.d[] dVarArr) {
        if (dVarArr == null || dVarArr.length == 0) {
            return null;
        }
        D3.d[] dVarArrI = this.f3622d.i();
        if (dVarArrI == null) {
            dVarArrI = new D3.d[0];
        }
        C2661e c2661e = new C2661e(dVarArrI.length);
        for (D3.d dVar : dVarArrI) {
            c2661e.put(dVar.f2102h, Long.valueOf(dVar.a()));
        }
        for (D3.d dVar2 : dVarArr) {
            Long l2 = (Long) c2661e.get(dVar2.f2102h);
            if (l2 == null || l2.longValue() < dVar2.a()) {
                return dVar2;
            }
        }
        return null;
    }

    public final void b(D3.b bVar) {
        HashSet hashSet = this.g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (H3.q.j(bVar, D3.b.f2095m)) {
                this.f3622d.e();
            }
            throw null;
        }
    }

    public final void c(Status status) {
        H3.q.c(this.f3631o.f3596u);
        d(status, null, false);
    }

    public final void d(Status status, RuntimeException runtimeException, boolean z6) {
        H3.q.c(this.f3631o.f3596u);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f3621c.iterator();
        while (it.hasNext()) {
            H h9 = (H) it.next();
            if (!z6 || h9.f3566a == 2) {
                if (status != null) {
                    h9.a(status);
                } else {
                    h9.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void e() {
        LinkedList linkedList = this.f3621c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            H h9 = (H) arrayList.get(i3);
            if (!this.f3622d.isConnected()) {
                return;
            }
            if (i(h9)) {
                linkedList.remove(h9);
            }
        }
    }

    public final void f() {
        E3.c cVar = this.f3622d;
        C0366f c0366f = this.f3631o;
        H3.q.c(c0366f.f3596u);
        this.f3629m = null;
        b(D3.b.f2095m);
        if (this.f3627k) {
            Z3.d dVar = c0366f.f3596u;
            C0362b c0362b = this.f3623e;
            dVar.removeMessages(11, c0362b);
            c0366f.f3596u.removeMessages(9, c0362b);
            this.f3627k = false;
        }
        Iterator it = this.f3625h.values().iterator();
        while (it.hasNext()) {
            B b9 = (B) it.next();
            if (a((D3.d[]) b9.f3550a.j) != null) {
                it.remove();
            } else {
                try {
                    android.support.v4.media.session.q qVar = b9.f3550a;
                    ((p008a8.c) ((C0371k) qVar.f15618k).f3601b).K(cVar, new p059g4.d());
                } catch (DeadObjectException unused) {
                    J(3);
                    cVar.b("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        e();
        h();
    }

    public final void g(int i3) {
        C0366f c0366f = this.f3631o;
        H3.q.c(c0366f.f3596u);
        this.f3629m = null;
        this.f3627k = true;
        String strJ = this.f3622d.j();
        S.p pVar = this.f3624f;
        pVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i3 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i3 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strJ != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strJ);
        }
        pVar.t(true, new Status(20, sb.toString(), null, null));
        Z3.d dVar = c0366f.f3596u;
        C0362b c0362b = this.f3623e;
        dVar.sendMessageDelayed(Message.obtain(dVar, 9, c0362b), 5000L);
        Z3.d dVar2 = c0366f.f3596u;
        dVar2.sendMessageDelayed(Message.obtain(dVar2, 11, c0362b), 120000L);
        ((SparseIntArray) c0366f.f3589n.f9153i).clear();
        Iterator it = this.f3625h.values().iterator();
        while (it.hasNext()) {
            ((B) it.next()).getClass();
        }
    }

    public final void h() {
        C0366f c0366f = this.f3631o;
        Z3.d dVar = c0366f.f3596u;
        C0362b c0362b = this.f3623e;
        dVar.removeMessages(12, c0362b);
        Z3.d dVar2 = c0366f.f3596u;
        dVar2.sendMessageDelayed(dVar2.obtainMessage(12, c0362b), c0366f.f3584h);
    }

    public final boolean i(H h9) {
        if (h9 instanceof x) {
            x xVar = (x) h9;
            D3.d dVarA = a(xVar.g(this));
            if (dVarA != null) {
                Log.w("GoogleApiManager", this.f3622d.getClass().getName() + " could not execute call because it requires feature (" + dVarA.f2102h + ", " + dVarA.a() + ").");
                if (!this.f3631o.f3597v || !xVar.f(this)) {
                    xVar.b(new E3.l(dVarA));
                    return true;
                }
                t tVar = new t(this.f3623e, dVarA);
                int iIndexOf = this.f3628l.indexOf(tVar);
                if (iIndexOf >= 0) {
                    t tVar2 = (t) this.f3628l.get(iIndexOf);
                    this.f3631o.f3596u.removeMessages(15, tVar2);
                    Z3.d dVar = this.f3631o.f3596u;
                    dVar.sendMessageDelayed(Message.obtain(dVar, 15, tVar2), 5000L);
                    return false;
                }
                this.f3628l.add(tVar);
                Z3.d dVar2 = this.f3631o.f3596u;
                dVar2.sendMessageDelayed(Message.obtain(dVar2, 15, tVar), 5000L);
                Z3.d dVar3 = this.f3631o.f3596u;
                dVar3.sendMessageDelayed(Message.obtain(dVar3, 16, tVar), 120000L);
                D3.b bVar = new D3.b(2, null, null);
                if (j(bVar)) {
                    return false;
                }
                this.f3631o.c(bVar, this.f3626i);
                return false;
            }
            E3.c cVar = this.f3622d;
            h9.d(this.f3624f, cVar.k());
            try {
                h9.c(this);
                return true;
            } catch (DeadObjectException unused) {
                J(1);
                cVar.b("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            E3.c cVar2 = this.f3622d;
            h9.d(this.f3624f, cVar2.k());
            try {
                h9.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                J(1);
                cVar2.b("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    public final boolean j(D3.b bVar) {
        AtomicReference atomicReference;
        synchronized (C0366f.y) {
            try {
                C0366f c0366f = this.f3631o;
                if (c0366f.f3593r == null || !c0366f.f3594s.contains(this.f3623e)) {
                    return false;
                }
                p pVar = this.f3631o.f3593r;
                int i3 = this.f3626i;
                pVar.getClass();
                I i9 = new I(bVar, i3);
                loop0: do {
                    atomicReference = pVar.j;
                    do {
                        if (atomicReference.compareAndSet(null, i9)) {
                            pVar.f3614k.post(new com.google.common.util.concurrent.C(7, pVar, i9, false));
                            break loop0;
                        }
                    } while (atomicReference.get() == null);
                } while (atomicReference.get() == null);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        C0366f c0366f = this.f3631o;
        H3.q.c(c0366f.f3596u);
        E3.c cVar = this.f3622d;
        if (cVar.isConnected() || cVar.d()) {
            return;
        }
        try {
            S.p pVar = c0366f.f3589n;
            Context context = c0366f.f3587l;
            pVar.getClass();
            H3.q.g(context);
            int iH = cVar.h();
            SparseIntArray sparseIntArray = (SparseIntArray) pVar.f9153i;
            int iB = sparseIntArray.get(iH, -1);
            if (iB == -1) {
                iB = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseIntArray.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i3);
                    if (iKeyAt > iH && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (iB == -1) {
                    iB = ((D3.e) pVar.j).b(context, iH);
                }
                sparseIntArray.put(iH, iB);
            }
            if (iB != 0) {
                D3.b bVar = new D3.b(iB, null, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + bVar.toString());
                n(bVar, null);
                return;
            }
            u uVar = new u(c0366f, cVar, this.f3623e);
            if (cVar.k()) {
                D d4 = this.j;
                H3.q.g(d4);
                p051f4.a aVar = d4.f3558i;
                if (aVar != null) {
                    aVar.disconnect();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(d4));
                p179v4.o oVar = d4.f3557h;
                oVar.f29180i = numValueOf;
                Z3.d dVar = d4.f3555e;
                d4.f3558i = (p051f4.a) d4.f3556f.l(d4.f3554d, dVar.getLooper(), oVar, (p042e4.a) oVar.f29183m, d4, d4);
                d4.j = uVar;
                Set set = d4.g;
                if (set == null || set.isEmpty()) {
                    dVar.post(new B3.r(3, d4));
                } else {
                    p051f4.a aVar2 = d4.f3558i;
                    aVar2.getClass();
                    aVar2.g(new H3.g(aVar2));
                }
            }
            try {
                cVar.g(uVar);
            } catch (SecurityException e6) {
                n(new D3.b(10, null, null), e6);
            }
        } catch (IllegalStateException e9) {
            n(new D3.b(10, null, null), e9);
        }
    }

    public final void l(H h9) {
        H3.q.c(this.f3631o.f3596u);
        boolean zIsConnected = this.f3622d.isConnected();
        LinkedList linkedList = this.f3621c;
        if (zIsConnected) {
            if (i(h9)) {
                h();
                return;
            } else {
                linkedList.add(h9);
                return;
            }
        }
        linkedList.add(h9);
        D3.b bVar = this.f3629m;
        if (bVar == null || bVar.f2097i == 0 || bVar.j == null) {
            k();
        } else {
            n(bVar, null);
        }
    }

    @Override
    public final void m(D3.b bVar) {
        n(bVar, null);
    }

    public final void n(D3.b bVar, RuntimeException runtimeException) {
        p051f4.a aVar;
        H3.q.c(this.f3631o.f3596u);
        D d4 = this.j;
        if (d4 != null && (aVar = d4.f3558i) != null) {
            aVar.disconnect();
        }
        H3.q.c(this.f3631o.f3596u);
        this.f3629m = null;
        ((SparseIntArray) this.f3631o.f3589n.f9153i).clear();
        b(bVar);
        if ((this.f3622d instanceof J3.c) && bVar.f2097i != 24) {
            C0366f c0366f = this.f3631o;
            c0366f.f3585i = true;
            Z3.d dVar = c0366f.f3596u;
            dVar.sendMessageDelayed(dVar.obtainMessage(19), 300000L);
        }
        if (bVar.f2097i == 4) {
            c(C0366f.f3582x);
            return;
        }
        if (this.f3621c.isEmpty()) {
            this.f3629m = bVar;
            return;
        }
        if (runtimeException != null) {
            H3.q.c(this.f3631o.f3596u);
            d(null, runtimeException, false);
            return;
        }
        if (!this.f3631o.f3597v) {
            c(C0366f.d(this.f3623e, bVar));
            return;
        }
        d(C0366f.d(this.f3623e, bVar), null, true);
        if (this.f3621c.isEmpty() || j(bVar) || this.f3631o.c(bVar, this.f3626i)) {
            return;
        }
        if (bVar.f2097i == 18) {
            this.f3627k = true;
        }
        if (!this.f3627k) {
            c(C0366f.d(this.f3623e, bVar));
            return;
        }
        C0366f c0366f2 = this.f3631o;
        C0362b c0362b = this.f3623e;
        Z3.d dVar2 = c0366f2.f3596u;
        dVar2.sendMessageDelayed(Message.obtain(dVar2, 9, c0362b), 5000L);
    }

    public final void o(D3.b bVar) {
        H3.q.c(this.f3631o.f3596u);
        E3.c cVar = this.f3622d;
        cVar.b("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(bVar));
        n(bVar, null);
    }

    @Override
    public final void onConnected() {
        Looper looperMyLooper = Looper.myLooper();
        C0366f c0366f = this.f3631o;
        if (looperMyLooper == c0366f.f3596u.getLooper()) {
            f();
        } else {
            c0366f.f3596u.post(new B3.r(1, this));
        }
    }

    public final void p() {
        H3.q.c(this.f3631o.f3596u);
        Status status = C0366f.f3581w;
        c(status);
        this.f3624f.t(false, status);
        for (C0368h c0368h : (C0368h[]) this.f3625h.keySet().toArray(new C0368h[0])) {
            l(new F(c0368h, new p059g4.d()));
        }
        b(new D3.b(4, null, null));
        E3.c cVar = this.f3622d;
        if (cVar.isConnected()) {
            cVar.f(new p166t3.i(9, this));
        }
    }
}
