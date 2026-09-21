package H6;

import E6.InterfaceC0335h;
import N6.InterfaceC0689c;

public abstract class n0 extends j0 implements InterfaceC0335h {

    public static final E6.u[] f4460p = {kotlin.jvm.internal.B.f24540a.h(new kotlin.jvm.internal.u(n0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

    public final v0 f4461n = p000a.a.A(null, new m0(this, 0));

    public final Object f4462o = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new m0(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof n0) && kotlin.jvm.internal.m.a(s(), ((n0) obj).s());
    }

    @Override
    public final String getName() {
        return Y6.f.l(new StringBuilder("<set-"), s().f4471o, '>');
    }

    public final int hashCode() {
        return s().hashCode();
    }

    @Override
    public final I6.g k() {
        return (I6.g) this.f4462o.getValue();
    }

    @Override
    public final InterfaceC0689c n() {
        E6.u uVar = f4460p[0];
        Object objInvoke = this.f4461n.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (Q6.K) objInvoke;
    }

    @Override
    public final N6.M r() {
        E6.u uVar = f4460p[0];
        Object objInvoke = this.f4461n.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (Q6.K) objInvoke;
    }

    public final String toString() {
        return "setter of " + s();
    }
}
