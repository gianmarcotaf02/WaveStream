package F8;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements F8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F8.g f3731a = new F8.g();

    @Override // F8.n
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return false;
    }

    @Override // F8.n
    public final boolean b() {
        boolean z6 = E8.e.f3302d;
        return E8.e.f3302d;
    }

    @Override // F8.n
    public final java.lang.String c(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.String applicationProtocol = ((org.bouncycastle.jsse.BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // F8.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        if (a(sSLSocket)) {
            org.bouncycastle.jsse.BCSSLSocket bCSSLSocket = (org.bouncycastle.jsse.BCSSLSocket) sSLSocket;
            org.bouncycastle.jsse.BCSSLParameters parameters = bCSSLSocket.getParameters();
            E8.n nVar = E8.n.f3326a;
            parameters.setApplicationProtocols((java.lang.String[]) B3.o.f(protocols).toArray(new java.lang.String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
