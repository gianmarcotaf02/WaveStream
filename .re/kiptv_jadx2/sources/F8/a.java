package F8;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class a implements n {
    @Override
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override
    public final boolean b() {
        E8.n nVar = E8.n.f3326a;
        return B3.o.o() && Build.VERSION.SDK_INT >= 29;
    }

    @Override
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override
    public final void d(SSLSocket sSLSocket, String str, List protocols) throws IOException {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            E8.n nVar = E8.n.f3326a;
            sSLParameters.setApplicationProtocols((String[]) B3.o.f(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e6) {
            throw new IOException("Android internal error", e6);
        }
    }
}
