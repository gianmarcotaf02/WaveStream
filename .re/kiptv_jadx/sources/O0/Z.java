package O0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0/Z;", "LQ0/X;", "LO0/a0;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class Z extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p194x6.j f7621b;

    public Z(p194x6.j jVar) {
        this.f7621b = jVar;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        O0.a0 a0Var = new O0.a0();
        a0Var.f7623v = this.f7621b;
        return a0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O0.Z) {
            return this.f7621b == ((O0.Z) obj).f7621b;
        }
        return false;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((O0.a0) oVar).f7623v = this.f7621b;
    }

    public final int hashCode() {
        return this.f7621b.hashCode();
    }
}
