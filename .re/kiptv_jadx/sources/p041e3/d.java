package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class d implements D4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p041e3.d f21379a = new p041e3.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D4.c f21380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D4.c f21381c;

    static {
        G4.a aVar = new G4.a(1);
        java.util.HashMap map = new java.util.HashMap();
        map.put(G4.d.class, aVar);
        f21380b = new D4.c("logSource", java.util.Collections.unmodifiableMap(new java.util.HashMap(map)));
        G4.a aVar2 = new G4.a(2);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(G4.d.class, aVar2);
        f21381c = new D4.c("logEventDropped", java.util.Collections.unmodifiableMap(new java.util.HashMap(map2)));
    }

    @Override // D4.a
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        p067h3.e eVar = (p067h3.e) obj;
        D4.e eVar2 = (D4.e) obj2;
        eVar2.b(f21380b, eVar.f22478a);
        eVar2.b(f21381c, eVar.f22479b);
    }
}
