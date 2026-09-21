package A8;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f374d;

    public b(java.util.List connectionSpecs) {
        kotlin.jvm.internal.m.e(connectionSpecs, "connectionSpecs");
        this.f371a = connectionSpecs;
    }

    public final w8.j a(javax.net.ssl.SSLSocket sSLSocket) throws java.net.UnknownServiceException {
        w8.j jVar;
        int i3;
        boolean z6;
        java.lang.String[] cipherSuitesIntersection;
        java.lang.String[] tlsVersionsIntersection;
        int i9 = this.f372b;
        java.util.List list = this.f371a;
        int size = list.size();
        while (true) {
            if (i9 >= size) {
                jVar = null;
                break;
            }
            jVar = (w8.j) list.get(i9);
            if (jVar.b(sSLSocket)) {
                this.f372b = i9 + 1;
                break;
            }
            i9++;
        }
        if (jVar == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f374d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            java.lang.String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.m.b(enabledProtocols);
            java.lang.String string = java.util.Arrays.toString(enabledProtocols);
            kotlin.jvm.internal.m.d(string, "toString(this)");
            sb.append(string);
            throw new java.net.UnknownServiceException(sb.toString());
        }
        int i10 = this.f372b;
        int size2 = list.size();
        while (true) {
            i3 = 0;
            if (i10 >= size2) {
                z6 = false;
                break;
            }
            if (((w8.j) list.get(i10)).b(sSLSocket)) {
                z6 = true;
                break;
            }
            i10++;
        }
        this.f373c = z6;
        boolean z9 = this.f374d;
        java.lang.String[] strArr = jVar.f30558c;
        if (strArr != null) {
            java.lang.String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.m.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = x8.b.p(enabledCipherSuites, strArr, w8.C3029i.f30537c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        java.lang.String[] strArr2 = jVar.f30559d;
        if (strArr2 != null) {
            java.lang.String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.m.d(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = x8.b.p(enabledProtocols2, strArr2, p093k6.a.f24495i);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        java.lang.String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.m.d(supportedCipherSuites, "supportedCipherSuites");
        w8.C3028h c3028h = w8.C3029i.f30537c;
        byte[] bArr = x8.b.f31716a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (c3028h.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
        }
        if (z9 && i3 != -1) {
            kotlin.jvm.internal.m.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            java.lang.String str = supportedCipherSuites[i3];
            kotlin.jvm.internal.m.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (java.lang.String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        p103m.P0 p2 = new p103m.P0();
        p2.f24958a = jVar.f30556a;
        p2.f24960c = strArr;
        p2.f24961d = strArr2;
        p2.f24959b = jVar.f30557b;
        kotlin.jvm.internal.m.d(cipherSuitesIntersection, "cipherSuitesIntersection");
        p2.b((java.lang.String[]) java.util.Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.m.d(tlsVersionsIntersection, "tlsVersionsIntersection");
        p2.d((java.lang.String[]) java.util.Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        w8.j jVarA = p2.a();
        if (jVarA.c() != null) {
            sSLSocket.setEnabledProtocols(jVarA.f30559d);
        }
        if (jVarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(jVarA.f30558c);
        }
        return jVar;
    }
}
