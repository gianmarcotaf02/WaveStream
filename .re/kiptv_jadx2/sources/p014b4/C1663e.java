package p014b4;

import Y6.f;
import java.io.Serializable;
import java.util.Arrays;

public final class C1663e implements Serializable {

    public final Object f17882h;

    public C1663e(Object obj) {
        this.f17882h = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1663e) {
            return AbstractC1659a.d(this.f17882h, ((C1663e) obj).f17882h);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17882h});
    }

    public final String toString() {
        return f.h("Suppliers.ofInstance(", this.f17882h.toString(), ")");
    }
}
