package H7;

import kotlin.jvm.internal.m;

public final class a {

    public final Object f4518a;

    public final Object f4519b;

    public a(Object obj, Object obj2) {
        this.f4518a = obj;
        this.f4519b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f4518a, aVar.f4518a) && m.a(this.f4519b, aVar.f4519b);
    }

    public final int hashCode() {
        Object obj = this.f4518a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4519b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApproximationBounds(lower=");
        sb.append(this.f4518a);
        sb.append(", upper=");
        return B2.a.n(sb, this.f4519b, ')');
    }
}
