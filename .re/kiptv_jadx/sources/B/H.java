package B;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB/H;", "LQ0/X;", "LB/I;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class H extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f470c;

    public H(float f9, boolean z6) {
        this.f469b = f9;
        this.f470c = z6;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        B.I i3 = new B.I();
        i3.f471v = this.f469b;
        i3.f472w = this.f470c;
        return i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        B.H h9 = obj instanceof B.H ? (B.H) obj : null;
        return h9 != null && this.f469b == h9.f469b && this.f470c == h9.f470c;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        B.I i3 = (B.I) oVar;
        i3.f471v = this.f469b;
        i3.f472w = this.f470c;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f470c) + (java.lang.Float.hashCode(this.f469b) * 31);
    }
}
