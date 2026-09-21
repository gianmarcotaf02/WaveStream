package F8;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements F8.l {
    @Override // F8.l
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return O7.x.x0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // F8.l
    public final F8.n b(javax.net.ssl.SSLSocket sSLSocket) {
        java.lang.Class<?> cls = sSLSocket.getClass();
        java.lang.Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new java.lang.AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new F8.f(superclass);
    }
}
