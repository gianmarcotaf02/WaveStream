package p070h6;

import B2.a;
import java.io.Serializable;
import kotlin.jvm.internal.m;

public final class k implements Serializable {

    public final Object f22539h;

    public final Object f22540i;

    public k(Object obj, Object obj2) {
        this.f22539h = obj;
        this.f22540i = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return m.a(this.f22539h, kVar.f22539h) && m.a(this.f22540i, kVar.f22540i);
    }

    public final int hashCode() {
        Object obj = this.f22539h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f22540i;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f22539h);
        sb.append(", ");
        return a.n(sb, this.f22540i, ')');
    }
}
