package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

public final class j0 {

    public final LinkedHashMap f16362a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f16362a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
