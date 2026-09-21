package p185w4;

/* JADX INFO: loaded from: classes.dex */
public final class p implements o4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.logging.Logger f29992a = java.util.logging.Logger.getLogger(p185w4.p.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f29993b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p185w4.p f29994c = new p185w4.p();

    @Override // o4.m
    public final java.lang.Class a() {
        return o4.j.class;
    }

    @Override // o4.m
    public final java.lang.Class b() {
        return o4.j.class;
    }

    @Override // o4.m
    public final java.lang.Object c(j1.l lVar) throws java.security.GeneralSecurityException {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) lVar.f23899i).values().iterator();
        while (it.hasNext()) {
            for (o4.k kVar : (java.util.List) it.next()) {
                o4.b bVar = kVar.f26129h;
                if (bVar instanceof p185w4.n) {
                    p185w4.n nVar = (p185w4.n) bVar;
                    byte[] bArr = kVar.f26125c;
                    C4.a aVarA = C4.a.a(bArr == null ? null : java.util.Arrays.copyOf(bArr, bArr.length));
                    if (!aVarA.equals(nVar.b())) {
                        throw new java.security.GeneralSecurityException("Mac Key with parameters " + nVar.c() + " has wrong output prefix (" + nVar.b() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
        return new p185w4.o(lVar);
    }
}
