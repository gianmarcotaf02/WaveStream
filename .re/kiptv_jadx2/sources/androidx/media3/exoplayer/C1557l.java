package androidx.media3.exoplayer;

import androidx.media3.exoplayer.trackselection.TrackSelector;

public final class C1557l implements p068h4.v {

    public final int f16683h;

    public final TrackSelector f16684i;

    public C1557l(TrackSelector trackSelector, int i3) {
        this.f16683h = i3;
        this.f16684i = trackSelector;
    }

    @Override
    public final Object get() {
        switch (this.f16683h) {
            case 0:
                return ExoPlayer.Builder.lambda$new$10(this.f16684i);
            default:
                return ExoPlayer.Builder.lambda$setTrackSelector$18(this.f16684i);
        }
    }
}
