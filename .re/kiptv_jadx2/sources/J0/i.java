package J0;

import A8.m;
import Q0.AbstractC0776j;
import Q0.AbstractC0777k;
import Q0.C0;
import Q0.C0765b0;
import Q0.F;
import S7.C;
import com.google.common.util.concurrent.P;
import kotlin.jvm.internal.A;
import p113n1.r;
import p137q0.o;

public final class i extends o implements C0, a {

    public a f5992v;

    public d f5993w;

    public i f5994x;
    public final String y = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public i(a aVar, d dVar) {
        this.f5992v = aVar;
        this.f5993w = dVar;
    }

    @Override
    public final void F0() {
        d dVar = this.f5993w;
        dVar.f5980a = this;
        dVar.f5981b = null;
        this.f5994x = null;
        dVar.f5982c = new m(3, this);
        dVar.f5983d = B0();
    }

    @Override
    public final void G0() {
        A a2 = new A();
        AbstractC0777k.x(this, new j(a2, 0));
        i iVar = (i) ((C0) a2.f24539h);
        this.f5994x = iVar;
        d dVar = this.f5993w;
        dVar.f5981b = iVar;
        if (dVar.f5980a == this) {
            dVar.f5980a = null;
        }
    }

    @Override
    public final long H(int i3, long j) {
        C0765b0 c0765b0;
        boolean z6 = this.f26487u;
        i iVar = null;
        C0 c9 = null;
        iVar = null;
        if (z6 && z6) {
            if (!this.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            o oVar = this.f26475h.f26478l;
            F fT = AbstractC0777k.t(this);
            loop0: while (fT != null) {
                if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & 262144) != 0) {
                            ?? E9 = oVar;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof C0) {
                                    C0 c10 = (C0) E9;
                                    if (kotlin.jvm.internal.m.a(g(), c10.g()) && i.class == c10.getClass()) {
                                        c9 = c10;
                                        break loop0;
                                    }
                                } else if ((E9.j & 262144) != 0 && (E9 instanceof AbstractC0776j)) {
                                    o oVar2 = ((AbstractC0776j) E9).f8443w;
                                    int i9 = 0;
                                    E9 = E9;
                                    eVar = eVar;
                                    while (oVar2 != null) {
                                        if ((oVar2.j & 262144) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                eVar = eVar;
                                                E9 = oVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p038e0.e(new o[16]);
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
                                    if (i9 == 1) {
                                    }
                                }
                                E9 = AbstractC0777k.e(eVar);
                            }
                        }
                        oVar = oVar.f26478l;
                    }
                }
                fT = fT.x();
                oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
            }
            iVar = (i) c9;
        }
        long jH = iVar != null ? iVar.H(i3, j) : 0L;
        return p181w0.a.g(jH, this.f5992v.H(i3, p181w0.a.f(j, jH)));
    }

    public final S7.A N0() {
        i iVar;
        C0 c9;
        C0765b0 c0765b0;
        if (this.f26487u) {
            if (!this.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            o oVar = this.f26475h.f26478l;
            F fT = AbstractC0777k.t(this);
            loop0: while (true) {
                if (fT == null) {
                    c9 = null;
                    break;
                }
                if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & 262144) != 0) {
                            ?? E9 = oVar;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof C0) {
                                    c9 = (C0) E9;
                                    if (kotlin.jvm.internal.m.a(g(), c9.g()) && i.class == c9.getClass()) {
                                        break loop0;
                                    }
                                } else if ((E9.j & 262144) != 0 && (E9 instanceof AbstractC0776j)) {
                                    o oVar2 = ((AbstractC0776j) E9).f8443w;
                                    int i3 = 0;
                                    while (oVar2 != null) {
                                        if ((oVar2.j & 262144) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                E9 = E9;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E9 = oVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p038e0.e(new o[16]);
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
                        oVar = oVar.f26478l;
                    }
                }
                fT = fT.x();
                oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
            }
            iVar = (i) c9;
        } else {
            iVar = null;
        }
        S7.A aN0 = iVar != null ? iVar.N0() : null;
        if (aN0 != null && C.x(aN0)) {
            return aN0;
        }
        S7.A a2 = this.f5993w.f5983d;
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override
    public final Object g() {
        return this.y;
    }

    @Override
    public final long g0(int i3, long j, long j9) {
        C0765b0 c0765b0;
        long jG0 = this.f5992v.g0(i3, j, j9);
        boolean z6 = this.f26487u;
        C0 c9 = null;
        if (z6 && z6) {
            if (!this.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            o oVar = this.f26475h.f26478l;
            F fT = AbstractC0777k.t(this);
            loop0: while (fT != null) {
                if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & 262144) != 0) {
                            ?? E9 = oVar;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof C0) {
                                    C0 c10 = (C0) E9;
                                    if (kotlin.jvm.internal.m.a(g(), c10.g()) && i.class == c10.getClass()) {
                                        c9 = c10;
                                        break loop0;
                                    }
                                } else if ((E9.j & 262144) != 0 && (E9 instanceof AbstractC0776j)) {
                                    o oVar2 = ((AbstractC0776j) E9).f8443w;
                                    int i9 = 0;
                                    E9 = E9;
                                    eVar = eVar;
                                    while (oVar2 != null) {
                                        if ((oVar2.j & 262144) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                eVar = eVar;
                                                E9 = oVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p038e0.e(new o[16]);
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
                                    if (i9 == 1) {
                                    }
                                }
                                E9 = AbstractC0777k.e(eVar);
                            }
                        }
                        oVar = oVar.f26478l;
                    }
                }
                fT = fT.x();
                oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
            }
            c9 = (i) c9;
        }
        ?? r9 = c9;
        return p181w0.a.g(jG0, r9 != 0 ? r9.g0(i3, p181w0.a.g(j, jG0), p181w0.a.f(j9, jG0)) : 0L);
    }

    @Override
    public final Object h0(long j, long j9, p100l6.c cVar) {
        g gVar;
        long j10;
        long j11;
        long j12;
        i iVar;
        long j13;
        long j14;
        C0 c9;
        C0765b0 c0765b0;
        int i3;
        ?? r16;
        ?? E9;
        int i9;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f5988l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f5988l = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, (p117n6.c) cVar);
            }
        } else {
            gVar = new g(this, (p117n6.c) cVar);
        }
        g gVar2 = gVar;
        Object objH0 = gVar2.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = gVar2.f5988l;
        int i12 = 1;
        if (i11 == 0) {
            P.u0(objH0);
            a aVar2 = this.f5992v;
            gVar2.f5985h = j;
            gVar2.f5986i = j9;
            gVar2.f5988l = 1;
            objH0 = aVar2.h0(j, j9, gVar2);
            if (objH0 != aVar) {
                j10 = j;
                j11 = j9;
            }
            return aVar;
        }
        if (i11 == 1) {
            j11 = gVar2.f5986i;
            j10 = gVar2.f5985h;
            P.u0(objH0);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j14 = gVar2.f5985h;
            P.u0(objH0);
        }
        j13 = ((r) objH0).f25573a;
        j12 = j14;
        return new r(r.e(j12, j13));
        j12 = ((r) objH0).f25573a;
        boolean z6 = this.f26487u;
        if (!z6) {
            iVar = this.f5994x;
        } else if (z6 && z6) {
            if (!this.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            o oVar = this.f26475h.f26478l;
            F fT = AbstractC0777k.t(this);
            loop0: while (true) {
                if (fT == null) {
                    c9 = null;
                    break;
                }
                int i13 = 262144;
                if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & i13) != 0) {
                            ?? r14 = oVar;
                            ?? r17 = 0;
                            while (r14 != 0) {
                                if (r14 instanceof C0) {
                                    C0 c10 = (C0) r14;
                                    i3 = i13;
                                    if (kotlin.jvm.internal.m.a(g(), c10.g()) && i.class == c10.getClass()) {
                                        c9 = c10;
                                        break loop0;
                                    }
                                } else {
                                    i3 = i13;
                                    if ((r14.j & i3) != 0 && (r14 instanceof AbstractC0776j)) {
                                        o oVar2 = ((AbstractC0776j) r14).f8443w;
                                        int i14 = 0;
                                        while (oVar2 != null) {
                                            if ((oVar2.j & i3) != 0) {
                                                i14++;
                                                if (i14 == i12) {
                                                    E9 = r14;
                                                    r16 = r17;
                                                    E9 = oVar2;
                                                } else {
                                                    ?? eVar = r16 == 0 ? new p038e0.e(new o[16]) : r16;
                                                    if (E9 != 0) {
                                                        eVar.c(E9);
                                                        E9 = 0;
                                                    }
                                                    eVar.c(oVar2);
                                                    r16 = eVar;
                                                }
                                            } else {
                                                E9 = r14;
                                                r16 = r17;
                                            }
                                            oVar2 = oVar2.f26479m;
                                            i12 = 1;
                                            E9 = E9;
                                            r16 = r16;
                                        }
                                        E9 = r14;
                                        r16 = r17;
                                        i9 = i12;
                                        r16 = r16;
                                        if (i14 == i9) {
                                        }
                                        i13 = i3;
                                        i12 = i9;
                                        r14 = E9;
                                        r17 = r16;
                                    }
                                    E9 = AbstractC0777k.e(r16);
                                    i13 = i3;
                                    i12 = i9;
                                    r14 = E9;
                                    r17 = r16;
                                }
                                i9 = i12;
                                r16 = r17;
                                E9 = AbstractC0777k.e(r16);
                                i13 = i3;
                                i12 = i9;
                                r14 = E9;
                                r17 = r16;
                            }
                        }
                        oVar = oVar.f26478l;
                        i13 = i13;
                        i12 = i12;
                    }
                }
                int i15 = i12;
                fT = fT.x();
                oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
                i12 = i15;
            }
            iVar = (i) c9;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            long jE = r.e(j10, j12);
            long jD = r.d(j11, j12);
            gVar2.f5985h = j12;
            gVar2.f5988l = 2;
            objH0 = iVar.h0(jE, jD, gVar2);
            if (objH0 != aVar) {
                j14 = j12;
                j13 = ((r) objH0).f25573a;
                j12 = j14;
            }
            return aVar;
        }
        j13 = 0;
        return new r(r.e(j12, j13));
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(long j, p100l6.c cVar) {
        h hVar;
        long j9;
        C0765b0 c0765b0;
        long j10;
        long j11 = j;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i3 = hVar.f5991k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.f5991k = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, (p117n6.c) cVar);
            }
        } else {
            hVar = new h(this, (p117n6.c) cVar);
        }
        Object objI = hVar.f5990i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = hVar.f5991k;
        if (i9 != 0) {
            if (i9 == 1) {
                j11 = hVar.f5989h;
                P.u0(objI);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = hVar.f5989h;
                P.u0(objI);
            }
            return new r(r.e(j10, ((r) objI).f25573a));
        }
        P.u0(objI);
        boolean z6 = this.f26487u;
        i iVar = null;
        C0 c9 = null;
        iVar = null;
        if (z6 && z6) {
            if (!this.f26475h.f26487u) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            o oVar = this.f26475h.f26478l;
            F fT = AbstractC0777k.t(this);
            loop0: while (fT != null) {
                if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.j & 262144) != 0) {
                            ?? E9 = oVar;
                            ?? eVar = 0;
                            while (E9 != 0) {
                                if (E9 instanceof C0) {
                                    C0 c10 = (C0) E9;
                                    if (kotlin.jvm.internal.m.a(g(), c10.g()) && i.class == c10.getClass()) {
                                        c9 = c10;
                                        break loop0;
                                    }
                                } else if ((E9.j & 262144) != 0 && (E9 instanceof AbstractC0776j)) {
                                    o oVar2 = ((AbstractC0776j) E9).f8443w;
                                    int i10 = 0;
                                    while (oVar2 != null) {
                                        if ((oVar2.j & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                E9 = E9;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E9 = oVar2;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p038e0.e(new o[16]);
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
                        oVar = oVar.f26478l;
                    }
                }
                fT = fT.x();
                oVar = (fT == null || (c0765b0 = fT.f8232N) == null) ? null : c0765b0.f8390e;
            }
            iVar = (i) c9;
        }
        if (iVar != null) {
            hVar.f5989h = j11;
            hVar.f5991k = 1;
            objI = iVar.i(j11, hVar);
        } else {
            j9 = 0;
            a aVar2 = this.f5992v;
            long jD = r.d(j11, j9);
            hVar.f5989h = j9;
            hVar.f5991k = 2;
            objI = aVar2.i(jD, hVar);
            if (objI != aVar) {
                j10 = j9;
                return new r(r.e(j10, ((r) objI).f25573a));
            }
        }
        return aVar;
        j9 = ((r) objI).f25573a;
        a aVar3 = this.f5992v;
        long jD2 = r.d(j11, j9);
        hVar.f5989h = j9;
        hVar.f5991k = 2;
        objI = aVar3.i(jD2, hVar);
        if (objI != aVar) {
            j10 = j9;
            return new r(r.e(j10, ((r) objI).f25573a));
        }
        return aVar;
    }
}
