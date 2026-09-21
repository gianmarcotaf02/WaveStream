package Q6;

import N6.InterfaceC0697k;
import N6.InterfaceC0699m;

public abstract class C extends AbstractC0805n implements N6.G {

    public final p101l7.c f8549l;

    public final String f8550m;

    public C(N6.B module, p101l7.c fqName) {
        kotlin.jvm.internal.m.e(module, "module");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        O6.f fVar = O6.g.f7987a;
        p101l7.d dVar = fqName.f24829a;
        super(module, fVar, dVar.c() ? p101l7.d.f24831e : dVar.f(), N6.P.f7377b);
        this.f8549l = fqName;
        this.f8550m = "package " + fqName + " of " + module;
    }

    @Override
    public final Object B(InterfaceC0699m interfaceC0699m, Object obj) {
        return interfaceC0699m.t(this, obj);
    }

    @Override
    public final N6.B h() {
        InterfaceC0697k interfaceC0697kH = super.h();
        kotlin.jvm.internal.m.c(interfaceC0697kH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (N6.B) interfaceC0697kH;
    }

    @Override
    public N6.P d() {
        return N6.P.f7377b;
    }

    @Override
    public String toString() {
        return this.f8550m;
    }
}
