package W6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p078i6.I;

public abstract class G {

    public static final ArrayList f10625a;

    public static final ArrayList f10626b;

    public static final Object f10627c;

    public static final LinkedHashMap f10628d;

    public static final Set f10629e;

    public static final Set f10630f;
    public static final C g;

    public static final Object f10631h;

    public static final LinkedHashMap f10632i;
    public static final HashSet j;

    public static final LinkedHashMap f10633k;

    static {
        Set<String> setF0 = p078i6.m.F0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(p078i6.q.I0(setF0, 10));
        for (String str : setF0) {
            String strC = p169t7.c.BOOLEAN.c();
            kotlin.jvm.internal.m.d(strC, "getDesc(...)");
            arrayList.add(l.a("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        f10625a = arrayList;
        ArrayList arrayList2 = new ArrayList(p078i6.q.I0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C) it.next()).f10616e);
        }
        f10626b = arrayList2;
        ArrayList arrayList3 = f10625a;
        ArrayList arrayList4 = new ArrayList(p078i6.q.I0(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C) it2.next()).f10613b.b());
        }
        String strConcat = "java/util/".concat("Collection");
        p169t7.c cVar = p169t7.c.BOOLEAN;
        String strC2 = cVar.c();
        kotlin.jvm.internal.m.d(strC2, "getDesc(...)");
        C cA = l.a(strConcat, "contains", "Ljava/lang/Object;", strC2);
        F f9 = F.f10621k;
        p070h6.k kVar = new p070h6.k(cA, f9);
        String strConcat2 = "java/util/".concat("Collection");
        String strC3 = cVar.c();
        kotlin.jvm.internal.m.d(strC3, "getDesc(...)");
        p070h6.k kVar2 = new p070h6.k(l.a(strConcat2, "remove", "Ljava/lang/Object;", strC3), f9);
        String strConcat3 = "java/util/".concat("Map");
        String strC4 = cVar.c();
        kotlin.jvm.internal.m.d(strC4, "getDesc(...)");
        p070h6.k kVar3 = new p070h6.k(l.a(strConcat3, "containsKey", "Ljava/lang/Object;", strC4), f9);
        String strConcat4 = "java/util/".concat("Map");
        String strC5 = cVar.c();
        kotlin.jvm.internal.m.d(strC5, "getDesc(...)");
        p070h6.k kVar4 = new p070h6.k(l.a(strConcat4, "containsValue", "Ljava/lang/Object;", strC5), f9);
        String strConcat5 = "java/util/".concat("Map");
        String strC6 = cVar.c();
        kotlin.jvm.internal.m.d(strC6, "getDesc(...)");
        p070h6.k kVar5 = new p070h6.k(l.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), f9);
        p070h6.k kVar6 = new p070h6.k(l.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), F.f10622l);
        C cA2 = l.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        F f10 = F.f10620i;
        p070h6.k kVar7 = new p070h6.k(cA2, f10);
        p070h6.k kVar8 = new p070h6.k(l.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), f10);
        String strConcat6 = "java/util/".concat("List");
        p169t7.c cVar2 = p169t7.c.INT;
        String strC7 = cVar2.c();
        kotlin.jvm.internal.m.d(strC7, "getDesc(...)");
        C cA3 = l.a(strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        F f11 = F.j;
        p070h6.k kVar9 = new p070h6.k(cA3, f11);
        String strConcat7 = "java/util/".concat("List");
        String strC8 = cVar2.c();
        kotlin.jvm.internal.m.d(strC8, "getDesc(...)");
        Map mapN0 = p078i6.C.N0(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, new p070h6.k(l.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), f11));
        f10627c = mapN0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p078i6.D.I0(mapN0.size()));
        for (Map.Entry entry : mapN0.entrySet()) {
            linkedHashMap.put(((C) entry.getKey()).f10616e, entry.getValue());
        }
        f10628d = linkedHashMap;
        LinkedHashSet linkedHashSetO0 = I.o0(f10627c.keySet(), f10625a);
        ArrayList arrayList5 = new ArrayList(p078i6.q.I0(linkedHashSetO0, 10));
        Iterator it3 = linkedHashSetO0.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C) it3.next()).f10613b);
        }
        f10629e = p078i6.o.R1(arrayList5);
        ArrayList arrayList6 = new ArrayList(p078i6.q.I0(linkedHashSetO0, 10));
        Iterator it4 = linkedHashSetO0.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((C) it4.next()).f10616e);
        }
        f10630f = p078i6.o.R1(arrayList6);
        p169t7.c cVar3 = p169t7.c.INT;
        String strC9 = cVar3.c();
        kotlin.jvm.internal.m.d(strC9, "getDesc(...)");
        C cA4 = l.a("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        g = cA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strC10 = p169t7.c.BYTE.c();
        kotlin.jvm.internal.m.d(strC10, "getDesc(...)");
        p070h6.k kVar10 = new p070h6.k(l.a(strConcat8, "toByte", "", strC10), p101l7.e.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strC11 = p169t7.c.SHORT.c();
        kotlin.jvm.internal.m.d(strC11, "getDesc(...)");
        p070h6.k kVar11 = new p070h6.k(l.a(strConcat9, "toShort", "", strC11), p101l7.e.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strC12 = cVar3.c();
        kotlin.jvm.internal.m.d(strC12, "getDesc(...)");
        p070h6.k kVar12 = new p070h6.k(l.a(strConcat10, "toInt", "", strC12), p101l7.e.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strC13 = p169t7.c.LONG.c();
        kotlin.jvm.internal.m.d(strC13, "getDesc(...)");
        p070h6.k kVar13 = new p070h6.k(l.a(strConcat11, "toLong", "", strC13), p101l7.e.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strC14 = p169t7.c.FLOAT.c();
        kotlin.jvm.internal.m.d(strC14, "getDesc(...)");
        p070h6.k kVar14 = new p070h6.k(l.a(strConcat12, "toFloat", "", strC14), p101l7.e.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strC15 = p169t7.c.DOUBLE.c();
        kotlin.jvm.internal.m.d(strC15, "getDesc(...)");
        p070h6.k kVar15 = new p070h6.k(l.a(strConcat13, "toDouble", "", strC15), p101l7.e.e("doubleValue"));
        p070h6.k kVar16 = new p070h6.k(cA4, p101l7.e.e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strC16 = cVar3.c();
        kotlin.jvm.internal.m.d(strC16, "getDesc(...)");
        String strC17 = p169t7.c.CHAR.c();
        kotlin.jvm.internal.m.d(strC17, "getDesc(...)");
        Map mapN1 = p078i6.C.N0(kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, new p070h6.k(l.a(strConcat14, "get", strC16, strC17), p101l7.e.e("charAt")));
        f10631h = mapN1;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p078i6.D.I0(mapN1.size()));
        for (Map.Entry entry2 : mapN1.entrySet()) {
            linkedHashMap2.put(((C) entry2.getKey()).f10616e, entry2.getValue());
        }
        f10632i = linkedHashMap2;
        ?? r9 = f10631h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r9.entrySet()) {
            C c9 = (C) entry3.getKey();
            p101l7.e name = (p101l7.e) entry3.getValue();
            String classInternalName = c9.f10612a;
            String str2 = c9.f10614c;
            String str3 = c9.f10615d;
            kotlin.jvm.internal.m.e(classInternalName, "classInternalName");
            kotlin.jvm.internal.m.e(name, "name");
            String jvmDescriptor = name + '(' + str2 + ')' + str3;
            kotlin.jvm.internal.m.e(jvmDescriptor, "jvmDescriptor");
            linkedHashSet.add(classInternalName + '.' + jvmDescriptor);
        }
        Set setKeySet = f10631h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((C) it5.next()).f10613b);
        }
        j = hashSet;
        Set<Map.Entry> setEntrySet = f10631h.entrySet();
        ArrayList<p070h6.k> arrayList7 = new ArrayList(p078i6.q.I0(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new p070h6.k(((C) entry4.getKey()).f10613b, entry4.getValue()));
        }
        int iI0 = p078i6.D.I0(p078i6.q.I0(arrayList7, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iI0);
        for (p070h6.k kVar17 : arrayList7) {
            linkedHashMap3.put((p101l7.e) kVar17.f22540i, (p101l7.e) kVar17.f22539h);
        }
        f10633k = linkedHashMap3;
    }
}
