package p045e8;

import p063g8.v;

public final class C2141y extends v {

    public final a0 f21604e;

    public C2141y(a0 a0Var) {
        super(AbstractC2128k.f21552c, a0Var == a0.f21531i ? 2 : 1, a0Var == a0.j ? 2 : null);
        this.f21604e = a0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2141y) {
            return this.f21604e == ((C2141y) obj).f21604e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21604e.hashCode();
    }
}
