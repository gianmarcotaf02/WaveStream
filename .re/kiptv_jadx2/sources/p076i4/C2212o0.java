package p076i4;

import java.util.Objects;

public final class C2212o0 extends U {
    @Override
    public final V a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final AbstractC2214p0 g() {
        int i3 = this.f22835b;
        if (i3 == 0) {
            int i9 = AbstractC2214p0.j;
            return Z0.f22857q;
        }
        if (i3 != 1) {
            AbstractC2214p0 abstractC2214p0S = AbstractC2214p0.s(this.f22834a, i3);
            this.f22835b = abstractC2214p0S.size();
            this.f22836c = true;
            return abstractC2214p0S;
        }
        Object obj = this.f22834a[0];
        Objects.requireNonNull(obj);
        int i10 = AbstractC2214p0.j;
        return new f1(obj);
    }
}
