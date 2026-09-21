package androidx.media3.session;

import java.util.concurrent.Executor;

public final class ExecutorC1591m implements Executor {

    public final int f17073h;

    public final Object f17074i;

    public ExecutorC1591m(int i3, Object obj) {
        this.f17073h = i3;
        this.f17074i = obj;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.f17073h) {
            case 0:
                ((MediaControllerHolder) this.f17074i).lambda$setController$1(runnable);
                break;
            case 1:
                ((MediaLibrarySessionImpl) this.f17074i).postOrRunOnApplicationHandler(runnable);
                break;
            case 2:
                ((MediaNotificationManager) this.f17074i).lambda$new$0(runnable);
                break;
            default:
                ((MediaSessionImpl) this.f17074i).postOrRunOnApplicationHandler(runnable);
                break;
        }
    }
}
