package androidx.lifecycle;

import java.util.HashMap;

public final class C1523e implements InterfaceC1538u {

    public final int f16350h;

    public final Object f16351i;

    public C1523e(int i3, Object obj) {
        this.f16350h = i3;
        this.f16351i = obj;
    }

    @Override
    public final void b(InterfaceC1540w interfaceC1540w, EnumC1532n enumC1532n) {
        switch (this.f16350h) {
            case 0:
                new HashMap();
                InterfaceC1527i[] interfaceC1527iArr = (InterfaceC1527i[]) this.f16351i;
                if (interfaceC1527iArr.length > 0) {
                    InterfaceC1527i interfaceC1527i = interfaceC1527iArr[0];
                    throw null;
                }
                if (interfaceC1527iArr.length <= 0) {
                    return;
                }
                InterfaceC1527i interfaceC1527i2 = interfaceC1527iArr[0];
                throw null;
            default:
                if (enumC1532n == EnumC1532n.ON_CREATE) {
                    interfaceC1540w.getLifecycle().b(this);
                    ((Y) this.f16351i).b();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC1532n).toString());
                }
        }
    }
}
