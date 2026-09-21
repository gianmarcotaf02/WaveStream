package H6;

import E6.InterfaceC0335h;

public final class M extends e0 implements E6.l {

    public final Object f4383w;

    public M(G container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
        this.f4383w = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new A7.k(9, this));
    }

    @Override
    public final InterfaceC0335h getSetter() {
        return (L) this.f4383w.getValue();
    }

    @Override
    public final void set(Object obj, Object obj2) {
        ((L) this.f4383w.getValue()).call(obj, obj2);
    }

    @Override
    public final E6.k getSetter() {
        return (L) this.f4383w.getValue();
    }

    public M(G container, Q6.I descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.f4383w = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new A7.k(9, this));
    }
}
