package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.core.ActivityLifecycleIntegration f23426i;
    public final /* synthetic */ io.sentry.ISpan j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ io.sentry.ISpan f23427k;

    public /* synthetic */ f(io.sentry.android.core.ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.ISpan iSpan, io.sentry.ISpan iSpan2, int i3) {
        this.f23425h = i3;
        this.f23426i = activityLifecycleIntegration;
        this.j = iSpan;
        this.f23427k = iSpan2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23425h) {
            case 0:
                this.f23426i.lambda$startTracing$1(this.j, this.f23427k);
                break;
            case 1:
                this.f23426i.lambda$onActivityResumed$8(this.j, this.f23427k);
                break;
            default:
                this.f23426i.lambda$onActivityResumed$9(this.j, this.f23427k);
                break;
        }
    }
}
