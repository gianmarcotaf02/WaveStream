package p175v0;

/* JADX INFO: renamed from: v0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv0/c;", "LQ0/X;", "Lv0/e;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C2908c extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p194x6.j f29065b;

    public C2908c(p194x6.j jVar) {
        this.f29065b = jVar;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        p175v0.C2910e c2910e = new p175v0.C2910e();
        c2910e.f29066v = this.f29065b;
        return c2910e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p175v0.C2908c) {
            return this.f29065b == ((p175v0.C2908c) obj).f29065b;
        }
        return false;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((p175v0.C2910e) oVar).f29066v = this.f29065b;
    }

    public final int hashCode() {
        return this.f29065b.hashCode();
    }
}
