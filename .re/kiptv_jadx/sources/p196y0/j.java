package p196y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p196y0.s f31761a = new p196y0.s(0.31006f, 0.31616f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p196y0.s f31762b = new p196y0.s(0.34567f, 0.3585f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p196y0.s f31763c = new p196y0.s(0.32168f, 0.33767f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p196y0.s f31764d = new p196y0.s(0.31271f, 0.32902f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f31765e = {0.964212f, 1.0f, 0.825188f};

    public static p196y0.c a(p196y0.c cVar) {
        p196y0.s sVar = f31762b;
        p196y0.a aVar = p196y0.a.f31722b;
        if (p196y0.b.a(cVar.f31730b, p196y0.b.f31724a)) {
            p196y0.q qVar = (p196y0.q) cVar;
            p196y0.s sVar2 = qVar.f31779d;
            if (!d(sVar2, sVar)) {
                float[] fArrG = g(c(aVar.f31723a, sVar2.a(), sVar.a()), qVar.f31783i);
                return new p196y0.q(qVar.f31729a, qVar.f31782h, sVar, fArrG, qVar.f31784k, qVar.f31787n, qVar.f31780e, qVar.f31781f, qVar.g, -1);
            }
        }
        return cVar;
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = (((((f11 * f14) + ((f10 * f13) + (f9 * f12))) - (f12 * f13)) - (f10 * f11)) - (f9 * f14)) * 0.5f;
        return f15 < 0.0f ? -f15 : f15;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrF = f(fArr);
        float f9 = fArr4[0];
        float f10 = fArr[0] * f9;
        float f11 = fArr4[1];
        float f12 = fArr[1] * f11;
        float f13 = fArr4[2];
        return g(fArrF, new float[]{f10, f12, fArr[2] * f13, fArr[3] * f9, fArr[4] * f11, fArr[5] * f13, f9 * fArr[6], f11 * fArr[7], f13 * fArr[8]});
    }

    public static final boolean d(p196y0.s sVar, p196y0.s sVar2) {
        if (sVar == sVar2) {
            return true;
        }
        return java.lang.Math.abs(sVar.f31797a - sVar2.f31797a) < 0.001f && java.lang.Math.abs(sVar.f31798b - sVar2.f31798b) < 0.001f;
    }

    public static final p196y0.g e(p196y0.c cVar, p196y0.c cVar2) {
        if (cVar == cVar2) {
            return new p196y0.e(cVar, cVar, 1);
        }
        long j = p196y0.b.f31724a;
        return (p196y0.b.a(cVar.f31730b, j) && p196y0.b.a(cVar2.f31730b, j)) ? new p196y0.f((p196y0.q) cVar, (p196y0.q) cVar2) : new p196y0.g(cVar, cVar2, 0);
    }

    public static final float[] f(float[] fArr) {
        float f9 = fArr[0];
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f11 * f20) + (f10 * f19) + (f9 * f18);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f18 / f21;
        fArr2[1] = f19 / f21;
        fArr2[2] = f20 / f21;
        fArr2[3] = ((f11 * f16) - (f10 * f17)) / f21;
        fArr2[4] = ((f17 * f9) - (f11 * f15)) / f21;
        fArr2[5] = ((f15 * f10) - (f16 * f9)) / f21;
        fArr2[6] = ((f10 * f14) - (f11 * f13)) / f21;
        fArr2[7] = ((f11 * f12) - (f14 * f9)) / f21;
        fArr2[8] = ((f9 * f13) - (f10 * f12)) / f21;
        return fArr2;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f9 = fArr[0] * fArr2[0];
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = fArr[6];
        float f13 = fArr2[2];
        fArr3[0] = (f12 * f13) + (f10 * f11) + f9;
        float f14 = fArr[1];
        float f15 = fArr2[0];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = f17 * f13;
        fArr3[1] = f18 + (f11 * f16) + (f14 * f15);
        float f19 = fArr[2] * f15;
        float f20 = fArr[5];
        float f21 = (fArr2[1] * f20) + f19;
        float f22 = fArr[8];
        fArr3[2] = (f13 * f22) + f21;
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = (f10 * f25) + f24;
        float f27 = fArr2[5];
        fArr3[3] = (f12 * f27) + f26;
        float f28 = fArr[1];
        float f29 = fArr2[3];
        float f30 = f16 * f25;
        fArr3[4] = (f17 * f27) + f30 + (f28 * f29);
        float f31 = fArr[2];
        float f32 = f27 * f22;
        fArr3[5] = f32 + (f20 * fArr2[4]) + (f29 * f31);
        float f33 = f23 * fArr2[6];
        float f34 = fArr[3];
        float f35 = fArr2[7];
        float f36 = (f34 * f35) + f33;
        float f37 = fArr2[8];
        fArr3[6] = (f12 * f37) + f36;
        float f38 = fArr2[6];
        float f39 = f17 * f37;
        fArr3[7] = f39 + (fArr[4] * f35) + (f28 * f38);
        float f40 = f22 * f37;
        fArr3[8] = f40 + (fArr[5] * fArr2[7]) + (f31 * f38);
        return fArr3;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f9 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        fArr2[0] = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f9);
        fArr2[1] = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f9);
        fArr2[2] = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f9);
        return fArr2;
    }
}
