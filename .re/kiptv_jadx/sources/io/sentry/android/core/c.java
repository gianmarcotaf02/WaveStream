package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.core.ActivityFramesTracker f23420i;
    public final /* synthetic */ android.app.Activity j;

    public /* synthetic */ c(io.sentry.android.core.ActivityFramesTracker activityFramesTracker, android.app.Activity activity, int i3) {
        this.f23419h = i3;
        this.f23420i = activityFramesTracker;
        this.j = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23419h) {
            case 0:
                this.f23420i.lambda$addActivity$0(this.j);
                break;
            default:
                this.f23420i.lambda$setMetrics$1(this.j);
                break;
        }
    }
}
