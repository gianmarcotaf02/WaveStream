package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.exoplayer.upstream.experimental.ExperimentalBandwidthMeter;

public final class c implements NetworkTypeObserver.Listener {

    public final int f16807a;

    public final Object f16808b;

    public c(int i3, Object obj) {
        this.f16807a = i3;
        this.f16808b = obj;
    }

    @Override
    public final void onNetworkTypeChanged(int i3) throws Throwable {
        switch (this.f16807a) {
            case 0:
                ((DefaultBandwidthMeter) this.f16808b).onNetworkTypeChanged(i3);
                break;
            default:
                ((ExperimentalBandwidthMeter) this.f16808b).onNetworkTypeChanged(i3);
                break;
        }
    }
}
