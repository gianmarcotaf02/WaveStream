package Q0;

/* JADX INFO: renamed from: Q0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0777k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q0.l0 f8444a = new Q0.l0(1);

    public static final long a(float f9, boolean z6, boolean z9) {
        return (((z6 ? 1L : 0L) | (z9 ? 2L : 0L)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(f9)) << 32);
    }

    public static final void b(p038e0.e eVar, p137q0.o oVar) {
        p038e0.e eVarC = t(oVar).C();
        int i3 = eVarC.j - 1;
        java.lang.Object[] objArr = eVarC.f21324h;
        if (i3 < objArr.length) {
            while (i3 >= 0) {
                eVar.c(((Q0.F) objArr[i3]).f8232N.f8391f);
                i3--;
            }
        }
    }

    public static final int c(Q0.N n3, O0.C0723l c0723l) {
        Q0.N nX0 = n3.x0();
        if (nX0 == null) {
            N0.a.b("Child of " + n3 + " cannot be null when calculating alignment line");
        }
        if (n3.C0().c().containsKey(c0723l)) {
            java.lang.Integer num = (java.lang.Integer) n3.C0().c().get(c0723l);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iB0 = nX0.b0(c0723l);
            if (iB0 != Integer.MIN_VALUE) {
                nX0.f8300q = true;
                n3.f8301r = true;
                n3.I0();
                nX0.f8300q = false;
                n3.f8301r = false;
                return c0723l instanceof O0.C0723l ? iB0 + ((int) (nX0.E0() & 4294967295L)) : iB0 + ((int) (nX0.E0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final p137q0.o d(Q0.InterfaceC0775i interfaceC0775i, int i3) {
        p137q0.o oVar = ((p137q0.o) interfaceC0775i).f26475h.f26479m;
        if (oVar == null || (oVar.f26477k & i3) == 0) {
            return null;
        }
        while (oVar != null) {
            int i9 = oVar.j;
            if ((i9 & 2) != 0) {
                return null;
            }
            if ((i9 & i3) != 0) {
                return oVar;
            }
            oVar = oVar.f26479m;
        }
        return null;
    }

    public static final p137q0.o e(p038e0.e eVar) {
        int i3;
        if (eVar == null || (i3 = eVar.j) == 0) {
            return null;
        }
        return (p137q0.o) eVar.m(i3 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Q0.InterfaceC0788w f(p137q0.o oVar) {
        if ((oVar.j & 2) != 0) {
            if (oVar instanceof Q0.InterfaceC0788w) {
                return (Q0.InterfaceC0788w) oVar;
            }
            if (oVar instanceof Q0.AbstractC0776j) {
                p137q0.o oVar2 = ((Q0.AbstractC0776j) oVar).f8443w;
                while (oVar2 != 0) {
                    if (oVar2 instanceof Q0.InterfaceC0788w) {
                        return (Q0.InterfaceC0788w) oVar2;
                    }
                    oVar2 = (!(oVar2 instanceof Q0.AbstractC0776j) || (oVar2.j & 2) == 0) ? oVar2.f26479m : ((Q0.AbstractC0776j) oVar2).f8443w;
                }
            }
        }
        return null;
    }

    public static final int g(long j, long j9) {
        boolean zN = n(j);
        if (zN != n(j9)) {
            return zN ? -1 : 1;
        }
        int iSignum = (int) java.lang.Math.signum(i(j) - i(j9));
        if (java.lang.Math.min(i(j), i(j9)) >= 0.0f && m(j) != m(j9)) {
            return m(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object h(Q0.InterfaceC0774h interfaceC0774h, p020c0.AbstractC1697o0 abstractC1697o0) {
        if (!((p137q0.o) interfaceC0774h).f26475h.f26487u) {
            N0.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        p089k0.j jVar = (p089k0.j) t(interfaceC0774h).f8228J;
        jVar.getClass();
        return p020c0.AbstractC1703s.C(jVar, abstractC1697o0);
    }

    public static final float i(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Q0.InterfaceC0779m interfaceC0779m) {
        if (((p137q0.o) interfaceC0779m).f26475h.f26487u) {
            r(interfaceC0779m, 1).b1();
        }
    }

    public static final void k(Q0.InterfaceC0788w interfaceC0788w) {
        t(interfaceC0788w).H();
    }

    public static final void l(Q0.x0 x0Var) {
        t(x0Var).I();
    }

    public static final boolean m(long j) {
        return (j & 2) != 0;
    }

    public static final boolean n(long j) {
        return (j & 1) != 0;
    }

    public static final boolean o(Q0.F f9) {
        if (f9.f8248p == null) {
            return false;
        }
        Q0.F fX = f9.x();
        return (fX != null ? fX.f8248p : null) == null || f9.f8233O.f8270b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(p137q0.o oVar, kotlin.jvm.functions.Function0 function0) {
        Q0.k0 k0Var = oVar.f26480n;
        if (k0Var == null) {
            k0Var = new Q0.k0((Q0.j0) oVar);
            oVar.f26480n = k0Var;
        }
        Q0.q0 snapshotObserver = u(oVar).getSnapshotObserver();
        snapshotObserver.f8460a.d(k0Var, Q0.C0768d.f8400m, function0);
    }

    public static final void q(Q0.InterfaceC0775i interfaceC0775i) {
        p145r0.c cVar;
        Q0.F fT = t(interfaceC0775i);
        if (fT.f8221B) {
            return;
        }
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) Q0.I.a(fT);
        if (!androidx.compose.ui.platform.AndroidComposeView.g() || (cVar = androidComposeView._autofillManager) == null) {
            return;
        }
        cVar.f26678k.f12603a.k(fT.f8242i, new p145r0.b(cVar, fT));
    }

    public static final androidx.compose.ui.node.NodeCoordinator r(Q0.InterfaceC0775i interfaceC0775i, int i3) {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = ((p137q0.o) interfaceC0775i).f26475h.f26481o;
        kotlin.jvm.internal.m.b(nodeCoordinator);
        if (nodeCoordinator.U0() != interfaceC0775i || !Q0.g0.g(i3)) {
            return nodeCoordinator;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = nodeCoordinator.f15862w;
        kotlin.jvm.internal.m.b(nodeCoordinator2);
        return nodeCoordinator2;
    }

    public static final androidx.compose.ui.node.NodeCoordinator s(Q0.InterfaceC0775i interfaceC0775i) {
        if (!((p137q0.o) interfaceC0775i).f26475h.f26487u) {
            N0.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorR = r(interfaceC0775i, 2);
        if (!nodeCoordinatorR.U0().f26487u) {
            N0.a.b("LayoutCoordinates is not attached.");
        }
        return nodeCoordinatorR;
    }

    public static final Q0.F t(Q0.InterfaceC0775i interfaceC0775i) {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = ((p137q0.o) interfaceC0775i).f26475h.f26481o;
        if (nodeCoordinator != null) {
            return nodeCoordinator.f15861v;
        }
        throw p121o0.p.h("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Q0.o0 u(Q0.InterfaceC0775i interfaceC0775i) {
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = t(interfaceC0775i).f8254v;
        if (androidComposeView != null) {
            return androidComposeView;
        }
        throw p121o0.p.h("This node does not have an owner.");
    }

    public static final android.view.View v(Q0.InterfaceC0775i interfaceC0775i) {
        if (!((p137q0.o) interfaceC0775i).f26475h.f26487u) {
            N0.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (android.view.View) Q0.I.a(t(interfaceC0775i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [x6.j] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void w(Q0.InterfaceC0775i interfaceC0775i, java.lang.Object obj, p194x6.j jVar) {
        Q0.C0765b0 c0765b0;
        p137q0.o oVar = (p137q0.o) interfaceC0775i;
        if (!oVar.f26475h.f26487u) {
            N0.a.b("visitAncestors called on an unattached node");
        }
        p137q0.o oVar2 = oVar.f26475h.f26478l;
        Q0.F fT = t(interfaceC0775i);
        while (fT != null) {
            if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.j & 262144) != 0) {
                        ?? E9 = oVar2;
                        ?? eVar = 0;
                        while (E9 != 0) {
                            if (E9 instanceof Q0.C0) {
                                Q0.C0 c9 = (Q0.C0) E9;
                                if (!(obj.equals(c9.g()) ? ((java.lang.Boolean) jVar.invoke(c9)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((E9.j & 262144) != 0) && (E9 instanceof Q0.AbstractC0776j)) {
                                    p137q0.o oVar3 = ((Q0.AbstractC0776j) E9).f8443w;
                                    int i3 = 0;
                                    while (oVar3 != null) {
                                        if ((oVar3.j & 262144) != 0) {
                                            E9 = E9;
                                            eVar = eVar;
                                            i3++;
                                            if (i3 == 1) {
                                                E9 = E9;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E9 = oVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p038e0.e(new p137q0.o[16]);
                                                }
                                                if (E9 != 0) {
                                                    eVar.c(E9);
                                                    E9 = 0;
                                                }
                                                eVar.c(oVar3);
                                            }
                                        } else {
                                            E9 = E9;
                                            eVar = eVar;
                                            E9 = E9;
                                            eVar = eVar;
                                        }
                                        oVar3 = oVar3.f26479m;
                                        E9 = E9;
                                        eVar = eVar;
                                    }
                                    if (i3 == 1) {
                                        E9 = E9;
                                        eVar = eVar;
                                    } else {
                                        E9 = E9;
                                        eVar = eVar;
                                    }
                                }
                            }
                            E9 = e(eVar);
                        }
                    }
                    oVar2 = oVar2.f26478l;
                }
            }
            fT = fT.x();
            oVar2 = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [Q0.C0, Q0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [x6.j] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [q0.o] */
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
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void x(Q0.C0 c9, p194x6.j jVar) {
        Q0.C0765b0 c0765b0;
        p137q0.o oVar = (p137q0.o) c9;
        if (!oVar.f26475h.f26487u) {
            N0.a.b("visitAncestors called on an unattached node");
        }
        p137q0.o oVar2 = oVar.f26475h.f26478l;
        Q0.F fT = t(c9);
        while (fT != null) {
            if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                while (oVar2 != null) {
                    if ((oVar2.j & 262144) != 0) {
                        ?? E9 = oVar2;
                        ?? eVar = 0;
                        while (E9 != 0) {
                            boolean zBooleanValue = true;
                            if (E9 instanceof Q0.C0) {
                                Q0.C0 c10 = (Q0.C0) E9;
                                if (kotlin.jvm.internal.m.a(c9.g(), c10.g()) && c9.getClass() == c10.getClass()) {
                                    zBooleanValue = ((java.lang.Boolean) jVar.invoke(c10)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((E9.j & 262144) != 0) && (E9 instanceof Q0.AbstractC0776j)) {
                                    p137q0.o oVar3 = ((Q0.AbstractC0776j) E9).f8443w;
                                    int i3 = 0;
                                    while (oVar3 != null) {
                                        if ((oVar3.j & 262144) != 0) {
                                            E9 = E9;
                                            eVar = eVar;
                                            i3++;
                                            if (i3 == 1) {
                                                E9 = E9;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E9 = oVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p038e0.e(new p137q0.o[16]);
                                                }
                                                if (E9 != 0) {
                                                    eVar.c(E9);
                                                    E9 = 0;
                                                }
                                                eVar.c(oVar3);
                                            }
                                        } else {
                                            E9 = E9;
                                            eVar = eVar;
                                            E9 = E9;
                                            eVar = eVar;
                                        }
                                        oVar3 = oVar3.f26479m;
                                        E9 = E9;
                                        eVar = eVar;
                                    }
                                    if (i3 == 1) {
                                        E9 = E9;
                                        eVar = eVar;
                                    } else {
                                        E9 = E9;
                                        eVar = eVar;
                                    }
                                }
                            }
                            E9 = e(eVar);
                        }
                    }
                    oVar2 = oVar2.f26478l;
                }
            }
            fT = fT.x();
            oVar2 = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [Q0.C0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [x6.j] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void y(Q0.C0 c9, p194x6.j jVar) {
        p137q0.o oVar = (p137q0.o) c9;
        if (!oVar.f26475h.f26487u) {
            N0.a.b("visitSubtreeIf called on an unattached node");
        }
        p038e0.e eVar = new p038e0.e(new p137q0.o[16]);
        p137q0.o oVar2 = oVar.f26475h;
        p137q0.o oVar3 = oVar2.f26479m;
        if (oVar3 == null) {
            b(eVar, oVar2);
        } else {
            eVar.c(oVar3);
        }
        while (true) {
            int i3 = eVar.j;
            if (i3 == 0) {
                return;
            }
            p137q0.o oVar4 = (p137q0.o) eVar.m(i3 - 1);
            if ((oVar4.f26477k & 262144) != 0) {
                p137q0.o oVar5 = oVar4;
                while (true) {
                    if (oVar5 != null && oVar5.f26487u) {
                        if ((oVar5.j & 262144) != 0) {
                            ?? E9 = oVar5;
                            ?? eVar2 = 0;
                            while (E9 != 0) {
                                if (E9 instanceof Q0.C0) {
                                    Q0.C0 c10 = (Q0.C0) E9;
                                    Q0.B0 b9 = (kotlin.jvm.internal.m.a(c9.g(), c10.g()) && c9.getClass() == c10.getClass()) ? (Q0.B0) jVar.invoke(c10) : Q0.B0.f8207h;
                                    if (b9 != Q0.B0.j) {
                                        if (b9 == Q0.B0.f8208i) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E9.j & 262144) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                                    p137q0.o oVar6 = ((Q0.AbstractC0776j) E9).f8443w;
                                    int i9 = 0;
                                    E9 = E9;
                                    eVar2 = eVar2;
                                    while (oVar6 != null) {
                                        if ((oVar6.j & 262144) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                eVar2 = eVar2;
                                                E9 = oVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new p038e0.e(new p137q0.o[16]);
                                                }
                                                if (E9 != 0) {
                                                    eVar2.c(E9);
                                                    E9 = 0;
                                                }
                                                eVar2.c(oVar6);
                                            }
                                        }
                                        oVar6 = oVar6.f26479m;
                                        E9 = E9;
                                        eVar2 = eVar2;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                E9 = e(eVar2);
                            }
                        }
                        oVar5 = oVar5.f26479m;
                    }
                }
            }
            b(eVar, oVar4);
        }
    }
}
