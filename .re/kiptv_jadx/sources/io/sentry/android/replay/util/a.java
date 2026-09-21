package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f23476i;
    public final /* synthetic */ io.sentry.SentryOptions j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23477k;

    public /* synthetic */ a(java.lang.Runnable runnable, io.sentry.SentryOptions sentryOptions, java.lang.String str, int i3) {
        this.f23475h = i3;
        this.f23476i = runnable;
        this.j = sentryOptions;
        this.f23477k = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23475h) {
            case 0:
                io.sentry.android.replay.util.ExecutorsKt.scheduleAtFixedRateSafely$lambda$3(this.f23476i, this.j, this.f23477k);
                break;
            case 1:
                io.sentry.android.replay.util.ExecutorsKt.submitSafely$lambda$2(this.f23476i, this.j, this.f23477k);
                break;
            default:
                io.sentry.android.replay.util.ExecutorsKt.submitSafely$lambda$1(this.f23476i, this.j, this.f23477k);
                break;
        }
    }
}
