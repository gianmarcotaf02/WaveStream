package y8;

import w8.A;
import w8.B;

public final class a {
    public static final B a(B b9) {
        if ((b9 != null ? b9.f30491n : null) == null) {
            return b9;
        }
        A aE = b9.e();
        aE.g = null;
        return aE.a();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
