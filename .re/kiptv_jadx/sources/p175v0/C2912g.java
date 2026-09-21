package p175v0;

/* JADX INFO: renamed from: v0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv0/g;", "LQ0/X;", "Lv0/i;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C2912g extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p194x6.j f29069b;

    public C2912g(p194x6.j jVar) {
        this.f29069b = jVar;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        p175v0.C2914i c2914i = new p175v0.C2914i();
        c2914i.f29070v = this.f29069b;
        return c2914i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p175v0.C2912g) {
            return this.f29069b == ((p175v0.C2912g) obj).f29069b;
        }
        return false;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((p175v0.C2914i) oVar).f29070v = this.f29069b;
    }

    public final int hashCode() {
        return this.f29069b.hashCode();
    }
}
