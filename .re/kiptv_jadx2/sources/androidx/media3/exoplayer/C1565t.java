package androidx.media3.exoplayer;

public final class C1565t implements p068h4.j {

    public final int f16791a;

    public final int f16792b;

    public C1565t(int i3, int i9) {
        this.f16791a = i9;
        this.f16792b = i3;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f16791a) {
            case 0:
                return ExoPlayerImpl.lambda$setAudioSessionId$13(this.f16792b, (Integer) obj);
            case 1:
                return ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$2(this.f16792b, (Integer) obj);
            case 2:
                return ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$3(this.f16792b, (Integer) obj);
            case 3:
                return StreamVolumeManager.lambda$setVolume$3(this.f16792b, (StreamVolumeManager.StreamVolumeState) obj);
            default:
                return StreamVolumeManager.lambda$setStreamType$1(this.f16792b, (StreamVolumeManager.StreamVolumeState) obj);
        }
    }
}
