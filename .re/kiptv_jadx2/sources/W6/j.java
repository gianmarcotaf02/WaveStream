package W6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class j {

    public static final LinkedHashMap f10657a;

    public static final Map f10658b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f10657a = linkedHashMap;
        b(p101l7.h.f24863t, a("java.util.ArrayList", "java.util.LinkedList"));
        b(p101l7.h.f24864u, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(p101l7.h.f24865v, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        p101l7.c cVar = new p101l7.c("java.util.function.Function");
        b(new p101l7.b(cVar.b(), cVar.f24829a.f()), a("java.util.function.UnaryOperator"));
        p101l7.c cVar2 = new p101l7.c("java.util.function.BiFunction");
        b(new p101l7.b(cVar2.b(), cVar2.f24829a.f()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new p070h6.k(((p101l7.b) entry.getKey()).a(), ((p101l7.b) entry.getValue()).a()));
        }
        f10658b = p078i6.C.X0(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            p101l7.c cVar = new p101l7.c(str);
            arrayList.add(new p101l7.b(cVar.b(), cVar.f24829a.f()));
        }
        return arrayList;
    }

    public static void b(p101l7.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f10657a.put(obj, bVar);
        }
    }
}
