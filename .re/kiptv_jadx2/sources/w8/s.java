package w8;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p020c0.C1704s0;

public final class s implements Cloneable, InterfaceC3024d, G {

    public static final List f30621I = x8.b.l(t.HTTP_2, t.HTTP_1_1);

    public static final List f30622J = x8.b.l(j.f30554e, j.f30555f);

    public final J8.c f30623A;

    public final C3027g f30624B;

    public final N3.a f30625C;

    public final int f30626D;

    public final int f30627E;

    public final int f30628F;

    public final long f30629G;
    public final A.a H;

    public final A7.m f30630h;

    public final C1704s0 f30631i;
    public final List j;

    public final List f30632k;

    public final io.sentry.protocol.a f30633l;

    public final boolean f30634m;

    public final C3022b f30635n;

    public final boolean f30636o;

    public final boolean f30637p;

    public final C3022b f30638q;

    public final C3022b f30639r;

    public final Proxy f30640s;

    public final ProxySelector f30641t;

    public final C3022b f30642u;

    public final SocketFactory f30643v;

    public final SSLSocketFactory f30644w;

    public final X509TrustManager f30645x;
    public final List y;

    public final List f30646z;

    public s(r rVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
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
        Proxy proxy = rVar.f30607l;
        this.f30640s = proxy;
        if (proxy != null) {
            proxySelector = G8.a.f3831a;
        } else {
            proxySelector = rVar.f30608m;
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = G8.a.f3831a;
            }
        }
        this.f30641t = proxySelector;
        this.f30642u = rVar.f30609n;
        this.f30643v = rVar.f30610o;
        List list = rVar.f30613r;
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
            this.f30624B = C3027g.f30533c;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f30644w = null;
                this.f30625C = null;
                this.f30645x = null;
                this.f30624B = C3027g.f30533c;
                break;
            }
            if (((j) it.next()).f30556a) {
                SSLSocketFactory sSLSocketFactory = rVar.f30611p;
                if (sSLSocketFactory == null) {
                    E8.n nVar = E8.n.f3326a;
                    X509TrustManager x509TrustManagerM = E8.n.f3326a.m();
                    this.f30645x = x509TrustManagerM;
                    this.f30644w = E8.n.f3326a.l(x509TrustManagerM);
                    N3.a aVarB = E8.n.f3326a.b(x509TrustManagerM);
                    this.f30625C = aVarB;
                    C3027g c3027g = rVar.f30616u;
                    c3027g.getClass();
                    this.f30624B = kotlin.jvm.internal.m.a(c3027g.f30535b, aVarB) ? c3027g : new C3027g(c3027g.f30534a, aVarB);
                    break;
                }
                this.f30644w = sSLSocketFactory;
                N3.a aVar2 = rVar.f30617v;
                kotlin.jvm.internal.m.b(aVar2);
                this.f30625C = aVar2;
                X509TrustManager x509TrustManager = rVar.f30612q;
                kotlin.jvm.internal.m.b(x509TrustManager);
                this.f30645x = x509TrustManager;
                C3027g c3027g2 = rVar.f30616u;
                c3027g2.getClass();
                this.f30624B = kotlin.jvm.internal.m.a(c3027g2.f30535b, aVar2) ? c3027g2 : new C3027g(c3027g2.f30534a, aVar2);
                break;
            }
        }
        List list2 = this.j;
        kotlin.jvm.internal.m.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
        List list3 = this.f30632k;
        kotlin.jvm.internal.m.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list3).toString());
        }
        X509TrustManager x509TrustManager2 = this.f30645x;
        N3.a aVar3 = this.f30625C;
        SSLSocketFactory sSLSocketFactory2 = this.f30644w;
        List list4 = this.y;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((j) it2.next()).f30556a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (aVar3 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (aVar3 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!kotlin.jvm.internal.m.a(this.f30624B, C3027g.f30533c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final r a() {
        r rVar = new r();
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

    public final Object clone() {
        return super.clone();
    }
}
