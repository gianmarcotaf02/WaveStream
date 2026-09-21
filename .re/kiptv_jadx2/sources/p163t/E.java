package p163t;

import N2.e;
import kotlin.jvm.internal.m;

public final class E implements InterfaceC2766l {

    public final InterfaceC2779x f27450a;

    public final T f27451b;

    public final long f27452c;

    public E(InterfaceC2779x interfaceC2779x, T t9, long j) {
        this.f27450a = interfaceC2779x;
        this.f27451b = t9;
        this.f27452c = j;
    }

    @Override
    public final G0 a(E0 e6) {
        return new e(this.f27450a.a(e6), this.f27451b, this.f27452c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof E) {
            E e6 = (E) obj;
            if (m.a(e6.f27450a, this.f27450a) && e6.f27451b == this.f27451b && e6.f27452c == this.f27452c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27452c) + ((this.f27451b.hashCode() + (this.f27450a.hashCode() * 31)) * 31);
    }
}
