package Y0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LY0/b;", "LQ0/X;", "LY0/d;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class b extends Q0.X implements p137q0.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p194x6.j f11027c;

    public b(boolean z6, p194x6.j jVar) {
        this.f11026b = z6;
        this.f11027c = jVar;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        Y0.d dVar = new Y0.d();
        dVar.f11030v = this.f11026b;
        dVar.f11031w = this.f11027c;
        return dVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0.b)) {
            return false;
        }
        Y0.b bVar = (Y0.b) obj;
        return this.f11026b == bVar.f11026b && this.f11027c == bVar.f11027c;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        Y0.d dVar = (Y0.d) oVar;
        dVar.f11030v = this.f11026b;
        dVar.f11031w = this.f11027c;
    }

    public final int hashCode() {
        return this.f11027c.hashCode() + (java.lang.Boolean.hashCode(this.f11026b) * 31);
    }
}
