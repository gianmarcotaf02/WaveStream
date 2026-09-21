package F;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LF/X;", "LQ0/X;", "LF/b0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class X extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E6.r f3394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F.W f3395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x.EnumC3061p0 f3396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3397e;

    public X(E6.r rVar, F.W w6, x.EnumC3061p0 enumC3061p0, boolean z6) {
        this.f3394b = rVar;
        this.f3395c = w6;
        this.f3396d = enumC3061p0;
        this.f3397e = z6;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        x.EnumC3061p0 enumC3061p0 = this.f3396d;
        return new F.b0(this.f3394b, this.f3395c, enumC3061p0, this.f3397e);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F.X)) {
            return false;
        }
        F.X x9 = (F.X) obj;
        return this.f3394b == x9.f3394b && kotlin.jvm.internal.m.a(this.f3395c, x9.f3395c) && this.f3396d == x9.f3396d && this.f3397e == x9.f3397e;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        F.b0 b0Var = (F.b0) oVar;
        b0Var.f3415v = this.f3394b;
        b0Var.f3416w = this.f3395c;
        x.EnumC3061p0 enumC3061p0 = b0Var.f3417x;
        x.EnumC3061p0 enumC3061p1 = this.f3396d;
        if (enumC3061p0 != enumC3061p1) {
            b0Var.f3417x = enumC3061p1;
            Q0.AbstractC0777k.l(b0Var);
        }
        boolean z6 = b0Var.y;
        boolean z9 = this.f3397e;
        if (z6 == z9) {
            return;
        }
        b0Var.y = z9;
        b0Var.N0();
        Q0.AbstractC0777k.l(b0Var);
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(false) + p121o0.p.f((this.f3396d.hashCode() + ((this.f3395c.hashCode() + (this.f3394b.hashCode() * 31)) * 31)) * 31, 31, this.f3397e);
    }
}
