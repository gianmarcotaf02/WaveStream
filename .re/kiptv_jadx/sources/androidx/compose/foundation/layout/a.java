package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/a;", "LQ0/X;", "LB/b0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class a extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15788f;

    public a(float f9, float f10, float f11, float f12, boolean z6) {
        this.f15784b = f9;
        this.f15785c = f10;
        this.f15786d = f11;
        this.f15787e = f12;
        this.f15788f = z6;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        B.b0 b0Var = new B.b0();
        b0Var.f513v = this.f15784b;
        b0Var.f514w = this.f15785c;
        b0Var.f515x = this.f15786d;
        b0Var.y = this.f15787e;
        b0Var.f516z = this.f15788f;
        return b0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.layout.a)) {
            return false;
        }
        androidx.compose.foundation.layout.a aVar = (androidx.compose.foundation.layout.a) obj;
        return p113n1.f.c(this.f15784b, aVar.f15784b) && p113n1.f.c(this.f15785c, aVar.f15785c) && p113n1.f.c(this.f15786d, aVar.f15786d) && p113n1.f.c(this.f15787e, aVar.f15787e) && this.f15788f == aVar.f15788f;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        B.b0 b0Var = (B.b0) oVar;
        b0Var.f513v = this.f15784b;
        b0Var.f514w = this.f15785c;
        b0Var.f515x = this.f15786d;
        b0Var.y = this.f15787e;
        b0Var.f516z = this.f15788f;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f15788f) + p121o0.p.c(this.f15787e, p121o0.p.c(this.f15786d, p121o0.p.c(this.f15785c, java.lang.Float.hashCode(this.f15784b) * 31, 31), 31), 31);
    }

    public /* synthetic */ a(float f9, float f10, float f11, float f12, int i3) {
        this((i3 & 1) != 0 ? Float.NaN : f9, (i3 & 2) != 0 ? Float.NaN : f10, (i3 & 4) != 0 ? Float.NaN : f11, (i3 & 8) != 0 ? Float.NaN : f12, true);
    }
}
