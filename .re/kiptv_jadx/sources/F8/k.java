package F8;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements F8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F8.j f3735a = new F8.j();

    @Override // F8.n
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return org.conscrypt.Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // F8.n
    public final boolean b() {
        boolean z6 = E8.h.f3305d;
        return E8.h.f3305d;
    }

    @Override // F8.n
    public final java.lang.String c(javax.net.ssl.SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return org.conscrypt.Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // F8.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        if (a(sSLSocket)) {
            org.conscrypt.Conscrypt.setUseSessionTickets(sSLSocket, true);
            E8.n nVar = E8.n.f3326a;
            org.conscrypt.Conscrypt.setApplicationProtocols(sSLSocket, (java.lang.String[]) B3.o.f(protocols).toArray(new java.lang.String[0]));
        }
    }
}
