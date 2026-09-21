package p196y0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f31791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f31792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f31793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f31794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f31795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f31796f;
    public final double g;

    public r(double d4, double d6, double d9, double d10, double d11, double d12, double d13) {
        this.f31791a = d4;
        this.f31792b = d6;
        this.f31793c = d9;
        this.f31794d = d10;
        this.f31795e = d11;
        this.f31796f = d12;
        this.g = d13;
        if (java.lang.Double.isNaN(d6) || java.lang.Double.isNaN(d9) || java.lang.Double.isNaN(d10) || java.lang.Double.isNaN(d11) || java.lang.Double.isNaN(d12) || java.lang.Double.isNaN(d13) || java.lang.Double.isNaN(d4)) {
            throw new java.lang.IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d4 == -2.0d || d4 == -3.0d) {
            return;
        }
        if (d11 < 0.0d || d11 > 1.0d) {
            throw new java.lang.IllegalArgumentException("Parameter d must be in the range [0..1], was " + d11);
        }
        if (d11 == 0.0d && (d6 == 0.0d || d4 == 0.0d)) {
            throw new java.lang.IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d11 >= 1.0d && d10 == 0.0d) {
            throw new java.lang.IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d6 == 0.0d || d4 == 0.0d) && d10 == 0.0d) {
            throw new java.lang.IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d10 < 0.0d) {
            throw new java.lang.IllegalArgumentException("The transfer function must be increasing");
        }
        if (d6 < 0.0d || d4 < 0.0d) {
            throw new java.lang.IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p196y0.r)) {
            return false;
        }
        p196y0.r rVar = (p196y0.r) obj;
        return java.lang.Double.compare(this.f31791a, rVar.f31791a) == 0 && java.lang.Double.compare(this.f31792b, rVar.f31792b) == 0 && java.lang.Double.compare(this.f31793c, rVar.f31793c) == 0 && java.lang.Double.compare(this.f31794d, rVar.f31794d) == 0 && java.lang.Double.compare(this.f31795e, rVar.f31795e) == 0 && java.lang.Double.compare(this.f31796f, rVar.f31796f) == 0 && java.lang.Double.compare(this.g, rVar.g) == 0;
    }

    public final int hashCode() {
        return java.lang.Double.hashCode(this.g) + ((java.lang.Double.hashCode(this.f31796f) + ((java.lang.Double.hashCode(this.f31795e) + ((java.lang.Double.hashCode(this.f31794d) + ((java.lang.Double.hashCode(this.f31793c) + ((java.lang.Double.hashCode(this.f31792b) + (java.lang.Double.hashCode(this.f31791a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TransferParameters(gamma=" + this.f31791a + ", a=" + this.f31792b + ", b=" + this.f31793c + ", c=" + this.f31794d + ", d=" + this.f31795e + ", e=" + this.f31796f + ", f=" + this.g + ')';
    }

    public /* synthetic */ r(double d4, double d6, double d9, double d10, double d11) {
        this(d4, d6, d9, d10, d11, 0.0d, 0.0d);
    }
}
