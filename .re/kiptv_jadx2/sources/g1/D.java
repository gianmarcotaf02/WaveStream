package g1;

import p011b1.C1650g;

public final class D {

    public final C1650g f21786a;

    public final q f21787b;

    public D(C1650g c1650g, q qVar) {
        this.f21786a = c1650g;
        this.f21787b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        return kotlin.jvm.internal.m.a(this.f21786a, d4.f21786a) && kotlin.jvm.internal.m.a(this.f21787b, d4.f21787b);
    }

    public final int hashCode() {
        return this.f21787b.hashCode() + (this.f21786a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f21786a) + ", offsetMapping=" + this.f21787b + ')';
    }
}
