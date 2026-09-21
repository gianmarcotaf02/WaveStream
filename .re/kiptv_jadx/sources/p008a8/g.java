package p008a8;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements S7.InterfaceC0892i, p008a8.h, S7.H0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15533m = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p008a8.g.class, java.lang.Object.class, "state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p100l6.h f15534h;
    public java.lang.Object j;
    private volatile /* synthetic */ java.lang.Object state$volatile = p008a8.j.f15539a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f15535i = new java.util.ArrayList(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15536k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f15537l = p008a8.j.f15542d;

    public g(p100l6.h hVar) {
        this.f15534h = hVar;
    }

    @Override // S7.H0
    public final void a(X7.q qVar, int i3) {
        this.j = qVar;
        this.f15536k = i3;
    }

    @Override // S7.InterfaceC0892i
    public final void b(java.lang.Throwable th) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15533m;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == p008a8.j.f15540b) {
                return;
            }
            N6.A a2 = p008a8.j.f15541c;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                    java.util.ArrayList arrayList = this.f15535i;
                    if (arrayList == null) {
                        return;
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((p008a8.e) it.next()).a();
                    }
                    this.f15537l = p008a8.j.f15542d;
                    this.f15535i = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final java.lang.Object c(p117n6.c cVar) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15533m;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        p008a8.e eVar = (p008a8.e) obj;
        java.lang.Object obj2 = this.f15537l;
        java.util.ArrayList<p008a8.e> arrayList = this.f15535i;
        if (arrayList != null) {
            for (p008a8.e eVar2 : arrayList) {
                if (eVar2 != eVar) {
                    eVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, p008a8.j.f15540b);
            this.f15537l = p008a8.j.f15542d;
            this.f15535i = null;
        }
        java.lang.Object objInvoke = eVar.f15525c.invoke(eVar.f15523a, eVar.f15526d, obj2);
        N6.A a2 = p008a8.j.f15543e;
        p070h6.e eVar3 = eVar.f15527e;
        return eVar.f15526d == a2 ? ((p194x6.j) eVar3).invoke(cVar) : ((p194x6.m) eVar3).invoke(objInvoke, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(p117n6.c cVar) throws S7.J {
        p008a8.f fVar;
        java.lang.Object obj;
        p008a8.g gVar;
        if (cVar instanceof p008a8.f) {
            fVar = (p008a8.f) cVar;
            int i3 = fVar.f15532k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.f15532k = i3 - Integer.MIN_VALUE;
            } else {
                fVar = new p008a8.f(this, cVar);
            }
        } else {
            fVar = new p008a8.f(this, cVar);
        }
        java.lang.Object obj2 = fVar.f15531i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = fVar.f15532k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj2);
            fVar.f15530h = this;
            fVar.f15532k = 1;
            S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(fVar));
            c0895k.r();
            loop0: while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15533m;
                java.lang.Object obj3 = atomicReferenceFieldUpdater.get(this);
                N6.A a2 = p008a8.j.f15539a;
                obj = p070h6.A.f22523a;
                if (obj3 == a2) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, c0895k)) {
                            c0895k.u(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                } else {
                    if (!(obj3 instanceof java.util.List)) {
                        if (!(obj3 instanceof p008a8.e)) {
                            throw new java.lang.IllegalStateException(p121o0.p.n(obj3, "unexpected state: "));
                        }
                        ((p008a8.e) obj3).getClass();
                        c0895k.g(obj, null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, a2)) {
                            java.util.Iterator it = ((java.lang.Iterable) obj3).iterator();
                            while (it.hasNext()) {
                                p008a8.e eVarE = e(it.next());
                                kotlin.jvm.internal.m.b(eVarE);
                                eVarE.f15528f = null;
                                eVarE.g = -1;
                                f(eVarE, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                }
            }
            java.lang.Object objQ = c0895k.q();
            if (objQ == p109m6.a.f25430h) {
                obj = objQ;
            }
            if (obj != aVar) {
                gVar = this;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj2);
            return obj2;
        }
        gVar = fVar.f15530h;
        com.google.common.util.concurrent.P.u0(obj2);
        fVar.f15530h = null;
        fVar.f15532k = 2;
        java.lang.Object objC = gVar.c(fVar);
        return objC == aVar ? aVar : objC;
    }

    public final p008a8.e e(java.lang.Object obj) {
        java.util.ArrayList arrayList = this.f15535i;
        java.lang.Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (java.lang.Object obj3 : arrayList) {
            if (((p008a8.e) obj3).f15523a == obj) {
                obj2 = obj3;
                break;
            }
        }
        p008a8.e eVar = (p008a8.e) obj2;
        if (eVar != null) {
            return eVar;
        }
        throw new java.lang.IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.j, x6.n] */
    public final void f(p008a8.e eVar, boolean z6) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15533m;
        if (atomicReferenceFieldUpdater.get(this) instanceof p008a8.e) {
            return;
        }
        java.lang.Object obj = eVar.f15523a;
        if (!z6) {
            java.util.ArrayList arrayList = this.f15535i;
            kotlin.jvm.internal.m.b(arrayList);
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((p008a8.e) it.next()).f15523a == obj) {
                        throw new java.lang.IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        eVar.f15524b.invoke(obj, this, eVar.f15526d);
        if (this.f15537l != p008a8.j.f15542d) {
            atomicReferenceFieldUpdater.set(this, eVar);
            return;
        }
        if (!z6) {
            java.util.ArrayList arrayList2 = this.f15535i;
            kotlin.jvm.internal.m.b(arrayList2);
            arrayList2.add(eVar);
        }
        eVar.f15528f = this.j;
        eVar.g = this.f15536k;
        this.j = null;
        this.f15536k = -1;
    }

    public final int g(java.lang.Object obj, java.lang.Object obj2) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15533m;
            java.lang.Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof S7.InterfaceC0894j)) {
                if (kotlin.jvm.internal.m.a(obj3, p008a8.j.f15540b) || (obj3 instanceof p008a8.e)) {
                    return 3;
                }
                if (kotlin.jvm.internal.m.a(obj3, p008a8.j.f15541c)) {
                    return 2;
                }
                if (kotlin.jvm.internal.m.a(obj3, p008a8.j.f15539a)) {
                    java.util.List listI0 = com.google.common.util.concurrent.P.i0(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listI0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof java.util.List)) {
                    throw new java.lang.IllegalStateException(p121o0.p.n(obj3, "Unexpected state: "));
                }
                java.util.ArrayList arrayListZ1 = p078i6.o.z1(obj, (java.util.Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListZ1)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            p008a8.e eVarE = e(obj);
            if (eVarE == null) {
                continue;
            } else {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, eVarE)) {
                        S7.InterfaceC0894j interfaceC0894j = (S7.InterfaceC0894j) obj3;
                        this.f15537l = obj2;
                        N6.A aN = interfaceC0894j.n(p070h6.A.f22523a, null);
                        if (aN == null) {
                            this.f15537l = p008a8.j.f15542d;
                            return 2;
                        }
                        interfaceC0894j.o(aN);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            }
        }
    }
}
