package p163t;

public final class C2759h0 {

    public float f27611a;

    public double f27612b;

    public float f27613c;

    public final long a(float f9, float f10, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f11 = f9 - this.f27611a;
        double d4 = j / 1000.0d;
        float f12 = this.f27613c;
        double d6 = ((double) f12) * ((double) f12);
        double d9 = this.f27612b;
        double d10 = ((double) (-f12)) * d9;
        if (f12 <= 1.0f) {
            if (f12 == 1.0f) {
                double d11 = f11;
                double d12 = (d9 * d11) + ((double) f10);
                double d13 = (-d9) * d4;
                double d14 = (d4 * d12) + d11;
                dSin = Math.exp(d13) * d14;
                dExp = Math.exp(d13) * d14 * (-this.f27612b);
                dExp2 = Math.exp(d13) * d12;
            } else {
                double d15 = 1;
                double dSqrt = Math.sqrt(d15 - d6) * d9;
                double d16 = f11;
                double d17 = (((-d10) * d16) + ((double) f10)) * (d15 / dSqrt);
                double d18 = dSqrt * d4;
                double d19 = d4 * d10;
                dSin = ((Math.sin(d18) * d17) + (Math.cos(d18) * d16)) * Math.exp(d19);
                dCos = (((Math.cos(d18) * dSqrt * d17) + (Math.sin(d18) * (-dSqrt) * d16)) * Math.exp(d19)) + (d10 * dSin);
            }
            return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f27611a))) << 32);
        }
        double dSqrt2 = Math.sqrt(d6 - ((double) 1)) * d9;
        double d20 = d10 + dSqrt2;
        double d21 = d10 - dSqrt2;
        double d22 = f11;
        double d23 = ((d21 * d22) - ((double) f10)) / (d21 - d20);
        double d24 = d22 - d23;
        double d25 = d21 * d4;
        double d26 = d4 * d20;
        dSin = (Math.exp(d26) * d23) + (Math.exp(d25) * d24);
        dExp = Math.exp(d25) * d24 * d21;
        dExp2 = Math.exp(d26) * d23 * d20;
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f27611a))) << 32);
    }
}
