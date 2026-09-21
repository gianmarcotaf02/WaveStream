package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface LoadControl {

    @java.lang.Deprecated
    public static final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId EMPTY_MEDIA_PERIOD_ID = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(new java.lang.Object());

    public static final class Parameters {
        public final long bufferedDurationUs;
        public final long lastRebufferRealtimeMs;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final boolean playWhenReady;
        public final long playbackPositionUs;
        public final float playbackSpeed;
        public final androidx.media3.exoplayer.analytics.PlayerId playerId;
        public final boolean rebuffering;
        public final long targetLiveOffsetUs;
        public final androidx.media3.common.Timeline timeline;

        public Parameters(androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j9, float f9, boolean z6, boolean z9, long j10, long j11) {
            this.playerId = playerId;
            this.timeline = timeline;
            this.mediaPeriodId = mediaPeriodId;
            this.playbackPositionUs = j;
            this.bufferedDurationUs = j9;
            this.playbackSpeed = f9;
            this.playWhenReady = z6;
            this.rebuffering = z9;
            this.targetLiveOffsetUs = j10;
            this.lastRebufferRealtimeMs = j11;
        }
    }

    androidx.media3.exoplayer.upstream.Allocator getAllocator(androidx.media3.exoplayer.analytics.PlayerId playerId);

    default long getBackBufferDurationUs(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return getBackBufferDurationUs();
    }

    default void onPrepared(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        onPrepared();
    }

    default void onReleased(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        onReleased();
    }

    default void onStopped(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        onStopped();
    }

    default void onTracksSelected(androidx.media3.exoplayer.LoadControl.Parameters parameters, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        throw new java.lang.IllegalStateException("onTracksSelected not implemented");
    }

    default boolean retainBackBufferFromKeyframe(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        return retainBackBufferFromKeyframe();
    }

    default boolean shouldContinueLoading(androidx.media3.exoplayer.LoadControl.Parameters parameters) {
        return shouldContinueLoading(parameters.playbackPositionUs, parameters.bufferedDurationUs, parameters.playbackSpeed);
    }

    default boolean shouldContinuePreloading(androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
        androidx.media3.common.util.Log.w("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default boolean shouldStartPlayback(androidx.media3.exoplayer.LoadControl.Parameters parameters) {
        return shouldStartPlayback(parameters.timeline, parameters.mediaPeriodId, parameters.bufferedDurationUs, parameters.playbackSpeed, parameters.rebuffering, parameters.targetLiveOffsetUs);
    }

    @java.lang.Deprecated
    default long getBackBufferDurationUs() {
        throw new java.lang.IllegalStateException("getBackBufferDurationUs not implemented");
    }

    @java.lang.Deprecated
    default void onPrepared() {
        throw new java.lang.IllegalStateException("onPrepared not implemented");
    }

    @java.lang.Deprecated
    default void onReleased() {
        throw new java.lang.IllegalStateException("onReleased not implemented");
    }

    @java.lang.Deprecated
    default void onStopped() {
        throw new java.lang.IllegalStateException("onStopped not implemented");
    }

    @java.lang.Deprecated
    default void onTracksSelected(androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @java.lang.Deprecated
    default boolean retainBackBufferFromKeyframe() {
        throw new java.lang.IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    @java.lang.Deprecated
    default boolean shouldContinueLoading(long j, long j9, float f9) {
        throw new java.lang.IllegalStateException("shouldContinueLoading not implemented");
    }

    @java.lang.Deprecated
    default boolean shouldStartPlayback(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, float f9, boolean z6, long j9) {
        return shouldStartPlayback(j, f9, z6, j9);
    }

    @java.lang.Deprecated
    default void onTracksSelected(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @java.lang.Deprecated
    default boolean shouldStartPlayback(long j, float f9, boolean z6, long j9) {
        throw new java.lang.IllegalStateException("shouldStartPlayback not implemented");
    }

    @java.lang.Deprecated
    default void onTracksSelected(androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        throw new java.lang.IllegalStateException("onTracksSelected not implemented");
    }
}
