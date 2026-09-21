package C7;

import java.util.List;

public abstract class AbstractC0191x implements O6.a, F7.d {

    public int f1612h;

    public abstract p180v7.o N();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0191x)) {
            return false;
        }
        AbstractC0191x abstractC0191x = (AbstractC0191x) obj;
        if (v0() == abstractC0191x.v0()) {
            return AbstractC0171c.y(D7.m.f2491h, x0(), abstractC0191x.x0());
        }
        return false;
    }

    @Override
    public final O6.h getAnnotations() {
        return AbstractC0177i.a(t0());
    }

    public final int hashCode() {
        int iHashCode;
        int i3 = this.f1612h;
        if (i3 != 0) {
            return i3;
        }
        if (AbstractC0171c.j(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (v0() ? 1 : 0) + ((s0().hashCode() + (u0().hashCode() * 31)) * 31);
        }
        this.f1612h = iHashCode;
        return iHashCode;
    }

    public abstract List s0();

    public abstract I t0();

    public abstract M u0();

    public abstract boolean v0();

    public abstract AbstractC0191x w0(D7.f fVar);

    public abstract a0 x0();
}
