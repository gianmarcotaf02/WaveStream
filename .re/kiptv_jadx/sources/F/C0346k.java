package F;

/* JADX INFO: renamed from: F.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0346k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3471b;

    public C0346k(int i3, int i9) {
        this.f3470a = i3;
        this.f3471b = i9;
        if (!(i3 >= 0)) {
            A.b.a("negative start index");
        }
        if (i9 >= i3) {
            return;
        }
        A.b.a("end index greater than start");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F.C0346k)) {
            return false;
        }
        F.C0346k c0346k = (F.C0346k) obj;
        return this.f3470a == c0346k.f3470a && this.f3471b == c0346k.f3471b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f3471b) + (java.lang.Integer.hashCode(this.f3470a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Interval(start=");
        sb.append(this.f3470a);
        sb.append(", end=");
        return Y6.f.j(sb, this.f3471b, ')');
    }
}
