package p005a5;

/* JADX INFO: renamed from: a5.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1265e8 {
    public static java.lang.String a(java.lang.String language, java.util.List list) {
        java.lang.Object next;
        java.lang.Object next2;
        kotlin.jvm.internal.m.e(language, "language");
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.jvm.internal.m.a(((com.kiptv.core.model.TMDBImage) next).f20184e, language));
            com.kiptv.core.model.TMDBImage tMDBImage = (com.kiptv.core.model.TMDBImage) next;
            if (tMDBImage != null) {
                return tMDBImage.f20180a;
            }
            java.util.Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!kotlin.jvm.internal.m.a(((com.kiptv.core.model.TMDBImage) next2).f20184e, "en"));
            com.kiptv.core.model.TMDBImage tMDBImage2 = (com.kiptv.core.model.TMDBImage) next2;
            if (tMDBImage2 != null) {
                return tMDBImage2.f20180a;
            }
            com.kiptv.core.model.TMDBImage tMDBImage3 = (com.kiptv.core.model.TMDBImage) p078i6.o.j1(list);
            if (tMDBImage3 != null) {
                return tMDBImage3.f20180a;
            }
        }
        return null;
    }

    public static java.lang.String b(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((com.kiptv.core.model.TMDBImage) obj).f20184e == null) {
                arrayList.add(obj);
            }
        }
        com.kiptv.core.model.TMDBImage tMDBImage = (com.kiptv.core.model.TMDBImage) p078i6.o.j1(p078i6.o.I1(arrayList, new p005a5.B(16)));
        if (tMDBImage != null) {
            return tMDBImage.f20180a;
        }
        return null;
    }
}
