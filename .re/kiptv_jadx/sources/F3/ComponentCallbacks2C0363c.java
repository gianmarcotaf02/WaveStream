package F3;

/* JADX INFO: renamed from: F3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0363c implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final F3.ComponentCallbacks2C0363c f3577l = new F3.ComponentCallbacks2C0363c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f3578h = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f3579i = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.ArrayList j = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3580k = false;

    public final void a(boolean z6) {
        synchronized (f3577l) {
            try {
                java.util.Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    Z3.d dVar = ((F3.r) it.next()).f3620a.f3596u;
                    dVar.sendMessage(dVar.obtainMessage(1, java.lang.Boolean.valueOf(z6)));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f3579i;
        boolean zCompareAndSet = this.f3578h.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f3579i;
        boolean zCompareAndSet = this.f3578h.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            a(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        if (i3 == 20 && this.f3578h.compareAndSet(false, true)) {
            this.f3579i.set(true);
            a(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }
}
