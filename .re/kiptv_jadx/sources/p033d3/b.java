package p033d3;

/* JADX INFO: loaded from: classes.dex */
public final class b implements D4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p033d3.b f21162a = new p033d3.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D4.c f21163b = D4.c.a("sdkVersion");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D4.c f21164c = D4.c.a(io.sentry.protocol.Device.JsonKeys.MODEL);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D4.c f21165d = D4.c.a("hardware");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final D4.c f21166e = D4.c.a(io.sentry.protocol.Device.TYPE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D4.c f21167f = D4.c.a("product");
    public static final D4.c g = D4.c.a("osBuild");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D4.c f21168h = D4.c.a(io.sentry.protocol.Device.JsonKeys.MANUFACTURER);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final D4.c f21169i = D4.c.a(io.sentry.SentryEvent.JsonKeys.FINGERPRINT);
    public static final D4.c j = D4.c.a(io.sentry.protocol.Device.JsonKeys.LOCALE);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final D4.c f21170k = D4.c.a("country");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final D4.c f21171l = D4.c.a("mccMnc");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final D4.c f21172m = D4.c.a("applicationBuild");

    @Override // D4.a
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        D4.e eVar = (D4.e) obj2;
        p033d3.h hVar = (p033d3.h) ((p033d3.a) obj);
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
