package p033d3;

import D4.c;
import D4.d;

public final class e implements d {

    public static final e f21178a = new e();

    public static final c f21179b = c.a("eventTimeMs");

    public static final c f21180c = c.a("eventCode");

    public static final c f21181d = c.a("eventUptimeMs");

    public static final c f21182e = c.a("sourceExtension");

    public static final c f21183f = c.a("sourceExtensionJsonProto3");
    public static final c g = c.a("timezoneOffsetSeconds");

    public static final c f21184h = c.a("networkConnectionInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        D4.e eVar = (D4.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.a(f21179b, kVar.f21207a);
        eVar.b(f21180c, kVar.f21208b);
        eVar.a(f21181d, kVar.f21209c);
        eVar.b(f21182e, kVar.f21210d);
        eVar.b(f21183f, kVar.f21211e);
        eVar.a(g, kVar.f21212f);
        eVar.b(f21184h, kVar.g);
    }
}
