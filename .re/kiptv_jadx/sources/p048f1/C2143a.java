package p048f1;

/* JADX INFO: renamed from: f1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2143a implements p048f1.x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21633h;

    public C2143a(int i3) {
        this.f21633h = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p048f1.C2143a) && this.f21633h == ((p048f1.C2143a) obj).f21633h;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f21633h);
    }

    public final java.lang.String toString() {
        return Y6.f.j(new java.lang.StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f21633h, ')');
    }
}
