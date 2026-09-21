package p044e7;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements y7.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p044e7.f f21453b = new p044e7.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p044e7.f f21454c = new p044e7.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p044e7.f f21455d = new p044e7.f();

    public static java.lang.String[] a(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public static p044e7.k b(java.lang.String representation) {
        p169t7.c cVar;
        kotlin.jvm.internal.m.e(representation, "representation");
        char cCharAt = representation.charAt(0);
        p169t7.c[] cVarArrValues = p169t7.c.values();
        int length = cVarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i3];
            if (cVar.c().charAt(0) == cCharAt) {
                break;
            }
            i3++;
        }
        if (cVar != null) {
            return new p044e7.j(cVar);
        }
        if (cCharAt == 'V') {
            return new p044e7.j(null);
        }
        if (cCharAt == '[') {
            java.lang.String strSubstring = representation.substring(1);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            return new p044e7.h(b(strSubstring));
        }
        if (cCharAt == 'L') {
            O7.q.F0(representation, ';');
        }
        java.lang.String strSubstring2 = representation.substring(1, representation.length() - 1);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        return new p044e7.i(strSubstring2);
    }

    public static p044e7.i d(java.lang.String internalName) {
        kotlin.jvm.internal.m.e(internalName, "internalName");
        return new p044e7.i(internalName);
    }

    public static java.util.LinkedHashSet e(java.lang.String internalName, java.lang.String... signatures) {
        kotlin.jvm.internal.m.e(internalName, "internalName");
        kotlin.jvm.internal.m.e(signatures, "signatures");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public static java.util.LinkedHashSet f(java.lang.String str, java.lang.String... signatures) {
        kotlin.jvm.internal.m.e(signatures, "signatures");
        return e("java/lang/".concat(str), (java.lang.String[]) java.util.Arrays.copyOf(signatures, signatures.length));
    }

    public static java.util.LinkedHashSet g(java.lang.String str, java.lang.String... strArr) {
        return e("java/util/".concat(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public static java.lang.String h(p044e7.k type) {
        java.lang.String strC;
        kotlin.jvm.internal.m.e(type, "type");
        if (type instanceof p044e7.h) {
            return "[" + h(((p044e7.h) type).f21458i);
        }
        if (type instanceof p044e7.j) {
            p169t7.c cVar = ((p044e7.j) type).f21460i;
            return (cVar == null || (strC = cVar.c()) == null) ? "V" : strC;
        }
        if (type instanceof p044e7.i) {
            return Y6.f.l(new java.lang.StringBuilder("L"), ((p044e7.i) type).f21459i, ';');
        }
        throw new I3.b();
    }

    @Override // y7.p
    public C7.AbstractC0191x c(p062g7.Q proto, java.lang.String flexibleId, C7.B lowerBound, C7.B upperBound) {
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(flexibleId, "flexibleId");
        kotlin.jvm.internal.m.e(lowerBound, "lowerBound");
        kotlin.jvm.internal.m.e(upperBound, "upperBound");
        if (flexibleId.equals("kotlin.jvm.PlatformType")) {
            return proto.k(j7.k.g) ? new p017b7.g(lowerBound, upperBound) : C7.AbstractC0171c.e(lowerBound, upperBound);
        }
        return E7.l.c(E7.k.f3271t, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}
