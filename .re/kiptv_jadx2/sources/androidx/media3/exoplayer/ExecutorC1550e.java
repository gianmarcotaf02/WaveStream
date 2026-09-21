package androidx.media3.exoplayer;

import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.HandlerWrapper;
import java.util.concurrent.Executor;

public final class ExecutorC1550e implements Executor {

    public final int f16639h;

    public final Object f16640i;

    public ExecutorC1550e(int i3, Object obj) {
        this.f16639h = i3;
        this.f16640i = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f16639h) {
            case 0:
                ((BackgroundThreadStateHandler) this.f16640i).runInBackground(runnable);
                break;
            default:
                ((HandlerWrapper) this.f16640i).post(runnable);
                break;
        }
    }
}
