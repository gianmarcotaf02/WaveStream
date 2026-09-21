package androidx.compose.ui.node;

/* JADX INFO: loaded from: classes.dex */
public abstract class NodeCoordinator extends Q0.N implements O0.Q, O0.InterfaceC0732v, Q0.p0 {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final p188x0.L f15841T = new p188x0.L();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final Q0.C0786u f15842U = new Q0.C0786u();
    public static final float[] V = p188x0.E.a();
    public static final Q0.C0767c0 W = new Q0.C0767c0(0);
    public static final Q0.C0767c0 X = new Q0.C0767c0(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p194x6.j f15843A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p113n1.c f15844B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p113n1.n f15845C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public O0.T f15847E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p136q.C f15848F;
    public float H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Z2.C1209t f15850I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Q0.C0786u f15851J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f15853L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f15854M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public A0.d f15855N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public p188x0.InterfaceC3097q f15856O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public O0.M f15857P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f15859R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Q0.n0 f15860S;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Q0.F f15861v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.compose.ui.node.NodeCoordinator f15862w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.compose.ui.node.NodeCoordinator f15863x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f15864z;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f15846D = 0.8f;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f15849G = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public p188x0.O f15852K = p188x0.z.f31141b;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Q0.C0769d0 f15858Q = new Q0.C0769d0(this, 1);

    public NodeCoordinator(Q0.F f9) {
        this.f15861v = f9;
        this.f15844B = f9.f8226G;
        this.f15845C = f9.H;
    }

    public static androidx.compose.ui.node.NodeCoordinator o1(O0.InterfaceC0732v interfaceC0732v) {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator;
        O0.P p2 = interfaceC0732v instanceof O0.P ? (O0.P) interfaceC0732v : null;
        if (p2 != null && (nodeCoordinator = p2.f7611h.f8306v) != null) {
            return nodeCoordinator;
        }
        kotlin.jvm.internal.m.c(interfaceC0732v, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (androidx.compose.ui.node.NodeCoordinator) interfaceC0732v;
    }

    @Override // O0.InterfaceC0732v
    public final long A(long j) {
        if (!U0().f26487u) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((androidx.compose.ui.platform.AndroidComposeView) Q0.I.a(this.f15861v)).s(R(j));
    }

    @Override // Q0.N
    public final Q0.F B0() {
        return this.f15861v;
    }

    @Override // Q0.N
    public final O0.T C0() {
        O0.T t9 = this.f15847E;
        if (t9 != null) {
            return t9;
        }
        throw new java.lang.IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // O0.InterfaceC0732v
    public final long D(long j) {
        if (!U0().f26487u) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        O0.InterfaceC0732v interfaceC0732vH = O0.AbstractC0735y.h(this);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) Q0.I.a(this.f15861v);
        androidComposeView.C();
        return H(interfaceC0732vH, p181w0.a.f(p188x0.E.b(j, androidComposeView.f15922j0), interfaceC0732vH.R(0L)));
    }

    @Override // Q0.N
    public final Q0.N D0() {
        return this.f15863x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // O0.g0, O0.Q
    public final java.lang.Object E() {
        Q0.F f9 = this.f15861v;
        if (!f9.f8232N.d(64)) {
            return null;
        }
        U0();
        java.lang.Object objZ0 = null;
        for (p137q0.o oVar = f9.f8232N.f8390e; oVar != null; oVar = oVar.f26478l) {
            if ((oVar.j & 64) != 0) {
                ?? E9 = oVar;
                ?? eVar = 0;
                while (E9 != 0) {
                    if (E9 instanceof Q0.r0) {
                        objZ0 = ((Q0.r0) E9).z0(objZ0);
                    } else if ((E9.j & 64) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                        p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                        int i3 = 0;
                        E9 = E9;
                        eVar = eVar;
                        while (oVar2 != null) {
                            if ((oVar2.j & 64) != 0) {
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
        }
        return objZ0;
    }

    @Override // Q0.N
    public final long E0() {
        return this.f15849G;
    }

    @Override // O0.InterfaceC0732v
    public final O0.InterfaceC0732v F() {
        boolean z6 = U0().f26487u;
        Q0.F f9 = this.f15861v;
        if (!z6) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (Q0.F fX = f9; fX != null; fX = fX.x()) {
                sb.append("\n|");
                sb.append(fX);
                sb.append(" isAttached=");
                sb.append(fX.K());
                sb.append(" modifier=");
                sb.append(fX.f8237S);
                sb.append(" tail=");
                sb.append(U0());
            }
            N0.a.b(sb.toString());
        }
        d1();
        return f9.f8232N.f8389d.f15863x;
    }

    @Override // O0.InterfaceC0732v
    public final long H(O0.InterfaceC0732v interfaceC0732v, long j) {
        if (interfaceC0732v instanceof O0.P) {
            O0.P p2 = (O0.P) interfaceC0732v;
            p2.f7611h.f8306v.d1();
            return p2.H(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorO1 = o1(interfaceC0732v);
        nodeCoordinatorO1.d1();
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorQ0 = Q0(nodeCoordinatorO1);
        while (nodeCoordinatorO1 != nodeCoordinatorQ0) {
            Q0.n0 n0Var = nodeCoordinatorO1.f15860S;
            if (n0Var != null) {
                j = ((R0.C0857x0) n0Var).c(j, false);
            }
            j = com.google.android.gms.internal.play_billing.V0.z(j, nodeCoordinatorO1.f15849G);
            nodeCoordinatorO1 = nodeCoordinatorO1.f15863x;
            kotlin.jvm.internal.m.b(nodeCoordinatorO1);
        }
        return K0(nodeCoordinatorQ0, j);
    }

    @Override // Q0.N
    public final void I0() {
        h0(this.f15849G, this.H, this.f15843A);
    }

    @Override // O0.InterfaceC0732v
    public final p181w0.b J(O0.InterfaceC0732v interfaceC0732v, boolean z6) {
        if (!U0().f26487u) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC0732v.i()) {
            N0.a.b("LayoutCoordinates " + interfaceC0732v + " is not attached!");
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorO1 = o1(interfaceC0732v);
        nodeCoordinatorO1.d1();
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorQ0 = Q0(nodeCoordinatorO1);
        Z2.C1209t c1209t = this.f15850I;
        if (c1209t == null) {
            c1209t = new Z2.C1209t();
            this.f15850I = c1209t;
        }
        c1209t.f12941b = 0.0f;
        c1209t.f12942c = 0.0f;
        c1209t.f12943d = (int) (interfaceC0732v.k() >> 32);
        c1209t.f12944e = (int) (interfaceC0732v.k() & 4294967295L);
        while (nodeCoordinatorO1 != nodeCoordinatorQ0) {
            nodeCoordinatorO1.l1(c1209t, z6, false);
            if (c1209t.b()) {
                return p181w0.b.f29745e;
            }
            nodeCoordinatorO1 = nodeCoordinatorO1.f15863x;
            kotlin.jvm.internal.m.b(nodeCoordinatorO1);
        }
        J0(nodeCoordinatorQ0, c1209t, z6);
        return new p181w0.b(c1209t.f12941b, c1209t.f12942c, c1209t.f12943d, c1209t.f12944e);
    }

    public final void J0(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, Z2.C1209t c1209t, boolean z6) {
        if (nodeCoordinator == this) {
            return;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = this.f15863x;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.J0(nodeCoordinator, c1209t, z6);
        }
        long j = this.f15849G;
        float f9 = (int) (j >> 32);
        c1209t.f12941b -= f9;
        c1209t.f12943d -= f9;
        float f10 = (int) (j & 4294967295L);
        c1209t.f12942c -= f10;
        c1209t.f12944e -= f10;
        Q0.n0 n0Var = this.f15860S;
        if (n0Var != null) {
            R0.C0857x0 c0857x0 = (R0.C0857x0) n0Var;
            float[] fArrA = c0857x0.a();
            if (!c0857x0.f9026z) {
                if (fArrA == null) {
                    c1209t.f12941b = 0.0f;
                    c1209t.f12942c = 0.0f;
                    c1209t.f12943d = 0.0f;
                    c1209t.f12944e = 0.0f;
                } else {
                    p188x0.E.c(fArrA, c1209t);
                }
            }
            if (this.f15864z && z6) {
                long j9 = this.j;
                c1209t.a(0.0f, 0.0f, (int) (j9 >> 32), (int) (j9 & 4294967295L));
            }
        }
    }

    public final long K0(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, long j) {
        if (nodeCoordinator == this) {
            return j;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = this.f15863x;
        return (nodeCoordinator2 == null || kotlin.jvm.internal.m.a(nodeCoordinator, nodeCoordinator2)) ? R0(j) : R0(nodeCoordinator2.K0(nodeCoordinator, j));
    }

    public final long L0(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - f0();
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - e0();
        float fMax = java.lang.Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // O0.InterfaceC0732v
    public final long M(long j) {
        if (!U0().f26487u) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return H(O0.AbstractC0735y.h(this), ((androidx.compose.ui.platform.AndroidComposeView) Q0.I.a(this.f15861v)).G(j));
    }

    public final float M0(long j, long j9) {
        if (f0() >= java.lang.Float.intBitsToFloat((int) (j9 >> 32)) && e0() >= java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jL0 = L0(j9);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jL0 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jL0 & 4294967295L));
        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fMax = java.lang.Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - f0());
        float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - e0()))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i3 = (int) (jFloatToRawIntBits >> 32);
            if (java.lang.Float.intBitsToFloat(i3) <= fIntBitsToFloat) {
                int i9 = (int) (jFloatToRawIntBits & 4294967295L);
                if (java.lang.Float.intBitsToFloat(i9) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat(i3);
                    float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat(i9);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void N0(p188x0.InterfaceC3097q interfaceC3097q, A0.d dVar) {
        boolean z6;
        float f9;
        Q0.n0 n0Var = this.f15860S;
        if (n0Var == null) {
            long j = this.f15849G;
            float f10 = (int) (j >> 32);
            float f11 = (int) (j & 4294967295L);
            interfaceC3097q.l(f10, f11);
            O0(interfaceC3097q, dVar);
            interfaceC3097q.l(-f10, -f11);
            return;
        }
        R0.C0857x0 c0857x0 = (R0.C0857x0) n0Var;
        c0857x0.f();
        c0857x0.f9008A = c0857x0.f9010h.f21a.K() > 0.0f;
        p203z0.b bVar = c0857x0.f9021t;
        j1.l lVar = bVar.f32128i;
        lVar.w(interfaceC3097q);
        lVar.j = dVar;
        A0.d dVar2 = c0857x0.f9010h;
        p188x0.InterfaceC3097q interfaceC3097qJ = bVar.d0().j();
        A0.d dVar3 = (A0.d) bVar.d0().j;
        if (dVar2.f37s) {
            return;
        }
        dVar2.a();
        A0.f fVar = dVar2.f21a;
        if (!fVar.o()) {
            try {
                fVar.p(dVar2.f22b, dVar2.f23c, dVar2, dVar2.f25e);
            } catch (java.lang.Throwable unused) {
            }
        }
        boolean z9 = fVar.K() > 0.0f;
        if (z9) {
            interfaceC3097qJ.t();
        }
        android.graphics.Canvas canvasA = p188x0.AbstractC3083c.a(interfaceC3097qJ);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j9 = dVar2.f38t;
            float f12 = (int) (j9 >> 32);
            float f13 = (int) (j9 & 4294967295L);
            long j10 = dVar2.f39u;
            float f14 = ((int) (j10 >> 32)) + f12;
            float f15 = f13 + ((int) (j10 & 4294967295L));
            float fA = fVar.a();
            p188x0.C3092l c3092lK = fVar.k();
            int iM = fVar.M();
            if (fA < 1.0f || iM != 3 || c3092lK != null || fVar.j() == 1) {
                F3.C0371k c0371kG = dVar2.f34p;
                if (c0371kG == null) {
                    c0371kG = p188x0.z.g();
                    dVar2.f34p = c0371kG;
                }
                c0371kG.h(fA);
                c0371kG.i(iM);
                c0371kG.k(c3092lK);
                f9 = f12;
                canvasA.saveLayer(f9, f13, f14, f15, (android.graphics.Paint) c0371kG.f3601b);
            } else {
                canvasA.save();
                f9 = f12;
            }
            canvasA.translate(f9, f13);
            canvasA.concat(fVar.H());
        }
        boolean z10 = !zIsHardwareAccelerated && dVar2.f41w;
        if (z10) {
            interfaceC3097qJ.e();
            p188x0.z zVarD = dVar2.d();
            if (zVarD instanceof p188x0.G) {
                p188x0.InterfaceC3097q.a(interfaceC3097qJ, ((p188x0.G) zVarD).f31049f);
            } else if (zVarD instanceof p188x0.H) {
                p188x0.C3088h c3088hA = dVar2.f31m;
                if (c3088hA != null) {
                    c3088hA.f31111a.rewind();
                } else {
                    c3088hA = p188x0.AbstractC3091k.a();
                    dVar2.f31m = c3088hA;
                }
                p188x0.C3088h.b(c3088hA, ((p188x0.H) zVarD).f31050f);
                interfaceC3097qJ.r(c3088hA);
            } else {
                if (!(zVarD instanceof p188x0.F)) {
                    throw new I3.b();
                }
                interfaceC3097qJ.r(((p188x0.F) zVarD).f31048f);
            }
        }
        if (dVar3 != null) {
            A0.a aVar = dVar3.f36r;
            if (!aVar.f12a) {
                p188x0.C.a("Only add dependencies during a tracking");
            }
            p136q.I i3 = (p136q.I) aVar.f15d;
            if (i3 != null) {
                i3.a(dVar2);
            } else if (((A0.d) aVar.f13b) != null) {
                p136q.I i9 = p136q.Q.f26352a;
                p136q.I i10 = new p136q.I();
                A0.d dVar4 = (A0.d) aVar.f13b;
                kotlin.jvm.internal.m.b(dVar4);
                i10.a(dVar4);
                i10.a(dVar2);
                aVar.f15d = i10;
                aVar.f13b = null;
            } else {
                aVar.f13b = dVar2;
            }
            p136q.I i11 = (p136q.I) aVar.f16e;
            if (i11 != null) {
                z6 = !i11.l(dVar2);
            } else if (((A0.d) aVar.f14c) != dVar2) {
                z6 = true;
            } else {
                aVar.f14c = null;
                z6 = false;
            }
            if (z6) {
                dVar2.f35q++;
            }
        }
        if (p188x0.AbstractC3083c.a(interfaceC3097qJ).isHardwareAccelerated()) {
            fVar.I(interfaceC3097qJ);
        } else {
            p203z0.b bVar2 = dVar2.f33o;
            if (bVar2 == null) {
                bVar2 = new p203z0.b();
                dVar2.f33o = bVar2;
            }
            p113n1.c cVar = dVar2.f22b;
            p113n1.n nVar = dVar2.f23c;
            long jK = com.google.common.util.concurrent.AbstractC1903s.K(dVar2.f39u);
            j1.l lVar2 = bVar2.f32128i;
            p203z0.a aVar2 = ((p203z0.b) lVar2.f23900k).f32127h;
            p113n1.c cVar2 = aVar2.f32123a;
            p113n1.n nVar2 = aVar2.f32124b;
            p188x0.InterfaceC3097q interfaceC3097qJ2 = lVar2.j();
            long jQ = lVar2.q();
            A0.d dVar5 = (A0.d) lVar2.j;
            lVar2.x(cVar);
            lVar2.z(nVar);
            lVar2.w(interfaceC3097qJ);
            lVar2.A(jK);
            lVar2.j = dVar2;
            interfaceC3097qJ.e();
            try {
                dVar2.c(bVar2);
                interfaceC3097qJ.p();
                lVar2.x(cVar2);
                lVar2.z(nVar2);
                lVar2.w(interfaceC3097qJ2);
                lVar2.A(jQ);
                lVar2.j = dVar5;
            } catch (java.lang.Throwable th) {
                interfaceC3097qJ.p();
                lVar2.x(cVar2);
                lVar2.z(nVar2);
                lVar2.w(interfaceC3097qJ2);
                lVar2.A(jQ);
                lVar2.j = dVar5;
                throw th;
            }
        }
        if (z10) {
            interfaceC3097qJ.p();
        }
        if (z9) {
            interfaceC3097qJ.f();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }

    public final void O0(p188x0.InterfaceC3097q interfaceC3097q, A0.d dVar) {
        p188x0.InterfaceC3097q interfaceC3097q2;
        A0.d dVar2;
        p137q0.o oVarV0 = V0(4);
        if (oVarV0 == null) {
            j1(interfaceC3097q, dVar);
            return;
        }
        Q0.F f9 = this.f15861v;
        f9.getClass();
        Q0.H sharedDrawScope = Q0.I.a(f9).getSharedDrawScope();
        long jK = com.google.common.util.concurrent.AbstractC1903s.K(this.j);
        sharedDrawScope.getClass();
        p038e0.e eVar = null;
        while (oVarV0 != null) {
            if (oVarV0 instanceof Q0.InterfaceC0779m) {
                interfaceC3097q2 = interfaceC3097q;
                dVar2 = dVar;
                sharedDrawScope.b(interfaceC3097q2, jK, this, (Q0.InterfaceC0779m) oVarV0, dVar2);
            } else {
                interfaceC3097q2 = interfaceC3097q;
                dVar2 = dVar;
                if ((oVarV0.j & 4) != 0 && (oVarV0 instanceof Q0.AbstractC0776j)) {
                    int i3 = 0;
                    for (p137q0.o oVar = ((Q0.AbstractC0776j) oVarV0).f8443w; oVar != null; oVar = oVar.f26479m) {
                        if ((oVar.j & 4) != 0) {
                            i3++;
                            if (i3 == 1) {
                                oVarV0 = oVar;
                            } else {
                                if (eVar == null) {
                                    eVar = new p038e0.e(new p137q0.o[16]);
                                }
                                if (oVarV0 != null) {
                                    eVar.c(oVarV0);
                                    oVarV0 = null;
                                }
                                eVar.c(oVar);
                            }
                        }
                    }
                    if (i3 == 1) {
                    }
                }
                interfaceC3097q = interfaceC3097q2;
                dVar = dVar2;
            }
            oVarV0 = Q0.AbstractC0777k.e(eVar);
            interfaceC3097q = interfaceC3097q2;
            dVar = dVar2;
        }
    }

    public abstract void P0();

    @Override // O0.InterfaceC0732v
    public final void Q(O0.InterfaceC0732v interfaceC0732v, float[] fArr) {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorO1 = o1(interfaceC0732v);
        nodeCoordinatorO1.d1();
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorQ0 = Q0(nodeCoordinatorO1);
        p188x0.E.d(fArr);
        nodeCoordinatorO1.r1(nodeCoordinatorQ0, fArr);
        q1(nodeCoordinatorQ0, fArr);
    }

    public final androidx.compose.ui.node.NodeCoordinator Q0(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        Q0.F fX = nodeCoordinator.f15861v;
        Q0.F f9 = this.f15861v;
        if (fX == f9) {
            p137q0.o oVarU0 = nodeCoordinator.U0();
            p137q0.o oVarU1 = U0();
            if (!oVarU1.f26475h.f26487u) {
                N0.a.b("visitLocalAncestors called on an unattached node");
            }
            for (p137q0.o oVar = oVarU1.f26475h.f26478l; oVar != null; oVar = oVar.f26478l) {
                if ((oVar.j & 2) != 0 && oVar == oVarU0) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (fX.f8256x > f9.f8256x) {
            fX = fX.x();
            kotlin.jvm.internal.m.b(fX);
        }
        Q0.F fX2 = f9;
        while (fX2.f8256x > fX.f8256x) {
            fX2 = fX2.x();
            kotlin.jvm.internal.m.b(fX2);
        }
        while (fX != fX2) {
            fX = fX.x();
            fX2 = fX2.x();
            if (fX == null || fX2 == null) {
                throw new java.lang.IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (fX2 != f9) {
            if (fX != nodeCoordinator.f15861v) {
                return fX.f8232N.f8388c;
            }
            return nodeCoordinator;
        }
        return this;
    }

    @Override // O0.InterfaceC0732v
    public final long R(long j) {
        if (!U0().f26487u) {
            N0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d1();
        for (androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f15863x) {
            Q0.F f9 = nodeCoordinator.f15861v;
            if (nodeCoordinator == f9.f8232N.f8389d && !f9.j) {
                long jB = Q0.I.a(f9).getRectManager().b(f9);
                if (!p113n1.k.a(jB, 9223372034707292159L)) {
                    return com.google.android.gms.internal.play_billing.V0.z(j, jB);
                }
            }
            Q0.n0 n0Var = nodeCoordinator.f15860S;
            if (n0Var != null) {
                j = ((R0.C0857x0) n0Var).c(j, false);
            }
            j = com.google.android.gms.internal.play_billing.V0.z(j, nodeCoordinator.f15849G);
        }
        return j;
    }

    public final long R0(long j) {
        long j9 = this.f15849G;
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j9 & 4294967295L)))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32)) - ((int) (j9 >> 32)))) << 32);
        Q0.n0 n0Var = this.f15860S;
        return n0Var != null ? ((R0.C0857x0) n0Var).c(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    @Override // p113n1.c
    public final float S() {
        return this.f15861v.f8226G.S();
    }

    public abstract Q0.O S0();

    @Override // O0.InterfaceC0732v
    public final long T(O0.InterfaceC0732v interfaceC0732v, long j) {
        return H(interfaceC0732v, j);
    }

    public final long T0() {
        return this.f15844B.o0(this.f15861v.f8227I.d());
    }

    public abstract p137q0.o U0();

    public final p137q0.o V0(int i3) {
        boolean zG = Q0.g0.g(i3);
        p137q0.o oVarU0 = U0();
        if (!zG && (oVarU0 = oVarU0.f26478l) == null) {
            return null;
        }
        for (p137q0.o oVarW0 = W0(zG); oVarW0 != null && (oVarW0.f26477k & i3) != 0; oVarW0 = oVarW0.f26479m) {
            if ((oVarW0.j & i3) != 0) {
                return oVarW0;
            }
            if (oVarW0 == oVarU0) {
                return null;
            }
        }
        return null;
    }

    public final p137q0.o W0(boolean z6) {
        p137q0.o oVarU0;
        Q0.C0765b0 c0765b0 = this.f15861v.f8232N;
        if (c0765b0.f8389d == this) {
            return c0765b0.f8391f;
        }
        if (!z6) {
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.f15863x;
            if (nodeCoordinator != null) {
                return nodeCoordinator.U0();
            }
            return null;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = this.f15863x;
        if (nodeCoordinator2 == null || (oVarU0 = nodeCoordinator2.U0()) == null) {
            return null;
        }
        return oVarU0.f26479m;
    }

    public final void X0(p137q0.o oVar, Q0.C0767c0 c0767c0, long j, Q0.C0783q c0783q, int i3, boolean z6) {
        if (oVar == null) {
            a1(c0767c0, j, c0783q, i3, z6);
            return;
        }
        int i9 = c0783q.j;
        p136q.D d4 = c0783q.f8458h;
        c0783q.e(i9 + 1, d4.f26304b);
        c0783q.j++;
        d4.a(oVar);
        c0783q.f8459i.a(Q0.AbstractC0777k.a(-1.0f, z6, false));
        X0(Q0.AbstractC0777k.d(oVar, c0767c0.b()), c0767c0, j, c0783q, i3, z6);
        c0783q.j = i9;
    }

    public final void Y0(p137q0.o oVar, Q0.C0767c0 c0767c0, long j, Q0.C0783q c0783q, int i3, boolean z6, float f9) {
        if (oVar == null) {
            a1(c0767c0, j, c0783q, i3, z6);
            return;
        }
        int i9 = c0783q.j;
        p136q.D d4 = c0783q.f8458h;
        c0783q.e(i9 + 1, d4.f26304b);
        c0783q.j++;
        d4.a(oVar);
        c0783q.f8459i.a(Q0.AbstractC0777k.a(f9, z6, false));
        i1(Q0.AbstractC0777k.d(oVar, c0767c0.b()), c0767c0, j, c0783q, i3, z6, f9, true);
        c0783q.j = i9;
    }

    public final void Z0(Q0.C0767c0 c0767c0, long j, Q0.C0783q c0783q, int i3, boolean z6) {
        boolean z9;
        boolean z10;
        p137q0.o oVarV0 = V0(c0767c0.b());
        if (!u1(j)) {
            if (i3 == 1) {
                float fM0 = M0(j, T0());
                if ((java.lang.Float.floatToRawIntBits(fM0) & androidx.media3.common.util.Log.LOG_LEVEL_OFF) < 2139095040) {
                    if (c0783q.j != p078i6.p.A0(c0783q)) {
                        if (Q0.AbstractC0777k.g(c0783q.d(), Q0.AbstractC0777k.a(fM0, false, false)) <= 0) {
                            return;
                        }
                    }
                    Y0(oVarV0, c0767c0, j, c0783q, i3, false, fM0);
                    return;
                }
                return;
            }
            return;
        }
        if (oVarV0 == null) {
            a1(c0767c0, j, c0783q, i3, z6);
            return;
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < f0() && fIntBitsToFloat2 < e0()) {
            X0(oVarV0, c0767c0, j, c0783q, i3, z6);
            return;
        }
        float fM1 = i3 == 1 ? M0(j, T0()) : Float.POSITIVE_INFINITY;
        if ((java.lang.Float.floatToRawIntBits(fM1) & androidx.media3.common.util.Log.LOG_LEVEL_OFF) < 2139095040) {
            if (c0783q.j != p078i6.p.A0(c0783q)) {
                z9 = z6;
                if (Q0.AbstractC0777k.g(c0783q.d(), Q0.AbstractC0777k.a(fM1, z9, false)) > 0) {
                }
                i1(oVarV0, c0767c0, j, c0783q, i3, z9, fM1, z10);
            }
            z9 = z6;
            z10 = true;
            i1(oVarV0, c0767c0, j, c0783q, i3, z9, fM1, z10);
        }
        z9 = z6;
        z10 = false;
        i1(oVarV0, c0767c0, j, c0783q, i3, z9, fM1, z10);
    }

    public void a1(Q0.C0767c0 c0767c0, long j, Q0.C0783q c0783q, int i3, boolean z6) {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.f15862w;
        if (nodeCoordinator != null) {
            nodeCoordinator.Z0(c0767c0, nodeCoordinator.R0(j), c0783q, i3, z6);
        }
    }

    public final void b1() {
        Q0.n0 n0Var = this.f15860S;
        if (n0Var != null) {
            n0Var.invalidate();
            return;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.f15863x;
        if (nodeCoordinator != null) {
            nodeCoordinator.b1();
        }
    }

    public final boolean c1() {
        if (this.f15860S != null && this.f15846D <= 0.0f) {
            return true;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.f15863x;
        if (nodeCoordinator != null) {
            return nodeCoordinator.c1();
        }
        return false;
    }

    public final void d1() {
        this.f15861v.f8233O.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r7v7, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void e1() {
        p137q0.o oVarU0;
        p137q0.o oVarW0 = W0(Q0.g0.g(128));
        if (oVarW0 == null || (oVarW0.f26475h.f26477k & 128) == 0) {
            return;
        }
        p121o0.f fVarE = p121o0.o.e();
        p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
        p121o0.f fVarH = p121o0.o.h(fVarE);
        try {
            boolean zG = Q0.g0.g(128);
            if (!zG) {
                oVarU0 = U0().f26478l;
                if (oVarU0 == null) {
                }
            }
            oVarU0 = U0();
            for (p137q0.o oVarW1 = W0(zG); oVarW1 != null && (oVarW1.f26477k & 128) != 0; oVarW1 = oVarW1.f26479m) {
                if ((oVarW1.j & 128) != 0) {
                    ?? eVar = 0;
                    ?? E9 = oVarW1;
                    while (E9 != 0) {
                        if (E9 instanceof Q0.InterfaceC0787v) {
                            ((Q0.InterfaceC0787v) E9).k(this.j);
                        } else if ((E9.j & 128) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                            p137q0.o oVar = ((Q0.AbstractC0776j) E9).f8443w;
                            int i3 = 0;
                            E9 = E9;
                            eVar = eVar;
                            while (oVar != null) {
                                if ((oVar.j & 128) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        eVar = eVar;
                                        E9 = oVar;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new p038e0.e(new p137q0.o[16]);
                                        }
                                        if (E9 != 0) {
                                            eVar.c(E9);
                                            E9 = 0;
                                        }
                                        eVar.c(oVar);
                                    }
                                }
                                oVar = oVar.f26479m;
                                E9 = E9;
                                eVar = eVar;
                            }
                            if (i3 == 1) {
                            }
                        }
                        E9 = Q0.AbstractC0777k.e(eVar);
                    }
                }
                if (oVarW1 != oVarU0) {
                }
            }
        } finally {
            p121o0.o.k(fVarE, fVarH, jVarE);
        }
    }

    @Override // O0.InterfaceC0732v
    public final long f(long j) {
        long jR = R(j);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) Q0.I.a(this.f15861v);
        androidComposeView.C();
        return p188x0.E.b(jR, androidComposeView.f15921i0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void f1() {
        boolean zG = Q0.g0.g(4194304);
        p137q0.o oVarU0 = U0();
        if (!zG && (oVarU0 = oVarU0.f26478l) == null) {
            return;
        }
        for (p137q0.o oVarW0 = W0(zG); oVarW0 != null && (oVarW0.f26477k & 4194304) != 0; oVarW0 = oVarW0.f26479m) {
            if ((oVarW0.j & 4194304) != 0) {
                ?? E9 = oVarW0;
                ?? eVar = 0;
                while (E9 != 0) {
                    if (E9 instanceof Q0.InterfaceC0787v) {
                        ((Q0.InterfaceC0787v) E9).C(this);
                    } else if ((E9.j & 4194304) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                        p137q0.o oVar = ((Q0.AbstractC0776j) E9).f8443w;
                        int i3 = 0;
                        E9 = E9;
                        eVar = eVar;
                        while (oVar != null) {
                            if ((oVar.j & 4194304) != 0) {
                                i3++;
                                if (i3 == 1) {
                                    eVar = eVar;
                                    E9 = oVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new p038e0.e(new p137q0.o[16]);
                                    }
                                    if (E9 != 0) {
                                        eVar.c(E9);
                                        E9 = 0;
                                    }
                                    eVar.c(oVar);
                                }
                            }
                            oVar = oVar.f26479m;
                            E9 = E9;
                            eVar = eVar;
                        }
                        if (i3 == 1) {
                        }
                    }
                    E9 = Q0.AbstractC0777k.e(eVar);
                }
            }
            if (oVarW0 == oVarU0) {
                return;
            }
        }
    }

    public final void g1() {
        this.y = true;
        this.f15858Q.invoke();
        m1();
        if (p113n1.k.a(this.f15849G, 0L)) {
            return;
        }
        this.f15861v.Q();
    }

    @Override // p113n1.c
    public final float getDensity() {
        return this.f15861v.f8226G.getDensity();
    }

    @Override // O0.InterfaceC0728q
    public final p113n1.n getLayoutDirection() {
        return this.f15861v.H;
    }

    public final void h1() {
        p137q0.o oVarW0 = W0(Q0.g0.g(1048576));
        if (oVarW0 == null || (oVarW0.f26475h.f26477k & 1048576) == 0) {
            return;
        }
        boolean zG = Q0.g0.g(1048576);
        p137q0.o oVarU0 = U0();
        if (!zG && (oVarU0 = oVarU0.f26478l) == null) {
            return;
        }
        for (p137q0.o oVarW1 = W0(zG); oVarW1 != null && (oVarW1.f26477k & 1048576) != 0; oVarW1 = oVarW1.f26479m) {
            if ((oVarW1.j & 1048576) != 0) {
                p137q0.o oVarE = oVarW1;
                p038e0.e eVar = null;
                while (oVarE != null) {
                    if ((oVarE.j & 1048576) != 0 && (oVarE instanceof Q0.AbstractC0776j)) {
                        int i3 = 0;
                        for (p137q0.o oVar = ((Q0.AbstractC0776j) oVarE).f8443w; oVar != null; oVar = oVar.f26479m) {
                            if ((oVar.j & 1048576) != 0) {
                                i3++;
                                if (i3 == 1) {
                                    oVarE = oVar;
                                } else {
                                    if (eVar == null) {
                                        eVar = new p038e0.e(new p137q0.o[16]);
                                    }
                                    if (oVarE != null) {
                                        eVar.c(oVarE);
                                        oVarE = null;
                                    }
                                    eVar.c(oVar);
                                }
                            }
                        }
                        if (i3 == 1) {
                        }
                    }
                    oVarE = Q0.AbstractC0777k.e(eVar);
                }
            }
            if (oVarW1 == oVarU0) {
                return;
            }
        }
    }

    @Override // O0.InterfaceC0732v
    public final boolean i() {
        return U0().f26487u;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x018e A[PHI: r3
  0x018e: PHI (r3v4 ??) = (r3v1 ??), (r3v1 ??), (r3v6 ??) binds: [B:53:0x015b, B:55:0x015f, B:69:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r2v15, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v4, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [e0.e] */
    public final void i1(p137q0.o oVar, Q0.C0767c0 c0767c0, long j, Q0.C0783q c0783q, int i3, boolean z6, float f9, boolean z9) {
        ?? E9;
        if (oVar == null) {
            a1(c0767c0, j, c0783q, i3, z6);
            return;
        }
        int i9 = i3;
        if (i9 == 3 || i9 == 4) {
            ?? r9 = oVar;
            ?? eVar = 0;
            while (r9 != 0) {
                if (r9 instanceof Q0.t0) {
                    long jH = ((Q0.t0) r9).h();
                    int i10 = (int) (j >> 32);
                    float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i10);
                    Q0.F f10 = this.f15861v;
                    p113n1.n nVar = f10.H;
                    int i11 = Q0.A0.f8201b;
                    long j9 = Long.MIN_VALUE & jH;
                    if (fIntBitsToFloat < (-((j9 == 0 || nVar == p113n1.n.f25566h) ? Q0.C0767c0.a(0, jH) : Q0.C0767c0.a(2, jH)))) {
                        break;
                    }
                    if (java.lang.Float.intBitsToFloat(i10) >= f0() + ((j9 == 0 || f10.H == p113n1.n.f25566h) ? Q0.C0767c0.a(2, jH) : Q0.C0767c0.a(0, jH))) {
                        break;
                    }
                    int i12 = (int) (j & 4294967295L);
                    if (java.lang.Float.intBitsToFloat(i12) < (-Q0.C0767c0.a(1, jH))) {
                        break;
                    }
                    if (java.lang.Float.intBitsToFloat(i12) >= Q0.C0767c0.a(3, jH) + e0()) {
                        break;
                    }
                    Q0.C0771e0 c0771e0 = new Q0.C0771e0(this, oVar, c0767c0, j, c0783q, i9, z6, f9, z9);
                    int i13 = c0783q.j;
                    int iA0 = p078i6.p.A0(c0783q);
                    p136q.y yVar = c0783q.f8459i;
                    p136q.D d4 = c0783q.f8458h;
                    if (i13 == iA0) {
                        int i14 = c0783q.j;
                        c0783q.e(i14 + 1, d4.f26304b);
                        c0783q.j++;
                        d4.a(oVar);
                        yVar.a(Q0.AbstractC0777k.a(0.0f, z6, true));
                        c0771e0.invoke();
                        c0783q.j = i14;
                        return;
                    }
                    long jD = c0783q.d();
                    int i15 = c0783q.j;
                    if (!Q0.AbstractC0777k.m(jD)) {
                        if (Q0.AbstractC0777k.i(jD) > 0.0f) {
                            int i16 = c0783q.j;
                            c0783q.e(i16 + 1, d4.f26304b);
                            c0783q.j++;
                            d4.a(oVar);
                            yVar.a(Q0.AbstractC0777k.a(0.0f, z6, true));
                            c0771e0.invoke();
                            c0783q.j = i16;
                            return;
                        }
                        return;
                    }
                    int iA1 = p078i6.p.A0(c0783q);
                    c0783q.j = iA1;
                    c0783q.e(iA1 + 1, d4.f26304b);
                    c0783q.j++;
                    d4.a(oVar);
                    yVar.a(Q0.AbstractC0777k.a(0.0f, z6, true));
                    c0771e0.invoke();
                    c0783q.j = iA1;
                    if (Q0.AbstractC0777k.i(c0783q.d()) < 0.0f) {
                        c0783q.e(i15 + 1, c0783q.j + 1);
                    }
                    c0783q.j = i15;
                    return;
                }
                if ((r9.j & 16) == 0 || !(r9 instanceof Q0.AbstractC0776j)) {
                    E9 = r9;
                    eVar = eVar;
                    E9 = Q0.AbstractC0777k.e(eVar);
                } else {
                    p137q0.o oVar2 = ((Q0.AbstractC0776j) r9).f8443w;
                    int i17 = 0;
                    while (oVar2 != null) {
                        if ((oVar2.j & 16) != 0) {
                            i17++;
                            if (i17 == 1) {
                                E9 = r9;
                                eVar = eVar;
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
                        } else {
                            E9 = r9;
                            eVar = eVar;
                        }
                        oVar2 = oVar2.f26479m;
                        E9 = E9;
                        eVar = eVar;
                    }
                    if (i17 == 1) {
                        E9 = r9;
                        eVar = eVar;
                    } else {
                        E9 = r9;
                        eVar = eVar;
                        E9 = Q0.AbstractC0777k.e(eVar);
                    }
                }
                i9 = i3;
                r9 = E9;
                eVar = eVar;
            }
        }
        if (z9) {
            Y0(oVar, c0767c0, j, c0783q, i3, z6, f9);
            return;
        }
        switch (c0767c0.f8396a) {
            case 0:
                ?? E10 = oVar;
                ?? eVar2 = 0;
                while (E10 != 0) {
                    if (E10 instanceof Q0.t0) {
                        ((Q0.t0) E10).J();
                    } else if ((E10.j & 16) != 0 && (E10 instanceof Q0.AbstractC0776j)) {
                        p137q0.o oVar3 = ((Q0.AbstractC0776j) E10).f8443w;
                        int i18 = 0;
                        while (oVar3 != null) {
                            if ((oVar3.j & 16) != 0) {
                                i18++;
                                if (i18 == 1) {
                                    E10 = E10;
                                    eVar2 = eVar2;
                                    eVar2 = eVar2;
                                    E10 = oVar3;
                                } else {
                                    if (eVar2 == 0) {
                                        eVar2 = new p038e0.e(new p137q0.o[16]);
                                    }
                                    if (E10 != 0) {
                                        eVar2.c(E10);
                                        E10 = 0;
                                    }
                                    eVar2.c(oVar3);
                                }
                            } else {
                                E10 = E10;
                                eVar2 = eVar2;
                            }
                            oVar3 = oVar3.f26479m;
                            E10 = E10;
                            eVar2 = eVar2;
                        }
                        if (i18 == 1) {
                            E10 = E10;
                            eVar2 = eVar2;
                        } else {
                            E10 = E10;
                            eVar2 = eVar2;
                        }
                    }
                    E10 = Q0.AbstractC0777k.e(eVar2);
                }
                break;
        }
        i1(Q0.AbstractC0777k.d(oVar, c0767c0.b()), c0767c0, j, c0783q, i3, z6, f9, false);
    }

    @Override // O0.InterfaceC0732v
    public final void j(float[] fArr) {
        Q0.o0 o0VarA = Q0.I.a(this.f15861v);
        r1(o1(O0.AbstractC0735y.h(this)), fArr);
        ((androidx.compose.ui.platform.AndroidComposeView) ((K0.InterfaceC0662j) o0VarA)).r(fArr);
    }

    public abstract void j1(p188x0.InterfaceC3097q interfaceC3097q, A0.d dVar);

    @Override // O0.InterfaceC0732v
    public final long k() {
        return this.j;
    }

    public final void k1(long j, float f9, p194x6.j jVar) {
        s1(false, jVar);
        boolean zA = p113n1.k.a(this.f15849G, j);
        Q0.F f10 = this.f15861v;
        if (!zA) {
            ((androidx.compose.ui.platform.AndroidComposeView) Q0.I.a(f10)).M(-4.0f);
            this.f15849G = j;
            f10.f8233O.f8282p.v0();
            Q0.n0 n0Var = this.f15860S;
            if (n0Var != null) {
                ((R0.C0857x0) n0Var).d(j);
            } else {
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.f15863x;
                if (nodeCoordinator != null) {
                    nodeCoordinator.b1();
                }
            }
            f10.Q();
            Q0.N.G0(this);
            androidx.compose.ui.platform.AndroidComposeView androidComposeView = f10.f8254v;
            if (androidComposeView != null) {
                androidComposeView.y(f10);
            }
        }
        this.H = f9;
        if (this == f10.f8232N.f8389d) {
            Q0.I.a(f10).getRectManager().e(f10, false);
        }
        if (this.f8301r) {
            return;
        }
        v0(C0());
    }

    public final void l1(Z2.C1209t c1209t, boolean z6, boolean z9) {
        Q0.n0 n0Var = this.f15860S;
        if (n0Var != null) {
            if (this.f15864z) {
                if (z9) {
                    long jT0 = T0();
                    float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jT0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jT0 & 4294967295L)) / 2.0f;
                    long j = this.j;
                    c1209t.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z6) {
                    long j9 = this.j;
                    c1209t.a(0.0f, 0.0f, (int) (j9 >> 32), (int) (j9 & 4294967295L));
                }
                if (c1209t.b()) {
                    return;
                }
            }
            R0.C0857x0 c0857x0 = (R0.C0857x0) n0Var;
            float[] fArrB = c0857x0.b();
            if (!c0857x0.f9026z) {
                if (fArrB == null) {
                    c1209t.f12941b = 0.0f;
                    c1209t.f12942c = 0.0f;
                    c1209t.f12943d = 0.0f;
                    c1209t.f12944e = 0.0f;
                } else {
                    p188x0.E.c(fArrB, c1209t);
                }
            }
        }
        long j10 = this.f15849G;
        float f9 = (int) (j10 >> 32);
        c1209t.f12941b += f9;
        c1209t.f12943d += f9;
        float f10 = (int) (j10 & 4294967295L);
        c1209t.f12942c += f10;
        c1209t.f12944e += f10;
    }

    public final void m1() {
        if (this.f15860S != null) {
            s1(false, null);
            this.f15861v.Z(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void n1(O0.T t9) {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator;
        boolean z6;
        boolean z9 = true;
        O0.T t10 = this.f15847E;
        if (t9 != t10) {
            this.f15847E = t9;
            Q0.F f9 = this.f15861v;
            int i3 = 0;
            if (t10 == null || t9.b() != t10.b() || t9.a() != t10.a()) {
                int iB = t9.b();
                int iA = t9.a();
                Q0.n0 n0Var = this.f15860S;
                if (n0Var != null) {
                    ((R0.C0857x0) n0Var).e((((long) iB) << 32) | (((long) iA) & 4294967295L));
                } else if (f9.L() && (nodeCoordinator = this.f15863x) != null) {
                    nodeCoordinator.b1();
                }
                i0((((long) iA) & 4294967295L) | (((long) iB) << 32));
                if (this.f15843A != null) {
                    t1(false);
                }
                boolean zG = Q0.g0.g(4);
                p137q0.o oVarU0 = U0();
                if (zG || (oVarU0 = oVarU0.f26478l) != null) {
                    for (p137q0.o oVarW0 = W0(zG); oVarW0 != null && (oVarW0.f26477k & 4) != 0; oVarW0 = oVarW0.f26479m) {
                        if ((oVarW0.j & 4) != 0) {
                            ?? E9 = oVarW0;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof Q0.InterfaceC0779m) {
                                    ((Q0.InterfaceC0779m) E9).I();
                                } else if ((E9.j & 4) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                                    p137q0.o oVar = ((Q0.AbstractC0776j) E9).f8443w;
                                    int i9 = 0;
                                    while (oVar != null) {
                                        if ((oVar.j & 4) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                E9 = E9;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E9 = oVar;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p038e0.e(new p137q0.o[16]);
                                                }
                                                if (E9 != 0) {
                                                    eVar.c(E9);
                                                    E9 = 0;
                                                }
                                                eVar.c(oVar);
                                            }
                                        } else {
                                            E9 = E9;
                                            eVar = eVar;
                                        }
                                        oVar = oVar.f26479m;
                                        E9 = E9;
                                        eVar = eVar;
                                    }
                                    if (i9 == 1) {
                                        E9 = E9;
                                        eVar = eVar;
                                    } else {
                                        E9 = E9;
                                        eVar = eVar;
                                    }
                                }
                                E9 = Q0.AbstractC0777k.e(eVar);
                            }
                        }
                        if (oVarW0 == oVarU0) {
                            break;
                        }
                    }
                }
                androidx.compose.ui.platform.AndroidComposeView androidComposeView = f9.f8254v;
                if (androidComposeView != null) {
                    androidComposeView.y(f9);
                }
            }
            p136q.C c9 = this.f15848F;
            if ((c9 == null || c9.f26301e == 0) && t9.c().isEmpty()) {
                return;
            }
            p136q.C c10 = this.f15848F;
            java.util.Map mapC = t9.c();
            if (c10 != null && c10.f26301e == mapC.size()) {
                java.lang.Object[] objArr = c10.f26298b;
                int[] iArr = c10.f26299c;
                long[] jArr = c10.f26297a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i10 = 0;
                loop0: while (true) {
                    long j = jArr[i10];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j & 255) < 128) {
                                int i13 = (i10 << 3) + i12;
                                java.lang.Object obj = objArr[i13];
                                int i14 = iArr[i13];
                                java.lang.Integer num = (java.lang.Integer) mapC.get((O0.C0723l) obj);
                                if (num == null || num.intValue() != i14) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                            i12++;
                            z9 = z9;
                        }
                        z6 = z9;
                        if (i11 != 8) {
                            return;
                        }
                    } else {
                        z6 = z9;
                    }
                    if (i10 == length) {
                        return;
                    }
                    i10++;
                    z9 = z6;
                    i3 = 0;
                }
            }
            f9.f8233O.f8282p.f8353E.f();
            p136q.C c11 = this.f15848F;
            if (c11 == null) {
                p136q.C c12 = p136q.M.f26347a;
                c11 = new p136q.C();
                this.f15848F = c11;
            }
            c11.a();
            for (java.util.Map.Entry entry : t9.c().entrySet()) {
                c11.g(((java.lang.Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // Q0.p0
    public final boolean o() {
        return (this.f15860S == null || this.y || !this.f15861v.K()) ? false : true;
    }

    public final p181w0.b p1() {
        boolean z6 = U0().f26487u;
        p181w0.b bVar = p181w0.b.f29745e;
        if (z6) {
            O0.InterfaceC0732v interfaceC0732vH = O0.AbstractC0735y.h(this);
            Z2.C1209t c1209t = this.f15850I;
            if (c1209t == null) {
                c1209t = new Z2.C1209t();
                this.f15850I = c1209t;
            }
            long jL0 = L0(T0());
            int i3 = (int) (jL0 >> 32);
            c1209t.f12941b = -java.lang.Float.intBitsToFloat(i3);
            int i9 = (int) (jL0 & 4294967295L);
            c1209t.f12942c = -java.lang.Float.intBitsToFloat(i9);
            c1209t.f12943d = java.lang.Float.intBitsToFloat(i3) + f0();
            c1209t.f12944e = java.lang.Float.intBitsToFloat(i9) + e0();
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this;
            while (nodeCoordinator != interfaceC0732vH) {
                nodeCoordinator.l1(c1209t, false, true);
                if (!c1209t.b()) {
                    nodeCoordinator = nodeCoordinator.f15863x;
                    kotlin.jvm.internal.m.b(nodeCoordinator);
                }
            }
            return new p181w0.b(c1209t.f12941b, c1209t.f12942c, c1209t.f12943d, c1209t.f12944e);
        }
        return bVar;
    }

    public final void q1(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, float[] fArr) {
        float[] fArrA;
        if (kotlin.jvm.internal.m.a(nodeCoordinator, this)) {
            return;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = this.f15863x;
        kotlin.jvm.internal.m.b(nodeCoordinator2);
        nodeCoordinator2.q1(nodeCoordinator, fArr);
        if (!p113n1.k.a(this.f15849G, 0L)) {
            float[] fArr2 = V;
            p188x0.E.d(fArr2);
            long j = this.f15849G;
            p188x0.E.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            p188x0.E.e(fArr, fArr2);
        }
        Q0.n0 n0Var = this.f15860S;
        if (n0Var == null || (fArrA = ((R0.C0857x0) n0Var).a()) == null) {
            return;
        }
        p188x0.E.e(fArr, fArrA);
    }

    public final void r1(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, float[] fArr) {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = this;
        while (!nodeCoordinator2.equals(nodeCoordinator)) {
            Q0.n0 n0Var = nodeCoordinator2.f15860S;
            if (n0Var != null) {
                p188x0.E.e(fArr, ((R0.C0857x0) n0Var).b());
            }
            long j = nodeCoordinator2.f15849G;
            if (!p113n1.k.a(j, 0L)) {
                float[] fArr2 = V;
                p188x0.E.d(fArr2);
                p188x0.E.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                p188x0.E.e(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.f15863x;
            kotlin.jvm.internal.m.b(nodeCoordinator2);
        }
    }

    public final void s1(boolean z6, p194x6.j jVar) {
        androidx.compose.ui.platform.AndroidComposeView androidComposeView;
        S.p pVar;
        java.lang.ref.Reference referencePoll;
        p038e0.e eVar;
        O0.M m8;
        java.lang.ref.Reference referencePoll2;
        p038e0.e eVar2;
        java.lang.Object obj;
        Q0.F f9 = this.f15861v;
        boolean z9 = (!z6 && this.f15843A == jVar && kotlin.jvm.internal.m.a(this.f15844B, f9.f8226G) && this.f15845C == f9.H) ? false : true;
        this.f15844B = f9.f8226G;
        this.f15845C = f9.H;
        boolean zK = f9.K();
        Q0.C0769d0 c0769d0 = this.f15858Q;
        if (!zK || jVar == null) {
            this.f15843A = null;
            Q0.n0 n0Var = this.f15860S;
            if (n0Var != null) {
                R0.C0857x0 c0857x0 = (R0.C0857x0) n0Var;
                if (!p188x0.z.w(c0857x0.b())) {
                    f9.Q();
                }
                c0857x0.f9012k = null;
                c0857x0.f9013l = null;
                c0857x0.f9015n = true;
                boolean z10 = c0857x0.f9018q;
                androidx.compose.ui.platform.AndroidComposeView androidComposeView2 = c0857x0.j;
                if (z10) {
                    c0857x0.f9018q = false;
                    androidComposeView2.w(c0857x0, false);
                }
                p188x0.x xVar = c0857x0.f9011i;
                if (xVar != null) {
                    xVar.a(c0857x0.f9010h);
                    do {
                        pVar = androidComposeView2.f15882D0;
                        referencePoll = ((java.lang.ref.ReferenceQueue) pVar.j).poll();
                        eVar = (p038e0.e) pVar.f9153i;
                        if (referencePoll != null) {
                            eVar.l(referencePoll);
                        }
                    } while (referencePoll != null);
                    eVar.c(new java.lang.ref.WeakReference(c0857x0, (java.lang.ref.ReferenceQueue) pVar.j));
                    androidComposeView2.f15894K.j(c0857x0);
                }
                f9.f8236R = true;
                c0769d0.invoke();
                if (U0().f26487u && f9.L() && (androidComposeView = f9.f8254v) != null) {
                    androidComposeView.y(f9);
                }
            }
            this.f15860S = null;
            this.f15859R = false;
            return;
        }
        this.f15843A = jVar;
        if (this.f15860S != null) {
            if (z9) {
                t1(true);
                return;
            }
            return;
        }
        Q0.o0 o0VarA = Q0.I.a(f9);
        O0.M m9 = this.f15857P;
        if (m9 == null) {
            O0.M m10 = new O0.M(this, new Q0.C0769d0(this, 0), 2);
            this.f15857P = m10;
            m8 = m10;
        } else {
            m8 = m9;
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView3 = (androidx.compose.ui.platform.AndroidComposeView) o0VarA;
        do {
            S.p pVar2 = androidComposeView3.f15882D0;
            referencePoll2 = ((java.lang.ref.ReferenceQueue) pVar2.j).poll();
            eVar2 = (p038e0.e) pVar2.f9153i;
            if (referencePoll2 != null) {
                eVar2.l(referencePoll2);
            }
        } while (referencePoll2 != null);
        do {
            int i3 = eVar2.j;
            if (i3 == 0) {
                obj = null;
                break;
            }
            obj = ((java.lang.ref.Reference) eVar2.m(i3 - 1)).get();
        } while (obj == null);
        Q0.n0 c0857x1 = (Q0.n0) obj;
        if (c0857x1 != null) {
            R0.C0857x0 c0857x2 = (R0.C0857x0) c0857x1;
            p188x0.x xVar2 = c0857x2.f9011i;
            if (xVar2 == null) {
                throw p121o0.p.h("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!c0857x2.f9010h.f37s) {
                N0.a.a("layer should have been released before reuse");
            }
            c0857x2.f9010h = xVar2.b();
            c0857x2.f9015n = false;
            c0857x2.f9012k = m8;
            c0857x2.f9013l = c0769d0;
            c0857x2.f9025x = false;
            c0857x2.y = false;
            c0857x2.f9026z = true;
            p188x0.E.d(c0857x2.f9016o);
            float[] fArr = c0857x2.f9017p;
            if (fArr != null) {
                p188x0.E.d(fArr);
            }
            c0857x2.f9023v = p188x0.T.f31094b;
            c0857x2.f9008A = false;
            long j = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            c0857x2.f9014m = (j & 4294967295L) | (j << 32);
            c0857x2.f9024w = null;
            c0857x2.f9022u = 0;
        } else {
            c0857x1 = new R0.C0857x0(androidComposeView3.getGraphicsContext().b(), androidComposeView3.getGraphicsContext(), androidComposeView3, m8, c0769d0);
        }
        R0.C0857x0 c0857x3 = (R0.C0857x0) c0857x1;
        c0857x3.e(this.j);
        c0857x3.d(this.f15849G);
        this.f15860S = c0857x1;
        t1(true);
        f9.f8236R = true;
        c0769d0.invoke();
    }

    public final void t1(boolean z6) {
        char c9;
        boolean z9;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView;
        Q0.C0769d0 c0769d0;
        int i3;
        Q0.C0769d0 c0769d1;
        Q0.n0 n0Var = this.f15860S;
        if (n0Var == null) {
            if (this.f15843A == null) {
                return;
            }
            N0.a.b("null layer with a non-null layerBlock");
            return;
        }
        p194x6.j jVar = this.f15843A;
        if (jVar == null) {
            throw p121o0.p.h("updateLayerParameters requires a non-null layerBlock");
        }
        p188x0.L l2 = f15841T;
        l2.a();
        Q0.F f9 = this.f15861v;
        l2.y = f9.f8226G;
        l2.f31073z = f9.H;
        l2.f31072x = com.google.common.util.concurrent.AbstractC1903s.K(this.j);
        Q0.I.a(f9).getSnapshotObserver().f8460a.d(this, Q0.C0768d.f8399l, new K0.C0656d(jVar, this, 4));
        Q0.C0786u c0786u = this.f15851J;
        if (c0786u == null) {
            c0786u = new Q0.C0786u();
            this.f15851J = c0786u;
        }
        Q0.C0786u c0786u2 = f15842U;
        c0786u2.getClass();
        c0786u2.f8475a = c0786u.f8475a;
        c0786u2.f8476b = c0786u.f8476b;
        c0786u2.f8477c = c0786u.f8477c;
        c0786u2.f8478d = c0786u.f8478d;
        c0786u2.f8479e = c0786u.f8479e;
        c0786u2.f8480f = c0786u.f8480f;
        c0786u2.g = c0786u.g;
        c0786u2.f8481h = c0786u.f8481h;
        float f10 = l2.f31058i;
        c0786u.f8475a = f10;
        c0786u.f8476b = l2.j;
        c0786u.f8477c = l2.f31060l;
        c0786u.f8478d = l2.f31061m;
        c0786u.f8479e = l2.f31065q;
        c0786u.f8480f = l2.f31066r;
        c0786u.g = l2.f31067s;
        long j = l2.f31068t;
        c0786u.f8481h = j;
        R0.C0857x0 c0857x0 = (R0.C0857x0) n0Var;
        int i9 = l2.f31057h | c0857x0.f9022u;
        c0857x0.f9020s = l2.f31073z;
        c0857x0.f9019r = l2.y;
        int i10 = i9 & 4096;
        if (i10 != 0) {
            c0857x0.f9023v = j;
        }
        if ((i9 & 1) != 0) {
            A0.f fVar = c0857x0.f9010h.f21a;
            if (fVar.c() != f10) {
                fVar.z(f10);
            }
        }
        if ((i9 & 2) != 0) {
            A0.d dVar = c0857x0.f9010h;
            float f11 = l2.j;
            A0.f fVar2 = dVar.f21a;
            if (fVar2.L() != f11) {
                fVar2.l(f11);
            }
        }
        if ((i9 & 4) != 0) {
            A0.d dVar2 = c0857x0.f9010h;
            float f12 = l2.f31059k;
            A0.f fVar3 = dVar2.f21a;
            if (fVar3.a() != f12) {
                fVar3.u(f12);
            }
        }
        if ((i9 & 8) != 0) {
            A0.d dVar3 = c0857x0.f9010h;
            float f13 = l2.f31060l;
            A0.f fVar4 = dVar3.f21a;
            if (fVar4.B() != f13) {
                fVar4.F(f13);
            }
        }
        if ((i9 & 16) != 0) {
            A0.d dVar4 = c0857x0.f9010h;
            float f14 = l2.f31061m;
            A0.f fVar5 = dVar4.f21a;
            if (fVar5.v() != f14) {
                fVar5.f(f14);
            }
        }
        if ((i9 & 32) != 0) {
            A0.d dVar5 = c0857x0.f9010h;
            float f15 = l2.f31062n;
            A0.f fVar6 = dVar5.f21a;
            if (fVar6.K() != f15) {
                fVar6.d(f15);
                dVar5.g = true;
                dVar5.a();
            }
            if (l2.f31062n > 0.0f && !c0857x0.f9008A && (c0769d1 = c0857x0.f9013l) != null) {
                c0769d1.invoke();
            }
        }
        if ((i9 & 64) != 0) {
            A0.d dVar6 = c0857x0.f9010h;
            long j9 = l2.f31063o;
            A0.f fVar7 = dVar6.f21a;
            if (!p188x0.C3098s.d(j9, fVar7.s())) {
                fVar7.x(j9);
            }
        }
        if ((i9 & 128) != 0) {
            A0.d dVar7 = c0857x0.f9010h;
            long j10 = l2.f31064p;
            A0.f fVar8 = dVar7.f21a;
            if (!p188x0.C3098s.d(j10, fVar8.w())) {
                fVar8.G(j10);
            }
        }
        if ((i9 & 1024) != 0) {
            A0.d dVar8 = c0857x0.f9010h;
            float f16 = l2.f31066r;
            A0.f fVar9 = dVar8.f21a;
            if (fVar9.q() != f16) {
                fVar9.e(f16);
            }
        }
        if ((i9 & 256) != 0) {
            A0.f fVar10 = c0857x0.f9010h.f21a;
            if (fVar10.D() != 0.0f) {
                fVar10.t();
            }
        }
        if ((i9 & 512) != 0) {
            A0.d dVar9 = c0857x0.f9010h;
            float f17 = l2.f31065q;
            A0.f fVar11 = dVar9.f21a;
            if (fVar11.n() != f17) {
                fVar11.b(f17);
            }
        }
        if ((i9 & 2048) != 0) {
            A0.d dVar10 = c0857x0.f9010h;
            float f18 = l2.f31067s;
            A0.f fVar12 = dVar10.f21a;
            if (fVar12.A() != f18) {
                fVar12.J(f18);
            }
        }
        if (i10 != 0) {
            c9 = ' ';
            if (p188x0.T.a(c0857x0.f9023v, p188x0.T.f31094b)) {
                A0.d dVar11 = c0857x0.f9010h;
                if (!p181w0.a.b(dVar11.f40v, 9205357640488583168L)) {
                    dVar11.f40v = 9205357640488583168L;
                    dVar11.f21a.r(9205357640488583168L);
                }
            } else {
                A0.d dVar12 = c0857x0.f9010h;
                long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(p188x0.T.b(c0857x0.f9023v) * ((int) (c0857x0.f9014m >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(p188x0.T.c(c0857x0.f9023v) * ((int) (c0857x0.f9014m & 4294967295L)))) & 4294967295L);
                if (!p181w0.a.b(dVar12.f40v, jFloatToRawIntBits)) {
                    dVar12.f40v = jFloatToRawIntBits;
                    dVar12.f21a.r(jFloatToRawIntBits);
                }
            }
        } else {
            c9 = ' ';
        }
        if ((i9 & 16384) != 0) {
            A0.d dVar13 = c0857x0.f9010h;
            boolean z10 = l2.f31070v;
            if (dVar13.f41w != z10) {
                dVar13.f41w = z10;
                dVar13.g = true;
                dVar13.a();
            }
        }
        if ((131072 & i9) != 0) {
            A0.f fVar13 = c0857x0.f9010h.f21a;
        }
        if ((262144 & i9) != 0) {
            A0.f fVar14 = c0857x0.f9010h.f21a;
            if (!kotlin.jvm.internal.m.a(fVar14.k(), null)) {
                fVar14.y();
            }
        }
        if ((524288 & i9) != 0) {
            A0.d dVar14 = c0857x0.f9010h;
            int i11 = l2.f31055A;
            A0.f fVar15 = dVar14.f21a;
            if (fVar15.M() != i11) {
                fVar15.h(i11);
            }
        }
        if ((32768 & i9) != 0) {
            A0.d dVar15 = c0857x0.f9010h;
            int i12 = l2.f31071w;
            if (i12 == 0) {
                i3 = 0;
            } else if (i12 == 1) {
                i3 = 1;
            } else {
                i3 = 2;
                if (i12 != 2) {
                    throw new java.lang.IllegalStateException("Not supported composition strategy");
                }
            }
            A0.f fVar16 = dVar15.f21a;
            if (fVar16.j() != i3) {
                fVar16.E(i3);
            }
        }
        if ((i9 & 7963) != 0) {
            c0857x0.f9025x = true;
            c0857x0.y = true;
        }
        if (kotlin.jvm.internal.m.a(c0857x0.f9024w, l2.f31056B)) {
            z9 = false;
        } else {
            p188x0.z zVar = l2.f31056B;
            c0857x0.f9024w = zVar;
            if (zVar != null) {
                A0.d dVar16 = c0857x0.f9010h;
                if (zVar instanceof p188x0.G) {
                    p181w0.b bVar = ((p188x0.G) zVar).f31049f;
                    float f19 = bVar.f29746a;
                    long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f19);
                    float f20 = bVar.f29747b;
                    dVar16.f((((long) java.lang.Float.floatToRawIntBits(f20)) & 4294967295L) | (jFloatToRawIntBits2 << c9), (((long) java.lang.Float.floatToRawIntBits(bVar.f29748c - f19)) << c9) | (((long) java.lang.Float.floatToRawIntBits(bVar.f29749d - f20)) & 4294967295L), 0.0f);
                } else if (zVar instanceof p188x0.F) {
                    dVar16.f29k = null;
                    dVar16.f28i = 9205357640488583168L;
                    dVar16.f27h = 0L;
                    dVar16.j = 0.0f;
                    dVar16.g = true;
                    dVar16.f32n = false;
                    dVar16.f30l = ((p188x0.F) zVar).f31048f;
                    dVar16.a();
                } else {
                    if (!(zVar instanceof p188x0.H)) {
                        throw new I3.b();
                    }
                    p188x0.H h9 = (p188x0.H) zVar;
                    p188x0.C3088h c3088h = h9.g;
                    if (c3088h != null) {
                        dVar16.f29k = null;
                        dVar16.f28i = 9205357640488583168L;
                        dVar16.f27h = 0L;
                        dVar16.j = 0.0f;
                        dVar16.g = true;
                        dVar16.f32n = false;
                        dVar16.f30l = c3088h;
                        dVar16.a();
                    } else {
                        p181w0.c cVar = h9.f31050f;
                        dVar16.f((((long) java.lang.Float.floatToRawIntBits(cVar.f29750a)) << c9) | (((long) java.lang.Float.floatToRawIntBits(cVar.f29751b)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(cVar.b())) << c9) | (((long) java.lang.Float.floatToRawIntBits(cVar.a())) & 4294967295L), java.lang.Float.intBitsToFloat((int) (cVar.f29756h >> c9)));
                    }
                }
                if ((zVar instanceof p188x0.F) && android.os.Build.VERSION.SDK_INT < 33 && (c0769d0 = c0857x0.f9013l) != null) {
                    c0769d0.invoke();
                }
            }
            z9 = true;
        }
        c0857x0.f9022u = l2.f31057h;
        if (i9 != 0 || z9) {
            int i13 = android.os.Build.VERSION.SDK_INT;
            androidx.compose.ui.platform.AndroidComposeView androidComposeView2 = c0857x0.j;
            if (i13 >= 26) {
                android.view.ViewParent parent = androidComposeView2.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(androidComposeView2, androidComposeView2);
                }
            } else {
                androidComposeView2.invalidate();
            }
            if (androidComposeView2.f15939s) {
                androidComposeView2.M(0.0f);
            }
        }
        boolean z11 = this.f15864z;
        this.f15864z = l2.f31070v;
        this.f15846D = l2.f31059k;
        boolean z12 = c0786u2.f8475a == c0786u.f8475a && c0786u2.f8476b == c0786u.f8476b && c0786u2.f8477c == c0786u.f8477c && c0786u2.f8478d == c0786u.f8478d && c0786u2.f8479e == c0786u.f8479e && c0786u2.f8480f == c0786u.f8480f && c0786u2.g == c0786u.g && p188x0.T.a(c0786u2.f8481h, c0786u.f8481h);
        if (z6 && ((!z12 || z11 != this.f15864z) && (androidComposeView = f9.f8254v) != null)) {
            androidComposeView.y(f9);
        }
        if (z12) {
            return;
        }
        Q0.J j11 = f9.f8233O;
        if (j11.f8278l > 0) {
            if (j11.f8277k || j11.j) {
                f9.Z(false);
            }
            j11.f8282p.v0();
        }
        f9.Q();
        Q0.o0 o0VarA = Q0.I.a(f9);
        Z0.b rectManager = o0VarA.getRectManager();
        if (this == f9.f8232N.f8389d) {
            rectManager.e(f9, false);
        } else {
            rectManager.getClass();
            if (f9.L()) {
                long jF = Z0.b.f(f9);
                if (p113n1.k.a(jF, 9223372034707292159L)) {
                    rectManager.c(f9);
                } else {
                    f9.f8245m = jF;
                    f9.f8246n = false;
                    p038e0.e eVarC = f9.C();
                    java.lang.Object[] objArr = eVarC.f21324h;
                    int i14 = eVarC.j;
                    for (int i15 = 0; i15 < i14; i15++) {
                        rectManager.e((Q0.F) objArr[i15], false);
                    }
                    rectManager.d(f9);
                }
            }
        }
        if (f9.X > 0) {
            androidx.compose.ui.platform.AndroidComposeView androidComposeView3 = (androidx.compose.ui.platform.AndroidComposeView) o0VarA;
            S.p pVar = androidComposeView3.f15915e0.f8343e;
            pVar.getClass();
            if (f9.X > 0) {
                ((p038e0.e) pVar.f9153i).c(f9);
                f9.W = true;
            }
            androidComposeView3.F(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a3  */
    public final boolean u1(long j) {
        boolean z6;
        boolean z9;
        boolean zO;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        Q0.n0 n0Var = this.f15860S;
        if (n0Var == null || !this.f15864z) {
            return true;
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        A0.d dVar = ((R0.C0857x0) n0Var).f9010h;
        if (dVar.f41w) {
            p188x0.z zVarD = dVar.d();
            if (zVarD instanceof p188x0.G) {
                p181w0.b bVar = ((p188x0.G) zVarD).f31049f;
                if (bVar.f29746a <= fIntBitsToFloat && fIntBitsToFloat < bVar.f29748c && bVar.f29747b <= fIntBitsToFloat2 && fIntBitsToFloat2 < bVar.f29749d) {
                    z6 = false;
                    z9 = true;
                }
            } else if (zVarD instanceof p188x0.H) {
                p181w0.c cVar = ((p188x0.H) zVarD).f31050f;
                float f9 = cVar.f29750a;
                if (fIntBitsToFloat >= f9) {
                    float f10 = cVar.f29752c;
                    if (fIntBitsToFloat < f10) {
                        float f11 = cVar.f29751b;
                        if (fIntBitsToFloat2 >= f11) {
                            float f12 = cVar.f29753d;
                            if (fIntBitsToFloat2 < f12) {
                                long j9 = cVar.f29754e;
                                z6 = false;
                                z9 = true;
                                int i3 = (int) (j9 >> 32);
                                float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i3);
                                long j10 = cVar.f29755f;
                                int i9 = (int) (j10 >> 32);
                                if (java.lang.Float.intBitsToFloat(i9) + fIntBitsToFloat3 <= cVar.b()) {
                                    long j11 = cVar.f29756h;
                                    int i10 = (int) (j11 >> 32);
                                    float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat(i10);
                                    long j12 = cVar.g;
                                    int i11 = (int) (j12 >> 32);
                                    if (java.lang.Float.intBitsToFloat(i11) + fIntBitsToFloat4 <= cVar.b()) {
                                        int i12 = (int) (j9 & 4294967295L);
                                        int i13 = (int) (j11 & 4294967295L);
                                        if (java.lang.Float.intBitsToFloat(i13) + java.lang.Float.intBitsToFloat(i12) <= cVar.a()) {
                                            int i14 = (int) (j10 & 4294967295L);
                                            int i15 = (int) (j12 & 4294967295L);
                                            if (java.lang.Float.intBitsToFloat(i15) + java.lang.Float.intBitsToFloat(i14) <= cVar.a()) {
                                                float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat(i3) + f9;
                                                float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat(i12) + f11;
                                                float fIntBitsToFloat7 = f10 - java.lang.Float.intBitsToFloat(i9);
                                                float fIntBitsToFloat8 = java.lang.Float.intBitsToFloat(i14) + f11;
                                                float fIntBitsToFloat9 = f10 - java.lang.Float.intBitsToFloat(i11);
                                                float fIntBitsToFloat10 = f12 - java.lang.Float.intBitsToFloat(i15);
                                                float fIntBitsToFloat11 = f12 - java.lang.Float.intBitsToFloat(i13);
                                                float fIntBitsToFloat12 = java.lang.Float.intBitsToFloat(i10) + f9;
                                                if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                                    zO = R0.L.o(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, cVar.f29754e);
                                                } else if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                                    zO = R0.L.o(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, cVar.f29756h);
                                                } else if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) {
                                                    zO = (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z9 : R0.L.o(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, cVar.g);
                                                } else {
                                                    zO = R0.L.o(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, cVar.f29755f);
                                                }
                                            } else {
                                                p188x0.C3088h c3088hA = p188x0.AbstractC3091k.a();
                                                p188x0.C3088h.b(c3088hA, cVar);
                                                zO = R0.L.n(fIntBitsToFloat, fIntBitsToFloat2, c3088hA);
                                            }
                                        } else {
                                            p188x0.C3088h c3088hA2 = p188x0.AbstractC3091k.a();
                                            p188x0.C3088h.b(c3088hA2, cVar);
                                            zO = R0.L.n(fIntBitsToFloat, fIntBitsToFloat2, c3088hA2);
                                        }
                                    } else {
                                        p188x0.C3088h c3088hA3 = p188x0.AbstractC3091k.a();
                                        p188x0.C3088h.b(c3088hA3, cVar);
                                        zO = R0.L.n(fIntBitsToFloat, fIntBitsToFloat2, c3088hA3);
                                    }
                                } else {
                                    p188x0.C3088h c3088hA4 = p188x0.AbstractC3091k.a();
                                    p188x0.C3088h.b(c3088hA4, cVar);
                                    zO = R0.L.n(fIntBitsToFloat, fIntBitsToFloat2, c3088hA4);
                                }
                            }
                        }
                    }
                }
            } else {
                z6 = false;
                z9 = true;
                if (!(zVarD instanceof p188x0.F)) {
                    throw new I3.b();
                }
                zO = R0.L.n(fIntBitsToFloat, fIntBitsToFloat2, ((p188x0.F) zVarD).f31048f);
            }
            z6 = false;
            z9 = true;
            zO = false;
        } else {
            z6 = false;
            z9 = true;
        }
        return zO ? z9 : z6;
    }

    @Override // Q0.N
    public final Q0.N x0() {
        return this.f15862w;
    }

    @Override // Q0.N
    public final boolean z0() {
        return this.f15847E != null;
    }

    @Override // Q0.N
    public final O0.InterfaceC0732v y0() {
        return this;
    }
}
