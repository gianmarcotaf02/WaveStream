package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerTransferState {
    private final int currentMediaItemIndex;
    private final long currentPosition;
    private final p076i4.AbstractC2186b0 mediaItems;
    private final boolean playWhenReady;
    private final androidx.media3.common.PlaybackParameters playbackParameters;
    private final int repeatMode;
    private final boolean shuffleModeEnabled;
    private final androidx.media3.common.TrackSelectionParameters trackSelectionParameters;

    public static final class Builder {
        private int currentMediaItemIndex;
        private long currentPosition;
        private p076i4.AbstractC2186b0 mediaItems;
        private boolean playWhenReady;
        private androidx.media3.common.PlaybackParameters playbackParameters;
        private int repeatMode;
        private boolean shuffleModeEnabled;
        private androidx.media3.common.TrackSelectionParameters trackSelectionParameters;

        public androidx.media3.common.PlayerTransferState build() {
            return new androidx.media3.common.PlayerTransferState(this);
        }

        public androidx.media3.common.PlayerTransferState.Builder setCurrentMediaItemIndex(int i3) {
            this.currentMediaItemIndex = i3;
            return this;
        }

        public androidx.media3.common.PlayerTransferState.Builder setCurrentPosition(long j) {
            this.currentPosition = j;
            return this;
        }

        public androidx.media3.common.PlayerTransferState.Builder setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
            this.mediaItems = p076i4.AbstractC2186b0.u(list);
            return this;
        }

        public androidx.media3.common.PlayerTransferState.Builder setPlayWhenReady(boolean z6) {
            this.playWhenReady = z6;
            return this;
        }

        public androidx.media3.common.PlayerTransferState.Builder setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
            java.util.Objects.requireNonNull(playbackParameters);
            this.playbackParameters = playbackParameters;
            return this;
        }

        public androidx.media3.common.PlayerTransferState.Builder setRepeatMode(int i3) {
            this.repeatMode = i3;
            return this;
        }

        public androidx.media3.common.PlayerTransferState.Builder setShuffleModeEnabled(boolean z6) {
            this.shuffleModeEnabled = z6;
            return this;
        }

        public androidx.media3.common.PlayerTransferState.Builder setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            java.util.Objects.requireNonNull(trackSelectionParameters);
            this.trackSelectionParameters = trackSelectionParameters;
            return this;
        }

        public Builder() {
            this.playWhenReady = false;
            this.repeatMode = 0;
            this.shuffleModeEnabled = false;
            this.currentMediaItemIndex = 0;
            this.currentPosition = 0L;
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            this.mediaItems = p076i4.S0.f22832l;
            this.playbackParameters = androidx.media3.common.PlaybackParameters.DEFAULT;
            this.trackSelectionParameters = androidx.media3.common.TrackSelectionParameters.DEFAULT;
        }

        private Builder(androidx.media3.common.PlayerTransferState playerTransferState) {
            this.playWhenReady = playerTransferState.playWhenReady;
            this.repeatMode = playerTransferState.repeatMode;
            this.shuffleModeEnabled = playerTransferState.shuffleModeEnabled;
            this.currentMediaItemIndex = playerTransferState.currentMediaItemIndex;
            this.currentPosition = playerTransferState.currentPosition;
            this.mediaItems = playerTransferState.mediaItems;
            this.playbackParameters = playerTransferState.playbackParameters;
            this.trackSelectionParameters = playerTransferState.trackSelectionParameters;
        }
    }

    public static androidx.media3.common.PlayerTransferState.Builder builderFromPlayer(androidx.media3.common.Player player) {
        java.util.Objects.requireNonNull(player);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 < player.getMediaItemCount(); i3++) {
            arrayList.add(player.getMediaItemAt(i3));
        }
        return new androidx.media3.common.PlayerTransferState.Builder().setPlayWhenReady(player.getPlayWhenReady()).setRepeatMode(player.getRepeatMode()).setShuffleModeEnabled(player.getShuffleModeEnabled()).setCurrentMediaItemIndex(player.getCurrentMediaItemIndex()).setCurrentPosition(player.getCurrentPosition()).setMediaItems(arrayList).setPlaybackParameters(player.getPlaybackParameters()).setTrackSelectionParameters(player.getTrackSelectionParameters());
    }

    public static androidx.media3.common.PlayerTransferState fromPlayer(androidx.media3.common.Player player) {
        return builderFromPlayer(player).build();
    }

    public androidx.media3.common.PlayerTransferState.Builder buildUpon() {
        return new androidx.media3.common.PlayerTransferState.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && androidx.media3.common.PlayerTransferState.class == obj.getClass()) {
            androidx.media3.common.PlayerTransferState playerTransferState = (androidx.media3.common.PlayerTransferState) obj;
            if (this.playWhenReady == playerTransferState.playWhenReady && this.repeatMode == playerTransferState.repeatMode && this.shuffleModeEnabled == playerTransferState.shuffleModeEnabled && this.currentMediaItemIndex == playerTransferState.currentMediaItemIndex && this.currentPosition == playerTransferState.currentPosition && java.util.Objects.equals(this.mediaItems, playerTransferState.mediaItems) && java.util.Objects.equals(this.playbackParameters, playerTransferState.playbackParameters) && java.util.Objects.equals(this.trackSelectionParameters, playerTransferState.trackSelectionParameters)) {
                return true;
            }
        }
        return false;
    }

    public int getCurrentMediaItemIndex() {
        return this.currentMediaItemIndex;
    }

    public long getCurrentPosition() {
        return this.currentPosition;
    }

    public p076i4.AbstractC2186b0 getMediaItems() {
        return this.mediaItems;
    }

    public boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public boolean getShuffleModeEnabled() {
        return this.shuffleModeEnabled;
    }

    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        return this.trackSelectionParameters;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Boolean.valueOf(this.playWhenReady), java.lang.Integer.valueOf(this.repeatMode), java.lang.Boolean.valueOf(this.shuffleModeEnabled), java.lang.Integer.valueOf(this.currentMediaItemIndex), java.lang.Long.valueOf(this.currentPosition), this.mediaItems, this.playbackParameters, this.trackSelectionParameters);
    }

    public void setToPlayer(androidx.media3.common.Player player) {
        java.util.Objects.requireNonNull(player);
        if (player.getAvailableCommands().contains(1)) {
            player.setPlayWhenReady(this.playWhenReady);
        }
        if (player.getAvailableCommands().contains(15)) {
            player.setRepeatMode(this.repeatMode);
        }
        if (player.getAvailableCommands().contains(14)) {
            player.setShuffleModeEnabled(this.shuffleModeEnabled);
        }
        if (player.getAvailableCommands().contains(31)) {
            player.setMediaItems(this.mediaItems, this.currentMediaItemIndex, this.currentPosition);
        }
        if (player.getAvailableCommands().contains(13)) {
            player.setPlaybackParameters(this.playbackParameters);
        }
        if (player.getAvailableCommands().contains(29)) {
            player.setTrackSelectionParameters(this.trackSelectionParameters);
        }
    }

    private PlayerTransferState(androidx.media3.common.PlayerTransferState.Builder builder) {
        this.playWhenReady = builder.playWhenReady;
        this.repeatMode = builder.repeatMode;
        this.shuffleModeEnabled = builder.shuffleModeEnabled;
        this.currentMediaItemIndex = builder.currentMediaItemIndex;
        this.currentPosition = builder.currentPosition;
        this.mediaItems = builder.mediaItems;
        this.playbackParameters = builder.playbackParameters;
        this.trackSelectionParameters = builder.trackSelectionParameters;
    }
}
