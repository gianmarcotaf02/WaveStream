package kotlin.jvm.internal;

import H6.x0;
import java.util.Collections;

public abstract class B {

    public static final C f24540a;

    static {
        C c9 = null;
        try {
            c9 = (C) x0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c9 == null) {
            c9 = new C();
        }
        f24540a = c9;
    }

    public static E6.v a(Class cls) {
        C c9 = f24540a;
        return c9.l(c9.b(cls), Collections.EMPTY_LIST, false);
    }

    public static E6.v b(Class cls, E6.y yVar) {
        C c9 = f24540a;
        return c9.l(c9.b(cls), Collections.singletonList(yVar), false);
    }

    public static E6.v c(Class cls, E6.y... yVarArr) {
        C c9 = f24540a;
        return c9.l(c9.b(cls), p078i6.m.E0(yVarArr), false);
    }
}
