package p163t;

import kotlin.jvm.internal.m;

public final class t0 implements s0 {

    public final Object f27695a;

    public final Object f27696b;

    public t0(Object obj, Object obj2) {
        this.f27695a = obj;
        this.f27696b = obj2;
    }

    @Override
    public final Object a() {
        return this.f27695a;
    }

    @Override
    public final Object b() {
        return this.f27696b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (m.a(this.f27695a, s0Var.a())) {
            return m.a(this.f27696b, s0Var.b());
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f27695a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f27696b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
