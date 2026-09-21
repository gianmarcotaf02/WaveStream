package Q0;

import androidx.compose.ui.node.NodeCoordinator;

public abstract class AbstractC0776j extends p137q0.o {

    public final int f8442v = g0.e(this);

    public p137q0.o f8443w;

    @Override
    public final void D0() {
        super.D0();
        for (p137q0.o oVar = this.f8443w; oVar != null; oVar = oVar.f26479m) {
            oVar.M0(this.f26481o);
            if (!oVar.f26487u) {
                oVar.D0();
            }
        }
    }

    @Override
    public final void E0() {
        for (p137q0.o oVar = this.f8443w; oVar != null; oVar = oVar.f26479m) {
            oVar.E0();
        }
        super.E0();
    }

    @Override
    public final void I0() {
        super.I0();
        for (p137q0.o oVar = this.f8443w; oVar != null; oVar = oVar.f26479m) {
            oVar.I0();
        }
    }

    @Override
    public final void J0() {
        for (p137q0.o oVar = this.f8443w; oVar != null; oVar = oVar.f26479m) {
            oVar.J0();
        }
        super.J0();
    }

    @Override
    public final void K0() {
        super.K0();
        for (p137q0.o oVar = this.f8443w; oVar != null; oVar = oVar.f26479m) {
            oVar.K0();
        }
    }

    @Override
    public final void L0(p137q0.o oVar) {
        this.f26475h = oVar;
        for (p137q0.o oVar2 = this.f8443w; oVar2 != null; oVar2 = oVar2.f26479m) {
            oVar2.L0(oVar);
        }
    }

    @Override
    public final void M0(NodeCoordinator nodeCoordinator) {
        this.f26481o = nodeCoordinator;
        for (p137q0.o oVar = this.f8443w; oVar != null; oVar = oVar.f26479m) {
            oVar.M0(nodeCoordinator);
        }
    }

    public final InterfaceC0775i N0(InterfaceC0775i interfaceC0775i) {
        p137q0.o oVar = ((p137q0.o) interfaceC0775i).f26475h;
        if (oVar != interfaceC0775i) {
            p137q0.o oVar2 = interfaceC0775i instanceof p137q0.o ? (p137q0.o) interfaceC0775i : null;
            p137q0.o oVar3 = oVar2 != null ? oVar2.f26478l : null;
            if (oVar != this.f26475h || !kotlin.jvm.internal.m.a(oVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (oVar.f26487u) {
                N0.a.b("Cannot delegate to an already attached node");
            }
            oVar.L0(this.f26475h);
            int i3 = this.j;
            int iF = g0.f(oVar);
            oVar.j = iF;
            int i9 = this.j;
            int i10 = iF & 2;
            if (i10 != 0 && (i9 & 2) != 0 && !(this instanceof InterfaceC0788w)) {
                N0.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + oVar);
            }
            oVar.f26479m = this.f8443w;
            this.f8443w = oVar;
            oVar.f26478l = this;
            P0(iF | this.j, false);
            if (this.f26487u) {
                if (i10 == 0 || (i3 & 2) != 0) {
                    M0(this.f26481o);
                } else {
                    C0765b0 c0765b0 = AbstractC0777k.t(this).f8232N;
                    this.f26475h.M0(null);
                    c0765b0.g();
                }
                oVar.D0();
                oVar.J0();
                if (!oVar.f26487u) {
                    N0.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                g0.a(oVar, -1, 1);
            }
        }
        return interfaceC0775i;
    }

    public final void O0(InterfaceC0775i interfaceC0775i) {
        p137q0.o oVar = null;
        for (p137q0.o oVar2 = this.f8443w; oVar2 != null; oVar2 = oVar2.f26479m) {
            if (oVar2 == interfaceC0775i) {
                boolean z6 = oVar2.f26487u;
                if (z6) {
                    p136q.C c9 = g0.f8437a;
                    if (!z6) {
                        N0.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    g0.a(oVar2, -1, 2);
                    oVar2.K0();
                    oVar2.E0();
                }
                oVar2.L0(oVar2);
                oVar2.f26477k = 0;
                if (oVar == null) {
                    this.f8443w = oVar2.f26479m;
                } else {
                    oVar.f26479m = oVar2.f26479m;
                }
                oVar2.f26479m = null;
                oVar2.f26478l = null;
                int i3 = this.j;
                int iF = g0.f(this);
                P0(iF, true);
                if (this.f26487u && (i3 & 2) != 0 && (iF & 2) == 0) {
                    C0765b0 c0765b0 = AbstractC0777k.t(this).f8232N;
                    this.f26475h.M0(null);
                    c0765b0.g();
                    return;
                }
                return;
            }
            oVar = oVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0775i).toString());
    }

    public final void P0(int i3, boolean z6) {
        p137q0.o oVar;
        int i9 = this.j;
        this.j = i3;
        if (i9 != i3) {
            p137q0.o oVar2 = this.f26475h;
            if (oVar2 == this) {
                this.f26477k = i3;
            }
            if (this.f26487u) {
                p137q0.o oVar3 = this;
                while (oVar3 != null) {
                    i3 |= oVar3.j;
                    oVar3.j = i3;
                    if (oVar3 == oVar2) {
                        break;
                    } else {
                        oVar3 = oVar3.f26478l;
                    }
                }
                if (z6 && oVar3 == oVar2) {
                    i3 = g0.f(oVar2);
                    oVar2.j = i3;
                }
                int i10 = i3 | ((oVar3 == null || (oVar = oVar3.f26479m) == null) ? 0 : oVar.f26477k);
                while (oVar3 != null) {
                    i10 |= oVar3.j;
                    oVar3.f26477k = i10;
                    oVar3 = oVar3.f26478l;
                }
            }
        }
    }
}
