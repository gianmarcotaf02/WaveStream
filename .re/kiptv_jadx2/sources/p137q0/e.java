package p137q0;

import p113n1.n;

public final class e implements d {

    public final float f26464a;

    public e(float f9) {
        this.f26464a = f9;
    }

    @Override
    public final long a(long j, long j9, n nVar) {
        long j10 = (((long) (((int) (j9 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j9 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f9 = 1;
        float f10 = (this.f26464a + f9) * (((int) (j10 >> 32)) / 2.0f);
        return (((long) Math.round((f9 - 1.0f) * (((int) (j10 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f10)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return Float.compare(this.f26464a, ((e) obj).f26464a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f26464a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f26464a + ", verticalBias=-1.0)";
    }
}
