package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements D4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p041e3.a f21369a = new p041e3.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D4.c f21370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D4.c f21371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D4.c f21372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D4.c f21373e;

    static {
        G4.a aVar = new G4.a(1);
        java.util.HashMap map = new java.util.HashMap();
        map.put(G4.d.class, aVar);
        f21370b = new D4.c("window", java.util.Collections.unmodifiableMap(new java.util.HashMap(map)));
        G4.a aVar2 = new G4.a(2);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(G4.d.class, aVar2);
        f21371c = new D4.c("logSourceMetrics", java.util.Collections.unmodifiableMap(new java.util.HashMap(map2)));
        G4.a aVar3 = new G4.a(3);
        java.util.HashMap map3 = new java.util.HashMap();
        map3.put(G4.d.class, aVar3);
        f21372d = new D4.c("globalMetrics", java.util.Collections.unmodifiableMap(new java.util.HashMap(map3)));
        G4.a aVar4 = new G4.a(4);
        java.util.HashMap map4 = new java.util.HashMap();
        map4.put(G4.d.class, aVar4);
        f21373e = new D4.c("appNamespace", java.util.Collections.unmodifiableMap(new java.util.HashMap(map4)));
    }

    @Override // D4.a
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        p067h3.a aVar = (p067h3.a) obj;
        D4.e eVar = (D4.e) obj2;
        eVar.b(f21370b, aVar.f22462a);
        eVar.b(f21371c, aVar.f22463b);
        eVar.b(f21372d, aVar.f22464c);
        eVar.b(f21373e, aVar.f22465d);
    }
}
