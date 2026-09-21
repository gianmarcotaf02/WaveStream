package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends Y4.V0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11726h;

    public S0(int i3) {
        super(Y6.f.f(i3, "TMDB HTTP error (", ")"));
        this.f11726h = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y4.S0) && this.f11726h == ((Y4.S0) obj).f11726h;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f11726h);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.k(new java.lang.StringBuilder("HttpError(code="), this.f11726h, ")");
    }
}
