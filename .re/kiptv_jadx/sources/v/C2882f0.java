package v;

/* JADX INFO: renamed from: v.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv/f0;", "LQ0/X;", "Lv/g0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C2882f0 extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p202z.k f28937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v.InterfaceC2886h0 f28938c;

    public C2882f0(p202z.k kVar, v.InterfaceC2886h0 interfaceC2886h0) {
        this.f28937b = kVar;
        this.f28938c = interfaceC2886h0;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        Q0.InterfaceC0775i interfaceC0775iA = this.f28938c.a(this.f28937b);
        v.C2884g0 c2884g0 = new v.C2884g0();
        c2884g0.f28943x = interfaceC0775iA;
        c2884g0.N0(interfaceC0775iA);
        return c2884g0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v.C2882f0)) {
            return false;
        }
        v.C2882f0 c2882f0 = (v.C2882f0) obj;
        return kotlin.jvm.internal.m.a(this.f28937b, c2882f0.f28937b) && kotlin.jvm.internal.m.a(this.f28938c, c2882f0.f28938c);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        v.C2884g0 c2884g0 = (v.C2884g0) oVar;
        Q0.InterfaceC0775i interfaceC0775iA = this.f28938c.a(this.f28937b);
        c2884g0.O0(c2884g0.f28943x);
        c2884g0.f28943x = interfaceC0775iA;
        c2884g0.N0(interfaceC0775iA);
    }

    public final int hashCode() {
        return this.f28938c.hashCode() + (this.f28937b.hashCode() * 31);
    }
}
