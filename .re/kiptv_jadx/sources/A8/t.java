package A8;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements B8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f451a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f456f;
    public java.lang.Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f457h;

    public t(p054f7.a kind, k7.f fVar, java.lang.String[] strArr, java.lang.String[] strArr2, java.lang.String[] strArr3, java.lang.String str, int i3) {
        kotlin.jvm.internal.m.e(kind, "kind");
        this.f453c = kind;
        this.f454d = fVar;
        this.f455e = strArr;
        this.f456f = strArr2;
        this.g = strArr3;
        this.f457h = str;
        this.f452b = i3;
    }

    @Override // B8.d
    public void a() {
        ((M8.D) this.f456f).flush();
    }

    @Override // B8.d
    public M8.K b(w8.B b9) {
        if (!B8.e.a(b9)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(w8.B.b("Transfer-Encoding", b9))) {
            w8.o oVar = b9.f30486h.f30659a;
            if (this.f452b == 4) {
                this.f452b = 5;
                return new C8.d(this, oVar);
            }
            throw new java.lang.IllegalStateException(("state: " + this.f452b).toString());
        }
        long jK = x8.b.k(b9);
        if (jK != -1) {
            return j(jK);
        }
        if (this.f452b == 4) {
            this.f452b = 5;
            ((A8.o) this.f454d).k();
            return new C8.g(this);
        }
        throw new java.lang.IllegalStateException(("state: " + this.f452b).toString());
    }

    @Override // B8.d
    public M8.I c(w8.v request, long j) throws java.net.ProtocolException {
        kotlin.jvm.internal.m.e(request, "request");
        w8.z zVar = request.f30662d;
        if (zVar != null && zVar.isDuplex()) {
            throw new java.net.ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.f30661c.d("Transfer-Encoding"))) {
            if (this.f452b == 1) {
                this.f452b = 2;
                return new C8.c(this);
            }
            throw new java.lang.IllegalStateException(("state: " + this.f452b).toString());
        }
        if (j == -1) {
            throw new java.lang.IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f452b == 1) {
            this.f452b = 2;
            return new C8.f(this);
        }
        throw new java.lang.IllegalStateException(("state: " + this.f452b).toString());
    }

    @Override // B8.d
    public void cancel() {
        java.net.Socket socket = ((A8.o) this.f454d).f428c;
        if (socket != null) {
            x8.b.d(socket);
        }
    }

    @Override // B8.d
    public w8.A d(boolean z6) throws java.io.IOException {
        C8.a aVar = (C8.a) this.g;
        int i3 = this.f452b;
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            throw new java.lang.IllegalStateException(("state: " + this.f452b).toString());
        }
        try {
            java.lang.String strU = ((M8.E) aVar.j).u(aVar.f1618i);
            aVar.f1618i -= (long) strU.length();
            B8.h hVarL = O7.r.L(strU);
            int i9 = hVarL.f861i;
            w8.A a2 = new w8.A();
            a2.f30476b = (w8.t) hVarL.j;
            a2.f30477c = i9;
            a2.f30478d = (java.lang.String) hVarL.f862k;
            a2.f30480f = aVar.h().n();
            if (z6 && i9 == 100) {
                return null;
            }
            if (i9 == 100) {
                this.f452b = 3;
                return a2;
            }
            if (102 > i9 || i9 >= 200) {
                this.f452b = 4;
                return a2;
            }
            this.f452b = 3;
            return a2;
        } catch (java.io.EOFException e6) {
            throw new java.io.IOException("unexpected end of stream on ".concat(((A8.o) this.f454d).f427b.f30500a.f30516i.f()), e6);
        }
    }

    @Override // B8.d
    public A8.o e() {
        return (A8.o) this.f454d;
    }

    @Override // B8.d
    public void f() {
        ((M8.D) this.f456f).flush();
    }

    @Override // B8.d
    public long g(w8.B b9) {
        if (!B8.e.a(b9)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(w8.B.b("Transfer-Encoding", b9))) {
            return -1L;
        }
        return x8.b.k(b9);
    }

    @Override // B8.d
    public void h(w8.v request) {
        kotlin.jvm.internal.m.e(request, "request");
        java.net.Proxy.Type type = ((A8.o) this.f454d).f427b.f30501b.type();
        kotlin.jvm.internal.m.d(type, "connection.route().proxy.type()");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(request.f30660b);
        sb.append(' ');
        w8.o oVar = request.f30659a;
        if (oVar.f30590i || type != java.net.Proxy.Type.HTTP) {
            java.lang.String strB = oVar.b();
            java.lang.String strD = oVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(oVar);
        }
        sb.append(" HTTP/1.1");
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
        k(request.f30661c, string);
    }

    public boolean i() {
        return this.f452b < ((java.util.List) this.f456f).size() || !((java.util.ArrayList) this.f457h).isEmpty();
    }

    public C8.e j(long j) {
        if (this.f452b == 4) {
            this.f452b = 5;
            return new C8.e(this, j);
        }
        throw new java.lang.IllegalStateException(("state: " + this.f452b).toString());
    }

    public void k(w8.m mVar, java.lang.String requestLine) {
        kotlin.jvm.internal.m.e(requestLine, "requestLine");
        if (this.f452b != 0) {
            throw new java.lang.IllegalStateException(("state: " + this.f452b).toString());
        }
        M8.D d4 = (M8.D) this.f456f;
        d4.w(requestLine);
        d4.w(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        int size = mVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            d4.w(mVar.e(i3));
            d4.w(": ");
            d4.w(mVar.o(i3));
            d4.w(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        }
        d4.w(io.ktor.sse.ServerSentEventKt.END_OF_LINE);
        this.f452b = 1;
    }

    public java.lang.String toString() {
        switch (this.f451a) {
            case 2:
                return ((p054f7.a) this.f453c) + " version=" + ((k7.f) this.f454d);
            default:
                return super.toString();
        }
    }

    public t(w8.C3021a c3021a, A.a routeDatabase, w8.InterfaceC3025e call) {
        java.util.List listL;
        kotlin.jvm.internal.m.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.m.e(call, "call");
        this.f453c = c3021a;
        this.f454d = routeDatabase;
        this.f455e = call;
        p078i6.w wVar = p078i6.w.f23205h;
        this.f456f = wVar;
        this.g = wVar;
        this.f457h = new java.util.ArrayList();
        w8.o url = c3021a.f30516i;
        kotlin.jvm.internal.m.e(url, "url");
        java.net.Proxy proxy = c3021a.g;
        if (proxy != null) {
            listL = com.google.common.util.concurrent.P.i0(proxy);
        } else {
            java.net.URI uriG = url.g();
            if (uriG.getHost() == null) {
                listL = x8.b.l(java.net.Proxy.NO_PROXY);
            } else {
                java.util.List<java.net.Proxy> listSelect = c3021a.f30515h.select(uriG);
                if (listSelect != null && !listSelect.isEmpty()) {
                    listL = x8.b.x(listSelect);
                } else {
                    listL = x8.b.l(java.net.Proxy.NO_PROXY);
                }
            }
        }
        this.f456f = listL;
        this.f452b = 0;
    }

    public t(w8.s sVar, A8.o connection, M8.E source, M8.D sink) {
        kotlin.jvm.internal.m.e(connection, "connection");
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(sink, "sink");
        this.f453c = sVar;
        this.f454d = connection;
        this.f455e = source;
        this.f456f = sink;
        this.g = new C8.a(source);
    }
}
