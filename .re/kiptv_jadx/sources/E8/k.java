package E8;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends E8.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f3314c;

    static {
        java.lang.String property = java.lang.System.getProperty("java.specification.version");
        java.lang.Integer numZ0 = property != null ? O7.x.z0(property) : null;
        boolean z6 = false;
        if (numZ0 == null) {
            try {
                javax.net.ssl.SSLSocket.class.getMethod("getApplicationProtocol", null);
                z6 = true;
            } catch (java.lang.NoSuchMethodException unused) {
            }
        } else if (numZ0.intValue() >= 9) {
            z6 = true;
        }
        f3314c = z6;
    }

    @Override // E8.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
        javax.net.ssl.SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : protocols) {
            if (((w8.t) obj) != w8.t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((w8.t) it.next()).f30653h);
        }
        sSLParameters.setApplicationProtocols((java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // E8.n
    public final java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            java.lang.String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }
}
