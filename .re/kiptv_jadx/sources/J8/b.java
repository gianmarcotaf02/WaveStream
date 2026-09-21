package J8;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements J8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f6634a;

    public b(java.security.cert.X509Certificate... caCerts) {
        kotlin.jvm.internal.m.e(caCerts, "caCerts");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.security.cert.X509Certificate x509Certificate : caCerts) {
            javax.security.auth.x500.X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            kotlin.jvm.internal.m.d(subjectX500Principal, "caCert.subjectX500Principal");
            java.lang.Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new java.util.LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((java.util.Set) linkedHashSet).add(x509Certificate);
        }
        this.f6634a = linkedHashMap;
    }

    @Override // J8.d
    public final java.security.cert.X509Certificate a(java.security.cert.X509Certificate x509Certificate) {
        java.util.Set set = (java.util.Set) this.f6634a.get(x509Certificate.getIssuerX500Principal());
        java.lang.Object obj = null;
        if (set == null) {
            return null;
        }
        for (java.lang.Object obj2 : set) {
            try {
                x509Certificate.verify(((java.security.cert.X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (java.lang.Exception unused) {
            }
        }
        return (java.security.cert.X509Certificate) obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof J8.b) && kotlin.jvm.internal.m.a(((J8.b) obj).f6634a, this.f6634a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f6634a.hashCode();
    }
}
