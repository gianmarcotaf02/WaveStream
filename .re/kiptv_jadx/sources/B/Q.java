package B;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB/Q;", "LQ0/X;", "LB/U;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class Q extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B.S f491b;

    public Q(B.S s9) {
        this.f491b = s9;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        B.U u6 = new B.U();
        u6.f499v = this.f491b;
        return u6;
    }

    public final boolean equals(java.lang.Object obj) {
        B.Q q9 = obj instanceof B.Q ? (B.Q) obj : null;
        if (q9 == null) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f491b, q9.f491b);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((B.U) oVar).f499v = this.f491b;
    }

    public final int hashCode() {
        return this.f491b.hashCode();
    }
}
