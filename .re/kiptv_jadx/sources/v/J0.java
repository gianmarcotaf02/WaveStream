package v;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv/J0;", "LQ0/X;", "Lv/D0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class J0 extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v.G0 f28873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28874c;

    public J0(v.G0 g9, boolean z6) {
        this.f28873b = g9;
        this.f28874c = z6;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        v.D0 d4 = new v.D0();
        d4.f28813v = this.f28873b;
        d4.f28814w = this.f28874c;
        return d4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof v.J0)) {
            return false;
        }
        v.J0 j9 = (v.J0) obj;
        return kotlin.jvm.internal.m.a(this.f28873b, j9.f28873b) && this.f28874c == j9.f28874c;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        v.D0 d4 = (v.D0) oVar;
        d4.f28813v = this.f28873b;
        d4.f28814w = this.f28874c;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f28874c) + p121o0.p.f(this.f28873b.hashCode() * 31, 31, false);
    }
}
