package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

public final class C1507n {

    public static volatile C1507n f16236a;

    public static final C1507n f16237b;

    static {
        C1507n c1507n = new C1507n();
        Map map = Collections.EMPTY_MAP;
        f16237b = c1507n;
    }

    public static C1507n a() {
        C1507n c1507n;
        U u6 = U.f16162c;
        C1507n c1507n2 = f16236a;
        if (c1507n2 != null) {
            return c1507n2;
        }
        synchronized (C1507n.class) {
            try {
                c1507n = f16236a;
                if (c1507n == null) {
                    Class cls = AbstractC1506m.f16235a;
                    C1507n c1507n3 = null;
                    if (cls != null) {
                        try {
                            c1507n3 = (C1507n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c1507n = c1507n3 != null ? c1507n3 : f16237b;
                    f16236a = c1507n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1507n;
    }
}
