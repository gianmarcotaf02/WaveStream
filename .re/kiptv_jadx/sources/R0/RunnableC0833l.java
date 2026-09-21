package R0;

/* JADX INFO: renamed from: R0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0833l implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView f8936i;

    public /* synthetic */ RunnableC0833l(androidx.compose.ui.platform.AndroidComposeView androidComposeView, int i3) {
        this.f8935h = i3;
        this.f8936i = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f8936i;
        switch (this.f8935h) {
            case 0:
                java.lang.Class cls = androidx.compose.ui.platform.AndroidComposeView.f15871R0;
                android.os.Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!androidComposeView.f15931o.isEmpty()) {
                    try {
                        ((kotlin.jvm.functions.Function0) androidComposeView.f15931o.removeLast()).invoke();
                    } catch (java.lang.Throwable th) {
                        android.os.Trace.endSection();
                        throw th;
                    }
                }
                android.os.Trace.endSection();
                return;
            default:
                androidComposeView.f15893J0 = false;
                android.view.MotionEvent motionEvent = androidComposeView.f15878B0;
                kotlin.jvm.internal.m.b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new java.lang.IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView.H(motionEvent);
                return;
        }
    }
}
