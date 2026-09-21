package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final D8.A f2543G;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f2544A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f2545B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.net.Socket f2546C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final D8.w f2547D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final A7.l f2548E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.util.LinkedHashSet f2549F;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D8.h f2550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.LinkedHashMap f2551i = new java.util.LinkedHashMap();
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z8.c f2555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z8.b f2556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z8.b f2557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z8.b f2558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final D8.z f2559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f2560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f2561t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f2562u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final D8.A f2564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public D8.A f2565x;
    public long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f2566z;

    static {
        D8.A a2 = new D8.A();
        a2.c(7, io.ktor.network.sockets.DatagramKt.MAX_DATAGRAM_SIZE);
        a2.c(5, 16384);
        f2543G = a2;
    }

    public n(Z2.C0 c9) {
        this.f2550h = (D8.h) c9.f12660f;
        java.lang.String str = (java.lang.String) c9.f12657c;
        if (str == null) {
            kotlin.jvm.internal.m.k("connectionName");
            throw null;
        }
        this.j = str;
        this.f2553l = 3;
        z8.c cVar = (z8.c) c9.f12655a;
        this.f2555n = cVar;
        this.f2556o = cVar.e();
        this.f2557p = cVar.e();
        this.f2558q = cVar.e();
        this.f2559r = D8.z.f2614a;
        D8.A a2 = new D8.A();
        a2.c(7, 16777216);
        this.f2564w = a2;
        D8.A a9 = f2543G;
        this.f2565x = a9;
        this.f2545B = a9.a();
        java.net.Socket socket = (java.net.Socket) c9.f12656b;
        if (socket == null) {
            kotlin.jvm.internal.m.k("socket");
            throw null;
        }
        this.f2546C = socket;
        M8.D d4 = (M8.D) c9.f12659e;
        if (d4 == null) {
            kotlin.jvm.internal.m.k("sink");
            throw null;
        }
        this.f2547D = new D8.w(d4);
        M8.E e6 = (M8.E) c9.f12658d;
        if (e6 == null) {
            kotlin.jvm.internal.m.k("source");
            throw null;
        }
        this.f2548E = new A7.l(9, this, new D8.r(e6), false);
        this.f2549F = new java.util.LinkedHashSet();
    }

    public final void b(int i3, int i9, java.io.IOException iOException) {
        int i10;
        java.lang.Object[] array;
        com.google.android.gms.internal.play_billing.M0.s(i3, "connectionCode");
        com.google.android.gms.internal.play_billing.M0.s(i9, "streamCode");
        byte[] bArr = x8.b.f31716a;
        try {
            j(i3);
        } catch (java.io.IOException unused) {
        }
        synchronized (this) {
            if (this.f2551i.isEmpty()) {
                array = null;
            } else {
                array = this.f2551i.values().toArray(new D8.v[0]);
                this.f2551i.clear();
            }
        }
        D8.v[] vVarArr = (D8.v[]) array;
        if (vVarArr != null) {
            for (D8.v vVar : vVarArr) {
                try {
                    vVar.c(iOException, i9);
                } catch (java.io.IOException unused2) {
                }
            }
        }
        try {
            this.f2547D.close();
        } catch (java.io.IOException unused3) {
        }
        try {
            this.f2546C.close();
        } catch (java.io.IOException unused4) {
        }
        this.f2556o.e();
        this.f2557p.e();
        this.f2558q.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(1, 9, null);
    }

    public final synchronized D8.v e(int i3) {
        return (D8.v) this.f2551i.get(java.lang.Integer.valueOf(i3));
    }

    public final void flush() {
        this.f2547D.flush();
    }

    public final synchronized D8.v i(int i3) {
        D8.v vVar;
        vVar = (D8.v) this.f2551i.remove(java.lang.Integer.valueOf(i3));
        notifyAll();
        return vVar;
    }

    public final void j(int i3) {
        com.google.android.gms.internal.play_billing.M0.s(i3, "statusCode");
        synchronized (this.f2547D) {
            synchronized (this) {
                if (this.f2554m) {
                    return;
                }
                this.f2554m = true;
                this.f2547D.j(x8.b.f31716a, this.f2552k, i3);
            }
        }
    }

    public final synchronized void t(long j) {
        long j9 = this.y + j;
        this.y = j9;
        long j10 = j9 - this.f2566z;
        if (j10 >= this.f2564w.a() / 2) {
            z(0, j10);
            this.f2566z += j10;
        }
    }

    public final void u(int i3, boolean z6, M8.C0682j c0682j, long j) {
        long j9;
        long j10;
        int iMin;
        long j11;
        if (j == 0) {
            this.f2547D.e(z6, i3, c0682j, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j9 = this.f2544A;
                            j10 = this.f2545B;
                            if (j9 >= j10) {
                                if (!this.f2551i.containsKey(java.lang.Integer.valueOf(i3))) {
                                    throw new java.io.IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (java.lang.InterruptedException unused) {
                            java.lang.Thread.currentThread().interrupt();
                            throw new java.io.InterruptedIOException();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                iMin = java.lang.Math.min((int) java.lang.Math.min(j, j10 - j9), this.f2547D.j);
                j11 = iMin;
                this.f2544A += j11;
            }
            j -= j11;
            this.f2547D.e(z6 && j == 0, i3, c0682j, iMin);
        }
    }

    public final void v(int i3, int i9) {
        com.google.android.gms.internal.play_billing.M0.s(i9, "errorCode");
        this.f2556o.c(new D8.j(this.j + '[' + i3 + "] writeSynReset", this, i3, i9, 2), 0L);
    }

    public final void z(int i3, long j) {
        this.f2556o.c(new D8.m(this.j + '[' + i3 + "] windowUpdate", this, i3, j), 0L);
    }
}
