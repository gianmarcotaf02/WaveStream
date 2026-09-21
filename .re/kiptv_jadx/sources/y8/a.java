package y8;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final w8.B a(w8.B b9) {
        if ((b9 != null ? b9.f30491n : null) == null) {
            return b9;
        }
        w8.A aE = b9.e();
        aE.g = null;
        return aE.a();
    }

    public static boolean b(java.lang.String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
