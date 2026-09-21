package B;

/* JADX INFO: renamed from: B.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB/m;", "LQ0/X;", "LB/n;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C0075m extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p137q0.h f546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f547c;

    public C0075m(p137q0.h hVar, boolean z6) {
        this.f546b = hVar;
        this.f547c = z6;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        B.C0076n c0076n = new B.C0076n();
        c0076n.f548v = this.f546b;
        c0076n.f549w = this.f547c;
        return c0076n;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        B.C0075m c0075m = obj instanceof B.C0075m ? (B.C0075m) obj : null;
        return c0075m != null && this.f546b.equals(c0075m.f546b) && this.f547c == c0075m.f547c;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        B.C0076n c0076n = (B.C0076n) oVar;
        c0076n.f548v = this.f546b;
        c0076n.f549w = this.f547c;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f547c) + (this.f546b.hashCode() * 31);
    }
}
