package E8;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends E8.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f3302d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.security.Provider f3303c = new org.bouncycastle.jsse.provider.BouncyCastleJsseProvider();

    static {
        boolean z6 = false;
        try {
            java.lang.Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, E8.d.class.getClassLoader());
            z6 = true;
        } catch (java.lang.ClassNotFoundException unused) {
        }
        f3302d = z6;
    }

    @Override // E8.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
    }

    @Override // E8.n
    public final java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        return null;
    }

    @Override // E8.n
    public final javax.net.ssl.SSLContext k() throws java.security.NoSuchAlgorithmException {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS", this.f3303c);
        kotlin.jvm.internal.m.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // E8.n
    public final javax.net.ssl.X509TrustManager m() throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.security.NoSuchProviderException {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((java.security.KeyStore) null);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.m.b(trustManagers);
        if (trustManagers.length == 1) {
            javax.net.ssl.TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                kotlin.jvm.internal.m.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (javax.net.ssl.X509TrustManager) trustManager;
            }
        }
        java.lang.String string = java.util.Arrays.toString(trustManagers);
        kotlin.jvm.internal.m.d(string, "toString(this)");
        throw new java.lang.IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
