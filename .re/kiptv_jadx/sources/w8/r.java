package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public A.a f30597A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A7.m f30598a = new A7.m(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p020c0.C1704s0 f30599b = new p020c0.C1704s0(26);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f30600c = new java.util.ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f30601d = new java.util.ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.sentry.protocol.a f30602e = new io.sentry.protocol.a(17);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30603f = true;
    public w8.C3022b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30605i;
    public w8.C3022b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w8.C3022b f30606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.net.Proxy f30607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.net.ProxySelector f30608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public w8.C3022b f30609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public javax.net.SocketFactory f30610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public javax.net.ssl.SSLSocketFactory f30611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public javax.net.ssl.X509TrustManager f30612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.util.List f30613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.util.List f30614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public J8.c f30615t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w8.C3027g f30616u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public N3.a f30617v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f30618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f30619x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f30620z;

    public r() {
        w8.C3022b c3022b = w8.C3022b.f30518a;
        this.g = c3022b;
        this.f30604h = true;
        this.f30605i = true;
        this.j = w8.C3022b.f30519b;
        this.f30606k = w8.C3022b.f30520c;
        this.f30609n = c3022b;
        javax.net.SocketFactory socketFactory = javax.net.SocketFactory.getDefault();
        kotlin.jvm.internal.m.d(socketFactory, "getDefault()");
        this.f30610o = socketFactory;
        this.f30613r = w8.s.f30622J;
        this.f30614s = w8.s.f30621I;
        this.f30615t = J8.c.f6635a;
        this.f30616u = w8.C3027g.f30533c;
        this.f30618w = 10000;
        this.f30619x = 10000;
        this.y = 10000;
        this.f30620z = androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public final void a(java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        java.util.ArrayList arrayListO1 = p078i6.o.O1(protocols);
        w8.t tVar = w8.t.H2_PRIOR_KNOWLEDGE;
        if (!arrayListO1.contains(tVar) && !arrayListO1.contains(w8.t.HTTP_1_1)) {
            throw new java.lang.IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayListO1).toString());
        }
        if (arrayListO1.contains(tVar) && arrayListO1.size() > 1) {
            throw new java.lang.IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayListO1).toString());
        }
        if (arrayListO1.contains(w8.t.HTTP_1_0)) {
            throw new java.lang.IllegalArgumentException(("protocols must not contain http/1.0: " + arrayListO1).toString());
        }
        if (arrayListO1.contains(null)) {
            throw new java.lang.IllegalArgumentException("protocols must not contain null");
        }
        arrayListO1.remove(w8.t.SPDY_3);
        if (!arrayListO1.equals(this.f30614s)) {
            this.f30597A = null;
        }
        java.util.List listUnmodifiableList = java.util.Collections.unmodifiableList(arrayListO1);
        kotlin.jvm.internal.m.d(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
        this.f30614s = listUnmodifiableList;
    }
}
