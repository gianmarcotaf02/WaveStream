package p070h6;

import B2.a;
import java.io.Serializable;
import kotlin.jvm.internal.m;

public final class q implements Serializable {

    public final Object f22547h;

    public final Object f22548i;
    public final Object j;

    public q(Object obj, Object obj2, Object obj3) {
        this.f22547h = obj;
        this.f22548i = obj2;
        this.j = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return m.a(this.f22547h, qVar.f22547h) && m.a(this.f22548i, qVar.f22548i) && m.a(this.j, qVar.j);
    }

    public final int hashCode() {
        Object obj = this.f22547h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f22548i;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.j;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f22547h);
        sb.append(", ");
        sb.append(this.f22548i);
        sb.append(", ");
        return a.n(sb, this.j, ')');
    }
}
