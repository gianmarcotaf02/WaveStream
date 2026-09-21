package F;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LF/o0;", "LQ0/X;", "LF/p0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class o0 extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.N f3481b;

    public o0(F.N n3) {
        this.f3481b = n3;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        F.p0 p0Var = new F.p0();
        p0Var.f3485v = this.f3481b;
        return p0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F.o0) && kotlin.jvm.internal.m.a(this.f3481b, ((F.o0) obj).f3481b);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((F.p0) oVar).f3485v = this.f3481b;
    }

    public final int hashCode() {
        return this.f3481b.hashCode();
    }

    public final java.lang.String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f3481b + ')';
    }
}
