package p078i6;

import N7.u;
import com.google.common.util.concurrent.P;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.m;
import p070h6.k;

public abstract class C extends D {
    public static Object M0(Object obj, Map map) {
        m.e(map, "<this>");
        if (map instanceof B) {
            return ((B) map).f();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static Map N0(k... pairs) {
        m.e(pairs, "pairs");
        if (pairs.length <= 0) {
            return x.f23206h;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(D.I0(pairs.length));
        T0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static Map O0(Object obj, Map map) {
        m.e(map, "<this>");
        LinkedHashMap linkedHashMapZ0 = Z0(map);
        linkedHashMapZ0.remove(obj);
        return Q0(linkedHashMapZ0);
    }

    public static Map P0(Map map, Iterable keys) {
        m.e(map, "<this>");
        m.e(keys, "keys");
        LinkedHashMap linkedHashMapZ0 = Z0(map);
        Set setKeySet = linkedHashMapZ0.keySet();
        m.e(setKeySet, "<this>");
        setKeySet.removeAll(u.O0(keys));
        return Q0(linkedHashMapZ0);
    }

    public static final Map Q0(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            return size != 1 ? linkedHashMap : D.K0(linkedHashMap);
        }
        return x.f23206h;
    }

    public static LinkedHashMap R0(Map map, Map map2) {
        m.e(map, "<this>");
        m.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map S0(Map map, k kVar) {
        m.e(map, "<this>");
        if (map.isEmpty()) {
            return D.J0(kVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(kVar.f22539h, kVar.f22540i);
        return linkedHashMap;
    }

    public static final void T0(AbstractMap abstractMap, k[] pairs) {
        m.e(pairs, "pairs");
        for (k kVar : pairs) {
            abstractMap.put(kVar.f22539h, kVar.f22540i);
        }
    }

    public static void U0(Map map, Iterable pairs) {
        m.e(map, "<this>");
        m.e(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            map.put(kVar.f22539h, kVar.f22540i);
        }
    }

    public static List V0(Map map) {
        m.e(map, "<this>");
        int size = map.size();
        w wVar = w.f23205h;
        if (size == 0) {
            return wVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return wVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return P.i0(new k(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new k(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new k(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map W0(u uVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = uVar.f7470a.iterator();
        while (it.hasNext()) {
            k kVar = (k) uVar.f7471b.invoke(it.next());
            linkedHashMap.put(kVar.f22539h, kVar.f22540i);
        }
        return Q0(linkedHashMap);
    }

    public static Map X0(Iterable iterable) {
        m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            U0(linkedHashMap, iterable);
            return Q0(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return x.f23206h;
        }
        if (size == 1) {
            return D.J0((k) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(D.I0(collection.size()));
        U0(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static Map Y0(Map map) {
        m.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? Z0(map) : D.K0(map);
        }
        return x.f23206h;
    }

    public static LinkedHashMap Z0(Map map) {
        m.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
