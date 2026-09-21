package p188x0;

import F3.C0371k;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.jvm.internal.m;
import p181w0.b;

public final class C3082b implements InterfaceC3097q {

    public Canvas f31097a = AbstractC3083c.f31100a;

    public Rect f31098b;

    public Rect f31099c;

    @Override
    public final void b(float f9, float f10) {
        this.f31097a.scale(f9, f10);
    }

    @Override
    public final void c(long j, long j9, C0371k c0371k) {
        this.f31097a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), (Paint) c0371k.f3601b);
    }

    @Override
    public final void d(C3086f c3086f, long j, long j9, long j10, long j11, C0371k c0371k) {
        if (this.f31098b == null) {
            this.f31098b = new Rect();
            this.f31099c = new Rect();
        }
        Canvas canvas = this.f31097a;
        Bitmap bitmapJ = z.j(c3086f);
        Rect rect = this.f31098b;
        m.b(rect);
        int i3 = (int) (j >> 32);
        rect.left = i3;
        int i9 = (int) (j & 4294967295L);
        rect.top = i9;
        rect.right = i3 + ((int) (j9 >> 32));
        rect.bottom = i9 + ((int) (j9 & 4294967295L));
        Rect rect2 = this.f31099c;
        m.b(rect2);
        int i10 = (int) (j10 >> 32);
        rect2.left = i10;
        int i11 = (int) (j10 & 4294967295L);
        rect2.top = i11;
        rect2.right = i10 + ((int) (j11 >> 32));
        rect2.bottom = i11 + ((int) (j11 & 4294967295L));
        canvas.drawBitmap(bitmapJ, rect, rect2, (Paint) c0371k.f3601b);
    }

    @Override
    public final void e() {
        this.f31097a.save();
    }

    @Override
    public final void f() {
        z.o(this.f31097a, false);
    }

    @Override
    public final void g(float f9, float f10, float f11, float f12, float f13, float f14, C0371k c0371k) {
        this.f31097a.drawRoundRect(f9, f10, f11, f12, f13, f14, (Paint) c0371k.f3601b);
    }

    @Override
    public final void h(float f9, float f10, float f11, float f12, C0371k c0371k) {
        this.f31097a.drawRect(f9, f10, f11, f12, (Paint) c0371k.f3601b);
    }

    @Override
    public final void i(float[] fArr) {
        if (z.w(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        z.B(matrix, fArr);
        this.f31097a.concat(matrix);
    }

    @Override
    public final void j(float f9, long j, C0371k c0371k) {
        this.f31097a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f9, (Paint) c0371k.f3601b);
    }

    @Override
    public final void k(float f9, float f10, float f11, float f12, int i3) {
        this.f31097a.clipRect(f9, f10, f11, f12, i3 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override
    public final void l(float f9, float f10) {
        this.f31097a.translate(f9, f10);
    }

    @Override
    public final void m() {
        this.f31097a.rotate(45.0f);
    }

    @Override
    public final void n(b bVar, C0371k c0371k) {
        Canvas canvas = this.f31097a;
        Paint paint = (Paint) c0371k.f3601b;
        canvas.saveLayer(bVar.f29746a, bVar.f29747b, bVar.f29748c, bVar.f29749d, paint, 31);
    }

    @Override
    public final void o(C3088h c3088h, C0371k c0371k) {
        Canvas canvas = this.f31097a;
        if (!(c3088h instanceof C3088h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c3088h.f31111a, (Paint) c0371k.f3601b);
    }

    @Override
    public final void p() {
        this.f31097a.restore();
    }

    @Override
    public final void q(C3086f c3086f, C0371k c0371k) {
        this.f31097a.drawBitmap(z.j(c3086f), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) c0371k.f3601b);
    }

    @Override
    public final void r(C3088h c3088h) {
        Canvas canvas = this.f31097a;
        if (!(c3088h instanceof C3088h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c3088h.f31111a, Region.Op.INTERSECT);
    }

    @Override
    public final void s(float f9, float f10, float f11, float f12, float f13, float f14, C0371k c0371k) {
        this.f31097a.drawArc(f9, f10, f11, f12, f13, f14, false, (Paint) c0371k.f3601b);
    }

    @Override
    public final void t() {
        z.o(this.f31097a, true);
    }
}
