package p105m2;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends p105m2.AbstractC2622u implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f25255x = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final android.content.ComponentName f25256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Z3.d f25257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f25258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f25259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f25260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p105m2.T f25261u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f25262v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k3.h f25263w;

    static {
        android.util.Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public Y(android.content.Context context, android.content.ComponentName componentName) {
        super(context, new p008a8.c(14, componentName));
        this.f25258r = new java.util.ArrayList();
        this.f25256p = componentName;
        this.f25257q = new Z3.d();
    }

    @Override // p105m2.AbstractC2622u
    public final p105m2.AbstractC2620s c(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        p007a7.z zVar = this.f25368n;
        if (zVar == null) {
            return null;
        }
        java.util.List list = zVar.f15517b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((p105m2.C2617o) list.get(i3)).d().equals(str)) {
                p105m2.W w6 = new p105m2.W(this, str);
                this.f25258r.add(w6);
                if (this.f25262v) {
                    w6.a(this.f25261u);
                }
                m();
                return w6;
            }
        }
        return null;
    }

    @Override // p105m2.AbstractC2622u
    public final p105m2.AbstractC2621t d(java.lang.String str) {
        if (str != null) {
            return j(str, null);
        }
        throw new java.lang.IllegalArgumentException("routeId cannot be null");
    }

    @Override // p105m2.AbstractC2622u
    public final p105m2.AbstractC2621t e(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return j(str, str2);
        }
        throw new java.lang.IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override // p105m2.AbstractC2622u
    public final void f(p105m2.C2618p c2618p) {
        if (this.f25262v) {
            p105m2.T t9 = this.f25261u;
            int i3 = t9.f25237d;
            t9.f25237d = i3 + 1;
            t9.b(10, i3, 0, c2618p != null ? c2618p.f25350a : null, null);
        }
        m();
    }

    public final void i() {
        if (this.f25260t) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f25256p);
        try {
            this.f25260t = this.f25363h.bindService(intent, this, android.os.Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (java.lang.SecurityException unused) {
        }
    }

    public final p105m2.X j(java.lang.String str, java.lang.String str2) {
        p007a7.z zVar = this.f25368n;
        if (zVar == null) {
            return null;
        }
        java.util.List list = zVar.f15517b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((p105m2.C2617o) list.get(i3)).d().equals(str)) {
                p105m2.X x9 = new p105m2.X(this, str, str2);
                this.f25258r.add(x9);
                if (this.f25262v) {
                    x9.a(this.f25261u);
                }
                m();
                return x9;
            }
        }
        return null;
    }

    public final void k() {
        if (this.f25261u != null) {
            g(null);
            this.f25262v = false;
            java.util.ArrayList arrayList = this.f25258r;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((p105m2.U) arrayList.get(i3)).c();
            }
            p105m2.T t9 = this.f25261u;
            t9.b(2, 0, 0, null, null);
            t9.f25235b.f22615b.clear();
            t9.f25234a.getBinder().unlinkToDeath(t9, 0);
            t9.f25241i.f25257q.post(new p105m2.S(t9, 0));
            this.f25261u = null;
        }
    }

    public final void l() {
        if (this.f25260t) {
            this.f25260t = false;
            k();
            try {
                this.f25363h.unbindService(this);
            } catch (java.lang.IllegalArgumentException e6) {
                android.util.Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e6);
            }
        }
    }

    public final void m() {
        if (!this.f25259s || (this.f25366l == null && this.f25258r.isEmpty())) {
            l();
        } else {
            i();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (this.f25260t) {
            k();
            android.os.Messenger messenger = iBinder != null ? new android.os.Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        p105m2.T t9 = new p105m2.T(this, messenger);
                        int i3 = t9.f25237d;
                        t9.f25237d = i3 + 1;
                        t9.g = i3;
                        if (t9.b(1, i3, 4, null, null)) {
                            try {
                                t9.f25234a.getBinder().linkToDeath(t9, 0);
                                this.f25261u = t9;
                                return;
                            } catch (android.os.RemoteException unused) {
                                t9.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (java.lang.NullPointerException unused2) {
                }
            }
            android.util.Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        k();
    }

    public final java.lang.String toString() {
        return "Service connection " + this.f25256p.flattenToShortString();
    }
}
