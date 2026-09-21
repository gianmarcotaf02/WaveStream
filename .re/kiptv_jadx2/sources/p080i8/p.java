package p080i8;

import Y6.f;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.o;

public final class p {

    public final List f23275a;

    public final List f23276b;

    public p(List operations, List followedBy) {
        m.e(operations, "operations");
        m.e(followedBy, "followedBy");
        this.f23275a = operations;
        this.f23276b = followedBy;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(o.o1(this.f23275a, ", ", null, null, null, 62));
        sb.append('(');
        return f.l(sb, o.o1(this.f23276b, ";", null, null, null, 62), ')');
    }
}
