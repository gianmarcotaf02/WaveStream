package p101l7;

import com.google.common.util.concurrent.U;
import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import p078i6.D;
import p078i6.I;
import p078i6.m;
import p078i6.q;

public final class h {

    public static final c f24846a;

    public static final c f24847b;

    public static final c f24848c;

    public static final c f24849d;

    public static final c f24850e;

    public static final c f24851f;
    public static final c g;

    public static final b f24852h;

    public static final b f24853i;
    public static final b j;

    public static final b f24854k;

    public static final b f24855l;

    public static final b f24856m;

    public static final b f24857n;

    public static final b f24858o;

    public static final b f24859p;

    public static final b f24860q;

    public static final Set f24861r;

    public static final Set f24862s;

    public static final b f24863t;

    public static final b f24864u;

    public static final b f24865v;

    public static final b f24866w;

    static {
        c cVar = new c("kotlin");
        f24846a = cVar;
        c cVarA = cVar.a(e.e("reflect"));
        f24847b = cVarA;
        c cVarA2 = cVar.a(e.e("collections"));
        f24848c = cVarA2;
        c cVarA3 = cVar.a(e.e("ranges"));
        f24849d = cVarA3;
        c cVarA4 = cVar.a(e.e(DebugImage.JVM));
        cVar.a(e.e("annotations")).a(e.e(DebugImage.JVM));
        cVarA4.a(e.e("internal"));
        cVarA4.a(e.e("functions"));
        c cVarA5 = cVar.a(e.e("annotation"));
        f24850e = cVarA5;
        c cVarA6 = cVar.a(e.e("internal"));
        cVarA6.a(e.e("ir"));
        c cVarA7 = cVar.a(e.e("coroutines"));
        f24851f = cVarA7;
        g = cVar.a(e.e("enums"));
        cVar.a(e.e("contracts"));
        cVar.a(e.e("concurrent"));
        cVar.a(e.e("test"));
        m.F0(new c[]{cVar, cVarA2, cVarA3, cVarA5});
        m.F0(new c[]{cVar, cVarA2, cVarA3, cVarA5, cVarA, cVarA6, cVarA7});
        U.U("Nothing");
        f24852h = U.U("Unit");
        f24853i = U.U("Any");
        j = U.U("Enum");
        U.U("Annotation");
        f24854k = U.U("Array");
        b bVarU = U.U("Boolean");
        b bVarU2 = U.U("Char");
        b bVarU3 = U.U("Byte");
        b bVarU4 = U.U("Short");
        b bVarU5 = U.U("Int");
        b bVarU6 = U.U("Long");
        b bVarU7 = U.U("Float");
        b bVarU8 = U.U("Double");
        f24855l = U.c0(bVarU3);
        f24856m = U.c0(bVarU4);
        f24857n = U.c0(bVarU5);
        f24858o = U.c0(bVarU6);
        U.U("CharSequence");
        f24859p = U.U("String");
        U.U("Throwable");
        U.U("Cloneable");
        U.Z("KProperty");
        U.Z("KMutableProperty");
        U.Z("KProperty0");
        U.Z("KMutableProperty0");
        U.Z("KProperty1");
        U.Z("KMutableProperty1");
        U.Z("KProperty2");
        U.Z("KMutableProperty2");
        f24860q = U.Z("KFunction");
        U.Z("KClass");
        U.Z("KCallable");
        U.Z("KType");
        U.U("Comparable");
        U.U("Number");
        U.U("Function");
        Set setF0 = m.F0(new b[]{bVarU, bVarU2, bVarU3, bVarU4, bVarU5, bVarU6, bVarU7, bVarU8});
        f24861r = setF0;
        m.F0(new b[]{bVarU3, bVarU4, bVarU5, bVarU6});
        Set set = setF0;
        int iI0 = D.I0(q.I0(set, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iI0);
        for (Object obj : set) {
            linkedHashMap.put(obj, U.Y(((b) obj).f()));
        }
        U.X(linkedHashMap);
        Set setF1 = m.F0(new b[]{f24855l, f24856m, f24857n, f24858o});
        f24862s = setF1;
        Set set2 = setF1;
        int iI1 = D.I0(q.I0(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iI1 >= 16 ? iI1 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, U.Y(((b) obj2).f()));
        }
        U.X(linkedHashMap2);
        Set set3 = f24861r;
        Set set4 = f24862s;
        LinkedHashSet linkedHashSetO0 = I.o0(set3, set4);
        b bVar = f24859p;
        I.p0(linkedHashSetO0, bVar);
        c packageFqName = f24851f;
        e eVarE = e.e("Continuation");
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        c cVar2 = c.f24828c;
        com.google.common.util.concurrent.D.M(eVarE).f24829a.c();
        U.V("Iterator");
        U.V("Iterable");
        U.V("Collection");
        U.V("List");
        U.V("ListIterator");
        U.V("Set");
        b bVarV = U.V("Map");
        U.V("MutableIterator");
        U.V("CharIterator");
        U.V("MutableIterable");
        U.V("MutableCollection");
        f24863t = U.V("MutableList");
        U.V("MutableListIterator");
        f24864u = U.V("MutableSet");
        b bVarV2 = U.V("MutableMap");
        f24865v = bVarV2;
        bVarV.d(e.e("Entry"));
        bVarV2.d(e.e("MutableEntry"));
        U.U("Result");
        c packageFqName2 = f24849d;
        e eVarE2 = e.e("IntRange");
        kotlin.jvm.internal.m.e(packageFqName2, "packageFqName");
        com.google.common.util.concurrent.D.M(eVarE2).f24829a.c();
        e eVarE3 = e.e("LongRange");
        kotlin.jvm.internal.m.e(packageFqName2, "packageFqName");
        com.google.common.util.concurrent.D.M(eVarE3).f24829a.c();
        e eVarE4 = e.e("CharRange");
        kotlin.jvm.internal.m.e(packageFqName2, "packageFqName");
        com.google.common.util.concurrent.D.M(eVarE4).f24829a.c();
        c packageFqName3 = f24850e;
        e eVarE5 = e.e("AnnotationRetention");
        kotlin.jvm.internal.m.e(packageFqName3, "packageFqName");
        com.google.common.util.concurrent.D.M(eVarE5).f24829a.c();
        e eVarE6 = e.e("AnnotationTarget");
        kotlin.jvm.internal.m.e(packageFqName3, "packageFqName");
        com.google.common.util.concurrent.D.M(eVarE6).f24829a.c();
        U.U("DeprecationLevel");
        f24866w = new b(g, e.e("EnumEntries"));
        I.p0(I.p0(I.p0(I.p0(I.o0(set3, set4), bVar), f24852h), f24853i), j);
    }
}
