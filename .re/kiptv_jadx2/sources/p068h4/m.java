package p068h4;

import java.io.Serializable;
import java.util.List;

public final class m implements l, Serializable {

    public final List f22498h;

    public m(List list) {
        this.f22498h = list;
    }

    @Override
    public final boolean apply(Object obj) {
        int i3 = 0;
        while (true) {
            List list = this.f22498h;
            if (i3 >= list.size()) {
                return true;
            }
            if (!((l) list.get(i3)).apply(obj)) {
                return false;
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f22498h.equals(((m) obj).f22498h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22498h.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z6 = true;
        for (Object obj : this.f22498h) {
            if (!z6) {
                sb.append(',');
            }
            sb.append(obj);
            z6 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
