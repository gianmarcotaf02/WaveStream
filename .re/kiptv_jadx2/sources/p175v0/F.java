package p175v0;

import F.C0352q;
import I3.b;
import K0.C0656d;
import N0.a;
import O0.InterfaceC0732v;
import P0.c;
import Q0.AbstractC0776j;
import Q0.AbstractC0777k;
import Q0.C0765b0;
import Q0.InterfaceC0774h;
import Q0.InterfaceC0775i;
import Q0.InterfaceC0787v;
import Q0.j0;
import R0.AbstractC0844q0;
import R0.C0850u;
import android.os.Trace;
import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.AbstractC1903s;
import kotlin.jvm.internal.A;
import p038e0.e;
import p137q0.o;
import p194x6.m;

public final class F extends o implements InterfaceC0774h, InterfaceC0787v, j0, c, InterfaceC0775i {

    public final boolean f29050v;

    public final m f29051w;

    public boolean f29052x;
    public boolean y;

    public final int f29053z;

    public F(int i3, m mVar, int i9) {
        i3 = (i9 & 1) != 0 ? 1 : i3;
        boolean z6 = (i9 & 2) == 0;
        mVar = (i9 & 4) != 0 ? null : mVar;
        this.f29050v = z6;
        this.f29051w = mVar;
        this.f29053z = i3;
    }

    @Override
    public final boolean C0() {
        return false;
    }

    @Override
    public final void G0() {
        int iOrdinal = S0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                n focusOwner = AbstractC0777k.u(this).getFocusOwner();
                F f9 = AbstractC2909d.f(this);
                if (f9 == null || !f9.f29050v) {
                    return;
                }
                p pVar = (p) focusOwner;
                pVar.f29080a.E();
                pVar.f29083d.a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new b();
                }
                return;
            }
        }
        p pVar2 = (p) AbstractC0777k.u(this).getFocusOwner();
        pVar2.b(8, true, false);
        if (this.f29050v) {
            pVar2.f29080a.E();
        }
        pVar2.f29083d.a();
    }

    @Override
    public final void H0() {
        if (S0().b()) {
            ((p) AbstractC0777k.u(this).getFocusOwner()).b(8, true, true);
        }
    }

    public final boolean N0(int i3) {
        int iOrdinal = AbstractC2909d.x(this, i3).ordinal();
        if (iOrdinal == 0) {
            return AbstractC2909d.y(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new b();
    }

    public final void O0(D d4, D d6) {
        C0765b0 c0765b0;
        m mVar;
        p pVar = (p) AbstractC0777k.u(this).getFocusOwner();
        F f9 = pVar.f();
        if (!d4.equals(d6) && (mVar = this.f29051w) != null) {
            mVar.invoke(d4, d6);
        }
        o oVar = this.f26475h;
        if (!oVar.f26487u) {
            a.b("visitAncestors called on an unattached node");
        }
        o oVar2 = this.f26475h;
        Q0.F fT = AbstractC0777k.t(this);
        while (fT != null) {
            if ((fT.f8232N.f8391f.f26477k & 5120) != 0) {
                while (oVar2 != null) {
                    int i3 = oVar2.j;
                    if ((i3 & 5120) != 0) {
                        if (oVar2 != oVar && (i3 & 1024) != 0) {
                            return;
                        }
                        if ((i3 & 4096) != 0) {
                            ?? E9 = oVar2;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof InterfaceC2913h) {
                                    InterfaceC2913h interfaceC2913h = (InterfaceC2913h) E9;
                                    if (f9 == pVar.f()) {
                                        interfaceC2913h.v0(d6);
                                    }
                                } else if ((E9.j & 4096) != 0 && (E9 instanceof AbstractC0776j)) {
                                    o oVar3 = ((AbstractC0776j) E9).f8443w;
                                    int i9 = 0;
                                    E9 = E9;
                                    eVar = eVar;
                                    while (oVar3 != null) {
                                        if ((oVar3.j & 4096) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                eVar = eVar;
                                                E9 = oVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new e(new o[16]);
                                                }
                                                if (E9 != 0) {
                                                    eVar.c(E9);
                                                    E9 = 0;
                                                }
                                                eVar.c(oVar3);
                                            }
                                        }
                                        oVar3 = oVar3.f26479m;
                                        E9 = E9;
                                        eVar = eVar;
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                E9 = AbstractC0777k.e(eVar);
                            }
                        }
                    }
                    oVar2 = oVar2.f26478l;
                }
            }
            fT = fT.x();
            oVar2 = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
        }
    }

    public final u P0() {
        boolean z6;
        C0765b0 c0765b0;
        u uVar = new u();
        uVar.f29091a = true;
        y yVar = y.f29103b;
        uVar.f29092b = yVar;
        uVar.f29093c = yVar;
        uVar.f29094d = yVar;
        uVar.f29095e = yVar;
        uVar.f29096f = yVar;
        uVar.g = yVar;
        uVar.f29097h = yVar;
        uVar.f29098i = yVar;
        uVar.j = t.f29089i;
        uVar.f29099k = t.j;
        uVar.f29100l = q.f29087a;
        int i3 = this.f29053z;
        if (i3 == 1) {
            z6 = true;
        } else if (i3 == 0) {
            z6 = !(((G0.a) ((G0.c) ((G0.b) AbstractC0777k.h(this, AbstractC0844q0.f8970m))).f3761a.getValue()).f3760a == 1);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z6 = false;
        }
        uVar.f29091a = z6;
        o oVar = this.f26475h;
        if (!oVar.f26487u) {
            a.b("visitAncestors called on an unattached node");
        }
        o oVar2 = this.f26475h;
        Q0.F fT = AbstractC0777k.t(this);
        loop0: while (fT != null) {
            if ((fT.f8232N.f8391f.f26477k & 3072) != 0) {
                while (oVar2 != null) {
                    int i9 = oVar2.j;
                    if ((i9 & 3072) != 0) {
                        if (oVar2 != oVar && (i9 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i9 & 2048) != 0) {
                            ?? E9 = oVar2;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof w) {
                                    ((w) E9).p(uVar);
                                } else if ((E9.j & 2048) != 0 && (E9 instanceof AbstractC0776j)) {
                                    o oVar3 = ((AbstractC0776j) E9).f8443w;
                                    int i10 = 0;
                                    while (oVar3 != null) {
                                        if ((oVar3.j & 2048) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                E9 = E9;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E9 = oVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new e(new o[16]);
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
                                        }
                                        oVar3 = oVar3.f26479m;
                                        E9 = E9;
                                        eVar = eVar;
                                    }
                                    if (i10 == 1) {
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
                    oVar2 = oVar2.f26478l;
                }
            }
            fT = fT.x();
            oVar2 = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
        }
        return uVar;
    }

    public final p181w0.b Q0(InterfaceC0732v interfaceC0732v) {
        p181w0.b bVar = P0().f29100l;
        if (bVar != q.f29087a) {
            return interfaceC0732v == null ? bVar : bVar.i(interfaceC0732v.H(AbstractC0777k.s(this), 0L));
        }
        return interfaceC0732v != null ? interfaceC0732v.J(AbstractC0777k.s(this), false) : V0.c(0L, AbstractC1903s.K(AbstractC0777k.s(this).j));
    }

    public final C0352q R0() {
        C0765b0 c0765b0;
        Object obj;
        if (!this.f26475h.f26487u) {
            a.b("visitAncestors called on an unattached node");
        }
        o oVar = this.f26475h.f26478l;
        Q0.F fT = AbstractC0777k.t(this);
        loop0: while (fT != null) {
            if ((fT.f8232N.f8391f.f26477k & 8388640) != 0) {
                while (oVar != null) {
                    int i3 = oVar.j;
                    if ((i3 & 8388640) != 0) {
                        if ((8388608 & i3) != 0) {
                            if (!(oVar instanceof C0352q)) {
                                if (oVar instanceof AbstractC0776j) {
                                    o oVar2 = null;
                                    for (o oVar3 = ((AbstractC0776j) oVar).f8443w; oVar3 != null; oVar3 = oVar3.f26479m) {
                                        if (oVar3 instanceof C0352q) {
                                            oVar2 = oVar3;
                                        }
                                    }
                                    oVar = oVar2;
                                } else {
                                    oVar = null;
                                }
                            }
                            C0352q c0352q = (C0352q) oVar;
                            if (c0352q != null) {
                                return c0352q;
                            }
                        } else if ((i3 & 32) != 0) {
                            if (oVar instanceof c) {
                                obj = oVar;
                            } else if (oVar instanceof AbstractC0776j) {
                                obj = null;
                                for (o oVar4 = ((AbstractC0776j) oVar).f8443w; oVar4 != null; oVar4 = oVar4.f26479m) {
                                    if (oVar4 instanceof c) {
                                        obj = oVar4;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            c cVar = (c) obj;
                            if (cVar != null) {
                                cVar.R().getClass();
                            }
                        }
                    }
                    oVar = oVar.f26478l;
                }
            }
            fT = fT.x();
            oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
        }
        return null;
    }

    public final D S0() {
        C0765b0 c0765b0;
        if (!this.f26487u) {
            return D.j;
        }
        F f9 = ((p) AbstractC0777k.u(this).getFocusOwner()).f();
        if (f9 == null) {
            return D.j;
        }
        if (this == f9) {
            return D.f29046h;
        }
        if (f9.f26487u) {
            if (!f9.f26475h.f26487u) {
                a.b("visitAncestors called on an unattached node");
            }
            o oVar = f9.f26475h.f26478l;
            Q0.F fT = AbstractC0777k.t(f9);
            while (fT != null) {
                if ((fT.f8232N.f8391f.f26477k & 1024) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & 1024) != 0) {
                            o oVarE = oVar;
                            e eVar = null;
                            while (oVarE != null) {
                                if (oVarE instanceof F) {
                                    if (this == ((F) oVarE)) {
                                        return D.f29047i;
                                    }
                                } else if ((oVarE.j & 1024) != 0 && (oVarE instanceof AbstractC0776j)) {
                                    int i3 = 0;
                                    for (o oVar2 = ((AbstractC0776j) oVarE).f8443w; oVar2 != null; oVar2 = oVar2.f26479m) {
                                        if ((oVar2.j & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                oVarE = oVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new e(new o[16]);
                                                }
                                                if (oVarE != null) {
                                                    eVar.c(oVarE);
                                                    oVarE = null;
                                                }
                                                eVar.c(oVar2);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                oVarE = AbstractC0777k.e(eVar);
                            }
                        }
                        oVar = oVar.f26478l;
                    }
                }
                fT = fT.x();
                oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
            }
        }
        return D.j;
    }

    public final void T0() {
        int iOrdinal = S0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new b();
                }
                return;
            }
        }
        A a2 = new A();
        AbstractC0777k.p(this, new C0656d(a2, this, 14));
        Object obj = a2.f24539h;
        if (obj == null) {
            kotlin.jvm.internal.m.k("focusProperties");
            throw null;
        }
        if (((r) obj).b()) {
            return;
        }
        ((p) AbstractC0777k.u(this).getFocusOwner()).b(8, true, true);
    }

    public final boolean U0(int i3) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return P0().f29091a ? N0(i3) : AbstractC2909d.h(this, i3, new C0850u(i3, 4));
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public final void f0() {
        T0();
    }

    @Override
    public final void C(InterfaceC0732v interfaceC0732v) {
    }
}
