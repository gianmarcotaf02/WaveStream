package androidx.media3.exoplayer;

import androidx.media3.exoplayer.upstream.BandwidthMeter;

public final class C1556k implements p068h4.v {

    public final int f16681h;

    public final BandwidthMeter f16682i;

    public C1556k(BandwidthMeter bandwidthMeter, int i3) {
        this.f16681h = i3;
        this.f16682i = bandwidthMeter;
    }

    @Override
    public final Object get() {
        switch (this.f16681h) {
            case 0:
                return ExoPlayer.Builder.lambda$setBandwidthMeter$20(this.f16682i);
            default:
                return ExoPlayer.Builder.lambda$new$12(this.f16682i);
        }
    }
}
