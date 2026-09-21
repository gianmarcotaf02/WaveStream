package p176v1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p176v1.k f29139k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f29141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f29142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f29145f;
    public final float[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f29146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f29147i;
    public final float j;

    static {
        float[] fArr = p176v1.b.f29116c;
        float fI = (float) ((((double) p176v1.b.i()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = p176v1.b.f29114a;
        float f9 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f9;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f9);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f9 * fArr5[0]);
        float f17 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) java.lang.Math.exp(((-fI) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d4 = fExp;
        if (d4 > 1.0d) {
            fExp = 1.0f;
        } else if (d4 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * fExp) + 1.0f) - fExp, (((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp};
        float f18 = 1.0f / ((5.0f * fI) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float fCbrt = (0.1f * f20 * f20 * ((float) java.lang.Math.cbrt(((double) fI) * 5.0d))) + (f19 * fI);
        float fI2 = p176v1.b.i() / fArr[1];
        double d6 = fI2;
        float fSqrt = ((float) java.lang.Math.sqrt(d6)) + 1.48f;
        float fPow = 0.725f / ((float) java.lang.Math.pow(d6, 0.2d));
        float[] fArr7 = {(float) java.lang.Math.pow(((double) ((fArr6[0] * fCbrt) * f14)) / 100.0d, 0.42d), (float) java.lang.Math.pow(((double) ((fArr6[1] * fCbrt) * f15)) / 100.0d, 0.42d), (float) java.lang.Math.pow(((double) ((fArr6[2] * fCbrt) * f16)) / 100.0d, 0.42d)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f29139k = new p176v1.k(fI2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f17, 1.0f, fArr6, fCbrt, (float) java.lang.Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public k(float f9, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f29145f = f9;
        this.f29140a = f10;
        this.f29141b = f11;
        this.f29142c = f12;
        this.f29143d = f13;
        this.f29144e = f14;
        this.g = fArr;
        this.f29146h = f15;
        this.f29147i = f16;
        this.j = f17;
    }
}
