package p163t;

/* JADX INFO: renamed from: t.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2775t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f27681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f27682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f27683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f27684f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f27685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f27686i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f27687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f27688l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f27689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f27690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f27691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f27692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f27693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f27694r;

    public C2775t(int i3, float f9, float f10, float f11, float f12, float f13, float f14) {
        boolean z6;
        int i9;
        float f15;
        this.f27679a = f9;
        this.f27680b = f10;
        this.f27681c = f11;
        this.f27682d = f12;
        this.f27683e = f13;
        this.f27684f = f14;
        float f16 = f13 - f11;
        float f17 = f14 - f12;
        float f18 = 0.0f;
        int i10 = 1;
        boolean z9 = i3 == 1 || (i3 == 4 ? f17 > 0.0f : !(i3 != 5 || f17 >= 0.0f));
        float f19 = z9 ? -1.0f : 1.0f;
        this.f27689m = f19;
        float f20 = 1 / (f10 - f9);
        this.f27687k = f20;
        this.j = new float[101];
        boolean z10 = i3 == 3;
        if (z10 || java.lang.Math.abs(f16) < 0.001f || java.lang.Math.abs(f17) < 0.001f) {
            float fHypot = (float) java.lang.Math.hypot(f17, f16);
            this.g = fHypot;
            this.f27688l = fHypot * f20;
            this.f27693q = f16 * f20;
            this.f27694r = f17 * f20;
            this.f27690n = Float.NaN;
            this.f27691o = Float.NaN;
            z6 = true;
        } else {
            this.f27690n = f16 * f19;
            this.f27691o = f17 * (-f19);
            this.f27693q = z9 ? f13 : f11;
            this.f27694r = z9 ? f12 : f14;
            float f21 = f13 - f11;
            float f22 = f12 - f14;
            float[] fArr = p163t.AbstractC2750d.f27568i;
            float f23 = 90;
            float f24 = f22;
            float fHypot2 = 0.0f;
            float f25 = 0.0f;
            int i11 = 1;
            while (true) {
                i9 = i10;
                float f26 = f24;
                double radians = (float) java.lang.Math.toRadians((((double) i11) * 90.0d) / ((double) 90));
                float fSin = ((float) java.lang.Math.sin(radians)) * f21;
                float fCos = ((float) java.lang.Math.cos(radians)) * f22;
                f15 = f18;
                fHypot2 += (float) java.lang.Math.hypot(fSin - f25, fCos - f26);
                fArr[i11] = fHypot2;
                if (i11 == 90) {
                    break;
                }
                i11++;
                f25 = fSin;
                f18 = f15;
                f24 = fCos;
                i10 = i9;
            }
            this.g = fHypot2;
            int i12 = i9;
            while (true) {
                fArr[i12] = fArr[i12] / fHypot2;
                if (i12 == 90) {
                    break;
                } else {
                    i12++;
                }
            }
            float[] fArr2 = this.j;
            int length = fArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                float f27 = i13 / 100.0f;
                int iBinarySearch = java.util.Arrays.binarySearch(fArr, 0, 91, f27);
                if (iBinarySearch >= 0) {
                    fArr2[i13] = iBinarySearch / f23;
                } else if (iBinarySearch == -1) {
                    fArr2[i13] = f15;
                } else {
                    int i14 = -iBinarySearch;
                    int i15 = i14 - 2;
                    float f28 = i15;
                    float f29 = fArr[i15];
                    fArr2[i13] = (((f27 - f29) / (fArr[i14 - 1] - f29)) + f28) / f23;
                }
            }
            this.f27688l = this.g * this.f27687k;
            z6 = z10;
        }
        this.f27692p = z6;
    }

    public final float a() {
        float f9 = this.f27690n * this.f27686i;
        return f9 * this.f27689m * (this.f27688l / ((float) java.lang.Math.hypot(f9, (-this.f27691o) * this.f27685h)));
    }

    public final float b() {
        float f9 = this.f27690n * this.f27686i;
        float f10 = (-this.f27691o) * this.f27685h;
        return f10 * this.f27689m * (this.f27688l / ((float) java.lang.Math.hypot(f9, f10)));
    }

    public final void c(float f9) {
        float f10 = (this.f27689m == -1.0f ? this.f27680b - f9 : f9 - this.f27679a) * this.f27687k;
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            f11 = 1.0f;
            if (f10 < 1.0f) {
                float f12 = f10 * 100;
                int i3 = (int) f12;
                float[] fArr = this.j;
                float f13 = fArr[i3];
                f11 = ((fArr[i3 + 1] - f13) * (f12 - i3)) + f13;
            }
        }
        double d4 = f11 * 1.5707964f;
        this.f27685h = (float) java.lang.Math.sin(d4);
        this.f27686i = (float) java.lang.Math.cos(d4);
    }
}
