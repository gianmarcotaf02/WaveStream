package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.MediaSource;

public final class C1555j implements p068h4.v {

    public final int f16679h;

    public final MediaSource.Factory f16680i;

    public C1555j(MediaSource.Factory factory, int i3) {
        this.f16679h = i3;
        this.f16680i = factory;
    }

    @Override
    public final Object get() {
        switch (this.f16679h) {
            case 0:
                return ExoPlayer.Builder.lambda$new$7(this.f16680i);
            case 1:
                return ExoPlayer.Builder.lambda$new$9(this.f16680i);
            case 2:
                return ExoPlayer.Builder.lambda$new$5(this.f16680i);
            default:
                return ExoPlayer.Builder.lambda$setMediaSourceFactory$17(this.f16680i);
        }
    }
}
