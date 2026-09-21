package p033d3;

import D4.c;
import D4.d;
import D4.e;
import io.sentry.SentryEvent;
import io.sentry.protocol.Device;

public final class b implements d {

    public static final b f21162a = new b();

    public static final c f21163b = c.a("sdkVersion");

    public static final c f21164c = c.a(Device.JsonKeys.MODEL);

    public static final c f21165d = c.a("hardware");

    public static final c f21166e = c.a(Device.TYPE);

    public static final c f21167f = c.a("product");
    public static final c g = c.a("osBuild");

    public static final c f21168h = c.a(Device.JsonKeys.MANUFACTURER);

    public static final c f21169i = c.a(SentryEvent.JsonKeys.FINGERPRINT);
    public static final c j = c.a(Device.JsonKeys.LOCALE);

    public static final c f21170k = c.a("country");

    public static final c f21171l = c.a("mccMnc");

    public static final c f21172m = c.a("applicationBuild");

    @Override
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        h hVar = (h) ((a) obj);
        eVar.b(f21163b, hVar.f21195a);
        eVar.b(f21164c, hVar.f21196b);
        eVar.b(f21165d, hVar.f21197c);
        eVar.b(f21166e, hVar.f21198d);
        eVar.b(f21167f, hVar.f21199e);
        eVar.b(g, hVar.f21200f);
        eVar.b(f21168h, hVar.g);
        eVar.b(f21169i, hVar.f21201h);
        eVar.b(j, hVar.f21202i);
        eVar.b(f21170k, hVar.j);
        eVar.b(f21171l, hVar.f21203k);
        eVar.b(f21172m, hVar.f21204l);
    }
}
