package Q0;

/* JADX INFO: renamed from: Q0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0765b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q0.F f8386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q0.C0763a0 f8387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.node.a f8388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.compose.ui.node.NodeCoordinator f8389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q0.z0 f8390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p137q0.o f8391f;
    public p038e0.e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p038e0.e f8392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p038e0.e f8393i;
    public Q0.Z j;

    public C0765b0(Q0.F f9) {
        this.f8386a = f9;
        Q0.C0763a0 c0763a0 = new Q0.C0763a0();
        c0763a0.f26477k = -1;
        this.f8387b = c0763a0;
        androidx.compose.ui.node.a aVar = new androidx.compose.ui.node.a(f9);
        this.f8388c = aVar;
        this.f8389d = aVar;
        Q0.z0 z0Var = aVar.f15866Y;
        this.f8390e = z0Var;
        this.f8391f = z0Var;
        this.f8393i = new p038e0.e(new p137q0.p[16]);
    }

    public static final void a(Q0.C0765b0 c0765b0, p137q0.o oVar, androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        c0765b0.getClass();
        for (p137q0.o oVar2 = oVar.f26478l; oVar2 != null; oVar2 = oVar2.f26478l) {
            if (oVar2 == c0765b0.f8387b) {
                Q0.F fX = c0765b0.f8386a.x();
                nodeCoordinator.f15863x = fX != null ? fX.f8232N.f8388c : null;
                c0765b0.f8389d = nodeCoordinator;
                return;
            } else {
                if ((oVar2.j & 2) != 0) {
                    return;
                }
                oVar2.M0(nodeCoordinator);
            }
        }
    }

    public static p137q0.o b(p137q0.n nVar, p137q0.o oVar) {
        p137q0.o oVarE;
        if (nVar instanceof Q0.X) {
            oVarE = ((Q0.X) nVar).e();
            oVarE.j = Q0.g0.f(oVarE);
        } else {
            Q0.C0764b c0764b = new Q0.C0764b();
            c0764b.j = Q0.g0.d(nVar);
            c0764b.f8385v = nVar;
            new java.util.HashSet();
            oVarE = c0764b;
        }
        if (oVarE.f26487u) {
            N0.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        oVarE.f26482p = true;
        p137q0.o oVar2 = oVar.f26479m;
        if (oVar2 != null) {
            oVar2.f26478l = oVarE;
            oVarE.f26479m = oVar2;
        }
        oVar.f26479m = oVarE;
        oVarE.f26478l = oVar;
        return oVarE;
    }

    public static p137q0.o c(p137q0.o oVar) {
        boolean z6 = oVar.f26487u;
        if (z6) {
            p136q.C c9 = Q0.g0.f8437a;
            if (!z6) {
                N0.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            Q0.g0.a(oVar, -1, 2);
            oVar.K0();
            oVar.E0();
        }
        p137q0.o oVar2 = oVar.f26479m;
        p137q0.o oVar3 = oVar.f26478l;
        if (oVar2 != null) {
            oVar2.f26478l = oVar3;
            oVar.f26479m = null;
        }
        if (oVar3 != null) {
            oVar3.f26479m = oVar2;
            oVar.f26478l = null;
        }
        kotlin.jvm.internal.m.b(oVar3);
        return oVar3;
    }

    public static void h(p137q0.n nVar, p137q0.n nVar2, p137q0.o oVar) {
        if ((nVar instanceof Q0.X) && (nVar2 instanceof Q0.X)) {
            kotlin.jvm.internal.m.c(oVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((Q0.X) nVar2).f(oVar);
            if (oVar.f26487u) {
                Q0.g0.c(oVar);
                return;
            } else {
                oVar.f26483q = true;
                return;
            }
        }
        if (!(oVar instanceof Q0.C0764b)) {
            N0.a.b("Unknown Modifier.Node type");
            return;
        }
        Q0.C0764b c0764b = (Q0.C0764b) oVar;
        boolean z6 = c0764b.f26487u;
        if (z6) {
            if (!z6) {
                N0.a.b("unInitializeModifier called on unattached node");
            }
            if ((c0764b.j & 8) != 0) {
                ((androidx.compose.ui.platform.AndroidComposeView) Q0.AbstractC0777k.u(c0764b)).B();
            }
        }
        c0764b.f8385v = nVar2;
        c0764b.j = Q0.g0.d(nVar2);
        if (c0764b.f26487u) {
            c0764b.N0(false);
        }
        if (oVar.f26487u) {
            Q0.g0.c(oVar);
        } else {
            oVar.f26483q = true;
        }
    }

    public final boolean d(int i3) {
        return (i3 & this.f8391f.f26477k) != 0;
    }

    public final void e() {
        for (p137q0.o oVar = this.f8391f; oVar != null; oVar = oVar.f26479m) {
            oVar.J0();
            if (oVar.f26482p) {
                p136q.C c9 = Q0.g0.f8437a;
                if (!oVar.f26487u) {
                    N0.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                Q0.g0.a(oVar, -1, 1);
            }
            if (oVar.f26483q) {
                Q0.g0.c(oVar);
            }
            oVar.f26482p = false;
            oVar.f26483q = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0147 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:47:0x012d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0145  */
    /* JADX WARN: Code duplicated, block: B:71:0x0192  */
    /* JADX WARN: Code duplicated, block: B:72:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:77:0x01a8
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void f(int r32, p038e0.e r33, p038e0.e r34, p137q0.o r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C0765b0.f(int, e0.e, e0.e, q0.o, boolean):void");
    }

    public final void g() {
        Q0.F f9;
        androidx.compose.ui.node.b bVar;
        Q0.n0 n0Var;
        p137q0.o oVar = this.f8390e.f26478l;
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = this.f8388c;
        while (true) {
            f9 = this.f8386a;
            if (oVar == null) {
                break;
            }
            Q0.InterfaceC0788w interfaceC0788wF = Q0.AbstractC0777k.f(oVar);
            if (interfaceC0788wF != null) {
                androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = oVar.f26481o;
                if (nodeCoordinator2 != null) {
                    bVar = (androidx.compose.ui.node.b) nodeCoordinator2;
                    Q0.InterfaceC0788w interfaceC0788w = bVar.f15869Y;
                    bVar.v1(interfaceC0788wF);
                    if (interfaceC0788w != oVar && (n0Var = bVar.f15860S) != null) {
                        ((R0.C0857x0) n0Var).invalidate();
                    }
                } else {
                    bVar = new androidx.compose.ui.node.b(f9, interfaceC0788wF);
                    oVar.M0(bVar);
                }
                nodeCoordinator.f15863x = bVar;
                bVar.f15862w = nodeCoordinator;
                nodeCoordinator = bVar;
            } else {
                oVar.M0(nodeCoordinator);
            }
            oVar = oVar.f26478l;
        }
        Q0.F fX = f9.x();
        nodeCoordinator.f15863x = fX != null ? fX.f8232N.f8388c : null;
        this.f8389d = nodeCoordinator;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        p137q0.o oVar = this.f8391f;
        Q0.z0 z0Var = this.f8390e;
        if (oVar == z0Var) {
            sb.append("]");
        } else {
            while (oVar != null && oVar != z0Var) {
                sb.append(java.lang.String.valueOf(oVar));
                if (oVar.f26479m == z0Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                oVar = oVar.f26479m;
            }
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
