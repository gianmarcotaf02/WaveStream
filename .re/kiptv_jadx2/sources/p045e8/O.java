package p045e8;

import p063g8.u;
import p063g8.v;

public final class O extends v {

    public final a0 f21516e;

    public O() {
        a0 a0Var = a0.f21531i;
        u uVar = j0.f21547b;
        a0 a0Var2 = a0.f21530h;
        super(uVar, 2, null);
        this.f21516e = a0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O) {
            return this.f21516e == ((O) obj).f21516e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21516e.hashCode();
    }
}
