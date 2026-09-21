package B4;

/* JADX INFO: loaded from: classes.dex */
public final class o implements B4.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B3.o f722i;

    public /* synthetic */ o(B3.o oVar, int i3) {
        this.f721h = i3;
        this.f722i = oVar;
    }

    @Override // B4.p
    public final java.lang.Object b(java.lang.String str) throws java.security.GeneralSecurityException {
        switch (this.f721h) {
            case 0:
                java.lang.String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i3 = 0; i3 < 2; i3++) {
                    java.security.Provider provider = java.security.Security.getProvider(strArr[i3]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                java.lang.Exception exc = null;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    B3.o oVar = this.f722i;
                    if (!zHasNext) {
                        return oVar.m(str, null);
                    }
                    try {
                        return oVar.m(str, (java.security.Provider) it.next());
                    } catch (java.lang.Exception e6) {
                        if (exc == null) {
                            exc = e6;
                        }
                    }
                }
                break;
            default:
                java.lang.String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (int i9 = 0; i9 < 3; i9++) {
                    java.security.Provider provider2 = java.security.Security.getProvider(strArr2[i9]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                java.util.Iterator it2 = arrayList2.iterator();
                java.lang.Exception exc2 = null;
                while (it2.hasNext()) {
                    try {
                        return this.f722i.m(str, (java.security.Provider) it2.next());
                    } catch (java.lang.Exception e9) {
                        if (exc2 == null) {
                            exc2 = e9;
                        }
                    }
                }
                throw new java.security.GeneralSecurityException("No good Provider found.", exc2);
        }
    }
}
