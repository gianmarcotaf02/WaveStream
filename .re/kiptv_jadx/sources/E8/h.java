package E8;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends E8.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f3305d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.security.Provider f3306c;

    static {
        boolean z6 = false;
        try {
            java.lang.Class.forName("org.conscrypt.Conscrypt$Version", false, E8.f.class.getClassLoader());
            if (org.conscrypt.Conscrypt.isAvailable() && E8.f.a()) {
                z6 = true;
            }
        } catch (java.lang.ClassNotFoundException | java.lang.NoClassDefFoundError unused) {
        }
        f3305d = z6;
    }

    public h() {
        java.security.Provider providerNewProvider = org.conscrypt.Conscrypt.newProvider();
        kotlin.jvm.internal.m.d(providerNewProvider, "newProvider()");
        this.f3306c = providerNewProvider;
    }

    @Override // E8.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            org.conscrypt.Conscrypt.setUseSessionTickets(sSLSocket, true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : protocols) {
                if (((w8.t) obj) != w8.t.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((w8.t) it.next()).f30653h);
            }
            org.conscrypt.Conscrypt.setApplicationProtocols(sSLSocket, (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
        }
    }

    @Override // E8.n
    public final java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            return org.conscrypt.Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // E8.n
    public final javax.net.ssl.SSLContext k() throws java.security.NoSuchAlgorithmException {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS", this.f3306c);
        kotlin.jvm.internal.m.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // E8.n
    public final javax.net.ssl.SSLSocketFactory l(javax.net.ssl.X509TrustManager x509TrustManager) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException {
        javax.net.ssl.SSLContext sSLContextK = k();
        sSLContextK.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, null);
        javax.net.ssl.SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
        kotlin.jvm.internal.m.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // E8.n
    public final javax.net.ssl.X509TrustManager m() throws java.security.NoSuchAlgorithmException, java.security.KeyStoreException {
        javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((java.security.KeyStore) null);
        javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.m.b(trustManagers);
        if (trustManagers.length == 1) {
            javax.net.ssl.TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                kotlin.jvm.internal.m.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                javax.net.ssl.X509TrustManager x509TrustManager = (javax.net.ssl.X509TrustManager) trustManager;
                org.conscrypt.Conscrypt.setHostnameVerifier(x509TrustManager, E8.g.f3304a);
                return x509TrustManager;
            }
        }
        java.lang.String string = java.util.Arrays.toString(trustManagers);
        kotlin.jvm.internal.m.d(string, "toString(this)");
        throw new java.lang.IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }
}
