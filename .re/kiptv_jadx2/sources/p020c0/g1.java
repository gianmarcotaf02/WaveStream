package p020c0;

import B2.a;
import kotlin.jvm.internal.m;

public final class g1 implements h1 {

    public final Object f18248a;

    public g1(Object obj) {
        this.f18248a = obj;
    }

    @Override
    public final Object a(InterfaceC1691l0 interfaceC1691l0) {
        return this.f18248a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && m.a(this.f18248a, ((g1) obj).f18248a);
    }

    public final int hashCode() {
        Object obj = this.f18248a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return a.n(new StringBuilder("StaticValueHolder(value="), this.f18248a, ')');
    }
}
