package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements io.sentry.ScopeCallback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f23462i;

    public /* synthetic */ b(kotlin.jvm.internal.A a2, int i3) {
        this.f23461h = i3;
        this.f23462i = a2;
    }

    @Override // io.sentry.ScopeCallback
    public final void run(io.sentry.IScope iScope) {
        switch (this.f23461h) {
            case 0:
                io.sentry.android.replay.ReplayIntegration.onScreenshotRecorded$lambda$4(this.f23462i, iScope);
                break;
            default:
                io.sentry.android.replay.capture.CaptureStrategy.Companion.createSegment$lambda$0(this.f23462i, iScope);
                break;
        }
    }
}
