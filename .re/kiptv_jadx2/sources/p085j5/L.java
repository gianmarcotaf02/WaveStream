package p085j5;

import java.util.concurrent.ThreadFactory;

public final class L implements ThreadFactory {

    public final int f24022a;

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f24022a) {
            case 0:
                return new Thread(runnable, "kiptv-mpv-core");
            default:
                Thread thread = new Thread(runnable, "vlc-teardown");
                thread.setDaemon(true);
                return thread;
        }
    }
}
