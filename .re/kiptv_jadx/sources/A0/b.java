package A0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, java.lang.Object obj) {
        super(1);
        this.f17h = i3;
        this.f18i = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [O0.g0, Q0.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.o, x6.j] */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i3 = 0;
        p070h6.A a2 = p070h6.A.f22523a;
        java.lang.Object obj2 = this.f18i;
        switch (this.f17h) {
            case 0:
                p203z0.d dVar = (p203z0.d) obj;
                A0.d dVar2 = (A0.d) obj2;
                p188x0.C3088h c3088h = dVar2.f30l;
                if (dVar2.f32n && dVar2.f41w && c3088h != null) {
                    j1.l lVarD0 = dVar.d0();
                    long jQ = lVarD0.q();
                    lVarD0.j().e();
                    try {
                        ((j1.l) ((p191x3.C) lVarD0.f23899i).f31153h).j().r(c3088h);
                        dVar2.c(dVar);
                    } finally {
                        p121o0.p.z(lVarD0, jQ);
                    }
                } else {
                    dVar2.c(dVar);
                }
                return a2;
            case 1:
                D0.D d4 = (D0.D) obj;
                D0.C0202c c0202c = (D0.C0202c) obj2;
                c0202c.g(d4);
                ?? r9 = c0202c.f1847i;
                if (r9 != 0) {
                    r9.invoke(d4);
                }
                return a2;
            case 2:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                K0.S s9 = (K0.S) obj2;
                S7.C0895k c0895k = s9.j;
                if (c0895k != null) {
                    c0895k.cancel(th);
                }
                s9.j = null;
                return a2;
            case 3:
                java.lang.Throwable th2 = (java.lang.Throwable) obj;
                O1.N n3 = (O1.N) obj2;
                if (th2 != null) {
                    n3.f7781h.G(new O1.O(th2));
                }
                if (n3.j.isInitialized()) {
                    ((Q1.i) n3.j.getValue()).close();
                }
                return a2;
            case 4:
                Q0.InterfaceC0762a interfaceC0762a = (Q0.InterfaceC0762a) obj;
                if (interfaceC0762a.p() != Integer.MAX_VALUE) {
                    if (interfaceC0762a.c().f8259b) {
                        interfaceC0762a.L();
                    }
                    java.util.Iterator it = interfaceC0762a.c().f8265i.entrySet().iterator();
                    while (true) {
                        Q0.G g = (Q0.G) obj2;
                        if (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            Q0.G.a(g, (O0.C0723l) entry.getKey(), ((java.lang.Number) entry.getValue()).intValue(), interfaceC0762a.g());
                        } else {
                            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = interfaceC0762a.g().f15863x;
                            kotlin.jvm.internal.m.b(nodeCoordinator);
                            while (!nodeCoordinator.equals(g.f8258a.g())) {
                                for (O0.C0723l c0723l : g.b(nodeCoordinator).keySet()) {
                                    Q0.G.a(g, c0723l, g.c(nodeCoordinator, c0723l), nodeCoordinator);
                                }
                                nodeCoordinator = nodeCoordinator.f15863x;
                                kotlin.jvm.internal.m.b(nodeCoordinator);
                            }
                        }
                    }
                }
                return a2;
            case 5:
                ((p038e0.e) obj2).c((p137q0.n) obj);
                return java.lang.Boolean.TRUE;
            case 6:
                return java.lang.Boolean.valueOf(((p175v0.F) obj).U0(((p175v0.C2911f) obj2).f29068a));
            case 7:
                Q0.K k9 = (Q0.K) obj;
                R0.C0837n c0837n = (R0.C0837n) obj2;
                if (c0837n.f8943w.getInsetsListener().f7674m.g() > 0) {
                    p136q.w wVar = O0.y0.f7714a;
                    k9.f8284h = true;
                    Q0.N n9 = k9.f8286k;
                    O0.InterfaceC0732v interfaceC0732vY0 = n9.y0();
                    if (p113n1.k.a(k9.f8285i, 9223372034707292159L)) {
                        k9.f8285i = com.google.android.gms.internal.play_billing.V0.D(interfaceC0732vY0.A(0L));
                        k9.j = interfaceC0732vY0.k();
                    }
                    n9.B0().f8233O.b();
                    long jK = interfaceC0732vY0.k();
                    androidx.compose.ui.platform.AndroidComposeView androidComposeView = c0837n.f8943w;
                    p136q.H h9 = androidComposeView.getInsetsListener().f7673l;
                    int i9 = (int) (jK >> 32);
                    int i10 = (int) (4294967295L & jK);
                    O0.w0[] w0VarArr = O0.y0.f7715b;
                    int length = w0VarArr.length;
                    int i11 = 0;
                    while (i11 < length) {
                        O0.w0 w0Var = w0VarArr[i11];
                        java.lang.Object objG = h9.g(w0Var);
                        kotlin.jvm.internal.m.b(objG);
                        O0.z0 z0Var = (O0.z0) objG;
                        O0.x0 x0Var = (O0.x0) w0Var;
                        int i12 = i10;
                        O0.y0.a(k9, x0Var.f7710c, z0Var.f7723h, i9, i12);
                        if (((java.lang.Boolean) z0Var.f7718b.getValue()).booleanValue()) {
                            O0.y0.a(k9, z0Var.f7722f, z0Var.j, i9, i12);
                            O0.y0.a(k9, z0Var.g, z0Var.f7725k, i9, i12);
                        }
                        O0.y0.a(k9, x0Var.f7711d, z0Var.f7724i, i9, i12);
                        i11++;
                        i10 = i12;
                    }
                    p136q.D d6 = androidComposeView.getInsetsListener().f7675n;
                    if (d6.i()) {
                        p121o0.n nVar = androidComposeView.getInsetsListener().f7676o;
                        java.lang.Object[] objArr = d6.f26303a;
                        int i13 = d6.f26304b;
                        while (i3 < i13) {
                            p020c0.X x9 = (p020c0.X) objArr[i3];
                            O0.C0726o c0726o = (O0.C0726o) nVar.get(i3);
                            android.graphics.Rect rect = (android.graphics.Rect) x9.getValue();
                            k9.a(c0726o.b(), rect.left);
                            k9.a(c0726o.d(), rect.top);
                            k9.a(c0726o.c(), rect.right);
                            k9.a(c0726o.a(), rect.bottom);
                            i3++;
                        }
                    }
                }
                return a2;
            case 8:
                return java.lang.Boolean.valueOf(((p136q.w) obj2).a(((Y0.p) obj).g));
            case 9:
                return java.lang.Boolean.valueOf(R0.L.c((Y0.p) obj, (android.content.res.Resources) obj2));
            case 10:
                return new C5.F0(9, (R0.C0847s0) obj2);
            case 11:
                if (R0.AbstractC0855w0.f9005b.compareAndSet(false, true)) {
                    ((U7.j) obj2).mo3trySendJP2dKIU(a2);
                }
                return a2;
            case 12:
                p203z0.d dVar3 = (p203z0.d) obj;
                p188x0.InterfaceC3097q interfaceC3097qJ = dVar3.d0().j();
                p194x6.m mVar = ((R0.C0857x0) obj2).f9012k;
                if (mVar != null) {
                    mVar.invoke(interfaceC3097qJ, (A0.d) dVar3.d0().j);
                }
                return a2;
            case 13:
                g1.m mVar2 = (g1.m) obj;
                S.y yVar = mVar2.f21832b;
                if (yVar != null) {
                    mVar2.a(yVar);
                    mVar2.f21832b = null;
                }
                R0.A0 a9 = (R0.A0) obj2;
                p038e0.e eVar = a9.f8735d;
                java.lang.Object[] objArr2 = eVar.f21324h;
                int i14 = eVar.j;
                while (true) {
                    if (i3 >= i14) {
                        i3 = -1;
                    } else if (!kotlin.jvm.internal.m.a((Q0.E0) objArr2[i3], mVar2)) {
                        i3++;
                    }
                }
                p038e0.e eVar2 = a9.f8735d;
                if (i3 >= 0) {
                    eVar2.m(i3);
                }
                if (eVar2.j == 0) {
                    a9.f8733b.invoke();
                }
                return a2;
            case 14:
                if (((java.lang.Throwable) obj) != null) {
                    ((android.os.CancellationSignal) obj2).cancel();
                }
                return a2;
            case 15:
                Y0.v.c((Y0.x) obj, ((Y0.i) obj2).f11038a);
                return a2;
            case 16:
                ((java.util.List) obj).add((java.lang.Float) ((F.Z) obj2).invoke());
                return true;
            case 17:
                for (p063g8.o oVar : ((p063g8.p) obj2).f22390c) {
                    oVar.f22386a.r(obj, oVar.f22387b);
                }
                return a2;
            case 18:
                return obj == ((p136q.D) obj2) ? "(this)" : java.lang.String.valueOf(obj);
            case 19:
                return obj == ((p136q.E) obj2) ? "(this)" : java.lang.String.valueOf(obj);
            case 20:
                return obj == ((p136q.I) obj2) ? "(this)" : java.lang.String.valueOf(obj);
            case 21:
                ((Q0.F) obj2).e0((p113n1.c) obj);
                return a2;
            case 22:
                p181w0.b bVar = (p181w0.b) obj;
                p138q1.q qVar = (p138q1.q) obj2;
                if (qVar.f26487u) {
                    S7.C.A(qVar.B0(), null, new p138q1.p(qVar, bVar, null), 3);
                }
                return a2;
            case 23:
                return java.lang.Boolean.valueOf(kotlin.jvm.internal.m.a(obj, obj2));
            case 24:
                p163t.s0 s0Var = (p163t.s0) obj;
                p154s.C2728n c2728n = (p154s.C2728n) obj2;
                if (kotlin.jvm.internal.m.a(s0Var.a(), c2728n.f27160x.a())) {
                    int i15 = p154s.AbstractC2721g.f27146b;
                } else {
                    p020c0.e1 e1Var = (p020c0.e1) c2728n.f27160x.f27164d.g(s0Var.a());
                    if (e1Var != null) {
                        long j = ((p113n1.m) e1Var.getValue()).f25565a;
                    }
                }
                p020c0.e1 e1Var2 = (p020c0.e1) c2728n.f27160x.f27164d.g(s0Var.b());
                if (e1Var2 != null) {
                    long j9 = ((p113n1.m) e1Var2.getValue()).f25565a;
                }
                if (((p154s.Y) c2728n.f27159w.getValue()) == null) {
                    return p163t.AbstractC2750d.o(0.0f, 400.0f, null, 5);
                }
                long j10 = 1;
                return p163t.AbstractC2750d.o(0.0f, 400.0f, new p113n1.m((4294967295L & j10) | (j10 << 32)), 1);
            case 25:
                p163t.C2773q c2773q = (p163t.C2773q) obj;
                float f9 = c2773q.f27670b;
                if (f9 < 0.0f) {
                    f9 = 0.0f;
                }
                if (f9 > 1.0f) {
                    f9 = 1.0f;
                }
                float f10 = c2773q.f27671c;
                if (f10 < -0.5f) {
                    f10 = -0.5f;
                }
                if (f10 > 0.5f) {
                    f10 = 0.5f;
                }
                float f11 = c2773q.f27672d;
                float f12 = f11 >= -0.5f ? f11 : -0.5f;
                float f13 = f12 <= 0.5f ? f12 : 0.5f;
                float f14 = c2773q.f27669a;
                float f15 = f14 >= 0.0f ? f14 : 0.0f;
                return new p188x0.C3098s(p188x0.C3098s.b(p188x0.z.b(f9, f10, f13, f15 <= 1.0f ? f15 : 1.0f, p196y0.d.f31753x), (p196y0.c) obj2));
            case 26:
                return java.lang.Boolean.valueOf(!kotlin.jvm.internal.m.a(obj, ((p163t.y0) obj2).f27730d.getValue()));
            case 27:
                ((p188x0.L) obj).b(((java.lang.Number) ((p163t.u0) obj2).f27708q.getValue()).floatValue());
                return a2;
            case 28:
                t0.f fVar = (t0.f) obj;
                if (!fVar.f26475h.f26487u) {
                    return Q0.B0.f8208i;
                }
                t0.f fVar2 = fVar.f27751w;
                if (fVar2 != null) {
                    A0.b bVar2 = new A0.b(28, (p020c0.C1704s0) obj2);
                    if (bVar2.invoke(fVar2) == Q0.B0.f8207h) {
                        Q0.AbstractC0777k.y(fVar2, bVar2);
                    }
                }
                fVar.f27751w = null;
                fVar.f27750v = null;
                return Q0.B0.f8207h;
            default:
                p188x0.L l2 = (p188x0.L) obj;
                p171u0.k kVar = (p171u0.k) obj2;
                l2.o(l2.getDensity() * kVar.f28661b);
                l2.p(kVar.f28662c);
                l2.g(kVar.f28663d);
                l2.c(kVar.f28664e);
                l2.z(kVar.f28665f);
                return a2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p154s.C2728n c2728n, long j) {
        super(1);
        this.f17h = 24;
        this.f18i = c2728n;
    }
}
