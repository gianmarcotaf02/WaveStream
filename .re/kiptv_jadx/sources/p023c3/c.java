package p023c3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p050f3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p166t3.i f18501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.net.ConnectivityManager f18502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.Context f18503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.net.URL f18504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V1.b f18505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V1.b f18506f;
    public final int g;

    public c(android.content.Context context, V1.b bVar, V1.b bVar2) {
        F4.d dVar = new F4.d();
        p033d3.c cVar = p033d3.c.f21173a;
        dVar.a(p033d3.o.class, cVar);
        dVar.a(p033d3.i.class, cVar);
        p033d3.f fVar = p033d3.f.f21185a;
        dVar.a(p033d3.s.class, fVar);
        dVar.a(p033d3.l.class, fVar);
        p033d3.d dVar2 = p033d3.d.f21175a;
        dVar.a(p033d3.q.class, dVar2);
        dVar.a(p033d3.j.class, dVar2);
        p033d3.b bVar3 = p033d3.b.f21162a;
        dVar.a(p033d3.a.class, bVar3);
        dVar.a(p033d3.h.class, bVar3);
        p033d3.e eVar = p033d3.e.f21178a;
        dVar.a(p033d3.r.class, eVar);
        dVar.a(p033d3.k.class, eVar);
        p033d3.g gVar = p033d3.g.f21192a;
        dVar.a(p033d3.v.class, gVar);
        dVar.a(p033d3.n.class, gVar);
        dVar.f3660d = true;
        this.f18501a = new p166t3.i(10, dVar);
        this.f18503c = context;
        this.f18502b = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.f18504d = b(p023c3.a.f18493c);
        this.f18505e = bVar2;
        this.f18506f = bVar;
        this.g = 130000;
    }

    public static java.net.URL b(java.lang.String str) {
        try {
            return new java.net.URL(str);
        } catch (java.net.MalformedURLException e6) {
            throw new java.lang.IllegalArgumentException(p121o0.p.C("Invalid url: ", str), e6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    public final p041e3.h a(p041e3.h hVar) {
        int type;
        int subtype;
        java.util.HashMap map;
        android.net.NetworkInfo activeNetworkInfo = this.f18502b.getActiveNetworkInfo();
        Z2.C0 c0C = hVar.c();
        int i3 = android.os.Build.VERSION.SDK_INT;
        java.util.HashMap map2 = (java.util.HashMap) c0C.f12660f;
        if (map2 == null) {
            throw new java.lang.IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", java.lang.String.valueOf(i3));
        c0C.b(io.sentry.protocol.Device.JsonKeys.MODEL, android.os.Build.MODEL);
        c0C.b("hardware", android.os.Build.HARDWARE);
        c0C.b(io.sentry.protocol.Device.TYPE, android.os.Build.DEVICE);
        c0C.b("product", android.os.Build.PRODUCT);
        c0C.b("os-uild", android.os.Build.ID);
        c0C.b(io.sentry.protocol.Device.JsonKeys.MANUFACTURER, android.os.Build.MANUFACTURER);
        c0C.b(io.sentry.SentryEvent.JsonKeys.FINGERPRINT, android.os.Build.FINGERPRINT);
        java.util.Calendar.getInstance();
        long offset = java.util.TimeZone.getDefault().getOffset(java.util.Calendar.getInstance().getTimeInMillis()) / 1000;
        java.util.HashMap map3 = (java.util.HashMap) c0C.f12660f;
        if (map3 == null) {
            throw new java.lang.IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", java.lang.String.valueOf(offset));
        int i9 = -1;
        if (activeNetworkInfo == null) {
            android.util.SparseArray sparseArray = p033d3.u.f21226h;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        java.util.HashMap map4 = (java.util.HashMap) c0C.f12660f;
        if (map4 == null) {
            throw new java.lang.IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", java.lang.String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                android.util.SparseArray sparseArray2 = p033d3.t.f21224h;
                subtype = 100;
            } else if (((p033d3.t) p033d3.t.f21224h.get(subtype)) == null) {
            }
            map = (java.util.HashMap) c0C.f12660f;
            if (map != null) {
                throw new java.lang.IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", java.lang.String.valueOf(subtype));
            c0C.b("country", java.util.Locale.getDefault().getCountry());
            c0C.b(io.sentry.protocol.Device.JsonKeys.LOCALE, java.util.Locale.getDefault().getLanguage());
            android.content.Context context = this.f18503c;
            c0C.b("mcc_mnc", ((android.telephony.TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i9 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                com.google.android.gms.internal.play_billing.V0.r(e6, "CctTransportBackend", "Unable to find version code for package");
            }
            c0C.b("application_build", java.lang.Integer.toString(i9));
            return c0C.d();
        }
        android.util.SparseArray sparseArray3 = p033d3.t.f21224h;
        subtype = 0;
        map = (java.util.HashMap) c0C.f12660f;
        if (map != null) {
            throw new java.lang.IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", java.lang.String.valueOf(subtype));
        c0C.b("country", java.util.Locale.getDefault().getCountry());
        c0C.b(io.sentry.protocol.Device.JsonKeys.LOCALE, java.util.Locale.getDefault().getLanguage());
        android.content.Context context2 = this.f18503c;
        c0C.b("mcc_mnc", ((android.telephony.TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i9 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c0C.b("application_build", java.lang.Integer.toString(i9));
        return c0C.d();
    }
}
