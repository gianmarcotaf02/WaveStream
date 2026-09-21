package W6;

/* JADX INFO: renamed from: W6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1005f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f10652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f10653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.Set f10654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.Set f10655d;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
    static {
        p101l7.d dVar = K6.o.j;
        p070h6.k kVar = new p070h6.k(dVar.a(p101l7.e.e("name")).g(), K6.p.f6950d);
        p070h6.k kVar2 = new p070h6.k(dVar.a(p101l7.e.e("ordinal")).g(), p101l7.e.e("ordinal"));
        p070h6.k kVar3 = new p070h6.k(K6.o.f6900C.a(p101l7.e.e("size")), p101l7.e.e("size"));
        p101l7.c cVar = K6.o.f6904G;
        java.util.Map mapN0 = p078i6.C.N0(kVar, kVar2, kVar3, new p070h6.k(cVar.a(p101l7.e.e("size")), p101l7.e.e("size")), new p070h6.k(K6.o.f6928e.a(p101l7.e.e(io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH)).g(), p101l7.e.e(io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH)), new p070h6.k(cVar.a(p101l7.e.e("keys")), p101l7.e.e("keySet")), new p070h6.k(cVar.a(p101l7.e.e("values")), p101l7.e.e("values")), new p070h6.k(cVar.a(p101l7.e.e("entries")), p101l7.e.e("entrySet")));
        f10652a = mapN0;
        java.util.Set<java.util.Map.Entry> setEntrySet = mapN0.entrySet();
        java.util.ArrayList<p070h6.k> arrayList = new java.util.ArrayList(p078i6.q.I0(setEntrySet, 10));
        for (java.util.Map.Entry entry : setEntrySet) {
            arrayList.add(new p070h6.k(((p101l7.c) entry.getKey()).f24829a.f(), entry.getValue()));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (p070h6.k kVar4 : arrayList) {
            p101l7.e eVar = (p101l7.e) kVar4.f22540i;
            java.lang.Object arrayList2 = linkedHashMap.get(eVar);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(eVar, arrayList2);
            }
            ((java.util.List) arrayList2).add((p101l7.e) kVar4.f22539h);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(p078i6.D.I0(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), p078i6.o.c1((java.lang.Iterable) entry2.getValue()));
        }
        f10653b = linkedHashMap2;
        ?? r9 = f10652a;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry entry3 : r9.entrySet()) {
            java.lang.String str = M6.d.f7152a;
            p101l7.b bVarF = M6.d.f(((p101l7.c) entry3.getKey()).b().f24829a);
            kotlin.jvm.internal.m.b(bVarF);
            linkedHashSet.add(bVarF.a().a((p101l7.e) entry3.getValue()));
        }
        java.util.Set setKeySet = f10652a.keySet();
        f10654c = setKeySet;
        java.util.Set set = setKeySet;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p078i6.q.I0(set, 10));
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((p101l7.c) it.next()).f24829a.f());
        }
        f10655d = p078i6.o.R1(arrayList3);
    }
}
