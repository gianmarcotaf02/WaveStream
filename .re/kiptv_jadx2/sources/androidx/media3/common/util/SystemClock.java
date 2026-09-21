package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;

public class SystemClock implements Clock {
    @Override
    public HandlerWrapper createHandler(Looper looper, Handler.Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }

    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override
    public long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override
    public void onThreadBlocked() {
    }

    @Override
    public long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }
}
