package androidx.lifecycle;

public final class D extends E implements InterfaceC1538u {

    public final InterfaceC1540w f16273l;

    public final F f16274m;

    public D(F f9, InterfaceC1540w interfaceC1540w, H h9) {
        super(f9, h9);
        this.f16274m = f9;
        this.f16273l = interfaceC1540w;
    }

    @Override
    public final void b(InterfaceC1540w interfaceC1540w, EnumC1532n enumC1532n) {
        InterfaceC1540w interfaceC1540w2 = this.f16273l;
        EnumC1533o enumC1533o = ((C1542y) interfaceC1540w2.getLifecycle()).f16379d;
        if (enumC1533o == EnumC1533o.f16364h) {
            this.f16274m.h(this.f16275h);
            return;
        }
        EnumC1533o enumC1533o2 = null;
        while (enumC1533o2 != enumC1533o) {
            a(e());
            enumC1533o2 = enumC1533o;
            enumC1533o = ((C1542y) interfaceC1540w2.getLifecycle()).f16379d;
        }
    }

    @Override
    public final void c() {
        this.f16273l.getLifecycle().b(this);
    }

    @Override
    public final boolean d(InterfaceC1540w interfaceC1540w) {
        return this.f16273l == interfaceC1540w;
    }

    @Override
    public final boolean e() {
        return ((C1542y) this.f16273l.getLifecycle()).f16379d.compareTo(EnumC1533o.f16366k) >= 0;
    }
}
