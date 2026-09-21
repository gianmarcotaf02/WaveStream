package androidx.media3.common;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.media3.common.util.Size;
import p068h4.v;

public final class l implements v {

    public final int f16425h;

    public final SimpleBasePlayer.State f16426i;
    public final Object j;

    public l(SimpleBasePlayer.State state, Object obj, int i3) {
        this.f16425h = i3;
        this.f16426i = state;
        this.j = obj;
    }

    @Override
    public final Object get() {
        switch (this.f16425h) {
            case 0:
                return SimpleBasePlayer.lambda$setVideoTextureView$22(this.f16426i, (Size) this.j);
            case 1:
                return SimpleBasePlayer.lambda$setPlaylistMetadata$15(this.f16426i, (MediaMetadata) this.j);
            case 2:
                return SimpleBasePlayer.lambda$setVideoSurfaceHolder$20(this.f16426i, (SurfaceHolder) this.j);
            case 3:
                return SimpleBasePlayer.lambda$setVideoSurfaceView$21(this.f16426i, (SurfaceView) this.j);
            case 4:
                return SimpleBasePlayer.lambda$setAudioAttributes$32(this.f16426i, (AudioAttributes) this.j);
            case 5:
                return ((SimpleBasePlayer) this.j).lambda$stop$12(this.f16426i);
            case 6:
                return SimpleBasePlayer.lambda$setPlaybackParameters$11(this.f16426i, (PlaybackParameters) this.j);
            default:
                return SimpleBasePlayer.lambda$setTrackSelectionParameters$14(this.f16426i, (TrackSelectionParameters) this.j);
        }
    }

    public l(SimpleBasePlayer simpleBasePlayer, SimpleBasePlayer.State state) {
        this.f16425h = 5;
        this.j = simpleBasePlayer;
        this.f16426i = state;
    }
}
