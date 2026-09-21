package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C extends p078i6.D {
    public static java.lang.Object M0(java.lang.Object obj, java.util.Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        if (map instanceof p078i6.B) {
            return ((p078i6.B) map).f();
        }
        java.lang.Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new java.util.NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static java.util.Map N0(p070h6.k... pairs) {
        kotlin.jvm.internal.m.e(pairs, "pairs");
        if (pairs.length <= 0) {
            return p078i6.x.f23206h;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(pairs.length));
        T0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static java.util.Map O0(java.lang.Object obj, java.util.Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        java.util.LinkedHashMap linkedHashMapZ0 = Z0(map);
        linkedHashMapZ0.remove(obj);
        return Q0(linkedHashMapZ0);
    }

    public static java.util.Map P0(java.util.Map map, java.lang.Iterable keys) {
        kotlin.jvm.internal.m.e(map, "<this>");
        kotlin.jvm.internal.m.e(keys, "keys");
        java.util.LinkedHashMap linkedHashMapZ0 = Z0(map);
        java.util.Set setKeySet = linkedHashMapZ0.keySet();
        kotlin.jvm.internal.m.e(setKeySet, "<this>");
        setKeySet.removeAll(p078i6.u.O0(keys));
        return Q0(linkedHashMapZ0);
    }

    public static final java.util.Map Q0(java.util.LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            return size != 1 ? linkedHashMap : p078i6.D.K0(linkedHashMap);
        }
        return p078i6.x.f23206h;
    }

    public static java.util.LinkedHashMap R0(java.util.Map map, java.util.Map map2) {
        kotlin.jvm.internal.m.e(map, "<this>");
        kotlin.jvm.internal.m.e(map2, "map");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static java.util.Map S0(java.util.Map map, p070h6.k kVar) {
        kotlin.jvm.internal.m.e(map, "<this>");
        if (map.isEmpty()) {
            return p078i6.D.J0(kVar);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.put(kVar.f22539h, kVar.f22540i);
        return linkedHashMap;
    }

    public static final void T0(java.util.AbstractMap abstractMap, p070h6.k[] pairs) {
        kotlin.jvm.internal.m.e(pairs, "pairs");
        for (p070h6.k kVar : pairs) {
            abstractMap.put(kVar.f22539h, kVar.f22540i);
        }
    }

    public static void U0(java.util.Map map, java.lang.Iterable pairs) {
        kotlin.jvm.internal.m.e(map, "<this>");
        kotlin.jvm.internal.m.e(pairs, "pairs");
        java.util.Iterator it = pairs.iterator();
        while (it.hasNext()) {
            p070h6.k kVar = (p070h6.k) it.next();
            map.put(kVar.f22539h, kVar.f22540i);
        }
    }

    public static java.util.List V0(java.util.Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        int size = map.size();
        p078i6.w wVar = p078i6.w.f23205h;
        if (size == 0) {
            return wVar;
        }
        java.util.Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return wVar;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        if (!it.hasNext()) {
            return com.google.common.util.concurrent.P.i0(new p070h6.k(entry.getKey(), entry.getValue()));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        arrayList.add(new p070h6.k(entry.getKey(), entry.getValue()));
        do {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            arrayList.add(new p070h6.k(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static java.util.Map W0(N7.u uVar) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = uVar.f7470a.iterator();
        while (it.hasNext()) {
            p070h6.k kVar = (p070h6.k) uVar.f7471b.invoke(it.next());
            linkedHashMap.put(kVar.f22539h, kVar.f22540i);
        }
        return Q0(linkedHashMap);
    }

    public static java.util.Map X0(java.lang.Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (!(iterable instanceof java.util.Collection)) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            U0(linkedHashMap, iterable);
            return Q0(linkedHashMap);
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return p078i6.x.f23206h;
        }
        if (size == 1) {
            return p078i6.D.J0((p070h6.k) (iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next()));
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(p078i6.D.I0(collection.size()));
        U0(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static java.util.Map Y0(java.util.Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? Z0(map) : p078i6.D.K0(map);
        }
        return p078i6.x.f23206h;
    }

    public static java.util.LinkedHashMap Z0(java.util.Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        return new java.util.LinkedHashMap(map);
    }
}
