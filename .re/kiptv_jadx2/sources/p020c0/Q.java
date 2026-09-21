package p020c0;

import B2.a;
import kotlin.jvm.internal.m;

public final class Q {

    public final Integer f18184a;

    public final Object f18185b;

    public Q(Integer num, Object obj) {
        this.f18184a = num;
        this.f18185b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q9 = (Q) obj;
        return this.f18184a.equals(q9.f18184a) && m.a(this.f18185b, q9.f18185b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f18184a.hashCode() * 31;
        Object obj = this.f18185b;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinedKey(left=");
        sb.append(this.f18184a);
        sb.append(", right=");
        return a.n(sb, this.f18185b, ')');
    }
}
