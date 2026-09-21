package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p137q0.o f11091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q0.F f11093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.semantics.SemanticsConfiguration f11094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Y0.p f11096f;
    public final int g;

    public p(p137q0.o oVar, boolean z6, Q0.F f9, androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        this.f11091a = oVar;
        this.f11092b = z6;
        this.f11093c = f9;
        this.f11094d = semanticsConfiguration;
        this.g = f9.f8242i;
    }

    public static /* synthetic */ java.util.List j(int i3, Y0.p pVar) {
        return pVar.i((i3 & 1) != 0 ? !pVar.f11092b : false, (i3 & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final p181w0.b a(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        ?? E9;
        Y0.p pVarL = l();
        if (pVarL == null) {
            return p181w0.b.f29745e;
        }
        p137q0.o oVar = pVarL.f11093c.f8232N.f8391f;
        if ((oVar.f26477k & 8) == 0) {
            E9 = 0;
            break;
        }
        loop0: while (true) {
            if (oVar != null) {
                if ((oVar.j & 8) != 0) {
                    E9 = oVar;
                    ?? eVar = 0;
                    while (E9 != 0) {
                        if (E9 instanceof Q0.x0) {
                            if (((Q0.x0) E9).c()) {
                                break loop0;
                            }
                        } else if ((E9.j & 8) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                            p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                            int i3 = 0;
                            while (oVar2 != null) {
                                if ((oVar2.j & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        E9 = E9;
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
                                    E9 = E9;
                                    eVar = eVar;
                                }
                                oVar2 = oVar2.f26479m;
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
                        E9 = Q0.AbstractC0777k.e(eVar);
                    }
                }
                if ((oVar.f26477k & 8) != 0) {
                    oVar = oVar.f26479m;
                }
            }
            E9 = 0;
            break;
        }
        Q0.x0 x0Var = (Q0.x0) E9;
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorR = x0Var != null ? Q0.AbstractC0777k.r(x0Var, 8) : null;
        return nodeCoordinatorR == null ? pVarL.a(nodeCoordinator) : nodeCoordinatorR.J(nodeCoordinator, true);
    }

    public final Y0.p b(Y0.i iVar, p194x6.j jVar) {
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = new androidx.compose.ui.semantics.SemanticsConfiguration();
        semanticsConfiguration.j = false;
        semanticsConfiguration.f15962k = false;
        jVar.invoke(semanticsConfiguration);
        Y0.p pVar = new Y0.p(new Y0.o(jVar), false, new Q0.F(true, this.g + (iVar != null ? 1000000000 : 2000000000)), semanticsConfiguration);
        pVar.f11095e = true;
        pVar.f11096f = this;
        return pVar;
    }

    public final void c(Q0.F f9, java.util.ArrayList arrayList) {
        p038e0.e eVarB = f9.B();
        java.lang.Object[] objArr = eVarB.f21324h;
        int i3 = eVarB.j;
        for (int i9 = 0; i9 < i3; i9++) {
            Q0.F f10 = (Q0.F) objArr[i9];
            if (f10.K() && !f10.f8240Y) {
                if (f10.f8232N.d(8)) {
                    arrayList.add(Y0.s.a(f10, this.f11092b));
                } else {
                    c(f10, arrayList);
                }
            }
        }
    }

    public final androidx.compose.ui.node.NodeCoordinator d() {
        if (!this.f11095e) {
            Q0.x0 x0VarF = f();
            return x0VarF != null ? Q0.AbstractC0777k.r(x0VarF, 8) : this.f11093c.f8232N.f8388c;
        }
        Y0.p pVarL = l();
        if (pVarL != null) {
            return pVarL.d();
        }
        return null;
    }

    public final void e(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            Y0.p pVar = (Y0.p) arrayList.get(size2);
            if (pVar.n()) {
                arrayList2.add(pVar);
            } else if (!pVar.f11094d.f15962k) {
                pVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [q0.o] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [e0.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final Q0.x0 f() {
        ?? E9;
        boolean z6 = this.f11094d.j;
        Q0.F f9 = this.f11093c;
        ?? r9 = 0;
        r9 = 0;
        r9 = 0;
        r9 = 0;
        if (!z6) {
            p137q0.o oVar = f9.f8232N.f8391f;
            if ((oVar.f26477k & 8) != 0) {
                loop3: while (oVar != null) {
                    if ((oVar.j & 8) != 0) {
                        E9 = oVar;
                        ?? eVar = 0;
                        while (true) {
                            if (E9 != 0) {
                                if (E9 instanceof Q0.x0) {
                                    if (((Q0.x0) E9).c()) {
                                        r9 = E9;
                                    }
                                } else if ((E9.j & 8) != 0 && (E9 instanceof Q0.AbstractC0776j)) {
                                    p137q0.o oVar2 = ((Q0.AbstractC0776j) E9).f8443w;
                                    int i3 = 0;
                                    while (oVar2 != null) {
                                        if ((oVar2.j & 8) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                E9 = E9;
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
                                            E9 = E9;
                                            eVar = eVar;
                                        }
                                        oVar2 = oVar2.f26479m;
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
                                E9 = Q0.AbstractC0777k.e(eVar);
                            }
                        }
                    }
                    if ((oVar.f26477k & 8) == 0) {
                        break;
                    }
                    oVar = oVar.f26479m;
                }
            }
        } else {
            p137q0.o oVar3 = f9.f8232N.f8391f;
            if ((oVar3.f26477k & 8) != 0) {
                E9 = 0;
                while (oVar3 != null) {
                    if ((oVar3.j & 8) != 0) {
                        ?? E10 = oVar3;
                        ?? eVar2 = 0;
                        while (E10 != 0) {
                            if (E10 instanceof Q0.x0) {
                                Q0.x0 x0Var = (Q0.x0) E10;
                                if (x0Var.c()) {
                                    if (x0Var.x0()) {
                                        return x0Var;
                                    }
                                    if (E9 == 0) {
                                        E9 = x0Var;
                                    }
                                }
                            } else if ((E10.j & 8) != 0 && (E10 instanceof Q0.AbstractC0776j)) {
                                p137q0.o oVar4 = ((Q0.AbstractC0776j) E10).f8443w;
                                int i9 = 0;
                                while (oVar4 != null) {
                                    if ((oVar4.j & 8) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            E10 = E10;
                                            eVar2 = eVar2;
                                            eVar2 = eVar2;
                                            E10 = oVar4;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new p038e0.e(new p137q0.o[16]);
                                            }
                                            if (E10 != 0) {
                                                eVar2.c(E10);
                                                E10 = 0;
                                            }
                                            eVar2.c(oVar4);
                                        }
                                    } else {
                                        E10 = E10;
                                        eVar2 = eVar2;
                                    }
                                    oVar4 = oVar4.f26479m;
                                    E10 = E10;
                                    eVar2 = eVar2;
                                }
                                if (i9 == 1) {
                                    E10 = E10;
                                    eVar2 = eVar2;
                                } else {
                                    E10 = E10;
                                    eVar2 = eVar2;
                                }
                            }
                            E10 = Q0.AbstractC0777k.e(eVar2);
                        }
                    }
                    if ((oVar3.f26477k & 8) == 0) {
                        break;
                    }
                    oVar3 = oVar3.f26479m;
                    E9 = E9;
                }
                r9 = E9;
            }
        }
        return (Q0.x0) r9;
    }

    public final p181w0.b g() {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorD = d();
        if (nodeCoordinatorD != null) {
            if (!nodeCoordinatorD.U0().f26487u) {
                nodeCoordinatorD = null;
            }
            if (nodeCoordinatorD != null) {
                return O0.AbstractC0735y.h(nodeCoordinatorD).J(nodeCoordinatorD, true);
            }
        }
        return p181w0.b.f29745e;
    }

    public final p181w0.b h() {
        androidx.compose.ui.node.NodeCoordinator nodeCoordinatorD = d();
        if (nodeCoordinatorD != null) {
            if (!nodeCoordinatorD.U0().f26487u) {
                nodeCoordinatorD = null;
            }
            if (nodeCoordinatorD != null) {
                return O0.AbstractC0735y.f(nodeCoordinatorD, true);
            }
        }
        return p181w0.b.f29745e;
    }

    public final java.util.List i(boolean z6, boolean z9) {
        if (!z6 && this.f11094d.f15962k) {
            return p078i6.w.f23205h;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!n()) {
            return q(arrayList, z9);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final androidx.compose.ui.semantics.SemanticsConfiguration k() {
        boolean zN = n();
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = this.f11094d;
        if (!zN) {
            return semanticsConfiguration;
        }
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfigurationE = semanticsConfiguration.e();
        p(new java.util.ArrayList(), semanticsConfigurationE);
        return semanticsConfigurationE;
    }

    public final Y0.p l() {
        Q0.F fX;
        Y0.p pVar = this.f11096f;
        if (pVar != null) {
            return pVar;
        }
        Q0.F f9 = this.f11093c;
        boolean z6 = this.f11092b;
        if (!z6) {
            fX = null;
            break;
        }
        fX = f9.x();
        while (true) {
            if (fX == null) {
                fX = null;
                break;
            }
            androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfigurationZ = fX.z();
            if (semanticsConfigurationZ != null && semanticsConfigurationZ.j) {
                break;
            }
            fX = fX.x();
        }
        if (fX == null) {
            for (Q0.F fX2 = f9.x(); fX2 != null; fX2 = fX2.x()) {
                if (fX2.f8232N.d(8)) {
                    fX = fX2;
                }
            }
            fX = null;
        }
        if (fX == null) {
            return null;
        }
        return Y0.s.a(fX, z6);
    }

    public final androidx.compose.ui.semantics.SemanticsConfiguration m() {
        return this.f11094d;
    }

    public final boolean n() {
        return this.f11092b && this.f11094d.j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean o() {
        if (this.f11095e || !j(4, this).isEmpty()) {
            return false;
        }
        Q0.F fX = this.f11093c.x();
        while (fX != null) {
            androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfigurationZ = fX.z();
            if (semanticsConfigurationZ != null && semanticsConfigurationZ.j) {
                if (fX == null) {
                    return true;
                }
                return false;
            }
            fX = fX.x();
        }
        fX = null;
        if (fX == null) {
            return true;
        }
        return false;
    }

    public final void p(java.util.ArrayList arrayList, androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration) {
        if (this.f11094d.f15962k) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            Y0.p pVar = (Y0.p) arrayList.get(size2);
            if (!pVar.n()) {
                semanticsConfiguration.o(pVar.f11094d);
                pVar.p(arrayList, semanticsConfiguration);
            }
        }
    }

    public final java.util.List q(java.util.ArrayList arrayList, boolean z6) {
        if (this.f11095e) {
            return p078i6.w.f23205h;
        }
        c(this.f11093c, arrayList);
        if (z6) {
            Y0.w wVar = Y0.t.y;
            androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = this.f11094d;
            p136q.H h9 = semanticsConfiguration.f15960h;
            java.lang.Object objG = h9.g(wVar);
            if (objG == null) {
                objG = null;
            }
            Y0.i iVar = (Y0.i) objG;
            if (iVar != null && semanticsConfiguration.j && !arrayList.isEmpty()) {
                arrayList.add(b(iVar, new A0.b(15, iVar)));
            }
            Y0.w wVar2 = Y0.t.f11119a;
            if (h9.c(wVar2) && !arrayList.isEmpty() && semanticsConfiguration.j) {
                java.lang.Object objG2 = h9.g(wVar2);
                if (objG2 == null) {
                    objG2 = null;
                }
                java.util.List list = (java.util.List) objG2;
                java.lang.String str = list != null ? (java.lang.String) p078i6.o.j1(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new Y0.n(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
