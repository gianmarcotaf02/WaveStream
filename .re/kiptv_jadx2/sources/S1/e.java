package S1;

import kotlin.jvm.internal.m;

public final class e {

    public final String f9205a;

    public e(String name) {
        m.e(name, "name");
        this.f9205a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return m.a(this.f9205a, ((e) obj).f9205a);
    }

    public final int hashCode() {
        return this.f9205a.hashCode();
    }

    public final String toString() {
        return this.f9205a;
    }
}
