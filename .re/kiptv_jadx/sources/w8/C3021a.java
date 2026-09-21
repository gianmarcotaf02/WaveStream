package w8;

/* JADX INFO: renamed from: w8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3021a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.C3022b f30509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final javax.net.SocketFactory f30510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f30511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final javax.net.ssl.HostnameVerifier f30512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w8.C3027g f30513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w8.C3022b f30514f;
    public final java.net.Proxy g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.net.ProxySelector f30515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w8.o f30516i;
    public final java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.List f30517k;

    public C3021a(java.lang.String uriHost, int i3, w8.C3022b dns, javax.net.SocketFactory socketFactory, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.HostnameVerifier hostnameVerifier, w8.C3027g c3027g, w8.C3022b proxyAuthenticator, java.net.Proxy proxy, java.util.List protocols, java.util.List connectionSpecs, java.net.ProxySelector proxySelector) {
        kotlin.jvm.internal.m.e(uriHost, "uriHost");
        kotlin.jvm.internal.m.e(dns, "dns");
        kotlin.jvm.internal.m.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.m.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.m.e(protocols, "protocols");
        kotlin.jvm.internal.m.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.m.e(proxySelector, "proxySelector");
        this.f30509a = dns;
        this.f30510b = socketFactory;
        this.f30511c = sSLSocketFactory;
        this.f30512d = hostnameVerifier;
        this.f30513e = c3027g;
        this.f30514f = proxyAuthenticator;
        this.g = proxy;
        this.f30515h = proxySelector;
        w8.n nVar = new w8.n();
        java.lang.String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            nVar.f30576a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new java.lang.IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            nVar.f30576a = "https";
        }
        java.lang.String strI = com.google.crypto.tink.shaded.protobuf.q0.I(w8.C3022b.e(uriHost, 0, 0, 7));
        if (strI == null) {
            throw new java.lang.IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        nVar.f30579d = strI;
        if (1 > i3 || i3 >= 65536) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "unexpected port: ").toString());
        }
        nVar.f30580e = i3;
        this.f30516i = nVar.a();
        this.j = x8.b.x(protocols);
        this.f30517k = x8.b.x(connectionSpecs);
    }

    public final boolean a(w8.C3021a that) {
        kotlin.jvm.internal.m.e(that, "that");
        return kotlin.jvm.internal.m.a(this.f30509a, that.f30509a) && kotlin.jvm.internal.m.a(this.f30514f, that.f30514f) && kotlin.jvm.internal.m.a(this.j, that.j) && kotlin.jvm.internal.m.a(this.f30517k, that.f30517k) && kotlin.jvm.internal.m.a(this.f30515h, that.f30515h) && kotlin.jvm.internal.m.a(this.g, that.g) && kotlin.jvm.internal.m.a(this.f30511c, that.f30511c) && kotlin.jvm.internal.m.a(this.f30512d, that.f30512d) && kotlin.jvm.internal.m.a(this.f30513e, that.f30513e) && this.f30516i.f30587e == that.f30516i.f30587e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof w8.C3021a)) {
            return false;
        }
        w8.C3021a c3021a = (w8.C3021a) obj;
        return kotlin.jvm.internal.m.a(this.f30516i, c3021a.f30516i) && a(c3021a);
    }

    public final int hashCode() {
        return java.util.Objects.hashCode(this.f30513e) + ((java.util.Objects.hashCode(this.f30512d) + ((java.util.Objects.hashCode(this.f30511c) + ((java.util.Objects.hashCode(this.g) + ((this.f30515h.hashCode() + B2.a.b(B2.a.b((this.f30514f.hashCode() + ((this.f30509a.hashCode() + B2.a.a(527, 31, this.f30516i.f30589h)) * 31)) * 31, 31, this.j), 31, this.f30517k)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Address{");
        w8.o oVar = this.f30516i;
        sb.append(oVar.f30586d);
        sb.append(':');
        sb.append(oVar.f30587e);
        sb.append(", ");
        java.net.Proxy proxy = this.g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f30515h;
        }
        return Y6.f.l(sb, str, '}');
    }
}
