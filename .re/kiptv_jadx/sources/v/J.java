package v;

/* JADX INFO: loaded from: classes.dex */
public final class J extends p137q0.o implements Q0.InterfaceC0779m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p202z.k f28870v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f28871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f28872x;
    public boolean y;

    public J(p202z.k kVar) {
        this.f28870v = kVar;
    }

    @Override // p137q0.o
    public final void F0() {
        S7.C.A(B0(), null, new v.I(this, null), 3);
    }

    @Override // Q0.InterfaceC0779m
    public final void T(Q0.H h9) {
        h9.a();
        boolean z6 = this.f28871w;
        p203z0.b bVar = h9.f8266h;
        if (z6) {
            p203z0.d.u(h9, p188x0.C3098s.c(p188x0.C3098s.f31123b, 0.3f), 0L, bVar.d(), 0.0f, 122);
        } else if (this.f28872x || this.y) {
            p203z0.d.u(h9, p188x0.C3098s.c(p188x0.C3098s.f31123b, 0.1f), 0L, bVar.d(), 0.0f, 122);
        }
    }
}
