package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements p020c0.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p163t.y0 f27438b;

    public /* synthetic */ B0(p163t.y0 y0Var, int i3) {
        this.f27437a = i3;
        this.f27438b = y0Var;
    }

    @Override // p020c0.H
    public final void dispose() {
        switch (this.f27437a) {
            case 0:
                p163t.y0 y0Var = this.f27438b;
                y0Var.i();
                y0Var.f27727a.C0();
                break;
            default:
                p163t.y0 y0Var2 = this.f27438b;
                y0Var2.i();
                y0Var2.f27727a.C0();
                break;
        }
    }
}
