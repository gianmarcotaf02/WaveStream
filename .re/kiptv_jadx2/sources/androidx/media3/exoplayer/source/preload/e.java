package androidx.media3.exoplayer.source.preload;

public final class e implements Runnable {

    public final int f16762h;

    public final Object f16763i;

    public e(int i3, Object obj) {
        this.f16762h = i3;
        this.f16763i = obj;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f16762h) {
            case 0:
                ((DefaultPreloadManager) this.f16763i).lambda$releasePreloadUtils$2();
                break;
            default:
                ((PreCacheHelper) this.f16763i).lambda$stop$1();
                break;
        }
    }
}
