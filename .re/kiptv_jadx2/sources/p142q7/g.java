package p142q7;

import C7.AbstractC0191x;
import N6.B;
import kotlin.jvm.internal.m;

public abstract class g {

    public final Object f26656a;

    public g(Object obj) {
        this.f26656a = obj;
    }

    public abstract AbstractC0191x a(B b9);

    public Object b() {
        return this.f26656a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return m.a(objB, gVar != null ? gVar.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
