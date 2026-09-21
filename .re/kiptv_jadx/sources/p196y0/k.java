package p196y0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p196y0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i3, int i9, long j, java.lang.String str) {
        super(str, j, i3);
        this.f31766d = i9;
    }

    @Override // p196y0.c
    public final float a(int i3) {
        switch (this.f31766d) {
            case 0:
                return i3 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // p196y0.c
    public final float b(int i3) {
        switch (this.f31766d) {
            case 0:
                return i3 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // p196y0.c
    public final long d(float f9, float f10, float f11) {
        switch (this.f31766d) {
            case 0:
                if (f9 < 0.0f) {
                    f9 = 0.0f;
                }
                if (f9 > 100.0f) {
                    f9 = 100.0f;
                }
                if (f10 < -128.0f) {
                    f10 = -128.0f;
                }
                if (f10 > 128.0f) {
                    f10 = 128.0f;
                }
                float f12 = (f9 + 16.0f) / 116.0f;
                float f13 = (f10 * 0.002f) + f12;
                float f14 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
                float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
                float[] fArr = p196y0.j.f31765e;
                return (((long) java.lang.Float.floatToRawIntBits(f15 * fArr[1])) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(f14 * fArr[0])) << 32);
            default:
                if (f9 < -2.0f) {
                    f9 = -2.0f;
                }
                if (f9 > 2.0f) {
                    f9 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                return (((long) java.lang.Float.floatToRawIntBits(f9)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f10 <= 2.0f ? f10 : 2.0f)) & 4294967295L);
        }
    }

    @Override // p196y0.c
    public final float e(float f9, float f10, float f11) {
        switch (this.f31766d) {
            case 0:
                if (f9 < 0.0f) {
                    f9 = 0.0f;
                }
                if (f9 > 100.0f) {
                    f9 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f12 = ((f9 + 16.0f) / 116.0f) - (f11 * 0.005f);
                return (f12 > 0.20689656f ? f12 * f12 * f12 : 0.12841855f * (f12 - 0.13793103f)) * p196y0.j.f31765e[2];
            default:
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    return 2.0f;
                }
                return f11;
        }
    }

    @Override // p196y0.c
    public final long f(float f9, float f10, float f11, float f12, p196y0.c cVar) {
        switch (this.f31766d) {
            case 0:
                float[] fArr = p196y0.j.f31765e;
                float f13 = f9 / fArr[0];
                float f14 = f10 / fArr[1];
                float f15 = f11 / fArr[2];
                float fCbrt = f13 > 0.008856452f ? (float) java.lang.Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f14 > 0.008856452f ? (float) java.lang.Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
                float f16 = (116.0f * fCbrt2) - 16.0f;
                float f17 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f15 > 0.008856452f ? (float) java.lang.Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f16 < 0.0f) {
                    f16 = 0.0f;
                }
                if (f16 > 100.0f) {
                    f16 = 100.0f;
                }
                if (f17 < -128.0f) {
                    f17 = -128.0f;
                }
                if (f17 > 128.0f) {
                    f17 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return p188x0.z.b(f16, f17, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f12, cVar);
            default:
                if (f9 < -2.0f) {
                    f9 = -2.0f;
                }
                if (f9 > 2.0f) {
                    f9 = 2.0f;
                }
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                return p188x0.z.b(f9, f10, f11 <= 2.0f ? f11 : 2.0f, f12, cVar);
        }
    }
}
