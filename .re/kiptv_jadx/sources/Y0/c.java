package Y0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11029b;

    public c(int i3, int i9) {
        this.f11028a = i3;
        this.f11029b = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0.c)) {
            return false;
        }
        Y0.c cVar = (Y0.c) obj;
        return this.f11028a == cVar.f11028a && this.f11029b == cVar.f11029b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f11029b) + (java.lang.Integer.hashCode(this.f11028a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.f11028a);
        sb.append(", columnCount=");
        return Y6.f.j(sb, this.f11029b, ')');
    }
}
