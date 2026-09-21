package E8;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends E8.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f3310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f3311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f3312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Class f3313f;
    public final java.lang.Class g;

    public j(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.Class cls, java.lang.Class cls2) {
        this.f3310c = method;
        this.f3311d = method2;
        this.f3312e = method3;
        this.f3313f = cls;
        this.g = cls2;
    }

    @Override // E8.n
    public final void a(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            this.f3312e.invoke(null, sSLSocket);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.AssertionError("failed to remove ALPN", e6);
        } catch (java.lang.reflect.InvocationTargetException e9) {
            throw new java.lang.AssertionError("failed to remove ALPN", e9);
        }
    }

    @Override // E8.n
    public final void d(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List protocols) {
        kotlin.jvm.internal.m.e(protocols, "protocols");
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
        try {
            this.f3310c.invoke(null, sSLSocket, java.lang.reflect.Proxy.newProxyInstance(E8.n.class.getClassLoader(), new java.lang.Class[]{this.f3313f, this.g}, new E8.i(arrayList2)));
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.AssertionError("failed to set ALPN", e6);
        } catch (java.lang.reflect.InvocationTargetException e9) {
            throw new java.lang.AssertionError("failed to set ALPN", e9);
        }
    }

    @Override // E8.n
    public final java.lang.String f(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            java.lang.reflect.InvocationHandler invocationHandler = java.lang.reflect.Proxy.getInvocationHandler(this.f3311d.invoke(null, sSLSocket));
            kotlin.jvm.internal.m.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            E8.i iVar = (E8.i) invocationHandler;
            boolean z6 = iVar.f3308b;
            if (!z6 && iVar.f3309c == null) {
                E8.n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null, 4);
                return null;
            }
            if (z6) {
                return null;
            }
            return iVar.f3309c;
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.AssertionError("failed to get ALPN selected protocol", e6);
        } catch (java.lang.reflect.InvocationTargetException e9) {
            throw new java.lang.AssertionError("failed to get ALPN selected protocol", e9);
        }
    }
}
