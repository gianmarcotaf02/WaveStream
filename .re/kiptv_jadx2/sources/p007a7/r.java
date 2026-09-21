package p007a7;

import T6.o;
import kotlin.jvm.internal.m;
import p101l7.e;

public final class r {

    public final e f15502a;

    public final o f15503b;

    public r(e name, o oVar) {
        m.e(name, "name");
        this.f15502a = name;
        this.f15503b = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return m.a(this.f15502a, ((r) obj).f15502a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15502a.hashCode();
    }
}
