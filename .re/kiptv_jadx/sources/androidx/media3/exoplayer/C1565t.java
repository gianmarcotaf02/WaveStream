package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1565t implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16792b;

    public /* synthetic */ C1565t(int i3, int i9) {
        this.f16791a = i9;
        this.f16792b = i3;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f16791a) {
            case 0:
                return androidx.media3.exoplayer.ExoPlayerImpl.lambda$setAudioSessionId$13(this.f16792b, (java.lang.Integer) obj);
            case 1:
                return androidx.media3.exoplayer.ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$2(this.f16792b, (java.lang.Integer) obj);
            case 2:
                return androidx.media3.exoplayer.ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$3(this.f16792b, (java.lang.Integer) obj);
            case 3:
                return androidx.media3.exoplayer.StreamVolumeManager.lambda$setVolume$3(this.f16792b, (androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
            default:
                return androidx.media3.exoplayer.StreamVolumeManager.lambda$setStreamType$1(this.f16792b, (androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj);
        }
    }
}
