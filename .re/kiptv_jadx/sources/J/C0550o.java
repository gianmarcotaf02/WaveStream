package J;

/* JADX INFO: renamed from: J.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0550o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J.X f5853i;

    public /* synthetic */ C0550o(J.X x9, int i3) {
        this.f5852h = i3;
        this.f5853i = x9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f5852h) {
            case 0:
                O0.InterfaceC0732v interfaceC0732v = (O0.InterfaceC0732v) obj;
                J.y0 y0VarD = this.f5853i.d();
                if (y0VarD != null) {
                    y0VarD.f5965c = interfaceC0732v;
                }
                return p070h6.A.f22523a;
            case 1:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                this.f5853i.f5734q.setValue(bool);
                return p070h6.A.f22523a;
            case 2:
                g1.x xVar = (g1.x) obj;
                java.lang.String str = xVar.f21847a.f17809i;
                J.X x9 = this.f5853i;
                p011b1.C1650g c1650g = x9.j;
                if (!kotlin.jvm.internal.m.a(str, c1650g != null ? c1650g.f17809i : null)) {
                    x9.f5728k.setValue(J.M.f5654h);
                    p020c0.C1681g0 c1681g0 = x9.f5737t;
                    if (((java.lang.Boolean) c1681g0.getValue()).booleanValue()) {
                        c1681g0.setValue(java.lang.Boolean.FALSE);
                    } else {
                        x9.f5736s.setValue(java.lang.Boolean.FALSE);
                    }
                }
                long j = p011b1.L.f17782b;
                x9.f(j);
                x9.e(j);
                x9.f5738u.invoke(xVar);
                p020c0.C1701q0 c1701q0 = x9.f5721b;
                p020c0.C1715y c1715y = c1701q0.f18348a;
                if (c1715y != null) {
                    c1715y.s(c1701q0, null);
                }
                return p070h6.A.f22523a;
            case 3:
                this.f5853i.f5735r.b(((g1.j) obj).f21823a);
                return p070h6.A.f22523a;
            default:
                return java.lang.Boolean.valueOf(this.f5853i.f5735r.b(((g1.j) obj).f21823a));
        }
    }
}
