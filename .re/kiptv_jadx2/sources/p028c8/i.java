package p028c8;

import J.n0;
import S7.C;
import S7.C0895k;
import S7.H0;
import S7.InterfaceC0894j;
import X7.q;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.P;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p008a8.g;
import p008a8.h;
import p070h6.A;
import p109m6.a;
import p117n6.c;
import p121o0.p;

public class i {

    public static final AtomicReferenceFieldUpdater f18524c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    public static final AtomicLongFieldUpdater f18525d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    public static final AtomicReferenceFieldUpdater f18526e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    public static final AtomicLongFieldUpdater f18527f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile int _availablePermits$volatile;

    public final int f18528a;

    public final n0 f18529b;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    public i(int i3) {
        this.f18528a = i3;
        if (i3 <= 0) {
            throw new IllegalArgumentException(M0.l(i3, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(M0.l(i3, "The number of acquired permits should be in 0..").toString());
        }
        l lVar = new l(0L, null, 2);
        this.head$volatile = lVar;
        this.tail$volatile = lVar;
        this._availablePermits$volatile = i3;
        this.f18529b = new n0(6, this);
    }

    public final Object a(c cVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i3;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i3 = this.f18528a;
        } while (andDecrement > i3);
        A a2 = A.f22523a;
        if (andDecrement <= 0) {
            C0895k c0895kU = C.u(P.h0(cVar));
            try {
                if (!b(c0895kU)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i3) {
                            if (andDecrement2 > 0) {
                                c0895kU.g(a2, this.f18529b);
                                break;
                            }
                            if (b(c0895kU)) {
                                break;
                            }
                        }
                    }
                }
                Object objQ = c0895kU.q();
                a aVar = a.f25430h;
                if (objQ != aVar) {
                    objQ = a2;
                }
                if (objQ == aVar) {
                    return objQ;
                }
            } catch (Throwable th) {
                c0895kU.y();
                throw th;
            }
        }
        return a2;
    }

    public final boolean b(H0 h9) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18526e;
        l lVar = (l) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f18527f.getAndIncrement(this);
        g gVar = g.f18522h;
        long j = andIncrement / ((long) k.f18535f);
        loop0: while (true) {
            objB = X7.a.b(lVar, j, gVar);
            if (!X7.a.e(objB)) {
                q qVarC = X7.a.c(objB);
                while (true) {
                    q qVar = (q) atomicReferenceFieldUpdater.get(this);
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
        l lVar2 = (l) X7.a.c(objB);
        int i3 = (int) (andIncrement % ((long) k.f18535f));
        AtomicReferenceArray atomicReferenceArray = lVar2.f18536l;
        while (!atomicReferenceArray.compareAndSet(i3, null, h9)) {
            if (atomicReferenceArray.get(i3) != null) {
                N6.A a2 = k.f18531b;
                N6.A a9 = k.f18532c;
                while (!atomicReferenceArray.compareAndSet(i3, a2, a9)) {
                    if (atomicReferenceArray.get(i3) != a2) {
                        return false;
                    }
                }
                boolean z6 = h9 instanceof InterfaceC0894j;
                A a10 = A.f22523a;
                if (z6) {
                    ((InterfaceC0894j) h9).g(a10, this.f18529b);
                    return true;
                }
                if (h9 instanceof h) {
                    ((g) ((h) h9)).f15537l = a10;
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + h9).toString());
            }
        }
        h9.a(lVar2, i3);
        return true;
    }

    public final void c() {
        int i3;
        Object objB;
        boolean z6;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i9 = this.f18528a;
            if (andIncrement >= i9) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= i9) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, i9));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i9).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18524c;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f18525d.getAndIncrement(this);
            long j = andIncrement2 / ((long) k.f18535f);
            h hVar = h.f18523h;
            while (true) {
                objB = X7.a.b(lVar, j, hVar);
                if (!X7.a.e(objB)) {
                    q qVarC = X7.a.c(objB);
                    while (true) {
                        q qVar = (q) atomicReferenceFieldUpdater.get(this);
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
            l lVar2 = (l) X7.a.c(objB);
            lVar2.a();
            z6 = false;
            if (lVar2.j <= j) {
                int i10 = (int) (andIncrement2 % ((long) k.f18535f));
                N6.A a2 = k.f18531b;
                AtomicReferenceArray atomicReferenceArray = lVar2.f18536l;
                Object andSet = atomicReferenceArray.getAndSet(i10, a2);
                if (andSet == null) {
                    int i11 = k.f18530a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            N6.A a9 = k.f18531b;
                            N6.A a10 = k.f18533d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i10, a9, a10)) {
                                    z6 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i10) == a9);
                            z6 = !z6;
                            break;
                        }
                        if (atomicReferenceArray.get(i10) == k.f18532c) {
                            z6 = true;
                            break;
                        }
                        i12++;
                    }
                } else if (andSet != k.f18534e) {
                    boolean z9 = andSet instanceof InterfaceC0894j;
                    A a11 = A.f22523a;
                    if (z9) {
                        InterfaceC0894j interfaceC0894j = (InterfaceC0894j) andSet;
                        N6.A aN = interfaceC0894j.n(a11, this.f18529b);
                        if (aN != null) {
                            interfaceC0894j.o(aN);
                            z6 = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof h)) {
                            throw new IllegalStateException(p.n(andSet, "unexpected: "));
                        }
                        if (((g) ((h) andSet)).g(this, a11) == 0) {
                            z6 = true;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (!z6);
    }
}
