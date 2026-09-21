package p203z0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p203z0.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p203z0.a f32127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j1.l f32128i;
    public F3.C0371k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public F3.C0371k f32129k;

    public b() {
        p113n1.d dVar = p203z0.c.f32130a;
        p113n1.n nVar = p113n1.n.f25566h;
        p203z0.e eVar = p203z0.e.f32131a;
        p203z0.a aVar = new p203z0.a();
        aVar.f32123a = dVar;
        aVar.f32124b = nVar;
        aVar.f32125c = eVar;
        aVar.f32126d = 0L;
        this.f32127h = aVar;
        this.f32128i = new j1.l(this);
    }

    public static F3.C0371k a(p203z0.b bVar, long j, p203z0.c cVar, float f9, int i3) {
        F3.C0371k c0371kF = bVar.f(cVar);
        if (f9 != 1.0f) {
            j = p188x0.C3098s.c(j, p188x0.C3098s.e(j) * f9);
        }
        if (!p188x0.C3098s.d(p188x0.z.c(((android.graphics.Paint) c0371kF.f3601b).getColor()), j)) {
            c0371kF.j(j);
        }
        if (((android.graphics.Shader) c0371kF.f3602c) != null) {
            c0371kF.n(null);
        }
        if (!kotlin.jvm.internal.m.a((p188x0.C3092l) c0371kF.f3603d, null)) {
            c0371kF.k(null);
        }
        if (c0371kF.f3600a != i3) {
            c0371kF.i(i3);
        }
        if (((android.graphics.Paint) c0371kF.f3601b).isFilterBitmap()) {
            return c0371kF;
        }
        c0371kF.l(1);
        return c0371kF;
    }

    @Override // p203z0.d
    public final void A0(p188x0.AbstractC3095o abstractC3095o, long j, long j9, float f9, p203z0.c cVar, int i3) {
        int i9 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        this.f32127h.f32125c.h(java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat(i10), java.lang.Float.intBitsToFloat((int) (j9 >> 32)) + java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat((int) (4294967295L & j9)) + java.lang.Float.intBitsToFloat(i10), b(abstractC3095o, cVar, f9, null, i3, 1));
    }

    @Override // p203z0.d
    public final void B(long j, long j9, long j10, float f9, int i3) {
        p188x0.InterfaceC3097q interfaceC3097q = this.f32127h.f32125c;
        F3.C0371k c0371kG = this.f32129k;
        if (c0371kG == null) {
            c0371kG = p188x0.z.g();
            c0371kG.r(1);
            this.f32129k = c0371kG;
        }
        if (!p188x0.C3098s.d(p188x0.z.c(((android.graphics.Paint) c0371kG.f3601b).getColor()), j)) {
            c0371kG.j(j);
        }
        if (((android.graphics.Shader) c0371kG.f3602c) != null) {
            c0371kG.n(null);
        }
        if (!kotlin.jvm.internal.m.a((p188x0.C3092l) c0371kG.f3603d, null)) {
            c0371kG.k(null);
        }
        if (c0371kG.f3600a != 3) {
            c0371kG.i(3);
        }
        android.graphics.Paint paint = (android.graphics.Paint) c0371kG.f3601b;
        if (paint.getStrokeWidth() != f9) {
            c0371kG.q(f9);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((android.graphics.Paint) c0371kG.f3601b).setStrokeMiter(4.0f);
        }
        if (c0371kG.e() != i3) {
            c0371kG.o(i3);
        }
        if (c0371kG.f() != 0) {
            c0371kG.p(0);
        }
        if (!kotlin.jvm.internal.m.a((p188x0.C3089i) c0371kG.f3604e, null)) {
            c0371kG.m(null);
        }
        if (!paint.isFilterBitmap()) {
            c0371kG.l(1);
        }
        interfaceC3097q.c(j9, j10, c0371kG);
    }

    @Override // p203z0.d
    public final void O(long j, long j9, long j10, long j11, p203z0.c cVar, float f9) {
        int i3 = (int) (j9 >> 32);
        int i9 = (int) (j9 & 4294967295L);
        this.f32127h.f32125c.g(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat((int) (j10 >> 32)) + java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat((int) (j10 & 4294967295L)) + java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat((int) (j11 >> 32)), java.lang.Float.intBitsToFloat((int) (j11 & 4294967295L)), a(this, j, cVar, f9, 3));
    }

    @Override // p113n1.c
    public final float S() {
        return this.f32127h.f32123a.S();
    }

    @Override // p203z0.d
    public final void W(p188x0.C3086f c3086f, long j, long j9, long j10, long j11, float f9, p188x0.C3092l c3092l, int i3) {
        this.f32127h.f32125c.d(c3086f, j, j9, j10, j11, b(null, p203z0.f.f32132b, f9, c3092l, 3, i3));
    }

    public final F3.C0371k b(p188x0.AbstractC3095o abstractC3095o, p203z0.c cVar, float f9, p188x0.C3092l c3092l, int i3, int i9) {
        F3.C0371k c0371kF = f(cVar);
        if (abstractC3095o != null) {
            abstractC3095o.a(f9, d(), c0371kF);
        } else {
            if (((android.graphics.Shader) c0371kF.f3602c) != null) {
                c0371kF.n(null);
            }
            long jC = p188x0.z.c(((android.graphics.Paint) c0371kF.f3601b).getColor());
            long j = p188x0.C3098s.f31123b;
            if (!p188x0.C3098s.d(jC, j)) {
                c0371kF.j(j);
            }
            if (((android.graphics.Paint) c0371kF.f3601b).getAlpha() / 255.0f != f9) {
                c0371kF.h(f9);
            }
        }
        if (!kotlin.jvm.internal.m.a((p188x0.C3092l) c0371kF.f3603d, c3092l)) {
            c0371kF.k(c3092l);
        }
        if (c0371kF.f3600a != i3) {
            c0371kF.i(i3);
        }
        if (((android.graphics.Paint) c0371kF.f3601b).isFilterBitmap() == i9) {
            return c0371kF;
        }
        c0371kF.l(i9);
        return c0371kF;
    }

    public final void c(p188x0.C3086f c3086f, p188x0.C3092l c3092l) {
        this.f32127h.f32125c.q(c3086f, b(null, p203z0.f.f32132b, 1.0f, c3092l, 3, 1));
    }

    @Override // p203z0.d
    public final j1.l d0() {
        return this.f32128i;
    }

    @Override // p203z0.d
    public final void e(long j, long j9, long j10, float f9, p203z0.c cVar, int i3) {
        int i9 = (int) (j9 >> 32);
        int i10 = (int) (j9 & 4294967295L);
        this.f32127h.f32125c.h(java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat(i10), java.lang.Float.intBitsToFloat((int) (j10 >> 32)) + java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat((int) (4294967295L & j10)) + java.lang.Float.intBitsToFloat(i10), a(this, j, cVar, f9, i3));
    }

    public final F3.C0371k f(p203z0.c cVar) {
        if (kotlin.jvm.internal.m.a(cVar, p203z0.f.f32132b)) {
            F3.C0371k c0371k = this.j;
            if (c0371k != null) {
                return c0371k;
            }
            F3.C0371k c0371kG = p188x0.z.g();
            c0371kG.r(0);
            this.j = c0371kG;
            return c0371kG;
        }
        if (!(cVar instanceof p203z0.g)) {
            throw new I3.b();
        }
        F3.C0371k c0371kG2 = this.f32129k;
        if (c0371kG2 == null) {
            c0371kG2 = p188x0.z.g();
            c0371kG2.r(1);
            this.f32129k = c0371kG2;
        }
        android.graphics.Paint paint = (android.graphics.Paint) c0371kG2.f3601b;
        float strokeWidth = paint.getStrokeWidth();
        p203z0.g gVar = (p203z0.g) cVar;
        float f9 = gVar.f32133b;
        if (strokeWidth != f9) {
            c0371kG2.q(f9);
        }
        int iE = c0371kG2.e();
        int i3 = gVar.f32135d;
        if (iE != i3) {
            c0371kG2.o(i3);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f10 = gVar.f32134c;
        if (strokeMiter != f10) {
            ((android.graphics.Paint) c0371kG2.f3601b).setStrokeMiter(f10);
        }
        int iF = c0371kG2.f();
        int i9 = gVar.f32136e;
        if (iF != i9) {
            c0371kG2.p(i9);
        }
        p188x0.C3089i c3089i = (p188x0.C3089i) c0371kG2.f3604e;
        p188x0.C3089i c3089i2 = gVar.f32137f;
        if (!kotlin.jvm.internal.m.a(c3089i, c3089i2)) {
            c0371kG2.m(c3089i2);
        }
        return c0371kG2;
    }

    @Override // p113n1.c
    public final float getDensity() {
        return this.f32127h.f32123a.getDensity();
    }

    @Override // p203z0.d
    public final p113n1.n getLayoutDirection() {
        return this.f32127h.f32124b;
    }

    @Override // p203z0.d
    public final void l0(p188x0.J j, float f9, long j9, float f10) {
        this.f32127h.f32125c.j(f9, j9, b(j, p203z0.f.f32132b, f10, null, 3, 1));
    }

    @Override // p203z0.d
    public final void u0(long j, float f9, long j9, p203z0.c cVar) {
        this.f32127h.f32125c.j(f9, j9, a(this, j, cVar, 1.0f, 3));
    }

    @Override // p203z0.d
    public final void v(p188x0.C3088h c3088h, p188x0.AbstractC3095o abstractC3095o, float f9, p203z0.c cVar, int i3) {
        this.f32127h.f32125c.o(c3088h, b(abstractC3095o, cVar, f9, null, i3, 1));
    }

    @Override // p203z0.d
    public final void w0(p188x0.C3088h c3088h, long j, float f9, p203z0.c cVar) {
        this.f32127h.f32125c.o(c3088h, a(this, j, cVar, f9, 3));
    }

    @Override // p203z0.d
    public final void y(long j, float f9, float f10, long j9, long j10, p203z0.g gVar) {
        int i3 = (int) (j9 >> 32);
        int i9 = (int) (j9 & 4294967295L);
        this.f32127h.f32125c.s(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i9), java.lang.Float.intBitsToFloat((int) (j10 >> 32)) + java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat((int) (j10 & 4294967295L)) + java.lang.Float.intBitsToFloat(i9), f9, f10, a(this, j, gVar, 1.0f, 3));
    }
}
