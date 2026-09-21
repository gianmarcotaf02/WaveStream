package p154s;

import O7.r;

public abstract class AbstractC2716b {

    public static final float[] f27110a;

    static {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float[] fArr = new float[101];
        f27110a = fArr;
        float[] fArr2 = new float[101];
        float f18 = 0.0f;
        int i3 = 0;
        float f19 = 0.0f;
        while (true) {
            float f20 = 1.0f;
            if (i3 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f21 = i3 / 100;
            float f22 = 1.0f;
            while (true) {
                f9 = ((f22 - f18) / 2.0f) + f18;
                f10 = f20 - f9;
                f11 = f9 * 3.0f * f10;
                f12 = f9 * f9 * f9;
                float f23 = (((f9 * 0.35000002f) + (f10 * 0.175f)) * f11) + f12;
                f13 = f20;
                if (Math.abs(f23 - f21) < 1.0E-5d) {
                    break;
                }
                if (f23 > f21) {
                    f22 = f9;
                } else {
                    f18 = f9;
                }
                f20 = f13;
            }
            float f24 = 0.5f;
            fArr[i3] = (((f10 * 0.5f) + f9) * f11) + f12;
            float f25 = f13;
            while (true) {
                f14 = ((f25 - f19) / 2.0f) + f19;
                f15 = f13 - f14;
                f16 = f14 * 3.0f * f15;
                f17 = f14 * f14 * f14;
                float f26 = (((f15 * f24) + f14) * f16) + f17;
                float f27 = f25;
                if (Math.abs(f26 - f21) >= 1.0E-5d) {
                    if (f26 > f21) {
                        f25 = f14;
                    } else {
                        f19 = f14;
                        f25 = f27;
                    }
                    f24 = 0.5f;
                }
            }
            fArr2[i3] = (((f14 * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
            i3++;
        }
    }

    public static C2715a a(float f9) {
        float f10 = 0.0f;
        float f11 = 1.0f;
        float fR = r.r(f9, 0.0f, 1.0f);
        float f12 = 100;
        int i3 = (int) (f12 * fR);
        if (i3 < 100) {
            float f13 = i3 / f12;
            int i9 = i3 + 1;
            float f14 = i9 / f12;
            float[] fArr = f27110a;
            float f15 = fArr[i3];
            float f16 = (fArr[i9] - f15) / (f14 - f13);
            float f17 = ((fR - f13) * f16) + f15;
            f10 = f16;
            f11 = f17;
        }
        return new C2715a(f11, f10);
    }
}
