package F8;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements F8.l {
    @Override // F8.l
    public final boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        return E8.h.f3305d && org.conscrypt.Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // F8.l
    public final F8.n b(javax.net.ssl.SSLSocket sSLSocket) {
        return new F8.k();
    }
}
