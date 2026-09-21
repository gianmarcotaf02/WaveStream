package E8;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements J8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final javax.net.ssl.X509TrustManager f3287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f3288b;

    public b(javax.net.ssl.X509TrustManager x509TrustManager, java.lang.reflect.Method method) {
        this.f3287a = x509TrustManager;
        this.f3288b = method;
    }

    @Override // J8.d
    public final java.security.cert.X509Certificate a(java.security.cert.X509Certificate x509Certificate) {
        try {
            java.lang.Object objInvoke = this.f3288b.invoke(this.f3287a, x509Certificate);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((java.security.cert.TrustAnchor) objInvoke).getTrustedCert();
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.AssertionError("unable to get issues and signature", e6);
        } catch (java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E8.b)) {
            return false;
        }
        E8.b bVar = (E8.b) obj;
        return kotlin.jvm.internal.m.a(this.f3287a, bVar.f3287a) && kotlin.jvm.internal.m.a(this.f3288b, bVar.f3288b);
    }

    public final int hashCode() {
        return this.f3288b.hashCode() + (this.f3287a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f3287a + ", findByIssuerAndSignatureMethod=" + this.f3288b + ')';
    }
}
