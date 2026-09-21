package K0;

/* JADX INFO: renamed from: K0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661i implements D7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f6707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f6708d;

    public C0661i() {
        this.f6705a = 4;
        this.f6707c = new java.lang.Object();
    }

    @Override // D7.c
    public boolean a(C7.M c9, C7.M c10) {
        kotlin.jvm.internal.m.e(c9, "c1");
        kotlin.jvm.internal.m.e(c10, "c2");
        if (c9.equals(c10)) {
            return true;
        }
        N6.InterfaceC0694h interfaceC0694hH = c9.h();
        N6.InterfaceC0694h interfaceC0694hH2 = c10.h();
        if (!(interfaceC0694hH instanceof N6.U) || !(interfaceC0694hH2 instanceof N6.U)) {
            return false;
        }
        return p127o7.b.f26146a.d((N6.U) interfaceC0694hH, (N6.U) interfaceC0694hH2, this.f6706b, new B5.n((N6.InterfaceC0688b) this.f6707c, (N6.InterfaceC0688b) this.f6708d, 13));
    }

    public boolean b(long j) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((S.p) this.f6708d).f9153i;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            if (K0.w.e(((K0.z) obj).f6754a, j)) {
                break;
            }
            i3++;
        }
        K0.z zVar = (K0.z) obj;
        if (zVar != null) {
            return zVar.f6760h;
        }
        return false;
    }

    public void c() {
        ((U7.j) this.f6707c).i(new java.util.concurrent.CancellationException("onBack cancelled"), true);
        ((S7.w0) this.f6708d).e(null);
    }

    public U.EnumC0935h d() {
        U.C0948v c0948v = (U.C0948v) this.f6708d;
        int i3 = c0948v.f10086b;
        int i9 = c0948v.f10087c;
        if (i3 < i9) {
            return U.EnumC0935h.f9998i;
        }
        return i3 > i9 ? U.EnumC0935h.f9997h : U.EnumC0935h.j;
    }

    public void e() {
        if (this.f6706b) {
            U.i0.b((U.i0) this.f6708d, (p011b1.L) this.f6707c);
        }
    }

    public long f(g1.x xVar, long j, boolean z6, D1.C0223h c0223h) {
        long jC = U.i0.c((U.i0) this.f6708d, xVar, j, z6, false, c0223h, false);
        if (!p011b1.L.a(jC, (p011b1.L) this.f6707c)) {
            this.f6706b = false;
        }
        ((U.i0) this.f6708d).q(p011b1.L.c(jC) ? J.M.j : J.M.f5655i);
        return jC;
    }

    public void g(p059g4.f fVar) {
        synchronized (this.f6707c) {
            try {
                if (((java.util.ArrayDeque) this.f6708d) == null) {
                    this.f6708d = new java.util.ArrayDeque();
                }
                ((java.util.ArrayDeque) this.f6708d).add(fVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void h(A0.a aVar) {
        p059g4.f fVar;
        synchronized (this.f6707c) {
            if (((java.util.ArrayDeque) this.f6708d) != null && !this.f6706b) {
                this.f6706b = true;
                while (true) {
                    synchronized (this.f6707c) {
                        try {
                            fVar = (p059g4.f) ((java.util.ArrayDeque) this.f6708d).poll();
                            if (fVar == null) {
                                this.f6706b = false;
                                return;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    fVar.a(aVar);
                }
            }
        }
    }

    public java.lang.String toString() {
        switch (this.f6705a) {
            case 1:
                return "SingleSelectionLayout(isStartHandle=" + this.f6706b + ", crossed=" + d() + ", info=\n\t" + ((U.C0948v) this.f6708d) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0661i(int i3, java.lang.Object obj, java.lang.Object obj2, boolean z6) {
        this.f6705a = i3;
        this.f6706b = z6;
        this.f6707c = obj;
        this.f6708d = obj2;
    }

    public C0661i(p136q.r rVar, S.p pVar) {
        this.f6705a = 0;
        this.f6707c = rVar;
        this.f6708d = pVar;
    }

    public C0661i(S7.A a2, boolean z6, p194x6.m mVar, p029d.j jVar) {
        this.f6705a = 3;
        this.f6706b = z6;
        this.f6707c = N3.a.b(-2, 4, U7.EnumC0955c.f10175h);
        this.f6708d = S7.C.A(a2, null, new p029d.i(jVar, mVar, this, null), 3);
    }

    public C0661i(U.i0 i0Var) {
        this.f6705a = 2;
        this.f6708d = i0Var;
        this.f6706b = true;
    }
}
