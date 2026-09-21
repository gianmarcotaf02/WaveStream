package androidx.media3.exoplayer;

public final class C1554i implements p068h4.v {

    public final int f16677h;

    public final RenderersFactory f16678i;

    public C1554i(RenderersFactory renderersFactory, int i3) {
        this.f16677h = i3;
        this.f16678i = renderersFactory;
    }

    @Override
    public final Object get() {
        switch (this.f16677h) {
            case 0:
                return ExoPlayer.Builder.lambda$setRenderersFactory$16(this.f16678i);
            case 1:
                return ExoPlayer.Builder.lambda$new$6(this.f16678i);
            case 2:
                return ExoPlayer.Builder.lambda$new$2(this.f16678i);
            default:
                return ExoPlayer.Builder.lambda$new$8(this.f16678i);
        }
    }
}
