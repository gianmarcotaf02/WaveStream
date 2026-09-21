package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23447i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23448k;

    public /* synthetic */ n(java.lang.Object obj, io.sentry.IScopes iScopes, io.sentry.SentryOptions sentryOptions, int i3) {
        this.f23446h = i3;
        this.f23447i = obj;
        this.f23448k = iScopes;
        this.j = sentryOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23446h) {
            case 0:
                ((io.sentry.android.core.SendCachedEnvelopeIntegration) this.f23447i).lambda$sendCachedEnvelopes$0((io.sentry.android.core.SentryAndroidOptions) this.j, (io.sentry.IScopes) this.f23448k);
                break;
            case 1:
                ((io.sentry.android.core.ActivityFramesTracker) this.f23447i).lambda$runSafelyOnUiThread$3((java.lang.Runnable) this.j, (java.lang.String) this.f23448k);
                break;
            case 2:
                ((io.sentry.android.core.AnrIntegration) this.f23447i).lambda$register$0((io.sentry.IScopes) this.f23448k, (io.sentry.android.core.SentryAndroidOptions) this.j);
                break;
            default:
                ((io.sentry.android.core.SystemEventsBreadcrumbsIntegration) this.f23447i).lambda$register$0((io.sentry.IScopes) this.f23448k, (io.sentry.SentryOptions) this.j);
                break;
        }
    }

    public /* synthetic */ n(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        this.f23446h = i3;
        this.f23447i = obj;
        this.j = obj2;
        this.f23448k = obj3;
    }
}
