package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/c;", "LQ0/X;", "LB/c0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class c extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15795c;

    public c(float f9, float f10) {
        this.f15794b = f9;
        this.f15795c = f10;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        B.c0 c0Var = new B.c0();
        c0Var.f519v = this.f15794b;
        c0Var.f520w = this.f15795c;
        return c0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.compose.foundation.layout.c)) {
            return false;
        }
        androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
        return p113n1.f.c(this.f15794b, cVar.f15794b) && p113n1.f.c(this.f15795c, cVar.f15795c);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        B.c0 c0Var = (B.c0) oVar;
        c0Var.f519v = this.f15794b;
        c0Var.f520w = this.f15795c;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f15795c) + (java.lang.Float.hashCode(this.f15794b) * 31);
    }
}
