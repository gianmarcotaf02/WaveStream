package p163t;

import kotlin.jvm.internal.m;

public final class K0 {

    public final r f27479a;

    public final InterfaceC2780y f27480b;

    public K0(r rVar, InterfaceC2780y interfaceC2780y) {
        this.f27479a = rVar;
        this.f27480b = interfaceC2780y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k1 = (K0) obj;
        return m.a(this.f27479a, k1.f27479a) && m.a(this.f27480b, k1.f27480b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f27480b.hashCode() + (this.f27479a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f27479a + ", easing=" + this.f27480b + ", arcMode=ArcMode(value=0))";
    }
}
