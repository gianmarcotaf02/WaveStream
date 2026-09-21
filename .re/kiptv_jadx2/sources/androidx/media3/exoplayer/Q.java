package androidx.media3.exoplayer;

public final class Q implements p068h4.j {

    public final int f16511a;

    public final Object f16512b;

    public final int f16513c;

    public Q(Object obj, int i3, int i9) {
        this.f16511a = i9;
        this.f16512b = obj;
        this.f16513c = i3;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f16511a) {
            case 0:
                return ((StreamVolumeManager) this.f16512b).lambda$increaseVolume$6(this.f16513c, (StreamVolumeManager.StreamVolumeState) obj);
            case 1:
                return ((StreamVolumeManager) this.f16512b).lambda$decreaseVolume$8(this.f16513c, (StreamVolumeManager.StreamVolumeState) obj);
            case 2:
                return ((StreamVolumeManager) this.f16512b).lambda$setStreamType$2(this.f16513c, (StreamVolumeManager.StreamVolumeState) obj);
            default:
                return ((ExoPlayerImpl) this.f16512b).lambda$setAudioSessionId$14(this.f16513c, (Integer) obj);
        }
    }
}
