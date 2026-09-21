package U7;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends X7.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final U7.j f10220l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray f10221m;

    public s(long j, U7.s sVar, U7.j jVar, int i3) {
        super(j, sVar, i3);
        this.f10220l = jVar;
        this.f10221m = new java.util.concurrent.atomic.AtomicReferenceArray(U7.l.f10197b * 2);
    }

    @Override // X7.q
    public final int g() {
        return U7.l.f10197b;
    }

    @Override // X7.q
    public final void h(int i3, p100l6.h hVar) {
        U7.j jVar;
        int i9 = U7.l.f10197b;
        boolean z6 = i3 >= i9;
        if (z6) {
            i3 -= i9;
        }
        this.f10221m.get(i3 * 2);
        while (true) {
            java.lang.Object objL = l(i3);
            boolean z9 = objL instanceof S7.H0;
            jVar = this.f10220l;
            if (z9 || (objL instanceof U7.E)) {
                if (k(objL, i3, z6 ? U7.l.j : U7.l.f10204k)) {
                    n(i3, null);
                    m(i3, !z6);
                    if (z6) {
                        kotlin.jvm.internal.m.b(jVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objL == U7.l.j || objL == U7.l.f10204k) {
                    break;
                }
                if (objL != U7.l.g && objL != U7.l.f10201f) {
                    if (objL != U7.l.f10203i && objL != U7.l.f10199d && objL != U7.l.f10205l) {
                        throw new java.lang.IllegalStateException(p121o0.p.n(objL, "unexpected state: "));
                    }
                    return;
                }
            }
        }
        n(i3, null);
        if (z6) {
            kotlin.jvm.internal.m.b(jVar);
        }
    }

    public final boolean k(java.lang.Object obj, int i3, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f10221m;
        int i9 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i9, obj, obj2)) {
            if (atomicReferenceArray.get(i9) != obj) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.Object l(int i3) {
        return this.f10221m.get((i3 * 2) + 1);
    }

    public final void m(int i3, boolean z6) {
        if (z6) {
            U7.j jVar = this.f10220l;
            kotlin.jvm.internal.m.b(jVar);
            jVar.F((this.j * ((long) U7.l.f10197b)) + ((long) i3));
        }
        i();
    }

    public final void n(int i3, java.lang.Object obj) {
        this.f10221m.set(i3 * 2, obj);
    }

    public final void o(int i3, N6.A a2) {
        this.f10221m.set((i3 * 2) + 1, a2);
    }
}
