package p175v0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv0/z;", "LQ0/X;", "Lv0/B;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class z extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p175v0.y f29107b;

    public z(p175v0.y yVar) {
        this.f29107b = yVar;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        p175v0.B b9 = new p175v0.B();
        b9.f29045v = this.f29107b;
        return b9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p175v0.z) && kotlin.jvm.internal.m.a(this.f29107b, ((p175v0.z) obj).f29107b);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        p175v0.B b9 = (p175v0.B) oVar;
        b9.f29045v.f29106a.l(b9);
        p175v0.y yVar = this.f29107b;
        b9.f29045v = yVar;
        yVar.f29106a.c(b9);
    }

    public final int hashCode() {
        return this.f29107b.hashCode();
    }

    public final java.lang.String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f29107b + ')';
    }
}
