package C7;

import N6.InterfaceC0694h;

public final class C0187t extends T {

    public final N6.U[] f1602b;

    public final P[] f1603c;

    public final boolean f1604d;

    public C0187t(N6.U[] parameters, P[] arguments, boolean z6) {
        kotlin.jvm.internal.m.e(parameters, "parameters");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        this.f1602b = parameters;
        this.f1603c = arguments;
        this.f1604d = z6;
    }

    @Override
    public final boolean b() {
        return this.f1604d;
    }

    @Override
    public final P d(AbstractC0191x abstractC0191x) {
        InterfaceC0694h interfaceC0694hH = abstractC0191x.u0().h();
        N6.U u6 = interfaceC0694hH instanceof N6.U ? (N6.U) interfaceC0694hH : null;
        if (u6 != null) {
            int index = u6.getIndex();
            N6.U[] uArr = this.f1602b;
            if (index < uArr.length && kotlin.jvm.internal.m.a(uArr[index].o(), u6.o())) {
                return this.f1603c[index];
            }
        }
        return null;
    }

    @Override
    public final boolean e() {
        return this.f1603c.length == 0;
    }
}
