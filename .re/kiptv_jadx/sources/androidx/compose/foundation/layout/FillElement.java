package androidx.compose.foundation.layout;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "LQ0/X;", "LB/B;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FillElement extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B.A f15782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15783c;

    public FillElement(B.A a2, float f9) {
        this.f15782b = a2;
        this.f15783c = f9;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        B.B b9 = new B.B();
        b9.f461v = this.f15782b;
        b9.f462w = this.f15783c;
        return b9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.foundation.layout.FillElement)) {
            return false;
        }
        androidx.compose.foundation.layout.FillElement fillElement = (androidx.compose.foundation.layout.FillElement) obj;
        return this.f15782b == fillElement.f15782b && this.f15783c == fillElement.f15783c;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        B.B b9 = (B.B) oVar;
        b9.f461v = this.f15782b;
        b9.f462w = this.f15783c;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f15783c) + (this.f15782b.hashCode() * 31);
    }
}
