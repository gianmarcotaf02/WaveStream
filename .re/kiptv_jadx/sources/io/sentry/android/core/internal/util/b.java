package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23438c;

    public /* synthetic */ b(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f23436a = i3;
        this.f23437b = obj;
        this.f23438c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i3) {
        switch (this.f23436a) {
            case 0:
                io.sentry.android.core.internal.util.ScreenshotUtils.lambda$takeScreenshot$0((java.util.concurrent.atomic.AtomicBoolean) this.f23437b, (java.util.concurrent.CountDownLatch) this.f23438c, i3);
                break;
            default:
                io.sentry.android.replay.ScreenshotRecorder.capture$lambda$2$lambda$1((io.sentry.android.replay.ScreenshotRecorder) this.f23437b, (android.view.View) this.f23438c, i3);
                break;
        }
    }
}
