package p188x0;

/* JADX INFO: renamed from: x0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3082b implements p188x0.InterfaceC3097q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.graphics.Canvas f31097a = p188x0.AbstractC3083c.f31100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.graphics.Rect f31098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f31099c;

    @Override // p188x0.InterfaceC3097q
    public final void b(float f9, float f10) {
        this.f31097a.scale(f9, f10);
    }

    @Override // p188x0.InterfaceC3097q
    public final void c(long j, long j9, F3.C0371k c0371k) {
        this.f31097a.drawLine(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j9 >> 32)), java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)), (android.graphics.Paint) c0371k.f3601b);
    }

    @Override // p188x0.InterfaceC3097q
    public final void d(p188x0.C3086f c3086f, long j, long j9, long j10, long j11, F3.C0371k c0371k) {
        if (this.f31098b == null) {
            this.f31098b = new android.graphics.Rect();
            this.f31099c = new android.graphics.Rect();
        }
        android.graphics.Canvas canvas = this.f31097a;
        android.graphics.Bitmap bitmapJ = p188x0.z.j(c3086f);
        android.graphics.Rect rect = this.f31098b;
        kotlin.jvm.internal.m.b(rect);
        int i3 = (int) (j >> 32);
        rect.left = i3;
        int i9 = (int) (j & 4294967295L);
        rect.top = i9;
        rect.right = i3 + ((int) (j9 >> 32));
        rect.bottom = i9 + ((int) (j9 & 4294967295L));
        android.graphics.Rect rect2 = this.f31099c;
        kotlin.jvm.internal.m.b(rect2);
        int i10 = (int) (j10 >> 32);
        rect2.left = i10;
        int i11 = (int) (j10 & 4294967295L);
        rect2.top = i11;
        rect2.right = i10 + ((int) (j11 >> 32));
        rect2.bottom = i11 + ((int) (j11 & 4294967295L));
        canvas.drawBitmap(bitmapJ, rect, rect2, (android.graphics.Paint) c0371k.f3601b);
    }

    @Override // p188x0.InterfaceC3097q
    public final void e() {
        this.f31097a.save();
    }

    @Override // p188x0.InterfaceC3097q
    public final void f() {
        p188x0.z.o(this.f31097a, false);
    }

    @Override // p188x0.InterfaceC3097q
    public final void g(float f9, float f10, float f11, float f12, float f13, float f14, F3.C0371k c0371k) {
        this.f31097a.drawRoundRect(f9, f10, f11, f12, f13, f14, (android.graphics.Paint) c0371k.f3601b);
    }

    @Override // p188x0.InterfaceC3097q
    public final void h(float f9, float f10, float f11, float f12, F3.C0371k c0371k) {
        this.f31097a.drawRect(f9, f10, f11, f12, (android.graphics.Paint) c0371k.f3601b);
    }

    @Override // p188x0.InterfaceC3097q
    public final void i(float[] fArr) {
        if (p188x0.z.w(fArr)) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        p188x0.z.B(matrix, fArr);
        this.f31097a.concat(matrix);
    }

    @Override // p188x0.InterfaceC3097q
    public final void j(float f9, long j, F3.C0371k c0371k) {
        this.f31097a.drawCircle(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), f9, (android.graphics.Paint) c0371k.f3601b);
    }

    @Override // p188x0.InterfaceC3097q
    public final void k(float f9, float f10, float f11, float f12, int i3) {
        this.f31097a.clipRect(f9, f10, f11, f12, i3 == 0 ? android.graphics.Region.Op.DIFFERENCE : android.graphics.Region.Op.INTERSECT);
    }

    @Override // p188x0.InterfaceC3097q
    public final void l(float f9, float f10) {
        this.f31097a.translate(f9, f10);
    }

    @Override // p188x0.InterfaceC3097q
    public final void m() {
        this.f31097a.rotate(45.0f);
    }

    @Override // p188x0.InterfaceC3097q
    public final void n(p181w0.b bVar, F3.C0371k c0371k) {
        android.graphics.Canvas canvas = this.f31097a;
        android.graphics.Paint paint = (android.graphics.Paint) c0371k.f3601b;
        canvas.saveLayer(bVar.f29746a, bVar.f29747b, bVar.f29748c, bVar.f29749d, paint, 31);
    }

    @Override // p188x0.InterfaceC3097q
    public final void o(p188x0.C3088h c3088h, F3.C0371k c0371k) {
        android.graphics.Canvas canvas = this.f31097a;
        if (!(c3088h instanceof p188x0.C3088h)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c3088h.f31111a, (android.graphics.Paint) c0371k.f3601b);
    }

    @Override // p188x0.InterfaceC3097q
    public final void p() {
        this.f31097a.restore();
    }

    @Override // p188x0.InterfaceC3097q
    public final void q(p188x0.C3086f c3086f, F3.C0371k c0371k) {
        this.f31097a.drawBitmap(p188x0.z.j(c3086f), java.lang.Float.intBitsToFloat((int) 0), java.lang.Float.intBitsToFloat((int) 0), (android.graphics.Paint) c0371k.f3601b);
    }

    @Override // p188x0.InterfaceC3097q
    public final void r(p188x0.C3088h c3088h) {
        android.graphics.Canvas canvas = this.f31097a;
        if (!(c3088h instanceof p188x0.C3088h)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c3088h.f31111a, android.graphics.Region.Op.INTERSECT);
    }

    @Override // p188x0.InterfaceC3097q
    public final void s(float f9, float f10, float f11, float f12, float f13, float f14, F3.C0371k c0371k) {
        this.f31097a.drawArc(f9, f10, f11, f12, f13, f14, false, (android.graphics.Paint) c0371k.f3601b);
    }

    @Override // p188x0.InterfaceC3097q
    public final void t() {
        p188x0.z.o(this.f31097a, true);
    }
}
