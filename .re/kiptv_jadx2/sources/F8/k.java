package F8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

public final class k implements n {

    public static final j f3735a = new j();

    @Override
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override
    public final boolean b() {
        boolean z6 = E8.h.f3305d;
        return E8.h.f3305d;
    }

    @Override
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            E8.n nVar = E8.n.f3326a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) B3.o.f(protocols).toArray(new String[0]));
        }
    }
}
