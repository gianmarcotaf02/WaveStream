package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class C implements p163t.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p163t.C2759h0 f27440b;

    public C(float f9, float f10, float f11) {
        this.f27439a = f11;
        p163t.C2759h0 c2759h0 = new p163t.C2759h0();
        c2759h0.f27611a = 1.0f;
        c2759h0.f27612b = java.lang.Math.sqrt(50.0d);
        c2759h0.f27613c = 1.0f;
        if (f9 < 0.0f) {
            p163t.S.a("Damping ratio must be non-negative");
        }
        c2759h0.f27613c = f9;
        double d4 = c2759h0.f27612b;
        if (((float) (d4 * d4)) <= 0.0f) {
            p163t.S.a("Spring stiffness constant must be positive.");
        }
        c2759h0.f27612b = java.lang.Math.sqrt(f10);
        this.f27440b = c2759h0;
    }

    @Override // p163t.B
    public final float b(long j, float f9, float f10, float f11) {
        p163t.C2759h0 c2759h0 = this.f27440b;
        c2759h0.f27611a = f10;
        return java.lang.Float.intBitsToFloat((int) (c2759h0.a(f9, f11, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    @Override // p163t.B
    public final long c(float f9, float f10, float f11) {
        double dLog;
        long j;
        p163t.C2759h0 c2759h0 = this.f27440b;
        double d4 = c2759h0.f27612b;
        float f12 = (float) (d4 * d4);
        float f13 = c2759h0.f27613c;
        float f14 = this.f27439a;
        float f15 = (f9 - f10) / f14;
        float f16 = f11 / f14;
        if (f13 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d6 = f12;
            double d9 = f13;
            double d10 = f16;
            double d11 = f15;
            double d12 = 1.0f;
            double dSqrt = d9 * 2.0d * java.lang.Math.sqrt(d6);
            double d13 = (dSqrt * dSqrt) - (d6 * 4.0d);
            double dSqrt2 = d13 < 0.0d ? 0.0d : java.lang.Math.sqrt(d13);
            double d14 = -dSqrt;
            double d15 = (d14 + dSqrt2) * 0.5d;
            double dSqrt3 = (d13 < 0.0d ? java.lang.Math.sqrt(java.lang.Math.abs(d13)) : 0.0d) * 0.5d;
            double d16 = (d14 - dSqrt2) * 0.5d;
            if (d11 == 0.0d && d10 == 0.0d) {
                j = 0;
            } else {
                if (d11 < 0.0d) {
                    d10 = -d10;
                }
                double dAbs = java.lang.Math.abs(d11);
                double dAbs2 = Double.MAX_VALUE;
                if (d9 > 1.0d) {
                    double d17 = (d15 * dAbs) - d10;
                    double d18 = d15 - d16;
                    double d19 = d17 / d18;
                    double d20 = dAbs - d19;
                    dLog = java.lang.Math.log(java.lang.Math.abs(d12 / d20)) / d15;
                    double dLog2 = java.lang.Math.log(java.lang.Math.abs(d12 / d19)) / d16;
                    if ((java.lang.Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((java.lang.Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = java.lang.Math.max(dLog, dLog2);
                    }
                    double d21 = d20 * d15;
                    double dLog3 = java.lang.Math.log(d21 / ((-d19) * d16)) / (d16 - d15);
                    if (java.lang.Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d12 = -d12;
                    } else if (dLog3 <= 0.0d) {
                        dLog = java.lang.Math.log((-((d19 * d16) * d16)) / (d21 * d15)) / d18;
                    } else if ((-((java.lang.Math.exp(dLog3 * d16) * d19) + (java.lang.Math.exp(d15 * dLog3) * d20))) < d12) {
                        d12 = -d12;
                        dLog = (d19 <= 0.0d || d20 >= 0.0d) ? dLog : 0.0d;
                    } else {
                        dLog = java.lang.Math.log((-((d19 * d16) * d16)) / (d21 * d15)) / d18;
                    }
                    double d22 = d19 * d16;
                    if (java.lang.Math.abs((java.lang.Math.exp(d16 * dLog) * d22) + (java.lang.Math.exp(d15 * dLog) * d21)) >= 1.0E-4d) {
                        int i3 = 0;
                        while (dAbs2 > 0.001d && i3 < 100) {
                            i3++;
                            double d23 = d15 * dLog;
                            double d24 = d16 * dLog;
                            double dExp = dLog - ((((java.lang.Math.exp(d24) * d19) + (java.lang.Math.exp(d23) * d20)) + d12) / ((java.lang.Math.exp(d24) * d22) + (java.lang.Math.exp(d23) * d21)));
                            dAbs2 = java.lang.Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d9 < 1.0d) {
                    double d25 = (d10 - (d15 * dAbs)) / dSqrt3;
                    dLog = java.lang.Math.log(d12 / java.lang.Math.sqrt((d25 * d25) + (dAbs * dAbs))) / d15;
                } else {
                    double d26 = d15 * dAbs;
                    double d27 = d10 - d26;
                    double dLog4 = java.lang.Math.log(java.lang.Math.abs(d12 / dAbs)) / d15;
                    double dLog5 = java.lang.Math.log(java.lang.Math.abs(d12 / d27));
                    double dLog6 = dLog5;
                    for (int i9 = 0; i9 < 6; i9++) {
                        dLog6 = dLog5 - java.lang.Math.log(java.lang.Math.abs(dLog6 / d15));
                    }
                    double d28 = dLog6 / d15;
                    if ((java.lang.Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d28;
                    } else if ((java.lang.Double.doubleToRawLongBits(d28) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = java.lang.Math.max(dLog4, d28);
                    }
                    double d29 = (-(d26 + d27)) / (d15 * d27);
                    double d30 = d15 * d29;
                    double dExp2 = (java.lang.Math.exp(d30) * d27 * d29) + (java.lang.Math.exp(d30) * dAbs);
                    if (java.lang.Double.isNaN(d29) || d29 <= 0.0d) {
                        d12 = -d12;
                    } else if (d29 <= 0.0d || (-dExp2) >= d12) {
                        dLog4 = (-(2.0d / d15)) - (dAbs / d27);
                    } else {
                        if (d27 < 0.0d && dAbs > 0.0d) {
                            dLog4 = 0.0d;
                        }
                        d12 = -d12;
                    }
                    dLog = dLog4;
                    int i10 = 0;
                    while (dAbs2 > 0.001d && i10 < 100) {
                        i10++;
                        double d31 = d15 * dLog;
                        double dExp3 = dLog - (((java.lang.Math.exp(d31) * ((d27 * dLog) + dAbs)) + d12) / (java.lang.Math.exp(d31) * (((((double) 1) + d31) * d27) + d26)));
                        dAbs2 = java.lang.Math.abs(dLog - dExp3);
                        dLog = dExp3;
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // p163t.B
    public final float d(float f9, float f10, float f11) {
        return 0.0f;
    }

    @Override // p163t.B
    public final float e(long j, float f9, float f10, float f11) {
        p163t.C2759h0 c2759h0 = this.f27440b;
        c2759h0.f27611a = f10;
        return java.lang.Float.intBitsToFloat((int) (c2759h0.a(f9, f11, j / 1000000) >> 32));
    }
}
