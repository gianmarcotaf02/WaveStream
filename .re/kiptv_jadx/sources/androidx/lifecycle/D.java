package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class D extends androidx.lifecycle.E implements androidx.lifecycle.InterfaceC1538u {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.InterfaceC1540w f16273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.F f16274m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(androidx.lifecycle.F f9, androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.H h9) {
        super(f9, h9);
        this.f16274m = f9;
        this.f16273l = interfaceC1540w;
    }

    @Override // androidx.lifecycle.InterfaceC1538u
    public final void b(androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.EnumC1532n enumC1532n) {
        androidx.lifecycle.InterfaceC1540w interfaceC1540w2 = this.f16273l;
        androidx.lifecycle.EnumC1533o enumC1533o = ((androidx.lifecycle.C1542y) interfaceC1540w2.getLifecycle()).f16379d;
        if (enumC1533o == androidx.lifecycle.EnumC1533o.f16364h) {
            this.f16274m.h(this.f16275h);
            return;
        }
        androidx.lifecycle.EnumC1533o enumC1533o2 = null;
        while (enumC1533o2 != enumC1533o) {
            a(e());
            enumC1533o2 = enumC1533o;
            enumC1533o = ((androidx.lifecycle.C1542y) interfaceC1540w2.getLifecycle()).f16379d;
        }
    }

    @Override // androidx.lifecycle.E
    public final void c() {
        this.f16273l.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.E
    public final boolean d(androidx.lifecycle.InterfaceC1540w interfaceC1540w) {
        return this.f16273l == interfaceC1540w;
    }

    @Override // androidx.lifecycle.E
    public final boolean e() {
        return ((androidx.lifecycle.C1542y) this.f16273l.getLifecycle()).f16379d.compareTo(androidx.lifecycle.EnumC1533o.f16366k) >= 0;
    }
}
