package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1560o implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.exoplayer.MediaPeriodHolder.Factory, androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16700i;

    public /* synthetic */ C1560o(int i3, java.lang.Object obj) {
        this.f16699h = i3;
        this.f16700i = obj;
    }

    @Override // androidx.media3.exoplayer.MediaPeriodHolder.Factory
    public androidx.media3.exoplayer.MediaPeriodHolder create(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo, long j) {
        return ((androidx.media3.exoplayer.ExoPlayerImplInternal) this.f16700i).createMediaPeriodHolder(mediaPeriodInfo, j);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        switch (this.f16699h) {
            case 0:
                ((androidx.media3.common.Player.Listener) obj).onMediaMetadataChanged((androidx.media3.common.MediaMetadata) this.f16700i);
                break;
            case 1:
                ((androidx.media3.common.Player.Listener) obj).onAudioAttributesChanged((androidx.media3.common.AudioAttributes) this.f16700i);
                break;
            case 2:
                ((androidx.media3.common.Player.Listener) obj).onTrackSelectionParametersChanged((androidx.media3.common.TrackSelectionParameters) this.f16700i);
                break;
            case 3:
                ((androidx.media3.common.Player.Listener) obj).onCues((androidx.media3.common.text.CueGroup) this.f16700i);
                break;
            case 4:
                ((androidx.media3.exoplayer.ExoPlayerImpl.ComponentListener) this.f16700i).lambda$onMetadata$6((androidx.media3.common.Player.Listener) obj);
                break;
            case 5:
                ((androidx.media3.common.Player.Listener) obj).onMetadata((androidx.media3.common.Metadata) this.f16700i);
                break;
            case 6:
                ((androidx.media3.common.Player.Listener) obj).onCues((java.util.List<androidx.media3.common.text.Cue>) this.f16700i);
                break;
            case 7:
                ((androidx.media3.common.Player.Listener) obj).onVideoSizeChanged((androidx.media3.common.VideoSize) this.f16700i);
                break;
            default:
                ((androidx.media3.common.Player.Listener) obj).onDeviceInfoChanged((androidx.media3.common.DeviceInfo) this.f16700i);
                break;
        }
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public void onStateChanged(java.lang.Object obj, java.lang.Object obj2) {
        ((androidx.media3.exoplayer.StreamVolumeManager) this.f16700i).onStreamVolumeStateChanged((androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj, (androidx.media3.exoplayer.StreamVolumeManager.StreamVolumeState) obj2);
    }
}
