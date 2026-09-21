package I0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LI0/d;", "LQ0/X;", "LI0/f;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class d extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p194x6.j f4569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p194x6.j f4570c;

    public d(p194x6.j jVar, p194x6.j jVar2) {
        this.f4569b = jVar;
        this.f4570c = jVar2;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        I0.f fVar = new I0.f();
        fVar.f4571v = this.f4569b;
        fVar.f4572w = this.f4570c;
        return fVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0.d)) {
            return false;
        }
        I0.d dVar = (I0.d) obj;
        return this.f4569b == dVar.f4569b && this.f4570c == dVar.f4570c;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        I0.f fVar = (I0.f) oVar;
        fVar.f4571v = this.f4569b;
        fVar.f4572w = this.f4570c;
    }

    public final int hashCode() {
        p194x6.j jVar = this.f4569b;
        int iHashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        p194x6.j jVar2 = this.f4570c;
        return iHashCode + (jVar2 != null ? jVar2.hashCode() : 0);
    }
}
