package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements java.lang.Cloneable, w8.InterfaceC3024d, w8.G {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final java.util.List f30621I = x8.b.l(w8.t.HTTP_2, w8.t.HTTP_1_1);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final java.util.List f30622J = x8.b.l(w8.j.f30554e, w8.j.f30555f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final J8.c f30623A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final w8.C3027g f30624B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final N3.a f30625C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f30626D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f30627E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f30628F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f30629G;
    public final A.a H;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A7.m f30630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p020c0.C1704s0 f30631i;
    public final java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.List f30632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final io.sentry.protocol.a f30633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f30634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w8.C3022b f30635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f30636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f30637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w8.C3022b f30638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w8.C3022b f30639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.net.Proxy f30640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.net.ProxySelector f30641t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final w8.C3022b f30642u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final javax.net.SocketFactory f30643v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f30644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final javax.net.ssl.X509TrustManager f30645x;
    public final java.util.List y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final java.util.List f30646z;

    public s(w8.r rVar) throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        java.net.ProxySelector proxySelector;
        this.f30630h = rVar.f30598a;
        this.f30631i = rVar.f30599b;
        this.j = x8.b.x(rVar.f30600c);
        this.f30632k = x8.b.x(rVar.f30601d);
        this.f30633l = rVar.f30602e;
        this.f30634m = rVar.f30603f;
        this.f30635n = rVar.g;
        this.f30636o = rVar.f30604h;
        this.f30637p = rVar.f30605i;
        this.f30638q = rVar.j;
        this.f30639r = rVar.f30606k;
        java.net.Proxy proxy = rVar.f30607l;
        this.f30640s = proxy;
        if (proxy != null) {
            proxySelector = G8.a.f3831a;
        } else {
            proxySelector = rVar.f30608m;
            proxySelector = proxySelector == null ? java.net.ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = G8.a.f3831a;
            }
        }
        this.f30641t = proxySelector;
        this.f30642u = rVar.f30609n;
        this.f30643v = rVar.f30610o;
        java.util.List list = rVar.f30613r;
        this.y = list;
        this.f30646z = rVar.f30614s;
        this.f30623A = rVar.f30615t;
        this.f30626D = rVar.f30618w;
        this.f30627E = rVar.f30619x;
        this.f30628F = rVar.y;
        this.f30629G = rVar.f30620z;
        A.a aVar = rVar.f30597A;
        this.H = aVar == null ? new A.a(1) : aVar;
        if (list != null && list.isEmpty()) {
            this.f30644w = null;
            this.f30625C = null;
            this.f30645x = null;
            this.f30624B = w8.C3027g.f30533c;
            break;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f30644w = null;
                this.f30625C = null;
                this.f30645x = null;
                this.f30624B = w8.C3027g.f30533c;
                break;
            }
            if (((w8.j) it.next()).f30556a) {
                javax.net.ssl.SSLSocketFactory sSLSocketFactory = rVar.f30611p;
                if (sSLSocketFactory == null) {
                    E8.n nVar = E8.n.f3326a;
                    javax.net.ssl.X509TrustManager x509TrustManagerM = E8.n.f3326a.m();
                    this.f30645x = x509TrustManagerM;
                    this.f30644w = E8.n.f3326a.l(x509TrustManagerM);
                    N3.a aVarB = E8.n.f3326a.b(x509TrustManagerM);
                    this.f30625C = aVarB;
                    w8.C3027g c3027g = rVar.f30616u;
                    c3027g.getClass();
                    this.f30624B = kotlin.jvm.internal.m.a(c3027g.f30535b, aVarB) ? c3027g : new w8.C3027g(c3027g.f30534a, aVarB);
                    break;
                }
                this.f30644w = sSLSocketFactory;
                N3.a aVar2 = rVar.f30617v;
                kotlin.jvm.internal.m.b(aVar2);
                this.f30625C = aVar2;
                javax.net.ssl.X509TrustManager x509TrustManager = rVar.f30612q;
                kotlin.jvm.internal.m.b(x509TrustManager);
                this.f30645x = x509TrustManager;
                w8.C3027g c3027g2 = rVar.f30616u;
                c3027g2.getClass();
                this.f30624B = kotlin.jvm.internal.m.a(c3027g2.f30535b, aVar2) ? c3027g2 : new w8.C3027g(c3027g2.f30534a, aVar2);
                break;
            }
        }
        java.util.List list2 = this.j;
        kotlin.jvm.internal.m.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new java.lang.IllegalStateException(("Null interceptor: " + list2).toString());
        }
        java.util.List list3 = this.f30632k;
        kotlin.jvm.internal.m.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new java.lang.IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        javax.net.ssl.X509TrustManager x509TrustManager2 = this.f30645x;
        N3.a aVar3 = this.f30625C;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = this.f30644w;
        java.util.List list4 = this.y;
        if (list4 == null || !list4.isEmpty()) {
            java.util.Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((w8.j) it2.next()).f30556a) {
                    if (sSLSocketFactory2 == null) {
                        throw new java.lang.IllegalStateException("sslSocketFactory == null");
                    }
                    if (aVar3 == null) {
                        throw new java.lang.IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new java.lang.IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (aVar3 != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.m.a(this.f30624B, w8.C3027g.f30533c)) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }

    public final w8.r a() {
        w8.r rVar = new w8.r();
        rVar.f30598a = this.f30630h;
        rVar.f30599b = this.f30631i;
        p078i6.u.M0(rVar.f30600c, this.j);
        p078i6.u.M0(rVar.f30601d, this.f30632k);
        rVar.f30602e = this.f30633l;
        rVar.f30603f = this.f30634m;
        rVar.g = this.f30635n;
        rVar.f30604h = this.f30636o;
        rVar.f30605i = this.f30637p;
        rVar.j = this.f30638q;
        rVar.f30606k = this.f30639r;
        rVar.f30607l = this.f30640s;
        rVar.f30608m = this.f30641t;
        rVar.f30609n = this.f30642u;
        rVar.f30610o = this.f30643v;
        rVar.f30611p = this.f30644w;
        rVar.f30612q = this.f30645x;
        rVar.f30613r = this.y;
        rVar.f30614s = this.f30646z;
        rVar.f30615t = this.f30623A;
        rVar.f30616u = this.f30624B;
        rVar.f30617v = this.f30625C;
        rVar.f30618w = this.f30626D;
        rVar.f30619x = this.f30627E;
        rVar.y = this.f30628F;
        rVar.f30620z = this.f30629G;
        rVar.f30597A = this.H;
        return rVar;
    }

    public final java.lang.Object clone() {
        return super.clone();
    }
}
