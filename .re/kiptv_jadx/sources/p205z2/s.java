package p205z2;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz2/s;", "LQ0/X;", "Lz2/t;", "tv-material_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class s extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p188x0.O f32307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p205z2.C3166b f32308c;

    public s(p188x0.O o8, p205z2.C3166b c3166b) {
        this.f32307b = o8;
        this.f32308c = c3166b;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        p205z2.t tVar = new p205z2.t();
        tVar.f32309v = this.f32307b;
        tVar.f32310w = this.f32308c;
        return tVar;
    }

    public final boolean equals(java.lang.Object obj) {
        p205z2.s sVar = obj instanceof p205z2.s ? (p205z2.s) obj : null;
        return sVar != null && kotlin.jvm.internal.m.a(this.f32307b, sVar.f32307b) && kotlin.jvm.internal.m.a(this.f32308c, sVar.f32308c);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        p205z2.t tVar = (p205z2.t) oVar;
        tVar.f32309v = this.f32307b;
        tVar.f32310w = this.f32308c;
    }

    public final int hashCode() {
        return this.f32308c.hashCode() + (this.f32307b.hashCode() * 31);
    }
}
