package p188x0;

import O7.r;
import Z2.C1209t;
import androidx.media3.common.util.Log;
import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class E {

    public final float[] f31047a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j, float[] fArr) {
        if (fArr.length < 16) {
            return j;
        }
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[7];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f18 = 1 / (((f14 * fIntBitsToFloat2) + (f11 * fIntBitsToFloat)) + f17);
        if ((Float.floatToRawIntBits(f18) & Log.LOG_LEVEL_OFF) >= 2139095040) {
            f18 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits((((f12 * fIntBitsToFloat2) + (f9 * fIntBitsToFloat)) + f15) * f18)) << 32) | (((long) Float.floatToRawIntBits(((f13 * fIntBitsToFloat2) + (f10 * fIntBitsToFloat) + f16) * f18)) & 4294967295L);
    }

    public static final void c(float[] fArr, C1209t c1209t) {
        if (fArr.length < 16) {
            return;
        }
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[7];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        float f18 = c1209t.f12941b;
        float f19 = c1209t.f12942c;
        float f20 = c1209t.f12943d;
        float f21 = c1209t.f12944e;
        float f22 = f11 * f18;
        float f23 = f14 * f19;
        float f24 = 1.0f / ((f22 + f23) + f17);
        if ((Float.floatToRawIntBits(f24) & Log.LOG_LEVEL_OFF) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f9 * f18;
        float f26 = f12 * f19;
        float f27 = (f25 + f26 + f15) * f24;
        float f28 = f18 * f10;
        float f29 = f19 * f13;
        float f30 = (f28 + f29 + f16) * f24;
        float f31 = f14 * f21;
        float f32 = 1.0f / ((f22 + f31) + f17);
        if ((Float.floatToRawIntBits(f32) & Log.LOG_LEVEL_OFF) >= 2139095040) {
            f32 = 0.0f;
        }
        float f33 = f12 * f21;
        float f34 = (f25 + f33 + f15) * f32;
        float f35 = f13 * f21;
        float f36 = (f28 + f35 + f16) * f32;
        float f37 = f11 * f20;
        float f38 = 1.0f / ((f23 + f37) + f17);
        if ((Float.floatToRawIntBits(f38) & Log.LOG_LEVEL_OFF) >= 2139095040) {
            f38 = 0.0f;
        }
        float f39 = f9 * f20;
        float f40 = (f39 + f26 + f15) * f38;
        float f41 = f20 * f10;
        float f42 = (f29 + f41 + f16) * f38;
        float f43 = 1.0f / ((f37 + f31) + f17);
        float f44 = (Float.floatToRawIntBits(f43) & Log.LOG_LEVEL_OFF) < 2139095040 ? f43 : 0.0f;
        float f45 = (f39 + f33 + f15) * f44;
        float f46 = (f41 + f35 + f16) * f44;
        c1209t.f12941b = Math.min(f27, Math.min(f34, Math.min(f40, f45)));
        c1209t.f12942c = Math.min(f30, Math.min(f36, Math.min(f42, f46)));
        c1209t.f12943d = Math.max(f27, Math.max(f34, Math.max(f40, f45)));
        c1209t.f12944e = Math.max(f30, Math.max(f36, Math.max(f42, f46)));
    }

    public static final void d(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void e(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f9 = fArr[0];
            float f10 = fArr2[0];
            float f11 = fArr[1];
            float f12 = fArr2[4];
            float f13 = fArr[2];
            float f14 = fArr2[8];
            float f15 = f13 * f14;
            float f16 = fArr[3];
            float f17 = fArr2[12];
            float f18 = f16 * f17;
            float f19 = f18 + f15 + (f11 * f12) + (f9 * f10);
            float f20 = fArr2[1];
            float f21 = fArr2[5];
            float f22 = fArr2[9];
            float f23 = f13 * f22;
            float f24 = fArr2[13];
            float f25 = f16 * f24;
            float f26 = f25 + f23 + (f11 * f21) + (f9 * f20);
            float f27 = fArr2[2];
            float f28 = fArr2[6];
            float f29 = fArr2[10];
            float f30 = f13 * f29;
            float f31 = fArr2[14];
            float f32 = f16 * f31;
            float f33 = f32 + f30 + (f11 * f28) + (f9 * f27);
            float f34 = fArr2[3];
            float f35 = fArr2[7];
            float f36 = fArr2[11];
            float f37 = f13 * f36;
            float f38 = fArr2[15];
            float f39 = f16 * f38;
            float f40 = f39 + f37 + (f11 * f35) + (f9 * f34);
            float f41 = fArr[4];
            float f42 = fArr[5];
            float f43 = fArr[6];
            float f44 = (f43 * f14) + (f42 * f12) + (f41 * f10);
            float f45 = fArr[7];
            float f46 = (f45 * f17) + f44;
            float f47 = (f45 * f24) + (f43 * f22) + (f42 * f21) + (f41 * f20);
            float f48 = (f45 * f31) + (f43 * f29) + (f42 * f28) + (f41 * f27);
            float f49 = f43 * f36;
            float f50 = f45 * f38;
            float f51 = f50 + f49 + (f42 * f35) + (f41 * f34);
            float f52 = fArr[8];
            float f53 = fArr[9];
            float f54 = fArr[10];
            float f55 = (f54 * f14) + (f53 * f12) + (f52 * f10);
            float f56 = fArr[11];
            float f57 = (f56 * f17) + f55;
            float f58 = (f56 * f24) + (f54 * f22) + (f53 * f21) + (f52 * f20);
            float f59 = (f56 * f31) + (f54 * f29) + (f53 * f28) + (f52 * f27);
            float f60 = f54 * f36;
            float f61 = f56 * f38;
            float f62 = f61 + f60 + (f53 * f35) + (f52 * f34);
            float f63 = fArr[12];
            float f64 = fArr[13];
            float f65 = (f12 * f64) + (f10 * f63);
            float f66 = fArr[14];
            float f67 = (f14 * f66) + f65;
            float f68 = fArr[15];
            float f69 = (f17 * f68) + f67;
            float f70 = f22 * f66;
            float f71 = f24 * f68;
            float f72 = f71 + f70 + (f21 * f64) + (f20 * f63);
            float f73 = f29 * f66;
            float f74 = f31 * f68;
            float f75 = f74 + f73 + (f28 * f64) + (f27 * f63);
            float f76 = f66 * f36;
            float f77 = f68 * f38;
            fArr[0] = f19;
            fArr[1] = f26;
            fArr[2] = f33;
            fArr[3] = f40;
            fArr[4] = f46;
            fArr[5] = f47;
            fArr[6] = f48;
            fArr[7] = f51;
            fArr[8] = f57;
            fArr[9] = f58;
            fArr[10] = f59;
            fArr[11] = f62;
            fArr[12] = f69;
            fArr[13] = f72;
            fArr[14] = f75;
            fArr[15] = f77 + f76 + (f64 * f35) + (f63 * f34);
        }
    }

    public static final void f(float[] fArr, float f9, float f10) {
        if (fArr.length < 16) {
            return;
        }
        float f11 = (fArr[8] * 0.0f) + (fArr[4] * f10) + (fArr[0] * f9) + fArr[12];
        float f12 = (fArr[9] * 0.0f) + (fArr[5] * f10) + (fArr[1] * f9) + fArr[13];
        float f13 = (fArr[10] * 0.0f) + (fArr[6] * f10) + (fArr[2] * f9) + fArr[14];
        float f14 = (fArr[11] * 0.0f) + (fArr[7] * f10) + (fArr[3] * f9) + fArr[15];
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        fArr[15] = f14;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            return m.a(this.f31047a, ((E) obj).f31047a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f31047a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f31047a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return r.T(sb.toString());
    }
}
