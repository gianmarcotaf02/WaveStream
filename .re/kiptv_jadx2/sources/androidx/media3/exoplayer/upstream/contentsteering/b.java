package androidx.media3.exoplayer.upstream.contentsteering;

public final class b implements Runnable {

    public final int f16810h;

    public final SteeringManifestTracker f16811i;

    public b(SteeringManifestTracker steeringManifestTracker, int i3) {
        this.f16810h = i3;
        this.f16811i = steeringManifestTracker;
    }

    @Override
    public final void run() {
        switch (this.f16810h) {
            case 0:
                SteeringManifestTracker.access$1000(this.f16811i);
                break;
            default:
                SteeringManifestTracker.access$1000(this.f16811i);
                break;
        }
    }
}
