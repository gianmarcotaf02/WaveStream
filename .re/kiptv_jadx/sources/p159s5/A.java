package p159s5;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements p159s5.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27267a;

    public A(int i3) {
        this.f27267a = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p159s5.A) && this.f27267a == ((p159s5.A) obj).f27267a;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f27267a);
    }

    public final java.lang.String toString() {
        return Y6.f.k(new java.lang.StringBuilder("RecentlyAddedMovies(days="), this.f27267a, ")");
    }
}
