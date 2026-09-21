package Y0;

import O0.AbstractC0735y;
import Q0.AbstractC0776j;
import Q0.AbstractC0777k;
import Q0.F;
import Q0.x0;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.ArrayList;
import java.util.List;
import p136q.H;

public final class p {

    public final p137q0.o f11091a;

    public final boolean f11092b;

    public final F f11093c;

    public final SemanticsConfiguration f11094d;

    public boolean f11095e;

    public p f11096f;
    public final int g;

    public p(p137q0.o oVar, boolean z6, F f9, SemanticsConfiguration semanticsConfiguration) {
        this.f11091a = oVar;
        this.f11092b = z6;
        this.f11093c = f9;
        this.f11094d = semanticsConfiguration;
        this.g = f9.f8242i;
    }

    public static List j(int i3, p pVar) {
        return pVar.i((i3 & 1) != 0 ? !pVar.f11092b : false, (i3 & 2) == 0);
    }

    public final p181w0.b a(NodeCoordinator nodeCoordinator) {
        ?? E9;
        p pVarL = l();
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
                        if (E9 instanceof x0) {
                            if (((x0) E9).c()) {
                                break loop0;
                            }
                        } else if ((E9.j & 8) != 0 && (E9 instanceof AbstractC0776j)) {
                            p137q0.o oVar2 = ((AbstractC0776j) E9).f8443w;
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
                        E9 = AbstractC0777k.e(eVar);
                    }
                }
                if ((oVar.f26477k & 8) != 0) {
                    oVar = oVar.f26479m;
                }
            }
            E9 = 0;
            break;
        }
        x0 x0Var = (x0) E9;
        NodeCoordinator nodeCoordinatorR = x0Var != null ? AbstractC0777k.r(x0Var, 8) : null;
        return nodeCoordinatorR == null ? pVarL.a(nodeCoordinator) : nodeCoordinatorR.J(nodeCoordinator, true);
    }

    public final p b(i iVar, p194x6.j jVar) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.j = false;
        semanticsConfiguration.f15962k = false;
        jVar.invoke(semanticsConfiguration);
        p pVar = new p(new o(jVar), false, new F(true, this.g + (iVar != null ? 1000000000 : 2000000000)), semanticsConfiguration);
        pVar.f11095e = true;
        pVar.f11096f = this;
        return pVar;
    }

    public final void c(F f9, ArrayList arrayList) {
        p038e0.e eVarB = f9.B();
        Object[] objArr = eVarB.f21324h;
        int i3 = eVarB.j;
        for (int i9 = 0; i9 < i3; i9++) {
            F f10 = (F) objArr[i9];
            if (f10.K() && !f10.f8240Y) {
                if (f10.f8232N.d(8)) {
                    arrayList.add(s.a(f10, this.f11092b));
                } else {
                    c(f10, arrayList);
                }
            }
        }
    }

    public final NodeCoordinator d() {
        if (!this.f11095e) {
            x0 x0VarF = f();
            return x0VarF != null ? AbstractC0777k.r(x0VarF, 8) : this.f11093c.f8232N.f8388c;
        }
        p pVarL = l();
        if (pVarL != null) {
            return pVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (pVar.n()) {
                arrayList2.add(pVar);
            } else if (!pVar.f11094d.f15962k) {
                pVar.e(arrayList, arrayList2);
            }
        }
    }

    public final x0 f() {
        ?? E9;
        boolean z6 = this.f11094d.j;
        F f9 = this.f11093c;
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
                                if (E9 instanceof x0) {
                                    if (((x0) E9).c()) {
                                        r9 = E9;
                                    }
                                } else if ((E9.j & 8) != 0 && (E9 instanceof AbstractC0776j)) {
                                    p137q0.o oVar2 = ((AbstractC0776j) E9).f8443w;
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
                                E9 = AbstractC0777k.e(eVar);
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
                            if (E10 instanceof x0) {
                                x0 x0Var = (x0) E10;
                                if (x0Var.c()) {
                                    if (x0Var.x0()) {
                                        return x0Var;
                                    }
                                    if (E9 == 0) {
                                        E9 = x0Var;
                                    }
                                }
                            } else if ((E10.j & 8) != 0 && (E10 instanceof AbstractC0776j)) {
                                p137q0.o oVar4 = ((AbstractC0776j) E10).f8443w;
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
                            E10 = AbstractC0777k.e(eVar2);
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
        return (x0) r9;
    }

    public final p181w0.b g() {
        NodeCoordinator nodeCoordinatorD = d();
        if (nodeCoordinatorD != null) {
            if (!nodeCoordinatorD.U0().f26487u) {
                nodeCoordinatorD = null;
            }
            if (nodeCoordinatorD != null) {
                return AbstractC0735y.h(nodeCoordinatorD).J(nodeCoordinatorD, true);
            }
        }
        return p181w0.b.f29745e;
    }

    public final p181w0.b h() {
        NodeCoordinator nodeCoordinatorD = d();
        if (nodeCoordinatorD != null) {
            if (!nodeCoordinatorD.U0().f26487u) {
                nodeCoordinatorD = null;
            }
            if (nodeCoordinatorD != null) {
                return AbstractC0735y.f(nodeCoordinatorD, true);
            }
        }
        return p181w0.b.f29745e;
    }

    public final List i(boolean z6, boolean z9) {
        if (!z6 && this.f11094d.f15962k) {
            return p078i6.w.f23205h;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z9);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final SemanticsConfiguration k() {
        boolean zN = n();
        SemanticsConfiguration semanticsConfiguration = this.f11094d;
        if (!zN) {
            return semanticsConfiguration;
        }
        SemanticsConfiguration semanticsConfigurationE = semanticsConfiguration.e();
        p(new ArrayList(), semanticsConfigurationE);
        return semanticsConfigurationE;
    }

    public final p l() {
        F fX;
        p pVar = this.f11096f;
        if (pVar != null) {
            return pVar;
        }
        F f9 = this.f11093c;
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
            SemanticsConfiguration semanticsConfigurationZ = fX.z();
            if (semanticsConfigurationZ != null && semanticsConfigurationZ.j) {
                break;
            }
            fX = fX.x();
        }
        if (fX == null) {
            for (F fX2 = f9.x(); fX2 != null; fX2 = fX2.x()) {
                if (fX2.f8232N.d(8)) {
                    fX = fX2;
                }
            }
            fX = null;
        }
        if (fX == null) {
            return null;
        }
        return s.a(fX, z6);
    }

    public final SemanticsConfiguration m() {
        return this.f11094d;
    }

    public final boolean n() {
        return this.f11092b && this.f11094d.j;
    }

    public final boolean o() {
        if (this.f11095e || !j(4, this).isEmpty()) {
            return false;
        }
        F fX = this.f11093c.x();
        while (fX != null) {
            SemanticsConfiguration semanticsConfigurationZ = fX.z();
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

    public final void p(ArrayList arrayList, SemanticsConfiguration semanticsConfiguration) {
        if (this.f11094d.f15962k) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (!pVar.n()) {
                semanticsConfiguration.o(pVar.f11094d);
                pVar.p(arrayList, semanticsConfiguration);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z6) {
        if (this.f11095e) {
            return p078i6.w.f23205h;
        }
        c(this.f11093c, arrayList);
        if (z6) {
            w wVar = t.y;
            SemanticsConfiguration semanticsConfiguration = this.f11094d;
            H h9 = semanticsConfiguration.f15960h;
            Object objG = h9.g(wVar);
            if (objG == null) {
                objG = null;
            }
            i iVar = (i) objG;
            if (iVar != null && semanticsConfiguration.j && !arrayList.isEmpty()) {
                arrayList.add(b(iVar, new A0.b(15, iVar)));
            }
            w wVar2 = t.f11119a;
            if (h9.c(wVar2) && !arrayList.isEmpty() && semanticsConfiguration.j) {
                Object objG2 = h9.g(wVar2);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) p078i6.o.j1(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new n(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
