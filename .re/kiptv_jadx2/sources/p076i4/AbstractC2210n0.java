package p076i4;

import java.util.Arrays;

public abstract class AbstractC2210n0 extends W implements K0 {

    public static final int f22924k = 0;

    public transient S0 f22925i;
    public transient AbstractC2214p0 j;

    @Override
    public final boolean contains(Object obj) {
        return ((Y0) this).f22853l.b(obj) > 0;
    }

    @Override
    public final AbstractC2186b0 d() {
        S0 s9 = this.f22925i;
        if (s9 != null) {
            return s9;
        }
        AbstractC2186b0 abstractC2186b0D = super.d();
        this.f22925i = (S0) abstractC2186b0D;
        return abstractC2186b0D;
    }

    @Override
    public final int e(Object[] objArr, int i3) {
        j1 it = s().iterator();
        while (it.hasNext()) {
            M0 m8 = (M0) it.next();
            Arrays.fill(objArr, i3, m8.a() + i3, m8.f22813a);
            i3 += m8.a();
        }
        return i3;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k1 = (K0) obj;
        Y0 y9 = (Y0) this;
        if (y9.size() != k1.size()) {
            return false;
        }
        AbstractC2210n0 abstractC2210n0 = (AbstractC2210n0) k1;
        if (s().size() != abstractC2210n0.s().size()) {
            return false;
        }
        for (M0 m8 : abstractC2210n0.s()) {
            if (y9.f22853l.b(m8.f22813a) != m8.a()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return AbstractC2230y.n(s());
    }

    @Override
    public final j1 iterator() {
        return new C2204k0(s().iterator());
    }

    public abstract AbstractC2214p0 r();

    public final AbstractC2214p0 s() {
        AbstractC2214p0 c2208m0 = this.j;
        if (c2208m0 == null) {
            c2208m0 = isEmpty() ? Z0.f22857q : new C2208m0(this, 0);
            this.j = c2208m0;
        }
        return c2208m0;
    }

    @Override
    public final String toString() {
        return s().toString();
    }
}
