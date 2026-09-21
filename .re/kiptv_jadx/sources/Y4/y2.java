package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class y2 extends Y4.E2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12163h;

    public y2(int i3) {
        super(Y6.f.f(i3, "HTTP error (", ")"));
        this.f12163h = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y4.y2) && this.f12163h == ((Y4.y2) obj).f12163h;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f12163h);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.k(new java.lang.StringBuilder("HttpError(code="), this.f12163h, ")");
    }
}
