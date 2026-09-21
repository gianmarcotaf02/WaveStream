package p166t3;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p066h2.a f27769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f27774f;
    public volatile p075i2.a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile p075i2.a f27775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.Semaphore f27776i;
    public final java.util.Set j;

    public d(com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity, java.util.Set set) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = p075i2.a.f22750o;
        this.f27770b = false;
        this.f27771c = false;
        this.f27772d = true;
        this.f27773e = false;
        signInHubActivity.getApplicationContext();
        this.f27774f = threadPoolExecutor;
        this.f27776i = new java.util.concurrent.Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            if (!this.f27770b) {
                this.f27773e = true;
            }
            if (this.f27775h != null) {
                this.g.getClass();
                this.g = null;
                return;
            }
            this.g.getClass();
            p075i2.a aVar = this.g;
            aVar.f22755k.set(true);
            if (aVar.f22754i.cancel(false)) {
                this.f27775h = this.g;
            }
            this.g = null;
        }
    }

    public final void b(p075i2.a aVar, java.lang.Object obj) {
        boolean z6;
        if (this.g != aVar) {
            if (this.f27775h == aVar) {
                android.os.SystemClock.uptimeMillis();
                this.f27775h = null;
                c();
                return;
            }
            return;
        }
        if (this.f27771c) {
            return;
        }
        android.os.SystemClock.uptimeMillis();
        this.g = null;
        p066h2.a aVar2 = this.f27769a;
        if (aVar2 != null) {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                aVar2.i(obj);
                return;
            }
            synchronized (aVar2.f16279a) {
                z6 = aVar2.f16284f == androidx.lifecycle.F.f16278k;
                aVar2.f16284f = obj;
            }
            if (z6) {
                p111n.a aVarM0 = p111n.a.m0();
                androidx.lifecycle.B b9 = aVar2.j;
                p111n.b bVar = aVarM0.f25518a;
                if (bVar.f25521c == null) {
                    synchronized (bVar.f25519a) {
                        try {
                            if (bVar.f25521c == null) {
                                bVar.f25521c = p111n.b.m0(android.os.Looper.getMainLooper());
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                bVar.f25521c.post(b9);
            }
        }
    }

    public final void c() {
        if (this.f27775h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        p075i2.a aVar = this.g;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.f27774f;
        if (aVar.j == 1) {
            aVar.j = 2;
            aVar.f22753h.getClass();
            threadPoolExecutor.execute(aVar.f22754i);
        } else {
            int iC = Z.AbstractC1149h0.c(aVar.j);
            if (iC == 1) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iC == 2) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new java.lang.IllegalStateException("We should never reach this state");
        }
    }

    public final void d() {
        java.util.Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((E3.i) it.next()).getClass();
            throw new java.lang.UnsupportedOperationException();
        }
        try {
            this.f27776i.tryAcquire(0, 5L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e6) {
            android.util.Log.i("GACSignInLoader", "Unexpected InterruptedException", e6);
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        E6.G.i(this, sb);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
