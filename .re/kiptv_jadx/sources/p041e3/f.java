package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class f implements D4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p041e3.f f21383a = new p041e3.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D4.c f21384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D4.c f21385c;

    static {
        G4.a aVar = new G4.a(1);
        java.util.HashMap map = new java.util.HashMap();
        map.put(G4.d.class, aVar);
        f21384b = new D4.c("currentCacheSizeBytes", java.util.Collections.unmodifiableMap(new java.util.HashMap(map)));
        G4.a aVar2 = new G4.a(2);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(G4.d.class, aVar2);
        f21385c = new D4.c("maxCacheSizeBytes", java.util.Collections.unmodifiableMap(new java.util.HashMap(map2)));
    }

    @Override // D4.a
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        p067h3.f fVar = (p067h3.f) obj;
        D4.e eVar = (D4.e) obj2;
        eVar.a(f21384b, fVar.f22480a);
        eVar.a(f21385c, fVar.f22481b);
    }
}
