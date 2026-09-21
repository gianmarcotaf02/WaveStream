package p188x0;

/* JADX INFO: renamed from: x0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3088h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f31111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.graphics.RectF f31112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f31113c;

    public C3088h(android.graphics.Path path) {
        this.f31111a = path;
    }

    public static void a(p188x0.C3088h c3088h, p188x0.C3088h c3088h2) {
        c3088h.getClass();
        c3088h.f31111a.addPath(c3088h2.f31111a, java.lang.Float.intBitsToFloat((int) 0), java.lang.Float.intBitsToFloat((int) 0));
    }

    public static void b(p188x0.C3088h c3088h, p181w0.c cVar) {
        p188x0.I[] iArr = p188x0.I.f31051h;
        if (c3088h.f31112b == null) {
            c3088h.f31112b = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = c3088h.f31112b;
        kotlin.jvm.internal.m.b(rectF);
        float f9 = cVar.f29753d;
        rectF.set(cVar.f29750a, cVar.f29751b, cVar.f29752c, f9);
        if (c3088h.f31113c == null) {
            c3088h.f31113c = new float[8];
        }
        float[] fArr = c3088h.f31113c;
        kotlin.jvm.internal.m.b(fArr);
        long j = cVar.f29754e;
        fArr[0] = java.lang.Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        long j9 = cVar.f29755f;
        fArr[2] = java.lang.Float.intBitsToFloat((int) (j9 >> 32));
        fArr[3] = java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L));
        long j10 = cVar.g;
        fArr[4] = java.lang.Float.intBitsToFloat((int) (j10 >> 32));
        fArr[5] = java.lang.Float.intBitsToFloat((int) (j10 & 4294967295L));
        long j11 = cVar.f29756h;
        fArr[6] = java.lang.Float.intBitsToFloat((int) (j11 >> 32));
        fArr[7] = java.lang.Float.intBitsToFloat((int) (j11 & 4294967295L));
        android.graphics.RectF rectF2 = c3088h.f31112b;
        kotlin.jvm.internal.m.b(rectF2);
        float[] fArr2 = c3088h.f31113c;
        kotlin.jvm.internal.m.b(fArr2);
        c3088h.f31111a.addRoundRect(rectF2, fArr2, android.graphics.Path.Direction.CCW);
    }

    public final p181w0.b c() {
        if (this.f31112b == null) {
            this.f31112b = new android.graphics.RectF();
        }
        android.graphics.RectF rectF = this.f31112b;
        kotlin.jvm.internal.m.b(rectF);
        this.f31111a.computeBounds(rectF, true);
        return new p181w0.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(p188x0.C3088h c3088h, p188x0.C3088h c3088h2, int i3) {
        android.graphics.Path.Op op;
        if (i3 == 0) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (i3 == 1) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (i3 == 4) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i3 == 2 ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        }
        if (!(c3088h instanceof p188x0.C3088h)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path = c3088h.f31111a;
        if (c3088h2 instanceof p188x0.C3088h) {
            return this.f31111a.op(path, c3088h2.f31111a, op);
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void e() {
        this.f31111a.reset();
    }
}
