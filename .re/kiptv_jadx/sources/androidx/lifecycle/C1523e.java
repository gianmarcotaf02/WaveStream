package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1523e implements androidx.lifecycle.InterfaceC1538u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f16351i;

    public /* synthetic */ C1523e(int i3, java.lang.Object obj) {
        this.f16350h = i3;
        this.f16351i = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1538u
    public final void b(androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.EnumC1532n enumC1532n) {
        switch (this.f16350h) {
            case 0:
                new java.util.HashMap();
                androidx.lifecycle.InterfaceC1527i[] interfaceC1527iArr = (androidx.lifecycle.InterfaceC1527i[]) this.f16351i;
                if (interfaceC1527iArr.length > 0) {
                    androidx.lifecycle.InterfaceC1527i interfaceC1527i = interfaceC1527iArr[0];
                    throw null;
                }
                if (interfaceC1527iArr.length <= 0) {
                    return;
                }
                androidx.lifecycle.InterfaceC1527i interfaceC1527i2 = interfaceC1527iArr[0];
                throw null;
            default:
                if (enumC1532n == androidx.lifecycle.EnumC1532n.ON_CREATE) {
                    interfaceC1540w.getLifecycle().b(this);
                    ((androidx.lifecycle.Y) this.f16351i).b();
                    return;
                } else {
                    throw new java.lang.IllegalStateException(("Next event must be ON_CREATE, it was " + enumC1532n).toString());
                }
        }
    }
}
