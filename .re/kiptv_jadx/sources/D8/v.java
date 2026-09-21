package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D8.n f2592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f2596f;
    public final java.util.ArrayDeque g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D8.t f2598i;
    public final D8.s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D8.u f2599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D8.u f2600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.io.IOException f2602n;

    public v(int i3, D8.n connection, boolean z6, boolean z9, w8.m mVar) {
        kotlin.jvm.internal.m.e(connection, "connection");
        this.f2591a = i3;
        this.f2592b = connection;
        this.f2596f = connection.f2565x.a();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.g = arrayDeque;
        this.f2598i = new D8.t(this, connection.f2564w.a(), z9);
        this.j = new D8.s(this, z6);
        this.f2599k = new D8.u(this);
        this.f2600l = new D8.u(this);
        if (mVar == null) {
            if (!g()) {
                throw new java.lang.IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new java.lang.IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(mVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    public final void a() {
        boolean z6;
        boolean zH;
        byte[] bArr = x8.b.f31716a;
        synchronized (this) {
            try {
                D8.t tVar = this.f2598i;
                if (tVar.f2586i || !tVar.f2588l) {
                    z6 = false;
                } else {
                    D8.s sVar = this.j;
                    if (sVar.f2582h || sVar.j) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                zH = h();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z6) {
            c(null, 9);
        } else {
            if (zH) {
                return;
            }
            this.f2592b.i(this.f2591a);
        }
    }

    public final void b() throws java.io.IOException {
        D8.s sVar = this.j;
        if (sVar.j) {
            throw new java.io.IOException("stream closed");
        }
        if (sVar.f2582h) {
            throw new java.io.IOException("stream finished");
        }
        if (this.f2601m != 0) {
            java.io.IOException iOException = this.f2602n;
            if (iOException != null) {
                throw iOException;
            }
            int i3 = this.f2601m;
            com.google.android.gms.internal.play_billing.M0.r(i3);
            throw new D8.B(i3);
        }
    }

    public final void c(java.io.IOException iOException, int i3) {
        com.google.android.gms.internal.play_billing.M0.s(i3, "rstStatusCode");
        if (d(iOException, i3)) {
            D8.n nVar = this.f2592b;
            nVar.getClass();
            com.google.android.gms.internal.play_billing.M0.s(i3, "statusCode");
            nVar.f2547D.v(this.f2591a, i3);
        }
    }

    public final boolean d(java.io.IOException iOException, int i3) {
        byte[] bArr = x8.b.f31716a;
        synchronized (this) {
            if (this.f2601m != 0) {
                return false;
            }
            this.f2601m = i3;
            this.f2602n = iOException;
            notifyAll();
            if (this.f2598i.f2586i && this.j.f2582h) {
                return false;
            }
            this.f2592b.i(this.f2591a);
            return true;
        }
    }

    public final void e(int i3) {
        com.google.android.gms.internal.play_billing.M0.s(i3, "errorCode");
        if (d(null, i3)) {
            this.f2592b.v(this.f2591a, i3);
        }
    }

    public final D8.s f() {
        synchronized (this) {
            if (!this.f2597h && !g()) {
                throw new java.lang.IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z6 = (this.f2591a & 1) == 1;
        this.f2592b.getClass();
        return true == z6;
    }

    public final synchronized boolean h() {
        if (this.f2601m != 0) {
            return false;
        }
        D8.t tVar = this.f2598i;
        if (tVar.f2586i || tVar.f2588l) {
            D8.s sVar = this.j;
            if ((sVar.f2582h || sVar.j) && this.f2597h) {
                return false;
            }
        }
        return true;
    }

    public final void i(w8.m headers, boolean z6) {
        boolean zH;
        kotlin.jvm.internal.m.e(headers, "headers");
        byte[] bArr = x8.b.f31716a;
        synchronized (this) {
            try {
                if (this.f2597h && z6) {
                    this.f2598i.getClass();
                } else {
                    this.f2597h = true;
                    this.g.add(headers);
                }
                if (z6) {
                    this.f2598i.f2586i = true;
                }
                zH = h();
                notifyAll();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f2592b.i(this.f2591a);
    }

    public final synchronized void j(int i3) {
        com.google.android.gms.internal.play_billing.M0.s(i3, "errorCode");
        if (this.f2601m == 0) {
            this.f2601m = i3;
            notifyAll();
        }
    }

    public final void k() throws java.io.InterruptedIOException {
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }
}
