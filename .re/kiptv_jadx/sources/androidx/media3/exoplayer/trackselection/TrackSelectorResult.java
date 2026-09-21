package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectorResult {
    public final java.lang.Object info;
    public final int length;
    public final androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurations;
    public final androidx.media3.exoplayer.trackselection.ExoTrackSelection[] selections;
    public final androidx.media3.common.Tracks tracks;

    @java.lang.Deprecated
    public TrackSelectorResult(androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurationArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, java.lang.Object obj) {
        this(rendererConfigurationArr, exoTrackSelectionArr, androidx.media3.common.Tracks.EMPTY, obj);
    }

    public boolean isEquivalent(androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult == null || trackSelectorResult.selections.length != this.selections.length) {
            return false;
        }
        for (int i3 = 0; i3 < this.selections.length; i3++) {
            if (!isEquivalent(trackSelectorResult, i3)) {
                return false;
            }
        }
        return true;
    }

    public boolean isRendererEnabled(int i3) {
        return this.rendererConfigurations[i3] != null;
    }

    public TrackSelectorResult(androidx.media3.exoplayer.RendererConfiguration[] rendererConfigurationArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, androidx.media3.common.Tracks tracks, java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(rendererConfigurationArr.length == exoTrackSelectionArr.length);
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = (androidx.media3.exoplayer.trackselection.ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.tracks = tracks;
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    public boolean isEquivalent(androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, int i3) {
        return trackSelectorResult != null && java.util.Objects.equals(this.rendererConfigurations[i3], trackSelectorResult.rendererConfigurations[i3]) && java.util.Objects.equals(this.selections[i3], trackSelectorResult.selections[i3]);
    }
}
