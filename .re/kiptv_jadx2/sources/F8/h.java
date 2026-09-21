package F8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

public final class h implements n {

    public static final g f3731a = new g();

    @Override
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override
    public final boolean b() {
        boolean z6 = E8.e.f3302d;
        return E8.e.f3302d;
    }

    @Override
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            E8.n nVar = E8.n.f3326a;
            parameters.setApplicationProtocols((String[]) B3.o.f(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
