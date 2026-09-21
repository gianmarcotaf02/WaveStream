package A8;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends D8.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8.E f427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.net.Socket f428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.net.Socket f429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w8.l f430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w8.t f431f;
    public D8.n g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public M8.E f432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public M8.D f433i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f440q;

    public o(A8.q connectionPool, w8.E route) {
        kotlin.jvm.internal.m.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.m.e(route, "route");
        this.f427b = route;
        this.f438o = 1;
        this.f439p = new java.util.ArrayList();
        this.f440q = Long.MAX_VALUE;
    }

    public static void d(w8.s client, w8.E failedRoute, java.io.IOException failure) {
        kotlin.jvm.internal.m.e(client, "client");
        kotlin.jvm.internal.m.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.m.e(failure, "failure");
        if (failedRoute.f30501b.type() != java.net.Proxy.Type.DIRECT) {
            w8.C3021a c3021a = failedRoute.f30500a;
            c3021a.f30515h.connectFailed(c3021a.f30516i.g(), failedRoute.f30501b.address(), failure);
        }
        A.a aVar = client.H;
        synchronized (aVar) {
            ((java.util.LinkedHashSet) aVar.f9i).add(failedRoute);
        }
    }

    @Override // D8.h
    public final synchronized void a(D8.n connection, D8.A settings) {
        kotlin.jvm.internal.m.e(connection, "connection");
        kotlin.jvm.internal.m.e(settings, "settings");
        this.f438o = (settings.f2500a & 16) != 0 ? settings.f2501b[4] : androidx.media3.common.util.Log.LOG_LEVEL_OFF;
    }

    @Override // D8.h
    public final void b(D8.v vVar) {
        vVar.c(null, 8);
    }

    public final void c(int i3, int i9, int i10, boolean z6, w8.InterfaceC3025e call) throws java.lang.Throwable {
        kotlin.jvm.internal.m.e(call, "call");
        if (this.f431f != null) {
            throw new java.lang.IllegalStateException("already connected");
        }
        java.util.List list = this.f427b.f30500a.f30517k;
        A8.b bVar = new A8.b(list);
        w8.C3021a c3021a = this.f427b.f30500a;
        if (c3021a.f30511c == null) {
            if (!list.contains(w8.j.f30555f)) {
                throw new A8.r(new java.net.UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            java.lang.String str = this.f427b.f30500a.f30516i.f30586d;
            E8.n nVar = E8.n.f3326a;
            if (!E8.n.f3326a.h(str)) {
                throw new A8.r(new java.net.UnknownServiceException(Y6.f.h("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c3021a.j.contains(w8.t.H2_PRIOR_KNOWLEDGE)) {
            throw new A8.r(new java.net.UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        A8.r rVar = null;
        while (true) {
            try {
                w8.E e6 = this.f427b;
                if (e6.f30500a.f30511c != null && e6.f30501b.type() == java.net.Proxy.Type.HTTP) {
                    f(i3, i9, i10, call);
                    if (this.f428c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                e(i3, i9, call);
                g(bVar, call);
                java.net.InetSocketAddress inetSocketAddress = this.f427b.f30502c;
                kotlin.jvm.internal.m.e(inetSocketAddress, "inetSocketAddress");
                break;
            } catch (java.io.IOException e9) {
                java.net.Socket socket = this.f429d;
                if (socket != null) {
                    x8.b.d(socket);
                }
                java.net.Socket socket2 = this.f428c;
                if (socket2 != null) {
                    x8.b.d(socket2);
                }
                this.f429d = null;
                this.f428c = null;
                this.f432h = null;
                this.f433i = null;
                this.f430e = null;
                this.f431f = null;
                this.g = null;
                this.f438o = 1;
                java.net.InetSocketAddress inetSocketAddress2 = this.f427b.f30502c;
                kotlin.jvm.internal.m.e(inetSocketAddress2, "inetSocketAddress");
                if (rVar == null) {
                    rVar = new A8.r(e9);
                } else {
                    com.google.common.util.concurrent.AbstractC1903s.j(rVar.f447h, e9);
                    rVar.f448i = e9;
                }
                if (!z6) {
                    throw rVar;
                }
                bVar.f374d = true;
                if (!bVar.f373c) {
                    throw rVar;
                }
                if (e9 instanceof java.net.ProtocolException) {
                    throw rVar;
                }
                if (e9 instanceof java.io.InterruptedIOException) {
                    throw rVar;
                }
                if ((e9 instanceof javax.net.ssl.SSLHandshakeException) && (e9.getCause() instanceof java.security.cert.CertificateException)) {
                    throw rVar;
                }
                if (e9 instanceof javax.net.ssl.SSLPeerUnverifiedException) {
                    throw rVar;
                }
                if (!(e9 instanceof javax.net.ssl.SSLException)) {
                    throw rVar;
                }
            }
        }
        w8.E e10 = this.f427b;
        if (e10.f30500a.f30511c != null && e10.f30501b.type() == java.net.Proxy.Type.HTTP && this.f428c == null) {
            throw new A8.r(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f440q = java.lang.System.nanoTime();
    }

    public final void e(int i3, int i9, w8.InterfaceC3025e call) throws java.io.IOException {
        java.net.Socket socketCreateSocket;
        w8.E e6 = this.f427b;
        java.net.Proxy proxy = e6.f30501b;
        w8.C3021a c3021a = e6.f30500a;
        java.net.Proxy.Type type = proxy.type();
        int i10 = type == null ? -1 : A8.k.f419a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = c3021a.f30510b.createSocket();
            kotlin.jvm.internal.m.b(socketCreateSocket);
        } else {
            socketCreateSocket = new java.net.Socket(proxy);
        }
        this.f428c = socketCreateSocket;
        java.net.InetSocketAddress inetSocketAddress = this.f427b.f30502c;
        kotlin.jvm.internal.m.e(call, "call");
        kotlin.jvm.internal.m.e(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i9);
        try {
            E8.n nVar = E8.n.f3326a;
            E8.n.f3326a.e(socketCreateSocket, this.f427b.f30502c, i3);
            try {
                this.f432h = M8.AbstractC0674b.c(M8.AbstractC0674b.j(socketCreateSocket));
                this.f433i = M8.AbstractC0674b.b(M8.AbstractC0674b.h(socketCreateSocket));
            } catch (java.lang.NullPointerException e9) {
                if (kotlin.jvm.internal.m.a(e9.getMessage(), "throw with null exception")) {
                    throw new java.io.IOException(e9);
                }
            }
        } catch (java.net.ConnectException e10) {
            java.net.ConnectException connectException = new java.net.ConnectException("Failed to connect to " + this.f427b.f30502c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void f(int i3, int i9, int i10, w8.InterfaceC3025e interfaceC3025e) throws java.io.IOException {
        w8.u uVar = new w8.u();
        w8.E e6 = this.f427b;
        w8.o url = e6.f30500a.f30516i;
        kotlin.jvm.internal.m.e(url, "url");
        uVar.f30654a = url;
        uVar.c("CONNECT", null);
        w8.C3021a c3021a = e6.f30500a;
        uVar.b("Host", x8.b.w(c3021a.f30516i, true));
        uVar.b("Proxy-Connection", "Keep-Alive");
        uVar.b("User-Agent", "okhttp/4.12.0");
        w8.v vVarA = uVar.a();
        Z2.C1202m c1202m = new Z2.C1202m(2);
        com.google.common.util.concurrent.U.i0("Proxy-Authenticate");
        com.google.common.util.concurrent.U.k0("OkHttp-Preemptive", "Proxy-Authenticate");
        c1202m.f("Proxy-Authenticate");
        c1202m.d("Proxy-Authenticate", "OkHttp-Preemptive");
        c1202m.e();
        c3021a.f30514f.getClass();
        e(i3, i9, interfaceC3025e);
        java.lang.String str = "CONNECT " + x8.b.w(vVarA.f30659a, true) + " HTTP/1.1";
        M8.E e9 = this.f432h;
        kotlin.jvm.internal.m.b(e9);
        M8.D d4 = this.f433i;
        kotlin.jvm.internal.m.b(d4);
        A8.t tVar = new A8.t(null, this, e9, d4);
        M8.M mC = e9.f7217h.c();
        long j = i9;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        mC.g(j, timeUnit);
        d4.f7215h.c().g(i10, timeUnit);
        tVar.k(vVarA.f30661c, str);
        tVar.a();
        w8.A aD = tVar.d(false);
        kotlin.jvm.internal.m.b(aD);
        aD.f30475a = vVarA;
        w8.B bA = aD.a();
        long jK = x8.b.k(bA);
        if (jK != -1) {
            C8.e eVarJ = tVar.j(jK);
            x8.b.u(eVarJ, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
            eVarJ.close();
        }
        int i11 = bA.f30488k;
        if (i11 != 200) {
            if (i11 != 407) {
                throw new java.io.IOException(com.google.android.gms.internal.play_billing.M0.l(i11, "Unexpected response code for CONNECT: "));
            }
            c3021a.f30514f.getClass();
            throw new java.io.IOException("Failed to authenticate with proxy");
        }
        if (!e9.f7218i.o() || !d4.f7216i.o()) {
            throw new java.io.IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(A8.b bVar, w8.InterfaceC3025e call) throws java.lang.Throwable {
        int i3 = 0;
        w8.C3021a c3021a = this.f427b.f30500a;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = c3021a.f30511c;
        w8.t tVarV = w8.t.HTTP_1_1;
        if (sSLSocketFactory == null) {
            java.util.List list = c3021a.j;
            w8.t tVar = w8.t.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(tVar)) {
                this.f429d = this.f428c;
                this.f431f = tVarV;
                return;
            } else {
                this.f429d = this.f428c;
                this.f431f = tVar;
                l();
                return;
            }
        }
        kotlin.jvm.internal.m.e(call, "call");
        w8.C3021a c3021a2 = this.f427b.f30500a;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = c3021a2.f30511c;
        javax.net.ssl.SSLSocket sSLSocket = null;
        java.lang.String strF = null;
        try {
            kotlin.jvm.internal.m.b(sSLSocketFactory2);
            java.net.Socket socket = this.f428c;
            w8.o oVar = c3021a2.f30516i;
            java.net.Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, oVar.f30586d, oVar.f30587e, true);
            kotlin.jvm.internal.m.c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            javax.net.ssl.SSLSocket sSLSocket2 = (javax.net.ssl.SSLSocket) socketCreateSocket;
            try {
                w8.j jVarA = bVar.a(sSLSocket2);
                if (jVarA.f30557b) {
                    E8.n nVar = E8.n.f3326a;
                    E8.n.f3326a.d(sSLSocket2, c3021a2.f30516i.f30586d, c3021a2.j);
                }
                sSLSocket2.startHandshake();
                javax.net.ssl.SSLSession sslSocketSession = sSLSocket2.getSession();
                kotlin.jvm.internal.m.d(sslSocketSession, "sslSocketSession");
                w8.l lVarX = com.google.common.util.concurrent.P.X(sslSocketSession);
                javax.net.ssl.HostnameVerifier hostnameVerifier = c3021a2.f30512d;
                kotlin.jvm.internal.m.b(hostnameVerifier);
                if (hostnameVerifier.verify(c3021a2.f30516i.f30586d, sslSocketSession)) {
                    w8.C3027g c3027g = c3021a2.f30513e;
                    kotlin.jvm.internal.m.b(c3027g);
                    this.f430e = new w8.l(lVarX.f30571a, lVarX.f30572b, lVarX.f30573c, new A8.l(c3027g, lVarX, c3021a2, i3));
                    c3027g.a(c3021a2.f30516i.f30586d, new A8.m(i3, this));
                    if (jVarA.f30557b) {
                        E8.n nVar2 = E8.n.f3326a;
                        strF = E8.n.f3326a.f(sSLSocket2);
                    }
                    this.f429d = sSLSocket2;
                    this.f432h = M8.AbstractC0674b.c(M8.AbstractC0674b.j(sSLSocket2));
                    this.f433i = M8.AbstractC0674b.b(M8.AbstractC0674b.h(sSLSocket2));
                    if (strF != null) {
                        tVarV = com.google.crypto.tink.shaded.protobuf.AbstractC1911f.v(strF);
                    }
                    this.f431f = tVarV;
                    E8.n nVar3 = E8.n.f3326a;
                    E8.n.f3326a.a(sSLSocket2);
                    if (this.f431f == w8.t.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                java.util.List listA = lVarX.a();
                if (listA.isEmpty()) {
                    throw new javax.net.ssl.SSLPeerUnverifiedException("Hostname " + c3021a2.f30516i.f30586d + " not verified (no certificates)");
                }
                java.lang.Object obj = listA.get(0);
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) obj;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("\n              |Hostname ");
                sb.append(c3021a2.f30516i.f30586d);
                sb.append(" not verified:\n              |    certificate: ");
                w8.C3027g c3027g2 = w8.C3027g.f30533c;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("sha256/");
                M8.C0685m c0685m = M8.C0685m.f7261k;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                kotlin.jvm.internal.m.d(encoded, "publicKey.encoded");
                sb2.append(B3.o.q(encoded, -1234567890).c("SHA-256").a());
                sb.append(sb2.toString());
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(p078i6.o.A1(J8.c.a(x509Certificate, 7), J8.c.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new javax.net.ssl.SSLPeerUnverifiedException(O7.r.U(sb.toString()));
            } catch (java.lang.Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    E8.n nVar4 = E8.n.f3326a;
                    E8.n.f3326a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    x8.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public final boolean h(w8.C3021a c3021a, java.util.ArrayList arrayList) {
        w8.l lVar;
        byte[] bArr = x8.b.f31716a;
        if (this.f439p.size() < this.f438o && !this.j) {
            w8.E e6 = this.f427b;
            if (e6.f30500a.a(c3021a)) {
                w8.o oVar = c3021a.f30516i;
                java.lang.String str = oVar.f30586d;
                w8.C3021a c3021a2 = e6.f30500a;
                if (kotlin.jvm.internal.m.a(str, c3021a2.f30516i.f30586d)) {
                    return true;
                }
                if (this.g != null && arrayList != null && !arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        w8.E e9 = (w8.E) it.next();
                        java.net.Proxy.Type type = e9.f30501b.type();
                        java.net.Proxy.Type type2 = java.net.Proxy.Type.DIRECT;
                        if (type == type2 && e6.f30501b.type() == type2) {
                            if (kotlin.jvm.internal.m.a(e6.f30502c, e9.f30502c)) {
                                if (c3021a.f30512d != J8.c.f6635a) {
                                    break;
                                }
                                byte[] bArr2 = x8.b.f31716a;
                                w8.o oVar2 = c3021a2.f30516i;
                                if (oVar.f30587e != oVar2.f30587e) {
                                    break;
                                }
                                java.lang.String str2 = oVar2.f30586d;
                                java.lang.String hostname = oVar.f30586d;
                                if (!kotlin.jvm.internal.m.a(hostname, str2)) {
                                    if (!this.f434k && (lVar = this.f430e) != null) {
                                        java.util.List listA = lVar.a();
                                        if (!listA.isEmpty()) {
                                            java.lang.Object obj = listA.get(0);
                                            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            if (!J8.c.c(hostname, (java.security.cert.X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    w8.C3027g c3027g = c3021a.f30513e;
                                    kotlin.jvm.internal.m.b(c3027g);
                                    w8.l lVar2 = this.f430e;
                                    kotlin.jvm.internal.m.b(lVar2);
                                    java.util.List peerCertificates = lVar2.a();
                                    kotlin.jvm.internal.m.e(hostname, "hostname");
                                    kotlin.jvm.internal.m.e(peerCertificates, "peerCertificates");
                                    c3027g.a(hostname, new A8.l(c3027g, peerCertificates, hostname, 3));
                                    return true;
                                } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z6) {
        long j;
        byte[] bArr = x8.b.f31716a;
        long jNanoTime = java.lang.System.nanoTime();
        java.net.Socket socket = this.f428c;
        kotlin.jvm.internal.m.b(socket);
        java.net.Socket socket2 = this.f429d;
        kotlin.jvm.internal.m.b(socket2);
        M8.E e6 = this.f432h;
        kotlin.jvm.internal.m.b(e6);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        D8.n nVar = this.g;
        if (nVar != null) {
            synchronized (nVar) {
                if (nVar.f2554m) {
                    return false;
                }
                return nVar.f2562u >= nVar.f2561t || jNanoTime < nVar.f2563v;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f440q;
        }
        if (j < 10000000000L || !z6) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !e6.o();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (java.net.SocketTimeoutException unused) {
            return true;
        } catch (java.io.IOException unused2) {
            return false;
        }
    }

    public final B8.d j(w8.s client, B8.f fVar) throws java.net.SocketException {
        kotlin.jvm.internal.m.e(client, "client");
        java.net.Socket socket = this.f429d;
        kotlin.jvm.internal.m.b(socket);
        M8.E e6 = this.f432h;
        kotlin.jvm.internal.m.b(e6);
        M8.D d4 = this.f433i;
        kotlin.jvm.internal.m.b(d4);
        D8.n nVar = this.g;
        if (nVar != null) {
            return new D8.o(client, this, fVar, nVar);
        }
        int i3 = fVar.f853d;
        socket.setSoTimeout(i3);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        e6.f7217h.c().g(i3, timeUnit);
        d4.f7215h.c().g(fVar.f854e, timeUnit);
        return new A8.t(client, this, e6, d4);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() throws java.net.SocketException {
        int i3;
        java.net.Socket socket = this.f429d;
        kotlin.jvm.internal.m.b(socket);
        M8.E e6 = this.f432h;
        kotlin.jvm.internal.m.b(e6);
        M8.D d4 = this.f433i;
        kotlin.jvm.internal.m.b(d4);
        socket.setSoTimeout(0);
        z8.c taskRunner = z8.c.f32967i;
        kotlin.jvm.internal.m.e(taskRunner, "taskRunner");
        Z2.C0 c9 = new Z2.C0();
        c9.f12655a = taskRunner;
        c9.f12660f = D8.h.f2530a;
        java.lang.String peerName = this.f427b.f30500a.f30516i.f30586d;
        kotlin.jvm.internal.m.e(peerName, "peerName");
        c9.f12656b = socket;
        java.lang.String str = x8.b.g + ' ' + peerName;
        kotlin.jvm.internal.m.e(str, "<set-?>");
        c9.f12657c = str;
        c9.f12658d = e6;
        c9.f12659e = d4;
        c9.f12660f = this;
        D8.n nVar = new D8.n(c9);
        this.g = nVar;
        D8.A a2 = D8.n.f2543G;
        this.f438o = (a2.f2500a & 16) != 0 ? a2.f2501b[4] : androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        D8.w wVar = nVar.f2547D;
        synchronized (wVar) {
            try {
                if (wVar.f2606k) {
                    throw new java.io.IOException("closed");
                }
                java.util.logging.Logger logger = D8.w.f2603m;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    logger.fine(x8.b.i(">> CONNECTION " + D8.f.f2526a.e(), new java.lang.Object[0]));
                }
                wVar.f2604h.e(D8.f.f2526a);
                wVar.f2604h.flush();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        D8.w wVar2 = nVar.f2547D;
        D8.A settings = nVar.f2564w;
        synchronized (wVar2) {
            try {
                kotlin.jvm.internal.m.e(settings, "settings");
                if (wVar2.f2606k) {
                    throw new java.io.IOException("closed");
                }
                wVar2.i(0, java.lang.Integer.bitCount(settings.f2500a) * 6, 4, 0);
                int i9 = 0;
                while (i9 < 10) {
                    boolean z6 = true;
                    if (((1 << i9) & settings.f2500a) == 0) {
                        z6 = false;
                    }
                    if (z6) {
                        if (i9 != 4) {
                            i3 = i9 != 7 ? i9 : 4;
                        } else {
                            i3 = 3;
                        }
                        M8.D d6 = wVar2.f2604h;
                        if (d6.j) {
                            throw new java.lang.IllegalStateException("closed");
                        }
                        d6.f7216i.b0(i3);
                        d6.b();
                        wVar2.f2604h.j(settings.f2501b[i9]);
                    }
                    i9++;
                }
                wVar2.f2604h.flush();
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        int iA = nVar.f2564w.a();
        if (iA != 65535) {
            nVar.f2547D.z(0, iA - io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE);
        }
        taskRunner.e().c(new A8.p(nVar.j, 2, nVar.f2548E), 0L);
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Connection{");
        w8.E e6 = this.f427b;
        sb.append(e6.f30500a.f30516i.f30586d);
        sb.append(':');
        sb.append(e6.f30500a.f30516i.f30587e);
        sb.append(", proxy=");
        sb.append(e6.f30501b);
        sb.append(" hostAddress=");
        sb.append(e6.f30502c);
        sb.append(" cipherSuite=");
        w8.l lVar = this.f430e;
        if (lVar == null || (obj = lVar.f30572b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f431f);
        sb.append('}');
        return sb.toString();
    }
}
