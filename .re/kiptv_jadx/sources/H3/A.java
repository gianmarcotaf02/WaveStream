package H3;

/* JADX INFO: loaded from: classes.dex */
public final class A implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f3925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3926i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.os.IBinder f3927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final H3.z f3928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public android.content.ComponentName f3929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H3.C f3930n;

    public A(H3.C c9, H3.z zVar) {
        java.util.Objects.requireNonNull(c9);
        this.f3930n = c9;
        this.f3928l = zVar;
        this.f3925h = new java.util.HashMap();
        this.f3926i = 2;
    }

    public final D3.b a(java.lang.String str, java.util.concurrent.Executor executor) throws java.lang.Throwable {
        try {
            android.content.Intent intentA = H3.s.a(this.f3930n.f3935b, this.f3928l);
            this.f3926i = 3;
            android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                android.os.StrictMode.setVmPolicy(M3.b.a(new android.os.StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                H3.C c9 = this.f3930n;
                L3.a aVar = c9.f3937d;
                android.content.Context context = c9.f3935b;
                H3.z zVar = this.f3928l;
                try {
                    boolean zC = aVar.c(context, str, intentA, this, 4225, executor);
                    this.j = zC;
                    if (zC) {
                        c9.f3936c.sendMessageDelayed(c9.f3936c.obtainMessage(1, zVar), c9.f3939f);
                        D3.b bVar = D3.b.f2095m;
                        android.os.StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f3926i = 2;
                    try {
                        c9.f3937d.b(c9.f3935b, this);
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                    D3.b bVar2 = new D3.b(16, null, null);
                    android.os.StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    java.lang.Throwable th2 = th;
                    android.os.StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (H3.r e6) {
            return e6.f4003h;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        H3.C c9 = this.f3930n;
        synchronized (c9.f3934a) {
            try {
                c9.f3936c.removeMessages(1, this.f3928l);
                this.f3927k = iBinder;
                this.f3929m = componentName;
                java.util.Iterator it = this.f3925h.values().iterator();
                while (it.hasNext()) {
                    ((android.content.ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f3926i = 1;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        H3.C c9 = this.f3930n;
        synchronized (c9.f3934a) {
            try {
                c9.f3936c.removeMessages(1, this.f3928l);
                this.f3927k = null;
                this.f3929m = componentName;
                java.util.Iterator it = this.f3925h.values().iterator();
                while (it.hasNext()) {
                    ((android.content.ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f3926i = 2;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
