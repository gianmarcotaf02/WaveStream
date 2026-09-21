package p154s;

/* JADX INFO: renamed from: s.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Ls/l;", "S", "LQ0/X;", "Ls/n;", "animation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C2726l<S> extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p163t.r0 f27153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p020c0.X f27154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p154s.C2729o f27155d;

    public C2726l(p163t.r0 r0Var, p020c0.X x9, p154s.C2729o c2729o) {
        this.f27153b = r0Var;
        this.f27154c = x9;
        this.f27155d = c2729o;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        p154s.C2728n c2728n = new p154s.C2728n();
        c2728n.f27158v = this.f27153b;
        c2728n.f27159w = this.f27154c;
        c2728n.f27160x = this.f27155d;
        c2728n.y = p154s.AbstractC2721g.f27145a;
        return c2728n;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p154s.C2726l)) {
            return false;
        }
        p154s.C2726l c2726l = (p154s.C2726l) obj;
        return kotlin.jvm.internal.m.a(c2726l.f27153b, this.f27153b) && c2726l.f27154c.equals(this.f27154c);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        p154s.C2728n c2728n = (p154s.C2728n) oVar;
        c2728n.f27158v = this.f27153b;
        c2728n.f27159w = this.f27154c;
        c2728n.f27160x = this.f27155d;
    }

    public final int hashCode() {
        int iHashCode = this.f27155d.hashCode() * 31;
        p163t.r0 r0Var = this.f27153b;
        return this.f27154c.hashCode() + ((iHashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31);
    }
}
