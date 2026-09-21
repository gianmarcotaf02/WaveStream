package androidx.media3.exoplayer.video;

import java.util.concurrent.Executor;

public final class a implements Executor {

    public final int f16818h;

    public a(int i3) {
        this.f16818h = i3;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f16818h) {
            case 0:
                DefaultVideoSink.lambda$new$0(runnable);
                break;
            default:
                PlaybackVideoGraphWrapper.lambda$static$0(runnable);
                break;
        }
    }
}
