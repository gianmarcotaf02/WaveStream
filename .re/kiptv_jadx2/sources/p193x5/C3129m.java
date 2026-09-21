package p193x5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class C3129m implements InterfaceC3137q {

    public final String f31538a;

    public C3129m(String id) {
        m.e(id, "id");
        this.f31538a = id;
    }

    public final String a() {
        return this.f31538a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3129m) && m.a(this.f31538a, ((C3129m) obj).f31538a);
    }

    public final int hashCode() {
        return this.f31538a.hashCode();
    }

    public final String toString() {
        return f.m(new StringBuilder("Category(id="), this.f31538a, ")");
    }
}
