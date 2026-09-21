package androidx.media3.exoplayer;

public final class C1551f implements p068h4.v {

    public final int f16641h;

    public final LoadControl f16642i;

    public C1551f(LoadControl loadControl, int i3) {
        this.f16641h = i3;
        this.f16642i = loadControl;
    }

    @Override
    public final Object get() {
        switch (this.f16641h) {
            case 0:
                return ExoPlayer.Builder.lambda$setLoadControl$19(this.f16642i);
            default:
                return ExoPlayer.Builder.lambda$new$11(this.f16642i);
        }
    }
}
