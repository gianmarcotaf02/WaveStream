package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f22547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f22548i;
    public final java.lang.Object j;

    public q(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.f22547h = obj;
        this.f22548i = obj2;
        this.j = obj3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p070h6.q)) {
            return false;
        }
        p070h6.q qVar = (p070h6.q) obj;
        return kotlin.jvm.internal.m.a(this.f22547h, qVar.f22547h) && kotlin.jvm.internal.m.a(this.f22548i, qVar.f22548i) && kotlin.jvm.internal.m.a(this.j, qVar.j);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f22547h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f22548i;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Object obj3 = this.j;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(this.f22547h);
        sb.append(", ");
        sb.append(this.f22548i);
        sb.append(", ");
        return B2.a.n(sb, this.j, ')');
    }
}
