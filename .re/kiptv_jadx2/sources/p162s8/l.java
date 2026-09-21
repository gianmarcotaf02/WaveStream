package p162s8;

import Y6.f;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import p153r8.AbstractC2686a0;
import p153r8.G;
import p153r8.p0;
import t8.AbstractC2851a;
import t8.L;
import t8.M;
import t8.s;

public abstract class l {

    public static final G f27416a = AbstractC2686a0.a("kotlinx.serialization.json.JsonUnquotedLiteral", p0.f26988a);

    public static final d a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new r(bool, false, null);
    }

    public static final d b(Number number) {
        return number == null ? JsonNull.INSTANCE : new r(number, false, null);
    }

    public static final d c(String str) {
        return str == null ? JsonNull.INSTANCE : new r(str, true, null);
    }

    public static final void d(String str, b bVar) {
        throw new IllegalArgumentException("Element " + B.f24540a.b(bVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(d dVar) {
        m.e(dVar, "<this>");
        String strD = dVar.d();
        String[] strArr = M.f28594a;
        m.e(strD, "<this>");
        if (strD.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strD.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String f(d dVar) {
        if (dVar instanceof JsonNull) {
            return null;
        }
        return dVar.d();
    }

    public static final Integer g(d dVar) {
        Long lValueOf;
        m.e(dVar, "<this>");
        try {
            lValueOf = Long.valueOf(l(dVar));
        } catch (s unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final a h(b bVar) {
        m.e(bVar, "<this>");
        a aVar = bVar instanceof a ? (a) bVar : null;
        if (aVar != null) {
            return aVar;
        }
        d("JsonArray", bVar);
        throw null;
    }

    public static final c i(b bVar) {
        m.e(bVar, "<this>");
        c cVar = bVar instanceof c ? (c) bVar : null;
        if (cVar != null) {
            return cVar;
        }
        d("JsonObject", bVar);
        throw null;
    }

    public static final d j(b bVar) {
        m.e(bVar, "<this>");
        d dVar = bVar instanceof d ? (d) bVar : null;
        if (dVar != null) {
            return dVar;
        }
        d("JsonPrimitive", bVar);
        throw null;
    }

    public static final Long k(d dVar) {
        m.e(dVar, "<this>");
        try {
            return Long.valueOf(l(dVar));
        } catch (s unused) {
            return null;
        }
    }

    public static final long l(d dVar) {
        m.e(dVar, "<this>");
        L l2 = new L(dVar.d());
        long jI = l2.i();
        if (l2.f() == 10) {
            return jI;
        }
        int i3 = l2.f28603a;
        int i9 = i3 - 1;
        String str = l2.f28593e;
        AbstractC2851a.r(l2, f.h("Expected input to contain a single valid number, but got '", (i3 == str.length() || i9 < 0) ? "EOF" : String.valueOf(str.charAt(i9)), "' after it"), i9, null, 4);
        throw null;
    }
}
