package p187w7;

import C7.AbstractC0191x;
import C7.B;
import N6.InterfaceC0691e;
import kotlin.jvm.internal.m;

public final class c implements d {

    public final InterfaceC0691e f30474h;

    public c(InterfaceC0691e classDescriptor) {
        m.e(classDescriptor, "classDescriptor");
        this.f30474h = classDescriptor;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return m.a(this.f30474h, cVar != null ? cVar.f30474h : null);
    }

    @Override
    public final AbstractC0191x getType() {
        B bJ = this.f30474h.j();
        m.d(bJ, "getDefaultType(...)");
        return bJ;
    }

    public final int hashCode() {
        return this.f30474h.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        B bJ = this.f30474h.j();
        m.d(bJ, "getDefaultType(...)");
        sb.append(bJ);
        sb.append('}');
        return sb.toString();
    }
}
