package androidx.media3.exoplayer.source.preload;

public final class q implements Runnable {

    public final int f16782h;

    public final PreCacheHelper.ReleasableExecutorSupplier f16783i;

    public q(PreCacheHelper.ReleasableExecutorSupplier releasableExecutorSupplier, int i3) {
        this.f16782h = i3;
        this.f16783i = releasableExecutorSupplier;
    }

    @Override
    public final void run() {
        switch (this.f16782h) {
            case 0:
                this.f16783i.lambda$onExecutorReleased$0();
                break;
            default:
                this.f16783i.onExecutorReleased();
                break;
        }
    }
}
