package U7;

import S7.C0895k;
import S7.H0;
import S7.InterfaceC0894j;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class j implements n {

    public static final AtomicLongFieldUpdater f10186i = AtomicLongFieldUpdater.newUpdater(j.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(j.class, "receivers$volatile");

    public static final AtomicLongFieldUpdater f10187k = AtomicLongFieldUpdater.newUpdater(j.class, "bufferEnd$volatile");

    public static final AtomicLongFieldUpdater f10188l = AtomicLongFieldUpdater.newUpdater(j.class, "completedExpandBuffersAndPauseFlag$volatile");

    public static final AtomicReferenceFieldUpdater f10189m = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "sendSegment$volatile");

    public static final AtomicReferenceFieldUpdater f10190n = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "receiveSegment$volatile");

    public static final AtomicReferenceFieldUpdater f10191o = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "bufferEndSegment$volatile");

    public static final AtomicReferenceFieldUpdater f10192p = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_closeCause$volatile");

    public static final AtomicReferenceFieldUpdater f10193q = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "closeHandler$volatile");
    private volatile Object _closeCause$volatile;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;

    public final int f10194h;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    public j(int i3) {
        this.f10194h = i3;
        if (i3 < 0) {
            throw new IllegalArgumentException(Y6.f.f(i3, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        s sVar = l.f10196a;
        this.bufferEnd$volatile = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f10187k.get(this);
        s sVar2 = new s(0L, null, this, 3);
        this.sendSegment$volatile = sVar2;
        this.receiveSegment$volatile = sVar2;
        if (v()) {
            sVar2 = l.f10196a;
            kotlin.jvm.internal.m.c(sVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = sVar2;
        this._closeCause$volatile = l.f10212s;
    }

    public static final s b(j jVar, long j9, s sVar) {
        Object objB;
        j jVar2;
        jVar.getClass();
        s sVar2 = l.f10196a;
        k kVar = k.f10195h;
        loop0: while (true) {
            objB = X7.a.b(sVar, j9, kVar);
            if (!X7.a.e(objB)) {
                X7.q qVarC = X7.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10189m;
                    X7.q qVar = (X7.q) atomicReferenceFieldUpdater.get(jVar);
                    if (qVar.j >= qVarC.j) {
                        break loop0;
                    }
                    if (!qVarC.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(jVar, qVar, qVarC)) {
                            if (!qVar.f()) {
                                break loop0;
                            }
                            qVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(jVar) == qVar);
                    if (qVarC.f()) {
                        qVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = X7.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        if (zE) {
            jVar.isClosedForSend();
            if (sVar.j * ((long) l.f10197b) < atomicLongFieldUpdater.get(jVar)) {
                sVar.a();
                return null;
            }
        } else {
            s sVar3 = (s) X7.a.c(objB);
            long j10 = sVar3.j;
            if (j10 <= j9) {
                return sVar3;
            }
            long j11 = ((long) l.f10197b) * j10;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10186i;
                long j12 = atomicLongFieldUpdater2.get(jVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    jVar2 = jVar;
                    break;
                }
                jVar2 = jVar;
                if (atomicLongFieldUpdater2.compareAndSet(jVar2, j12, j13 + (((long) ((int) (j12 >> 60))) << 60))) {
                    break;
                }
                jVar = jVar2;
            }
            if (j10 * ((long) l.f10197b) < atomicLongFieldUpdater.get(jVar2)) {
                sVar3.a();
            }
        }
        return null;
    }

    public static final void f(j jVar, Object obj, C0895k c0895k) {
        jVar.getClass();
        c0895k.resumeWith(P.T(jVar.p()));
    }

    public static final int g(j jVar, s sVar, int i3, Object obj, long j9, Object obj2, boolean z6) {
        jVar.getClass();
        sVar.n(i3, obj);
        if (z6) {
            return jVar.E(sVar, i3, obj, j9, obj2, z6);
        }
        Object objL = sVar.l(i3);
        if (objL == null) {
            if (jVar.h(j9)) {
                if (sVar.k(null, i3, l.f10199d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (sVar.k(null, i3, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof H0) {
            sVar.n(i3, null);
            if (jVar.B(objL, obj)) {
                sVar.o(i3, l.f10203i);
                return 0;
            }
            N6.A a2 = l.f10204k;
            if (sVar.f10221m.getAndSet((i3 * 2) + 1, a2) == a2) {
                return 5;
            }
            sVar.m(i3, true);
            return 5;
        }
        return jVar.E(sVar, i3, obj, j9, obj2, z6);
    }

    public static void r(j jVar) {
        jVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10188l;
        if ((atomicLongFieldUpdater.addAndGet(jVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(jVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static Object y(j jVar, p117n6.c cVar) {
        h hVar;
        s sVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i3 = hVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.j = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new h(jVar, cVar);
            }
        } else {
            hVar = new h(jVar, cVar);
        }
        h hVar2 = hVar;
        Object obj = hVar2.f10182h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = hVar2.j;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
            return ((r) obj).f10219a;
        }
        P.u0(obj);
        s sVar2 = (s) f10190n.get(jVar);
        while (!jVar.t()) {
            long andIncrement = j.getAndIncrement(jVar);
            long j9 = l.f10197b;
            long j10 = andIncrement / j9;
            int i10 = (int) (andIncrement % j9);
            if (sVar2.j != j10) {
                s sVarM = jVar.m(j10, sVar2);
                if (sVarM == null) {
                    continue;
                } else {
                    sVar = sVarM;
                }
            } else {
                sVar = sVar2;
            }
            j jVar2 = jVar;
            Object objD = jVar2.D(sVar, i10, andIncrement, null);
            if (objD == l.f10206m) {
                throw new IllegalStateException("unexpected");
            }
            if (objD != l.f10208o) {
                if (objD != l.f10207n) {
                    sVar.a();
                    return objD;
                }
                hVar2.j = 1;
                Object objZ = jVar2.z(sVar, i10, andIncrement, hVar2);
                return objZ == aVar ? aVar : objZ;
            }
            if (andIncrement < jVar2.q()) {
                sVar.a();
            }
            jVar = jVar2;
            sVar2 = sVar;
        }
        return new p(jVar.n());
    }

    public final void A(H0 h9, boolean z6) {
        if (h9 instanceof InterfaceC0894j) {
            ((p100l6.c) h9).resumeWith(P.T(z6 ? o() : p()));
            return;
        }
        if (h9 instanceof B) {
            ((B) h9).f10173h.resumeWith(new r(new p(n())));
            return;
        }
        if (!(h9 instanceof C0957e)) {
            if (h9 instanceof p008a8.h) {
                ((p008a8.g) ((p008a8.h) h9)).g(this, l.f10205l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + h9).toString());
            }
        }
        C0957e c0957e = (C0957e) h9;
        C0895k c0895k = c0957e.f10179i;
        kotlin.jvm.internal.m.b(c0895k);
        c0957e.f10179i = null;
        c0957e.f10178h = l.f10205l;
        Throwable thN = c0957e.j.n();
        if (thN == null) {
            c0895k.resumeWith(Boolean.FALSE);
        } else {
            c0895k.resumeWith(P.T(thN));
        }
    }

    public final boolean B(Object obj, Object obj2) {
        if (obj instanceof p008a8.h) {
            return ((p008a8.g) ((p008a8.h) obj)).g(this, obj2) == 0;
        }
        if (obj instanceof B) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return l.a(((B) obj).f10173h, new r(obj2), null);
        }
        if (!(obj instanceof C0957e)) {
            if (!(obj instanceof InterfaceC0894j)) {
                throw new IllegalStateException(p121o0.p.n(obj, "Unexpected receiver type: "));
            }
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            return l.a((InterfaceC0894j) obj, obj2, null);
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C0957e c0957e = (C0957e) obj;
        C0895k c0895k = c0957e.f10179i;
        kotlin.jvm.internal.m.b(c0895k);
        c0957e.f10179i = null;
        c0957e.f10178h = obj2;
        Boolean bool = Boolean.TRUE;
        c0957e.j.getClass();
        return l.a(c0895k, bool, null);
    }

    public final boolean C(Object obj, s sVar, int i3) {
        p008a8.k kVar;
        boolean z6 = obj instanceof InterfaceC0894j;
        p070h6.A a2 = p070h6.A.f22523a;
        if (z6) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return l.a((InterfaceC0894j) obj, a2, null);
        }
        if (!(obj instanceof p008a8.h)) {
            throw new IllegalStateException(p121o0.p.n(obj, "Unexpected waiter: "));
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iG = ((p008a8.g) obj).g(this, a2);
        if (iG == 0) {
            kVar = p008a8.k.f15544h;
        } else if (iG == 1) {
            kVar = p008a8.k.f15545i;
        } else if (iG == 2) {
            kVar = p008a8.k.j;
        } else {
            if (iG != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iG).toString());
            }
            kVar = p008a8.k.f15546k;
        }
        if (kVar == p008a8.k.f15545i) {
            sVar.n(i3, null);
        }
        return kVar == p008a8.k.f15544h;
    }

    public final Object D(s sVar, int i3, long j9, Object obj) {
        Object objL = sVar.l(i3);
        AtomicReferenceArray atomicReferenceArray = sVar.f10221m;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10186i;
        if (objL == null) {
            if (j9 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return l.f10207n;
                }
                if (sVar.k(objL, i3, obj)) {
                    l();
                    return l.f10206m;
                }
            }
        } else if (objL == l.f10199d && sVar.k(objL, i3, l.f10203i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            sVar.n(i3, null);
            return obj2;
        }
        while (true) {
            Object objL2 = sVar.l(i3);
            if (objL2 == null || objL2 == l.f10200e) {
                if (j9 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (sVar.k(objL2, i3, l.f10202h)) {
                        l();
                        return l.f10208o;
                    }
                } else {
                    if (obj == null) {
                        return l.f10207n;
                    }
                    if (sVar.k(objL2, i3, obj)) {
                        l();
                        return l.f10206m;
                    }
                }
            } else if (objL2 != l.f10199d) {
                N6.A a2 = l.j;
                if (objL2 == a2) {
                    return l.f10208o;
                }
                if (objL2 == l.f10202h) {
                    return l.f10208o;
                }
                if (objL2 == l.f10205l) {
                    l();
                    return l.f10208o;
                }
                if (objL2 != l.g && sVar.k(objL2, i3, l.f10201f)) {
                    boolean z6 = objL2 instanceof E;
                    if (z6) {
                        objL2 = ((E) objL2).f10174a;
                    }
                    if (C(objL2, sVar, i3)) {
                        sVar.o(i3, l.f10203i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        sVar.n(i3, null);
                        return obj3;
                    }
                    sVar.o(i3, a2);
                    sVar.i();
                    if (z6) {
                        l();
                    }
                    return l.f10208o;
                }
            } else if (sVar.k(objL2, i3, l.f10203i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                sVar.n(i3, null);
                return obj4;
            }
        }
    }

    public final int E(s sVar, int i3, Object obj, long j9, Object obj2, boolean z6) {
        while (true) {
            Object objL = sVar.l(i3);
            if (objL == null) {
                if (!h(j9) || z6) {
                    if (z6) {
                        if (sVar.k(null, i3, l.j)) {
                            sVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (sVar.k(null, i3, obj2)) {
                            return 2;
                        }
                    }
                } else if (sVar.k(null, i3, l.f10199d)) {
                    break;
                }
            } else {
                if (objL != l.f10200e) {
                    N6.A a2 = l.f10204k;
                    if (objL == a2) {
                        sVar.n(i3, null);
                        return 5;
                    }
                    if (objL == l.f10202h) {
                        sVar.n(i3, null);
                        return 5;
                    }
                    if (objL == l.f10205l) {
                        sVar.n(i3, null);
                        isClosedForSend();
                        return 4;
                    }
                    sVar.n(i3, null);
                    if (objL instanceof E) {
                        objL = ((E) objL).f10174a;
                    }
                    if (B(objL, obj)) {
                        sVar.o(i3, l.f10203i);
                        return 0;
                    }
                    if (sVar.f10221m.getAndSet((i3 * 2) + 1, a2) != a2) {
                        sVar.m(i3, true);
                    }
                    return 5;
                }
                if (sVar.k(objL, i3, l.f10199d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void F(long j9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        j jVar = this;
        if (jVar.v()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f10187k;
            if (atomicLongFieldUpdater.get(jVar) > j9) {
                break;
            } else {
                jVar = this;
            }
        }
        int i3 = l.f10198c;
        int i9 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10188l;
            if (i9 < i3) {
                long j10 = atomicLongFieldUpdater.get(jVar);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(jVar)) && j10 == atomicLongFieldUpdater.get(jVar)) {
                    return;
                } else {
                    i9++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(jVar);
                    if (atomicLongFieldUpdater2.compareAndSet(jVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        jVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(jVar);
                    long j13 = atomicLongFieldUpdater2.get(jVar);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z6 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(jVar)) {
                        break;
                    }
                    if (!z6) {
                        atomicLongFieldUpdater2.compareAndSet(this, j13, 4611686018427387904L + j14);
                    }
                    jVar = this;
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(jVar);
                    if (atomicLongFieldUpdater2.compareAndSet(jVar, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        jVar = this;
                    }
                }
            }
        }
    }

    @Override
    public final p008a8.c a() {
        kotlin.jvm.internal.E.c(3, f.f10180h);
        kotlin.jvm.internal.E.c(3, g.f10181h);
        return new p008a8.c(this, (AbstractC0956d) null);
    }

    @Override
    public final Object c(W7.s sVar) {
        return y(this, sVar);
    }

    @Override
    public final boolean close(Throwable th) {
        return i(th, false);
    }

    @Override
    public final Object d() {
        s sVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        long j9 = atomicLongFieldUpdater.get(this);
        long j10 = f10186i.get(this);
        if (s(j10, true)) {
            return new p(n());
        }
        long j11 = j10 & 1152921504606846975L;
        q qVar = r.f10218b;
        if (j9 >= j11) {
            return qVar;
        }
        Object obj = l.f10204k;
        s sVar2 = (s) f10190n.get(this);
        while (!t()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = l.f10197b;
            long j13 = andIncrement / j12;
            int i3 = (int) (andIncrement % j12);
            if (sVar2.j != j13) {
                s sVarM = m(j13, sVar2);
                if (sVarM == null) {
                    continue;
                } else {
                    sVar = sVarM;
                }
            } else {
                sVar = sVar2;
            }
            Object objD = D(sVar, i3, andIncrement, obj);
            s sVar3 = sVar;
            if (objD == l.f10206m) {
                H0 h9 = obj instanceof H0 ? (H0) obj : null;
                if (h9 != null) {
                    h9.a(sVar3, i3);
                }
                F(andIncrement);
                sVar3.i();
                return qVar;
            }
            if (objD != l.f10208o) {
                if (objD == l.f10207n) {
                    throw new IllegalStateException("unexpected");
                }
                sVar3.a();
                return objD;
            }
            if (andIncrement < q()) {
                sVar3.a();
            }
            sVar2 = sVar3;
        }
        return new p(n());
    }

    @Override
    public final void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        i(cancellationException, true);
    }

    public final boolean h(long j9) {
        return j9 < f10187k.get(this) || j9 < j.get(this) + ((long) this.f10194h);
    }

    public final boolean i(Throwable th, boolean z6) {
        j jVar;
        boolean z9;
        long j9;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10186i;
        if (!z6) {
            jVar = this;
            break;
        }
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if (((int) (j13 >> 60)) != 0) {
                jVar = this;
                break;
            }
            s sVar = l.f10196a;
            jVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(jVar, j13, (j13 & 1152921504606846975L) + (((long) 1) << 60)));
        N6.A a2 = l.f10212s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10192p;
            if (atomicReferenceFieldUpdater.compareAndSet(this, a2, th)) {
                z9 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != a2) {
                z9 = false;
                break;
            }
        }
        if (z6) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(jVar, j12, (((long) 3) << 60) + (j12 & 1152921504606846975L)));
        } else {
            do {
                j9 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j9 >> 60);
                if (i3 == 0) {
                    j10 = j9 & 1152921504606846975L;
                    j11 = 2;
                } else {
                    if (i3 != 1) {
                        break;
                    }
                    j10 = j9 & 1152921504606846975L;
                    j11 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(jVar, j9, (j11 << 60) + j10));
        }
        isClosedForSend();
        if (z9) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10193q;
                obj = atomicReferenceFieldUpdater2.get(this);
                N6.A a9 = obj == null ? l.f10210q : l.f10211r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a9)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                kotlin.jvm.internal.E.c(1, obj);
                ((p194x6.j) obj).invoke(n());
                return z9;
            }
        }
        return z9;
    }

    @Override
    public final void invokeOnClose(p194x6.j jVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f10193q;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, jVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            N6.A a2 = l.f10210q;
            if (obj != a2) {
                if (obj != l.f10211r) {
                    throw new IllegalStateException(p121o0.p.n(obj, "Another handler is already registered: "));
                }
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            N6.A a9 = l.f10211r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, a2, a9)) {
                    jVar.invoke(n());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == a2);
        }
    }

    @Override
    public final boolean isClosedForSend() {
        return s(f10186i.get(this), false);
    }

    @Override
    public final C0957e iterator() {
        return new C0957e(this);
    }

    public final s j(long j9) {
        Object objF;
        long j10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f10191o.get(this);
        s sVar = (s) f10189m.get(this);
        if (sVar.j > ((s) obj).j) {
            obj = sVar;
        }
        s sVar2 = (s) f10190n.get(this);
        if (sVar2.j > ((s) obj).j) {
            obj = sVar2;
        }
        X7.b bVar = (X7.b) obj;
        loop0: while (true) {
            bVar.getClass();
            Object obj2 = X7.b.f10904h.get(bVar);
            N6.A a2 = X7.a.f10898a;
            objF = null;
            if (obj2 == a2) {
                break;
            }
            X7.b bVar2 = (X7.b) obj2;
            if (bVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = X7.b.f10904h;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, a2)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(bVar) == null);
            } else {
                bVar = bVar2;
            }
        }
        s sVar3 = (s) bVar;
        if (u()) {
            s sVar4 = sVar3;
            loop2: while (true) {
                int i3 = l.f10197b - 1;
                while (true) {
                    if (-1 < i3) {
                        j10 = (sVar4.j * ((long) l.f10197b)) + ((long) i3);
                        if (j10 >= j.get(this)) {
                            while (true) {
                                Object objL = sVar4.l(i3);
                                if (objL != null && objL != l.f10200e) {
                                    if (objL != l.f10199d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (sVar4.k(objL, i3, l.f10205l)) {
                                    sVar4.i();
                                    break;
                                }
                            }
                            i3--;
                        }
                    } else {
                        sVar4 = (s) ((X7.b) X7.b.f10905i.get(sVar4));
                        if (sVar4 == null) {
                        }
                    }
                    j10 = -1;
                    break;
                }
            }
            if (j10 != -1) {
                k(j10);
            }
        }
        loop5: for (s sVar5 = sVar3; sVar5 != null; sVar5 = (s) ((X7.b) X7.b.f10905i.get(sVar5))) {
            for (int i9 = l.f10197b - 1; -1 < i9; i9--) {
                if ((sVar5.j * ((long) l.f10197b)) + ((long) i9) < j9) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = sVar5.l(i9);
                    if (objL2 != null && objL2 != l.f10200e) {
                        if (!(objL2 instanceof E)) {
                            if (!(objL2 instanceof H0)) {
                                break;
                            }
                            if (sVar5.k(objL2, i9, l.f10205l)) {
                                objF = X7.a.f(objF, objL2);
                                sVar5.m(i9, true);
                                break;
                            }
                        } else {
                            if (sVar5.k(objL2, i9, l.f10205l)) {
                                objF = X7.a.f(objF, ((E) objL2).f10174a);
                                sVar5.m(i9, true);
                                break;
                            }
                        }
                    } else {
                        if (sVar5.k(objL2, i9, l.f10205l)) {
                            sVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                A((H0) objF, true);
                return sVar3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                A((H0) arrayList.get(size), true);
            }
        }
        return sVar3;
    }

    public final void k(long j9) {
        s sVar = (s) f10190n.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j9 < Math.max(((long) this.f10194h) + j10, f10187k.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = l.f10197b;
                long j12 = j10 / j11;
                int i3 = (int) (j10 % j11);
                if (sVar.j != j12) {
                    s sVarM = m(j12, sVar);
                    if (sVarM != null) {
                        sVar = sVarM;
                    }
                }
                s sVar2 = sVar;
                if (D(sVar2, i3, j10, null) != l.f10208o || j10 < q()) {
                    sVar2.a();
                }
                sVar = sVar2;
            }
        }
    }

    public final void l() {
        Object objB;
        if (v()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10191o;
        s sVar = (s) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f10187k.getAndIncrement(this);
            long j9 = andIncrement / ((long) l.f10197b);
            if (q() <= andIncrement) {
                if (sVar.j < j9 && sVar.c() != null) {
                    w(j9, sVar);
                }
                r(this);
                return;
            }
            if (sVar.j != j9) {
                k kVar = k.f10195h;
                while (true) {
                    objB = X7.a.b(sVar, j9, kVar);
                    if (!X7.a.e(objB)) {
                        X7.q qVarC = X7.a.c(objB);
                        while (true) {
                            X7.q qVar = (X7.q) atomicReferenceFieldUpdater.get(this);
                            if (qVar.j >= qVarC.j) {
                                break;
                            }
                            if (!qVarC.j()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                                    if (!qVar.f()) {
                                        break;
                                    }
                                    qVar.e();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == qVar);
                            if (qVarC.f()) {
                                qVarC.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                s sVar2 = null;
                if (X7.a.e(objB)) {
                    isClosedForSend();
                    w(j9, sVar);
                    r(this);
                } else {
                    s sVar3 = (s) X7.a.c(objB);
                    long j10 = sVar3.j;
                    if (j10 > j9) {
                        long j11 = j10 * ((long) l.f10197b);
                        if (f10187k.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f10188l;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            r(this);
                        }
                    } else {
                        sVar2 = sVar3;
                    }
                }
                if (sVar2 == null) {
                    continue;
                } else {
                    sVar = sVar2;
                }
            }
            int i3 = (int) (andIncrement % ((long) l.f10197b));
            Object objL = sVar.l(i3);
            boolean z6 = objL instanceof H0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
            if (!z6 || andIncrement < atomicLongFieldUpdater2.get(this) || !sVar.k(objL, i3, l.g)) {
                while (true) {
                    Object objL2 = sVar.l(i3);
                    if (objL2 instanceof H0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (sVar.k(objL2, i3, new E((H0) objL2))) {
                                r(this);
                                return;
                            }
                        } else if (sVar.k(objL2, i3, l.g)) {
                            if (!C(objL2, sVar, i3)) {
                                sVar.o(i3, l.j);
                                sVar.i();
                                break;
                            } else {
                                sVar.o(i3, l.f10199d);
                                r(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == l.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (sVar.k(objL2, i3, l.f10200e)) {
                                r(this);
                                return;
                            }
                        } else if (objL2 == l.f10199d || objL2 == l.f10202h || objL2 == l.f10203i || objL2 == l.f10204k || objL2 == l.f10205l) {
                            r(this);
                            return;
                        } else if (objL2 != l.f10201f) {
                            throw new IllegalStateException(p121o0.p.n(objL2, "Unexpected cell state: "));
                        }
                    }
                }
                r(this);
            } else if (C(objL, sVar, i3)) {
                sVar.o(i3, l.f10199d);
                r(this);
                return;
            } else {
                sVar.o(i3, l.j);
                sVar.i();
                r(this);
            }
        }
    }

    public final s m(long j9, s sVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        s sVar2 = l.f10196a;
        k kVar = k.f10195h;
        loop0: while (true) {
            objB = X7.a.b(sVar, j9, kVar);
            if (!X7.a.e(objB)) {
                X7.q qVarC = X7.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10190n;
                    X7.q qVar = (X7.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.j >= qVarC.j) {
                        break loop0;
                    }
                    if (!qVarC.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                            if (!qVar.f()) {
                                break loop0;
                            }
                            qVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == qVar);
                    if (qVarC.f()) {
                        qVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        if (X7.a.e(objB)) {
            isClosedForSend();
            if (sVar.j * ((long) l.f10197b) < q()) {
                sVar.a();
                return null;
            }
        } else {
            s sVar3 = (s) X7.a.c(objB);
            boolean zV = v();
            long j11 = sVar3.j;
            if (!zV && j9 <= f10187k.get(this) / ((long) l.f10197b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10191o;
                    X7.q qVar2 = (X7.q) atomicReferenceFieldUpdater2.get(this);
                    if (qVar2.j >= j11 || !sVar3.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, qVar2, sVar3)) {
                            if (!qVar2.f()) {
                                break loop3;
                            }
                            qVar2.e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == qVar2);
                    if (sVar3.f()) {
                        sVar3.e();
                    }
                }
            }
            if (j11 <= j9) {
                return sVar3;
            }
            long j12 = j11 * ((long) l.f10197b);
            do {
                atomicLongFieldUpdater = j;
                j10 = atomicLongFieldUpdater.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j12));
            if (j11 * ((long) l.f10197b) < q()) {
                sVar3.a();
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) f10192p.get(this);
    }

    public final Throwable o() {
        Throwable thN = n();
        return thN == null ? new u("Channel was closed") : thN;
    }

    public final Throwable p() {
        Throwable thN = n();
        return thN == null ? new v("Channel was closed") : thN;
    }

    public final long q() {
        return f10186i.get(this) & 1152921504606846975L;
    }

    @Override
    public final Object receive(p100l6.c cVar) throws Throwable {
        s sVar;
        Throwable th;
        s sVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10190n;
        s sVar3 = (s) atomicReferenceFieldUpdater.get(this);
        while (!t()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j9 = l.f10197b;
            long j10 = andIncrement / j9;
            int i3 = (int) (andIncrement % j9);
            if (sVar3.j != j10) {
                s sVarM = m(j10, sVar3);
                if (sVarM == null) {
                    continue;
                } else {
                    sVar = sVarM;
                }
            } else {
                sVar = sVar3;
            }
            Object objD = D(sVar, i3, andIncrement, null);
            N6.A a2 = l.f10206m;
            if (objD == a2) {
                throw new IllegalStateException("unexpected");
            }
            N6.A a9 = l.f10208o;
            if (objD == a9) {
                if (andIncrement < q()) {
                    sVar.a();
                }
                sVar3 = sVar;
            } else {
                if (objD != l.f10207n) {
                    sVar.a();
                    return objD;
                }
                C0895k c0895kU = S7.C.u(P.h0(cVar));
                j jVar = this;
                try {
                    Object objD2 = jVar.D(sVar, i3, andIncrement, c0895kU);
                    if (objD2 != a2) {
                        if (objD2 == a9) {
                            if (andIncrement < q()) {
                                sVar.a();
                            }
                            s sVar4 = (s) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (t()) {
                                    c0895kU.resumeWith(P.T(o()));
                                    break;
                                }
                                C0895k c0895k = c0895kU;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j11 = l.f10197b;
                                    long j12 = andIncrement2 / j11;
                                    int i9 = (int) (andIncrement2 % j11);
                                    if (sVar4.j != j12) {
                                        try {
                                            s sVarM2 = m(j12, sVar4);
                                            if (sVarM2 == null) {
                                                c0895kU = c0895k;
                                            } else {
                                                sVar2 = sVarM2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c0895kU = c0895k;
                                            c0895kU.y();
                                            throw th;
                                        }
                                    } else {
                                        sVar2 = sVar4;
                                    }
                                    objD2 = jVar.D(sVar2, i9, andIncrement2, c0895k);
                                    s sVar5 = sVar2;
                                    c0895kU = c0895k;
                                    if (objD2 == l.f10206m) {
                                        c0895kU.a(sVar5, i9);
                                        break;
                                    }
                                    if (objD2 == l.f10208o) {
                                        if (andIncrement2 < q()) {
                                            sVar5.a();
                                        }
                                        jVar = this;
                                        sVar4 = sVar5;
                                    } else {
                                        if (objD2 == l.f10207n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        sVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0895kU = c0895k;
                                    th = th;
                                    c0895kU.y();
                                    throw th;
                                }
                            }
                        } else {
                            sVar.a();
                        }
                        c0895kU.g(objD2, null);
                        break;
                    }
                    c0895kU.a(sVar, i3);
                    Object objQ = c0895kU.q();
                    p109m6.a aVar = p109m6.a.f25430h;
                    return objQ;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thO = o();
        int i10 = X7.r.f10934a;
        throw thO;
    }

    public final boolean s(long j9, boolean z6) {
        int i3 = (int) (j9 >> 60);
        if (i3 != 0 && i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = j;
            if (i3 == 2) {
                j(1152921504606846975L & j9);
                if (z6) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10190n;
                        s sVarM = (s) atomicReferenceFieldUpdater.get(this);
                        long j10 = atomicLongFieldUpdater.get(this);
                        if (q() <= j10) {
                            break;
                        }
                        long j11 = l.f10197b;
                        long j12 = j10 / j11;
                        if (sVarM.j != j12 && (sVarM = m(j12, sVarM)) == null) {
                            if (((s) atomicReferenceFieldUpdater.get(this)).j < j12) {
                                break;
                            }
                        } else {
                            sVarM.a();
                            int i9 = (int) (j10 % j11);
                            while (true) {
                                Object objL = sVarM.l(i9);
                                if (objL != null && objL != l.f10200e) {
                                    if (objL != l.f10199d && (objL == l.j || objL == l.f10205l || objL == l.f10203i || objL == l.f10202h || (objL != l.g && (objL == l.f10201f || j10 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (sVarM.k(objL, i9, l.f10202h)) {
                                    l();
                                    break;
                                }
                            }
                            j.compareAndSet(this, j10, j10 + 1);
                        }
                    }
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException(M0.l(i3, "unexpected close status: ").toString());
                }
                s sVarJ = j(1152921504606846975L & j9);
                Object objF = null;
                loop0: do {
                    for (int i10 = l.f10197b - 1; -1 < i10; i10--) {
                        long j13 = (sVarJ.j * ((long) l.f10197b)) + ((long) i10);
                        while (true) {
                            Object objL2 = sVarJ.l(i10);
                            if (objL2 == l.f10203i) {
                                break loop0;
                            }
                            if (objL2 != l.f10199d) {
                                if (objL2 != l.f10200e && objL2 != null) {
                                    if (!(objL2 instanceof H0) && !(objL2 instanceof E)) {
                                        N6.A a2 = l.g;
                                        if (objL2 == a2 || objL2 == l.f10201f) {
                                            break loop0;
                                        }
                                        if (objL2 != a2) {
                                            break;
                                        }
                                    } else {
                                        if (j13 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        H0 h9 = objL2 instanceof E ? ((E) objL2).f10174a : (H0) objL2;
                                        if (sVarJ.k(objL2, i10, l.f10205l)) {
                                            objF = X7.a.f(objF, h9);
                                            sVarJ.n(i10, null);
                                            sVarJ.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (sVarJ.k(objL2, i10, l.f10205l)) {
                                        sVarJ.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j13 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (sVarJ.k(objL2, i10, l.f10205l)) {
                                    sVarJ.n(i10, null);
                                    sVarJ.i();
                                    break;
                                }
                            }
                        }
                    }
                    sVarJ = (s) ((X7.b) X7.b.f10905i.get(sVarJ));
                } while (sVarJ != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            A((H0) arrayList.get(size), false);
                        }
                    } else {
                        A((H0) objF, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public Object send(Object obj, p100l6.c cVar) throws Throwable {
        p070h6.A a2;
        Object objQ;
        p109m6.a aVar;
        Object obj2;
        j jVar;
        int i3;
        s sVar;
        j jVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10189m;
        s sVar2 = (s) atomicReferenceFieldUpdater.get(jVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10186i;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(jVar2);
            long j9 = andIncrement & 1152921504606846975L;
            boolean zS = jVar2.s(andIncrement, false);
            int i9 = l.f10197b;
            long j10 = i9;
            long j11 = j9 / j10;
            int i10 = (int) (j9 % j10);
            long j12 = sVar2.j;
            a2 = p070h6.A.f22523a;
            if (j12 != j11) {
                s sVarB = b(jVar2, j11, sVar2);
                if (sVarB != null) {
                    sVar2 = sVarB;
                } else if (zS) {
                    Object objX = x(obj, cVar);
                    if (objX != p109m6.a.f25430h) {
                        break;
                    }
                    return objX;
                }
            }
            int iG = g(jVar2, sVar2, i10, obj, j9, null, zS);
            if (iG == 0) {
                sVar2.a();
                return a2;
            }
            if (iG == 1) {
                break;
            }
            if (iG != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = j;
                if (iG == 3) {
                    C0895k c0895kU = S7.C.u(P.h0(cVar));
                    Object obj3 = obj;
                    try {
                        int iG2 = g(jVar2, sVar2, i10, obj3, j9, c0895kU, false);
                        try {
                            if (iG2 != 0) {
                                if (iG2 == 1) {
                                    c0895kU.resumeWith(a2);
                                } else if (iG2 != 2) {
                                    if (iG2 != 4) {
                                        String str = "unexpected";
                                        if (iG2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        sVar2.a();
                                        s sVar3 = (s) atomicReferenceFieldUpdater.get(jVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(jVar2);
                                            long j13 = andIncrement2 & 1152921504606846975L;
                                            boolean zS2 = jVar2.s(andIncrement2, false);
                                            int i11 = l.f10197b;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j14 = i11;
                                            str = str;
                                            long j15 = j13 / j14;
                                            int i12 = (int) (j13 % j14);
                                            atomicLongFieldUpdater2 = atomicLongFieldUpdater2;
                                            if (sVar3.j != j15) {
                                                s sVarB2 = b(jVar2, j15, sVar3);
                                                if (sVarB2 != null) {
                                                    sVar = sVarB2;
                                                    i3 = i12;
                                                } else if (zS2) {
                                                    f(jVar2, obj3, c0895kU);
                                                    break;
                                                }
                                            } else {
                                                i3 = i12;
                                                sVar = sVar3;
                                            }
                                            int iG3 = g(jVar2, sVar, i3, obj3, j13, c0895kU, zS2);
                                            Object obj4 = obj3;
                                            jVar = jVar2;
                                            s sVar4 = sVar;
                                            int i13 = i3;
                                            obj2 = obj4;
                                            if (iG3 == 0) {
                                                sVar4.a();
                                            } else if (iG3 != 1) {
                                                if (iG3 == 2) {
                                                    if (!zS2) {
                                                        c0895kU.a(sVar4, i13 + i11);
                                                        break;
                                                    }
                                                    sVar4.i();
                                                } else {
                                                    if (iG3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iG3 != 4) {
                                                        if (iG3 == 5) {
                                                            sVar4.a();
                                                        }
                                                        sVar3 = sVar4;
                                                        jVar2 = jVar;
                                                        obj3 = obj2;
                                                    } else if (j13 < atomicLongFieldUpdater2.get(jVar)) {
                                                        sVar4.a();
                                                    }
                                                }
                                            }
                                        }
                                        c0895kU.y();
                                        throw th;
                                    }
                                    obj2 = obj3;
                                    jVar = jVar2;
                                    if (j9 < atomicLongFieldUpdater2.get(jVar)) {
                                        sVar2.a();
                                    }
                                    f(jVar, obj2, c0895kU);
                                    break;
                                } else {
                                    c0895kU.a(sVar2, i10 + i9);
                                }
                                objQ = c0895kU.q();
                                aVar = p109m6.a.f25430h;
                                if (objQ != aVar) {
                                    objQ = a2;
                                }
                                if (objQ == aVar) {
                                    return objQ;
                                }
                            } else {
                                sVar2.a();
                            }
                            c0895kU.resumeWith(a2);
                            objQ = c0895kU.q();
                            aVar = p109m6.a.f25430h;
                            if (objQ != aVar) {
                                objQ = a2;
                            }
                            if (objQ == aVar) {
                                return objQ;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (iG == 4) {
                        if (j9 < atomicLongFieldUpdater2.get(jVar2)) {
                            sVar2.a();
                        }
                        Object objX2 = x(obj, cVar);
                        if (objX2 != p109m6.a.f25430h) {
                            break;
                        }
                        return objX2;
                    }
                    if (iG == 5) {
                        sVar2.a();
                    }
                }
            } else if (zS) {
                sVar2.i();
                Object objX3 = x(obj, cVar);
                if (objX3 == p109m6.a.f25430h) {
                    return objX3;
                }
            }
            return a2;
        }
        return a2;
    }

    public final boolean t() {
        return s(f10186i.get(this), true);
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (f10186i.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f10194h + ',');
        sb.append("data=[");
        int i9 = 0;
        boolean z6 = true;
        List listB0 = p078i6.p.B0(f10190n.get(this), f10189m.get(this), f10191o.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB0) {
            if (((s) obj) != l.f10196a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j9 = ((s) next).j;
            do {
                Object next2 = it.next();
                long j10 = ((s) next2).j;
                if (j9 > j10) {
                    next = next2;
                    j9 = j10;
                }
            } while (it.hasNext());
        }
        s sVar = (s) next;
        long j11 = j.get(this);
        long jQ = q();
        loop2: while (true) {
            int i10 = l.f10197b;
            int i11 = i9;
            while (i11 < i10) {
                long j12 = (sVar.j * ((long) l.f10197b)) + ((long) i11);
                if (j12 >= jQ && j12 >= j11) {
                    break loop2;
                }
                Object objL = sVar.l(i11);
                boolean z9 = z6;
                Object obj2 = sVar.f10221m.get(i11 * 2);
                if (objL instanceof InterfaceC0894j) {
                    string = (j12 >= j11 || j12 < jQ) ? (j12 >= jQ || j12 < j11) ? "cont" : "send" : "receive";
                } else if (objL instanceof p008a8.h) {
                    string = (j12 >= j11 || j12 < jQ) ? (j12 >= jQ || j12 < j11) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof B) {
                    string = "receiveCatching";
                } else if (objL instanceof E) {
                    string = "EB(" + objL + ')';
                } else if (kotlin.jvm.internal.m.a(objL, l.f10201f) || kotlin.jvm.internal.m.a(objL, l.g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(l.f10200e) && !objL.equals(l.f10203i) && !objL.equals(l.f10202h) && !objL.equals(l.f10204k) && !objL.equals(l.j) && !objL.equals(l.f10205l)) {
                        string = objL.toString();
                    }
                    i11++;
                    z6 = z9;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i11++;
                z6 = z9;
            }
            boolean z10 = z6;
            sVar = (s) sVar.c();
            if (sVar == null) {
                break;
            }
            z6 = z10;
            i9 = 0;
        }
        if (O7.q.O0(sb) == ',') {
            kotlin.jvm.internal.m.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object mo3trySendJP2dKIU(Object obj) {
        int iG;
        p070h6.A a2;
        H0 h9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10186i;
        long j9 = atomicLongFieldUpdater.get(this);
        boolean z6 = false;
        long j10 = 1152921504606846975L;
        boolean z9 = s(j9, false) ? false : !h(j9 & 1152921504606846975L);
        q qVar = r.f10218b;
        if (z9) {
            return qVar;
        }
        p068h4.t tVar = l.j;
        s sVar = (s) f10189m.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & j10;
            boolean zS = s(andIncrement, z6);
            int i3 = l.f10197b;
            long j12 = i3;
            long j13 = j11 / j12;
            int i9 = (int) (j11 % j12);
            if (sVar.j == j13) {
                iG = g(this, sVar, i9, obj, j11, tVar, zS);
                a2 = p070h6.A.f22523a;
                if (iG != 0) {
                    sVar.a();
                    return a2;
                }
                if (iG != 1) {
                    return a2;
                }
                if (iG != 2) {
                    if (zS) {
                        sVar.i();
                        return new p(p());
                    }
                    if (tVar instanceof H0) {
                        h9 = (H0) tVar;
                    } else {
                        h9 = null;
                    }
                    if (h9 != null) {
                        h9.a(sVar, i9 + i3);
                    }
                    sVar.i();
                    return qVar;
                }
                if (iG != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iG != 4) {
                    if (j11 < j.get(this)) {
                        sVar.a();
                    }
                    return new p(p());
                }
                if (iG == 5) {
                    sVar.a();
                }
                z6 = false;
            } else {
                s sVarB = b(this, j13, sVar);
                if (sVarB != null) {
                    sVar = sVarB;
                    iG = g(this, sVar, i9, obj, j11, tVar, zS);
                    a2 = p070h6.A.f22523a;
                    if (iG != 0) {
                        sVar.a();
                        return a2;
                    }
                    if (iG != 1) {
                        return a2;
                    }
                    if (iG != 2) {
                        if (zS) {
                            sVar.i();
                            return new p(p());
                        }
                        if (tVar instanceof H0) {
                            h9 = (H0) tVar;
                        } else {
                            h9 = null;
                        }
                        if (h9 != null) {
                            h9.a(sVar, i9 + i3);
                        }
                        sVar.i();
                        return qVar;
                    }
                    if (iG != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iG != 4) {
                        if (j11 < j.get(this)) {
                            sVar.a();
                        }
                        return new p(p());
                    }
                    if (iG == 5) {
                        sVar.a();
                    }
                    z6 = false;
                } else {
                    if (zS) {
                        return new p(p());
                    }
                    z6 = false;
                }
            }
            j10 = 1152921504606846975L;
        }
    }

    public boolean u() {
        return false;
    }

    public final boolean v() {
        long j9 = f10187k.get(this);
        return j9 == 0 || j9 == Long.MAX_VALUE;
    }

    public final void w(long j9, s sVar) {
        s sVar2;
        s sVar3;
        while (sVar.j < j9 && (sVar3 = (s) sVar.c()) != null) {
            sVar = sVar3;
        }
        while (true) {
            if (!sVar.d() || (sVar2 = (s) sVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10191o;
                    X7.q qVar = (X7.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.j >= sVar.j) {
                        return;
                    }
                    if (!sVar.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, sVar)) {
                            if (qVar.f()) {
                                qVar.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == qVar);
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                sVar = sVar2;
            }
        }
    }

    public final Object x(Object obj, p100l6.c cVar) {
        C0895k c0895k = new C0895k(1, P.h0(cVar));
        c0895k.r();
        c0895k.resumeWith(P.T(p()));
        Object objQ = c0895k.q();
        return objQ == p109m6.a.f25430h ? objQ : p070h6.A.f22523a;
    }

    public final Object z(s sVar, int i3, long j9, p117n6.c cVar) {
        i iVar;
        s sVar2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i9 = iVar.j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                iVar.j = i9 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objQ = iVar.f10184h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = iVar.j;
        if (i10 == 0) {
            P.u0(objQ);
            iVar.j = 1;
            C0895k c0895kU = S7.C.u(P.h0(iVar));
            try {
                B b9 = new B(c0895kU);
                Object objD = D(sVar, i3, j9, b9);
                if (objD == l.f10206m) {
                    b9.a(sVar, i3);
                } else if (objD == l.f10208o) {
                    if (j9 < q()) {
                        sVar.a();
                    }
                    s sVar3 = (s) f10190n.get(this);
                    while (true) {
                        if (t()) {
                            c0895kU.resumeWith(new r(new p(n())));
                            break;
                        }
                        long andIncrement = j.getAndIncrement(this);
                        long j10 = l.f10197b;
                        long j11 = andIncrement / j10;
                        int i11 = (int) (andIncrement % j10);
                        if (sVar3.j != j11) {
                            s sVarM = m(j11, sVar3);
                            if (sVarM != null) {
                                sVar2 = sVarM;
                            }
                        } else {
                            sVar2 = sVar3;
                        }
                        Object objD2 = D(sVar2, i11, andIncrement, b9);
                        s sVar4 = sVar2;
                        if (objD2 == l.f10206m) {
                            b9.a(sVar4, i11);
                            break;
                        }
                        if (objD2 != l.f10208o) {
                            if (objD2 == l.f10207n) {
                                throw new IllegalStateException("unexpected");
                            }
                            sVar4.a();
                            c0895kU.g(new r(objD2), null);
                            break;
                        }
                        if (andIncrement < q()) {
                            sVar4.a();
                        }
                        sVar3 = sVar4;
                    }
                } else {
                    sVar.a();
                    c0895kU.g(new r(objD), null);
                }
                objQ = c0895kU.q();
                p109m6.a aVar2 = p109m6.a.f25430h;
                if (objQ == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                c0895kU.y();
                throw th;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(objQ);
        }
        return ((r) objQ).f10219a;
    }
}
