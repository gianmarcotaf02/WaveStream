package X4;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10867b;

    public d(java.lang.String str, int i3) {
        this.f10866a = str;
        this.f10867b = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X4.d)) {
            return false;
        }
        X4.d dVar = (X4.d) obj;
        return this.f10866a.equals(dVar.f10866a) && this.f10867b == dVar.f10867b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f10867b) + (this.f10866a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RatingStep(certification=");
        sb.append(this.f10866a);
        sb.append(", minimumAge=");
        return Y6.f.k(sb, this.f10867b, ")");
    }
}
