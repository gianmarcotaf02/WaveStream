package com.google.android.gms.internal.cast;

public final class Q1 {

    public static Q1 f18806d;

    public long f18807a;

    public long f18808b;

    public int f18809c;

    public void a(long j, double d4, double d6) {
        float f9 = (j - 946728000000L) / 8.64E7f;
        float f10 = (0.01720197f * f9) + 6.24006f;
        double d9 = f10;
        double dSin = (Math.sin(f10 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f10) * 3.4906598739326E-4d) + (Math.sin(d9) * 0.03341960161924362d) + d9 + 1.796593063d + 3.141592653589793d;
        double d10 = (-d6) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d9) * 0.0053d) + ((double) (Math.round(((double) (f9 - 9.0E-4f)) - d10) + 9.0E-4f)) + d10;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d11 = 0.01745329238474369d * d4;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d11))) / (Math.cos(dAsin) * Math.cos(d11));
        if (dSin3 >= 1.0d) {
            this.f18809c = 1;
            this.f18807a = -1L;
            this.f18808b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f18809c = 0;
                this.f18807a = -1L;
                this.f18808b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f18807a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f18808b = jRound;
            if (jRound >= j || this.f18807a <= j) {
                this.f18809c = 1;
            } else {
                this.f18809c = 0;
            }
        }
    }
}
