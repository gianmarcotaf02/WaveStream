package p196y0;

public final class r {

    public final double f31791a;

    public final double f31792b;

    public final double f31793c;

    public final double f31794d;

    public final double f31795e;

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
        if (Double.isNaN(d6) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d4)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d4 == -2.0d || d4 == -3.0d) {
            return;
        }
        if (d11 < 0.0d || d11 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d11);
        }
        if (d11 == 0.0d && (d6 == 0.0d || d4 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d11 >= 1.0d && d10 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d6 == 0.0d || d4 == 0.0d) && d10 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d6 < 0.0d || d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f31791a, rVar.f31791a) == 0 && Double.compare(this.f31792b, rVar.f31792b) == 0 && Double.compare(this.f31793c, rVar.f31793c) == 0 && Double.compare(this.f31794d, rVar.f31794d) == 0 && Double.compare(this.f31795e, rVar.f31795e) == 0 && Double.compare(this.f31796f, rVar.f31796f) == 0 && Double.compare(this.g, rVar.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + ((Double.hashCode(this.f31796f) + ((Double.hashCode(this.f31795e) + ((Double.hashCode(this.f31794d) + ((Double.hashCode(this.f31793c) + ((Double.hashCode(this.f31792b) + (Double.hashCode(this.f31791a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f31791a + ", a=" + this.f31792b + ", b=" + this.f31793c + ", c=" + this.f31794d + ", d=" + this.f31795e + ", e=" + this.f31796f + ", f=" + this.g + ')';
    }

    public r(double d4, double d6, double d9, double d10, double d11) {
        this(d4, d6, d9, d10, d11, 0.0d, 0.0d);
    }
}
