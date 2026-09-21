package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16513c;

    public /* synthetic */ Q(java.lang.Object obj, int i3, int i9) {
        this.f16511a = i9;
        this.f16512b = obj;
        this.f16513c = i3;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f16511a) {
            case 0:
                return ((androidx.media3.exoplayer.StreamVolumeManager) this.f16512b).lambda$increaseVolume$6(this.f16513c, (androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
            case 1:
                return ((androidx.media3.exoplayer.StreamVolumeManager) this.f16512b).lambda$decreaseVolume$8(this.f16513c, (androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
            case 2:
                return ((androidx.media3.exoplayer.StreamVolumeManager) this.f16512b).lambda$setStreamType$2(this.f16513c, (androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
            default:
                return ((androidx.media3.exoplayer.ExoPlayerImpl) this.f16512b).lambda$setAudioSessionId$14(this.f16513c, (java.lang.Integer) obj);
        }
    }
}
