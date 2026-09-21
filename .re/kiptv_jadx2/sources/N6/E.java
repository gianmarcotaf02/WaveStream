package N6;

import com.google.android.gms.internal.play_billing.M0;
import java.util.List;

public final class E {

    public final p101l7.b f7364a;

    public final List f7365b;

    public E(p101l7.b classId, List list) {
        kotlin.jvm.internal.m.e(classId, "classId");
        this.f7364a = classId;
        this.f7365b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e6 = (E) obj;
        return kotlin.jvm.internal.m.a(this.f7364a, e6.f7364a) && kotlin.jvm.internal.m.a(this.f7365b, e6.f7365b);
    }

    public final int hashCode() {
        return this.f7365b.hashCode() + (this.f7364a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassRequest(classId=");
        sb.append(this.f7364a);
        sb.append(", typeParametersCount=");
        return M0.n(sb, this.f7365b, ')');
    }
}
