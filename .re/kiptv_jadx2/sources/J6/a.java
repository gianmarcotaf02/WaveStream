package J6;

import W6.x;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.p;
import p101l7.b;
import p101l7.c;

public abstract class a {

    public static final LinkedHashSet f6631a;

    public static final b f6632b;

    static {
        List<c> listB0 = p.B0(x.f10689a, x.f10695h, x.f10696i, x.f10691c, x.f10692d, x.f10694f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c topLevelFqName : listB0) {
            m.e(topLevelFqName, "topLevelFqName");
            linkedHashSet.add(new b(topLevelFqName.b(), topLevelFqName.f24829a.f()));
        }
        f6631a = linkedHashSet;
        c REPEATABLE_ANNOTATION = x.g;
        m.d(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f6632b = new b(REPEATABLE_ANNOTATION.b(), REPEATABLE_ANNOTATION.f24829a.f());
    }
}
