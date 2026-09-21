package S7;

/* JADX INFO: renamed from: S7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0899o extends S7.k0 implements S7.InterfaceC0898n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final S7.p0 f9605l;

    public C0899o(S7.p0 p0Var) {
        this.f9605l = p0Var;
    }

    @Override // S7.InterfaceC0898n
    public final boolean b(java.lang.Throwable th) {
        return h().r(th);
    }

    @Override // S7.k0
    public final boolean i() {
        return true;
    }

    @Override // S7.k0
    public final void j(java.lang.Throwable th) {
        this.f9605l.l(h());
    }
}
