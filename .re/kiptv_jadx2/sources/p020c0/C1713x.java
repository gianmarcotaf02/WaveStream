package p020c0;

import kotlin.jvm.internal.m;
import p129p0.c;

public final class C1713x implements c {

    public final InterfaceC1707u f18384h;

    public C1713x(InterfaceC1707u interfaceC1707u) {
        this.f18384h = interfaceC1707u;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1713x) {
            return m.a(this.f18384h, ((C1713x) obj).f18384h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18384h.hashCode() * 31;
    }
}
