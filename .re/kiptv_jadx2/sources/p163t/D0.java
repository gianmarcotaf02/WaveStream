package p163t;

import D8.x;
import kotlin.jvm.internal.m;

public final class D0 implements InterfaceC2779x {

    public final int f27447a;

    public final int f27448b;

    public final InterfaceC2780y f27449c;

    public D0(int i3, InterfaceC2780y interfaceC2780y, int i9) {
        this(i3, 0, (i9 & 4) != 0 ? AbstractC2781z.f27737a : interfaceC2780y);
    }

    @Override
    public final G0 a(E0 e6) {
        return new x(this.f27447a, this.f27448b, this.f27449c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D0) {
            D0 d4 = (D0) obj;
            if (d4.f27447a == this.f27447a && d4.f27448b == this.f27448b && m.a(d4.f27449c, this.f27449c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f27449c.hashCode() + (this.f27447a * 31)) * 31) + this.f27448b;
    }

    @Override
    public final I0 a(E0 e6) {
        return new x(this.f27447a, this.f27448b, this.f27449c);
    }

    public D0(int i3, int i9, InterfaceC2780y interfaceC2780y) {
        this.f27447a = i3;
        this.f27448b = i9;
        this.f27449c = interfaceC2780y;
    }
}
