package p163t;

import kotlin.jvm.internal.m;

public final class C2763j0 implements InterfaceC2766l {

    public final A f27621a;

    public final long f27622b;

    public C2763j0(A a2, long j) {
        this.f27621a = a2;
        this.f27622b = j;
    }

    @Override
    public final G0 a(E0 e6) {
        return new C2765k0(this.f27621a.a(e6), this.f27622b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2763j0)) {
            return false;
        }
        C2763j0 c2763j0 = (C2763j0) obj;
        return c2763j0.f27622b == this.f27622b && m.a(c2763j0.f27621a, this.f27621a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f27622b) + (this.f27621a.hashCode() * 31);
    }
}
