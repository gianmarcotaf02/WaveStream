package J0;

import A8.m;
import Q0.AbstractC0776j;
import Q0.AbstractC0777k;
import Q0.C0;
import Q0.C0765b0;
import Q0.F;
import S7.A;
import com.google.common.util.concurrent.P;
import kotlin.jvm.internal.o;
import p113n1.r;

public final class d {

    public i f5980a;

    public i f5981b;

    public o f5982c = new m(2, this);

    public A f5983d;

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j9, p117n6.c cVar) {
        b bVar;
        int i3;
        i iVar;
        i iVar2;
        C0 c9;
        C0765b0 c0765b0;
        long j10;
        C0 c10;
        C0765b0 c0765b1;
        ?? E9;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i9 = bVar.j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.j = i9 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        b bVar2 = bVar;
        Object objH0 = bVar2.f5976h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = bVar2.j;
        if (i10 == 0) {
            P.u0(objH0);
            i iVar3 = this.f5980a;
            int i11 = 262144;
            if (iVar3 == null || !iVar3.f26487u) {
                i3 = 262144;
                iVar = null;
            } else {
                if (!iVar3.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                p137q0.o oVar = iVar3.f26475h.f26478l;
                F fT = AbstractC0777k.t(iVar3);
                loop0: while (true) {
                    if (fT == null) {
                        i3 = i11;
                        c10 = null;
                        break;
                    }
                    if ((fT.f8232N.f8391f.f26477k & i11) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & i11) != 0) {
                                ?? r14 = oVar;
                                ?? eVar = 0;
                                while (r14 != 0) {
                                    if (r14 instanceof C0) {
                                        c10 = (C0) r14;
                                        i3 = i11;
                                        if (kotlin.jvm.internal.m.a(iVar3.g(), c10.g()) && i.class == c10.getClass()) {
                                            break loop0;
                                        }
                                    } else {
                                        i3 = i11;
                                        if ((r14.j & i3) != 0 && (r14 instanceof AbstractC0776j)) {
                                            p137q0.o oVar2 = ((AbstractC0776j) r14).f8443w;
                                            int i12 = 0;
                                            while (oVar2 != null) {
                                                if ((oVar2.j & i3) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        E9 = r14;
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
                                                    E9 = r14;
                                                    eVar = eVar;
                                                }
                                                oVar2 = oVar2.f26479m;
                                                E9 = E9;
                                                eVar = eVar;
                                            }
                                            if (i12 == 1) {
                                                E9 = r14;
                                                eVar = eVar;
                                            }
                                        }
                                        i11 = i3;
                                        r14 = E9;
                                        eVar = eVar;
                                    }
                                    E9 = r14;
                                    eVar = eVar;
                                    E9 = AbstractC0777k.e(eVar);
                                    i11 = i3;
                                    r14 = E9;
                                    eVar = eVar;
                                }
                            }
                            oVar = oVar.f26478l;
                            i11 = i11;
                        }
                    }
                    int i13 = i11;
                    fT = fT.x();
                    oVar = (fT == null || (c0765b1 = fT.f8232N) == null) ? null : c0765b1.f8390e;
                    i11 = i13;
                }
                iVar = (i) c10;
            }
            if (iVar == null) {
                i iVar4 = this.f5981b;
                if (iVar4 != null) {
                    bVar2.j = 1;
                    objH0 = iVar4.h0(j, j9, bVar2);
                } else {
                    j10 = 0;
                }
            } else {
                i iVar5 = this.f5980a;
                if (iVar5 == null || !iVar5.f26487u) {
                    iVar2 = null;
                } else {
                    if (!iVar5.f26475h.f26487u) {
                        N0.a.b("visitAncestors called on an unattached node");
                    }
                    p137q0.o oVar3 = iVar5.f26475h.f26478l;
                    F fT2 = AbstractC0777k.t(iVar5);
                    loop3: while (true) {
                        if (fT2 == null) {
                            c9 = null;
                            break;
                        }
                        if ((fT2.f8232N.f8391f.f26477k & i3) != 0) {
                            while (oVar3 != null) {
                                if ((oVar3.j & i3) != 0) {
                                    ?? E10 = oVar3;
                                    ?? eVar2 = 0;
                                    while (E10 != 0) {
                                        if (E10 instanceof C0) {
                                            C0 c11 = (C0) E10;
                                            if (kotlin.jvm.internal.m.a(iVar5.g(), c11.g()) && i.class == c11.getClass()) {
                                                c9 = c11;
                                                break loop3;
                                            }
                                        } else if ((E10.j & i3) != 0 && (E10 instanceof AbstractC0776j)) {
                                            p137q0.o oVar4 = ((AbstractC0776j) E10).f8443w;
                                            int i14 = 0;
                                            while (oVar4 != null) {
                                                if ((oVar4.j & i3) != 0) {
                                                    i14++;
                                                    if (i14 == 1) {
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
                                            if (i14 == 1) {
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
                                oVar3 = oVar3.f26478l;
                            }
                        }
                        fT2 = fT2.x();
                        oVar3 = (fT2 == null || (c0765b0 = fT2.f8232N) == null) ? null : c0765b0.f8390e;
                    }
                    iVar2 = (i) c9;
                }
                if (iVar2 != null) {
                    bVar2.j = 2;
                    objH0 = iVar2.h0(j, j9, bVar2);
                } else {
                    j10 = 0;
                }
            }
        } else if (i10 == 1) {
            P.u0(objH0);
            j10 = ((r) objH0).f25573a;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(objH0);
            j10 = ((r) objH0).f25573a;
        }
        return new r(j10);
    }

    public final Object b(long j, p117n6.c cVar) {
        c cVar2;
        long j9;
        C0765b0 c0765b0;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i3 = cVar2.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.j = i3 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objI = cVar2.f5978h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = cVar2.j;
        if (i9 == 0) {
            P.u0(objI);
            i iVar = this.f5980a;
            i iVar2 = null;
            C0 c9 = null;
            iVar2 = null;
            if (iVar != null && iVar.f26487u) {
                if (!iVar.f26475h.f26487u) {
                    N0.a.b("visitAncestors called on an unattached node");
                }
                p137q0.o oVar = iVar.f26475h.f26478l;
                F fT = AbstractC0777k.t(iVar);
                loop0: while (fT != null) {
                    if ((fT.f8232N.f8391f.f26477k & 262144) != 0) {
                        while (oVar != null) {
                            if ((oVar.j & 262144) != 0) {
                                ?? eVar = 0;
                                ?? E9 = oVar;
                                while (E9 != 0) {
                                    if (E9 instanceof C0) {
                                        C0 c10 = (C0) E9;
                                        if (kotlin.jvm.internal.m.a(iVar.g(), c10.g()) && i.class == c10.getClass()) {
                                            c9 = c10;
                                            break loop0;
                                        }
                                    } else if ((E9.j & 262144) != 0 && (E9 instanceof AbstractC0776j)) {
                                        p137q0.o oVar2 = ((AbstractC0776j) E9).f8443w;
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
                iVar2 = (i) c9;
            }
            if (iVar2 != null) {
                cVar2.j = 1;
                objI = iVar2.i(j, cVar2);
                if (objI == aVar) {
                    return aVar;
                }
            } else {
                j9 = 0;
            }
            return new r(j9);
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P.u0(objI);
        j9 = ((r) objI).f25573a;
        return new r(j9);
    }

    public final A c() {
        A a2 = (A) this.f5982c.invoke();
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
