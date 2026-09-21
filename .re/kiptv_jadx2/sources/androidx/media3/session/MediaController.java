package androidx.media3.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Rating;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceBitmapLoader;
import androidx.media3.session.legacy.MediaBrowserCompat;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.errorprone.annotations.DoNotMock;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p076i4.AbstractC2186b0;

@DoNotMock
public class MediaController implements Player {
    protected static final long DEFAULT_PLATFORM_CALLBACK_AGGREGATION_TIMEOUT_MS = 100;
    public static final String KEY_MEDIA_NOTIFICATION_CONTROLLER_FLAG = "androidx.media3.session.MediaNotificationManager";
    public static final long RELEASE_UNBIND_TIMEOUT_MS = 30000;
    private static final String TAG = "MediaController";
    private static final String WRONG_THREAD_ERROR_MESSAGE = "MediaController method is called from a wrong thread. See javadoc of MediaController for details.";
    final Handler applicationHandler;
    final ConnectionCallback connectionCallback;
    private boolean connectionNotified;

    @NotOnlyInitialized
    private final MediaControllerImpl impl;
    final Listener listener;
    private final int maxCommandsForMediaItems;
    private boolean released;
    private long timeDiffMs;
    private final Timeline.Window window;

    public static final class Builder {
        private boolean allowDeviceVolumeCommandsForLocalPlayback;
        private Looper applicationLooper;
        private androidx.media3.common.util.BitmapLoader bitmapLoader;
        private Bundle connectionHints;
        private final Context context;
        private Listener listener;
        private int maxCommandsForMediaItems;
        private long platformSessionCallbackAggregationTimeoutMs;
        private final SessionToken token;

        public Builder(Context context, SessionToken sessionToken) {
            context.getClass();
            this.context = context;
            sessionToken.getClass();
            this.token = sessionToken;
            this.connectionHints = Bundle.EMPTY;
            this.listener = new Listener() {
            };
            this.applicationLooper = Util.getCurrentOrMainLooper();
            this.platformSessionCallbackAggregationTimeoutMs = 100L;
        }

        public com.google.common.util.concurrent.J buildAsync() {
            MediaControllerHolder mediaControllerHolder = new MediaControllerHolder(this.applicationLooper);
            if (this.token.isLegacySession() && this.bitmapLoader == null) {
                this.bitmapLoader = new CacheBitmapLoader(new DataSourceBitmapLoader.Builder(this.context).build());
            }
            Util.postOrRun(new Handler(this.applicationLooper), new RunnableC1589l(mediaControllerHolder, new MediaController(this.context, this.token, this.connectionHints, this.listener, this.applicationLooper, mediaControllerHolder, this.bitmapLoader, this.maxCommandsForMediaItems, this.platformSessionCallbackAggregationTimeoutMs, this.allowDeviceVolumeCommandsForLocalPlayback), 0));
            return mediaControllerHolder;
        }

        public Builder experimentalSetPlatformSessionCallbackAggregationTimeoutMs(long j) {
            this.platformSessionCallbackAggregationTimeoutMs = j;
            return this;
        }

        public Builder setAllowDeviceVolumeCommandsForLocalPlayback(boolean z6) {
            this.allowDeviceVolumeCommandsForLocalPlayback = z6;
            return this;
        }

        public Builder setApplicationLooper(Looper looper) {
            looper.getClass();
            this.applicationLooper = looper;
            return this;
        }

        public Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            bitmapLoader.getClass();
            this.bitmapLoader = bitmapLoader;
            return this;
        }

        public Builder setConnectionHints(Bundle bundle) {
            bundle.getClass();
            this.connectionHints = new Bundle(bundle);
            return this;
        }

        public Builder setListener(Listener listener) {
            listener.getClass();
            this.listener = listener;
            return this;
        }

        public Builder setMaxCommandsForMediaItems(int i3) {
            AbstractC1864o0.L(i3 >= 0);
            this.maxCommandsForMediaItems = i3;
            return this;
        }
    }

    public interface ConnectionCallback {
        void onAccepted();

        void onRejected();
    }

    public interface Listener {
        default void onAvailableSessionCommandsChanged(MediaController mediaController, SessionCommands sessionCommands) {
        }

        default com.google.common.util.concurrent.J onCustomCommand(MediaController mediaController, SessionCommand sessionCommand, Bundle bundle) {
            return com.google.common.util.concurrent.D.z(new SessionResult(-6));
        }

        default void onCustomLayoutChanged(MediaController mediaController, List<CommandButton> list) {
        }

        default void onDisconnected(MediaController mediaController) {
        }

        default void onError(MediaController mediaController, SessionError sessionError) {
        }

        default void onExtrasChanged(MediaController mediaController, Bundle bundle) {
        }

        default void onMediaButtonPreferencesChanged(MediaController mediaController, List<CommandButton> list) {
        }

        default void onSessionActivityChanged(MediaController mediaController, PendingIntent pendingIntent) {
        }

        default com.google.common.util.concurrent.J onSetCustomLayout(MediaController mediaController, List<CommandButton> list) {
            return com.google.common.util.concurrent.D.z(new SessionResult(-6));
        }
    }

    public interface MediaControllerImpl {
        void addListener(Player.Listener listener);

        void addMediaItem(int i3, MediaItem mediaItem);

        void addMediaItem(MediaItem mediaItem);

        void addMediaItems(int i3, List<MediaItem> list);

        void addMediaItems(List<MediaItem> list);

        void clearMediaItems();

        void clearVideoSurface();

        void clearVideoSurface(Surface surface);

        void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        void clearVideoSurfaceView(SurfaceView surfaceView);

        void clearVideoTextureView(TextureView textureView);

        void connect();

        void decreaseDeviceVolume();

        void decreaseDeviceVolume(int i3);

        AudioAttributes getAudioAttributes();

        int getAudioSessionId();

        Player.Commands getAvailableCommands();

        SessionCommands getAvailableSessionCommands();

        IMediaController getBinder();

        MediaBrowserCompat getBrowserCompat();

        int getBufferedPercentage();

        long getBufferedPosition();

        AbstractC2186b0 getCommandButtonsForMediaItem(MediaItem mediaItem);

        SessionToken getConnectedToken();

        Bundle getConnectionHints();

        long getContentBufferedPosition();

        long getContentDuration();

        long getContentPosition();

        Context getContext();

        int getCurrentAdGroupIndex();

        int getCurrentAdIndexInAdGroup();

        CueGroup getCurrentCues();

        long getCurrentLiveOffset();

        int getCurrentMediaItemIndex();

        int getCurrentPeriodIndex();

        long getCurrentPosition();

        Timeline getCurrentTimeline();

        Tracks getCurrentTracks();

        AbstractC2186b0 getCustomLayout();

        DeviceInfo getDeviceInfo();

        int getDeviceVolume();

        long getDuration();

        long getMaxSeekToPreviousPosition();

        AbstractC2186b0 getMediaButtonPreferences();

        MediaMetadata getMediaMetadata();

        int getNextMediaItemIndex();

        boolean getPlayWhenReady();

        PlaybackParameters getPlaybackParameters();

        int getPlaybackState();

        int getPlaybackSuppressionReason();

        PlaybackException getPlayerError();

        MediaMetadata getPlaylistMetadata();

        int getPreviousMediaItemIndex();

        int getRepeatMode();

        long getSeekBackIncrement();

        long getSeekForwardIncrement();

        PendingIntent getSessionActivity();

        Bundle getSessionExtras();

        boolean getShuffleModeEnabled();

        Size getSurfaceSize();

        long getTotalBufferedDuration();

        TrackSelectionParameters getTrackSelectionParameters();

        VideoSize getVideoSize();

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

        void removeListener(Player.Listener listener);

        void removeMediaItem(int i3);

        void removeMediaItems(int i3, int i9);

        void replaceMediaItem(int i3, MediaItem mediaItem);

        void replaceMediaItems(int i3, int i9, List<MediaItem> list);

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

        com.google.common.util.concurrent.J sendCustomCommand(SessionCommand sessionCommand, Bundle bundle);

        com.google.common.util.concurrent.J sendCustomCommand(SessionCommand sessionCommand, Bundle bundle, ProgressListener progressListener);

        void setAudioAttributes(AudioAttributes audioAttributes, boolean z6);

        void setDeviceMuted(boolean z6);

        void setDeviceMuted(boolean z6, int i3);

        void setDeviceVolume(int i3);

        void setDeviceVolume(int i3, int i9);

        void setMediaItem(MediaItem mediaItem);

        void setMediaItem(MediaItem mediaItem, long j);

        void setMediaItem(MediaItem mediaItem, boolean z6);

        void setMediaItems(List<MediaItem> list);

        void setMediaItems(List<MediaItem> list, int i3, long j);

        void setMediaItems(List<MediaItem> list, boolean z6);

        void setPlayWhenReady(boolean z6);

        void setPlaybackParameters(PlaybackParameters playbackParameters);

        void setPlaybackSpeed(float f9);

        void setPlaylistMetadata(MediaMetadata mediaMetadata);

        com.google.common.util.concurrent.J setRating(Rating rating);

        com.google.common.util.concurrent.J setRating(String str, Rating rating);

        void setRepeatMode(int i3);

        void setShuffleModeEnabled(boolean z6);

        void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters);

        void setVideoSurface(Surface surface);

        void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

        void setVideoSurfaceView(SurfaceView surfaceView);

        void setVideoTextureView(TextureView textureView);

        void setVolume(float f9);

        void stop();

        void unmute();
    }

    public interface ProgressListener {
        void onProgress(MediaController mediaController, SessionCommand sessionCommand, Bundle bundle, Bundle bundle2);
    }

    public MediaController(Context context, SessionToken sessionToken, Bundle bundle, Listener listener, Looper looper, ConnectionCallback connectionCallback, androidx.media3.common.util.BitmapLoader bitmapLoader, int i3, long j, boolean z6) {
        AbstractC1864o0.U(context, "context must not be null");
        AbstractC1864o0.U(sessionToken, "token must not be null");
        Log.i(TAG, "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + Util.DEVICE_DEBUG_INFO + "]");
        this.window = new Timeline.Window();
        this.timeDiffMs = androidx.media3.common.C.TIME_UNSET;
        this.listener = listener;
        this.applicationHandler = new Handler(looper);
        this.connectionCallback = connectionCallback;
        this.maxCommandsForMediaItems = i3;
        MediaControllerImpl mediaControllerImplCreateImpl = createImpl(context, sessionToken, bundle, looper, bitmapLoader, j, z6);
        this.impl = mediaControllerImplCreateImpl;
        mediaControllerImplCreateImpl.connect();
    }

    private static com.google.common.util.concurrent.J createDisconnectedFuture() {
        return com.google.common.util.concurrent.D.z(new SessionResult(-100));
    }

    public void lambda$release$0(Listener listener) {
        listener.onDisconnected(this);
    }

    public static void releaseFuture(Future<? extends MediaController> future) {
        if (future.cancel(false)) {
            return;
        }
        try {
            ((MediaController) com.google.common.util.concurrent.D.u(future)).release();
        } catch (CancellationException | ExecutionException e6) {
            Log.w(TAG, "MediaController future failed (so we couldn't release it)", e6);
        }
    }

    private void verifyApplicationThread() {
        AbstractC1864o0.Z(Looper.myLooper() == getApplicationLooper(), WRONG_THREAD_ERROR_MESSAGE);
    }

    @Override
    public final void addListener(Player.Listener listener) {
        AbstractC1864o0.U(listener, "listener must not be null");
        this.impl.addListener(listener);
    }

    @Override
    public final void addMediaItem(MediaItem mediaItem) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.addMediaItem(mediaItem);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring addMediaItem().");
        }
    }

    @Override
    public final void addMediaItems(List<MediaItem> list) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.addMediaItems(list);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override
    public final boolean canAdvertiseSession() {
        return false;
    }

    @Override
    public final void clearMediaItems() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.clearMediaItems();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override
    public final void clearVideoSurface() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.clearVideoSurface();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurface().");
        }
    }

    @Override
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.clearVideoSurfaceHolder(surfaceHolder);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurfaceHolder().");
        }
    }

    @Override
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.clearVideoSurfaceView(surfaceView);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurfaceView().");
        }
    }

    @Override
    public final void clearVideoTextureView(TextureView textureView) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.clearVideoTextureView(textureView);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring clearVideoTextureView().");
        }
    }

    public MediaControllerImpl createImpl(Context context, SessionToken sessionToken, Bundle bundle, Looper looper, androidx.media3.common.util.BitmapLoader bitmapLoader, long j, boolean z6) {
        if (!sessionToken.isLegacySession()) {
            return new MediaControllerImplBase(context, this, sessionToken, bundle, looper, z6);
        }
        bitmapLoader.getClass();
        return new MediaControllerImplLegacy(context, this, sessionToken, bundle, looper, bitmapLoader, j);
    }

    @Override
    @Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.decreaseDeviceVolume();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override
    public final Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    @Override
    public final AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return !isConnected() ? AudioAttributes.DEFAULT : this.impl.getAudioAttributes();
    }

    @Override
    public final int getAudioSessionId() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getAudioSessionId();
        }
        return 0;
    }

    @Override
    public final Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return !isConnected() ? Player.Commands.EMPTY : this.impl.getAvailableCommands();
    }

    public final SessionCommands getAvailableSessionCommands() {
        verifyApplicationThread();
        return !isConnected() ? SessionCommands.EMPTY : this.impl.getAvailableSessionCommands();
    }

    public final IMediaController getBinder() {
        return this.impl.getBinder();
    }

    @Override
    public final int getBufferedPercentage() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getBufferedPercentage();
        }
        return 0;
    }

    @Override
    public final long getBufferedPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getBufferedPosition();
        }
        return 0L;
    }

    public final AbstractC2186b0 getCommandButtonsForMediaItem(MediaItem mediaItem) {
        return this.impl.getCommandButtonsForMediaItem(mediaItem);
    }

    public final SessionToken getConnectedToken() {
        if (isConnected()) {
            return this.impl.getConnectedToken();
        }
        return null;
    }

    public Bundle getConnectionHints() {
        return this.impl.getConnectionHints();
    }

    @Override
    public final long getContentBufferedPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getContentBufferedPosition();
        }
        return 0L;
    }

    @Override
    public final long getContentDuration() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getContentDuration() : androidx.media3.common.C.TIME_UNSET;
    }

    @Override
    public final long getContentPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getContentPosition();
        }
        return 0L;
    }

    @Override
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentAdGroupIndex();
        }
        return -1;
    }

    @Override
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentAdIndexInAdGroup();
        }
        return -1;
    }

    @Override
    public final CueGroup getCurrentCues() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentCues() : CueGroup.EMPTY_TIME_ZERO;
    }

    @Override
    public final long getCurrentLiveOffset() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentLiveOffset() : androidx.media3.common.C.TIME_UNSET;
    }

    @Override
    public final Object getCurrentManifest() {
        return null;
    }

    @Override
    public final MediaItem getCurrentMediaItem() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return null;
        }
        return currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem;
    }

    @Override
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentMediaItemIndex();
        }
        return -1;
    }

    @Override
    public final int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentPeriodIndex();
        }
        return -1;
    }

    @Override
    public final long getCurrentPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCurrentPosition();
        }
        return 0L;
    }

    @Override
    public final Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentTimeline() : Timeline.EMPTY;
    }

    @Override
    public final Tracks getCurrentTracks() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getCurrentTracks() : Tracks.EMPTY;
    }

    @Override
    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    public final AbstractC2186b0 getCustomLayout() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getCustomLayout();
        }
        p076i4.Z z6 = AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
    }

    @Override
    public final DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return !isConnected() ? DeviceInfo.UNKNOWN : this.impl.getDeviceInfo();
    }

    @Override
    public final int getDeviceVolume() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getDeviceVolume();
        }
        return 0;
    }

    @Override
    public final long getDuration() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getDuration() : androidx.media3.common.C.TIME_UNSET;
    }

    public int getMaxCommandsForMediaItems() {
        return this.maxCommandsForMediaItems;
    }

    @Override
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getMaxSeekToPreviousPosition();
        }
        return 0L;
    }

    public final AbstractC2186b0 getMediaButtonPreferences() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getMediaButtonPreferences();
        }
        p076i4.Z z6 = AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
    }

    @Override
    public final MediaItem getMediaItemAt(int i3) {
        return getCurrentTimeline().getWindow(i3, this.window).mediaItem;
    }

    @Override
    public final int getMediaItemCount() {
        return getCurrentTimeline().getWindowCount();
    }

    @Override
    public final MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getMediaMetadata() : MediaMetadata.EMPTY;
    }

    @Override
    public final int getNextMediaItemIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getNextMediaItemIndex();
        }
        return -1;
    }

    @Override
    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override
    public final boolean getPlayWhenReady() {
        verifyApplicationThread();
        return isConnected() && this.impl.getPlayWhenReady();
    }

    @Override
    public final PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getPlaybackParameters() : PlaybackParameters.DEFAULT;
    }

    @Override
    public final int getPlaybackState() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPlaybackState();
        }
        return 1;
    }

    @Override
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPlaybackSuppressionReason();
        }
        return 0;
    }

    @Override
    public final PlaybackException getPlayerError() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPlayerError();
        }
        return null;
    }

    @Override
    public final MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getPlaylistMetadata() : MediaMetadata.EMPTY;
    }

    @Override
    public final int getPreviousMediaItemIndex() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getPreviousMediaItemIndex();
        }
        return -1;
    }

    @Override
    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override
    public final int getRepeatMode() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getRepeatMode();
        }
        return 0;
    }

    @Override
    public final long getSeekBackIncrement() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getSeekBackIncrement();
        }
        return 0L;
    }

    @Override
    public final long getSeekForwardIncrement() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getSeekForwardIncrement();
        }
        return 0L;
    }

    public final PendingIntent getSessionActivity() {
        if (isConnected()) {
            return this.impl.getSessionActivity();
        }
        return null;
    }

    public final Bundle getSessionExtras() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getSessionExtras() : Bundle.EMPTY;
    }

    @Override
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return isConnected() && this.impl.getShuffleModeEnabled();
    }

    @Override
    public final Size getSurfaceSize() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getSurfaceSize() : Size.UNKNOWN;
    }

    public final long getTimeDiffMs() {
        return this.timeDiffMs;
    }

    @Override
    public final long getTotalBufferedDuration() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getTotalBufferedDuration();
        }
        return 0L;
    }

    @Override
    public final TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        return !isConnected() ? TrackSelectionParameters.DEFAULT : this.impl.getTrackSelectionParameters();
    }

    @Override
    public final VideoSize getVideoSize() {
        verifyApplicationThread();
        return isConnected() ? this.impl.getVideoSize() : VideoSize.UNKNOWN;
    }

    @Override
    public final float getVolume() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.getVolume();
        }
        return 1.0f;
    }

    @Override
    public final boolean hasNextMediaItem() {
        verifyApplicationThread();
        return isConnected() && this.impl.hasNextMediaItem();
    }

    @Override
    public final boolean hasPreviousMediaItem() {
        verifyApplicationThread();
        return isConnected() && this.impl.hasPreviousMediaItem();
    }

    @Override
    @Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.increaseDeviceVolume();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override
    public final boolean isCommandAvailable(int i3) {
        return getAvailableCommands().contains(i3);
    }

    public final boolean isConnected() {
        return this.impl.isConnected();
    }

    @Override
    public final boolean isCurrentMediaItemDynamic() {
        verifyApplicationThread();
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isDynamic;
    }

    @Override
    public final boolean isCurrentMediaItemLive() {
        verifyApplicationThread();
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isLive();
    }

    @Override
    public final boolean isCurrentMediaItemSeekable() {
        verifyApplicationThread();
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.isEmpty() && currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).isSeekable;
    }

    @Override
    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override
    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override
    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override
    public final boolean isDeviceMuted() {
        verifyApplicationThread();
        if (isConnected()) {
            return this.impl.isDeviceMuted();
        }
        return false;
    }

    @Override
    public final boolean isLoading() {
        verifyApplicationThread();
        return isConnected() && this.impl.isLoading();
    }

    @Override
    public final boolean isPlaying() {
        verifyApplicationThread();
        return isConnected() && this.impl.isPlaying();
    }

    @Override
    public final boolean isPlayingAd() {
        verifyApplicationThread();
        return isConnected() && this.impl.isPlayingAd();
    }

    public final boolean isSessionCommandAvailable(int i3) {
        return getAvailableSessionCommands().contains(i3);
    }

    @Override
    public final void moveMediaItem(int i3, int i9) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.moveMediaItem(i3, i9);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    @Override
    public final void moveMediaItems(int i3, int i9, int i10) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.moveMediaItems(i3, i9, i10);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override
    public final void mute() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.mute();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring mute().");
        }
    }

    public final void notifyAccepted() {
        AbstractC1864o0.Y(Looper.myLooper() == getApplicationLooper());
        AbstractC1864o0.Y(!this.connectionNotified);
        this.connectionNotified = true;
        this.connectionCallback.onAccepted();
    }

    public final void notifyControllerListener(Consumer<Listener> consumer) {
        AbstractC1864o0.Y(Looper.myLooper() == getApplicationLooper());
        consumer.accept(this.listener);
    }

    @Override
    public final void pause() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.pause();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring pause().");
        }
    }

    @Override
    public final void play() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.play();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring play().");
        }
    }

    @Override
    public final void prepare() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.prepare();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override
    public final void release() {
        verifyApplicationThread();
        if (this.released) {
            return;
        }
        Log.i(TAG, "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + Util.DEVICE_DEBUG_INFO + "] [" + MediaLibraryInfo.registeredModules() + "]");
        this.released = true;
        this.applicationHandler.removeCallbacksAndMessages(null);
        try {
            this.impl.release();
        } catch (Exception e6) {
            Log.d(TAG, "Exception while releasing impl", e6);
        }
        if (this.connectionNotified) {
            notifyControllerListener(new C1588k0(9, this));
        } else {
            this.connectionNotified = true;
            this.connectionCallback.onRejected();
        }
    }

    @Override
    public final void removeListener(Player.Listener listener) {
        verifyApplicationThread();
        AbstractC1864o0.U(listener, "listener must not be null");
        this.impl.removeListener(listener);
    }

    @Override
    public final void removeMediaItem(int i3) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.removeMediaItem(i3);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override
    public final void removeMediaItems(int i3, int i9) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.removeMediaItems(i3, i9);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override
    public final void replaceMediaItem(int i3, MediaItem mediaItem) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.replaceMediaItem(i3, mediaItem);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override
    public final void replaceMediaItems(int i3, int i9, List<MediaItem> list) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.replaceMediaItems(i3, i9, list);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    public final void runOnApplicationLooper(Runnable runnable) {
        Util.postOrRun(this.applicationHandler, runnable);
    }

    @Override
    public final void seekBack() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekBack();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override
    public final void seekForward() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekForward();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override
    public final void seekTo(long j) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekTo(j);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override
    public final void seekToDefaultPosition() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekToDefaultPosition();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override
    public final void seekToNext() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekToNext();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override
    public final void seekToNextMediaItem() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekToNextMediaItem();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override
    public final void seekToPrevious() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekToPrevious();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override
    public final void seekToPreviousMediaItem() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.seekToPreviousMediaItem();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    public final com.google.common.util.concurrent.J sendCustomCommand(SessionCommand sessionCommand, Bundle bundle) {
        verifyApplicationThread();
        AbstractC1864o0.U(sessionCommand, "command must not be null");
        AbstractC1864o0.M(sessionCommand.commandCode == 0, "command must be a custom command");
        return isConnected() ? this.impl.sendCustomCommand(sessionCommand, bundle) : createDisconnectedFuture();
    }

    @Override
    public final void setAudioAttributes(AudioAttributes audioAttributes, boolean z6) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setAudioAttributes(audioAttributes, z6);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override
    @Deprecated
    public final void setDeviceMuted(boolean z6) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setDeviceMuted(z6);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override
    @Deprecated
    public final void setDeviceVolume(int i3) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setDeviceVolume(i3);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override
    public final void setMediaItem(MediaItem mediaItem) {
        verifyApplicationThread();
        AbstractC1864o0.U(mediaItem, "mediaItems must not be null");
        if (isConnected()) {
            this.impl.setMediaItem(mediaItem);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override
    public final void setMediaItems(List<MediaItem> list) {
        verifyApplicationThread();
        AbstractC1864o0.U(list, "mediaItems must not be null");
        for (int i3 = 0; i3 < list.size(); i3++) {
            AbstractC1864o0.J(i3, "items must not contain null, index=%s", list.get(i3) != null);
        }
        if (isConnected()) {
            this.impl.setMediaItems(list);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override
    public final void setPlayWhenReady(boolean z6) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setPlayWhenReady(z6);
        }
    }

    @Override
    public final void setPlaybackParameters(PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        AbstractC1864o0.U(playbackParameters, "playbackParameters must not be null");
        if (isConnected()) {
            this.impl.setPlaybackParameters(playbackParameters);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override
    public final void setPlaybackSpeed(float f9) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setPlaybackSpeed(f9);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override
    public final void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        AbstractC1864o0.U(mediaMetadata, "playlistMetadata must not be null");
        if (isConnected()) {
            this.impl.setPlaylistMetadata(mediaMetadata);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    public final com.google.common.util.concurrent.J setRating(String str, Rating rating) {
        verifyApplicationThread();
        AbstractC1864o0.U(str, "mediaId must not be null");
        AbstractC1864o0.M(!TextUtils.isEmpty(str), "mediaId must not be empty");
        AbstractC1864o0.U(rating, "rating must not be null");
        return isConnected() ? this.impl.setRating(str, rating) : createDisconnectedFuture();
    }

    @Override
    public final void setRepeatMode(int i3) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setRepeatMode(i3);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override
    public final void setShuffleModeEnabled(boolean z6) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setShuffleModeEnabled(z6);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    public final void setTimeDiffMs(long j) {
        verifyApplicationThread();
        this.timeDiffMs = j;
    }

    @Override
    public final void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThread();
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        this.impl.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override
    public final void setVideoSurface(Surface surface) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setVideoSurface(surface);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setVideoSurface().");
        }
    }

    @Override
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setVideoSurfaceHolder(surfaceHolder);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setVideoSurfaceHolder().");
        }
    }

    @Override
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setVideoSurfaceView(surfaceView);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setVideoSurfaceView().");
        }
    }

    @Override
    public final void setVideoTextureView(TextureView textureView) {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.setVideoTextureView(textureView);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setVideoTextureView().");
        }
    }

    @Override
    public final void setVolume(float f9) {
        verifyApplicationThread();
        AbstractC1864o0.M(f9 >= 0.0f && f9 <= 1.0f, "volume must be between 0 and 1");
        if (isConnected()) {
            this.impl.setVolume(f9);
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override
    public final void stop() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.stop();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring stop().");
        }
    }

    @Override
    public final void unmute() {
        verifyApplicationThread();
        if (isConnected()) {
            this.impl.unmute();
        } else {
            Log.w(TAG, "The controller is not connected. Ignoring unmute().");
        }
    }

    public final boolean isSessionCommandAvailable(SessionCommand sessionCommand) {
        return getAvailableSessionCommands().contains(sessionCommand);
    }

    @Override
    public final void addMediaItem(int i3, MediaItem mediaItem) {
        verifyApplicationThread();
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring addMediaItem().");
        } else {
            this.impl.addMediaItem(i3, mediaItem);
        }
    }

    @Override
    public final void addMediaItems(int i3, List<MediaItem> list) {
        verifyApplicationThread();
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring addMediaItems().");
        } else {
            this.impl.addMediaItems(i3, list);
        }
    }

    @Override
    public final void clearVideoSurface(Surface surface) {
        verifyApplicationThread();
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring clearVideoSurface().");
        } else {
            this.impl.clearVideoSurface(surface);
        }
    }

    @Override
    public final void decreaseDeviceVolume(int i3) {
        verifyApplicationThread();
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring decreaseDeviceVolume().");
        } else {
            this.impl.decreaseDeviceVolume(i3);
        }
    }

    @Override
    public final void increaseDeviceVolume(int i3) {
        verifyApplicationThread();
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring increaseDeviceVolume().");
        } else {
            this.impl.increaseDeviceVolume(i3);
        }
    }

    @Override
    public final void seekTo(int i3, long j) {
        verifyApplicationThread();
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        } else {
            this.impl.seekTo(i3, j);
        }
    }

    @Override
    public final void seekToDefaultPosition(int i3) {
        verifyApplicationThread();
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring seekTo().");
        } else {
            this.impl.seekToDefaultPosition(i3);
        }
    }

    @Override
    public final void setDeviceMuted(boolean z6, int i3) {
        verifyApplicationThread();
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring setDeviceMuted().");
        } else {
            this.impl.setDeviceMuted(z6, i3);
        }
    }

    @Override
    public final void setDeviceVolume(int i3, int i9) {
        verifyApplicationThread();
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring setDeviceVolume().");
        } else {
            this.impl.setDeviceVolume(i3, i9);
        }
    }

    @Override
    public final void setMediaItem(MediaItem mediaItem, long j) {
        verifyApplicationThread();
        AbstractC1864o0.U(mediaItem, "mediaItems must not be null");
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring setMediaItem().");
        } else {
            this.impl.setMediaItem(mediaItem, j);
        }
    }

    public final com.google.common.util.concurrent.J sendCustomCommand(SessionCommand sessionCommand, Bundle bundle, ProgressListener progressListener) {
        verifyApplicationThread();
        AbstractC1864o0.U(sessionCommand, "command must not be null");
        AbstractC1864o0.M(sessionCommand.commandCode == 0, "command must be a custom command");
        if (isConnected()) {
            return this.impl.sendCustomCommand(sessionCommand, bundle, progressListener);
        }
        return createDisconnectedFuture();
    }

    @Override
    public final void setMediaItems(List<MediaItem> list, boolean z6) {
        verifyApplicationThread();
        AbstractC1864o0.U(list, "mediaItems must not be null");
        for (int i3 = 0; i3 < list.size(); i3++) {
            AbstractC1864o0.J(i3, "items must not contain null, index=%s", list.get(i3) != null);
        }
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        } else {
            this.impl.setMediaItems(list, z6);
        }
    }

    public final com.google.common.util.concurrent.J setRating(Rating rating) {
        verifyApplicationThread();
        AbstractC1864o0.U(rating, "rating must not be null");
        if (isConnected()) {
            return this.impl.setRating(rating);
        }
        return createDisconnectedFuture();
    }

    @Override
    public final void setMediaItem(MediaItem mediaItem, boolean z6) {
        verifyApplicationThread();
        AbstractC1864o0.U(mediaItem, "mediaItems must not be null");
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        } else {
            this.impl.setMediaItem(mediaItem, z6);
        }
    }

    public final com.google.common.util.concurrent.J sendCustomCommand(SessionCommand sessionCommand, MediaItem mediaItem, Bundle bundle) {
        return sendCustomCommand(sessionCommand, mediaItem, bundle, null);
    }

    public final com.google.common.util.concurrent.J sendCustomCommand(SessionCommand sessionCommand, MediaItem mediaItem, Bundle bundle, ProgressListener progressListener) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_MEDIA_ITEM_ID", mediaItem.mediaId);
        return sendCustomCommand(sessionCommand, bundle2, progressListener);
    }

    @Override
    public final void setMediaItems(List<MediaItem> list, int i3, long j) {
        verifyApplicationThread();
        AbstractC1864o0.U(list, "mediaItems must not be null");
        for (int i9 = 0; i9 < list.size(); i9++) {
            AbstractC1864o0.J(i9, "items must not contain null, index=%s", list.get(i9) != null);
        }
        if (!isConnected()) {
            Log.w(TAG, "The controller is not connected. Ignoring setMediaItems().");
        } else {
            this.impl.setMediaItems(list, i3, j);
        }
    }
}
