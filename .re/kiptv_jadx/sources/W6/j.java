package W6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedHashMap f10657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Map f10658b;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        f10657a = linkedHashMap;
        b(p101l7.h.f24863t, a("java.util.ArrayList", "java.util.LinkedList"));
        b(p101l7.h.f24864u, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(p101l7.h.f24865v, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        p101l7.c cVar = new p101l7.c("java.util.function.Function");
        b(new p101l7.b(cVar.b(), cVar.f24829a.f()), a("java.util.function.UnaryOperator"));
        p101l7.c cVar2 = new p101l7.c("java.util.function.BiFunction");
        b(new p101l7.b(cVar2.b(), cVar2.f24829a.f()), a("java.util.function.BinaryOperator"));
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new p070h6.k(((p101l7.b) entry.getKey()).a(), ((p101l7.b) entry.getValue()).a()));
        }
        f10658b = p078i6.C.X0(arrayList);
    }

    public static java.util.ArrayList a(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            p101l7.c cVar = new p101l7.c(str);
            arrayList.add(new p101l7.b(cVar.b(), cVar.f24829a.f()));
        }
        return arrayList;
    }

    public static void b(p101l7.b bVar, java.util.ArrayList arrayList) {
        for (java.lang.Object obj : arrayList) {
            f10657a.put(obj, bVar);
        }
    }
}
