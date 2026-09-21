package p137q0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq0/t;", "LQ0/X;", "Lq0/u;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class t extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f26494b;

    public t(float f9) {
        this.f26494b = f9;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        p137q0.u uVar = new p137q0.u();
        uVar.f26495v = this.f26494b;
        return uVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p137q0.t) && java.lang.Float.compare(this.f26494b, ((p137q0.t) obj).f26494b) == 0;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((p137q0.u) oVar).f26495v = this.f26494b;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f26494b);
    }

    public final java.lang.String toString() {
        return p121o0.p.q(new java.lang.StringBuilder("ZIndexElement(zIndex="), this.f26494b, ')');
    }
}
