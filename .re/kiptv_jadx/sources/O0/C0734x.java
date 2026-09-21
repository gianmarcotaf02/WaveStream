package O0;

/* JADX INFO: renamed from: O0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0/x;", "LQ0/X;", "LO0/z;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class C0734x extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f7708b;

    public C0734x(java.lang.String str) {
        this.f7708b = str;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        O0.C0736z c0736z = new O0.C0736z();
        c0736z.f7716v = this.f7708b;
        return c0736z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O0.C0734x) && this.f7708b.equals(((O0.C0734x) obj).f7708b);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((O0.C0736z) oVar).f7716v = this.f7708b;
    }

    public final int hashCode() {
        return this.f7708b.hashCode();
    }

    public final java.lang.String toString() {
        return "LayoutIdElement(layoutId=" + ((java.lang.Object) this.f7708b) + ')';
    }
}
