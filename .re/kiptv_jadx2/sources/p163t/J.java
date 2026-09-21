package p163t;

import kotlin.jvm.internal.m;
import p121o0.p;

public final class J {

    public final Float f27476a;

    public InterfaceC2780y f27477b;

    public J(Float f9, InterfaceC2780y interfaceC2780y) {
        this.f27476a = f9;
        this.f27477b = interfaceC2780y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return j.f27476a.equals(this.f27476a) && m.a(j.f27477b, this.f27477b);
    }

    public final int hashCode() {
        return this.f27477b.hashCode() + p.d(0, this.f27476a.hashCode() * 31, 31);
    }
}
