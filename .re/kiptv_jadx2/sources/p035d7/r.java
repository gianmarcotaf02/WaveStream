package p035d7;

import java.util.LinkedHashMap;
import java.util.Map;
import p078i6.D;

public final class r {

    public final LinkedHashMap f21297a;

    public r(LinkedHashMap linkedHashMap) {
        this.f21297a = linkedHashMap;
    }

    public final r a() {
        LinkedHashMap linkedHashMap = this.f21297a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(D.I0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            d dVar = (d) entry.getValue();
            linkedHashMap2.put(key, new d(dVar.f21255a, dVar.f21256b, dVar.f21257c, true));
        }
        return new r(linkedHashMap2);
    }
}
