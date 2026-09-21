package p019c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.InterfaceC1538u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p019c.u f18034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p019c.k f18035i;

    public /* synthetic */ e(p019c.u uVar, p019c.k kVar) {
        this.f18034h = uVar;
        this.f18035i = kVar;
    }

    @Override // androidx.lifecycle.InterfaceC1538u
    public final void b(androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.EnumC1532n enumC1532n) {
        if (enumC1532n == androidx.lifecycle.EnumC1532n.ON_CREATE) {
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherA = E1.e.a(this.f18035i);
            p019c.u uVar = this.f18034h;
            uVar.f18094e = onBackInvokedDispatcherA;
            uVar.d(uVar.g);
        }
    }
}
