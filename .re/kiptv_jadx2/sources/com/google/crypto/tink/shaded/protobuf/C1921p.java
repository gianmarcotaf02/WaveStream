package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

public final class C1921p {

    public static volatile C1921p f19565a;

    public static final C1921p f19566b;

    static {
        C1921p c1921p = new C1921p();
        Map map = Collections.EMPTY_MAP;
        f19566b = c1921p;
    }

    public static C1921p a() {
        C1921p c1921p;
        C1921p c1921p2 = f19565a;
        if (c1921p2 != null) {
            return c1921p2;
        }
        synchronized (C1921p.class) {
            try {
                c1921p = f19565a;
                if (c1921p == null) {
                    Class cls = AbstractC1920o.f19563a;
                    C1921p c1921p3 = null;
                    if (cls != null) {
                        try {
                            c1921p3 = (C1921p) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c1921p = c1921p3 != null ? c1921p3 : f19566b;
                    f19565a = c1921p;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1921p;
    }
}
