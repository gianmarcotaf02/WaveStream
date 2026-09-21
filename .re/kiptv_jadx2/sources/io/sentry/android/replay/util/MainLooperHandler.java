package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/sentry/android/replay/util/MainLooperHandler;", "", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;)V", "Ljava/lang/Runnable;", "runnable", "Lh6/A;", "post", "(Ljava/lang/Runnable;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MainLooperHandler {
    public static final int $stable = 8;
    private final Handler handler;

    public MainLooperHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final void post(Runnable runnable) {
        m.e(runnable, "runnable");
        this.handler.post(runnable);
    }

    public MainLooperHandler(Looper looper) {
        m.e(looper, "looper");
        this.handler = new Handler(looper);
    }

    public MainLooperHandler(Looper looper, int i3, AbstractC2541f abstractC2541f) {
        if ((i3 & 1) != 0) {
            looper = Looper.getMainLooper();
            m.d(looper, "getMainLooper()");
        }
        this(looper);
    }
}
