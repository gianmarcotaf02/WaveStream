package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrackSelector {
    private androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter;
    private androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener listener;

    public interface Factory {
        androidx.media3.exoplayer.trackselection.TrackSelector createTrackSelector(android.content.Context context);
    }

    public interface InvalidationListener {
        default void onRendererCapabilitiesChanged(androidx.media3.exoplayer.Renderer renderer) {
        }

        void onTrackSelectionsInvalidated();
    }

    public final androidx.media3.exoplayer.upstream.BandwidthMeter getBandwidthMeter() {
        androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter = this.bandwidthMeter;
        bandwidthMeter.getClass();
        return bandwidthMeter;
    }

    public androidx.media3.common.TrackSelectionParameters getParameters() {
        return androidx.media3.common.TrackSelectionParameters.DEFAULT;
    }

    public androidx.media3.exoplayer.RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return null;
    }

    public void init(androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener invalidationListener, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.listener == null);
        this.listener = invalidationListener;
        this.bandwidthMeter = bandwidthMeter;
    }

    public final void invalidate() {
        androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener invalidationListener = this.listener;
        if (invalidationListener != null) {
            invalidationListener.onTrackSelectionsInvalidated();
        }
    }

    public final void invalidateForRendererCapabilitiesChange(androidx.media3.exoplayer.Renderer renderer) {
        androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener invalidationListener = this.listener;
        if (invalidationListener != null) {
            invalidationListener.onRendererCapabilitiesChanged(renderer);
        }
    }

    public boolean isSetParametersSupported() {
        return false;
    }

    public abstract void onSelectionActivated(java.lang.Object obj);

    public void release() {
        this.listener = null;
        this.bandwidthMeter = null;
    }

    public abstract androidx.media3.exoplayer.trackselection.TrackSelectorResult selectTracks(androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline);

    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
    }

    public void setParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
    }
}
