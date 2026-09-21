package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d;", "LQ0/X;", "LB/f0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class d extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B.A f15796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p194x6.m f15797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f15798d;

    public d(B.A a2, p194x6.m mVar, java.lang.Object obj) {
        this.f15796b = a2;
        this.f15797c = mVar;
        this.f15798d = obj;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        B.f0 f0Var = new B.f0();
        f0Var.f531v = this.f15796b;
        f0Var.f532w = this.f15797c;
        return f0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.compose.foundation.layout.d.class != obj.getClass()) {
            return false;
        }
        androidx.compose.foundation.layout.d dVar = (androidx.compose.foundation.layout.d) obj;
        return this.f15796b == dVar.f15796b && this.f15798d.equals(dVar.f15798d);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        B.f0 f0Var = (B.f0) oVar;
        f0Var.f531v = this.f15796b;
        f0Var.f532w = this.f15797c;
    }

    public final int hashCode() {
        return this.f15798d.hashCode() + p121o0.p.f(this.f15796b.hashCode() * 31, 31, false);
    }
}
