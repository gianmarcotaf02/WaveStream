package p203z0;

import F3.C0371k;
import android.graphics.Paint;
import android.graphics.Shader;
import j1.l;
import kotlin.jvm.internal.m;
import p113n1.d;
import p113n1.n;
import p188x0.AbstractC3095o;
import p188x0.C3086f;
import p188x0.C3088h;
import p188x0.C3089i;
import p188x0.C3092l;
import p188x0.C3098s;
import p188x0.InterfaceC3097q;
import p188x0.J;
import p188x0.z;

public final class b implements d {

    public final a f32127h;

    public final l f32128i;
    public C0371k j;

    public C0371k f32129k;

    public b() {
        d dVar = c.f32130a;
        n nVar = n.f25566h;
        e eVar = e.f32131a;
        a aVar = new a();
        aVar.f32123a = dVar;
        aVar.f32124b = nVar;
        aVar.f32125c = eVar;
        aVar.f32126d = 0L;
        this.f32127h = aVar;
        this.f32128i = new l(this);
    }

    public static C0371k a(b bVar, long j, c cVar, float f9, int i3) {
        C0371k c0371kF = bVar.f(cVar);
        if (f9 != 1.0f) {
            j = C3098s.c(j, C3098s.e(j) * f9);
        }
        if (!C3098s.d(z.c(((Paint) c0371kF.f3601b).getColor()), j)) {
            c0371kF.j(j);
        }
        if (((Shader) c0371kF.f3602c) != null) {
            c0371kF.n(null);
        }
        if (!m.a((C3092l) c0371kF.f3603d, null)) {
            c0371kF.k(null);
        }
        if (c0371kF.f3600a != i3) {
            c0371kF.i(i3);
        }
        if (((Paint) c0371kF.f3601b).isFilterBitmap()) {
            return c0371kF;
        }
        c0371kF.l(1);
        return c0371kF;
    }

    @Override
    public final void A0(AbstractC3095o abstractC3095o, long j, long j9, float f9, c cVar, int i3) {
        int i9 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        this.f32127h.f32125c.h(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j9 >> 32)) + Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (4294967295L & j9)) + Float.intBitsToFloat(i10), b(abstractC3095o, cVar, f9, null, i3, 1));
    }

    @Override
    public final void B(long j, long j9, long j10, float f9, int i3) {
        InterfaceC3097q interfaceC3097q = this.f32127h.f32125c;
        C0371k c0371kG = this.f32129k;
        if (c0371kG == null) {
            c0371kG = z.g();
            c0371kG.r(1);
            this.f32129k = c0371kG;
        }
        if (!C3098s.d(z.c(((Paint) c0371kG.f3601b).getColor()), j)) {
            c0371kG.j(j);
        }
        if (((Shader) c0371kG.f3602c) != null) {
            c0371kG.n(null);
        }
        if (!m.a((C3092l) c0371kG.f3603d, null)) {
            c0371kG.k(null);
        }
        if (c0371kG.f3600a != 3) {
            c0371kG.i(3);
        }
        Paint paint = (Paint) c0371kG.f3601b;
        if (paint.getStrokeWidth() != f9) {
            c0371kG.q(f9);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) c0371kG.f3601b).setStrokeMiter(4.0f);
        }
        if (c0371kG.e() != i3) {
            c0371kG.o(i3);
        }
        if (c0371kG.f() != 0) {
            c0371kG.p(0);
        }
        if (!m.a((C3089i) c0371kG.f3604e, null)) {
            c0371kG.m(null);
        }
        if (!paint.isFilterBitmap()) {
            c0371kG.l(1);
        }
        interfaceC3097q.c(j9, j10, c0371kG);
    }

    @Override
    public final void O(long j, long j9, long j10, long j11, c cVar, float f9) {
        int i3 = (int) (j9 >> 32);
        int i9 = (int) (j9 & 4294967295L);
        this.f32127h.f32125c.g(Float.intBitsToFloat(i3), Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), a(this, j, cVar, f9, 3));
    }

    @Override
    public final float S() {
        return this.f32127h.f32123a.S();
    }

    @Override
    public final void W(C3086f c3086f, long j, long j9, long j10, long j11, float f9, C3092l c3092l, int i3) {
        this.f32127h.f32125c.d(c3086f, j, j9, j10, j11, b(null, f.f32132b, f9, c3092l, 3, i3));
    }

    public final C0371k b(AbstractC3095o abstractC3095o, c cVar, float f9, C3092l c3092l, int i3, int i9) {
        C0371k c0371kF = f(cVar);
        if (abstractC3095o != null) {
            abstractC3095o.a(f9, d(), c0371kF);
        } else {
            if (((Shader) c0371kF.f3602c) != null) {
                c0371kF.n(null);
            }
            long jC = z.c(((Paint) c0371kF.f3601b).getColor());
            long j = C3098s.f31123b;
            if (!C3098s.d(jC, j)) {
                c0371kF.j(j);
            }
            if (((Paint) c0371kF.f3601b).getAlpha() / 255.0f != f9) {
                c0371kF.h(f9);
            }
        }
        if (!m.a((C3092l) c0371kF.f3603d, c3092l)) {
            c0371kF.k(c3092l);
        }
        if (c0371kF.f3600a != i3) {
            c0371kF.i(i3);
        }
        if (((Paint) c0371kF.f3601b).isFilterBitmap() == i9) {
            return c0371kF;
        }
        c0371kF.l(i9);
        return c0371kF;
    }

    public final void c(C3086f c3086f, C3092l c3092l) {
        this.f32127h.f32125c.q(c3086f, b(null, f.f32132b, 1.0f, c3092l, 3, 1));
    }

    @Override
    public final l d0() {
        return this.f32128i;
    }

    @Override
    public final void e(long j, long j9, long j10, float f9, c cVar, int i3) {
        int i9 = (int) (j9 >> 32);
        int i10 = (int) (j9 & 4294967295L);
        this.f32127h.f32125c.h(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (4294967295L & j10)) + Float.intBitsToFloat(i10), a(this, j, cVar, f9, i3));
    }

    public final C0371k f(c cVar) {
        if (m.a(cVar, f.f32132b)) {
            C0371k c0371k = this.j;
            if (c0371k != null) {
                return c0371k;
            }
            C0371k c0371kG = z.g();
            c0371kG.r(0);
            this.j = c0371kG;
            return c0371kG;
        }
        if (!(cVar instanceof g)) {
            throw new I3.b();
        }
        C0371k c0371kG2 = this.f32129k;
        if (c0371kG2 == null) {
            c0371kG2 = z.g();
            c0371kG2.r(1);
            this.f32129k = c0371kG2;
        }
        Paint paint = (Paint) c0371kG2.f3601b;
        float strokeWidth = paint.getStrokeWidth();
        g gVar = (g) cVar;
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
            ((Paint) c0371kG2.f3601b).setStrokeMiter(f10);
        }
        int iF = c0371kG2.f();
        int i9 = gVar.f32136e;
        if (iF != i9) {
            c0371kG2.p(i9);
        }
        C3089i c3089i = (C3089i) c0371kG2.f3604e;
        C3089i c3089i2 = gVar.f32137f;
        if (!m.a(c3089i, c3089i2)) {
            c0371kG2.m(c3089i2);
        }
        return c0371kG2;
    }

    @Override
    public final float getDensity() {
        return this.f32127h.f32123a.getDensity();
    }

    @Override
    public final n getLayoutDirection() {
        return this.f32127h.f32124b;
    }

    @Override
    public final void l0(J j, float f9, long j9, float f10) {
        this.f32127h.f32125c.j(f9, j9, b(j, f.f32132b, f10, null, 3, 1));
    }

    @Override
    public final void u0(long j, float f9, long j9, c cVar) {
        this.f32127h.f32125c.j(f9, j9, a(this, j, cVar, 1.0f, 3));
    }

    @Override
    public final void v(C3088h c3088h, AbstractC3095o abstractC3095o, float f9, c cVar, int i3) {
        this.f32127h.f32125c.o(c3088h, b(abstractC3095o, cVar, f9, null, i3, 1));
    }

    @Override
    public final void w0(C3088h c3088h, long j, float f9, c cVar) {
        this.f32127h.f32125c.o(c3088h, a(this, j, cVar, f9, 3));
    }

    @Override
    public final void y(long j, float f9, float f10, long j9, long j10, g gVar) {
        int i3 = (int) (j9 >> 32);
        int i9 = (int) (j9 & 4294967295L);
        this.f32127h.f32125c.s(Float.intBitsToFloat(i3), Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i9), f9, f10, a(this, j, gVar, 1.0f, 3));
    }
}
