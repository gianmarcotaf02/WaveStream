package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock
public class MediaController implements androidx.media3.common.Player {
    protected static final long DEFAULT_PLATFORM_CALLBACK_AGGREGATION_TIMEOUT_MS = 100;
    public static final java.lang.String KEY_MEDIA_NOTIFICATION_CONTROLLER_FLAG = "androidx.media3.session.MediaNotificationManager";
    public static final long RELEASE_UNBIND_TIMEOUT_MS = 30000;
    private static final java.lang.String TAG = "MediaController";
    private static final java.lang.String WRONG_THREAD_ERROR_MESSAGE = "MediaController method is called from a wrong thread. See javadoc of MediaController for details.";
    final android.os.Handler applicationHandler;
    final androidx.media3.session.MediaController.ConnectionCallback connectionCallback;
    private boolean connectionNotified;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final androidx.media3.session.MediaController.MediaControllerImpl impl;
    final androidx.media3.session.MediaController.Listener listener;
    private final int maxCommandsForMediaItems;
    private boolean released;
    private long timeDiffMs;
    private final androidx.media3.common.Timeline.Window window;

    public static final class Builder {
        private boolean allowDeviceVolumeCommandsForLocalPlayback;
        private android.os.Looper applicationLooper;
        private androidx.media3.common.util.BitmapLoader bitmapLoader;
        private android.os.Bundle connectionHints;
        private final android.content.Context context;
        private androidx.media3.session.MediaController.Listener listener;
        private int maxCommandsForMediaItems;
        private long platformSessionCallbackAggregationTimeoutMs;
        private final androidx.media3.session.SessionToken token;

        public Builder(android.content.Context context, androidx.media3.session.SessionToken sessionToken) {
            context.getClass();
            this.context = context;
            sessionToken.getClass();
            this.token = sessionToken;
            this.connectionHints = android.os.Bundle.EMPTY;
            this.listener = new androidx.media3.session.MediaController.Listener() { // from class: androidx.media3.session.MediaController.Builder.1
            };
            this.applicationLooper = androidx.media3.common.util.Util.getCurrentOrMainLooper();
            this.platformSessionCallbackAggregationTimeoutMs = 100L;
        }

        public com.google.common.util.concurrent.J buildAsync() {
            androidx.media3.session.MediaControllerHolder mediaControllerHolder = new androidx.media3.session.MediaControllerHolder(this.applicationLooper);
            if (this.token.isLegacySession() && this.bitmapLoader == null) {
                this.bitmapLoader = new androidx.media3.session.CacheBitmapLoader(new androidx.media3.datasource.DataSourceBitmapLoader.Builder(this.context).build());
            }
            androidx.media3.common.util.Util.postOrRun(new android.os.Handler(this.applicationLooper), new androidx.media3.session.RunnableC1589l(mediaControllerHolder, new androidx.media3.session.MediaController(this.context, this.token, this.connectionHints, this.listener, this.applicationLooper, mediaControllerHolder, this.bitmapLoader, this.maxCommandsForMediaItems, this.platformSessionCallbackAggregationTimeoutMs, this.allowDeviceVolumeCommandsForLocalPlayback), 0));
            return mediaControllerHolder;
        }

        public androidx.media3.session.MediaController.Builder experimentalSetPlatformSessionCallbackAggregationTimeoutMs(long j) {
            this.platformSessionCallbackAggregationTimeoutMs = j;
            return this;
        }

        public androidx.media3.session.MediaController.Builder setAllowDeviceVolumeCommandsForLocalPlayback(boolean z6) {
            this.allowDeviceVolumeCommandsForLocalPlayback = z6;
            return this;
        }

        public androidx.media3.session.MediaController.Builder setApplicationLooper(android.os.Looper looper) {
            looper.getClass();
            this.applicationLooper = looper;
            return this;
        }

        public androidx.media3.session.MediaController.Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            bitmapLoader.getClass();
            this.bitmapLoader = bitmapLoader;
            return this;
        }

        public androidx.media3.session.MediaController.Builder setConnectionHints(android.os.Bundle bundle) {
            bundle.getClass();
            this.connectionHints = new android.os.Bundle(bundle);
            return this;
        }

        public androidx.media3.session.MediaController.Builder setListener(androidx.media3.session.MediaController.Listener listener) {
            listener.getClass();
            this.listener = listener;
            return this;
        }

        public androidx.media3.session.MediaController.Builder setMaxCommandsForMediaItems(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            this.maxCommandsForMediaItems = i3;
            return this;
        }
    }

    public interface ConnectionCallback {
        void onAccepted();

        void onRejected();
    }

    public interface Listener {
        default void onAvailableSessionCommandsChanged(androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionCommands sessionCommands) {
        }

        default com.google.common.util.concurrent.J onCustomCommand(androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
            return com.google.common.util.concurrent.D.z(new androidx.media3.session.SessionResult(-6));
        }

        default void onCustomLayoutChanged(androidx.media3.session.MediaController mediaController, java.util.List<androidx.media3.session.CommandButton> list) {
        }

        default void onDisconnected(androidx.media3.session.MediaController mediaController) {
        }

        default void onError(androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionError sessionError) {
        }

        default void onExtrasChanged(androidx.media3.session.MediaController mediaController, android.os.Bundle bundle) {
        }

        default void onMediaButtonPreferencesChanged(androidx.media3.session.MediaController mediaController, java.util.List<androidx.media3.session.CommandButton> list) {
        }

        default void onSessionActivityChanged(androidx.media3.session.MediaController mediaController, android.app.PendingIntent pendingIntent) {
        }

        default com.google.common.util.concurrent.J onSetCustomLayout(androidx.media3.session.MediaController mediaController, java.util.List<androidx.media3.session.CommandButton> list) {
            return com.google.common.util.concurrent.D.z(new androidx.media3.session.SessionResult(-6));
        }
    }

    public interface MediaControllerImpl {
        void addListener(androidx.media3.common.Player.Listener listener);

        void addMediaItem(int i3, androidx.media3.common.MediaItem mediaItem);

        void addMediaItem(androidx.media3.common.MediaItem mediaItem);

        void addMediaItems(int i3, java.util.List<androidx.media3.common.MediaItem> list);

        void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list);

        void clearMediaItems();

        void clearVideoSurface();

        void clearVideoSurface(android.view.Surface surface);

        void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

        void clearVideoSurfaceView(android.view.SurfaceView surfaceView);

        void clearVideoTextureView(android.view.TextureView textureView);

        void connect();

        void decreaseDeviceVolume();

        void decreaseDeviceVolume(int i3);

        androidx.media3.common.AudioAttributes getAudioAttributes();

        int getAudioSessionId();

        androidx.media3.common.Player.Commands getAvailableCommands();

        androidx.media3.session.SessionCommands getAvailableSessionCommands();

        androidx.media3.session.IMediaController getBinder();

        androidx.media3.session.legacy.MediaBrowserCompat getBrowserCompat();

        int getBufferedPercentage();

        long getBufferedPosition();

        p076i4.AbstractC2186b0 getCommandButtonsForMediaItem(androidx.media3.common.MediaItem mediaItem);

        androidx.media3.session.SessionToken getConnectedToken();

        android.os.Bundle getConnectionHints();

        long getContentBufferedPosition();

        long getContentDuration();

        long getContentPosition();

        android.content.Context getContext();

        int getCurrentAdGroupIndex();

        int getCurrentAdIndexInAdGroup();

        androidx.media3.common.text.CueGroup getCurrentCues();

        long getCurrentLiveOffset();

        int getCurrentMediaItemIndex();

        int getCurrentPeriodIndex();

        long getCurrentPosition();

        androidx.media3.common.Timeline getCurrentTimeline();

        androidx.media3.common.Tracks getCurrentTracks();

        p076i4.AbstractC2186b0 getCustomLayout();

        androidx.media3.common.DeviceInfo getDeviceInfo();

        int getDeviceVolume();

        long getDuration();

        long getMaxSeekToPreviousPosition();

        p076i4.AbstractC2186b0 getMediaButtonPreferences();

        androidx.media3.common.MediaMetadata getMediaMetadata();

        int getNextMediaItemIndex();

        boolean getPlayWhenReady();

        androidx.media3.common.PlaybackParameters getPlaybackParameters();

        int getPlaybackState();

        int getPlaybackSuppressionReason();

        androidx.media3.common.PlaybackException getPlayerError();

        androidx.media3.common.MediaMetadata getPlaylistMetadata();

        int getPreviousMediaItemIndex();

        int getRepeatMode();

        long getSeekBackIncrement();

        long getSeekForwardIncrement();

        android.app.PendingIntent getSessionActivity();

        android.os.Bundle getSessionExtras();

        boolean getShuffleModeEnabled();

        androidx.media3.common.util.Size getSurfaceSize();

        long getTotalBufferedDuration();

        androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters();

        androidx.media3.common.VideoSize getVideoSize();

        float getVolume();

        boolean hasNextMediaItem();

        boolean hasPreviousMediaItem();

        void increaseDeviceVolume();

        void increaseDeviceVolume(int i3);

        boolean isConnected();

        boolean isDeviceMuted();

        boolean isLoading();

        boolean isPlaying();

        boolean isPlayingAd();

        void moveMediaItem(int i3, int i9);

        void moveMediaItems(int i3, int i9, int i10);

        void mute();

        void pause();

        void play();

        void prepare();

        void release();

        void removeListener(androidx.media3.common.Player.Listener listener);

        void removeMediaItem(int i3);

        void removeMediaItems(int i3, int i9);

        void replaceMediaItem(int i3, androidx.media3.common.MediaItem mediaItem);

        void replaceMediaItems(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list);

        void seekBack();

        void seekForward();

        void seekTo(int i3, long j);

        void seekTo(long j);

        void seekToDefaultPosition();

        void seekToDefaultPosition(int i3);

        void seekToNext();

        void seekToNextMediaItem();

        void seekToPrevious();

        void seekToPreviousMediaItem();

        com.google.common.util.concurrent.J sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle);

        com.google.common.util.concurrent.J sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, androidx.media3.session.MediaController.ProgressListener progressListener);

        void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z6);

        void setDeviceMuted(boolean z6);

        void setDeviceMuted(boolean z6, int i3);

        void setDeviceVolume(int i3);

        void setDeviceVolume(int i3, int i9);

        void setMediaItem(androidx.media3.common.MediaItem mediaItem);

        void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j);

        void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z6);

        void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list);

        void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i3, long j);

        void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z6);

        void setPlayWhenReady(boolean z6);

        void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters);

        void setPlaybackSpeed(float f9);

        void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata);

        com.google.common.util.concurrent.J setRating(androidx.media3.common.Rating rating);

        com.google.common.util.concurrent.J setRating(java.lang.String str, androidx.media3.common.Rating rating);

        void setRepeatMode(int i3);

        void setShuffleModeEnabled(boolean z6);

        void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters);

        void setVideoSurface(android.view.Surface surface);

        void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

        void setVideoSurfaceView(android.view.SurfaceView surfaceView);

        void setVideoTextureView(android.view.TextureView textureView);

        void setVolume(float f9);

        void stop();

        void unmute();
    }

    public interface ProgressListener {
        void onProgress(androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, android.os.Bundle bundle2);
    }

    public MediaController(android.content.Context context, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, androidx.media3.session.MediaController.Listener listener, android.os.Looper looper, androidx.media3.session.MediaController.ConnectionCallback connectionCallback, androidx.media3.common.util.BitmapLoader bitmapLoader, int i3, long j, boolean z6) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(context, "context must not be null");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(sessionToken, "token must not be null");
        androidx.media3.common.util.Log.i(TAG, "Init " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + "]");
        this.window = new androidx.media3.common.Timeline.Window();
        this.timeDiffMs = androidx.media3.common.C.TIME_UNSET;
        this.listener = listener;
        this.applicationHandler = new android.os.Handler(looper);
        this.connectionCallback = connectionCallback;
        this.maxCommandsForMediaItems = i3;
        androidx.media3.session.MediaController.MediaControllerImpl mediaControllerImplCreateImpl = createImpl(context, sessionToken, bundle, looper, bitmapLoader, j, z6);
        this.impl = mediaControllerImplCreateImpl;
        mediaControllerImplCreateImpl.connect();
    }

    private static com.google.common.util.concurrent.J createDisconnectedFuture() {
        return com.google.common.util.concurrent.D.z(new androidx.media3.session.SessionResult(-100));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$0(androidx.media3.session.MediaController.Listener listener) {
        listener.onDisconnected(this);
    }

    public static void releaseFuture(java.util.concurrent.Future<? extends androidx.media3.session.MediaController> future) {
        if (future.cancel(false)) {
            return;
        }
        try {
            ((androidx.media3.session.MediaController) com.google.common.util.concurrent.D.u(future)).release();
        } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e6) {
            androidx.media3.common.util.Log.w(TAG, "MediaController future failed (so we couldn't release it)", e6);
        }
    }

    private void verifyApplicationThread() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(android.os.Looper.myLooper() == getApplicationLooper(), WRONG_THREAD_ERROR_MESSAGE);
    }

    @Override // androidx.media3.common.Player
    public final void addListener(androidx.media3.common.Player.Listener listener) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(listener, "listener must not be null");
        this.impl.addListener(listener);
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItem(androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.addMediaItem(mediaItem);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring addMediaItem().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.addMediaItems(list);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean canAdvertiseSession() {
        return false;
    }

    @Override // androidx.media3.common.Player
    public final void clearMediaItems() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.clearMediaItems();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.clearVideoSurface();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurface().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.clearVideoSurfaceHolder(surfaceHolder);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurfaceHolder().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.clearVideoSurfaceView(surfaceView);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurfaceView().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.clearVideoTextureView(textureView);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearVideoTextureView().");
        }
    }

    public androidx.media3.session.MediaController.MediaControllerImpl createImpl(android.content.Context context, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, android.os.Looper looper, androidx.media3.common.util.BitmapLoader bitmapLoader, long j, boolean z6) {
        if (!sessionToken.isLegacySession()) {
            return new androidx.media3.session.MediaControllerImplBase(context, this, sessionToken, bundle, looper, z6);
        }
        bitmapLoader.getClass();
        return new androidx.media3.session.MediaControllerImplLegacy(context, this, sessionToken, bundle, looper, bitmapLoader, j);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.decreaseDeviceVolume();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // androidx.media3.common.Player
    public final android.os.Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return !isConnected() ? androidx.media3.common.AudioAttributes.DEFAULT : this.impl.getAudioAttributes();
    }

    @Override // androidx.media3.common.Player
    public final int getAudioSessionId() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getAudioSessionId();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return !isConnected() ? androidx.media3.common.Player.Commands.EMPTY : this.impl.getAvailableCommands();
    }

    public final androidx.media3.session.SessionCommands getAvailableSessionCommands() {
        verifyApplicationThread();
        return !isConnected() ? androidx.media3.session.SessionCommands.EMPTY : this.impl.getAvailableSessionCommands();
    }

    public final androidx.media3.session.IMediaController getBinder() {
        return this.impl.getBinder();
    }

    @Override // androidx.media3.common.Player
    public final int getBufferedPercentage() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getBufferedPercentage();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public final long getBufferedPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getBufferedPosition();
        }
        return 0L;
    }

    public final p076i4.AbstractC2186b0 getCommandButtonsForMediaItem(androidx.media3.common.MediaItem mediaItem) {
        return this.impl.getCommandButtonsForMediaItem(mediaItem);
    }

    public final androidx.media3.session.SessionToken getConnectedToken() {
        if (isConnected()) {
            return this.impl.getConnectedToken();
        }
        return null;
    }

    public android.os.Bundle getConnectionHints() {
        return this.impl.getConnectionHints();
    }

    @Override // androidx.media3.common.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getContentBufferedPosition();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final long getContentDuration() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getContentDuration() : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getContentPosition();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentAdGroupIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentAdIndexInAdGroup();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.text.CueGroup getCurrentCues() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentCues() : androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentLiveOffset() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentLiveOffset() : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.common.Player
    public final java.lang.Object getCurrentManifest() {
        return null;
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
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentMediaItemIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentPeriodIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentPosition();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentTimeline() : androidx.media3.common.Timeline.EMPTY;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.Tracks getCurrentTracks() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentTracks() : androidx.media3.common.Tracks.EMPTY;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    public final p076i4.AbstractC2186b0 getCustomLayout() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCustomLayout();
        }
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return !isConnected() ? androidx.media3.common.DeviceInfo.UNKNOWN : this.impl.getDeviceInfo();
    }

    @Override // androidx.media3.common.Player
    public final int getDeviceVolume() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getDeviceVolume();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getDuration() : androidx.media3.common.C.TIME_UNSET;
    }

    public int getMaxCommandsForMediaItems() {
        return this.maxCommandsForMediaItems;
    }

    @Override // androidx.media3.common.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getMaxSeekToPreviousPosition();
        }
        return 0L;
    }

    public final p076i4.AbstractC2186b0 getMediaButtonPreferences() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getMediaButtonPreferences();
        }
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
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
    public final androidx.media3.common.MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getMediaMetadata() : androidx.media3.common.MediaMetadata.EMPTY;
    }

    @Override // androidx.media3.common.Player
    public final int getNextMediaItemIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getNextMediaItemIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThread();
        return isConnected() && this.impl.getPlayWhenReady();
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getPlaybackParameters() : androidx.media3.common.PlaybackParameters.DEFAULT;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPlaybackState();
        }
        return 1;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPlaybackSuppressionReason();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.PlaybackException getPlayerError() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPlayerError();
        }
        return null;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getPlaylistMetadata() : androidx.media3.common.MediaMetadata.EMPTY;
    }

    @Override // androidx.media3.common.Player
    public final int getPreviousMediaItemIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPreviousMediaItemIndex();
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getRepeatMode();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getSeekBackIncrement();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getSeekForwardIncrement();
        }
        return 0L;
    }

    public final android.app.PendingIntent getSessionActivity() {
        if (isConnected()) {
            return this.impl.getSessionActivity();
        }
        return null;
    }

    public final android.os.Bundle getSessionExtras() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getSessionExtras() : android.os.Bundle.EMPTY;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return isConnected() && this.impl.getShuffleModeEnabled();
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.util.Size getSurfaceSize() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getSurfaceSize() : androidx.media3.common.util.Size.UNKNOWN;
    }

    public final long getTimeDiffMs() {
        return this.timeDiffMs;
    }

    @Override // androidx.media3.common.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getTotalBufferedDuration();
        }
        return 0L;
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        return !isConnected() ? androidx.media3.common.TrackSelectionParameters.DEFAULT : this.impl.getTrackSelectionParameters();
    }

    @Override // androidx.media3.common.Player
    public final androidx.media3.common.VideoSize getVideoSize() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getVideoSize() : androidx.media3.common.VideoSize.UNKNOWN;
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getVolume();
        }
        return 1.0f;
    }

    @Override // androidx.media3.common.Player
    public final boolean hasNextMediaItem() {
        verifyApplicationThread();
        return isConnected() && this.impl.hasNextMediaItem();
    }

    @Override // androidx.media3.common.Player
    public final boolean hasPreviousMediaItem() {
        verifyApplicationThread();
        return isConnected() && this.impl.hasPreviousMediaItem();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.increaseDeviceVolume();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean isCommandAvailable(int i3) {
        return getAvailableCommands().contains(i3);
    }

    public final boolean isConnected() {
        return this.impl.isConnected();
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemDynamic() {
        verifyApplicationThread();
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isDynamic;
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemLive() {
        verifyApplicationThread();
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isLive();
    }

    @Override // androidx.media3.common.Player
    public final boolean isCurrentMediaItemSeekable() {
        verifyApplicationThread();
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
    public final boolean isDeviceMuted() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.isDeviceMuted();
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    public final boolean isLoading() {
        verifyApplicationThread();
        return isConnected() && this.impl.isLoading();
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlaying() {
        verifyApplicationThread();
        return isConnected() && this.impl.isPlaying();
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        verifyApplicationThread();
        return isConnected() && this.impl.isPlayingAd();
    }

    public final boolean isSessionCommandAvailable(int i3) {
        return getAvailableSessionCommands().contains(i3);
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItem(int i3, int i9) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.moveMediaItem(i3, i9);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItems(int i3, int i9, int i10) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.moveMediaItems(i3, i9, i10);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void mute() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.mute();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring mute().");
        }
    }

    public final void notifyAccepted() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(android.os.Looper.myLooper() == getApplicationLooper());
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.connectionNotified);
        this.connectionNotified = true;
        this.connectionCallback.onAccepted();
    }

    public final void notifyControllerListener(androidx.media3.common.util.Consumer<androidx.media3.session.MediaController.Listener> consumer) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(android.os.Looper.myLooper() == getApplicationLooper());
        consumer.accept(this.listener);
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.pause();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring pause().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void play() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.play();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring play().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.prepare();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        verifyApplicationThread();
        if (this.released) {
            return;
        }
        androidx.media3.common.util.Log.i(TAG, "Release " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + "] [" + androidx.media3.common.MediaLibraryInfo.registeredModules() + "]");
        this.released = true;
        this.applicationHandler.removeCallbacksAndMessages(null);
        try {
            this.impl.release();
        } catch (java.lang.Exception e6) {
            androidx.media3.common.util.Log.d(TAG, "Exception while releasing impl", e6);
        }
        if (this.connectionNotified) {
            notifyControllerListener(new androidx.media3.session.C1588k0(9, this));
        } else {
            this.connectionNotified = true;
            this.connectionCallback.onRejected();
        }
    }

    @Override // androidx.media3.common.Player
    public final void removeListener(androidx.media3.common.Player.Listener listener) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(listener, "listener must not be null");
        this.impl.removeListener(listener);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItem(int i3) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.removeMediaItem(i3);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItems(int i3, int i9) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.removeMediaItems(i3, i9);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItem(int i3, androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.replaceMediaItem(i3, mediaItem);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItems(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.replaceMediaItems(i3, i9, list);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    public final void runOnApplicationLooper(java.lang.Runnable runnable) {
        androidx.media3.common.util.Util.postOrRun(this.applicationHandler, runnable);
    }

    @Override // androidx.media3.common.Player
    public final void seekBack() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekBack();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekForward() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekForward();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(long j) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekTo(j);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekToDefaultPosition();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToNext() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekToNext();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToNextMediaItem() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekToNextMediaItem();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToPrevious() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekToPrevious();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToPreviousMediaItem() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekToPreviousMediaItem();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    public final com.google.common.util.concurrent.J sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(sessionCommand, "command must not be null");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(sessionCommand.commandCode == 0, "command must be a custom command");
        return isConnected() ? this.impl.sendCustomCommand(sessionCommand, bundle) : createDisconnectedFuture();
    }

    @Override // androidx.media3.common.Player
    public final void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z6) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setAudioAttributes(audioAttributes, z6);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void setDeviceMuted(boolean z6) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setDeviceMuted(z6);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public final void setDeviceVolume(int i3) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setDeviceVolume(i3);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(mediaItem, "mediaItems must not be null");
        if (isConnected()) {
            this.impl.setMediaItem(mediaItem);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(list, "mediaItems must not be null");
        for (int i3 = 0; i3 < list.size(); i3++) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.J(i3, "items must not contain null, index=%s", list.get(i3) != null);
        }
        if (isConnected()) {
            this.impl.setMediaItems(list);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(boolean z6) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setPlayWhenReady(z6);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(playbackParameters, "playbackParameters must not be null");
        if (isConnected()) {
            this.impl.setPlaybackParameters(playbackParameters);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackSpeed(float f9) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setPlaybackSpeed(f9);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(mediaMetadata, "playlistMetadata must not be null");
        if (isConnected()) {
            this.impl.setPlaylistMetadata(mediaMetadata);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    public final com.google.common.util.concurrent.J setRating(java.lang.String str, androidx.media3.common.Rating rating) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(str, "mediaId must not be null");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(!android.text.TextUtils.isEmpty(str), "mediaId must not be empty");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(rating, "rating must not be null");
        return isConnected() ? this.impl.setRating(str, rating) : createDisconnectedFuture();
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(int i3) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setRepeatMode(i3);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(boolean z6) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setShuffleModeEnabled(z6);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    public final void setTimeDiffMs(long j) {
        verifyApplicationThread();
        this.timeDiffMs = j;
    }

    @Override // androidx.media3.common.Player
    public final void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        this.impl.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setVideoSurface(surface);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setVideoSurface().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setVideoSurfaceHolder(surfaceHolder);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setVideoSurfaceHolder().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setVideoSurfaceView(surfaceView);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setVideoSurfaceView().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setVideoTextureView(textureView);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setVideoTextureView().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(float f9) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(f9 >= 0.0f && f9 <= 1.0f, "volume must be between 0 and 1");
        if (isConnected()) {
            this.impl.setVolume(f9);
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.stop();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring stop().");
        }
    }

    @Override // androidx.media3.common.Player
    public final void unmute() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.unmute();
        } else {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring unmute().");
        }
    }

    public final boolean isSessionCommandAvailable(androidx.media3.session.SessionCommand sessionCommand) {
        return getAvailableSessionCommands().contains(sessionCommand);
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItem(int i3, androidx.media3.common.MediaItem mediaItem) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring addMediaItem().");
        } else {
            this.impl.addMediaItem(i3, mediaItem);
        }
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(int i3, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring addMediaItems().");
        } else {
            this.impl.addMediaItems(i3, list);
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurface().");
        } else {
            this.impl.clearVideoSurface(surface);
        }
    }

    @Override // androidx.media3.common.Player
    public final void decreaseDeviceVolume(int i3) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring decreaseDeviceVolume().");
        } else {
            this.impl.decreaseDeviceVolume(i3);
        }
    }

    @Override // androidx.media3.common.Player
    public final void increaseDeviceVolume(int i3) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring increaseDeviceVolume().");
        } else {
            this.impl.increaseDeviceVolume(i3);
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(int i3, long j) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        } else {
            this.impl.seekTo(i3, j);
        }
    }

    @Override // androidx.media3.common.Player
    public final void seekToDefaultPosition(int i3) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        } else {
            this.impl.seekToDefaultPosition(i3);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceMuted(boolean z6, int i3) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setDeviceMuted().");
        } else {
            this.impl.setDeviceMuted(z6, i3);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceVolume(int i3, int i9) {
        verifyApplicationThread();
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setDeviceVolume().");
        } else {
            this.impl.setDeviceVolume(i3, i9);
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem, long j) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(mediaItem, "mediaItems must not be null");
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItem().");
        } else {
            this.impl.setMediaItem(mediaItem, j);
        }
    }

    public final com.google.common.util.concurrent.J sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, androidx.media3.session.MediaController.ProgressListener progressListener) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(sessionCommand, "command must not be null");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(sessionCommand.commandCode == 0, "command must be a custom command");
        if (isConnected()) {
            return this.impl.sendCustomCommand(sessionCommand, bundle, progressListener);
        }
        return createDisconnectedFuture();
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z6) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(list, "mediaItems must not be null");
        for (int i3 = 0; i3 < list.size(); i3++) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.J(i3, "items must not contain null, index=%s", list.get(i3) != null);
        }
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        } else {
            this.impl.setMediaItems(list, z6);
        }
    }

    public final com.google.common.util.concurrent.J setRating(androidx.media3.common.Rating rating) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(rating, "rating must not be null");
        if (isConnected()) {
            return this.impl.setRating(rating);
        }
        return createDisconnectedFuture();
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z6) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(mediaItem, "mediaItems must not be null");
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        } else {
            this.impl.setMediaItem(mediaItem, z6);
        }
    }

    public final com.google.common.util.concurrent.J sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, androidx.media3.common.MediaItem mediaItem, android.os.Bundle bundle) {
        return sendCustomCommand(sessionCommand, mediaItem, bundle, null);
    }

    public final com.google.common.util.concurrent.J sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, androidx.media3.common.MediaItem mediaItem, android.os.Bundle bundle, androidx.media3.session.MediaController.ProgressListener progressListener) {
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        bundle2.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_MEDIA_ITEM_ID", mediaItem.mediaId);
        return sendCustomCommand(sessionCommand, bundle2, progressListener);
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i3, long j) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(list, "mediaItems must not be null");
        for (int i9 = 0; i9 < list.size(); i9++) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.J(i9, "items must not contain null, index=%s", list.get(i9) != null);
        }
        if (!isConnected()) {
            androidx.media3.common.util.Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        } else {
            this.impl.setMediaItems(list, i3, j);
        }
    }
}
