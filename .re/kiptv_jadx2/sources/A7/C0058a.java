package A7;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

public class C0058a implements O6.h {

    public static final E6.u[] f294i = {kotlin.jvm.internal.B.f24540a.h(new kotlin.jvm.internal.u(C0058a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    public final B7.i f295h;

    public C0058a(B7.m storageManager, Function0 function0) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.f295h = new B7.i(storageManager, function0);
    }

    @Override
    public final boolean h(p101l7.c cVar) {
        return O2.g.P(this, cVar);
    }

    @Override
    public boolean isEmpty() {
        return ((List) p000a.a.v(this.f295h, f294i[0])).isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return ((List) p000a.a.v(this.f295h, f294i[0])).iterator();
    }

    @Override
    public final O6.b k(p101l7.c cVar) {
        return O2.g.J(this, cVar);
    }
}
