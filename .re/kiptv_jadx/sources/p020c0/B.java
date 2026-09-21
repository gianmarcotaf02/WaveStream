package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class B implements p020c0.C0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S7.A f18098h;

    public B(S7.A a2) {
        this.f18098h = a2;
    }

    @Override // p020c0.C0
    public final void a() {
        S7.A a2 = this.f18098h;
        if (a2 instanceof p020c0.F0) {
            ((p020c0.F0) a2).b();
        } else {
            S7.C.i(a2, new p020c0.K(1));
        }
    }

    @Override // p020c0.C0
    public final void c() {
        S7.A a2 = this.f18098h;
        if (a2 instanceof p020c0.F0) {
            ((p020c0.F0) a2).b();
        } else {
            S7.C.i(a2, new p020c0.K(1));
        }
    }

    @Override // p020c0.C0
    public final void d() {
    }
}
