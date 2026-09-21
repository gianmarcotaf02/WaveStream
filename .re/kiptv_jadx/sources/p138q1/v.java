package p138q1;

/* JADX INFO: loaded from: classes.dex */
public final class v extends Q0.AbstractC0776j implements Q0.j0, Q0.InterfaceC0774h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p175v0.F f26571x;
    public F.I y;

    public v() {
        p175v0.F f9 = new p175v0.F(0, new D7.t(2, this, p138q1.v.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 2), 9);
        N0(f9);
        this.f26571x = f9;
    }

    @Override // Q0.j0
    public final void f0() {
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        Q0.AbstractC0777k.p(this, new K0.C0656d(a2, this, 12));
        F.I i3 = (F.I) a2.f24539h;
        if (this.f26571x.S0().b()) {
            F.I i9 = this.y;
            if (i9 != null) {
                i9.b();
            }
            if (i3 != null) {
                i3.a();
            } else {
                i3 = null;
            }
            this.y = i3;
        }
    }
}
