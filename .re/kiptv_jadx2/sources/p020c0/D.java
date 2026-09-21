package p020c0;

import kotlin.jvm.internal.m;
import p194x6.j;

public final class D implements h1 {

    public final j f18103a;

    public D(j jVar) {
        this.f18103a = jVar;
    }

    @Override
    public final Object a(InterfaceC1691l0 interfaceC1691l0) {
        return this.f18103a.invoke(interfaceC1691l0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && m.a(this.f18103a, ((D) obj).f18103a);
    }

    public final int hashCode() {
        return this.f18103a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f18103a + ')';
    }
}
