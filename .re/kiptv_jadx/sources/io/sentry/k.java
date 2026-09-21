package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.sentry.SentryOptions f23514i;

    public /* synthetic */ k(io.sentry.SentryOptions sentryOptions, int i3) {
        this.f23513h = i3;
        this.f23514i = sentryOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23513h) {
            case 0:
                io.sentry.Sentry.lambda$handleAppStartProfilingConfig$3(this.f23514i);
                break;
            case 1:
                io.sentry.Sentry.lambda$notifyOptionsObservers$4(this.f23514i);
                break;
            default:
                this.f23514i.loadLazyFields();
                break;
        }
    }
}
