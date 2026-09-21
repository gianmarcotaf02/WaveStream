package p196y0;

import com.google.common.util.concurrent.U;
import p188x0.z;

public final class l extends c {

    public static final float[] f31767d;

    public static final float[] f31768e;

    public static final float[] f31769f;
    public static final float[] g;

    static {
        float[] fArrG = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(a.f31722b.f31723a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f31767d = fArrG;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f31768e = fArr;
        f31769f = j.f(fArrG);
        g = j.f(fArr);
    }

    @Override
    public final float a(int i3) {
        return i3 == 0 ? 1.0f : 0.5f;
    }

    @Override
    public final float b(int i3) {
        return i3 == 0 ? 0.0f : -0.5f;
    }

    @Override
    public final long d(float f9, float f10, float f11) {
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f9);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f9);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f9);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f31769f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f18) + (fArr2[4] * f17) + (fArr2[1] * f16))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f18) + ((fArr2[3] * f17) + (fArr2[0] * f16)))) << 32);
    }

    @Override
    public final float e(float f9, float f10, float f11) {
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f9);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f9);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f9);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f31769f;
        return (fArr2[8] * f18) + (fArr2[5] * f17) + (fArr2[2] * f16);
    }

    @Override
    public final long f(float f9, float f10, float f11, float f12, c cVar) {
        float[] fArr = f31767d;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f9);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f9);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f9);
        float fQ0 = U.q0(f13);
        float fQ1 = U.q0(f14);
        float fQ2 = U.q0(f15);
        float[] fArr2 = f31768e;
        return z.b((fArr2[6] * fQ2) + (fArr2[3] * fQ1) + (fArr2[0] * fQ0), (fArr2[7] * fQ2) + (fArr2[4] * fQ1) + (fArr2[1] * fQ0), (fArr2[8] * fQ2) + (fArr2[5] * fQ1) + (fArr2[2] * fQ0), f12, cVar);
    }
}
