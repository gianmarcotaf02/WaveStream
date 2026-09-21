package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f22539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f22540i;

    public k(java.lang.Object obj, java.lang.Object obj2) {
        this.f22539h = obj;
        this.f22540i = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p070h6.k)) {
            return false;
        }
        p070h6.k kVar = (p070h6.k) obj;
        return kotlin.jvm.internal.m.a(this.f22539h, kVar.f22539h) && kotlin.jvm.internal.m.a(this.f22540i, kVar.f22540i);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f22539h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f22540i;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(this.f22539h);
        sb.append(", ");
        return B2.a.n(sb, this.f22540i, ')');
    }
}
