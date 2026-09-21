package F8;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

public final class j implements l {
    @Override
    public final boolean a(SSLSocket sSLSocket) {
        return E8.h.f3305d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
