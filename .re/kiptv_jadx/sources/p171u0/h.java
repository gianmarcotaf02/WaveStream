package p171u0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu0/h;", "LQ0/X;", "Lu0/i;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class h extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p194x6.j f28657b;

    public h(p194x6.j jVar) {
        this.f28657b = jVar;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        p171u0.i iVar = new p171u0.i();
        iVar.f28658v = this.f28657b;
        return iVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p171u0.h) {
            return this.f28657b == ((p171u0.h) obj).f28657b;
        }
        return false;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((p171u0.i) oVar).f28658v = this.f28657b;
    }

    public final int hashCode() {
        return this.f28657b.hashCode();
    }
}
