package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class z {

    public final Map f23749a;

    public final HashMap f23750b;

    public z(Map map) {
        this.f23749a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l2 = (Long) entry2.getKey();
                ConcurrentHashMap concurrentHashMap = A.f23650a;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l2));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, A.f23651b);
            map2.put((F) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, A.f23651b);
        this.f23750b = map2;
    }

    public final String a(long j, F f9) {
        Map map = (Map) this.f23749a.get(f9);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
