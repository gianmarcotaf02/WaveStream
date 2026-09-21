package p175v0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv0/s;", "LQ0/X;", "Lv0/x;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class s extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p175v0.v f29088b;

    public s(p175v0.v vVar) {
        this.f29088b = vVar;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        p175v0.x xVar = new p175v0.x();
        xVar.f29102v = this.f29088b;
        return xVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p175v0.s) && kotlin.jvm.internal.m.a(this.f29088b, ((p175v0.s) obj).f29088b);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((p175v0.x) oVar).f29102v = this.f29088b;
    }

    public final int hashCode() {
        return this.f29088b.f29101h.hashCode();
    }

    public final java.lang.String toString() {
        return "FocusPropertiesElement(scope=" + this.f29088b + ')';
    }
}
