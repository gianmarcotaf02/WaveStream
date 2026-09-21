package p188x0;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.m;
import p181w0.b;
import p181w0.c;

public final class C3088h {

    public final Path f31111a;

    public RectF f31112b;

    public float[] f31113c;

    public C3088h(Path path) {
        this.f31111a = path;
    }

    public static void a(C3088h c3088h, C3088h c3088h2) {
        c3088h.getClass();
        c3088h.f31111a.addPath(c3088h2.f31111a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    public static void b(C3088h c3088h, c cVar) {
        I[] iArr = I.f31051h;
        if (c3088h.f31112b == null) {
            c3088h.f31112b = new RectF();
        }
        RectF rectF = c3088h.f31112b;
        m.b(rectF);
        float f9 = cVar.f29753d;
        rectF.set(cVar.f29750a, cVar.f29751b, cVar.f29752c, f9);
        if (c3088h.f31113c == null) {
            c3088h.f31113c = new float[8];
        }
        float[] fArr = c3088h.f31113c;
        m.b(fArr);
        long j = cVar.f29754e;
        fArr[0] = Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j & 4294967295L));
        long j9 = cVar.f29755f;
        fArr[2] = Float.intBitsToFloat((int) (j9 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j9 & 4294967295L));
        long j10 = cVar.g;
        fArr[4] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        long j11 = cVar.f29756h;
        fArr[6] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        RectF rectF2 = c3088h.f31112b;
        m.b(rectF2);
        float[] fArr2 = c3088h.f31113c;
        m.b(fArr2);
        c3088h.f31111a.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final b c() {
        if (this.f31112b == null) {
            this.f31112b = new RectF();
        }
        RectF rectF = this.f31112b;
        m.b(rectF);
        this.f31111a.computeBounds(rectF, true);
        return new b(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(C3088h c3088h, C3088h c3088h2, int i3) {
        Path.Op op;
        if (i3 == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i3 == 1) {
            op = Path.Op.INTERSECT;
        } else if (i3 == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i3 == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(c3088h instanceof C3088h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c3088h.f31111a;
        if (c3088h2 instanceof C3088h) {
            return this.f31111a.op(path, c3088h2.f31111a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void e() {
        this.f31111a.reset();
    }
}
