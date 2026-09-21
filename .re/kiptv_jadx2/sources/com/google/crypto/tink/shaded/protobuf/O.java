package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

public final class O {
    public static void a(Object obj, Object obj2) {
        N n3 = (N) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (n3.isEmpty()) {
            return;
        }
        Iterator it = n3.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static N b(Object obj, Object obj2) {
        N nC = (N) obj;
        N n3 = (N) obj2;
        if (!n3.isEmpty()) {
            if (!nC.f19488h) {
                nC = nC.c();
            }
            nC.b();
            if (!n3.isEmpty()) {
                nC.putAll(n3);
            }
        }
        return nC;
    }
}
