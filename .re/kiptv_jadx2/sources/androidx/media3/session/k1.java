package androidx.media3.session;

import android.os.HandlerThread;

public final class k1 implements Runnable {

    public final int f17064h;

    public final Object f17065i;

    public k1(int i3, Object obj) {
        this.f17064h = i3;
        this.f17065i = obj;
    }

    @Override
    public final void run() {
        switch (this.f17064h) {
            case 0:
                ((SequencedFutureManager) this.f17065i).release();
                break;
            case 1:
                ((MediaController) this.f17065i).release();
                break;
            case 2:
                ((MediaSessionService) this.f17065i).lambda$onForegroundServiceStartNotAllowedException$5();
                break;
            default:
                ((HandlerThread) this.f17065i).quit();
                break;
        }
    }
}
