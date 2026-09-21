package p005a5;

/* JADX INFO: renamed from: a5.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1250d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f14349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f14351c;

    public C1250d3(java.lang.Object obj, int i3, java.lang.Integer num) {
        this.f14349a = obj;
        this.f14350b = i3;
        this.f14351c = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1250d3)) {
            return false;
        }
        p005a5.C1250d3 c1250d3 = (p005a5.C1250d3) obj;
        return kotlin.jvm.internal.m.a(this.f14349a, c1250d3.f14349a) && this.f14350b == c1250d3.f14350b && kotlin.jvm.internal.m.a(this.f14351c, c1250d3.f14351c);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f14349a;
        int iD = p121o0.p.d(this.f14350b, (obj == null ? 0 : obj.hashCode()) * 31, 31);
        java.lang.Integer num = this.f14351c;
        return iD + (num != null ? num.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "VodHit(item=" + this.f14349a + ", variantCount=" + this.f14350b + ", tmdbId=" + this.f14351c + ")";
    }
}
