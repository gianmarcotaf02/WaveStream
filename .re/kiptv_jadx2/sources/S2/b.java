package S2;

import S7.InterfaceC0891h0;

public final class b implements p {

    public final InterfaceC0891h0 f9212h;

    public b(InterfaceC0891h0 interfaceC0891h0) {
        this.f9212h = interfaceC0891h0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return kotlin.jvm.internal.m.a(this.f9212h, ((b) obj).f9212h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9212h.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f9212h + ')';
    }
}
