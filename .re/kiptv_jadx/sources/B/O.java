package B;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB/O;", "LQ0/X;", "LB/P;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class O extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f486e;

    public O(float f9, float f10, float f11, float f12) {
        this.f483b = f9;
        this.f484c = f10;
        this.f485d = f11;
        this.f486e = f12;
        boolean z6 = true;
        boolean z9 = (f9 >= 0.0f || java.lang.Float.isNaN(f9)) & (f10 >= 0.0f || java.lang.Float.isNaN(f10)) & (f11 >= 0.0f || java.lang.Float.isNaN(f11));
        if (f12 < 0.0f && !java.lang.Float.isNaN(f12)) {
            z6 = false;
        }
        if (!z9 || !z6) {
            C.a.a("Padding must be non-negative");
        }
    }

    @Override // Q0.X
    public final p137q0.o e() {
        B.P p2 = new B.P();
        p2.f487v = this.f483b;
        p2.f488w = this.f484c;
        p2.f489x = this.f485d;
        p2.y = this.f486e;
        p2.f490z = true;
        return p2;
    }

    public final boolean equals(java.lang.Object obj) {
        B.O o8 = obj instanceof B.O ? (B.O) obj : null;
        return o8 != null && p113n1.f.c(this.f483b, o8.f483b) && p113n1.f.c(this.f484c, o8.f484c) && p113n1.f.c(this.f485d, o8.f485d) && p113n1.f.c(this.f486e, o8.f486e);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        B.P p2 = (B.P) oVar;
        p2.f487v = this.f483b;
        p2.f488w = this.f484c;
        p2.f489x = this.f485d;
        p2.y = this.f486e;
        p2.f490z = true;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(true) + p121o0.p.c(this.f486e, p121o0.p.c(this.f485d, p121o0.p.c(this.f484c, java.lang.Float.hashCode(this.f483b) * 31, 31), 31), 31);
    }
}
