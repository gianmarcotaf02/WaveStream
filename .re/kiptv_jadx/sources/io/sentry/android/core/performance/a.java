package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.core.performance.AppStartMetrics f23454i;
    public final /* synthetic */ android.app.Application j;

    public /* synthetic */ a(io.sentry.android.core.performance.AppStartMetrics appStartMetrics, android.app.Application application, int i3) {
        this.f23453h = i3;
        this.f23454i = appStartMetrics;
        this.j = application;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23453h) {
            case 0:
                this.f23454i.lambda$checkCreateTimeOnMain$1(this.j);
                break;
            default:
                this.f23454i.lambda$registerApplicationForegroundCheck$0(this.j);
                break;
        }
    }
}
