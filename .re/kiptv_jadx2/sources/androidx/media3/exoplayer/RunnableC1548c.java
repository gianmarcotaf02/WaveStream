package androidx.media3.exoplayer;

import android.content.Context;

public final class RunnableC1548c implements Runnable {

    public final int f16612h;

    public final Object f16613i;
    public final Object j;

    public RunnableC1548c(Object obj, Object obj2, int i3) {
        this.f16612h = i3;
        this.j = obj;
        this.f16613i = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16612h) {
            case 0:
                ((DefaultSuitableOutputChecker.ImplApi23) this.j).lambda$enable$1((Context) this.f16613i);
                break;
            case 1:
                ((DefaultSuitableOutputChecker.ImplApi35) this.j).lambda$enable$1((Context) this.f16613i);
                break;
            case 2:
                ((ExoPlayerImpl) this.j).lambda$new$1((ExoPlayerImplInternal.PlaybackInfoUpdate) this.f16613i);
                break;
            default:
                ((ExoPlayerImplInternal) this.j).lambda$sendMessageToTargetThread$4((PlayerMessage) this.f16613i);
                break;
        }
    }
}
