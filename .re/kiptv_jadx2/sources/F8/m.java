package F8;

import java.util.List;
import javax.net.ssl.SSLSocket;

public final class m implements n {

    public final l f3736a;

    public n f3737b;

    public m(l lVar) {
        this.f3736a = lVar;
    }

    @Override
    public final boolean a(SSLSocket sSLSocket) {
        return this.f3736a.a(sSLSocket);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final String c(SSLSocket sSLSocket) {
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            return nVarE.c(sSLSocket);
        }
        return null;
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        n nVarE = e(sSLSocket);
        if (nVarE != null) {
            nVarE.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f3737b == null && this.f3736a.a(sSLSocket)) {
                this.f3737b = this.f3736a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f3737b;
    }
}
