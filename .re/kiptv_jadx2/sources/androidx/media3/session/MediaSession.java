package androidx.media3.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Rating;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceBitmapLoader;
import androidx.media3.session.legacy.MediaSessionManager;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.errorprone.annotations.DoNotMock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p076i4.AbstractC2186b0;

@DoNotMock
public class MediaSession {
    static final String DEFAULT_SESSION_ID = "";
    private final MediaSessionImpl impl;
    private static final Object STATIC_LOCK = new Object();
    private static final HashMap<String, MediaSession> SESSION_ID_TO_SESSION_MAP = new HashMap<>();

    public static final class Api31 {
        private Api31() {
        }

        public static boolean isActivity(PendingIntent pendingIntent) {
            return pendingIntent.isActivity();
        }
    }

    public static final class Builder extends BuilderBase<MediaSession, Builder, Callback> {
        private boolean buildCalled;
        private boolean useLegacySurfaceHandling;

        public Builder(Context context, Player player) {
            super(context, player, new Callback() {
            });
        }

        @Override
        public MediaSession build() {
            AbstractC1864o0.Y(!this.buildCalled);
            this.buildCalled = true;
            ensureBitmapLoaderIsSizeLimited();
            return new MediaSession(this.context, this.id, this.player, this.sessionActivity, this.customLayout, this.mediaButtonPreferences, this.commandButtonsForMediaItems, this.callback, this.tokenExtras, this.sessionExtras, this.bitmapLoader, this.playIfSuppressed, this.isPeriodicPositionUpdateEnabled, 0, this.useLegacySurfaceHandling);
        }

        @Override
        public BuilderBase setCommandButtonsForMediaItems(List list) {
            return setCommandButtonsForMediaItems((List<CommandButton>) list);
        }

        @Override
        public BuilderBase setCustomLayout(List list) {
            return setCustomLayout((List<CommandButton>) list);
        }

        public Builder setExperimentalSetUseLegacySurfaceHandling(boolean z6) {
            this.useLegacySurfaceHandling = z6;
            return this;
        }

        @Override
        public BuilderBase setMediaButtonPreferences(List list) {
            return setMediaButtonPreferences((List<CommandButton>) list);
        }

        @Override
        public Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            return (Builder) super.setBitmapLoader(bitmapLoader);
        }

        @Override
        public Builder setCallback(Callback callback) {
            return (Builder) super.setCallback(callback);
        }

        @Override
        public Builder setCommandButtonsForMediaItems(List<CommandButton> list) {
            return (Builder) super.setCommandButtonsForMediaItems(list);
        }

        @Override
        public Builder setCustomLayout(List<CommandButton> list) {
            return (Builder) super.setCustomLayout(list);
        }

        @Override
        public Builder setExtras(Bundle bundle) {
            return (Builder) super.setExtras(bundle);
        }

        @Override
        public Builder setId(String str) {
            return (Builder) super.setId(str);
        }

        @Override
        public Builder setMediaButtonPreferences(List<CommandButton> list) {
            return (Builder) super.setMediaButtonPreferences(list);
        }

        @Override
        public Builder setPeriodicPositionUpdateEnabled(boolean z6) {
            return (Builder) super.setPeriodicPositionUpdateEnabled(z6);
        }

        @Override
        public Builder setSessionActivity(PendingIntent pendingIntent) {
            return (Builder) super.setSessionActivity(pendingIntent);
        }

        @Override
        public Builder setSessionExtras(Bundle bundle) {
            return (Builder) super.setSessionExtras(bundle);
        }

        @Override
        public Builder setShowPlayButtonIfPlaybackIsSuppressed(boolean z6) {
            return (Builder) super.setShowPlayButtonIfPlaybackIsSuppressed(z6);
        }
    }

    public static abstract class BuilderBase<SessionT extends MediaSession, BuilderT extends BuilderBase<SessionT, BuilderT, CallbackT>, CallbackT extends Callback> {
        private static final AtomicReference<p107m4.a> bitmapSizesToAvoidApi29 = new AtomicReference<>(null);
        androidx.media3.common.util.BitmapLoader bitmapLoader;
        CallbackT callback;
        AbstractC2186b0 commandButtonsForMediaItems;
        final Context context;
        AbstractC2186b0 customLayout;
        String id;
        boolean isPeriodicPositionUpdateEnabled;
        AbstractC2186b0 mediaButtonPreferences;
        boolean playIfSuppressed;
        final Player player;
        PendingIntent sessionActivity;
        Bundle sessionExtras;
        Bundle tokenExtras;

        public BuilderBase(Context context, Player player, CallbackT callbackt) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            this.context = applicationContext;
            player.getClass();
            this.player = player;
            AbstractC1864o0.L(player.canAdvertiseSession());
            this.id = "";
            this.callback = callbackt;
            this.tokenExtras = new Bundle();
            this.sessionExtras = new Bundle();
            p076i4.Z z6 = AbstractC2186b0.f22868i;
            p076i4.S0 s9 = p076i4.S0.f22832l;
            this.customLayout = s9;
            this.mediaButtonPreferences = s9;
            this.playIfSuppressed = true;
            this.isPeriodicPositionUpdateEnabled = true;
            this.commandButtonsForMediaItems = s9;
        }

        private static p107m4.a getBitmapSizesToAvoidApi29(Context context) {
            AtomicReference<p107m4.a> atomicReference = bitmapSizesToAvoidApi29;
            p107m4.a aVar = atomicReference.get();
            if (aVar != null) {
                return aVar;
            }
            Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            Point point2 = new Point();
            defaultDisplay.getRealSize(point2);
            int i3 = point2.y;
            int i9 = point2.x;
            Point point3 = new Point(i3 - (i9 - point.x), i9 - (i3 - point.y));
            p107m4.a aVar2 = new p107m4.a(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)});
            atomicReference.set(aVar2);
            return aVar2;
        }

        public abstract SessionT build();

        @EnsuresNonNull({"bitmapLoader"})
        public final void ensureBitmapLoaderIsSizeLimited() {
            int bitmapDimensionLimit = MediaSession.getBitmapDimensionLimit(this.context);
            androidx.media3.common.util.BitmapLoader bitmapLoader = this.bitmapLoader;
            if (bitmapLoader == null) {
                this.bitmapLoader = new DataSourceBitmapLoader.Builder(this.context).setMaximumOutputDimension(bitmapDimensionLimit).setMakeShared(true).build();
            } else {
                this.bitmapLoader = new SizeLimitedBitmapLoader(bitmapLoader, bitmapDimensionLimit, true);
            }
            if (Build.VERSION.SDK_INT == 29) {
                this.bitmapLoader = new SizeAvoidingBitmapLoader(this.bitmapLoader, getBitmapSizesToAvoidApi29(this.context));
            }
            this.bitmapLoader = new CacheBitmapLoader(this.bitmapLoader);
        }

        public BuilderT setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            bitmapLoader.getClass();
            this.bitmapLoader = bitmapLoader;
            return this;
        }

        public BuilderT setCallback(CallbackT callbackt) {
            callbackt.getClass();
            this.callback = callbackt;
            return this;
        }

        public BuilderT setCommandButtonsForMediaItems(List<CommandButton> list) {
            this.commandButtonsForMediaItems = AbstractC2186b0.u(list);
            return this;
        }

        public BuilderT setCustomLayout(List<CommandButton> list) {
            this.customLayout = AbstractC2186b0.u(list);
            return this;
        }

        public BuilderT setExtras(Bundle bundle) {
            bundle.getClass();
            this.tokenExtras = new Bundle(bundle);
            return this;
        }

        public BuilderT setId(String str) {
            str.getClass();
            this.id = str;
            return this;
        }

        public BuilderT setMediaButtonPreferences(List<CommandButton> list) {
            this.mediaButtonPreferences = AbstractC2186b0.u(list);
            return this;
        }

        public BuilderT setPeriodicPositionUpdateEnabled(boolean z6) {
            this.isPeriodicPositionUpdateEnabled = z6;
            return this;
        }

        public BuilderT setSessionActivity(PendingIntent pendingIntent) {
            if (Build.VERSION.SDK_INT >= 31) {
                AbstractC1864o0.L(Api31.isActivity(pendingIntent));
            }
            pendingIntent.getClass();
            this.sessionActivity = pendingIntent;
            return this;
        }

        public BuilderT setSessionExtras(Bundle bundle) {
            bundle.getClass();
            this.sessionExtras = new Bundle(bundle);
            return this;
        }

        public BuilderT setShowPlayButtonIfPlaybackIsSuppressed(boolean z6) {
            this.playIfSuppressed = z6;
            return this;
        }
    }

    public interface Callback {
        static com.google.common.util.concurrent.J lambda$onSetMediaItems$0(int i3, long j, List list) {
            return com.google.common.util.concurrent.D.z(new MediaItemsWithStartPosition(list, i3, j));
        }

        default com.google.common.util.concurrent.J onAddMediaItems(MediaSession mediaSession, ControllerInfo controllerInfo, List<MediaItem> list) {
            Iterator<MediaItem> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().localConfiguration == null) {
                    return com.google.common.util.concurrent.D.y(new UnsupportedOperationException());
                }
            }
            return com.google.common.util.concurrent.D.z(list);
        }

        default ConnectionResult onConnect(MediaSession mediaSession, ControllerInfo controllerInfo) {
            return new ConnectionResult.AcceptedResultBuilder(mediaSession).build();
        }

        default com.google.common.util.concurrent.J onCustomCommand(MediaSession mediaSession, ControllerInfo controllerInfo, SessionCommand sessionCommand, Bundle bundle) {
            return com.google.common.util.concurrent.D.z(new SessionResult(-6));
        }

        default void onDisconnected(MediaSession mediaSession, ControllerInfo controllerInfo) {
        }

        default boolean onMediaButtonEvent(MediaSession mediaSession, ControllerInfo controllerInfo, Intent intent) {
            return false;
        }

        @Deprecated
        default com.google.common.util.concurrent.J onPlaybackResumption(MediaSession mediaSession, ControllerInfo controllerInfo) {
            return com.google.common.util.concurrent.D.y(new UnsupportedOperationException());
        }

        @Deprecated
        default int onPlayerCommandRequest(MediaSession mediaSession, ControllerInfo controllerInfo, int i3) {
            return 0;
        }

        default void onPlayerInteractionFinished(MediaSession mediaSession, ControllerInfo controllerInfo, Player.Commands commands) {
        }

        default void onPostConnect(MediaSession mediaSession, ControllerInfo controllerInfo) {
        }

        default com.google.common.util.concurrent.J onSetMediaItems(MediaSession mediaSession, ControllerInfo controllerInfo, List<MediaItem> list, final int i3, final long j) {
            return Util.transformFutureAsync(onAddMediaItems(mediaSession, controllerInfo, list), new com.google.common.util.concurrent.w() {
                @Override
                public final com.google.common.util.concurrent.J apply(Object obj) {
                    return MediaSession.Callback.lambda$onSetMediaItems$0(i3, j, (List) obj);
                }
            });
        }

        default com.google.common.util.concurrent.J onSetRating(MediaSession mediaSession, ControllerInfo controllerInfo, String str, Rating rating) {
            return com.google.common.util.concurrent.D.z(new SessionResult(-6));
        }

        default com.google.common.util.concurrent.J onCustomCommand(MediaSession mediaSession, ControllerInfo controllerInfo, SessionCommand sessionCommand, Bundle bundle, ProgressReporter progressReporter) {
            return onCustomCommand(mediaSession, controllerInfo, sessionCommand, bundle);
        }

        default com.google.common.util.concurrent.J onPlaybackResumption(MediaSession mediaSession, ControllerInfo controllerInfo, boolean z6) {
            return onPlaybackResumption(mediaSession, controllerInfo);
        }

        default com.google.common.util.concurrent.J onSetRating(MediaSession mediaSession, ControllerInfo controllerInfo, Rating rating) {
            return com.google.common.util.concurrent.D.z(new SessionResult(-6));
        }
    }

    public static final class ConnectionResult {
        public final Player.Commands availablePlayerCommands;
        public final SessionCommands availableSessionCommands;
        public final AbstractC2186b0 customLayout;
        public final boolean isAccepted;
        public final AbstractC2186b0 mediaButtonPreferences;
        public final PendingIntent sessionActivity;
        public final Bundle sessionExtras;
        public static final SessionCommands DEFAULT_SESSION_COMMANDS = new SessionCommands.Builder().addAllSessionCommands().build();
        public static final SessionCommands DEFAULT_SESSION_AND_LIBRARY_COMMANDS = new SessionCommands.Builder().addAllLibraryCommands().addAllSessionCommands().build();
        public static final Player.Commands DEFAULT_PLAYER_COMMANDS = new Player.Commands.Builder().addAllCommands().build();

        public static class AcceptedResultBuilder {
            private Player.Commands availablePlayerCommands = ConnectionResult.DEFAULT_PLAYER_COMMANDS;
            private SessionCommands availableSessionCommands;
            private AbstractC2186b0 customLayout;
            private AbstractC2186b0 mediaButtonPreferences;
            private PendingIntent sessionActivity;
            private Bundle sessionExtras;

            public AcceptedResultBuilder(MediaSession mediaSession) {
                this.availableSessionCommands = mediaSession instanceof MediaLibraryService.MediaLibrarySession ? ConnectionResult.DEFAULT_SESSION_AND_LIBRARY_COMMANDS : ConnectionResult.DEFAULT_SESSION_COMMANDS;
            }

            public ConnectionResult build() {
                return new ConnectionResult(true, this.availableSessionCommands, this.availablePlayerCommands, this.customLayout, this.mediaButtonPreferences, this.sessionExtras, this.sessionActivity);
            }

            public AcceptedResultBuilder setAvailablePlayerCommands(Player.Commands commands) {
                commands.getClass();
                this.availablePlayerCommands = commands;
                return this;
            }

            public AcceptedResultBuilder setAvailableSessionCommands(SessionCommands sessionCommands) {
                sessionCommands.getClass();
                this.availableSessionCommands = sessionCommands;
                return this;
            }

            public AcceptedResultBuilder setCustomLayout(List<CommandButton> list) {
                this.customLayout = list == null ? null : AbstractC2186b0.u(list);
                return this;
            }

            public AcceptedResultBuilder setMediaButtonPreferences(List<CommandButton> list) {
                this.mediaButtonPreferences = list == null ? null : AbstractC2186b0.u(list);
                return this;
            }

            public AcceptedResultBuilder setSessionActivity(PendingIntent pendingIntent) {
                this.sessionActivity = pendingIntent;
                return this;
            }

            public AcceptedResultBuilder setSessionExtras(Bundle bundle) {
                this.sessionExtras = bundle;
                return this;
            }
        }

        public static ConnectionResult accept(SessionCommands sessionCommands, Player.Commands commands) {
            return new ConnectionResult(true, sessionCommands, commands, null, null, null, null);
        }

        public static ConnectionResult reject() {
            SessionCommands sessionCommands = SessionCommands.EMPTY;
            Player.Commands commands = Player.Commands.EMPTY;
            p076i4.Z z6 = AbstractC2186b0.f22868i;
            p076i4.S0 s9 = p076i4.S0.f22832l;
            return new ConnectionResult(false, sessionCommands, commands, s9, s9, Bundle.EMPTY, null);
        }

        private ConnectionResult(boolean z6, SessionCommands sessionCommands, Player.Commands commands, AbstractC2186b0 abstractC2186b0, AbstractC2186b0 abstractC2186b1, Bundle bundle, PendingIntent pendingIntent) {
            this.isAccepted = z6;
            this.availableSessionCommands = sessionCommands;
            this.availablePlayerCommands = commands;
            this.customLayout = abstractC2186b0;
            this.mediaButtonPreferences = abstractC2186b1;
            this.sessionExtras = bundle;
            this.sessionActivity = pendingIntent;
        }
    }

    public interface ControllerCb {
        default void onAudioAttributesChanged(int i3, AudioAttributes audioAttributes) {
        }

        default void onAudioSessionIdChanged(int i3, int i9) {
        }

        default void onAvailableCommandsChangedFromPlayer(int i3, Player.Commands commands) {
        }

        default void onAvailableCommandsChangedFromSession(int i3, SessionCommands sessionCommands, Player.Commands commands) {
        }

        default void onChildrenChanged(int i3, String str, int i9, MediaLibraryService.LibraryParams libraryParams) {
        }

        default void onDeviceInfoChanged(int i3, DeviceInfo deviceInfo) {
        }

        default void onDeviceVolumeChanged(int i3, int i9, boolean z6) {
        }

        default void onDisconnected(int i3) {
        }

        default void onError(int i3, SessionError sessionError) {
        }

        default void onIsLoadingChanged(int i3, boolean z6) {
        }

        default void onIsPlayingChanged(int i3, boolean z6) {
        }

        default void onLibraryResult(int i3, LibraryResult<?> libraryResult) {
        }

        default void onMediaItemTransition(int i3, MediaItem mediaItem, int i9) {
        }

        default void onMediaMetadataChanged(int i3, MediaMetadata mediaMetadata) {
        }

        default void onPeriodicSessionPositionInfoChanged(int i3, SessionPositionInfo sessionPositionInfo, boolean z6, boolean z9, int i9) {
        }

        default void onPlayWhenReadyChanged(int i3, boolean z6, int i9) {
        }

        default void onPlaybackParametersChanged(int i3, PlaybackParameters playbackParameters) {
        }

        default void onPlaybackStateChanged(int i3, int i9, PlaybackException playbackException) {
        }

        default void onPlaybackSuppressionReasonChanged(int i3, int i9) {
        }

        default void onPlayerChanged(int i3, PlayerWrapper playerWrapper, PlayerWrapper playerWrapper2) {
        }

        default void onPlayerError(int i3, PlaybackException playbackException) {
        }

        default void onPlayerInfoChanged(int i3, PlayerInfo playerInfo, Player.Commands commands, boolean z6, boolean z9) {
        }

        default void onPlaylistMetadataChanged(int i3, MediaMetadata mediaMetadata) {
        }

        default void onPositionDiscontinuity(int i3, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i9) {
        }

        default void onRenderedFirstFrame(int i3) {
        }

        default void onRepeatModeChanged(int i3, int i9) {
        }

        default void onSearchResultChanged(int i3, String str, int i9, MediaLibraryService.LibraryParams libraryParams) {
        }

        default void onSeekBackIncrementChanged(int i3, long j) {
        }

        default void onSeekForwardIncrementChanged(int i3, long j) {
        }

        default void onSessionActivityChanged(int i3, PendingIntent pendingIntent) {
        }

        default void onSessionExtrasChanged(int i3, Bundle bundle) {
        }

        default void onSessionResult(int i3, SessionResult sessionResult) {
        }

        default void onShuffleModeEnabledChanged(int i3, boolean z6) {
        }

        default void onSurfaceSizeChanged(int i3, int i9, int i10) {
        }

        default void onTimelineChanged(int i3, Timeline timeline, int i9) {
        }

        default void onTrackSelectionParametersChanged(int i3, TrackSelectionParameters trackSelectionParameters) {
        }

        default void onTracksChanged(int i3, Tracks tracks) {
        }

        default void onVideoSizeChanged(int i3, VideoSize videoSize) {
        }

        default void onVolumeChanged(int i3, float f9) {
        }

        default void sendCustomCommand(int i3, SessionCommand sessionCommand, Bundle bundle) {
        }

        default void sendCustomCommandProgressUpdate(int i3, SessionCommand sessionCommand, Bundle bundle, Bundle bundle2) {
        }

        default void setCustomLayout(int i3, List<CommandButton> list) {
        }

        default void setMediaButtonPreferences(int i3, List<CommandButton> list) {
        }
    }

    public static final class ControllerInfo {
        public static final int LEGACY_CONTROLLER_INTERFACE_VERSION = 0;
        public static final String LEGACY_CONTROLLER_PACKAGE_NAME = "android.media.session.MediaController";
        public static final int LEGACY_CONTROLLER_VERSION = 0;
        private final Bundle connectionHints;
        private final ControllerCb controllerCb;
        private final int interfaceVersion;
        private final boolean isPackageNameVerified;
        private final boolean isTrusted;
        private final int libraryVersion;
        private final int maxCommandsForMediaItems;
        private final MediaSessionManager.RemoteUserInfo remoteUserInfo;

        public ControllerInfo(MediaSessionManager.RemoteUserInfo remoteUserInfo, int i3, int i9, boolean z6, ControllerCb controllerCb, Bundle bundle, int i10, boolean z9) {
            this.remoteUserInfo = remoteUserInfo;
            this.libraryVersion = i3;
            this.interfaceVersion = i9;
            this.isTrusted = z6;
            this.controllerCb = controllerCb;
            this.connectionHints = bundle;
            this.maxCommandsForMediaItems = i10;
            this.isPackageNameVerified = z9;
        }

        public static ControllerInfo createLegacyControllerInfo() {
            return new ControllerInfo(new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY, 0, false);
        }

        public static ControllerInfo createTestOnlyControllerInfo(String str, int i3, int i9, int i10, int i11, boolean z6, Bundle bundle, boolean z9) {
            return new ControllerInfo(new MediaSessionManager.RemoteUserInfo(str, i3, i9), i10, i11, z6, null, bundle, 0, z9);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ControllerInfo)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ControllerInfo controllerInfo = (ControllerInfo) obj;
            ControllerCb controllerCb = this.controllerCb;
            return (controllerCb == null && controllerInfo.controllerCb == null) ? this.remoteUserInfo.equals(controllerInfo.remoteUserInfo) : Objects.equals(controllerCb, controllerInfo.controllerCb);
        }

        public Bundle getConnectionHints() {
            return new Bundle(this.connectionHints);
        }

        public ControllerCb getControllerCb() {
            return this.controllerCb;
        }

        public int getControllerVersion() {
            return this.libraryVersion;
        }

        public int getInterfaceVersion() {
            return this.interfaceVersion;
        }

        public int getMaxCommandsForMediaItems() {
            return this.maxCommandsForMediaItems;
        }

        public String getPackageName() {
            return this.remoteUserInfo.getPackageName();
        }

        public MediaSessionManager.RemoteUserInfo getRemoteUserInfo() {
            return this.remoteUserInfo;
        }

        public int getUid() {
            return this.remoteUserInfo.getUid();
        }

        public int hashCode() {
            return Objects.hash(this.controllerCb, this.remoteUserInfo);
        }

        public boolean isPackageNameVerified() {
            return this.isPackageNameVerified;
        }

        public boolean isTrusted() {
            return this.isTrusted;
        }

        public String toString() {
            return "ControllerInfo {pkg=" + this.remoteUserInfo.getPackageName() + ", uid=" + this.remoteUserInfo.getUid() + "}";
        }
    }

    public interface Listener {
        void onNotificationRefreshRequired(MediaSession mediaSession);

        boolean onPlayRequested(MediaSession mediaSession);
    }

    public static final class MediaItemsWithStartPosition {
        public final AbstractC2186b0 mediaItems;
        public final int startIndex;
        public final long startPositionMs;

        public MediaItemsWithStartPosition(List<MediaItem> list, int i3, long j) {
            this.mediaItems = AbstractC2186b0.u(list);
            this.startIndex = i3;
            this.startPositionMs = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemsWithStartPosition)) {
                return false;
            }
            MediaItemsWithStartPosition mediaItemsWithStartPosition = (MediaItemsWithStartPosition) obj;
            return this.mediaItems.equals(mediaItemsWithStartPosition.mediaItems) && this.startIndex == mediaItemsWithStartPosition.startIndex && this.startPositionMs == mediaItemsWithStartPosition.startPositionMs;
        }

        public int hashCode() {
            return com.google.android.gms.internal.play_billing.V0.v(this.startPositionMs) + (((this.mediaItems.hashCode() * 31) + this.startIndex) * 31);
        }
    }

    public interface ProgressReporter {
        void sendProgressUpdate(Bundle bundle);
    }

    public MediaSession(Context context, String str, Player player, PendingIntent pendingIntent, AbstractC2186b0 abstractC2186b0, AbstractC2186b0 abstractC2186b1, AbstractC2186b0 abstractC2186b2, Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z6, boolean z9, int i3, boolean z10) {
        synchronized (STATIC_LOCK) {
            HashMap<String, MediaSession> map = SESSION_ID_TO_SESSION_MAP;
            if (map.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            map.put(str, this);
        }
        this.impl = createImpl(context, str, player, pendingIntent, abstractC2186b0, abstractC2186b1, abstractC2186b2, callback, bundle, bundle2, bitmapLoader, z6, z9, i3, z10);
    }

    public static int getBitmapDimensionLimit(Context context) {
        return MediaSessionImpl.getBitmapDimensionLimit(context);
    }

    public static MediaSession getSession(Uri uri) {
        synchronized (STATIC_LOCK) {
            try {
                for (MediaSession mediaSession : SESSION_ID_TO_SESSION_MAP.values()) {
                    if (Objects.equals(mediaSession.getUri(), uri)) {
                        return mediaSession;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void broadcastCustomCommand(SessionCommand sessionCommand, Bundle bundle) {
        sessionCommand.getClass();
        bundle.getClass();
        AbstractC1864o0.M(sessionCommand.commandCode == 0, "command must be a custom command");
        this.impl.broadcastCustomCommand(sessionCommand, bundle);
    }

    public final void clearListener() {
        this.impl.clearMediaSessionListener();
    }

    public MediaSessionImpl createImpl(Context context, String str, Player player, PendingIntent pendingIntent, AbstractC2186b0 abstractC2186b0, AbstractC2186b0 abstractC2186b1, AbstractC2186b0 abstractC2186b2, Callback callback, Bundle bundle, Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z6, boolean z9, int i3, boolean z10) {
        return new MediaSessionImpl(this, context, str, player, pendingIntent, abstractC2186b0, abstractC2186b1, abstractC2186b2, callback, bundle, bundle2, bitmapLoader, z6, z9, z10);
    }

    public final androidx.media3.common.util.BitmapLoader getBitmapLoader() {
        return this.impl.getBitmapLoader();
    }

    public final List<ControllerInfo> getConnectedControllers() {
        return this.impl.getConnectedControllers();
    }

    public final ControllerInfo getControllerForCurrentRequest() {
        return this.impl.getControllerForCurrentRequest();
    }

    public AbstractC2186b0 getCustomLayout() {
        return this.impl.getCustomLayout();
    }

    public final String getId() {
        return this.impl.getId();
    }

    public MediaSessionImpl getImpl() {
        return this.impl;
    }

    public final IBinder getLegacyBrowserServiceBinder() {
        return this.impl.getLegacyBrowserServiceBinder();
    }

    public AbstractC2186b0 getMediaButtonPreferences() {
        return this.impl.getMediaButtonPreferences();
    }

    public ControllerInfo getMediaNotificationControllerInfo() {
        return this.impl.getMediaNotificationControllerInfo();
    }

    public final android.media.session.MediaSession.Token getPlatformToken() {
        return this.impl.getPlatformToken();
    }

    public final Player getPlayer() {
        return this.impl.getPlayerWrapper().getWrappedPlayer();
    }

    public final PendingIntent getSessionActivity() {
        return this.impl.getSessionActivity();
    }

    public Bundle getSessionExtras() {
        return this.impl.getSessionExtras();
    }

    public final boolean getShowPlayButtonIfPlaybackIsSuppressed() {
        return this.impl.shouldPlayIfSuppressed();
    }

    public final SessionToken getToken() {
        return this.impl.getToken();
    }

    public final Uri getUri() {
        return this.impl.getUri();
    }

    public final void handleControllerConnectionFromService(IMediaController iMediaController, ControllerInfo controllerInfo) {
        this.impl.connectFromService(iMediaController, controllerInfo);
    }

    public final boolean isAutoCompanionController(ControllerInfo controllerInfo) {
        return this.impl.isAutoCompanionController(controllerInfo);
    }

    public final boolean isAutomotiveController(ControllerInfo controllerInfo) {
        return this.impl.isAutomotiveController(controllerInfo);
    }

    public boolean isMediaNotificationController(ControllerInfo controllerInfo) {
        return this.impl.isMediaNotificationController(controllerInfo);
    }

    public final boolean isReleased() {
        return this.impl.isReleased();
    }

    public final void release() {
        try {
            synchronized (STATIC_LOCK) {
                SESSION_ID_TO_SESSION_MAP.remove(this.impl.getId());
            }
            this.impl.release();
        } catch (Exception unused) {
        }
    }

    public final com.google.common.util.concurrent.J sendCustomCommand(ControllerInfo controllerInfo, SessionCommand sessionCommand, Bundle bundle) {
        controllerInfo.getClass();
        sessionCommand.getClass();
        bundle.getClass();
        AbstractC1864o0.M(sessionCommand.commandCode == 0, "command must be a custom command");
        return this.impl.sendCustomCommand(controllerInfo, sessionCommand, bundle);
    }

    public final void sendError(ControllerInfo controllerInfo, SessionError sessionError) {
        this.impl.sendError(controllerInfo, sessionError);
    }

    public final void setAvailableCommands(ControllerInfo controllerInfo, SessionCommands sessionCommands, Player.Commands commands) {
        AbstractC1864o0.U(controllerInfo, "controller must not be null");
        AbstractC1864o0.U(sessionCommands, "sessionCommands must not be null");
        AbstractC1864o0.U(commands, "playerCommands must not be null");
        this.impl.setAvailableCommands(controllerInfo, sessionCommands, commands);
    }

    public final com.google.common.util.concurrent.J setCustomLayout(ControllerInfo controllerInfo, List<CommandButton> list) {
        AbstractC1864o0.U(controllerInfo, "controller must not be null");
        AbstractC1864o0.U(list, "layout must not be null");
        return this.impl.setCustomLayout(controllerInfo, AbstractC2186b0.u(list));
    }

    public final void setLegacyControllerConnectionTimeoutMs(long j) {
        this.impl.setLegacyControllerConnectionTimeoutMs(j);
    }

    public final void setListener(Listener listener) {
        this.impl.setMediaSessionListener(listener);
    }

    public final com.google.common.util.concurrent.J setMediaButtonPreferences(ControllerInfo controllerInfo, List<CommandButton> list) {
        AbstractC1864o0.U(controllerInfo, "controller must not be null");
        AbstractC1864o0.U(list, "media button preferences must not be null");
        return this.impl.setMediaButtonPreferences(controllerInfo, AbstractC2186b0.u(list));
    }

    public final void setPlaybackException(ControllerInfo controllerInfo, PlaybackException playbackException) {
        this.impl.setPlaybackException(controllerInfo, playbackException);
    }

    public final void setPlayer(Player player) {
        player.getClass();
        AbstractC1864o0.L(player.canAdvertiseSession());
        AbstractC1864o0.L(player.getApplicationLooper() == getPlayer().getApplicationLooper());
        AbstractC1864o0.Y(player.getApplicationLooper() == Looper.myLooper());
        this.impl.setPlayer(player);
    }

    public final void setSessionActivity(PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 31 && pendingIntent != null) {
            AbstractC1864o0.L(Api31.isActivity(pendingIntent));
        }
        this.impl.setSessionActivity(pendingIntent);
    }

    public final void setSessionExtras(Bundle bundle) {
        this.impl.setSessionExtras(new Bundle(bundle));
    }

    public final void setSessionPositionUpdateDelayMs(long j) {
        this.impl.setSessionPositionUpdateDelayMsOnHandler(j);
    }

    public final void sendError(SessionError sessionError) {
        this.impl.sendError(sessionError);
    }

    public final void setPlaybackException(PlaybackException playbackException) {
        this.impl.setPlaybackException(playbackException);
    }

    public final void setSessionExtras(ControllerInfo controllerInfo, Bundle bundle) {
        AbstractC1864o0.U(controllerInfo, "controller must not be null");
        this.impl.setSessionExtras(controllerInfo, new Bundle(bundle));
    }

    public final void setCustomLayout(List<CommandButton> list) {
        AbstractC1864o0.U(list, "layout must not be null");
        this.impl.setCustomLayout(AbstractC2186b0.u(list));
    }

    public final void setMediaButtonPreferences(List<CommandButton> list) {
        AbstractC1864o0.U(list, "media button preferences must not be null");
        this.impl.setMediaButtonPreferences(AbstractC2186b0.u(list));
    }

    public final void setSessionActivity(ControllerInfo controllerInfo, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 31 && pendingIntent != null) {
            AbstractC1864o0.L(Api31.isActivity(pendingIntent));
        }
        this.impl.setSessionActivity(controllerInfo, pendingIntent);
    }
}
