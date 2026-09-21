package p044e7;

import C7.AbstractC0171c;
import C7.AbstractC0191x;
import C7.B;
import E7.l;
import I3.b;
import O7.q;
import j7.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.m;
import p017b7.g;
import p062g7.Q;
import p169t7.c;
import y7.p;

public final class f implements p {

    public static final f f21453b = new f();

    public static final f f21454c = new f();

    public static final f f21455d = new f();

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static k b(String representation) {
        c cVar;
        m.e(representation, "representation");
        char cCharAt = representation.charAt(0);
        c[] cVarArrValues = c.values();
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
            return new j(cVar);
        }
        if (cCharAt == 'V') {
            return new j(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            m.d(strSubstring, "substring(...)");
            return new h(b(strSubstring));
        }
        if (cCharAt == 'L') {
            q.F0(representation, ';');
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        m.d(strSubstring2, "substring(...)");
        return new i(strSubstring2);
    }

    public static i d(String internalName) {
        m.e(internalName, "internalName");
        return new i(internalName);
    }

    public static LinkedHashSet e(String internalName, String... signatures) {
        m.e(internalName, "internalName");
        m.e(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String str, String... signatures) {
        m.e(signatures, "signatures");
        return e("java/lang/".concat(str), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static LinkedHashSet g(String str, String... strArr) {
        return e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String h(k type) {
        String strC;
        m.e(type, "type");
        if (type instanceof h) {
            return "[" + h(((h) type).f21458i);
        }
        if (type instanceof j) {
            c cVar = ((j) type).f21460i;
            return (cVar == null || (strC = cVar.c()) == null) ? "V" : strC;
        }
        if (type instanceof i) {
            return Y6.f.l(new StringBuilder("L"), ((i) type).f21459i, ';');
        }
        throw new b();
    }

    @Override
    public AbstractC0191x c(Q proto, String flexibleId, B lowerBound, B upperBound) {
        m.e(proto, "proto");
        m.e(flexibleId, "flexibleId");
        m.e(lowerBound, "lowerBound");
        m.e(upperBound, "upperBound");
        if (flexibleId.equals("kotlin.jvm.PlatformType")) {
            return proto.k(k.g) ? new g(lowerBound, upperBound) : AbstractC0171c.e(lowerBound, upperBound);
        }
        return l.c(E7.k.f3271t, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}
