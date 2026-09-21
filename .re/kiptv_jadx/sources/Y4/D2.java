package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class D2 extends Y4.E2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11575h;

    public D2(int i3) {
        super(Y6.f.f(i3, "Server error (", ")"));
        this.f11575h = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y4.D2) && this.f11575h == ((Y4.D2) obj).f11575h;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f11575h);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.k(new java.lang.StringBuilder("ServerError(code="), this.f11575h, ")");
    }
}
