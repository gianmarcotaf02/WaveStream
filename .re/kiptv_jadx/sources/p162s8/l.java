package p162s8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p153r8.G f27416a = p153r8.AbstractC2686a0.a("kotlinx.serialization.json.JsonUnquotedLiteral", p153r8.p0.f26988a);

    public static final kotlinx.serialization.json.d a(java.lang.Boolean bool) {
        return bool == null ? kotlinx.serialization.json.JsonNull.INSTANCE : new p162s8.r(bool, false, null);
    }

    public static final kotlinx.serialization.json.d b(java.lang.Number number) {
        return number == null ? kotlinx.serialization.json.JsonNull.INSTANCE : new p162s8.r(number, false, null);
    }

    public static final kotlinx.serialization.json.d c(java.lang.String str) {
        return str == null ? kotlinx.serialization.json.JsonNull.INSTANCE : new p162s8.r(str, true, null);
    }

    public static final void d(java.lang.String str, kotlinx.serialization.json.b bVar) {
        throw new java.lang.IllegalArgumentException("Element " + kotlin.jvm.internal.B.f24540a.b(bVar.getClass()) + " is not a " + str);
    }

    public static final java.lang.Boolean e(kotlinx.serialization.json.d dVar) {
        kotlin.jvm.internal.m.e(dVar, "<this>");
        java.lang.String strD = dVar.d();
        java.lang.String[] strArr = t8.M.f28594a;
        kotlin.jvm.internal.m.e(strD, "<this>");
        if (strD.equalsIgnoreCase("true")) {
            return java.lang.Boolean.TRUE;
        }
        if (strD.equalsIgnoreCase("false")) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    public static final java.lang.String f(kotlinx.serialization.json.d dVar) {
        if (dVar instanceof kotlinx.serialization.json.JsonNull) {
            return null;
        }
        return dVar.d();
    }

    public static final java.lang.Integer g(kotlinx.serialization.json.d dVar) {
        java.lang.Long lValueOf;
        kotlin.jvm.internal.m.e(dVar, "<this>");
        try {
            lValueOf = java.lang.Long.valueOf(l(dVar));
        } catch (t8.s unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return java.lang.Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final kotlinx.serialization.json.a h(kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "<this>");
        kotlinx.serialization.json.a aVar = bVar instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) bVar : null;
        if (aVar != null) {
            return aVar;
        }
        d("JsonArray", bVar);
        throw null;
    }

    public static final kotlinx.serialization.json.c i(kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "<this>");
        kotlinx.serialization.json.c cVar = bVar instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar : null;
        if (cVar != null) {
            return cVar;
        }
        d("JsonObject", bVar);
        throw null;
    }

    public static final kotlinx.serialization.json.d j(kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "<this>");
        kotlinx.serialization.json.d dVar = bVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar : null;
        if (dVar != null) {
            return dVar;
        }
        d("JsonPrimitive", bVar);
        throw null;
    }

    public static final java.lang.Long k(kotlinx.serialization.json.d dVar) {
        kotlin.jvm.internal.m.e(dVar, "<this>");
        try {
            return java.lang.Long.valueOf(l(dVar));
        } catch (t8.s unused) {
            return null;
        }
    }

    public static final long l(kotlinx.serialization.json.d dVar) {
        kotlin.jvm.internal.m.e(dVar, "<this>");
        t8.L l2 = new t8.L(dVar.d());
        long jI = l2.i();
        if (l2.f() == 10) {
            return jI;
        }
        int i3 = l2.f28603a;
        int i9 = i3 - 1;
        java.lang.String str = l2.f28593e;
        t8.AbstractC2851a.r(l2, Y6.f.h("Expected input to contain a single valid number, but got '", (i3 == str.length() || i9 < 0) ? "EOF" : java.lang.String.valueOf(str.charAt(i9)), "' after it"), i9, null, 4);
        throw null;
    }
}
