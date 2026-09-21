package p176v1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f29109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f29110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f29113f;

    public a(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f29108a = f9;
        this.f29109b = f10;
        this.f29110c = f11;
        this.f29111d = f12;
        this.f29112e = f13;
        this.f29113f = f14;
    }

    public static p176v1.a a(int i3) {
        p176v1.k kVar = p176v1.k.f29139k;
        float fD = p176v1.b.d(android.graphics.Color.red(i3));
        float fD2 = p176v1.b.d(android.graphics.Color.green(i3));
        float fD3 = p176v1.b.d(android.graphics.Color.blue(i3));
        float[][] fArr = p176v1.b.f29117d;
        float[] fArr2 = fArr[0];
        float f9 = (fArr2[2] * fD3) + (fArr2[1] * fD2) + (fArr2[0] * fD);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * fD3) + (fArr3[1] * fD2) + (fArr3[0] * fD);
        float[] fArr4 = fArr[2];
        float f11 = (fD3 * fArr4[2]) + (fD2 * fArr4[1]) + (fD * fArr4[0]);
        float[][] fArr5 = p176v1.b.f29114a;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f9);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f9);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f9 * fArr8[0]);
        float[] fArr9 = kVar.g;
        float f15 = fArr9[0] * f12;
        float f16 = fArr9[1] * f13;
        float f17 = fArr9[2] * f14;
        float fAbs = java.lang.Math.abs(f15);
        float f18 = kVar.f29146h;
        float fPow = (float) java.lang.Math.pow(((double) (fAbs * f18)) / 100.0d, 0.42d);
        float fPow2 = (float) java.lang.Math.pow(((double) (java.lang.Math.abs(f16) * f18)) / 100.0d, 0.42d);
        float fPow3 = (float) java.lang.Math.pow(((double) (java.lang.Math.abs(f17) * f18)) / 100.0d, 0.42d);
        float fSignum = ((java.lang.Math.signum(f15) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((java.lang.Math.signum(f16) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((java.lang.Math.signum(f17) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d4 = fSignum3;
        float f19 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d4)) / 11.0f;
        float f20 = ((float) (((double) (fSignum + fSignum2)) - (d4 * 2.0d))) / 9.0f;
        float f21 = fSignum2 * 20.0f;
        float f22 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f21)) / 20.0f;
        float f23 = (((fSignum * 40.0f) + f21) + fSignum3) / 20.0f;
        float fAtan2 = (((float) java.lang.Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f24 = fAtan2;
        float f25 = (3.1415927f * f24) / 180.0f;
        float f26 = f23 * kVar.f29141b;
        float f27 = kVar.f29140a;
        float f28 = kVar.f29143d;
        float fPow4 = ((float) java.lang.Math.pow(f26 / f27, kVar.j * f28)) * 100.0f;
        java.lang.Math.sqrt(fPow4 / 100.0f);
        float f29 = f27 + 4.0f;
        float fPow5 = ((float) java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, kVar.f29145f), 0.73d)) * ((float) java.lang.Math.pow((((((((float) (java.lang.Math.cos(((((double) (((double) f24) < 20.14d ? f24 + 360.0f : f24)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * kVar.f29144e) * kVar.f29142c) * ((float) java.lang.Math.sqrt((f20 * f20) + (f19 * f19)))) / (f22 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) java.lang.Math.sqrt(((double) fPow4) / 100.0d));
        float f30 = kVar.f29147i * fSqrt;
        java.lang.Math.sqrt((fPow5 * f28) / f29);
        float f31 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) java.lang.Math.log((f30 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f25;
        return new p176v1.a(f24, fSqrt, fPow4, f31, fLog * ((float) java.lang.Math.cos(d6)), fLog * ((float) java.lang.Math.sin(d6)));
    }

    public static p176v1.a b(float f9, float f10, float f11) {
        p176v1.k kVar = p176v1.k.f29139k;
        float f12 = kVar.f29143d;
        double d4 = ((double) f9) / 100.0d;
        java.lang.Math.sqrt(d4);
        float f13 = kVar.f29140a + 4.0f;
        float f14 = kVar.f29147i * f10;
        java.lang.Math.sqrt(((f10 / ((float) java.lang.Math.sqrt(d4))) * kVar.f29143d) / f13);
        float f15 = (1.7f * f9) / ((0.007f * f9) + 1.0f);
        float fLog = ((float) java.lang.Math.log((((double) f14) * 0.0228d) + 1.0d)) * 43.85965f;
        double d6 = (3.1415927f * f11) / 180.0f;
        return new p176v1.a(f11, f10, f9, f15, fLog * ((float) java.lang.Math.cos(d6)), fLog * ((float) java.lang.Math.sin(d6)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final int c(p176v1.k kVar) {
        float fSqrt;
        float f9 = this.f29109b;
        double d4 = f9;
        float f10 = this.f29110c;
        if (d4 != 0.0d) {
            double d6 = f10;
            if (d6 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f9 / ((float) java.lang.Math.sqrt(d6 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) java.lang.Math.pow(((double) fSqrt) / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, kVar.f29145f), 0.73d), 1.1111111111111112d);
        double d9 = (this.f29108a * 3.1415927f) / 180.0f;
        float fCos = ((float) (java.lang.Math.cos(2.0d + d9) + 3.8d)) * 0.25f;
        float fPow2 = kVar.f29140a * ((float) java.lang.Math.pow(((double) f10) / 100.0d, (1.0d / ((double) kVar.f29143d)) / ((double) kVar.j)));
        float f11 = fCos * 3846.1538f * kVar.f29144e * kVar.f29142c;
        float f12 = fPow2 / kVar.f29141b;
        float fSin = (float) java.lang.Math.sin(d9);
        float fCos2 = (float) java.lang.Math.cos(d9);
        float f13 = (((0.305f + f12) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f11 * 23.0f)));
        float f14 = fCos2 * f13;
        float f15 = f13 * fSin;
        float f16 = f12 * 460.0f;
        float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
        float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
        float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
        float fMax = (float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f17)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f17))));
        float fSignum = java.lang.Math.signum(f17);
        float f20 = 100.0f / kVar.f29146h;
        float fPow3 = fSignum * f20 * ((float) java.lang.Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = java.lang.Math.signum(f18) * f20 * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f18)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f18)))), 2.380952380952381d));
        float fSignum3 = java.lang.Math.signum(f19) * f20 * ((float) java.lang.Math.pow((float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f19)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f19)))), 2.380952380952381d));
        float[] fArr = kVar.g;
        float f21 = fPow3 / fArr[0];
        float f22 = fSignum2 / fArr[1];
        float f23 = fSignum3 / fArr[2];
        float[][] fArr2 = p176v1.b.f29115b;
        float[] fArr3 = fArr2[0];
        float f24 = (fArr3[2] * f23) + (fArr3[1] * f22) + (fArr3[0] * f21);
        float[] fArr4 = fArr2[1];
        float f25 = (fArr4[2] * f23) + (fArr4[1] * f22) + (fArr4[0] * f21);
        float[] fArr5 = fArr2[2];
        return p182w1.a.a(f24, f25, (f23 * fArr5[2]) + (f22 * fArr5[1]) + (f21 * fArr5[0]));
    }
}
