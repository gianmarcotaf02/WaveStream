package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.common.SimpleBasePlayer.State f16426i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ l(androidx.media3.common.SimpleBasePlayer.State state, java.lang.Object obj, int i3) {
        this.f16425h = i3;
        this.f16426i = state;
        this.j = obj;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16425h) {
            case 0:
                return androidx.media3.common.SimpleBasePlayer.lambda$setVideoTextureView$22(this.f16426i, (androidx.media3.common.util.Size) this.j);
            case 1:
                return androidx.media3.common.SimpleBasePlayer.lambda$setPlaylistMetadata$15(this.f16426i, (androidx.media3.common.MediaMetadata) this.j);
            case 2:
                return androidx.media3.common.SimpleBasePlayer.lambda$setVideoSurfaceHolder$20(this.f16426i, (android.view.SurfaceHolder) this.j);
            case 3:
                return androidx.media3.common.SimpleBasePlayer.lambda$setVideoSurfaceView$21(this.f16426i, (android.view.SurfaceView) this.j);
            case 4:
                return androidx.media3.common.SimpleBasePlayer.lambda$setAudioAttributes$32(this.f16426i, (androidx.media3.common.AudioAttributes) this.j);
            case 5:
                return ((androidx.media3.common.SimpleBasePlayer) this.j).lambda$stop$12(this.f16426i);
            case 6:
                return androidx.media3.common.SimpleBasePlayer.lambda$setPlaybackParameters$11(this.f16426i, (androidx.media3.common.PlaybackParameters) this.j);
            default:
                return androidx.media3.common.SimpleBasePlayer.lambda$setTrackSelectionParameters$14(this.f16426i, (androidx.media3.common.TrackSelectionParameters) this.j);
        }
    }

    public /* synthetic */ l(androidx.media3.common.SimpleBasePlayer simpleBasePlayer, androidx.media3.common.SimpleBasePlayer.State state) {
        this.f16425h = 5;
        this.j = simpleBasePlayer;
        this.f16426i = state;
    }
}
