package p045e8;

import p063g8.u;
import p063g8.v;

public final class D extends v {

    public final a0 f21486e;

    public D() {
        a0 a0Var = a0.f21531i;
        u uVar = j0.f21546a;
        a0 a0Var2 = a0.f21530h;
        super(uVar, 2, null);
        this.f21486e = a0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            return this.f21486e == ((D) obj).f21486e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21486e.hashCode();
    }
}
