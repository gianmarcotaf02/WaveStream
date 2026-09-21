package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerHolder<T extends androidx.media3.session.MediaController> extends com.google.common.util.concurrent.AbstractC1902q implements androidx.media3.session.MediaController.ConnectionCallback {
    private boolean accepted;
    private T controller;
    private final android.os.Handler handler;

    public MediaControllerHolder(android.os.Looper looper) {
        this.handler = new android.os.Handler(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setController$0(androidx.media3.session.MediaController mediaController) {
        if (isCancelled()) {
            mediaController.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setController$1(java.lang.Runnable runnable) {
        androidx.media3.common.util.Util.postOrRun(this.handler, runnable);
    }

    private void maybeSetException() {
        setException(new java.lang.SecurityException("Session rejected the connection request."));
    }

    private void maybeSetFutureResult() {
        T t9 = this.controller;
        if (t9 == null || !this.accepted) {
            return;
        }
        set(t9);
    }

    @Override // androidx.media3.session.MediaController.ConnectionCallback
    public void onAccepted() {
        this.accepted = true;
        maybeSetFutureResult();
    }

    @Override // androidx.media3.session.MediaController.ConnectionCallback
    public void onRejected() {
        maybeSetException();
    }

    public void setController(T t9) {
        this.controller = t9;
        maybeSetFutureResult();
        addListener(new androidx.media3.session.RunnableC1589l(this, t9, 1), new androidx.media3.session.ExecutorC1591m(0, this));
    }
}
