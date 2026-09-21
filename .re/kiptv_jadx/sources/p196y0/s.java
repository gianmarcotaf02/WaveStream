package p196y0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31798b;

    public s(float f9, float f10) {
        this.f31797a = f9;
        this.f31798b = f10;
    }

    public final float[] a() {
        float f9 = this.f31797a;
        float f10 = this.f31798b;
        return new float[]{f9 / f10, 1.0f, ((1.0f - f9) - f10) / f10};
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p196y0.s)) {
            return false;
        }
        p196y0.s sVar = (p196y0.s) obj;
        return java.lang.Float.compare(this.f31797a, sVar.f31797a) == 0 && java.lang.Float.compare(this.f31798b, sVar.f31798b) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f31798b) + (java.lang.Float.hashCode(this.f31797a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WhitePoint(x=");
        sb.append(this.f31797a);
        sb.append(", y=");
        return p121o0.p.q(sb, this.f31798b, ')');
    }
}
