package F;

/* JADX INFO: renamed from: F.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LF/t;", "LQ0/X;", "LF/u;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class C0354t extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.C0357w f3489b;

    public C0354t(F.C0357w c0357w) {
        this.f3489b = c0357w;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        F.C0355u c0355u = new F.C0355u();
        c0355u.f3490v = this.f3489b;
        return c0355u;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F.C0354t) && kotlin.jvm.internal.m.a(this.f3489b, ((F.C0354t) obj).f3489b);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        F.C0355u c0355u = (F.C0355u) oVar;
        F.C0357w c0357w = c0355u.f3490v;
        F.C0357w c0357w2 = this.f3489b;
        if (kotlin.jvm.internal.m.a(c0357w, c0357w2) || !c0355u.f26475h.f26487u) {
            return;
        }
        F.C0357w c0357w3 = c0355u.f3490v;
        c0357w3.d();
        c0357w3.f3494b = null;
        c0357w2.getClass();
        c0355u.f3490v = c0357w2;
    }

    public final int hashCode() {
        return this.f3489b.hashCode();
    }

    public final java.lang.String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f3489b + ')';
    }
}
