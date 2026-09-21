package F;

/* JADX INFO: renamed from: F.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LF/m;", "LQ0/X;", "LF/q;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C0348m extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.r f3474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F.C0347l f3475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x.EnumC3061p0 f3476d;

    public C0348m(F.r rVar, F.C0347l c0347l, x.EnumC3061p0 enumC3061p0) {
        this.f3474b = rVar;
        this.f3475c = c0347l;
        this.f3476d = enumC3061p0;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        F.C0352q c0352q = new F.C0352q();
        c0352q.f3486v = this.f3474b;
        c0352q.f3487w = this.f3475c;
        c0352q.f3488x = this.f3476d;
        return c0352q;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F.C0348m)) {
            return false;
        }
        F.C0348m c0348m = (F.C0348m) obj;
        return kotlin.jvm.internal.m.a(this.f3474b, c0348m.f3474b) && kotlin.jvm.internal.m.a(this.f3475c, c0348m.f3475c) && this.f3476d == c0348m.f3476d;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        F.C0352q c0352q = (F.C0352q) oVar;
        c0352q.f3486v = this.f3474b;
        c0352q.f3487w = this.f3475c;
        c0352q.f3488x = this.f3476d;
    }

    public final int hashCode() {
        return this.f3476d.hashCode() + p121o0.p.f((this.f3475c.hashCode() + (this.f3474b.hashCode() * 31)) * 31, 31, false);
    }
}
