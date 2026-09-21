package B;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f500a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f501b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B.C0087z f502c = null;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B.W)) {
            return false;
        }
        B.W w6 = (B.W) obj;
        return java.lang.Float.compare(this.f500a, w6.f500a) == 0 && this.f501b == w6.f501b && kotlin.jvm.internal.m.a(this.f502c, w6.f502c);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(java.lang.Float.hashCode(this.f500a) * 31, 31, this.f501b);
        B.C0087z c0087z = this.f502c;
        return (iF + (c0087z == null ? 0 : c0087z.hashCode())) * 31;
    }

    public final java.lang.String toString() {
        return "RowColumnParentData(weight=" + this.f500a + ", fill=" + this.f501b + ", crossAxisAlignment=" + this.f502c + ", flowLayoutData=null)";
    }
}
