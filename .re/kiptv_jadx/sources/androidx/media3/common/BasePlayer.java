package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePlayer implements androidx.media3.common.Player {
    protected final androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();

    private int getRepeatModeForNavigation() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    private void ignoreSeek(int i3) {
        seekTo(-1, androidx.media3.common.C.TIME_UNSET, i3, false);
    }

    private void repeatCurrentMediaItem(int i3) {
        seekTo(getCurrentMediaItemIndex(), androidx.media3.common.C.TIME_UNSET, i3, true);
    }

    private void seekToCurrentItem(long j, int i3) {
        seekTo(getCurrentMediaItemIndex(), j, i3, false);
    }

    private void seekToDefaultPositionInternal(int i3, int i9) {
        seekTo(i3, androidx.media3.common.C.TIME_UNSET, i9, false);
    }

    private void seekToNextMediaItemInternal(int i3) {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            ignoreSeek(i3);
        } else if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            repeatCurrentMediaItem(i3);
        } else {
            seekToDefaultPositionInternal(nextMediaItemIndex, i3);
        }
    }

    private void seekToOffset(long j, int i3) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != androidx.media3.common.C.TIME_UNSET) {
            currentPosition = java.lang.Math.min(currentPosition, duration);
        }
        seekToCurrentItem(java.lang.Math.max(currentPosition, 0L), i3);
    }

    private void seekToPreviousMediaItemInternal(int i3) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            ignoreSeek(i3);
        } else if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            repeatCurrentMediaItem(i3);
        } else {
            seekToDefaultPositionInternal(previousMediaItemIndex, i3);
        }
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItem(int i3, androidx.media3.common.MediaItem mediaItem) {
        addMediaItems(i3, p076i4.AbstractC2186b0.y(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        addMediaItems(androidx.media3.common.util.Log.LOG_LEVEL_OFF, list);
    }

    @Override // androidx.media3.common.Player
    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // androidx.media3.common.Player
    public final void clearMediaItems() {
        removeMediaItems(0, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
    }

    @Override // androidx.media3.common.Player
    public final int getBufferedPercentage() {
        if (!isCommandAvailable(16)) {
            return 0;
        }
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == androidx.media3.common.C.TIME_UNSET || duration == androidx.media3.common.C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return androidx.media3.common.util.Util.constrainValue(androidx.media3.common.util.Util.percentInt(bufferedPosition, duration), 0, 100);
    }

    @Override // androidx.media3.common.Player
    public final long getContentDuration() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return currentTimeline.isEmpty() ? androidx.media3.common.C.TIME_UNSET : currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentLiveOffset() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return (currentTimeline.isEmpty() || currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).windowStartTimeMs == androidx.media3.common.C.TIME_UNSET) ? androidx.media3.common.C.TIME_UNSET : (this.window.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public final java.lang.Object getCurrentManifest() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).manifest;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaItem getCurrentMediaItem() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaItem getMediaItemAt(int i3) {
        return getCurrentTimeline().getWindow(i3, this.window).mediaItem;
    }

    @Override // androidx.media3.common.Player
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override // androidx.media3.common.Player
    public final int getNextMediaItemIndex() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getNextWindowIndex(getCurrentMediaItemIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final int getPreviousMediaItemIndex() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -1;
        }
        return currentTimeline.getPreviousWindowIndex(getCurrentMediaItemIndex(), getRepeatModeForNavigation(), getShuffleModeEnabled());
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // androidx.media3.common.Player
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // androidx.media3.common.Player
    public final boolean isCommandAvailable(int i3) {
        return getAvailableCommands().contains(i3);
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemDynamic() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isDynamic;
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemLive() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isLive();
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemSeekable() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isSeekable;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItem(int i3, int i9) {
        if (i3 != i9) {
            moveMediaItems(i3, i3 + 1, i9);
        }
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // androidx.media3.common.Player
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItem(int i3) {
        removeMediaItems(i3, i3 + 1);
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItem(int i3, androidx.media3.common.MediaItem mediaItem) {
        replaceMediaItems(i3, i3 + 1, p076i4.AbstractC2186b0.y(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void seekBack() {
        seekToOffset(-getSeekBackIncrement(), 11);
    }

    @Override // androidx.media3.common.Player
    public final void seekForward() {
        seekToOffset(getSeekForwardIncrement(), 12);
    }

    public abstract void seekTo(int i3, long j, int i9, boolean z6);

    @Override // androidx.media3.common.Player
    public final void seekTo(long j) {
        seekToCurrentItem(j, 5);
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition() {
        seekToDefaultPositionInternal(getCurrentMediaItemIndex(), 4);
    }

    @Override // androidx.media3.common.Player
    public final void seekToNext() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            ignoreSeek(9);
            return;
        }
        if (hasNextMediaItem()) {
            seekToNextMediaItemInternal(9);
        } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
            seekToDefaultPositionInternal(getCurrentMediaItemIndex(), 9);
        } else {
            ignoreSeek(9);
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToNextMediaItem() {
        seekToNextMediaItemInternal(8);
    }

    @Override // androidx.media3.common.Player
    public final void seekToPrevious() {
        if (getCurrentTimeline().isEmpty() || isPlayingAd()) {
            ignoreSeek(7);
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                seekToPreviousMediaItemInternal(7);
                return;
            } else {
                ignoreSeek(7);
                return;
            }
        }
        if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            seekToCurrentItem(0L, 7);
        } else {
            seekToPreviousMediaItemInternal(7);
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToPreviousMediaItem() {
        seekToPreviousMediaItemInternal(6);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem) {
        setMediaItems(p076i4.AbstractC2186b0.y(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        setMediaItems(list, true);
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackSpeed(float f9) {
        setPlaybackParameters(getPlaybackParameters().withSpeed(f9));
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItem(androidx.media3.common.MediaItem mediaItem) {
        addMediaItems(p076i4.AbstractC2186b0.y(mediaItem));
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(int i3, long j) {
        seekTo(i3, j, 10, false);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j) {
        setMediaItems(p076i4.AbstractC2186b0.y(mediaItem), 0, j);
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition(int i3) {
        seekToDefaultPositionInternal(i3, 10);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z6) {
        setMediaItems(p076i4.AbstractC2186b0.y(mediaItem), z6);
    }
}
