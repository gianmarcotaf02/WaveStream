package L6;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L6.m f7089b = new L6.m(p078i6.p.B0(L6.g.f7081c, L6.j.f7084c, L6.h.f7082c, L6.i.f7083c));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f7090a;

    public m(java.util.List list) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : list) {
            p101l7.c cVar = ((L6.k) obj).f7085a;
            java.lang.Object arrayList = linkedHashMap.get(cVar);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(cVar, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        this.f7090a = linkedHashMap;
    }

    public final L6.l a(java.lang.String className, p101l7.c packageFqName) {
        java.lang.Integer numValueOf;
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        kotlin.jvm.internal.m.e(className, "className");
        java.util.List<L6.k> list = (java.util.List) this.f7090a.get(packageFqName);
        if (list != null) {
            for (L6.k kVar : list) {
                int i3 = 0;
                if (O7.x.x0(className, kVar.f7086b, false)) {
                    java.lang.String strSubstring = className.substring(kVar.f7086b.length());
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i9 = 0;
                    while (true) {
                        if (i3 >= length) {
                            numValueOf = java.lang.Integer.valueOf(i9);
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
                        return new L6.l(kVar, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }
}
