package androidx.media3.common;

import android.view.Choreographer;
import java.util.concurrent.Executor;
import p105m2.HandlerC2605c;

public final class m implements Executor {

    public final int f16427h;

    public final Object f16428i;

    public m(int i3, Object obj) {
        this.f16427h = i3;
        this.f16428i = obj;
    }

    @Override
    public final void execute(final Runnable runnable) {
        switch (this.f16427h) {
            case 0:
                ((SimpleBasePlayer) this.f16428i).postOrRunOnApplicationHandler(runnable);
                break;
            case 1:
                ((Choreographer) this.f16428i).postFrameCallback(new Choreographer.FrameCallback() {
                    @Override
                    public final void doFrame(long j) {
                        runnable.run();
                    }
                });
                break;
            default:
                ((HandlerC2605c) this.f16428i).post(runnable);
                break;
        }
    }
}
