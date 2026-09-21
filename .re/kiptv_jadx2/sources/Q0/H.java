package Q0;

import androidx.compose.ui.node.NodeCoordinator;
import com.google.common.util.concurrent.AbstractC1903s;
import p188x0.AbstractC3095o;
import p188x0.C3086f;
import p188x0.C3088h;
import p188x0.C3092l;
import p188x0.InterfaceC3097q;

public final class H implements p203z0.d {

    public final p203z0.b f8266h = new p203z0.b();

    public InterfaceC0779m f8267i;

    @Override
    public final void A0(AbstractC3095o abstractC3095o, long j, long j9, float f9, p203z0.c cVar, int i3) {
        this.f8266h.A0(abstractC3095o, j, j9, f9, cVar, i3);
    }

    @Override
    public final void B(long j, long j9, long j10, float f9, int i3) {
        this.f8266h.B(j, j9, j10, f9, i3);
    }

    @Override
    public final long G(float f9) {
        return this.f8266h.G(f9);
    }

    @Override
    public final float K(int i3) {
        return this.f8266h.K(i3);
    }

    @Override
    public final float N(float f9) {
        return f9 / this.f8266h.getDensity();
    }

    @Override
    public final void O(long j, long j9, long j10, long j11, p203z0.c cVar, float f9) {
        this.f8266h.O(j, j9, j10, j11, cVar, f9);
    }

    @Override
    public final float S() {
        return this.f8266h.S();
    }

    @Override
    public final void W(C3086f c3086f, long j, long j9, long j10, long j11, float f9, C3092l c3092l, int i3) {
        this.f8266h.W(c3086f, j, j9, j10, j11, f9, c3092l, i3);
    }

    @Override
    public final float Y(float f9) {
        return this.f8266h.getDensity() * f9;
    }

    public final void a() {
        p203z0.b bVar = this.f8266h;
        InterfaceC3097q interfaceC3097qJ = bVar.f32128i.j();
        InterfaceC0775i interfaceC0775i = this.f8267i;
        if (interfaceC0775i == null) {
            throw p121o0.p.h("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        p137q0.o oVar = (p137q0.o) interfaceC0775i;
        p137q0.o oVarE = oVar.f26475h.f26479m;
        if (oVarE != null && (oVarE.f26477k & 4) != 0) {
            while (true) {
                if (oVarE != null) {
                    int i3 = oVarE.j;
                    if ((i3 & 2) == 0) {
                        if ((i3 & 4) != 0) {
                            break;
                        } else {
                            oVarE = oVarE.f26479m;
                        }
                    }
                }
                oVarE = null;
                break;
            }
        } else {
            oVarE = null;
            break;
        }
        if (oVarE == null) {
            NodeCoordinator nodeCoordinatorR = AbstractC0777k.r(interfaceC0775i, 4);
            if (nodeCoordinatorR.U0() == oVar.f26475h) {
                nodeCoordinatorR = nodeCoordinatorR.f15862w;
                kotlin.jvm.internal.m.b(nodeCoordinatorR);
            }
            nodeCoordinatorR.j1(interfaceC3097qJ, (A0.d) bVar.f32128i.j);
            return;
        }
        p038e0.e eVar = null;
        while (oVarE != null) {
            if (oVarE instanceof InterfaceC0779m) {
                InterfaceC0779m interfaceC0779m = (InterfaceC0779m) oVarE;
                A0.d dVar = (A0.d) bVar.f32128i.j;
                NodeCoordinator nodeCoordinatorR2 = AbstractC0777k.r(interfaceC0779m, 4);
                long jK = AbstractC1903s.K(nodeCoordinatorR2.j);
                F f9 = nodeCoordinatorR2.f15861v;
                f9.getClass();
                I.a(f9).getSharedDrawScope().b(interfaceC3097qJ, jK, nodeCoordinatorR2, interfaceC0779m, dVar);
            } else if ((oVarE.j & 4) != 0 && (oVarE instanceof AbstractC0776j)) {
                int i9 = 0;
                for (p137q0.o oVar2 = ((AbstractC0776j) oVarE).f8443w; oVar2 != null; oVar2 = oVar2.f26479m) {
                    if ((oVar2.j & 4) != 0) {
                        i9++;
                        if (i9 == 1) {
                            oVarE = oVar2;
                        } else {
                            if (eVar == null) {
                                eVar = new p038e0.e(new p137q0.o[16]);
                            }
                            if (oVarE != null) {
                                eVar.c(oVarE);
                                oVarE = null;
                            }
                            eVar.c(oVar2);
                        }
                    }
                }
                if (i9 == 1) {
                }
            }
            oVarE = AbstractC0777k.e(eVar);
        }
    }

    public final void b(InterfaceC3097q interfaceC3097q, long j, NodeCoordinator nodeCoordinator, InterfaceC0779m interfaceC0779m, A0.d dVar) {
        InterfaceC0779m interfaceC0779m2 = this.f8267i;
        this.f8267i = interfaceC0779m;
        p113n1.n nVar = nodeCoordinator.f15861v.H;
        p203z0.b bVar = this.f8266h;
        j1.l lVar = bVar.f32128i;
        p203z0.a aVar = ((p203z0.b) lVar.f23900k).f32127h;
        p113n1.c cVar = aVar.f32123a;
        p113n1.n nVar2 = aVar.f32124b;
        InterfaceC3097q interfaceC3097qJ = lVar.j();
        j1.l lVar2 = bVar.f32128i;
        long jQ = lVar2.q();
        A0.d dVar2 = (A0.d) lVar2.j;
        lVar2.x(nodeCoordinator);
        lVar2.z(nVar);
        lVar2.w(interfaceC3097q);
        lVar2.A(j);
        lVar2.j = dVar;
        interfaceC3097q.e();
        try {
            interfaceC0779m.T(this);
            interfaceC3097q.p();
            lVar2.x(cVar);
            lVar2.z(nVar2);
            lVar2.w(interfaceC3097qJ);
            lVar2.A(jQ);
            lVar2.j = dVar2;
            this.f8267i = interfaceC0779m2;
        } catch (Throwable th) {
            interfaceC3097q.p();
            lVar2.x(cVar);
            lVar2.z(nVar2);
            lVar2.w(interfaceC3097qJ);
            lVar2.A(jQ);
            lVar2.j = dVar2;
            throw th;
        }
    }

    public final void c(AbstractC3095o abstractC3095o, long j, long j9, long j10, float f9, p203z0.c cVar) {
        p203z0.b bVar = this.f8266h;
        int i3 = (int) (j >> 32);
        int i9 = (int) (j & 4294967295L);
        bVar.f32127h.f32125c.g(Float.intBitsToFloat(i3), Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j9 >> 32)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j9 & 4294967295L)) + Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), bVar.b(abstractC3095o, cVar, f9, null, 3, 1));
    }

    @Override
    public final long d() {
        return this.f8266h.d();
    }

    @Override
    public final j1.l d0() {
        return this.f8266h.f32128i;
    }

    @Override
    public final void e(long j, long j9, long j10, float f9, p203z0.c cVar, int i3) {
        this.f8266h.e(j, j9, j10, f9, cVar, i3);
    }

    @Override
    public final float getDensity() {
        return this.f8266h.getDensity();
    }

    @Override
    public final p113n1.n getLayoutDirection() {
        return this.f8266h.f32127h.f32124b;
    }

    @Override
    public final int k0(float f9) {
        return this.f8266h.k0(f9);
    }

    @Override
    public final long l(float f9) {
        return this.f8266h.l(f9);
    }

    @Override
    public final void l0(p188x0.J j, float f9, long j9, float f10) {
        this.f8266h.l0(j, f9, j9, f10);
    }

    @Override
    public final long m(long j) {
        return this.f8266h.m(j);
    }

    @Override
    public final long m0() {
        return this.f8266h.m0();
    }

    @Override
    public final long o0(long j) {
        return this.f8266h.o0(j);
    }

    @Override
    public final float s0(long j) {
        return this.f8266h.s0(j);
    }

    @Override
    public final float t(long j) {
        return this.f8266h.t(j);
    }

    @Override
    public final void u0(long j, float f9, long j9, p203z0.c cVar) {
        this.f8266h.u0(j, f9, j9, cVar);
    }

    @Override
    public final void v(C3088h c3088h, AbstractC3095o abstractC3095o, float f9, p203z0.c cVar, int i3) {
        this.f8266h.v(c3088h, abstractC3095o, f9, cVar, i3);
    }

    @Override
    public final void w0(C3088h c3088h, long j, float f9, p203z0.c cVar) {
        this.f8266h.w0(c3088h, j, f9, cVar);
    }

    @Override
    public final void y(long j, float f9, float f10, long j9, long j10, p203z0.g gVar) {
        this.f8266h.y(j, f9, f10, j9, j10, gVar);
    }
}
