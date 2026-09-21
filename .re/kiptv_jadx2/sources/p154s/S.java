package p154s;

import kotlin.jvm.internal.m;
import p163t.A;

public final class S {

    public final A f27096a;

    public S(A a2) {
        this.f27096a = a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s9 = (S) obj;
        s9.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && m.a(this.f27096a, s9.f27096a);
    }

    public final int hashCode() {
        return this.f27096a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f27096a + ')';
    }
}
