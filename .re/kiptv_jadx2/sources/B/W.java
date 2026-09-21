package B;

public final class W {

    public float f500a = 0.0f;

    public boolean f501b = true;

    public C0087z f502c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w6 = (W) obj;
        return Float.compare(this.f500a, w6.f500a) == 0 && this.f501b == w6.f501b && kotlin.jvm.internal.m.a(this.f502c, w6.f502c);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(Float.hashCode(this.f500a) * 31, 31, this.f501b);
        C0087z c0087z = this.f502c;
        return (iF + (c0087z == null ? 0 : c0087z.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f500a + ", fill=" + this.f501b + ", crossAxisAlignment=" + this.f502c + ", flowLayoutData=null)";
    }
}
