package H3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements H3.InterfaceC0373b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static H3.g f3972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H3.h f3973c = new H3.h(0, 0, 0, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f3974a;

    public /* synthetic */ g(java.lang.Object obj) {
        this.f3974a = obj;
    }

    public static synchronized H3.g b() {
        try {
            if (f3972b == null) {
                f3972b = new H3.g();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f3972b;
    }

    @Override // H3.InterfaceC0373b
    public void a(D3.b bVar) {
        boolean z6 = bVar.f2097i == 0;
        p051f4.a aVar = (p051f4.a) this.f3974a;
        if (z6) {
            aVar.c(null, aVar.f18712E);
            return;
        }
        H3.g gVar = aVar.f18727w;
        if (gVar != null) {
            ((E3.h) gVar.f3974a).m(bVar);
        }
    }
}
