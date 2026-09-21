package p005a5;

import com.kiptv.core.model.TMDBImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.o;

public final class C1265e8 {
    public static String a(String language, List list) {
        Object next;
        Object next2;
        m.e(language, "language");
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!m.a(((TMDBImage) next).f20184e, language));
            TMDBImage tMDBImage = (TMDBImage) next;
            if (tMDBImage != null) {
                return tMDBImage.f20180a;
            }
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!m.a(((TMDBImage) next2).f20184e, "en"));
            TMDBImage tMDBImage2 = (TMDBImage) next2;
            if (tMDBImage2 != null) {
                return tMDBImage2.f20180a;
            }
            TMDBImage tMDBImage3 = (TMDBImage) o.j1(list);
            if (tMDBImage3 != null) {
                return tMDBImage3.f20180a;
            }
        }
        return null;
    }

    public static String b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TMDBImage) obj).f20184e == null) {
                arrayList.add(obj);
            }
        }
        TMDBImage tMDBImage = (TMDBImage) o.j1(o.I1(arrayList, new B(16)));
        if (tMDBImage != null) {
            return tMDBImage.f20180a;
        }
        return null;
    }
}
