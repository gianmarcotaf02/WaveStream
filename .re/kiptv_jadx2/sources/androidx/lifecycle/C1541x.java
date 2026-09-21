package androidx.lifecycle;

public final class C1541x {

    public EnumC1533o f16375a;

    public InterfaceC1538u f16376b;

    public final void a(InterfaceC1540w interfaceC1540w, EnumC1532n enumC1532n) {
        EnumC1533o enumC1533oA = enumC1532n.a();
        EnumC1533o state1 = this.f16375a;
        kotlin.jvm.internal.m.e(state1, "state1");
        if (enumC1533oA.compareTo(state1) < 0) {
            state1 = enumC1533oA;
        }
        this.f16375a = state1;
        this.f16376b.b(interfaceC1540w, enumC1532n);
        this.f16375a = enumC1533oA;
    }
}
