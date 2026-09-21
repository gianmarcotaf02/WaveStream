package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends S7.C0895k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final S7.p0 f9595p;

    public l0(S7.p0 p0Var, p100l6.c cVar) {
        super(1, cVar);
        this.f9595p = p0Var;
    }

    @Override // S7.C0895k
    public final java.lang.Throwable p(S7.p0 p0Var) {
        java.lang.Throwable thC;
        S7.p0 p0Var2 = this.f9595p;
        p0Var2.getClass();
        java.lang.Object obj = S7.p0.f9610h.get(p0Var2);
        if (!(obj instanceof S7.n0) || (thC = ((S7.n0) obj).c()) == null) {
            return obj instanceof S7.C0903t ? ((S7.C0903t) obj).f9620a : p0Var.t();
        }
        return thC;
    }

    @Override // S7.C0895k
    public final java.lang.String x() {
        return "AwaitContinuation";
    }
}
