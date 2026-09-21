package P;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LP/e;", "LQ0/X;", "LP/h;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class e extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U.X f8076b;

    public e(U.X x9) {
        this.f8076b = x9;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        return new P.h(this.f8076b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof P.e) {
            return this.f8076b == ((P.e) obj).f8076b;
        }
        return false;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((P.h) oVar).f8083x = this.f8076b;
    }

    public final int hashCode() {
        return this.f8076b.hashCode();
    }
}
