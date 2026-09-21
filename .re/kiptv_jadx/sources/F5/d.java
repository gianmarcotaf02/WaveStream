package F5;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3679b;

    public d(java.lang.String str, int i3) {
        this.f3678a = str;
        this.f3679b = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F5.d)) {
            return false;
        }
        F5.d dVar = (F5.d) obj;
        return this.f3678a.equals(dVar.f3678a) && this.f3679b == dVar.f3679b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f3679b) + (this.f3678a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvPremiumDevice(label=");
        sb.append(this.f3678a);
        sb.append(", iconRes=");
        return Y6.f.k(sb, this.f3679b, ")");
    }
}
