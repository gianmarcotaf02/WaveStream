package X2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.content.ComponentCallbacks2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f10819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.content.Context f10820i;
    public boolean j;

    public a(E2.w wVar) {
        this.f10819h = new java.lang.ref.WeakReference(wVar);
    }

    public final synchronized void a() {
        try {
            if (this.j) {
                return;
            }
            this.j = true;
            android.content.Context context = this.f10820i;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            this.f10819h.clear();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (((E2.w) this.f10819h.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i3) {
        N2.c cVarC;
        long jC;
        try {
            E2.w wVar = (E2.w) this.f10819h.get();
            if (wVar == null) {
                a();
            } else if (i3 >= 40) {
                N2.c cVarC2 = wVar.c();
                if (cVarC2 != null) {
                    synchronized (cVarC2.f7306c) {
                        cVarC2.f7304a.clear();
                        Y2.L l2 = cVarC2.f7305b;
                        l2.f11389i = 0;
                        ((java.util.LinkedHashMap) l2.j).clear();
                    }
                }
            } else if (i3 >= 10 && (cVarC = wVar.c()) != null) {
                synchronized (cVarC.f7306c) {
                    jC = cVarC.f7304a.c();
                }
                long j = jC / ((long) 2);
                synchronized (cVarC.f7306c) {
                    cVarC.f7304a.k(j);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
