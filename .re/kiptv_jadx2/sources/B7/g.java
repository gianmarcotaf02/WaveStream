package B7;

import kotlin.jvm.functions.Function0;

public final class g {

    public final p101l7.c f829a;

    public final Function0 f830b;

    public g(p101l7.c cVar, Function0 function0) {
        this.f829a = cVar;
        this.f830b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f829a.equals(((g) obj).f829a);
    }

    public final int hashCode() {
        return this.f829a.hashCode();
    }
}
