package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements D4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p041e3.g f21386a = new p041e3.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D4.c f21387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D4.c f21388c;

    static {
        G4.a aVar = new G4.a(1);
        java.util.HashMap map = new java.util.HashMap();
        map.put(G4.d.class, aVar);
        f21387b = new D4.c("startMs", java.util.Collections.unmodifiableMap(new java.util.HashMap(map)));
        G4.a aVar2 = new G4.a(2);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(G4.d.class, aVar2);
        f21388c = new D4.c("endMs", java.util.Collections.unmodifiableMap(new java.util.HashMap(map2)));
    }

    @Override // D4.a
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        p067h3.g gVar = (p067h3.g) obj;
        D4.e eVar = (D4.e) obj2;
        eVar.a(f21387b, gVar.f22482a);
        eVar.a(f21388c, gVar.f22483b);
    }
}
