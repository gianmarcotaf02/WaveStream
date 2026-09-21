package v;

import Q0.InterfaceC0779m;
import p188x0.C3098s;

public final class J extends p137q0.o implements InterfaceC0779m {

    public final p202z.k f28870v;

    public boolean f28871w;

    public boolean f28872x;
    public boolean y;

    public J(p202z.k kVar) {
        this.f28870v = kVar;
    }

    @Override
    public final void F0() {
        S7.C.A(B0(), null, new I(this, null), 3);
    }

    @Override
    public final void T(Q0.H h9) {
        h9.a();
        boolean z6 = this.f28871w;
        p203z0.b bVar = h9.f8266h;
        if (z6) {
            p203z0.d.u(h9, C3098s.c(C3098s.f31123b, 0.3f), 0L, bVar.d(), 0.0f, 122);
        } else if (this.f28872x || this.y) {
            p203z0.d.u(h9, C3098s.c(C3098s.f31123b, 0.1f), 0L, bVar.d(), 0.0f, 122);
        }
    }
}
