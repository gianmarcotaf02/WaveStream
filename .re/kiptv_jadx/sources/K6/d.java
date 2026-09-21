package K6;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedHashSet f6863a;

    static {
        java.util.Set<K6.k> set = K6.k.f6878l;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(set, 10));
        for (K6.k primitiveType : set) {
            kotlin.jvm.internal.m.e(primitiveType, "primitiveType");
            arrayList.add(K6.p.f6955k.a(primitiveType.f6888h));
        }
        java.util.ArrayList<p101l7.c> arrayListZ1 = p078i6.o.z1(K6.o.j.g(), p078i6.o.z1(K6.o.f6930h.g(), p078i6.o.z1(K6.o.f6929f.g(), arrayList)));
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (p101l7.c topLevelFqName : arrayListZ1) {
            kotlin.jvm.internal.m.e(topLevelFqName, "topLevelFqName");
            linkedHashSet.add(new p101l7.b(topLevelFqName.b(), topLevelFqName.f24829a.f()));
        }
        f6863a = linkedHashSet;
    }
}
