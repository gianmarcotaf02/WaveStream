package F8;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements F8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F8.l f3736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F8.n f3737b;

    public m(F8.l lVar) {
        this.f3736a = lVar;
    }

    @Override // F8.n
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return this.f3736a.a(sSLSocket);
    }

    @Override // F8.n
    public final boolean b() {
        return true;
    }

    @Override // F8.n
    public final java.lang.String c(javax.net.ssl.SSLSocket sSLSocket) {
        F8.n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // F8.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        F8.n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized F8.n e(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            if (this.f3737b == null && this.f3736a.a(sSLSocket)) {
                this.f3737b = this.f3736a.b(sSLSocket);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f3737b;
    }
}
