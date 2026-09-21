package B;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB/C;", "LQ0/X;", "LB/D;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class C extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p137q0.f f463b;

    public C(p137q0.f fVar) {
        this.f463b = fVar;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        B.D d4 = new B.D();
        d4.f464v = this.f463b;
        return d4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        B.C c9 = obj instanceof B.C ? (B.C) obj : null;
        if (c9 == null) {
            return false;
        }
        return this.f463b.equals(c9.f463b);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((B.D) oVar).f464v = this.f463b;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f463b.f26465a);
    }
}
