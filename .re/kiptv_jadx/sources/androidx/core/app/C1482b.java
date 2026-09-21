package androidx.core.app;

/* JADX INFO: renamed from: androidx.core.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1482b implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f16011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.app.Activity f16012i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16013k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f16014l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16015m = false;

    public C1482b(android.app.Activity activity) {
        this.f16012i = activity;
        this.j = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (this.f16012i == activity) {
            this.f16012i = null;
            this.f16014l = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        if (!this.f16014l || this.f16015m || this.f16013k) {
            return;
        }
        java.lang.Object obj = this.f16011h;
        try {
            java.lang.Object obj2 = androidx.core.app.AbstractC1483c.f16018c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.j) {
                androidx.core.app.AbstractC1483c.g.postAtFrontOfQueue(new com.google.common.util.concurrent.C(androidx.core.app.AbstractC1483c.f16017b.get(activity), obj2, 19));
                this.f16015m = true;
                this.f16011h = null;
            }
        } catch (java.lang.Throwable th) {
            android.util.Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        if (this.f16012i == activity) {
            this.f16013k = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }
}
