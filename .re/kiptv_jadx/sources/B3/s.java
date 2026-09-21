package B3;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f658i = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B3.C0089b f659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f661c;
    public B3.q g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public B3.r f665h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f663e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f664f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z3.d f662d = new Z3.d(android.os.Looper.getMainLooper(), 2);

    public s(long j, java.lang.String str) {
        this.f660b = j;
        this.f661c = str;
        this.f659a = new B3.C0089b("RequestTracker", str);
    }

    public final void a(long j, B3.q qVar) {
        B3.q qVar2;
        long j9;
        long j10;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Object obj = f658i;
        synchronized (obj) {
            qVar2 = this.g;
            j9 = this.f663e;
            j10 = this.f664f;
            this.f663e = j;
            this.g = qVar;
            this.f664f = jCurrentTimeMillis;
        }
        if (qVar2 != null) {
            qVar2.o(this.f661c, j9, j10, jCurrentTimeMillis);
        }
        synchronized (obj) {
            try {
                B3.r rVar = this.f665h;
                if (rVar != null) {
                    this.f662d.removeCallbacks(rVar);
                }
                B3.r rVar2 = new B3.r(0, this);
                this.f665h = rVar2;
                this.f662d.postDelayed(rVar2, this.f660b);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j, int i3, B3.o oVar) {
        synchronized (f658i) {
            try {
                if (c(j)) {
                    java.util.Locale locale = java.util.Locale.ROOT;
                    e(i3, oVar, "request " + j + " completed");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(long j) {
        boolean z6;
        synchronized (f658i) {
            long j9 = this.f663e;
            z6 = false;
            if (j9 != -1 && j9 == j) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean d() {
        boolean z6;
        synchronized (f658i) {
            z6 = this.f663e != -1;
        }
        return z6;
    }

    public final void e(int i3, B3.o oVar, java.lang.String str) {
        this.f659a.b(str, new java.lang.Object[0]);
        java.lang.Object obj = f658i;
        synchronized (obj) {
            try {
                if (this.g != null) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    B3.q qVar = this.g;
                    H3.q.g(qVar);
                    qVar.i(this.f661c, this.f663e, i3, oVar, this.f664f, jCurrentTimeMillis);
                }
                this.f663e = -1L;
                this.g = null;
                synchronized (obj) {
                    try {
                        B3.r rVar = this.f665h;
                        if (rVar != null) {
                            this.f662d.removeCallbacks(rVar);
                            this.f665h = null;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f(int i3) {
        synchronized (f658i) {
            try {
                if (!d()) {
                    return false;
                }
                java.util.Locale locale = java.util.Locale.ROOT;
                e(i3, null, "clearing request " + this.f663e);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
