package p019c;

/* JADX INFO: loaded from: classes.dex */
public final class s implements androidx.lifecycle.InterfaceC1538u, p019c.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.AbstractC1534p f18085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p019c.n f18086i;
    public p019c.t j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p019c.u f18087k;

    public s(p019c.u uVar, androidx.lifecycle.AbstractC1534p abstractC1534p, p019c.n onBackPressedCallback) {
        kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
        this.f18087k = uVar;
        this.f18085h = abstractC1534p;
        this.f18086i = onBackPressedCallback;
        abstractC1534p.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC1538u
    public final void b(androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.EnumC1532n enumC1532n) {
        if (enumC1532n != androidx.lifecycle.EnumC1532n.ON_START) {
            if (enumC1532n != androidx.lifecycle.EnumC1532n.ON_STOP) {
                if (enumC1532n == androidx.lifecycle.EnumC1532n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                p019c.t tVar = this.j;
                if (tVar != null) {
                    tVar.cancel();
                    return;
                }
                return;
            }
        }
        p019c.u uVar = this.f18087k;
        uVar.getClass();
        p019c.n onBackPressedCallback = this.f18086i;
        kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
        uVar.f18091b.addLast(onBackPressedCallback);
        p019c.t tVar2 = new p019c.t(uVar, onBackPressedCallback);
        onBackPressedCallback.f18073b.add(tVar2);
        uVar.e();
        onBackPressedCallback.f18074c = new E5.C0313s0(0, uVar, p019c.u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 10);
        this.j = tVar2;
    }

    @Override // p019c.b
    public final void cancel() {
        this.f18085h.b(this);
        this.f18086i.f18073b.remove(this);
        p019c.t tVar = this.j;
        if (tVar != null) {
            tVar.cancel();
        }
        this.j = null;
    }
}
