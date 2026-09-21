package p203z0;

import Q0.H;
import com.google.common.util.concurrent.AbstractC1903s;
import j1.l;
import p113n1.c;
import p113n1.n;
import p188x0.AbstractC3095o;
import p188x0.C3086f;
import p188x0.C3088h;
import p188x0.C3092l;
import p188x0.J;

public interface d extends c {
    static long P(long j, long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static void U(d dVar, J j, float f9, long j9, float f10, int i3) {
        if ((i3 & 8) != 0) {
            f10 = 1.0f;
        }
        dVar.l0(j, f9, j9, f10);
    }

    static void p0(d dVar, AbstractC3095o abstractC3095o, long j, long j9, float f9, c cVar, int i3) {
        if ((i3 & 2) != 0) {
            j = 0;
        }
        long j10 = j;
        dVar.A0(abstractC3095o, j10, (i3 & 4) != 0 ? P(dVar.d(), j10) : j9, (i3 & 8) != 0 ? 1.0f : f9, (i3 & 16) != 0 ? f.f32132b : cVar, (i3 & 64) != 0 ? 3 : 6);
    }

    static void q(d dVar, C3088h c3088h, AbstractC3095o abstractC3095o, float f9, g gVar, int i3) {
        if ((i3 & 4) != 0) {
            f9 = 1.0f;
        }
        float f10 = f9;
        c cVar = gVar;
        if ((i3 & 8) != 0) {
            cVar = f.f32132b;
        }
        dVar.v(c3088h, abstractC3095o, f10, cVar, (i3 & 32) != 0 ? 3 : 0);
    }

    static void r(d dVar, long j, float f9, long j9, g gVar, int i3) {
        if ((i3 & 4) != 0) {
            j9 = dVar.m0();
        }
        long j10 = j9;
        c cVar = gVar;
        if ((i3 & 16) != 0) {
            cVar = f.f32132b;
        }
        dVar.u0(j, f9, j10, cVar);
    }

    static void s(H h9, AbstractC3095o abstractC3095o, long j, long j9, long j10, c cVar, int i3) {
        if ((i3 & 2) != 0) {
            j = 0;
        }
        long j11 = j;
        h9.c(abstractC3095o, j11, (i3 & 4) != 0 ? P(h9.f8266h.d(), j11) : j9, j10, 1.0f, (i3 & 32) != 0 ? f.f32132b : cVar);
    }

    static void u(d dVar, long j, long j9, long j10, float f9, int i3) {
        long j11 = (i3 & 2) != 0 ? 0L : j9;
        dVar.e(j, j11, (i3 & 4) != 0 ? P(dVar.d(), j11) : j10, (i3 & 8) != 0 ? 1.0f : f9, f.f32132b, (i3 & 64) != 0 ? 3 : 0);
    }

    static void x(d dVar, C3086f c3086f, long j, long j9, long j10, float f9, C3092l c3092l, int i3, int i9) {
        dVar.W(c3086f, (i9 & 2) != 0 ? 0L : j, j9, 0L, (i9 & 16) != 0 ? j9 : j10, (i9 & 32) != 0 ? 1.0f : f9, (i9 & 128) != 0 ? null : c3092l, (i9 & 512) != 0 ? 1 : i3);
    }

    void A0(AbstractC3095o abstractC3095o, long j, long j9, float f9, c cVar, int i3);

    void B(long j, long j9, long j10, float f9, int i3);

    void O(long j, long j9, long j10, long j11, c cVar, float f9);

    void W(C3086f c3086f, long j, long j9, long j10, long j11, float f9, C3092l c3092l, int i3);

    default long d() {
        return d0().q();
    }

    l d0();

    void e(long j, long j9, long j10, float f9, c cVar, int i3);

    n getLayoutDirection();

    void l0(J j, float f9, long j9, float f10);

    default long m0() {
        return AbstractC1903s.w(d0().q());
    }

    void u0(long j, float f9, long j9, c cVar);

    void v(C3088h c3088h, AbstractC3095o abstractC3095o, float f9, c cVar, int i3);

    void w0(C3088h c3088h, long j, float f9, c cVar);

    void y(long j, float f9, float f10, long j9, long j10, g gVar);
}
