package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class PlayerWrapper extends androidx.media3.common.ForwardingPlayer {

    public static final class CurrentMediaItemOnlyTimeline extends androidx.media3.common.Timeline {
        private static final java.lang.Object UID = new java.lang.Object();
        private final long durationUs;
        private final boolean isDynamic;
        private final boolean isPlaceholder = false;
        private final boolean isSeekable;
        private final androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
        private final androidx.media3.common.MediaItem mediaItem;

        public CurrentMediaItemOnlyTimeline(androidx.media3.session.PlayerWrapper playerWrapper) {
            this.mediaItem = playerWrapper.getCurrentMediaItem();
            this.isSeekable = playerWrapper.isCurrentMediaItemSeekable();
            this.isDynamic = playerWrapper.isCurrentMediaItemDynamic();
            this.liveConfiguration = playerWrapper.isCurrentMediaItemLive() ? androidx.media3.common.MediaItem.LiveConfiguration.UNSET : null;
            this.durationUs = androidx.media3.common.util.Util.msToUs(playerWrapper.getContentDuration());
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            return UID.equals(obj) ? 0 : -1;
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i3, androidx.media3.common.Timeline.Period period, boolean z6) {
            java.lang.Object obj = UID;
            period.set(obj, obj, 0, this.durationUs, 0L);
            period.isPlaceholder = this.isPlaceholder;
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // androidx.media3.common.Timeline
        public java.lang.Object getUidOfPeriod(int i3) {
            return UID;
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i3, androidx.media3.common.Timeline.Window window, long j) {
            window.set(UID, this.mediaItem, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, this.isSeekable, this.isDynamic, this.liveConfiguration, 0L, this.durationUs, 0, 0, 0L);
            window.isPlaceholder = this.isPlaceholder;
            return window;
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public PlayerWrapper(androidx.media3.common.Player player) {
        super(player);
    }

    private void verifyApplicationThread() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(android.os.Looper.myLooper() == getApplicationLooper());
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addListener(androidx.media3.common.Player.Listener listener) {
        verifyApplicationThread();
        super.addListener(listener);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItem(androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        super.addMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        super.addMediaItems(list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearMediaItems() {
        verifyApplicationThread();
        super.clearMediaItems();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurface() {
        verifyApplicationThread();
        super.clearVideoSurface();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        super.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        super.clearVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        super.clearVideoTextureView(textureView);
    }

    public androidx.media3.session.PlayerInfo createInitialPlayerInfo() {
        return new androidx.media3.session.PlayerInfo(getPlayerError(), 0, createSessionPositionInfo(), createPositionInfo(), createPositionInfo(), 0, getPlaybackParameters(), getRepeatMode(), getShuffleModeEnabled(), getVideoSize(), getCurrentTimelineWithCommandCheck(), 0, getPlaylistMetadataWithCommandCheck(), getVolumeWithCommandCheck(), 1.0f, getAudioAttributesWithCommandCheck(), 0, getCurrentCuesWithCommandCheck(), getDeviceInfo(), getDeviceVolumeWithCommandCheck(), isDeviceMutedWithCommandCheck(), getPlayWhenReady(), 1, getPlaybackSuppressionReason(), getPlaybackState(), isPlaying(), isLoading(), getMediaMetadataWithCommandCheck(), getSeekBackIncrement(), getSeekForwardIncrement(), getMaxSeekToPreviousPosition(), getCurrentTracksWithCommandCheck(), getTrackSelectionParameters());
    }

    public androidx.media3.common.Player.PositionInfo createPositionInfo() {
        boolean zIsCommandAvailable = isCommandAvailable(16);
        boolean zIsCommandAvailable2 = isCommandAvailable(17);
        int currentMediaItemIndex = zIsCommandAvailable2 ? getCurrentMediaItemIndex() : 0;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(currentMediaItemIndex >= 0);
        int currentPeriodIndex = zIsCommandAvailable2 ? getCurrentPeriodIndex() : 0;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(currentPeriodIndex >= 0);
        if (zIsCommandAvailable2) {
            androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
            if (!currentTimeline.isEmpty()) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(currentMediaItemIndex < currentTimeline.getWindowCount());
                androidx.media3.common.Timeline.Window window = currentTimeline.getWindow(currentMediaItemIndex, new androidx.media3.common.Timeline.Window());
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(currentPeriodIndex == androidx.media3.common.util.Util.constrainValue(currentPeriodIndex, window.firstPeriodIndex, window.lastPeriodIndex));
            }
        }
        return new androidx.media3.common.Player.PositionInfo(null, currentMediaItemIndex, zIsCommandAvailable ? getCurrentMediaItem() : null, null, currentPeriodIndex, zIsCommandAvailable ? getCurrentPosition() : 0L, zIsCommandAvailable ? getContentPosition() : 0L, zIsCommandAvailable ? getCurrentAdGroupIndex() : -1, zIsCommandAvailable ? getCurrentAdIndexInAdGroup() : -1);
    }

    public androidx.media3.session.SessionPositionInfo createSessionPositionInfo() {
        boolean zIsCommandAvailable = isCommandAvailable(16);
        androidx.media3.common.Player.PositionInfo positionInfoCreatePositionInfo = createPositionInfo();
        boolean z6 = zIsCommandAvailable && isPlayingAd();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long contentDuration = androidx.media3.common.C.TIME_UNSET;
        long duration = zIsCommandAvailable ? getDuration() : -9223372036854775807L;
        long bufferedPosition = zIsCommandAvailable ? getBufferedPosition() : 0L;
        int bufferedPercentage = zIsCommandAvailable ? getBufferedPercentage() : 0;
        long totalBufferedDuration = zIsCommandAvailable ? getTotalBufferedDuration() : 0L;
        long currentLiveOffset = zIsCommandAvailable ? getCurrentLiveOffset() : -9223372036854775807L;
        if (zIsCommandAvailable) {
            contentDuration = getContentDuration();
        }
        return new androidx.media3.session.SessionPositionInfo(positionInfoCreatePositionInfo, z6, jElapsedRealtime, duration, bufferedPosition, bufferedPercentage, totalBufferedDuration, currentLiveOffset, contentDuration, zIsCommandAvailable ? getContentBufferedPosition() : 0L);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        super.decreaseDeviceVolume();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return super.getAudioAttributes();
    }

    public androidx.media3.common.AudioAttributes getAudioAttributesWithCommandCheck() {
        return isCommandAvailable(21) ? getAudioAttributes() : androidx.media3.common.AudioAttributes.DEFAULT;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return super.getAvailableCommands();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getBufferedPercentage() {
        verifyApplicationThread();
        return super.getBufferedPercentage();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getBufferedPosition() {
        verifyApplicationThread();
        return super.getBufferedPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        return super.getContentBufferedPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getContentDuration() {
        verifyApplicationThread();
        return super.getContentDuration();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getContentPosition() {
        verifyApplicationThread();
        return super.getContentPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        return super.getCurrentAdGroupIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        return super.getCurrentAdIndexInAdGroup();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.text.CueGroup getCurrentCues() {
        verifyApplicationThread();
        return super.getCurrentCues();
    }

    public androidx.media3.common.text.CueGroup getCurrentCuesWithCommandCheck() {
        return isCommandAvailable(28) ? getCurrentCues() : androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getCurrentLiveOffset() {
        verifyApplicationThread();
        return super.getCurrentLiveOffset();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public java.lang.Object getCurrentManifest() {
        verifyApplicationThread();
        return super.getCurrentManifest();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.MediaItem getCurrentMediaItem() {
        verifyApplicationThread();
        return super.getCurrentMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        return super.getCurrentMediaItemIndex();
    }

    public androidx.media3.common.MediaItem getCurrentMediaItemWithCommandCheck() {
        if (isCommandAvailable(16)) {
            return getCurrentMediaItem();
        }
        return null;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        return super.getCurrentPeriodIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getCurrentPosition() {
        verifyApplicationThread();
        return super.getCurrentPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return super.getCurrentTimeline();
    }

    public androidx.media3.common.Timeline getCurrentTimelineWithCommandCheck() {
        if (isCommandAvailable(17)) {
            return getCurrentTimeline();
        }
        return getCurrentMediaItemWithCommandCheck() != null ? new androidx.media3.session.PlayerWrapper.CurrentMediaItemOnlyTimeline(this) : androidx.media3.common.Timeline.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.Tracks getCurrentTracks() {
        verifyApplicationThread();
        return super.getCurrentTracks();
    }

    public androidx.media3.common.Tracks getCurrentTracksWithCommandCheck() {
        return isCommandAvailable(30) ? getCurrentTracks() : androidx.media3.common.Tracks.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public int getCurrentWindowIndex() {
        verifyApplicationThread();
        return super.getCurrentWindowIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return super.getDeviceInfo();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
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

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getDuration() {
        verifyApplicationThread();
        return super.getDuration();
    }

    public long getDurationWithCommandCheck() {
        return isCommandAvailable(16) ? getDuration() : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return super.getMaxSeekToPreviousPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.MediaItem getMediaItemAt(int i3) {
        verifyApplicationThread();
        return super.getMediaItemAt(i3);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getMediaItemCount() {
        verifyApplicationThread();
        return super.getMediaItemCount();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return super.getMediaMetadata();
    }

    public androidx.media3.common.MediaMetadata getMediaMetadataWithCommandCheck() {
        return isCommandAvailable(18) ? getMediaMetadata() : androidx.media3.common.MediaMetadata.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getNextMediaItemIndex() {
        verifyApplicationThread();
        return super.getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public int getNextWindowIndex() {
        verifyApplicationThread();
        return super.getNextWindowIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return super.getPlayWhenReady();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return super.getPlaybackParameters();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getPlaybackState() {
        verifyApplicationThread();
        return super.getPlaybackState();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return super.getPlaybackSuppressionReason();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.PlaybackException getPlayerError() {
        verifyApplicationThread();
        return super.getPlayerError();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return super.getPlaylistMetadata();
    }

    public androidx.media3.common.MediaMetadata getPlaylistMetadataWithCommandCheck() {
        return isCommandAvailable(18) ? getPlaylistMetadata() : androidx.media3.common.MediaMetadata.EMPTY;
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getPreviousMediaItemIndex() {
        verifyApplicationThread();
        return super.getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public int getPreviousWindowIndex() {
        verifyApplicationThread();
        return super.getPreviousWindowIndex();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public int getRepeatMode() {
        verifyApplicationThread();
        return super.getRepeatMode();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return super.getSeekBackIncrement();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return super.getSeekForwardIncrement();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return super.getShuffleModeEnabled();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.util.Size getSurfaceSize() {
        verifyApplicationThread();
        return super.getSurfaceSize();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return super.getTotalBufferedDuration();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        return super.getTrackSelectionParameters();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public androidx.media3.common.VideoSize getVideoSize() {
        verifyApplicationThread();
        return super.getVideoSize();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
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

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean hasNextMediaItem() {
        verifyApplicationThread();
        return super.hasNextMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean hasPreviousMediaItem() {
        verifyApplicationThread();
        return super.hasPreviousMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        super.increaseDeviceVolume();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCommandAvailable(int i3) {
        verifyApplicationThread();
        return super.isCommandAvailable(i3);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCurrentMediaItemDynamic() {
        verifyApplicationThread();
        return super.isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCurrentMediaItemLive() {
        verifyApplicationThread();
        return super.isCurrentMediaItemLive();
    }

    public boolean isCurrentMediaItemLiveWithCommandCheck() {
        return isCommandAvailable(16) && isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isCurrentMediaItemSeekable() {
        verifyApplicationThread();
        return super.isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        return super.isDeviceMuted();
    }

    public boolean isDeviceMutedWithCommandCheck() {
        return isCommandAvailable(23) && isDeviceMuted();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isLoading() {
        verifyApplicationThread();
        return super.isLoading();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isPlaying() {
        verifyApplicationThread();
        return super.isPlaying();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return super.isPlayingAd();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void moveMediaItem(int i3, int i9) {
        verifyApplicationThread();
        super.moveMediaItem(i3, i9);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void moveMediaItems(int i3, int i9, int i10) {
        verifyApplicationThread();
        super.moveMediaItems(i3, i9, i10);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void mute() {
        verifyApplicationThread();
        super.mute();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void pause() {
        verifyApplicationThread();
        super.pause();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void play() {
        verifyApplicationThread();
        super.play();
    }

    public void playIfCommandAvailable() {
        if (isCommandAvailable(1)) {
            play();
        }
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void prepare() {
        verifyApplicationThread();
        super.prepare();
    }

    public void prepareIfCommandAvailable() {
        if (isCommandAvailable(2)) {
            prepare();
        }
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void release() {
        verifyApplicationThread();
        super.release();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void removeListener(androidx.media3.common.Player.Listener listener) {
        verifyApplicationThread();
        super.removeListener(listener);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void removeMediaItem(int i3) {
        verifyApplicationThread();
        super.removeMediaItem(i3);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void removeMediaItems(int i3, int i9) {
        verifyApplicationThread();
        super.removeMediaItems(i3, i9);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void replaceMediaItem(int i3, androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        super.replaceMediaItem(i3, mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void replaceMediaItems(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        super.replaceMediaItems(i3, i9, list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekBack() {
        verifyApplicationThread();
        super.seekBack();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekForward() {
        verifyApplicationThread();
        super.seekForward();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekTo(long j) {
        verifyApplicationThread();
        super.seekTo(j);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToDefaultPosition(int i3) {
        verifyApplicationThread();
        super.seekToDefaultPosition(i3);
    }

    public void seekToDefaultPositionIfCommandAvailable() {
        if (isCommandAvailable(4)) {
            seekToDefaultPosition();
        }
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToNext() {
        verifyApplicationThread();
        super.seekToNext();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToNextMediaItem() {
        verifyApplicationThread();
        super.seekToNextMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToPrevious() {
        verifyApplicationThread();
        super.seekToPrevious();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToPreviousMediaItem() {
        verifyApplicationThread();
        super.seekToPreviousMediaItem();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceMuted(boolean z6) {
        verifyApplicationThread();
        super.setDeviceMuted(z6);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceVolume(int i3) {
        verifyApplicationThread();
        super.setDeviceVolume(i3);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        super.setMediaItems(list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlayWhenReady(boolean z6) {
        verifyApplicationThread();
        super.setPlayWhenReady(z6);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        super.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlaybackSpeed(float f9) {
        verifyApplicationThread();
        super.setPlaybackSpeed(f9);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        super.setPlaylistMetadata(mediaMetadata);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setRepeatMode(int i3) {
        verifyApplicationThread();
        super.setRepeatMode(i3);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setShuffleModeEnabled(boolean z6) {
        verifyApplicationThread();
        super.setShuffleModeEnabled(z6);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        super.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        super.setVideoSurface(surface);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        super.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        super.setVideoSurfaceView(surfaceView);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        super.setVideoTextureView(textureView);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setVolume(float f9) {
        verifyApplicationThread();
        super.setVolume(f9);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void stop() {
        verifyApplicationThread();
        super.stop();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void unmute() {
        verifyApplicationThread();
        super.unmute();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItem(int i3, androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        super.addMediaItem(i3, mediaItem);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void addMediaItems(int i3, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        super.addMediaItems(i3, list);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void clearVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        super.clearVideoSurface(surface);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void decreaseDeviceVolume(int i3) {
        verifyApplicationThread();
        super.decreaseDeviceVolume(i3);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void increaseDeviceVolume(int i3) {
        verifyApplicationThread();
        super.increaseDeviceVolume(i3);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekTo(int i3, long j) {
        verifyApplicationThread();
        super.seekTo(i3, j);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void seekToDefaultPosition() {
        verifyApplicationThread();
        super.seekToDefaultPosition();
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setDeviceMuted(boolean z6, int i3) {
        verifyApplicationThread();
        super.setDeviceMuted(z6, i3);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setDeviceVolume(int i3, int i9) {
        verifyApplicationThread();
        super.setDeviceVolume(i3, i9);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem, j);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z6) {
        verifyApplicationThread();
        super.setMediaItems(list, z6);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z6) {
        verifyApplicationThread();
        super.setMediaItem(mediaItem, z6);
    }

    @Override // androidx.media3.common.ForwardingPlayer, androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i3, long j) {
        verifyApplicationThread();
        super.setMediaItems(list, i3, j);
    }
}
