package E8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public final class b implements J8.d {

    public final X509TrustManager f3287a;

    public final Method f3288b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f3287a = x509TrustManager;
        this.f3288b = method;
    }

    @Override
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object objInvoke = this.f3288b.invoke(this.f3287a, x509Certificate);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e6) {
            throw new AssertionError("unable to get issues and signature", e6);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f3287a, bVar.f3287a) && kotlin.jvm.internal.m.a(this.f3288b, bVar.f3288b);
    }

    public final int hashCode() {
        return this.f3288b.hashCode() + (this.f3287a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f3287a + ", findByIssuerAndSignatureMethod=" + this.f3288b + ')';
    }
}
