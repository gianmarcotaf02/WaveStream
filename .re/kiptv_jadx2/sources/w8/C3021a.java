package w8;

import com.google.android.gms.internal.play_billing.M0;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class C3021a {

    public final C3022b f30509a;

    public final SocketFactory f30510b;

    public final SSLSocketFactory f30511c;

    public final HostnameVerifier f30512d;

    public final C3027g f30513e;

    public final C3022b f30514f;
    public final Proxy g;

    public final ProxySelector f30515h;

    public final o f30516i;
    public final List j;

    public final List f30517k;

    public C3021a(String uriHost, int i3, C3022b dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C3027g c3027g, C3022b proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
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
        n nVar = new n();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            nVar.f30576a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            nVar.f30576a = "https";
        }
        String strI = q0.I(C3022b.e(uriHost, 0, 0, 7));
        if (strI == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        nVar.f30579d = strI;
        if (1 > i3 || i3 >= 65536) {
            throw new IllegalArgumentException(M0.l(i3, "unexpected port: ").toString());
        }
        nVar.f30580e = i3;
        this.f30516i = nVar.a();
        this.j = x8.b.x(protocols);
        this.f30517k = x8.b.x(connectionSpecs);
    }

    public final boolean a(C3021a that) {
        kotlin.jvm.internal.m.e(that, "that");
        return kotlin.jvm.internal.m.a(this.f30509a, that.f30509a) && kotlin.jvm.internal.m.a(this.f30514f, that.f30514f) && kotlin.jvm.internal.m.a(this.j, that.j) && kotlin.jvm.internal.m.a(this.f30517k, that.f30517k) && kotlin.jvm.internal.m.a(this.f30515h, that.f30515h) && kotlin.jvm.internal.m.a(this.g, that.g) && kotlin.jvm.internal.m.a(this.f30511c, that.f30511c) && kotlin.jvm.internal.m.a(this.f30512d, that.f30512d) && kotlin.jvm.internal.m.a(this.f30513e, that.f30513e) && this.f30516i.f30587e == that.f30516i.f30587e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3021a)) {
            return false;
        }
        C3021a c3021a = (C3021a) obj;
        return kotlin.jvm.internal.m.a(this.f30516i, c3021a.f30516i) && a(c3021a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f30513e) + ((Objects.hashCode(this.f30512d) + ((Objects.hashCode(this.f30511c) + ((Objects.hashCode(this.g) + ((this.f30515h.hashCode() + B2.a.b(B2.a.b((this.f30514f.hashCode() + ((this.f30509a.hashCode() + B2.a.a(527, 31, this.f30516i.f30589h)) * 31)) * 31, 31, this.j), 31, this.f30517k)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        o oVar = this.f30516i;
        sb.append(oVar.f30586d);
        sb.append(':');
        sb.append(oVar.f30587e);
        sb.append(", ");
        Proxy proxy = this.g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f30515h;
        }
        return Y6.f.l(sb, str, '}');
    }
}
