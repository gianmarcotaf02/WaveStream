package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class F implements p020c0.InterfaceC1682h, Q0.p0, Q0.InterfaceC0773g {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final Q0.A f8217Z = new Q0.A("Undefined intrinsics block and it is required");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Q0.C0791z f8218a0 = new Q0.C0791z();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final A1.b f8219b0 = new A1.b(3);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public androidx.compose.ui.semantics.SemanticsConfiguration f8220A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f8221B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p038e0.e f8222C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f8223D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public O0.S f8224E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public S.p f8225F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p113n1.c f8226G;
    public p113n1.n H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public R0.V0 f8227I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public p020c0.A f8228J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Q0.D f8229K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Q0.D f8230L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f8231M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Q0.C0765b0 f8232N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Q0.J f8233O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public O0.N f8234P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public androidx.compose.ui.node.NodeCoordinator f8235Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f8236R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public p137q0.p f8237S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public p137q0.p f8238T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public p138q1.d f8239U;
    public K0.G V;
    public boolean W;
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f8240Y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8242i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Q0.F f8248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final S.p f8250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p038e0.e f8251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8252t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Q0.F f8253u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.compose.ui.platform.AndroidComposeView f8254v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p138q1.y f8255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8256x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8257z;

    public F(int i3) {
        this((i3 & 1) == 0, Y0.m.f11087a.addAndGet(1));
    }

    public static boolean T(Q0.F f9) {
        Q0.W w6 = f9.f8233O.f8282p;
        return f9.S(w6.f8370q ? new p113n1.a(w6.f7641k) : null);
    }

    public static void Y(Q0.F f9, boolean z6, int i3) {
        Q0.F fX;
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        boolean z9 = (i3 & 2) != 0;
        boolean z10 = (i3 & 4) != 0;
        if (f9.f8248p == null) {
            N0.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = f9.f8254v;
        if (androidComposeView == null || f9.y || f9.f8241h) {
            return;
        }
        androidComposeView.z(f9, true, z6, z9);
        if (z10) {
            Q0.S s9 = f9.f8233O.f8283q;
            kotlin.jvm.internal.m.b(s9);
            Q0.J j = s9.f8323m;
            Q0.F fX2 = j.f8269a.x();
            Q0.D d4 = j.f8269a.f8229K;
            if (fX2 == null || d4 == Q0.D.j) {
                return;
            }
            while (fX2.f8229K == d4 && (fX = fX2.x()) != null) {
                fX2 = fX;
            }
            int iOrdinal = d4.ordinal();
            if (iOrdinal == 0) {
                if (fX2.f8248p != null) {
                    Y(fX2, z6, 6);
                    return;
                } else {
                    a0(fX2, z6, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (fX2.f8248p != null) {
                fX2.X(z6);
            } else {
                fX2.Z(z6);
            }
        }
    }

    public static void a0(Q0.F f9, boolean z6, int i3) {
        androidx.compose.ui.platform.AndroidComposeView androidComposeView;
        Q0.F fX;
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        boolean z9 = (i3 & 2) != 0;
        boolean z10 = (i3 & 4) != 0;
        if (f9.y || f9.f8241h || (androidComposeView = f9.f8254v) == null) {
            return;
        }
        androidComposeView.z(f9, false, z6, z9);
        if (z10) {
            Q0.J j = f9.f8233O.f8282p.f8366m;
            Q0.F fX2 = j.f8269a.x();
            Q0.D d4 = j.f8269a.f8229K;
            if (fX2 == null || d4 == Q0.D.j) {
                return;
            }
            while (fX2.f8229K == d4 && (fX = fX2.x()) != null) {
                fX2 = fX;
            }
            int iOrdinal = d4.ordinal();
            if (iOrdinal == 0) {
                a0(fX2, z6, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent");
                }
                fX2.Z(z6);
            }
        }
    }

    public static void b0(Q0.F f9) {
        int i3 = Q0.E.f8216a[f9.f8233O.f8272d.ordinal()];
        Q0.J j = f9.f8233O;
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("Unexpected state " + j.f8272d);
        }
        if (j.f8273e) {
            Y(f9, true, 6);
            return;
        }
        if (j.f8274f) {
            f9.X(true);
        }
        if (f9.s()) {
            a0(f9, true, 6);
        } else if (f9.r()) {
            f9.Z(true);
        }
    }

    private final java.lang.String j(Q0.F f9) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot insert ");
        sb.append(f9);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        Q0.F f10 = f9.f8253u;
        sb.append(f10 != null ? f10.g(0) : null);
        return sb.toString();
    }

    public final int A() {
        return this.f8233O.f8282p.f7639h;
    }

    public final p038e0.e B() {
        boolean z6 = this.f8223D;
        p038e0.e eVar = this.f8222C;
        if (z6) {
            eVar.i();
            eVar.d(eVar.j, C());
            p078i6.m.B0(eVar.f21324h, f8219b0, 0, eVar.j);
            this.f8223D = false;
        }
        return eVar;
    }

    public final p038e0.e C() {
        k0();
        if (this.f8249q == 0) {
            return (p038e0.e) this.f8250r.f9153i;
        }
        p038e0.e eVar = this.f8251s;
        kotlin.jvm.internal.m.b(eVar);
        return eVar;
    }

    public final void D(long j, Q0.C0783q c0783q, int i3, boolean z6) {
        Q0.C0765b0 c0765b0 = this.f8232N;
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = c0765b0.f8389d;
        p188x0.L l2 = androidx.compose.ui.node.NodeCoordinator.f15841T;
        c0765b0.f8389d.Z0(androidx.compose.ui.node.NodeCoordinator.W, nodeCoordinator.R0(j), c0783q, i3, z6);
    }

    public final void E(int i3, Q0.F f9) {
        if (f9.f8253u != null && f9.f8254v != null) {
            N0.a.b(j(f9));
        }
        f9.f8253u = this;
        S.p pVar = this.f8250r;
        ((p038e0.e) pVar.f9153i).b(i3, f9);
        ((A8.m) pVar.j).invoke();
        R();
        if (f9.f8241h) {
            this.f8249q++;
        }
        J();
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f8254v;
        if (androidComposeView != null) {
            f9.c(androidComposeView);
        }
        if (f9.f8233O.f8278l > 0) {
            Q0.J j = this.f8233O;
            j.d(j.f8278l + 1);
        }
        if (f9.X > 0) {
            f0(this.X + 1);
        }
    }

    public final void F() {
        if (this.f8236R) {
            Q0.C0765b0 c0765b0 = this.f8232N;
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = c0765b0.f8388c;
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = c0765b0.f8389d.f15863x;
            this.f8235Q = null;
            while (!kotlin.jvm.internal.m.a(nodeCoordinator, nodeCoordinator2)) {
                if ((nodeCoordinator != null ? nodeCoordinator.f15860S : null) != null) {
                    this.f8235Q = nodeCoordinator;
                    break;
                }
                nodeCoordinator = nodeCoordinator != null ? nodeCoordinator.f15863x : null;
            }
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator3 = this.f8235Q;
        if (nodeCoordinator3 != null && nodeCoordinator3.f15860S == null) {
            throw p121o0.p.h("layer was not set");
        }
        if (nodeCoordinator3 != null) {
            nodeCoordinator3.b1();
            return;
        }
        Q0.F fX = x();
        if (fX != null) {
            fX.F();
        }
    }

    public final void G() {
        Q0.C0765b0 c0765b0 = this.f8232N;
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = c0765b0.f8389d;
        androidx.compose.ui.node.a aVar = c0765b0.f8388c;
        while (nodeCoordinator != aVar) {
            kotlin.jvm.internal.m.c(nodeCoordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            androidx.compose.ui.node.b bVar = (androidx.compose.ui.node.b) nodeCoordinator;
            Q0.n0 n0Var = bVar.f15860S;
            if (n0Var != null) {
                n0Var.invalidate();
            }
            nodeCoordinator = bVar.f15862w;
        }
        Q0.n0 n0Var2 = c0765b0.f8388c.f15860S;
        if (n0Var2 != null) {
            n0Var2.invalidate();
        }
    }

    public final void H() {
        if (this.f8241h) {
            Q0.F fX = x();
            if (fX != null) {
                fX.H();
                return;
            }
            return;
        }
        if (this.f8248p != null) {
            Y(this, false, 7);
        } else {
            a0(this, false, 7);
        }
    }

    public final void I() {
        if (this.f8221B) {
            return;
        }
        if (this.f8232N.f8387b.f26479m != null || this.f8238T != null) {
            this.f8257z = true;
            return;
        }
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = this.f8220A;
        this.f8221B = true;
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        a2.f24539h = new androidx.compose.ui.semantics.SemanticsConfiguration();
        Q0.q0 snapshotObserver = Q0.I.a(this).getSnapshotObserver();
        K0.C0656d c0656d = new K0.C0656d(this, a2, 3);
        snapshotObserver.f8460a.d(this, snapshotObserver.f8463d, c0656d);
        this.f8221B = false;
        this.f8220A = (androidx.compose.ui.semantics.SemanticsConfiguration) a2.f24539h;
        this.f8257z = false;
        Q0.o0 o0VarA = Q0.I.a(this);
        o0VarA.getSemanticsOwner().b(this, semanticsConfiguration);
        ((androidx.compose.ui.platform.AndroidComposeView) o0VarA).B();
    }

    public final void J() {
        Q0.F f9;
        if (this.f8249q > 0) {
            this.f8252t = true;
        }
        if (!this.f8241h || (f9 = this.f8253u) == null) {
            return;
        }
        f9.J();
    }

    public final boolean K() {
        return this.f8254v != null;
    }

    public final boolean L() {
        return this.f8233O.f8282p.f8378z;
    }

    public final java.lang.Boolean M() {
        Q0.S s9 = this.f8233O.f8283q;
        if (s9 != null) {
            return java.lang.Boolean.valueOf(s9.f8334x != Q0.P.j);
        }
        return null;
    }

    public final void N() {
        Q0.F fX;
        if (this.f8229K == Q0.D.j) {
            f();
        }
        Q0.S s9 = this.f8233O.f8283q;
        kotlin.jvm.internal.m.b(s9);
        boolean z6 = true;
        try {
            s9.f8324n = true;
            if (!s9.f8329s) {
                N0.a.b("replace() called on item that was not placed");
            }
            s9.f8322I = false;
            if (s9.f8334x == Q0.P.j) {
                z6 = false;
            }
            s9.z0(s9.f8333w, s9.f8332v);
            if (z6 && !s9.f8322I && (fX = s9.f8323m.f8269a.x()) != null) {
                fX.X(false);
            }
        } finally {
            s9.f8324n = false;
        }
    }

    public final void O(int i3, int i9, int i10) {
        if (i3 == i9) {
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i3 > i9 ? i3 + i11 : i3;
            int i13 = i3 > i9 ? i9 + i11 : (i9 + i10) - 2;
            S.p pVar = this.f8250r;
            java.lang.Object objM = ((p038e0.e) pVar.f9153i).m(i12);
            A8.m mVar = (A8.m) pVar.j;
            mVar.invoke();
            ((p038e0.e) pVar.f9153i).b(i13, (Q0.F) objM);
            mVar.invoke();
        }
        R();
        J();
        H();
    }

    public final void P(Q0.F f9) {
        if (f9.f8233O.f8278l > 0) {
            Q0.J j = this.f8233O;
            j.d(j.f8278l - 1);
        }
        if (this.f8254v != null) {
            f9.h();
        }
        f9.f8253u = null;
        if (f9.X > 0) {
            f0(this.X - 1);
        }
        f9.f8232N.f8389d.f15863x = null;
        if (f9.f8241h) {
            this.f8249q--;
            p038e0.e eVar = (p038e0.e) f9.f8250r.f9153i;
            java.lang.Object[] objArr = eVar.f21324h;
            int i3 = eVar.j;
            for (int i9 = 0; i9 < i3; i9++) {
                ((Q0.F) objArr[i9]).f8232N.f8389d.f15863x = null;
            }
        }
        J();
        R();
    }

    public final void Q() {
        Z0.b rectManager;
        this.f8246n = true;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f8254v;
        if (androidComposeView == null || (rectManager = androidComposeView.getRectManager()) == null) {
            return;
        }
        rectManager.d(this);
    }

    public final void R() {
        if (!this.f8241h) {
            this.f8223D = true;
            return;
        }
        Q0.F fX = x();
        if (fX != null) {
            fX.R();
        }
    }

    public final boolean S(p113n1.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f8229K == Q0.D.j) {
            e();
        }
        return this.f8233O.f8282p.B0(aVar.f25547a);
    }

    public final void U() {
        S.p pVar = this.f8250r;
        int i3 = ((p038e0.e) pVar.f9153i).j;
        while (true) {
            i3--;
            p038e0.e eVar = (p038e0.e) pVar.f9153i;
            if (-1 >= i3) {
                eVar.i();
                ((A8.m) pVar.j).invoke();
                return;
            }
            P((Q0.F) eVar.f21324h[i3]);
        }
    }

    public final void V(int i3, int i9) {
        if (i9 < 0) {
            N0.a.a("count (" + i9 + ") must be greater than 0");
        }
        int i10 = (i9 + i3) - 1;
        if (i3 > i10) {
            return;
        }
        while (true) {
            S.p pVar = this.f8250r;
            P((Q0.F) ((p038e0.e) pVar.f9153i).f21324h[i10]);
            java.lang.Object objM = ((p038e0.e) pVar.f9153i).m(i10);
            ((A8.m) pVar.j).invoke();
            if (i10 == i3) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void W() {
        Q0.F fX;
        if (this.f8229K == Q0.D.j) {
            f();
        }
        Q0.W w6 = this.f8233O.f8282p;
        Q0.J j = w6.f8366m;
        try {
            w6.f8367n = true;
            if (!w6.f8371r) {
                N0.a.b("replace called on unplaced item");
            }
            boolean z6 = w6.f8378z;
            w6.z0(w6.f8374u, w6.f8376w, w6.f8375v);
            if (z6 && !w6.f8360M && (fX = j.f8269a.x()) != null) {
                fX.Z(false);
            }
            w6.f8367n = false;
        } catch (java.lang.Throwable th) {
            try {
                j.f8269a.d0(th);
                throw null;
            } catch (java.lang.Throwable th2) {
                w6.f8367n = false;
                throw th2;
            }
        }
    }

    public final void X(boolean z6) {
        androidx.compose.ui.platform.AndroidComposeView androidComposeView;
        if (this.f8241h || (androidComposeView = this.f8254v) == null) {
            return;
        }
        androidComposeView.A(this, true, z6);
    }

    public final void Z(boolean z6) {
        androidx.compose.ui.platform.AndroidComposeView androidComposeView;
        if (this.f8241h || (androidComposeView = this.f8254v) == null) {
            return;
        }
        androidComposeView.A(this, false, z6);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void a(p137q0.p r20) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.F.a(q0.p):void");
    }

    @Override // p020c0.InterfaceC1682h
    public final void b() {
        p138q1.y yVar = this.f8255w;
        if (yVar != null) {
            yVar.b();
        }
        O0.N n3 = this.f8234P;
        if (n3 != null) {
            n3.b();
        }
        Q0.C0765b0 c0765b0 = this.f8232N;
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = c0765b0.f8388c.f15862w;
        for (androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = c0765b0.f8389d; !kotlin.jvm.internal.m.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f15862w) {
            nodeCoordinator2.g1();
        }
    }

    public final void c(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        Q0.F f9;
        p145r0.c cVar;
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfigurationZ;
        if (!(this.f8254v == null)) {
            N0.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        Q0.F f10 = this.f8253u;
        if (f10 != null && !kotlin.jvm.internal.m.a(f10.f8254v, androidComposeView)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Attaching to a different owner(");
            sb.append(androidComposeView);
            sb.append(") than the parent's owner(");
            Q0.F fX = x();
            sb.append(fX != null ? fX.f8254v : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            Q0.F f11 = this.f8253u;
            sb.append(f11 != null ? f11.g(0) : null);
            N0.a.b(sb.toString());
        }
        Q0.F fX2 = x();
        Q0.J j = this.f8233O;
        if (fX2 == null) {
            j.f8282p.f8378z = true;
            androidComposeView.getRectManager().e(this, false);
            Q0.S s9 = j.f8283q;
            if (s9 != null) {
                s9.f8334x = Q0.P.f8310h;
            }
        }
        Q0.C0765b0 c0765b0 = this.f8232N;
        c0765b0.f8389d.f15863x = fX2 != null ? fX2.f8232N.f8388c : null;
        this.f8254v = androidComposeView;
        this.f8256x = (fX2 != null ? fX2.f8256x : -1) + 1;
        p137q0.p pVar = this.f8238T;
        if (pVar != null) {
            a(pVar);
        }
        this.f8238T = null;
        androidComposeView.getLayoutNodes().h(this.f8242i, this);
        Q0.F f12 = this.f8253u;
        if (f12 == null || (f9 = f12.f8248p) == null) {
            f9 = this.f8248p;
        }
        g0(f9);
        if (this.f8248p == null && c0765b0.d(512)) {
            g0(this);
        }
        if (!this.f8240Y) {
            for (p137q0.o oVar = c0765b0.f8391f; oVar != null; oVar = oVar.f26479m) {
                oVar.D0();
            }
        }
        p038e0.e eVar = (p038e0.e) this.f8250r.f9153i;
        java.lang.Object[] objArr = eVar.f21324h;
        int i3 = eVar.j;
        for (int i9 = 0; i9 < i3; i9++) {
            ((Q0.F) objArr[i9]).c(androidComposeView);
        }
        if (!this.f8240Y) {
            c0765b0.e();
        }
        H();
        if (fX2 != null) {
            fX2.H();
        }
        p138q1.d dVar = this.f8239U;
        if (dVar != null) {
            dVar.invoke(androidComposeView);
        }
        j.j();
        if (!this.f8240Y && c0765b0.d(8)) {
            I();
        }
        androidComposeView.getClass();
        if (!androidx.compose.ui.platform.AndroidComposeView.g() || (cVar = androidComposeView._autofillManager) == null || (semanticsConfigurationZ = z()) == null) {
            return;
        }
        if (semanticsConfigurationZ.f15960h.b(Y0.t.f11133q)) {
            cVar.f26682o.a(this.f8242i);
            cVar.f26676h.x(cVar.j, this.f8242i, true);
        }
    }

    public final void c0() {
        p038e0.e eVarC = C();
        java.lang.Object[] objArr = eVarC.f21324h;
        int i3 = eVarC.j;
        for (int i9 = 0; i9 < i3; i9++) {
            Q0.F f9 = (Q0.F) objArr[i9];
            Q0.D d4 = f9.f8230L;
            f9.f8229K = d4;
            if (d4 != Q0.D.j) {
                f9.c0();
            }
        }
    }

    @Override // p020c0.InterfaceC1682h
    public final void d() {
        p145r0.c cVar;
        p138q1.y yVar = this.f8255w;
        if (yVar != null) {
            yVar.d();
        }
        O0.N n3 = this.f8234P;
        if (n3 != null) {
            n3.i(true);
        }
        this.f8240Y = true;
        Q0.C0765b0 c0765b0 = this.f8232N;
        for (p137q0.o oVar = c0765b0.f8390e; oVar != null; oVar = oVar.f26478l) {
            if (oVar.f26487u) {
                oVar.I0();
            }
        }
        p137q0.o oVar2 = c0765b0.f8390e;
        for (p137q0.o oVar3 = oVar2; oVar3 != null; oVar3 = oVar3.f26478l) {
            if (oVar3.f26487u) {
                oVar3.K0();
            }
        }
        while (oVar2 != null) {
            if (oVar2.f26487u) {
                oVar2.E0();
            }
            oVar2 = oVar2.f26478l;
        }
        if (K()) {
            this.f8220A = null;
            this.f8257z = false;
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f8254v;
        if (androidComposeView == null || !androidx.compose.ui.platform.AndroidComposeView.g() || (cVar = androidComposeView._autofillManager) == null) {
            return;
        }
        if (cVar.f26682o.e(this.f8242i)) {
            cVar.f26676h.x(cVar.j, this.f8242i, false);
        }
    }

    public final void d0(java.lang.Throwable th) {
        p020c0.A a2 = this.f8228J;
        p020c0.f1 f1Var = p129p0.e.f26175a;
        p089k0.j jVar = (p089k0.j) a2;
        jVar.getClass();
        p129p0.d dVar = (p129p0.d) p020c0.AbstractC1703s.C(jVar, f1Var);
        if (dVar == null) {
            throw th;
        }
        com.google.common.util.concurrent.AbstractC1903s.M(th, new io.ktor.http.d(dVar, this, 6));
        throw th;
    }

    public final void e() {
        this.f8230L = this.f8229K;
        this.f8229K = Q0.D.j;
        p038e0.e eVarC = C();
        java.lang.Object[] objArr = eVarC.f21324h;
        int i3 = eVarC.j;
        for (int i9 = 0; i9 < i3; i9++) {
            Q0.F f9 = (Q0.F) objArr[i9];
            if (f9.f8229K != Q0.D.j) {
                f9.e();
            }
        }
    }

    public final void e0(p113n1.c cVar) {
        if (kotlin.jvm.internal.m.a(this.f8226G, cVar)) {
            return;
        }
        this.f8226G = cVar;
        H();
        Q0.F fX = x();
        if (fX != null) {
            fX.F();
        }
        G();
        for (p137q0.o oVar = this.f8232N.f8391f; oVar != null; oVar = oVar.f26479m) {
            oVar.a();
        }
    }

    public final void f() {
        this.f8230L = this.f8229K;
        this.f8229K = Q0.D.j;
        p038e0.e eVarC = C();
        java.lang.Object[] objArr = eVarC.f21324h;
        int i3 = eVarC.j;
        for (int i9 = 0; i9 < i3; i9++) {
            Q0.F f9 = (Q0.F) objArr[i9];
            if (f9.f8229K == Q0.D.f8212i) {
                f9.f();
            }
        }
    }

    public final void f0(int i3) {
        Q0.F fX;
        Q0.F fX2;
        int i9 = this.X;
        if (i9 != i3) {
            if (i3 > 0 && i9 == 0 && (fX2 = x()) != null) {
                fX2.f0(fX2.X + 1);
            }
            if (i3 == 0 && this.X > 0 && (fX = x()) != null) {
                fX.f0(fX.X - 1);
            }
            this.X = i3;
        }
    }

    public final java.lang.String g(int i3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i9 = 0; i9 < i3; i9++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        p038e0.e eVarC = C();
        java.lang.Object[] objArr = eVarC.f21324h;
        int i10 = eVarC.j;
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append(((Q0.F) objArr[i11]).g(i3 + 1));
        }
        java.lang.String string = sb.toString();
        if (i3 != 0) {
            return string;
        }
        java.lang.String strSubstring = string.substring(0, string.length() - 1);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void g0(Q0.F f9) {
        if (kotlin.jvm.internal.m.a(f9, this.f8248p)) {
            return;
        }
        this.f8248p = f9;
        Q0.J j = this.f8233O;
        if (f9 != null) {
            if (j.f8283q == null) {
                j.f8283q = new Q0.S(j);
            }
            Q0.C0765b0 c0765b0 = this.f8232N;
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = c0765b0.f8388c.f15862w;
            for (androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = c0765b0.f8389d; !kotlin.jvm.internal.m.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f15862w) {
                nodeCoordinator2.P0();
            }
        } else {
            j.f8283q = null;
            j.f8274f = false;
            j.f8273e = false;
        }
        H();
    }

    public final void h() {
        p145r0.c cVar;
        Q0.G g;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f8254v;
        if (androidComposeView == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot detach node that is already detached!  Tree: ");
            Q0.F fX = x();
            sb.append(fX != null ? fX.g(0) : null);
            N0.a.c(sb.toString());
            throw new I3.b();
        }
        Q0.F fX2 = x();
        Q0.J j = this.f8233O;
        if (fX2 != null) {
            fX2.F();
            fX2.H();
            Q0.W w6 = j.f8282p;
            Q0.D d4 = Q0.D.j;
            w6.f8372s = d4;
            Q0.S s9 = j.f8283q;
            if (s9 != null) {
                s9.f8327q = d4;
            }
        }
        Q0.G g9 = j.f8282p.f8353E;
        g9.f8259b = true;
        g9.f8260c = false;
        g9.f8262e = false;
        g9.f8261d = false;
        g9.f8263f = false;
        g9.g = false;
        g9.f8264h = null;
        Q0.S s10 = j.f8283q;
        if (s10 != null && (g = s10.y) != null) {
            g.f8259b = true;
            g.f8260c = false;
            g.f8262e = false;
            g.f8261d = false;
            g.f8263f = false;
            g.g = false;
            g.f8264h = null;
        }
        Q0.C0765b0 c0765b0 = this.f8232N;
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = c0765b0.f8388c.f15862w;
        for (androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = c0765b0.f8389d; !kotlin.jvm.internal.m.a(nodeCoordinator2, nodeCoordinator) && nodeCoordinator2 != null; nodeCoordinator2 = nodeCoordinator2.f15862w) {
            nodeCoordinator2.m1();
            if (nodeCoordinator2.f15861v.L()) {
                nodeCoordinator2.h1();
            }
        }
        K0.G g10 = this.V;
        if (g10 != null) {
            g10.invoke(androidComposeView);
        }
        p137q0.o oVar = c0765b0.f8390e;
        for (p137q0.o oVar2 = oVar; oVar2 != null; oVar2 = oVar2.f26478l) {
            if (oVar2.f26487u) {
                oVar2.K0();
            }
        }
        this.y = true;
        p038e0.e eVar = (p038e0.e) this.f8250r.f9153i;
        java.lang.Object[] objArr = eVar.f21324h;
        int i3 = eVar.j;
        for (int i9 = 0; i9 < i3; i9++) {
            ((Q0.F) objArr[i9]).h();
        }
        this.y = false;
        while (oVar != null) {
            if (oVar.f26487u) {
                oVar.E0();
            }
            oVar = oVar.f26478l;
        }
        androidComposeView.getLayoutNodes().g(this.f8242i);
        Q0.U u6 = androidComposeView.f15915e0;
        android.support.v4.media.session.q qVar = u6.f8340b;
        ((p166t3.i) qVar.f15617i).A(this);
        ((p166t3.i) qVar.j).A(this);
        ((p166t3.i) qVar.f15618k).A(this);
        ((p038e0.e) u6.f8343e.f9153i).l(this);
        androidComposeView.f15909T = true;
        if (androidx.compose.ui.platform.AndroidComposeView.g() && (cVar = androidComposeView._autofillManager) != null) {
            if (cVar.f26682o.e(this.f8242i)) {
                cVar.f26676h.x(cVar.j, this.f8242i, false);
            }
        }
        androidComposeView.getRectManager().g(this);
        this.f8254v = null;
        g0(null);
        this.f8256x = 0;
        Q0.W w9 = j.f8282p;
        w9.f8369p = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        w9.f8368o = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        w9.f8378z = false;
        Q0.S s11 = j.f8283q;
        if (s11 != null) {
            s11.f8326p = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            s11.f8325o = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            s11.f8334x = Q0.P.j;
        }
        if (c0765b0.d(8)) {
            androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = this.f8220A;
            this.f8220A = null;
            this.f8257z = false;
            androidComposeView.getSemanticsOwner().b(this, semanticsConfiguration);
            androidComposeView.B();
        }
    }

    public final void h0(O0.S s9) {
        if (kotlin.jvm.internal.m.a(this.f8224E, s9)) {
            return;
        }
        this.f8224E = s9;
        S.p pVar = this.f8225F;
        if (pVar != null) {
            ((p020c0.C1681g0) pVar.j).setValue(s9);
        }
        H();
    }

    public final void i(p188x0.InterfaceC3097q interfaceC3097q, A0.d dVar) {
        try {
            this.f8232N.f8389d.N0(interfaceC3097q, dVar);
        } catch (java.lang.Throwable th) {
            d0(th);
            throw null;
        }
    }

    public final void i0(p137q0.p pVar) {
        if (this.f8241h && this.f8237S != p137q0.m.f26474b) {
            N0.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f8240Y) {
            N0.a.a("modifier is updated when deactivated");
        }
        if (!K()) {
            this.f8238T = pVar;
            return;
        }
        a(pVar);
        if (this.f8257z) {
            I();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void j0(R0.V0 v6) {
        if (kotlin.jvm.internal.m.a(this.f8227I, v6)) {
            return;
        }
        this.f8227I = v6;
        p137q0.o oVar = this.f8232N.f8391f;
        if ((oVar.f26477k & 16) != 0) {
            while (oVar != null) {
                if ((oVar.j & 16) != 0) {
                    ?? E9 = oVar;
                    ?? eVar = 0;
                    while (E9 != 0) {
                        if (E9 instanceof Q0.t0) {
                            ((Q0.t0) E9).r0();
                        } else if ((E9.j & 16) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                            p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                            int i3 = 0;
                            E9 = E9;
                            eVar = eVar;
                            while (oVar2 != null) {
                                if ((oVar2.j & 16) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        eVar = eVar;
                                        E9 = oVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new p038e0.e(new p137q0.o[16]);
                                        }
                                        if (E9 != 0) {
                                            eVar.c(E9);
                                            E9 = 0;
                                        }
                                        eVar.c(oVar2);
                                    }
                                }
                                oVar2 = oVar2.f26479m;
                                E9 = E9;
                                eVar = eVar;
                            }
                            if (i3 == 1) {
                            }
                        }
                        E9 = Q0.AbstractC0777k.e(eVar);
                    }
                }
                if ((oVar.f26477k & 16) == 0) {
                    return;
                } else {
                    oVar = oVar.f26479m;
                }
            }
        }
    }

    public final void k() {
        if (this.f8248p != null) {
            Y(this, false, 5);
        } else {
            a0(this, false, 5);
        }
        Q0.W w6 = this.f8233O.f8282p;
        p113n1.a aVar = w6.f8370q ? new p113n1.a(w6.f7641k) : null;
        if (aVar != null) {
            androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f8254v;
            if (androidComposeView != null) {
                androidComposeView.u(this, aVar.f25547a);
                return;
            }
            return;
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView2 = this.f8254v;
        if (androidComposeView2 != null) {
            androidComposeView2.t(true);
        }
    }

    public final void k0() {
        if (this.f8249q <= 0 || !this.f8252t) {
            return;
        }
        this.f8252t = false;
        p038e0.e eVar = this.f8251s;
        if (eVar == null) {
            eVar = new p038e0.e(new Q0.F[16]);
            this.f8251s = eVar;
        }
        eVar.i();
        p038e0.e eVar2 = (p038e0.e) this.f8250r.f9153i;
        java.lang.Object[] objArr = eVar2.f21324h;
        int i3 = eVar2.j;
        for (int i9 = 0; i9 < i3; i9++) {
            Q0.F f9 = (Q0.F) objArr[i9];
            if (f9.f8241h) {
                eVar.d(eVar.j, f9.C());
            } else {
                eVar.c(f9);
            }
        }
        Q0.J j = this.f8233O;
        j.f8282p.f8355G = true;
        Q0.S s9 = j.f8283q;
        if (s9 != null) {
            s9.f8315A = true;
        }
    }

    public final java.util.List l() {
        Q0.S s9 = this.f8233O.f8283q;
        kotlin.jvm.internal.m.b(s9);
        Q0.J j = s9.f8323m;
        j.f8269a.n();
        boolean z6 = s9.f8315A;
        p038e0.e eVar = s9.f8335z;
        if (!z6) {
            return eVar.h();
        }
        Q0.F f9 = j.f8269a;
        p038e0.e eVarC = f9.C();
        java.lang.Object[] objArr = eVarC.f21324h;
        int i3 = eVarC.j;
        for (int i9 = 0; i9 < i3; i9++) {
            Q0.F f10 = (Q0.F) objArr[i9];
            if (eVar.j <= i9) {
                Q0.S s10 = f10.f8233O.f8283q;
                kotlin.jvm.internal.m.b(s10);
                eVar.c(s10);
            } else {
                Q0.S s11 = f10.f8233O.f8283q;
                kotlin.jvm.internal.m.b(s11);
                java.lang.Object[] objArr2 = eVar.f21324h;
                java.lang.Object obj = objArr2[i9];
                objArr2[i9] = s11;
            }
        }
        eVar.n(((p038e0.e) ((p038e0.b) f9.n()).f21318i).j, eVar.j);
        s9.f8315A = false;
        return eVar.h();
    }

    public final java.util.List m() {
        return this.f8233O.f8282p.n0();
    }

    public final java.util.List n() {
        return C().h();
    }

    @Override // Q0.p0
    public final boolean o() {
        return K();
    }

    public final java.util.List p() {
        return ((p038e0.e) this.f8250r.f9153i).h();
    }

    public final int q() {
        return this.f8233O.f8282p.f7640i;
    }

    public final boolean r() {
        return this.f8233O.f8282p.f8351C;
    }

    public final boolean s() {
        return this.f8233O.f8282p.f8350B;
    }

    public final Q0.D t() {
        return this.f8233O.f8282p.f8372s;
    }

    public final java.lang.String toString() {
        return R0.L.r(this) + " children: " + ((p038e0.e) ((p038e0.b) n()).f21318i).j + " measurePolicy: " + this.f8224E + " deactivated: " + this.f8240Y;
    }

    public final Q0.D u() {
        Q0.D d4;
        Q0.S s9 = this.f8233O.f8283q;
        return (s9 == null || (d4 = s9.f8327q) == null) ? Q0.D.j : d4;
    }

    public final java.util.List v() {
        Q0.C0765b0 c0765b0 = this.f8232N;
        p038e0.e eVar = c0765b0.g;
        if (eVar == null) {
            return p078i6.w.f23205h;
        }
        p038e0.e eVar2 = new p038e0.e(new O0.X[eVar.j]);
        p137q0.o oVar = c0765b0.f8391f;
        int i3 = 0;
        while (oVar != null) {
            Q0.z0 z0Var = c0765b0.f8390e;
            if (oVar == z0Var) {
                break;
            }
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = oVar.f26481o;
            if (nodeCoordinator == null) {
                throw new java.lang.IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            Q0.n0 n0Var = nodeCoordinator.f15860S;
            Q0.n0 n0Var2 = c0765b0.f8388c.f15860S;
            p137q0.o oVar2 = oVar.f26479m;
            if (oVar2 != z0Var || nodeCoordinator == oVar2.f26481o) {
                n0Var2 = null;
            }
            if (n0Var == null) {
                n0Var = n0Var2;
            }
            eVar2.c(new O0.X((p137q0.p) eVar.f21324h[i3], nodeCoordinator, n0Var));
            oVar = oVar.f26479m;
            i3++;
        }
        return eVar2.h();
    }

    public final S.p w() {
        S.p pVar = this.f8225F;
        if (pVar != null) {
            return pVar;
        }
        S.p pVar2 = new S.p(this, this.f8224E);
        this.f8225F = pVar2;
        return pVar2;
    }

    public final Q0.F x() {
        Q0.F f9 = this.f8253u;
        while (f9 != null && f9.f8241h) {
            f9 = f9.f8253u;
        }
        return f9;
    }

    public final int y() {
        return this.f8233O.f8282p.f8369p;
    }

    public final androidx.compose.ui.semantics.SemanticsConfiguration z() {
        if (K() && !this.f8240Y && this.f8232N.d(8)) {
            return this.f8220A;
        }
        return null;
    }

    public F(boolean z6, int i3) {
        this.f8241h = z6;
        this.f8242i = i3;
        this.f8243k = 9223372034707292159L;
        this.f8244l = 0L;
        this.f8245m = 9223372034707292159L;
        this.f8246n = true;
        this.f8250r = new S.p(new p038e0.e(new Q0.F[16]), new A8.m(6, this), 27);
        this.f8222C = new p038e0.e(new Q0.F[16]);
        this.f8223D = true;
        this.f8224E = f8217Z;
        this.f8226G = Q0.I.f8268a;
        this.H = p113n1.n.f25566h;
        this.f8227I = f8218a0;
        p020c0.A.g.getClass();
        this.f8228J = p020c0.C1717z.f18426b;
        Q0.D d4 = Q0.D.j;
        this.f8229K = d4;
        this.f8230L = d4;
        this.f8232N = new Q0.C0765b0(this);
        this.f8233O = new Q0.J(this);
        this.f8236R = true;
        this.f8237S = p137q0.m.f26474b;
    }
}
