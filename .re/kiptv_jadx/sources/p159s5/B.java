package p159s5;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements p159s5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27268a;

    public B(int i3) {
        this.f27268a = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p159s5.B) && this.f27268a == ((p159s5.B) obj).f27268a;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f27268a);
    }

    public final java.lang.String toString() {
        return Y6.f.k(new java.lang.StringBuilder("RecentlyAddedSeries(days="), this.f27268a, ")");
    }
}
