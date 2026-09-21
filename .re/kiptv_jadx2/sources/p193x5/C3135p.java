package p193x5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class C3135p implements InterfaceC3137q {

    public final String f31570a;

    public C3135p(String key) {
        m.e(key, "key");
        this.f31570a = key;
    }

    public final String a() {
        return this.f31570a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3135p) && m.a(this.f31570a, ((C3135p) obj).f31570a);
    }

    public final int hashCode() {
        return this.f31570a.hashCode();
    }

    public final String toString() {
        return f.m(new StringBuilder("Tag(key="), this.f31570a, ")");
    }
}
