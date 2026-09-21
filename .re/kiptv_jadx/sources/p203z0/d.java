package p203z0;

/* JADX INFO: loaded from: classes.dex */
public interface d extends p113n1.c {
    static long P(long j, long j9) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static /* synthetic */ void U(p203z0.d dVar, p188x0.J j, float f9, long j9, float f10, int i3) {
        if ((i3 & 8) != 0) {
            f10 = 1.0f;
        }
        dVar.l0(j, f9, j9, f10);
    }

    static /* synthetic */ void p0(p203z0.d dVar, p188x0.AbstractC3095o abstractC3095o, long j, long j9, float f9, p203z0.c cVar, int i3) {
        if ((i3 & 2) != 0) {
            j = 0;
        }
        long j10 = j;
        dVar.A0(abstractC3095o, j10, (i3 & 4) != 0 ? P(dVar.d(), j10) : j9, (i3 & 8) != 0 ? 1.0f : f9, (i3 & 16) != 0 ? p203z0.f.f32132b : cVar, (i3 & 64) != 0 ? 3 : 6);
    }

    static /* synthetic */ void q(p203z0.d dVar, p188x0.C3088h c3088h, p188x0.AbstractC3095o abstractC3095o, float f9, p203z0.g gVar, int i3) {
        if ((i3 & 4) != 0) {
            f9 = 1.0f;
        }
        float f10 = f9;
        p203z0.c cVar = gVar;
        if ((i3 & 8) != 0) {
            cVar = p203z0.f.f32132b;
        }
        dVar.v(c3088h, abstractC3095o, f10, cVar, (i3 & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void r(p203z0.d dVar, long j, float f9, long j9, p203z0.g gVar, int i3) {
        if ((i3 & 4) != 0) {
            j9 = dVar.m0();
        }
        long j10 = j9;
        p203z0.c cVar = gVar;
        if ((i3 & 16) != 0) {
            cVar = p203z0.f.f32132b;
        }
        dVar.u0(j, f9, j10, cVar);
    }

    static void s(Q0.H h9, p188x0.AbstractC3095o abstractC3095o, long j, long j9, long j10, p203z0.c cVar, int i3) {
        if ((i3 & 2) != 0) {
            j = 0;
        }
        long j11 = j;
        h9.c(abstractC3095o, j11, (i3 & 4) != 0 ? P(h9.f8266h.d(), j11) : j9, j10, 1.0f, (i3 & 32) != 0 ? p203z0.f.f32132b : cVar);
    }

    static /* synthetic */ void u(p203z0.d dVar, long j, long j9, long j10, float f9, int i3) {
        long j11 = (i3 & 2) != 0 ? 0L : j9;
        dVar.e(j, j11, (i3 & 4) != 0 ? P(dVar.d(), j11) : j10, (i3 & 8) != 0 ? 1.0f : f9, p203z0.f.f32132b, (i3 & 64) != 0 ? 3 : 0);
    }

    static void x(p203z0.d dVar, p188x0.C3086f c3086f, long j, long j9, long j10, float f9, p188x0.C3092l c3092l, int i3, int i9) {
        dVar.W(c3086f, (i9 & 2) != 0 ? 0L : j, j9, 0L, (i9 & 16) != 0 ? j9 : j10, (i9 & 32) != 0 ? 1.0f : f9, (i9 & 128) != 0 ? null : c3092l, (i9 & 512) != 0 ? 1 : i3);
    }

    void A0(p188x0.AbstractC3095o abstractC3095o, long j, long j9, float f9, p203z0.c cVar, int i3);

    void B(long j, long j9, long j10, float f9, int i3);

    void O(long j, long j9, long j10, long j11, p203z0.c cVar, float f9);

    void W(p188x0.C3086f c3086f, long j, long j9, long j10, long j11, float f9, p188x0.C3092l c3092l, int i3);

    default long d() {
        return d0().q();
    }

    j1.l d0();

    void e(long j, long j9, long j10, float f9, p203z0.c cVar, int i3);

    p113n1.n getLayoutDirection();

    void l0(p188x0.J j, float f9, long j9, float f10);

    default long m0() {
        return com.google.common.util.concurrent.AbstractC1903s.w(d0().q());
    }

    void u0(long j, float f9, long j9, p203z0.c cVar);

    void v(p188x0.C3088h c3088h, p188x0.AbstractC3095o abstractC3095o, float f9, p203z0.c cVar, int i3);

    void w0(p188x0.C3088h c3088h, long j, float f9, p203z0.c cVar);

    void y(long j, float f9, float f10, long j9, long j10, p203z0.g gVar);
}
