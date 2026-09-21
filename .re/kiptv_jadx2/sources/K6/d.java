package K6;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d {

    public static final LinkedHashSet f6863a;

    static {
        Set<k> set = k.f6878l;
        ArrayList arrayList = new ArrayList(p078i6.q.I0(set, 10));
        for (k primitiveType : set) {
            kotlin.jvm.internal.m.e(primitiveType, "primitiveType");
            arrayList.add(p.f6955k.a(primitiveType.f6888h));
        }
        ArrayList<p101l7.c> arrayListZ1 = p078i6.o.z1(o.j.g(), p078i6.o.z1(o.f6930h.g(), p078i6.o.z1(o.f6929f.g(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (p101l7.c topLevelFqName : arrayListZ1) {
            kotlin.jvm.internal.m.e(topLevelFqName, "topLevelFqName");
            linkedHashSet.add(new p101l7.b(topLevelFqName.b(), topLevelFqName.f24829a.f()));
        }
        f6863a = linkedHashSet;
    }
}
