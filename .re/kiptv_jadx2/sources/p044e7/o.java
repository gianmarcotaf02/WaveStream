package p044e7;

import Y6.f;
import kotlin.jvm.internal.m;

public final class o {

    public final String f21469a;

    public o(String str) {
        this.f21469a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && m.a(this.f21469a, ((o) obj).f21469a);
    }

    public final int hashCode() {
        return this.f21469a.hashCode();
    }

    public final String toString() {
        return f.l(new StringBuilder("MemberSignature(signature="), this.f21469a, ')');
    }
}
