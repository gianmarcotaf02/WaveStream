package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24958a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f24960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f24961d;

    public w8.j a() {
        return new w8.j(this.f24958a, this.f24959b, (java.lang.String[]) this.f24960c, (java.lang.String[]) this.f24961d);
    }

    public void b(java.lang.String... cipherSuites) {
        kotlin.jvm.internal.m.e(cipherSuites, "cipherSuites");
        if (!this.f24958a) {
            throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new java.lang.IllegalArgumentException("At least one cipher suite is required");
        }
        this.f24960c = (java.lang.String[]) cipherSuites.clone();
    }

    public void c(w8.C3029i... cipherSuites) {
        kotlin.jvm.internal.m.e(cipherSuites, "cipherSuites");
        if (!this.f24958a) {
            throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(cipherSuites.length);
        for (w8.C3029i c3029i : cipherSuites) {
            arrayList.add(c3029i.f30553a);
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        b((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public void d(java.lang.String... tlsVersions) {
        kotlin.jvm.internal.m.e(tlsVersions, "tlsVersions");
        if (!this.f24958a) {
            throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new java.lang.IllegalArgumentException("At least one TLS version is required");
        }
        this.f24961d = (java.lang.String[]) tlsVersions.clone();
    }

    public void e(w8.F... fArr) {
        if (!this.f24958a) {
            throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(fArr.length);
        for (w8.F f9 : fArr) {
            arrayList.add(f9.f30508h);
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        d((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }
}
