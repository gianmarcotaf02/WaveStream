package p185w4;

/* JADX INFO: loaded from: classes.dex */
public final class i implements o4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p185w4.i f29978a = new p185w4.i();

    @Override // o4.m
    public final java.lang.Class a() {
        return p185w4.g.class;
    }

    @Override // o4.m
    public final java.lang.Class b() {
        return p185w4.g.class;
    }

    @Override // o4.m
    public final java.lang.Object c(j1.l lVar) throws java.security.GeneralSecurityException {
        if (((o4.k) lVar.j) == null) {
            throw new java.security.GeneralSecurityException("no primary in primitive set");
        }
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) lVar.f23899i).values().iterator();
        while (it.hasNext()) {
            java.util.Iterator it2 = ((java.util.List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new p185w4.h();
    }
}
