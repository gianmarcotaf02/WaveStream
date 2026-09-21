package kotlin.jvm.internal;

import H6.InterfaceC0416f;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

public abstract class E {
    public static Map a(Object obj) {
        if ((obj instanceof p201y6.a) && !(obj instanceof p201y6.d)) {
            e(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e6) {
            m.i(e6, E.class.getName());
            throw e6;
        }
    }

    public static Set b(Object obj) {
        if ((obj instanceof p201y6.a) && !(obj instanceof p201y6.e)) {
            e(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e6) {
            m.i(e6, E.class.getName());
            throw e6;
        }
    }

    public static void c(int i3, Object obj) {
        if (obj == null || d(i3, obj)) {
            return;
        }
        e(obj, "kotlin.jvm.functions.Function" + i3);
        throw null;
    }

    public static boolean d(int i3, Object obj) {
        int arity;
        if (obj instanceof p070h6.e) {
            if (obj instanceof InterfaceC2543h) {
                arity = ((InterfaceC2543h) obj).getArity();
            } else if (obj instanceof Function0) {
                arity = 0;
            } else if (obj instanceof p194x6.j) {
                arity = 1;
            } else if (obj instanceof p194x6.m) {
                arity = 2;
            } else if (obj instanceof p194x6.n) {
                arity = 3;
            } else if (obj instanceof p194x6.o) {
                arity = 4;
            } else if (obj instanceof p194x6.p) {
                arity = 5;
            } else if (obj instanceof p194x6.q) {
                arity = 6;
            } else if (obj instanceof p194x6.r) {
                arity = 7;
            } else if (obj instanceof p194x6.s) {
                arity = 8;
            } else if (obj instanceof p194x6.t) {
                arity = 9;
            } else if (obj instanceof p194x6.a) {
                arity = 10;
            } else if (obj instanceof p194x6.b) {
                arity = 11;
            } else {
                boolean z6 = obj instanceof InterfaceC0416f;
                if (z6) {
                    arity = 12;
                } else if (obj instanceof p194x6.c) {
                    arity = 13;
                } else if (obj instanceof p194x6.d) {
                    arity = 14;
                } else if (obj instanceof p194x6.e) {
                    arity = 15;
                } else if (obj instanceof p194x6.f) {
                    arity = 16;
                } else if (obj instanceof p194x6.g) {
                    arity = 17;
                } else if (obj instanceof p194x6.h) {
                    arity = 18;
                } else if (obj instanceof p194x6.i) {
                    arity = 19;
                } else if (obj instanceof p194x6.k) {
                    arity = 20;
                } else if (obj instanceof p194x6.l) {
                    arity = 21;
                } else {
                    arity = z6 ? 22 : -1;
                }
            }
            if (arity == i3) {
                return true;
            }
        }
        return false;
    }

    public static void e(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(p121o0.p.p(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        m.i(classCastException, E.class.getName());
        throw classCastException;
    }
}
