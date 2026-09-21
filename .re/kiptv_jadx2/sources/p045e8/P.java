package p045e8;

import p063g8.u;
import p063g8.v;

public final class P extends v {

    public final a0 f21517e;

    public P() {
        a0 a0Var = a0.f21531i;
        u uVar = AbstractC2128k.f21551b;
        a0 a0Var2 = a0.f21530h;
        super(uVar, 2, null);
        this.f21517e = a0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof P) {
            return this.f21517e == ((P) obj).f21517e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21517e.hashCode();
    }
}
