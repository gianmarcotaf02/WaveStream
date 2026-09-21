package J6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedHashSet f6631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p101l7.b f6632b;

    static {
        java.util.List<p101l7.c> listB0 = p078i6.p.B0(W6.x.f10689a, W6.x.f10695h, W6.x.f10696i, W6.x.f10691c, W6.x.f10692d, W6.x.f10694f);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (p101l7.c topLevelFqName : listB0) {
            kotlin.jvm.internal.m.e(topLevelFqName, "topLevelFqName");
            linkedHashSet.add(new p101l7.b(topLevelFqName.b(), topLevelFqName.f24829a.f()));
        }
        f6631a = linkedHashSet;
        p101l7.c REPEATABLE_ANNOTATION = W6.x.g;
        kotlin.jvm.internal.m.d(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f6632b = new p101l7.b(REPEATABLE_ANNOTATION.b(), REPEATABLE_ANNOTATION.f24829a.f());
    }
}
