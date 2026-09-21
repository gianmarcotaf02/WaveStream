package p137q0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p137q0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26464a;

    public e(float f9) {
        this.f26464a = f9;
    }

    @Override // p137q0.d
    public final long a(long j, long j9, p113n1.n nVar) {
        long j10 = (((long) (((int) (j9 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j9 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f9 = 1;
        float f10 = (this.f26464a + f9) * (((int) (j10 >> 32)) / 2.0f);
        return (((long) java.lang.Math.round((f9 - 1.0f) * (((int) (j10 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) java.lang.Math.round(f10)) << 32);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p137q0.e) {
            return java.lang.Float.compare(this.f26464a, ((p137q0.e) obj).f26464a) == 0 && java.lang.Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(-1.0f) + (java.lang.Float.hashCode(this.f26464a) * 31);
    }

    public final java.lang.String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f26464a + ", verticalBias=-1.0)";
    }
}
