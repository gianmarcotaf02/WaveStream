package p033d3;

import D4.c;
import D4.d;
import D4.e;

public final class f implements d {

    public static final f f21185a = new f();

    public static final c f21186b = c.a("requestTimeMs");

    public static final c f21187c = c.a("requestUptimeMs");

    public static final c f21188d = c.a("clientInfo");

    public static final c f21189e = c.a("logSource");

    public static final c f21190f = c.a("logSourceName");
    public static final c g = c.a("logEvent");

    public static final c f21191h = c.a("qosTier");

    @Override
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        l lVar = (l) ((s) obj);
        eVar.a(f21186b, lVar.f21213a);
        eVar.a(f21187c, lVar.f21214b);
        eVar.b(f21188d, lVar.f21215c);
        eVar.b(f21189e, lVar.f21216d);
        eVar.b(f21190f, lVar.f21217e);
        eVar.b(g, lVar.f21218f);
        eVar.b(f21191h, w.f21228h);
    }
}
