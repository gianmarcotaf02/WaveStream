package p154s;

import kotlin.jvm.internal.o;
import p163t.A;
import p194x6.j;

public final class Z {

    public final o f27105a;

    public final A f27106b;

    public Z(j jVar, A a2) {
        this.f27105a = (o) jVar;
        this.f27106b = a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z6 = (Z) obj;
        return this.f27105a.equals(z6.f27105a) && this.f27106b.equals(z6.f27106b);
    }

    public final int hashCode() {
        return this.f27106b.hashCode() + (this.f27105a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f27105a + ", animationSpec=" + this.f27106b + ')';
    }
}
