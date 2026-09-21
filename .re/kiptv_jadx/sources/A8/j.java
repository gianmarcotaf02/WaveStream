package A8;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements w8.InterfaceC3025e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w8.s f403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w8.v f404i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A8.q f405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A8.i f406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.Object f408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A8.f f409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public A8.o f410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public A8.e f412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f415u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile A8.e f417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile A8.o f418x;

    public j(w8.s client, w8.v originalRequest, boolean z6) {
        kotlin.jvm.internal.m.e(client, "client");
        kotlin.jvm.internal.m.e(originalRequest, "originalRequest");
        this.f403h = client;
        this.f404i = originalRequest;
        this.j = z6;
        this.f405k = (A8.q) client.f30631i.f18362i;
        client.f30633l.getClass();
        A8.i iVar = new A8.i(this);
        iVar.g(0, java.util.concurrent.TimeUnit.MILLISECONDS);
        this.f406l = iVar;
        this.f407m = new java.util.concurrent.atomic.AtomicBoolean();
        this.f415u = true;
    }

    public static final java.lang.String a(A8.j jVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(jVar.f416v ? "canceled " : "");
        sb.append(jVar.j ? "web socket" : "call");
        sb.append(" to ");
        sb.append(jVar.f404i.f30659a.f());
        return sb.toString();
    }

    public final void b(A8.o oVar) {
        byte[] bArr = x8.b.f31716a;
        if (this.f410p != null) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.f410p = oVar;
        oVar.f439p.add(new A8.h(this, this.f408n));
    }

    public final java.io.IOException c(java.io.IOException iOException) {
        java.io.IOException interruptedIOException;
        java.net.Socket socketJ;
        byte[] bArr = x8.b.f31716a;
        A8.o oVar = this.f410p;
        if (oVar != null) {
            synchronized (oVar) {
                socketJ = j();
            }
            if (this.f410p == null) {
                if (socketJ != null) {
                    x8.b.d(socketJ);
                }
            } else if (socketJ != null) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
        }
        if (!this.f411q && this.f406l.j()) {
            interruptedIOException = new java.io.InterruptedIOException(io.sentry.ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            kotlin.jvm.internal.m.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final java.lang.Object clone() {
        return new A8.j(this.f403h, this.f404i, this.j);
    }

    public final void d() {
        java.net.Socket socket;
        if (this.f416v) {
            return;
        }
        this.f416v = true;
        A8.e eVar = this.f417w;
        if (eVar != null) {
            eVar.f387c.cancel();
        }
        A8.o oVar = this.f418x;
        if (oVar == null || (socket = oVar.f428c) == null) {
            return;
        }
        x8.b.d(socket);
    }

    public final void e(w8.InterfaceC3026f interfaceC3026f) {
        A8.g gVar;
        if (!this.f407m.compareAndSet(false, true)) {
            throw new java.lang.IllegalStateException("Already Executed");
        }
        E8.n nVar = E8.n.f3326a;
        this.f408n = E8.n.f3326a.g();
        A7.m mVar = this.f403h.f30630h;
        A8.g gVar2 = new A8.g(this, interfaceC3026f);
        mVar.getClass();
        synchronized (mVar) {
            ((java.util.ArrayDeque) mVar.j).add(gVar2);
            if (!this.j) {
                java.lang.String str = this.f404i.f30659a.f30586d;
                java.util.Iterator it = ((java.util.ArrayDeque) mVar.f322k).iterator();
                do {
                    if (!it.hasNext()) {
                        java.util.Iterator it2 = ((java.util.ArrayDeque) mVar.j).iterator();
                        do {
                            if (!it2.hasNext()) {
                                gVar = null;
                                break;
                            }
                            gVar = (A8.g) it2.next();
                        } while (!kotlin.jvm.internal.m.a(gVar.j.f404i.f30659a.f30586d, str));
                    } else {
                        gVar = (A8.g) it.next();
                    }
                } while (!kotlin.jvm.internal.m.a(gVar.j.f404i.f30659a.f30586d, str));
                if (gVar != null) {
                    gVar2.f400i = gVar.f400i;
                }
            }
        }
        mVar.O();
    }

    public final void f(boolean z6) {
        A8.e eVar;
        synchronized (this) {
            if (!this.f415u) {
                throw new java.lang.IllegalStateException("released");
            }
        }
        if (z6 && (eVar = this.f417w) != null) {
            eVar.f387c.cancel();
            eVar.f385a.h(eVar, true, true, null);
        }
        this.f412r = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0086  */
    public final w8.B g() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p078i6.u.M0(arrayList, this.f403h.j);
        arrayList.add(new B8.a(this.f403h));
        arrayList.add(new B8.a(this.f403h.f30638q));
        this.f403h.getClass();
        arrayList.add(new y8.b());
        arrayList.add(A8.a.f370a);
        if (!this.j) {
            p078i6.u.M0(arrayList, this.f403h.f30632k);
        }
        arrayList.add(new B8.b(this.j));
        w8.v vVar = this.f404i;
        w8.s sVar = this.f403h;
        boolean z6 = false;
        try {
            try {
                w8.B bF = new B8.f(this, arrayList, 0, null, vVar, sVar.f30626D, sVar.f30627E, sVar.f30628F).f(this.f404i);
                if (this.f416v) {
                    x8.b.c(bF);
                    throw new java.io.IOException("Canceled");
                }
                i(null);
                return bF;
            } catch (java.io.IOException e6) {
                z6 = true;
                java.io.IOException iOExceptionI = i(e6);
                kotlin.jvm.internal.m.c(iOExceptionI, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionI;
            }
        } catch (java.lang.Throwable th) {
            if (!z6) {
                i(null);
            }
            throw th;
        }
        if (!z6) {
            i(null);
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final java.io.IOException h(A8.e exchange, boolean z6, boolean z9, java.io.IOException iOException) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.m.e(exchange, "exchange");
        if (exchange.equals(this.f417w)) {
            synchronized (this) {
                z10 = false;
                if (z6) {
                    try {
                        if (this.f413s) {
                            if (z6) {
                                this.f413s = false;
                            }
                            if (z9) {
                                this.f414t = false;
                            }
                            z12 = this.f413s;
                            if (z12) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (!z12) {
                                z10 = true;
                            }
                            z11 = z10;
                            z10 = z13;
                        } else if (z9 || !this.f414t) {
                            z11 = false;
                        } else {
                            if (z6) {
                                this.f413s = false;
                            }
                            if (z9) {
                                this.f414t = false;
                            }
                            z12 = this.f413s;
                            if (z12 || this.f414t) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (!z12 && !this.f414t && !this.f415u) {
                                z10 = true;
                            }
                            z11 = z10;
                            z10 = z13;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                } else {
                    if (z9) {
                    }
                    z11 = false;
                }
            }
            if (z10) {
                this.f417w = null;
                A8.o oVar = this.f410p;
                if (oVar != null) {
                    synchronized (oVar) {
                        oVar.f436m++;
                    }
                }
            }
            if (z11) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final java.io.IOException i(java.io.IOException iOException) {
        boolean z6;
        synchronized (this) {
            z6 = false;
            if (this.f415u) {
                this.f415u = false;
                if (!this.f413s && !this.f414t) {
                    z6 = true;
                }
            }
        }
        return z6 ? c(iOException) : iOException;
    }

    public final java.net.Socket j() {
        A8.o oVar = this.f410p;
        kotlin.jvm.internal.m.b(oVar);
        byte[] bArr = x8.b.f31716a;
        java.util.ArrayList arrayList = oVar.f439p;
        java.util.Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (kotlin.jvm.internal.m.a(((java.lang.ref.Reference) it.next()).get(), this)) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        arrayList.remove(i3);
        this.f410p = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        oVar.f440q = java.lang.System.nanoTime();
        A8.q qVar = this.f405k;
        qVar.getClass();
        byte[] bArr2 = x8.b.f31716a;
        boolean z6 = oVar.j;
        z8.b bVar = qVar.f444b;
        if (!z6) {
            bVar.c(qVar.f445c, 0L);
            return null;
        }
        oVar.j = true;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = qVar.f446d;
        concurrentLinkedQueue.remove(oVar);
        if (concurrentLinkedQueue.isEmpty()) {
            bVar.a();
        }
        java.net.Socket socket = oVar.f429d;
        kotlin.jvm.internal.m.b(socket);
        return socket;
    }

    public final void k() {
        if (this.f411q) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.f411q = true;
        this.f406l.j();
    }
}
