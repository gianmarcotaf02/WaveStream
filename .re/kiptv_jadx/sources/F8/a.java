package F8;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements F8.n {
    @Override // F8.n
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return android.net.ssl.SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // F8.n
    public final boolean b() {
        E8.n nVar = E8.n.f3326a;
        return B3.o.o() && android.os.Build.VERSION.SDK_INT >= 29;
    }

    @Override // F8.n
    public final java.lang.String c(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // F8.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) throws java.io.IOException {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        try {
            android.net.ssl.SSLSockets.setUseSessionTickets(sSLSocket, true);
            javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            E8.n nVar = E8.n.f3326a;
            sSLParameters.setApplicationProtocols((java.lang.String[]) B3.o.f(protocols).toArray(new java.lang.String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (java.lang.IllegalArgumentException e6) {
            throw new java.io.IOException("Android internal error", e6);
        }
    }
}
