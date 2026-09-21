package S6;

import A8.t;
import O7.x;
import kotlin.jvm.internal.m;

public final class b {

    public final Class f9510a;

    public final t f9511b;

    public b(Class cls, t tVar) {
        this.f9510a = cls;
        this.f9511b = tVar;
    }

    public final String a() {
        return x.v0(this.f9510a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return m.a(this.f9510a, ((b) obj).f9510a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9510a.hashCode();
    }

    public final String toString() {
        return b.class.getName() + ": " + this.f9510a;
    }
}
