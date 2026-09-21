package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23422i;

    public /* synthetic */ d(int i3, java.lang.Object obj) {
        this.f23421h = i3;
        this.f23422i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23421h) {
            case 0:
                ((io.sentry.android.core.ActivityFramesTracker) this.f23422i).lambda$stop$2();
                break;
            case 1:
                ((io.sentry.android.core.AndroidProfiler) this.f23422i).lambda$start$0();
                break;
            case 2:
                ((io.sentry.android.core.AppLifecycleIntegration) this.f23422i).lambda$close$1();
                break;
            case 3:
                io.sentry.android.core.InternalSentrySdk.deleteCurrentSessionFile((io.sentry.SentryOptions) this.f23422i);
                break;
            default:
                ((io.sentry.android.core.NetworkBreadcrumbsIntegration) this.f23422i).lambda$close$0();
                break;
        }
    }
}
