package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class b implements D4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p041e3.b f21374a = new p041e3.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D4.c f21375b;

    static {
        G4.a aVar = new G4.a(1);
        java.util.HashMap map = new java.util.HashMap();
        map.put(G4.d.class, aVar);
        f21375b = new D4.c("storageMetrics", java.util.Collections.unmodifiableMap(new java.util.HashMap(map)));
    }

    @Override // D4.a
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        ((D4.e) obj2).b(f21375b, ((p067h3.b) obj).f22466a);
    }
}
