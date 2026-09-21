package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements D4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p041e3.c f21376a = new p041e3.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D4.c f21377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D4.c f21378c;

    static {
        G4.a aVar = new G4.a(1);
        java.util.HashMap map = new java.util.HashMap();
        map.put(G4.d.class, aVar);
        f21377b = new D4.c("eventsDroppedCount", java.util.Collections.unmodifiableMap(new java.util.HashMap(map)));
        G4.a aVar2 = new G4.a(3);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(G4.d.class, aVar2);
        f21378c = new D4.c(io.sentry.clientreport.DiscardedEvent.JsonKeys.REASON, java.util.Collections.unmodifiableMap(new java.util.HashMap(map2)));
    }

    @Override // D4.a
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        p067h3.d dVar = (p067h3.d) obj;
        D4.e eVar = (D4.e) obj2;
        eVar.a(f21377b, dVar.f22475a);
        eVar.b(f21378c, dVar.f22476b);
    }
}
