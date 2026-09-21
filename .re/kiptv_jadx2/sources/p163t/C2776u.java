package p163t;

import com.google.common.util.concurrent.U;
import p121o0.p;
import p188x0.z;

public final class C2776u implements InterfaceC2780y {

    public final float f27697h;

    public final float f27698i;
    public final float j;

    public final float f27699k;

    public C2776u(float f9, float f10) {
        int iO;
        this.f27697h = f9;
        this.f27698i = f10;
        if (Float.isNaN(f9) || Float.isNaN(0.0f) || Float.isNaN(f10) || Float.isNaN(1.0f)) {
            S.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f9 + ", 0.0, " + f10 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d4 = 0.0f;
        double d6 = 3.0f;
        double d9 = 0.0f;
        double d10 = d6 * 2.0d;
        double d11 = (d4 - d10) + d9;
        if (d11 == 0.0d) {
            iO = d6 == d9 ? 0 : z.O((float) ((d10 - d9) / (d10 - (d9 * 2.0d))), fArr, 0);
        } else {
            double d12 = -Math.sqrt((d6 * d6) - (d9 * d4));
            double d13 = (-d4) + d6;
            int iO2 = z.O((float) ((-(d12 + d13)) / d11), fArr, 0);
            iO = z.O((float) ((d12 - d13) / d11), fArr, iO2) + iO2;
            if (iO > 1) {
                float f11 = fArr[0];
                float f12 = fArr[1];
                if (f11 > f12) {
                    fArr[0] = f12;
                    fArr[1] = f11;
                } else if (f11 == f12) {
                    iO--;
                }
            }
        }
        int iO3 = z.O(0.5f, fArr, iO) + iO;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i3 = 0; i3 < iO3; i3++) {
            float f13 = fArr[i3];
            float f14 = ((((((-2.0f) * f13) + 3.0f) * f13) + 0.0f) * f13) + 0.0f;
            fMin = Math.min(fMin, f14);
            fMax = Math.max(fMax, f14);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.j = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f27699k = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    @Override
    public final float b(float f9) {
        float f10;
        if (f9 <= 0.0f || f9 >= 1.0f) {
            return f9;
        }
        float fMax = Math.max(f9, 1.1920929E-7f);
        float f11 = 0.0f - fMax;
        float f12 = this.f27697h;
        float f13 = f12 - fMax;
        float f14 = this.f27698i;
        float f15 = f14 - fMax;
        double d4 = f11;
        double d6 = ((d4 - (((double) f13) * 2.0d)) + ((double) f15)) * 3.0d;
        double d9 = ((double) (f13 - f11)) * 3.0d;
        double d10 = (((double) (f13 - f15)) * 3.0d) + ((double) (-f11)) + ((double) (1.0f - fMax));
        float f16 = Float.NaN;
        if (Math.abs(d10 - 0.0d) >= 1.0E-7d) {
            double d11 = d6 / d10;
            double d12 = d9 / d10;
            double d13 = d4 / d10;
            double d14 = ((d12 * 3.0d) - (d11 * d11)) / 9.0d;
            double d15 = ((d13 * 27.0d) + ((((2.0d * d11) * d11) * d11) - ((9.0d * d11) * d12))) / 54.0d;
            double d16 = d14 * d14 * d14;
            double d17 = (d15 * d15) + d16;
            double d18 = d11 / 3.0d;
            if (d17 < 0.0d) {
                double dSqrt = Math.sqrt(-d16);
                double d19 = (-d15) / dSqrt;
                if (d19 < -1.0d) {
                    d19 = -1.0d;
                }
                if (d19 > 1.0d) {
                    d19 = 1.0d;
                }
                double dAcos = Math.acos(d19);
                double dQ0 = U.q0((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dQ0) - d18);
                float f17 = fCos < 0.0f ? 0.0f : fCos;
                if (f17 > 1.0f) {
                    f17 = 1.0f;
                }
                if (Math.abs(f17 - fCos) > 1.05E-6f) {
                    f17 = Float.NaN;
                }
                if (Float.isNaN(f17)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dQ0) - d18);
                    f17 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f17 > 1.0f) {
                        f17 = 1.0f;
                    }
                    if (Math.abs(f17 - fCos2) > 1.05E-6f) {
                        f17 = Float.NaN;
                    }
                    if (Float.isNaN(f17)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dQ0) - d18);
                        f10 = fCos3 < 0.0f ? 0.0f : fCos3;
                        if (f10 > 1.0f) {
                            f10 = 1.0f;
                        }
                        if (Math.abs(f10 - fCos3) <= 1.05E-6f) {
                            f16 = f10;
                        }
                    } else {
                        f16 = f17;
                    }
                } else {
                    f16 = f17;
                }
            } else if (d17 == 0.0d) {
                float f18 = -U.q0((float) d15);
                float f19 = (float) d18;
                float f20 = (2.0f * f18) - f19;
                float f21 = f20 < 0.0f ? 0.0f : f20;
                if (f21 > 1.0f) {
                    f21 = 1.0f;
                }
                if (Math.abs(f21 - f20) > 1.05E-6f) {
                    f21 = Float.NaN;
                }
                if (Float.isNaN(f21)) {
                    float f22 = (-f18) - f19;
                    f10 = f22 < 0.0f ? 0.0f : f22;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (Math.abs(f10 - f22) <= 1.05E-6f) {
                        f16 = f10;
                    }
                } else {
                    f16 = f21;
                }
            } else {
                double dSqrt2 = Math.sqrt(d17);
                float fQ0 = (float) (((double) (U.q0((float) ((-d15) + dSqrt2)) - U.q0((float) (d15 + dSqrt2)))) - d18);
                f10 = fQ0 < 0.0f ? 0.0f : fQ0;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                if (Math.abs(f10 - fQ0) <= 1.05E-6f) {
                    f16 = f10;
                }
            }
        } else if (Math.abs(d6 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d9 * d9) - ((4.0d * d6) * d4));
            double d20 = d6 * 2.0d;
            float f23 = (float) ((dSqrt3 - d9) / d20);
            float f24 = f23 < 0.0f ? 0.0f : f23;
            if (f24 > 1.0f) {
                f24 = 1.0f;
            }
            if (Math.abs(f24 - f23) > 1.05E-6f) {
                f24 = Float.NaN;
            }
            if (Float.isNaN(f24)) {
                float f25 = (float) (((-d9) - dSqrt3) / d20);
                f10 = f25 < 0.0f ? 0.0f : f25;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                if (Math.abs(f10 - f25) <= 1.05E-6f) {
                    f16 = f10;
                }
            } else {
                f16 = f24;
            }
        } else if (Math.abs(d9 - 0.0d) >= 1.0E-7d) {
            float f26 = (float) ((-d4) / d9);
            f10 = f26 < 0.0f ? 0.0f : f26;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            if (Math.abs(f10 - f26) <= 1.05E-6f) {
                f16 = f10;
            }
        }
        if (!Float.isNaN(f16)) {
            float f27 = (((((-0.6666666f) * f16) + 1.0f) * f16) + 0.0f) * 3.0f * f16;
            float f28 = this.j;
            if (f27 < f28) {
                f27 = f28;
            }
            float f29 = this.f27699k;
            return f27 > f29 ? f29 : f27;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f12 + ", 0.0, " + f14 + ", 1.0) has no solution at " + f9);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2776u)) {
            return false;
        }
        C2776u c2776u = (C2776u) obj;
        return this.f27697h == c2776u.f27697h && this.f27698i == c2776u.f27698i;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + p.c(this.f27698i, p.c(0.0f, Float.hashCode(this.f27697h) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f27697h + ", b=0.0, c=" + this.f27698i + ", d=1.0)";
    }
}
