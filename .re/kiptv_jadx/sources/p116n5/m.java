package p116n5;

/* JADX INFO: loaded from: classes.dex */
public final class m implements android.app.Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.kiptv.tv.KIPTVTvApplication f25810h;

    public m(com.kiptv.tv.KIPTVTvApplication kIPTVTvApplication) {
        this.f25810h = kIPTVTvApplication;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        this.f25810h.f21000r++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        com.kiptv.tv.KIPTVTvApplication kIPTVTvApplication = this.f25810h;
        int i3 = kIPTVTvApplication.f21000r - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        kIPTVTvApplication.f21000r = i3;
    }
}
