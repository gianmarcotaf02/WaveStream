package L6;

import O7.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p078i6.p;

public final class m {

    public static final m f7089b = new m(p.B0(g.f7081c, j.f7084c, h.f7082c, i.f7083c));

    public final LinkedHashMap f7090a;

    public m(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            p101l7.c cVar = ((k) obj).f7085a;
            Object arrayList = linkedHashMap.get(cVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVar, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f7090a = linkedHashMap;
    }

    public final l a(String className, p101l7.c packageFqName) {
        Integer numValueOf;
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        kotlin.jvm.internal.m.e(className, "className");
        List<k> list = (List) this.f7090a.get(packageFqName);
        if (list != null) {
            for (k kVar : list) {
                int i3 = 0;
                if (x.x0(className, kVar.f7086b, false)) {
                    String strSubstring = className.substring(kVar.f7086b.length());
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i9 = 0;
                    while (true) {
                        if (i3 >= length) {
                            numValueOf = Integer.valueOf(i9);
                            break;
                        }
                        int iCharAt = strSubstring.charAt(i3) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i9 = (i9 * 10) + iCharAt;
                        i3++;
                    }
                    if (numValueOf != null) {
                        return new l(kVar, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }
}
