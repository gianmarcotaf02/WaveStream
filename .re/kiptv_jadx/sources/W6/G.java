package W6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f10625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f10626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f10627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedHashMap f10628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.Set f10629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.Set f10630f;
    public static final W6.C g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f10631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.LinkedHashMap f10632i;
    public static final java.util.HashSet j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.LinkedHashMap f10633k;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.Map] */
    static {
        java.util.Set<java.lang.String> setF0 = p078i6.m.F0(new java.lang.String[]{"containsAll", "removeAll", "retainAll"});
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(setF0, 10));
        for (java.lang.String str : setF0) {
            java.lang.String strC = p169t7.c.BOOLEAN.c();
            kotlin.jvm.internal.m.d(strC, "getDesc(...)");
            arrayList.add(W6.l.a("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        f10625a = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((W6.C) it.next()).f10616e);
        }
        f10626b = arrayList2;
        java.util.ArrayList arrayList3 = f10625a;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(p078i6.q.I0(arrayList3, 10));
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((W6.C) it2.next()).f10613b.b());
        }
        java.lang.String strConcat = "java/util/".concat("Collection");
        p169t7.c cVar = p169t7.c.BOOLEAN;
        java.lang.String strC2 = cVar.c();
        kotlin.jvm.internal.m.d(strC2, "getDesc(...)");
        W6.C cA = W6.l.a(strConcat, "contains", "Ljava/lang/Object;", strC2);
        W6.F f9 = W6.F.f10621k;
        p070h6.k kVar = new p070h6.k(cA, f9);
        java.lang.String strConcat2 = "java/util/".concat("Collection");
        java.lang.String strC3 = cVar.c();
        kotlin.jvm.internal.m.d(strC3, "getDesc(...)");
        p070h6.k kVar2 = new p070h6.k(W6.l.a(strConcat2, "remove", "Ljava/lang/Object;", strC3), f9);
        java.lang.String strConcat3 = "java/util/".concat("Map");
        java.lang.String strC4 = cVar.c();
        kotlin.jvm.internal.m.d(strC4, "getDesc(...)");
        p070h6.k kVar3 = new p070h6.k(W6.l.a(strConcat3, "containsKey", "Ljava/lang/Object;", strC4), f9);
        java.lang.String strConcat4 = "java/util/".concat("Map");
        java.lang.String strC5 = cVar.c();
        kotlin.jvm.internal.m.d(strC5, "getDesc(...)");
        p070h6.k kVar4 = new p070h6.k(W6.l.a(strConcat4, "containsValue", "Ljava/lang/Object;", strC5), f9);
        java.lang.String strConcat5 = "java/util/".concat("Map");
        java.lang.String strC6 = cVar.c();
        kotlin.jvm.internal.m.d(strC6, "getDesc(...)");
        p070h6.k kVar5 = new p070h6.k(W6.l.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), f9);
        p070h6.k kVar6 = new p070h6.k(W6.l.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), W6.F.f10622l);
        W6.C cA2 = W6.l.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        W6.F f10 = W6.F.f10620i;
        p070h6.k kVar7 = new p070h6.k(cA2, f10);
        p070h6.k kVar8 = new p070h6.k(W6.l.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), f10);
        java.lang.String strConcat6 = "java/util/".concat("List");
        p169t7.c cVar2 = p169t7.c.INT;
        java.lang.String strC7 = cVar2.c();
        kotlin.jvm.internal.m.d(strC7, "getDesc(...)");
        W6.C cA3 = W6.l.a(strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        W6.F f11 = W6.F.j;
        p070h6.k kVar9 = new p070h6.k(cA3, f11);
        java.lang.String strConcat7 = "java/util/".concat("List");
        java.lang.String strC8 = cVar2.c();
        kotlin.jvm.internal.m.d(strC8, "getDesc(...)");
        java.util.Map mapN0 = p078i6.C.N0(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, new p070h6.k(W6.l.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), f11));
        f10627c = mapN0;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(mapN0.size()));
        for (java.util.Map.Entry entry : mapN0.entrySet()) {
            linkedHashMap.put(((W6.C) entry.getKey()).f10616e, entry.getValue());
        }
        f10628d = linkedHashMap;
        java.util.LinkedHashSet linkedHashSetO0 = p078i6.I.o0(f10627c.keySet(), f10625a);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(p078i6.q.I0(linkedHashSetO0, 10));
        java.util.Iterator it3 = linkedHashSetO0.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((W6.C) it3.next()).f10613b);
        }
        f10629e = p078i6.o.R1(arrayList5);
        java.util.ArrayList arrayList6 = new java.util.ArrayList(p078i6.q.I0(linkedHashSetO0, 10));
        java.util.Iterator it4 = linkedHashSetO0.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((W6.C) it4.next()).f10616e);
        }
        f10630f = p078i6.o.R1(arrayList6);
        p169t7.c cVar3 = p169t7.c.INT;
        java.lang.String strC9 = cVar3.c();
        kotlin.jvm.internal.m.d(strC9, "getDesc(...)");
        W6.C cA4 = W6.l.a("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        g = cA4;
        java.lang.String strConcat8 = "java/lang/".concat("Number");
        java.lang.String strC10 = p169t7.c.BYTE.c();
        kotlin.jvm.internal.m.d(strC10, "getDesc(...)");
        p070h6.k kVar10 = new p070h6.k(W6.l.a(strConcat8, "toByte", "", strC10), p101l7.e.e("byteValue"));
        java.lang.String strConcat9 = "java/lang/".concat("Number");
        java.lang.String strC11 = p169t7.c.SHORT.c();
        kotlin.jvm.internal.m.d(strC11, "getDesc(...)");
        p070h6.k kVar11 = new p070h6.k(W6.l.a(strConcat9, "toShort", "", strC11), p101l7.e.e("shortValue"));
        java.lang.String strConcat10 = "java/lang/".concat("Number");
        java.lang.String strC12 = cVar3.c();
        kotlin.jvm.internal.m.d(strC12, "getDesc(...)");
        p070h6.k kVar12 = new p070h6.k(W6.l.a(strConcat10, "toInt", "", strC12), p101l7.e.e("intValue"));
        java.lang.String strConcat11 = "java/lang/".concat("Number");
        java.lang.String strC13 = p169t7.c.LONG.c();
        kotlin.jvm.internal.m.d(strC13, "getDesc(...)");
        p070h6.k kVar13 = new p070h6.k(W6.l.a(strConcat11, "toLong", "", strC13), p101l7.e.e("longValue"));
        java.lang.String strConcat12 = "java/lang/".concat("Number");
        java.lang.String strC14 = p169t7.c.FLOAT.c();
        kotlin.jvm.internal.m.d(strC14, "getDesc(...)");
        p070h6.k kVar14 = new p070h6.k(W6.l.a(strConcat12, "toFloat", "", strC14), p101l7.e.e("floatValue"));
        java.lang.String strConcat13 = "java/lang/".concat("Number");
        java.lang.String strC15 = p169t7.c.DOUBLE.c();
        kotlin.jvm.internal.m.d(strC15, "getDesc(...)");
        p070h6.k kVar15 = new p070h6.k(W6.l.a(strConcat13, "toDouble", "", strC15), p101l7.e.e("doubleValue"));
        p070h6.k kVar16 = new p070h6.k(cA4, p101l7.e.e("remove"));
        java.lang.String strConcat14 = "java/lang/".concat("CharSequence");
        java.lang.String strC16 = cVar3.c();
        kotlin.jvm.internal.m.d(strC16, "getDesc(...)");
        java.lang.String strC17 = p169t7.c.CHAR.c();
        kotlin.jvm.internal.m.d(strC17, "getDesc(...)");
        java.util.Map mapN1 = p078i6.C.N0(kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, new p070h6.k(W6.l.a(strConcat14, "get", strC16, strC17), p101l7.e.e("charAt")));
        f10631h = mapN1;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(p078i6.D.I0(mapN1.size()));
        for (java.util.Map.Entry entry2 : mapN1.entrySet()) {
            linkedHashMap2.put(((W6.C) entry2.getKey()).f10616e, entry2.getValue());
        }
        f10632i = linkedHashMap2;
        ?? r9 = f10631h;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry entry3 : r9.entrySet()) {
            W6.C c9 = (W6.C) entry3.getKey();
            p101l7.e name = (p101l7.e) entry3.getValue();
            java.lang.String classInternalName = c9.f10612a;
            java.lang.String str2 = c9.f10614c;
            java.lang.String str3 = c9.f10615d;
            kotlin.jvm.internal.m.e(classInternalName, "classInternalName");
            kotlin.jvm.internal.m.e(name, "name");
            java.lang.String jvmDescriptor = name + '(' + str2 + ')' + str3;
            kotlin.jvm.internal.m.e(jvmDescriptor, "jvmDescriptor");
            linkedHashSet.add(classInternalName + '.' + jvmDescriptor);
        }
        java.util.Set setKeySet = f10631h.keySet();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((W6.C) it5.next()).f10613b);
        }
        j = hashSet;
        java.util.Set<java.util.Map.Entry> setEntrySet = f10631h.entrySet();
        java.util.ArrayList<p070h6.k> arrayList7 = new java.util.ArrayList(p078i6.q.I0(setEntrySet, 10));
        for (java.util.Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new p070h6.k(((W6.C) entry4.getKey()).f10613b, entry4.getValue()));
        }
        int iI0 = p078i6.D.I0(p078i6.q.I0(arrayList7, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(iI0);
        for (p070h6.k kVar17 : arrayList7) {
            linkedHashMap3.put((p101l7.e) kVar17.f22540i, (p101l7.e) kVar17.f22539h);
        }
        f10633k = linkedHashMap3;
    }
}
