package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundThreadStateHandler<T> {
    private final androidx.media3.common.util.HandlerWrapper backgroundHandler;
    private T backgroundState;
    private final androidx.media3.common.util.HandlerWrapper foregroundHandler;
    private T foregroundState;
    private final androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener<T> onStateChanged;
    private int pendingOperations;

    public interface StateChangeListener<T> {
        void onStateChanged(T t9, T t10);
    }

    public BackgroundThreadStateHandler(T t9, android.os.Looper looper, android.os.Looper looper2, androidx.media3.common.util.Clock clock, androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener<T> stateChangeListener) {
        this.backgroundHandler = clock.createHandler(looper, null);
        this.foregroundHandler = clock.createHandler(looper2, null);
        this.foregroundState = t9;
        this.backgroundState = t9;
        this.onStateChanged = stateChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$setStateInBackground$2(java.lang.Object obj) {
        if (this.pendingOperations == 0) {
            updateStateInForeground(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$updateStateAsync$0(java.lang.Object obj) {
        int i3 = this.pendingOperations - 1;
        this.pendingOperations = i3;
        if (i3 == 0) {
            updateStateInForeground(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateAsync$1(p068h4.j jVar) {
        T t9 = (T) jVar.apply(this.backgroundState);
        this.backgroundState = t9;
        runInForeground(new androidx.media3.common.util.a(this, t9, 1));
    }

    private void runInForeground(java.lang.Runnable runnable) {
        if (this.foregroundHandler.getLooper().getThread().isAlive()) {
            this.foregroundHandler.post(runnable);
        }
    }

    private void updateStateInForeground(T t9) {
        T t10 = this.foregroundState;
        this.foregroundState = t9;
        if (t10.equals(t9)) {
            return;
        }
        this.onStateChanged.onStateChanged(t10, t9);
    }

    public T get() {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper == this.foregroundHandler.getLooper()) {
            return this.foregroundState;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(looperMyLooper == this.backgroundHandler.getLooper());
        return this.backgroundState;
    }

    public void runInBackground(java.lang.Runnable runnable) {
        if (this.backgroundHandler.getLooper().getThread().isAlive()) {
            this.backgroundHandler.post(runnable);
        }
    }

    public void setStateInBackground(T t9) {
        this.backgroundState = t9;
        runInForeground(new androidx.media3.common.util.a(this, t9, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateStateAsync(p068h4.j jVar, p068h4.j jVar2) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(android.os.Looper.myLooper() == this.foregroundHandler.getLooper());
        this.pendingOperations++;
        runInBackground(new androidx.media3.common.util.f(this, jVar2, 3));
        updateStateInForeground(jVar.apply(this.foregroundState));
    }
}
