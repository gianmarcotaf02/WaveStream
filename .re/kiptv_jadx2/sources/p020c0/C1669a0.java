package p020c0;

import Y6.f;
import kotlin.jvm.internal.m;

public final class C1669a0 {

    public final String f18216a;

    public C1669a0(String str) {
        this.f18216a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1669a0) && m.a(this.f18216a, ((C1669a0) obj).f18216a);
    }

    public final int hashCode() {
        return this.f18216a.hashCode();
    }

    public final String toString() {
        return f.l(new StringBuilder("OpaqueKey(key="), this.f18216a, ')');
    }
}
