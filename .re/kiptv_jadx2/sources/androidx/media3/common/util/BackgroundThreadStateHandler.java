package androidx.media3.common.util;

import android.os.Looper;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import p068h4.j;

public final class BackgroundThreadStateHandler<T> {
    private final HandlerWrapper backgroundHandler;
    private T backgroundState;
    private final HandlerWrapper foregroundHandler;
    private T foregroundState;
    private final StateChangeListener<T> onStateChanged;
    private int pendingOperations;

    public interface StateChangeListener<T> {
        void onStateChanged(T t9, T t10);
    }

    public BackgroundThreadStateHandler(T t9, Looper looper, Looper looper2, Clock clock, StateChangeListener<T> stateChangeListener) {
        this.backgroundHandler = clock.createHandler(looper, null);
        this.foregroundHandler = clock.createHandler(looper2, null);
        this.foregroundState = t9;
        this.backgroundState = t9;
        this.onStateChanged = stateChangeListener;
    }

    public void lambda$setStateInBackground$2(Object obj) {
        if (this.pendingOperations == 0) {
            updateStateInForeground(obj);
        }
    }

    public void lambda$updateStateAsync$0(Object obj) {
        int i3 = this.pendingOperations - 1;
        this.pendingOperations = i3;
        if (i3 == 0) {
            updateStateInForeground(obj);
        }
    }

    public void lambda$updateStateAsync$1(j jVar) {
        T t9 = (T) jVar.apply(this.backgroundState);
        this.backgroundState = t9;
        runInForeground(new a(this, t9, 1));
    }

    private void runInForeground(Runnable runnable) {
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
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.foregroundHandler.getLooper()) {
            return this.foregroundState;
        }
        AbstractC1864o0.Y(looperMyLooper == this.backgroundHandler.getLooper());
        return this.backgroundState;
    }

    public void runInBackground(Runnable runnable) {
        if (this.backgroundHandler.getLooper().getThread().isAlive()) {
            this.backgroundHandler.post(runnable);
        }
    }

    public void setStateInBackground(T t9) {
        this.backgroundState = t9;
        runInForeground(new a(this, t9, 0));
    }

    public void updateStateAsync(j jVar, j jVar2) {
        AbstractC1864o0.Y(Looper.myLooper() == this.foregroundHandler.getLooper());
        this.pendingOperations++;
        runInBackground(new f(this, jVar2, 3));
        updateStateInForeground(jVar.apply(this.foregroundState));
    }
}
