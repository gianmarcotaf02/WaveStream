package B4;

/* JADX INFO: loaded from: classes.dex */
public final class s extends java.lang.ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B4.t f727a;

    public s(B4.t tVar) {
        this.f727a = tVar;
    }

    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
        B4.t tVar = this.f727a;
        try {
            B4.q qVar = B4.q.f724c;
            javax.crypto.Mac mac = (javax.crypto.Mac) qVar.f726a.b((java.lang.String) tVar.f731i);
            mac.init((javax.crypto.spec.SecretKeySpec) tVar.f732k);
            return mac;
        } catch (java.security.GeneralSecurityException e6) {
            throw new java.lang.IllegalStateException(e6);
        }
    }
}
