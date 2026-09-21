package androidx.media3.exoplayer.scheduler;

public final class b implements Runnable {

    public final int f16716h;

    public final RequirementsWatcher.NetworkCallback f16717i;

    public b(RequirementsWatcher.NetworkCallback networkCallback, int i3) {
        this.f16716h = i3;
        this.f16717i = networkCallback;
    }

    @Override
    public final void run() {
        switch (this.f16716h) {
            case 0:
                this.f16717i.lambda$postCheckRequirements$0();
                break;
            default:
                this.f16717i.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
