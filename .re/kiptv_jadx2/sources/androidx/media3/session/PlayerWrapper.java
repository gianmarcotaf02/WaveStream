package androidx.media3.session;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.ForwardingPlayer;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.List;

final class PlayerWrapper extends ForwardingPlayer {

    public static final class CurrentMediaItemOnlyTimeline extends Timeline {
        private static final Object UID = new Object();
        private final long durationUs;
        private final boolean isDynamic;
        private final boolean isPlaceholder = false;
        private final boolean isSeekable;
        private final MediaItem.LiveConfiguration liveConfiguration;
        private final MediaItem mediaItem;

        public CurrentMediaItemOnlyTimeline(PlayerWrapper playerWrapper) {
            this.mediaItem = playerWrapper.getCurrentMediaItem();
            this.isSeekable = playerWrapper.isCurrentMediaItemSeekable();
            this.isDynamic = playerWrapper.isCurrentMediaItemDynamic();
            this.liveConfiguration = playerWrapper.isCurrentMediaItemLive() ? MediaItem.LiveConfiguration.UNSET : null;
            this.durationUs = Util.msToUs(playerWrapper.getContentDuration());
        }

        @Override
        public int getIndexOfPeriod(Object obj) {
            return UID.equals(obj) ? 0 : -1;
        }

        @Override
        public Timeline.Period getPeriod(int i3, Timeline.Period period, boolean z6) {
            Object obj = UID;
            period.set(obj, obj, 0, this.durationUs, 0L);
            period.isPlaceholder = this.isPlaceholder;
            return period;
        }

        @Override
        public int getPeriodCount() {
            return 1;
        }

        @Override
        public Object getUidOfPeriod(int i3) {
            return UID;
        }

        @Override
        public Timeline.Window getWindow(int i3, Timeline.Window window, long j) {
            window.set(UID, this.mediaItem, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, this.isSeekable, this.isDynamic, this.liveConfiguration, 0L, this.durationUs, 0, 0, 0L);
            window.isPlaceholder = this.isPlaceholder;
            return window;
        }

        @Override
        public int getWindowCount() {
            return 1;
        }
    }

    public PlayerWrapper(Player player) {
        super(player);
    }

    private void verifyApplicationThread() {
        AbstractC1864o0.Y(Looper.myLooper() == getApplicationLooper());
    }

    @Override
    public void addListener(Player.Listener listener) {
        verifyApplicationThread();
        super.addListener(listener);
    }

    @Override
    public void addMediaItem(MediaItem mediaItem) {
        verifyApplicationThread();
        super.addMediaItem(mediaItem);
    }

    @Override
    public void addMediaItems(List<MediaItem> list) {
        verifyApplicationThread();
        super.addMediaItems(list);
    }

    @Override
    public void clearMediaItems() {
        verifyApplicationThread();
        super.clearMediaItems();
    }

    @Override
    public void clearVideoSurface() {
        verifyApplicationThread();
        super.clearVideoSurface();
    }

    @Override
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        super.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThread();
        super.clearVideoSurfaceView(surfaceView);
    }

    @Override
    public void clearVideoTextureView(TextureView textureView) {
        verifyApplicationThread();
        super.clearVideoTextureView(textureView);
    }

    public PlayerInfo createInitialPlayerInfo() {
        return new PlayerInfo(getPlayerError(), 0, createSessionPositionInfo(), createPositionInfo(), createPositionInfo(), 0, getPlaybackParameters(), getRepeatMode(), getShuffleModeEnabled(), getVideoSize(), getCurrentTimelineWithCommandCheck(), 0, getPlaylistMetadataWithCommandCheck(), getVolumeWithCommandCheck(), 1.0f, getAudioAttributesWithCommandCheck(), 0, getCurrentCuesWithCommandCheck(), getDeviceInfo(), getDeviceVolumeWithCommandCheck(), isDeviceMutedWithCommandCheck(), getPlayWhenReady(), 1, getPlaybackSuppressionReason(), getPlaybackState(), isPlaying(), isLoading(), getMediaMetadataWithCommandCheck(), getSeekBackIncrement(), getSeekForwardIncrement(), getMaxSeekToPreviousPosition(), getCurrentTracksWithCommandCheck(), getTrackSelectionParameters());
    }

    public Player.PositionInfo createPositionInfo() {
        boolean zIsCommandAvailable = isCommandAvailable(16);
        boolean zIsCommandAvailable2 = isCommandAvailable(17);
        int currentMediaItemIndex = zIsCommandAvailable2 ? getCurrentMediaItemIndex() : 0;
        AbstractC1864o0.Y(currentMediaItemIndex >= 0);
        int currentPeriodIndex = zIsCommandAvailable2 ? getCurrentPeriodIndex() : 0;
        AbstractC1864o0.Y(currentPeriodIndex >= 0);
        if (zIsCommandAvailable2) {
            Timeline currentTimeline = getCurrentTimeline();
            if (!currentTimeline.isEmpty()) {
                AbstractC1864o0.Y(currentMediaItemIndex < currentTimeline.getWindowCount());
                Timeline.Window window = currentTimeline.getWindow(currentMediaItemIndex, new Timeline.Window());
                AbstractC1864o0.Y(currentPeriodIndex == Util.constrainValue(currentPeriodIndex, window.firstPeriodIndex, window.lastPeriodIndex));
            }
        }
        return new Player.PositionInfo(null, currentMediaItemIndex, zIsCommandAvailable ? getCurrentMediaItem() : null, null, currentPeriodIndex, zIsCommandAvailable ? getCurrentPosition() : 0L, zIsCommandAvailable ? getContentPosition() : 0L, zIsCommandAvailable ? getCurrentAdGroupIndex() : -1, zIsCommandAvailable ? getCurrentAdIndexInAdGroup() : -1);
    }

    public SessionPositionInfo createSessionPositionInfo() {
        boolean zIsCommandAvailable = isCommandAvailable(16);
        Player.PositionInfo positionInfoCreatePositionInfo = createPositionInfo();
        boolean z6 = zIsCommandAvailable && isPlayingAd();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long contentDuration = androidx.media3.common.C.TIME_UNSET;
        long duration = zIsCommandAvailable ? getDuration() : -9223372036854775807L;
        long bufferedPosition = zIsCommandAvailable ? getBufferedPosition() : 0L;
        int bufferedPercentage = zIsCommandAvailable ? getBufferedPercentage() : 0;
        long totalBufferedDuration = zIsCommandAvailable ? getTotalBufferedDuration() : 0L;
        long currentLiveOffset = zIsCommandAvailable ? getCurrentLiveOffset() : -9223372036854775807L;
        if (zIsCommandAvailable) {
            contentDuration = getContentDuration();
        }
        return new SessionPositionInfo(positionInfoCreatePositionInfo, z6, jElapsedRealtime, duration, bufferedPosition, bufferedPercentage, totalBufferedDuration, currentLiveOffset, contentDuration, zIsCommandAvailable ? getContentBufferedPosition() : 0L);
    }

    @Override
    @Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        super.decreaseDeviceVolume();
    }

    @Override
    public AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return super.getAudioAttributes();
    }

    public AudioAttributes getAudioAttributesWithCommandCheck() {
        return isCommandAvailable(21) ? getAudioAttributes() : AudioAttributes.DEFAULT;
    }

    @Override
    public Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return super.getAvailableCommands();
    }

    @Override
    public int getBufferedPercentage() {
        verifyApplicationThread();
        return super.getBufferedPercentage();
    }

    @Override
    public long getBufferedPosition() {
        verifyApplicationThread();
        return super.getBufferedPosition();
    }

    @Override
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        return super.getContentBufferedPosition();
    }

    @Override
    public long getContentDuration() {
        verifyApplicationThread();
        return super.getContentDuration();
    }

    @Override
    public long getContentPosition() {
        verifyApplicationThread();
        return super.getContentPosition();
    }

    @Override
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        return super.getCurrentAdGroupIndex();
    }

    @Override
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        return super.getCurrentAdIndexInAdGroup();
    }

    @Override
    public CueGroup getCurrentCues() {
        verifyApplicationThread();
        return super.getCurrentCues();
    }

    public CueGroup getCurrentCuesWithCommandCheck() {
        return isCommandAvailable(28) ? getCurrentCues() : CueGroup.EMPTY_TIME_ZERO;
    }

    @Override
    public long getCurrentLiveOffset() {
        verifyApplicationThread();
        return super.getCurrentLiveOffset();
    }

    @Override
    public Object getCurrentManifest() {
        verifyApplicationThread();
        return super.getCurrentManifest();
    }

    @Override
    public MediaItem getCurrentMediaItem() {
        verifyApplicationThread();
        return super.getCurrentMediaItem();
    }

    @Override
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        return super.getCurrentMediaItemIndex();
    }

    public MediaItem getCurrentMediaItemWithCommandCheck() {
        if (isCommandAvailable(16)) {
            return getCurrentMediaItem();
        }
        return null;
    }

    @Override
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        return super.getCurrentPeriodIndex();
    }

    @Override
    public long getCurrentPosition() {
        verifyApplicationThread();
        return super.getCurrentPosition();
    }

    @Override
    public Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return super.getCurrentTimeline();
    }

    public Timeline getCurrentTimelineWithCommandCheck() {
        if (isCommandAvailable(17)) {
            return getCurrentTimeline();
        }
        return getCurrentMediaItemWithCommandCheck() != null ? new CurrentMediaItemOnlyTimeline(this) : Timeline.EMPTY;
    }

    @Override
    public Tracks getCurrentTracks() {
        verifyApplicationThread();
        return super.getCurrentTracks();
    }

    public Tracks getCurrentTracksWithCommandCheck() {
        return isCommandAvailable(30) ? getCurrentTracks() : Tracks.EMPTY;
    }

    @Override
    @Deprecated
    public int getCurrentWindowIndex() {
        verifyApplicationThread();
        return super.getCurrentWindowIndex();
    }

    @Override
    public DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return super.getDeviceInfo();
    }

    @Override
    public int getDeviceVolume() {
        verifyApplicationThread();
        return super.getDeviceVolume();
    }

    public int getDeviceVolumeWithCommandCheck() {
        if (isCommandAvailable(23)) {
            return getDeviceVolume();
        }
        return 0;
    }

    @Override
    public long getDuration() {
        verifyApplicationThread();
        return super.getDuration();
    }

    public long getDurationWithCommandCheck() {
        return isCommandAvailable(16) ? getDuration() : androidx.media3.common.C.TIME_UNSET;
    }

    @Override
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return super.getMaxSeekToPreviousPosition();
    }

    @Override
    public MediaItem getMediaItemAt(int i3) {
        verifyApplicationThread();
        return super.getMediaItemAt(i3);
    }

    @Override
    public int getMediaItemCount() {
        verifyApplicationThread();
        return super.getMediaItemCount();
    }

    @Override
    public MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return super.getMediaMetadata();
    }

    public MediaMetadata getMediaMetadataWithCommandCheck() {
        return isCommandAvailable(18) ? getMediaMetadata() : MediaMetadata.EMPTY;
    }

    @Override
    public int getNextMediaItemIndex() {
        verifyApplicationThread();
        return super.getNextMediaItemIndex();
    }

    @Override
    @Deprecated
    public int getNextWindowIndex() {
        verifyApplicationThread();
        return super.getNextWindowIndex();
    }

    @Override
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return super.getPlayWhenReady();
    }

    @Override
    public PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return super.getPlaybackParameters();
    }

    @Override
    public int getPlaybackState() {
        verifyApplicationThread();
        return super.getPlaybackState();
    }

    @Override
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return super.getPlaybackSuppressionReason();
    }

    @Override
    public PlaybackException getPlayerError() {
        verifyApplicationThread();
        return super.getPlayerError();
    }

    @Override
    public MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return super.getPlaylistMetadata();
    }

    public MediaMetadata getPlaylistMetadataWithCommandCheck() {
        return isCommandAvailable(18) ? getPlaylistMetadata() : MediaMetadata.EMPTY;
    }

    @Override
    public int getPreviousMediaItemIndex() {
        verifyApplicationThread();
        return super.getPreviousMediaItemIndex();
    }

    @Override
    @Deprecated
    public int getPreviousWindowIndex() {
        verifyApplicationThread();
        return super.getPreviousWindowIndex();
    }

    @Override
    public int getRepeatMode() {
        verifyApplicationThread();
        return super.getRepeatMode();
    }

    @Override
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return super.getSeekBackIncrement();
    }

    @Override
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return super.getSeekForwardIncrement();
    }

    @Override
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return super.getShuffleModeEnabled();
    }

    @Override
    public Size getSurfaceSize() {
        verifyApplicationThread();
        return super.getSurfaceSize();
    }

    @Override
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return super.getTotalBufferedDuration();
    }

    @Override
    public TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        return super.getTrackSelectionParameters();
    }

    @Override
    public VideoSize getVideoSize() {
        verifyApplicationThread();
        return super.getVideoSize();
    }

    @Override
    public float getVolume() {
        verifyApplicationThread();
        return super.getVolume();
    }

    public float getVolumeWithCommandCheck() {
        if (isCommandAvailable(22)) {
            return getVolume();
        }
        return 1.0f;
    }

    @Override
    public boolean hasNextMediaItem() {
        verifyApplicationThread();
        return super.hasNextMediaItem();
    }

    @Override
    public boolean hasPreviousMediaItem() {
        verifyApplicationThread();
        return super.hasPreviousMediaItem();
    }

    @Override
    @Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        super.increaseDeviceVolume();
    }

    @Override
    public boolean isCommandAvailable(int i3) {
        verifyApplicationThread();
        return super.isCommandAvailable(i3);
    }

    @Override
    public boolean isCurrentMediaItemDynamic() {
        verifyApplicationThread();
        return super.isCurrentMediaItemDynamic();
    }

    @Override
    public boolean isCurrentMediaItemLive() {
        verifyApplicationThread();
        return super.isCurrentMediaItemLive();
    }

    public boolean isCurrentMediaItemLiveWithCommandCheck() {
        return isCommandAvailable(16) && isCurrentMediaItemLive();
    }

    @Override
    public boolean isCurrentMediaItemSeekable() {
        verifyApplicationThread();
        return super.isCurrentMediaItemSeekable();
    }

    @Override
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        return super.isDeviceMuted();
    }

    public boolean isDeviceMutedWithCommandCheck() {
        return isCommandAvailable(23) && isDeviceMuted();
    }

    @Override
    public boolean isLoading() {
        verifyApplicationThread();
        return super.isLoading();
    }

    @Override
    public boolean isPlaying() {
        verifyApplicationThread();
        return super.isPlaying();
    }

    @Override
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return super.isPlayingAd();
    }

    @Override
    public void moveMediaItem(int i3, int i9) {
        verifyApplicationThread();
        super.moveMediaItem(i3, i9);
    }

    @Override
    public void moveMediaItems(int i3, int i9, int i10) {
        verifyApplicationThread();
        super.moveMediaItems(i3, i9, i10);
    }

    @Override
    public void mute() {
        verifyApplicationThread();
        super.mute();
    }

    @Override
    public void pause() {
        verifyApplicationThread();
        super.pause();
    }

    @Override
    public void play() {
        verifyApplicationThread();
        super.play();
    }

    public void playIfCommandAvailable() {
        if (isCommandAvailable(1)) {
            play();
        }
    }

    @Override
    public void prepare() {
        verifyApplicationThread();
        super.prepare();
    }

    public void prepareIfCommandAvailable() {
        if (isCommandAvailable(2)) {
            prepare();
        }
    }

    @Override
    public void release() {
        verifyApplicationThread();
        super.release();
    }

    @Override
    public void removeListener(Player.Listener listener) {
        verifyApplicationThread();
        super.removeListener(listener);
    }

    @Override
    public void removeMediaItem(int i3) {
        verifyApplicationThread();
        super.removeMediaItem(i3);
    }

    @Override
    public void removeMediaItems(int i3, int i9) {
        verifyApplicationThread();
        super.removeMediaItems(i3, i9);
    }

    @Override
    public void replaceMediaItem(int i3, MediaItem mediaItem) {
        verifyApplicationThread();
        super.replaceMediaItem(i3, mediaItem);
    }

    @Override
    public void replaceMediaItems(int i3, int i9, List<MediaItem> list) {
        verifyApplicationThread();
        super.replaceMediaItems(i3, i9, list);
    }

    @Override
    public void seekBack() {
        verifyApplicationThread();
        super.seekBack();
    }

    @Override
    public void seekForward() {
        verifyApplicationThread();
        super.seekForward();
    }

    @Override
    public void seekTo(long j) {
        verifyApplicationThread();
        super.seekTo(j);
    }

    @Override
    public void seekToDefaultPosition(int i3) {
        verifyApplicationThread();
        super.seekToDefaultPosition(i3);
    }

    public void seekToDefaultPositionIfCommandAvailable() {
        if (isCommandAvailable(4)) {
            seekToDefaultPosition();
        }
    }

    @Override
    public void seekToNext() {
        verifyApplicationThread();
        super.seekToNext();
    }

    @Override
    public void seekToNextMediaItem() {
        verifyApplicationThread();
        super.seekToNextMediaItem();
    }

    @Override
    public void seekToPrevious() {
        verifyApplicationThread();
        super.seekToPrevious();
    }

    @Override
    public void seekToPreviousMediaItem() {
        verifyApplicationThread();
        super.seekToPreviousMediaItem();
    }

    @Override
    @Deprecated
    public void setDeviceMuted(boolean z6) {
        verifyApplicationThread();
        super.setDeviceMuted(z6);
    }

    @Override
    @Deprecated
    public void setDeviceVolume(int i3) {
        verifyApplicationThread();
        super.setDeviceVolume(i3);
    }

    @Override
    public void setMediaItem(MediaItem mediaItem) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem);
    }

    @Override
    public void setMediaItems(List<MediaItem> list) {
        verifyApplicationThread();
        super.setMediaItems(list);
    }

    @Override
    public void setPlayWhenReady(boolean z6) {
        verifyApplicationThread();
        super.setPlayWhenReady(z6);
    }

    @Override
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        super.setPlaybackParameters(playbackParameters);
    }

    @Override
    public void setPlaybackSpeed(float f9) {
        verifyApplicationThread();
        super.setPlaybackSpeed(f9);
    }

    @Override
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        super.setPlaylistMetadata(mediaMetadata);
    }

    @Override
    public void setRepeatMode(int i3) {
        verifyApplicationThread();
        super.setRepeatMode(i3);
    }

    @Override
    public void setShuffleModeEnabled(boolean z6) {
        verifyApplicationThread();
        super.setShuffleModeEnabled(z6);
    }

    @Override
    public void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        super.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override
    public void setVideoSurface(Surface surface) {
        verifyApplicationThread();
        super.setVideoSurface(surface);
    }

    @Override
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        super.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThread();
        super.setVideoSurfaceView(surfaceView);
    }

    @Override
    public void setVideoTextureView(TextureView textureView) {
        verifyApplicationThread();
        super.setVideoTextureView(textureView);
    }

    @Override
    public void setVolume(float f9) {
        verifyApplicationThread();
        super.setVolume(f9);
    }

    @Override
    public void stop() {
        verifyApplicationThread();
        super.stop();
    }

    @Override
    public void unmute() {
        verifyApplicationThread();
        super.unmute();
    }

    @Override
    public void addMediaItem(int i3, MediaItem mediaItem) {
        verifyApplicationThread();
        super.addMediaItem(i3, mediaItem);
    }

    @Override
    public void addMediaItems(int i3, List<MediaItem> list) {
        verifyApplicationThread();
        super.addMediaItems(i3, list);
    }

    @Override
    public void clearVideoSurface(Surface surface) {
        verifyApplicationThread();
        super.clearVideoSurface(surface);
    }

    @Override
    public void decreaseDeviceVolume(int i3) {
        verifyApplicationThread();
        super.decreaseDeviceVolume(i3);
    }

    @Override
    public void increaseDeviceVolume(int i3) {
        verifyApplicationThread();
        super.increaseDeviceVolume(i3);
    }

    @Override
    public void seekTo(int i3, long j) {
        verifyApplicationThread();
        super.seekTo(i3, j);
    }

    @Override
    public void seekToDefaultPosition() {
        verifyApplicationThread();
        super.seekToDefaultPosition();
    }

    @Override
    public void setDeviceMuted(boolean z6, int i3) {
        verifyApplicationThread();
        super.setDeviceMuted(z6, i3);
    }

    @Override
    public void setDeviceVolume(int i3, int i9) {
        verifyApplicationThread();
        super.setDeviceVolume(i3, i9);
    }

    @Override
    public void setMediaItem(MediaItem mediaItem, long j) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem, j);
    }

    @Override
    public void setMediaItems(List<MediaItem> list, boolean z6) {
        verifyApplicationThread();
        super.setMediaItems(list, z6);
    }

    @Override
    public void setMediaItem(MediaItem mediaItem, boolean z6) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem, z6);
    }

    @Override
    public void setMediaItems(List<MediaItem> list, int i3, long j) {
        verifyApplicationThread();
        super.setMediaItems(list, i3, j);
    }
}
