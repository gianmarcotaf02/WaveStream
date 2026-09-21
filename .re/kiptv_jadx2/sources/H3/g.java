package H3;

public final class g implements InterfaceC0373b {

    public static g f3972b;

    public static final h f3973c = new h(0, 0, 0, false, false);

    public Object f3974a;

    public g(Object obj) {
        this.f3974a = obj;
    }

    public static synchronized g b() {
        try {
            if (f3972b == null) {
                f3972b = new g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3972b;
    }

    @Override
    public void a(D3.b bVar) {
        boolean z6 = bVar.f2097i == 0;
        p051f4.a aVar = (p051f4.a) this.f3974a;
        if (z6) {
            aVar.c(null, aVar.f18712E);
            return;
        }
        g gVar = aVar.f18727w;
        if (gVar != null) {
            ((E3.h) gVar.f3974a).m(bVar);
        }
    }
}
