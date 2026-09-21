package H7;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f4518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f4519b;

    public a(java.lang.Object obj, java.lang.Object obj2) {
        this.f4518a = obj;
        this.f4519b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H7.a)) {
            return false;
        }
        H7.a aVar = (H7.a) obj;
        return kotlin.jvm.internal.m.a(this.f4518a, aVar.f4518a) && kotlin.jvm.internal.m.a(this.f4519b, aVar.f4519b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f4518a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f4519b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ApproximationBounds(lower=");
        sb.append(this.f4518a);
        sb.append(", upper=");
        return B2.a.n(sb, this.f4519b, ')');
    }
}
