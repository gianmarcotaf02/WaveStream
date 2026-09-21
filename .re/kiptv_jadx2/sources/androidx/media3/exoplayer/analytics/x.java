package androidx.media3.exoplayer.analytics;

public final class x implements p068h4.v {

    public final int f16583h;

    public x(int i3) {
        this.f16583h = i3;
    }

    @Override
    public final Object get() {
        switch (this.f16583h) {
            case 0:
                return DefaultPlaybackSessionManager.generateDefaultSessionId();
            default:
                throw new IllegalStateException();
        }
    }
}
