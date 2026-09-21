package p028c8;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f18524c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p028c8.i.class, java.lang.Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f18525d = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p028c8.i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f18526e = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p028c8.i.class, java.lang.Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater f18527f = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(p028c8.i.class, "enqIdx$volatile");
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater g = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p028c8.i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J.n0 f18529b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    private volatile /* synthetic */ java.lang.Object tail$volatile;

    public i(int i3) {
        this.f18528a = i3;
        if (i3 <= 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "The number of acquired permits should be in 0..").toString());
        }
        p028c8.l lVar = new p028c8.l(0L, null, 2);
        this.head$volatile = lVar;
        this.tail$volatile = lVar;
        this._availablePermits$volatile = i3;
        this.f18529b = new J.n0(6, this);
    }

    public final java.lang.Object a(p117n6.c cVar) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i3;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i3 = this.f18528a;
        } while (andDecrement > i3);
        p070h6.A a2 = p070h6.A.f22523a;
        if (andDecrement <= 0) {
            S7.C0895k c0895kU = S7.C.u(com.google.common.util.concurrent.P.h0(cVar));
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
                java.lang.Object objQ = c0895kU.q();
                p109m6.a aVar = p109m6.a.f25430h;
                if (objQ != aVar) {
                    objQ = a2;
                }
                if (objQ == aVar) {
                    return objQ;
                }
            } catch (java.lang.Throwable th) {
                c0895kU.y();
                throw th;
            }
        }
        return a2;
    }

    public final boolean b(S7.H0 h9) {
        java.lang.Object objB;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18526e;
        p028c8.l lVar = (p028c8.l) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f18527f.getAndIncrement(this);
        p028c8.g gVar = p028c8.g.f18522h;
        long j = andIncrement / ((long) p028c8.k.f18535f);
        loop0: while (true) {
            objB = X7.a.b(lVar, j, gVar);
            if (!X7.a.e(objB)) {
                X7.q qVarC = X7.a.c(objB);
                while (true) {
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
        p028c8.l lVar2 = (p028c8.l) X7.a.c(objB);
        int i3 = (int) (andIncrement % ((long) p028c8.k.f18535f));
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = lVar2.f18536l;
        while (!atomicReferenceArray.compareAndSet(i3, null, h9)) {
            if (atomicReferenceArray.get(i3) != null) {
                N6.A a2 = p028c8.k.f18531b;
                N6.A a9 = p028c8.k.f18532c;
                while (!atomicReferenceArray.compareAndSet(i3, a2, a9)) {
                    if (atomicReferenceArray.get(i3) != a2) {
                        return false;
                    }
                }
                boolean z6 = h9 instanceof S7.InterfaceC0894j;
                p070h6.A a10 = p070h6.A.f22523a;
                if (z6) {
                    ((S7.InterfaceC0894j) h9).g(a10, this.f18529b);
                    return true;
                }
                if (h9 instanceof p008a8.h) {
                    ((p008a8.g) ((p008a8.h) h9)).f15537l = a10;
                    return true;
                }
                throw new java.lang.IllegalStateException(("unexpected: " + h9).toString());
            }
        }
        h9.a(lVar2, i3);
        return true;
    }

    public final void c() {
        int i3;
        java.lang.Object objB;
        boolean z6;
        do {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i9 = this.f18528a;
            if (andIncrement >= i9) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= i9) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, i9));
                throw new java.lang.IllegalStateException(("The number of released permits cannot be greater than " + i9).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18524c;
            p028c8.l lVar = (p028c8.l) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f18525d.getAndIncrement(this);
            long j = andIncrement2 / ((long) p028c8.k.f18535f);
            p028c8.h hVar = p028c8.h.f18523h;
            while (true) {
                objB = X7.a.b(lVar, j, hVar);
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
            p028c8.l lVar2 = (p028c8.l) X7.a.c(objB);
            lVar2.a();
            z6 = false;
            if (lVar2.j <= j) {
                int i10 = (int) (andIncrement2 % ((long) p028c8.k.f18535f));
                N6.A a2 = p028c8.k.f18531b;
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = lVar2.f18536l;
                java.lang.Object andSet = atomicReferenceArray.getAndSet(i10, a2);
                if (andSet == null) {
                    int i11 = p028c8.k.f18530a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            N6.A a9 = p028c8.k.f18531b;
                            N6.A a10 = p028c8.k.f18533d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i10, a9, a10)) {
                                    z6 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i10) == a9);
                            z6 = !z6;
                            break;
                        }
                        if (atomicReferenceArray.get(i10) == p028c8.k.f18532c) {
                            z6 = true;
                            break;
                        }
                        i12++;
                    }
                } else if (andSet != p028c8.k.f18534e) {
                    boolean z9 = andSet instanceof S7.InterfaceC0894j;
                    p070h6.A a11 = p070h6.A.f22523a;
                    if (z9) {
                        S7.InterfaceC0894j interfaceC0894j = (S7.InterfaceC0894j) andSet;
                        N6.A aN = interfaceC0894j.n(a11, this.f18529b);
                        if (aN != null) {
                            interfaceC0894j.o(aN);
                            z6 = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof p008a8.h)) {
                            throw new java.lang.IllegalStateException(p121o0.p.n(andSet, "unexpected: "));
                        }
                        if (((p008a8.g) ((p008a8.h) andSet)).g(this, a11) == 0) {
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
