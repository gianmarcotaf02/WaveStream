package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.DoNotMock
public class MediaSession {
    static final java.lang.String DEFAULT_SESSION_ID = "";
    private final androidx.media3.session.MediaSessionImpl impl;
    private static final java.lang.Object STATIC_LOCK = new java.lang.Object();
    private static final java.util.HashMap<java.lang.String, androidx.media3.session.MediaSession> SESSION_ID_TO_SESSION_MAP = new java.util.HashMap<>();

    public static final class Api31 {
        private Api31() {
        }

        public static boolean isActivity(android.app.PendingIntent pendingIntent) {
            return pendingIntent.isActivity();
        }
    }

    public static final class Builder extends androidx.media3.session.MediaSession.BuilderBase<androidx.media3.session.MediaSession, androidx.media3.session.MediaSession.Builder, androidx.media3.session.MediaSession.Callback> {
        private boolean buildCalled;
        private boolean useLegacySurfaceHandling;

        public Builder(android.content.Context context, androidx.media3.common.Player player) {
            super(context, player, new androidx.media3.session.MediaSession.Callback() { // from class: androidx.media3.session.MediaSession.Builder.1
            });
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession build() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.buildCalled = true;
            ensureBitmapLoaderIsSizeLimited();
            return new androidx.media3.session.MediaSession(this.context, this.id, this.player, this.sessionActivity, this.customLayout, this.mediaButtonPreferences, this.commandButtonsForMediaItems, this.callback, this.tokenExtras, this.sessionExtras, this.bitmapLoader, this.playIfSuppressed, this.isPeriodicPositionUpdateEnabled, 0, this.useLegacySurfaceHandling);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public /* bridge */ /* synthetic */ androidx.media3.session.MediaSession.BuilderBase setCommandButtonsForMediaItems(java.util.List list) {
            return setCommandButtonsForMediaItems((java.util.List<androidx.media3.session.CommandButton>) list);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public /* bridge */ /* synthetic */ androidx.media3.session.MediaSession.BuilderBase setCustomLayout(java.util.List list) {
            return setCustomLayout((java.util.List<androidx.media3.session.CommandButton>) list);
        }

        public androidx.media3.session.MediaSession.Builder setExperimentalSetUseLegacySurfaceHandling(boolean z6) {
            this.useLegacySurfaceHandling = z6;
            return this;
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public /* bridge */ /* synthetic */ androidx.media3.session.MediaSession.BuilderBase setMediaButtonPreferences(java.util.List list) {
            return setMediaButtonPreferences((java.util.List<androidx.media3.session.CommandButton>) list);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setBitmapLoader(androidx.media3.common.util.BitmapLoader bitmapLoader) {
            return (androidx.media3.session.MediaSession.Builder) super.setBitmapLoader(bitmapLoader);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setCallback(androidx.media3.session.MediaSession.Callback callback) {
            return (androidx.media3.session.MediaSession.Builder) super.setCallback(callback);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setCommandButtonsForMediaItems(java.util.List<androidx.media3.session.CommandButton> list) {
            return (androidx.media3.session.MediaSession.Builder) super.setCommandButtonsForMediaItems(list);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setCustomLayout(java.util.List<androidx.media3.session.CommandButton> list) {
            return (androidx.media3.session.MediaSession.Builder) super.setCustomLayout(list);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setExtras(android.os.Bundle bundle) {
            return (androidx.media3.session.MediaSession.Builder) super.setExtras(bundle);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setId(java.lang.String str) {
            return (androidx.media3.session.MediaSession.Builder) super.setId(str);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setMediaButtonPreferences(java.util.List<androidx.media3.session.CommandButton> list) {
            return (androidx.media3.session.MediaSession.Builder) super.setMediaButtonPreferences(list);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setPeriodicPositionUpdateEnabled(boolean z6) {
            return (androidx.media3.session.MediaSession.Builder) super.setPeriodicPositionUpdateEnabled(z6);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setSessionActivity(android.app.PendingIntent pendingIntent) {
            return (androidx.media3.session.MediaSession.Builder) super.setSessionActivity(pendingIntent);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setSessionExtras(android.os.Bundle bundle) {
            return (androidx.media3.session.MediaSession.Builder) super.setSessionExtras(bundle);
        }

        @Override // androidx.media3.session.MediaSession.BuilderBase
        public androidx.media3.session.MediaSession.Builder setShowPlayButtonIfPlaybackIsSuppressed(boolean z6) {
            return (androidx.media3.session.MediaSession.Builder) super.setShowPlayButtonIfPlaybackIsSuppressed(z6);
        }
    }

    public static abstract class BuilderBase<SessionT extends androidx.media3.session.MediaSession, BuilderT extends androidx.media3.session.MediaSession.BuilderBase<SessionT, BuilderT, CallbackT>, CallbackT extends androidx.media3.session.MediaSession.Callback> {
        private static final java.util.concurrent.atomic.AtomicReference<p107m4.a> bitmapSizesToAvoidApi29 = new java.util.concurrent.atomic.AtomicReference<>(null);
        androidx.media3.common.util.BitmapLoader bitmapLoader;
        CallbackT callback;
        p076i4.AbstractC2186b0 commandButtonsForMediaItems;
        final android.content.Context context;
        p076i4.AbstractC2186b0 customLayout;
        java.lang.String id;
        boolean isPeriodicPositionUpdateEnabled;
        p076i4.AbstractC2186b0 mediaButtonPreferences;
        boolean playIfSuppressed;
        final androidx.media3.common.Player player;
        android.app.PendingIntent sessionActivity;
        android.os.Bundle sessionExtras;
        android.os.Bundle tokenExtras;

        public BuilderBase(android.content.Context context, androidx.media3.common.Player player, CallbackT callbackt) {
            android.content.Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            this.context = applicationContext;
            player.getClass();
            this.player = player;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(player.canAdvertiseSession());
            this.id = "";
            this.callback = callbackt;
            this.tokenExtras = new android.os.Bundle();
            this.sessionExtras = new android.os.Bundle();
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            p076i4.S0 s9 = p076i4.S0.f22832l;
            this.customLayout = s9;
            this.mediaButtonPreferences = s9;
            this.playIfSuppressed = true;
            this.isPeriodicPositionUpdateEnabled = true;
            this.commandButtonsForMediaItems = s9;
        }

        private static p107m4.a getBitmapSizesToAvoidApi29(android.content.Context context) {
            java.util.concurrent.atomic.AtomicReference<p107m4.a> atomicReference = bitmapSizesToAvoidApi29;
            p107m4.a aVar = atomicReference.get();
            if (aVar != null) {
                return aVar;
            }
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService(android.view.WindowManager.class)).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getSize(point);
            android.graphics.Point point2 = new android.graphics.Point();
            defaultDisplay.getRealSize(point2);
            int i3 = point2.y;
            int i9 = point2.x;
            android.graphics.Point point3 = new android.graphics.Point(i3 - (i9 - point.x), i9 - (i3 - point.y));
            p107m4.a aVar2 = new p107m4.a(new int[]{java.lang.Math.max(point.x / 6, point.y / 6), java.lang.Math.max(point3.x / 6, point3.y / 6)});
            atomicReference.set(aVar2);
            return aVar2;
        }

        public abstract SessionT build();

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"bitmapLoader"})
        public final void ensureBitmapLoaderIsSizeLimited() {
            int bitmapDimensionLimit = androidx.media3.session.MediaSession.getBitmapDimensionLimit(this.context);
            androidx.media3.common.util.BitmapLoader bitmapLoader = this.bitmapLoader;
            if (bitmapLoader == null) {
                this.bitmapLoader = new androidx.media3.datasource.DataSourceBitmapLoader.Builder(this.context).setMaximumOutputDimension(bitmapDimensionLimit).setMakeShared(true).build();
            } else {
                this.bitmapLoader = new androidx.media3.session.SizeLimitedBitmapLoader(bitmapLoader, bitmapDimensionLimit, true);
            }
            if (android.os.Build.VERSION.SDK_INT == 29) {
                this.bitmapLoader = new androidx.media3.session.SizeAvoidingBitmapLoader(this.bitmapLoader, getBitmapSizesToAvoidApi29(this.context));
            }
            this.bitmapLoader = new androidx.media3.session.CacheBitmapLoader(this.bitmapLoader);
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

        public BuilderT setCommandButtonsForMediaItems(java.util.List<androidx.media3.session.CommandButton> list) {
            this.commandButtonsForMediaItems = p076i4.AbstractC2186b0.u(list);
            return this;
        }

        public BuilderT setCustomLayout(java.util.List<androidx.media3.session.CommandButton> list) {
            this.customLayout = p076i4.AbstractC2186b0.u(list);
            return this;
        }

        public BuilderT setExtras(android.os.Bundle bundle) {
            bundle.getClass();
            this.tokenExtras = new android.os.Bundle(bundle);
            return this;
        }

        public BuilderT setId(java.lang.String str) {
            str.getClass();
            this.id = str;
            return this;
        }

        public BuilderT setMediaButtonPreferences(java.util.List<androidx.media3.session.CommandButton> list) {
            this.mediaButtonPreferences = p076i4.AbstractC2186b0.u(list);
            return this;
        }

        public BuilderT setPeriodicPositionUpdateEnabled(boolean z6) {
            this.isPeriodicPositionUpdateEnabled = z6;
            return this;
        }

        public BuilderT setSessionActivity(android.app.PendingIntent pendingIntent) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(androidx.media3.session.MediaSession.Api31.isActivity(pendingIntent));
            }
            pendingIntent.getClass();
            this.sessionActivity = pendingIntent;
            return this;
        }

        public BuilderT setSessionExtras(android.os.Bundle bundle) {
            bundle.getClass();
            this.sessionExtras = new android.os.Bundle(bundle);
            return this;
        }

        public BuilderT setShowPlayButtonIfPlaybackIsSuppressed(boolean z6) {
            this.playIfSuppressed = z6;
            return this;
        }
    }

    public interface Callback {
        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ com.google.common.util.concurrent.J lambda$onSetMediaItems$0(int i3, long j, java.util.List list) {
            return com.google.common.util.concurrent.D.z(new androidx.media3.session.MediaSession.MediaItemsWithStartPosition(list, i3, j));
        }

        default com.google.common.util.concurrent.J onAddMediaItems(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List<androidx.media3.common.MediaItem> list) {
            java.util.Iterator<androidx.media3.common.MediaItem> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().localConfiguration == null) {
                    return com.google.common.util.concurrent.D.y(new java.lang.UnsupportedOperationException());
                }
            }
            return com.google.common.util.concurrent.D.z(list);
        }

        default androidx.media3.session.MediaSession.ConnectionResult onConnect(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
            return new androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder(mediaSession).build();
        }

        default com.google.common.util.concurrent.J onCustomCommand(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
            return com.google.common.util.concurrent.D.z(new androidx.media3.session.SessionResult(-6));
        }

        default void onDisconnected(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        }

        default boolean onMediaButtonEvent(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, android.content.Intent intent) {
            return false;
        }

        @java.lang.Deprecated
        default com.google.common.util.concurrent.J onPlaybackResumption(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
            return com.google.common.util.concurrent.D.y(new java.lang.UnsupportedOperationException());
        }

        @java.lang.Deprecated
        default int onPlayerCommandRequest(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
            return 0;
        }

        default void onPlayerInteractionFinished(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.Player.Commands commands) {
        }

        default void onPostConnect(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        }

        default com.google.common.util.concurrent.J onSetMediaItems(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List<androidx.media3.common.MediaItem> list, final int i3, final long j) {
            return androidx.media3.common.util.Util.transformFutureAsync(onAddMediaItems(mediaSession, controllerInfo, list), new com.google.common.util.concurrent.w() { // from class: androidx.media3.session.A0
                @Override // com.google.common.util.concurrent.w
                public final com.google.common.util.concurrent.J apply(java.lang.Object obj) {
                    return androidx.media3.session.MediaSession.Callback.lambda$onSetMediaItems$0(i3, j, (java.util.List) obj);
                }
            });
        }

        default com.google.common.util.concurrent.J onSetRating(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.lang.String str, androidx.media3.common.Rating rating) {
            return com.google.common.util.concurrent.D.z(new androidx.media3.session.SessionResult(-6));
        }

        default com.google.common.util.concurrent.J onCustomCommand(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, androidx.media3.session.MediaSession.ProgressReporter progressReporter) {
            return onCustomCommand(mediaSession, controllerInfo, sessionCommand, bundle);
        }

        default com.google.common.util.concurrent.J onPlaybackResumption(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, boolean z6) {
            return onPlaybackResumption(mediaSession, controllerInfo);
        }

        default com.google.common.util.concurrent.J onSetRating(androidx.media3.session.MediaSession mediaSession, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.Rating rating) {
            return com.google.common.util.concurrent.D.z(new androidx.media3.session.SessionResult(-6));
        }
    }

    public static final class ConnectionResult {
        public final androidx.media3.common.Player.Commands availablePlayerCommands;
        public final androidx.media3.session.SessionCommands availableSessionCommands;
        public final p076i4.AbstractC2186b0 customLayout;
        public final boolean isAccepted;
        public final p076i4.AbstractC2186b0 mediaButtonPreferences;
        public final android.app.PendingIntent sessionActivity;
        public final android.os.Bundle sessionExtras;
        public static final androidx.media3.session.SessionCommands DEFAULT_SESSION_COMMANDS = new androidx.media3.session.SessionCommands.Builder().addAllSessionCommands().build();
        public static final androidx.media3.session.SessionCommands DEFAULT_SESSION_AND_LIBRARY_COMMANDS = new androidx.media3.session.SessionCommands.Builder().addAllLibraryCommands().addAllSessionCommands().build();
        public static final androidx.media3.common.Player.Commands DEFAULT_PLAYER_COMMANDS = new androidx.media3.common.Player.Commands.Builder().addAllCommands().build();

        public static class AcceptedResultBuilder {
            private androidx.media3.common.Player.Commands availablePlayerCommands = androidx.media3.session.MediaSession.ConnectionResult.DEFAULT_PLAYER_COMMANDS;
            private androidx.media3.session.SessionCommands availableSessionCommands;
            private p076i4.AbstractC2186b0 customLayout;
            private p076i4.AbstractC2186b0 mediaButtonPreferences;
            private android.app.PendingIntent sessionActivity;
            private android.os.Bundle sessionExtras;

            public AcceptedResultBuilder(androidx.media3.session.MediaSession mediaSession) {
                this.availableSessionCommands = mediaSession instanceof androidx.media3.session.MediaLibraryService.MediaLibrarySession ? androidx.media3.session.MediaSession.ConnectionResult.DEFAULT_SESSION_AND_LIBRARY_COMMANDS : androidx.media3.session.MediaSession.ConnectionResult.DEFAULT_SESSION_COMMANDS;
            }

            public androidx.media3.session.MediaSession.ConnectionResult build() {
                return new androidx.media3.session.MediaSession.ConnectionResult(true, this.availableSessionCommands, this.availablePlayerCommands, this.customLayout, this.mediaButtonPreferences, this.sessionExtras, this.sessionActivity);
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setAvailablePlayerCommands(androidx.media3.common.Player.Commands commands) {
                commands.getClass();
                this.availablePlayerCommands = commands;
                return this;
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setAvailableSessionCommands(androidx.media3.session.SessionCommands sessionCommands) {
                sessionCommands.getClass();
                this.availableSessionCommands = sessionCommands;
                return this;
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setCustomLayout(java.util.List<androidx.media3.session.CommandButton> list) {
                this.customLayout = list == null ? null : p076i4.AbstractC2186b0.u(list);
                return this;
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setMediaButtonPreferences(java.util.List<androidx.media3.session.CommandButton> list) {
                this.mediaButtonPreferences = list == null ? null : p076i4.AbstractC2186b0.u(list);
                return this;
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setSessionActivity(android.app.PendingIntent pendingIntent) {
                this.sessionActivity = pendingIntent;
                return this;
            }

            public androidx.media3.session.MediaSession.ConnectionResult.AcceptedResultBuilder setSessionExtras(android.os.Bundle bundle) {
                this.sessionExtras = bundle;
                return this;
            }
        }

        public static androidx.media3.session.MediaSession.ConnectionResult accept(androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
            return new androidx.media3.session.MediaSession.ConnectionResult(true, sessionCommands, commands, null, null, null, null);
        }

        public static androidx.media3.session.MediaSession.ConnectionResult reject() {
            androidx.media3.session.SessionCommands sessionCommands = androidx.media3.session.SessionCommands.EMPTY;
            androidx.media3.common.Player.Commands commands = androidx.media3.common.Player.Commands.EMPTY;
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            p076i4.S0 s9 = p076i4.S0.f22832l;
            return new androidx.media3.session.MediaSession.ConnectionResult(false, sessionCommands, commands, s9, s9, android.os.Bundle.EMPTY, null);
        }

        private ConnectionResult(boolean z6, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands, p076i4.AbstractC2186b0 abstractC2186b0, p076i4.AbstractC2186b0 abstractC2186b1, android.os.Bundle bundle, android.app.PendingIntent pendingIntent) {
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
        default void onAudioAttributesChanged(int i3, androidx.media3.common.AudioAttributes audioAttributes) {
        }

        default void onAudioSessionIdChanged(int i3, int i9) {
        }

        default void onAvailableCommandsChangedFromPlayer(int i3, androidx.media3.common.Player.Commands commands) {
        }

        default void onAvailableCommandsChangedFromSession(int i3, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        }

        default void onChildrenChanged(int i3, java.lang.String str, int i9, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        }

        default void onDeviceInfoChanged(int i3, androidx.media3.common.DeviceInfo deviceInfo) {
        }

        default void onDeviceVolumeChanged(int i3, int i9, boolean z6) {
        }

        default void onDisconnected(int i3) {
        }

        default void onError(int i3, androidx.media3.session.SessionError sessionError) {
        }

        default void onIsLoadingChanged(int i3, boolean z6) {
        }

        default void onIsPlayingChanged(int i3, boolean z6) {
        }

        default void onLibraryResult(int i3, androidx.media3.session.LibraryResult<?> libraryResult) {
        }

        default void onMediaItemTransition(int i3, androidx.media3.common.MediaItem mediaItem, int i9) {
        }

        default void onMediaMetadataChanged(int i3, androidx.media3.common.MediaMetadata mediaMetadata) {
        }

        default void onPeriodicSessionPositionInfoChanged(int i3, androidx.media3.session.SessionPositionInfo sessionPositionInfo, boolean z6, boolean z9, int i9) {
        }

        default void onPlayWhenReadyChanged(int i3, boolean z6, int i9) {
        }

        default void onPlaybackParametersChanged(int i3, androidx.media3.common.PlaybackParameters playbackParameters) {
        }

        default void onPlaybackStateChanged(int i3, int i9, androidx.media3.common.PlaybackException playbackException) {
        }

        default void onPlaybackSuppressionReasonChanged(int i3, int i9) {
        }

        default void onPlayerChanged(int i3, androidx.media3.session.PlayerWrapper playerWrapper, androidx.media3.session.PlayerWrapper playerWrapper2) {
        }

        default void onPlayerError(int i3, androidx.media3.common.PlaybackException playbackException) {
        }

        default void onPlayerInfoChanged(int i3, androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Commands commands, boolean z6, boolean z9) {
        }

        default void onPlaylistMetadataChanged(int i3, androidx.media3.common.MediaMetadata mediaMetadata) {
        }

        default void onPositionDiscontinuity(int i3, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i9) {
        }

        default void onRenderedFirstFrame(int i3) {
        }

        default void onRepeatModeChanged(int i3, int i9) {
        }

        default void onSearchResultChanged(int i3, java.lang.String str, int i9, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        }

        default void onSeekBackIncrementChanged(int i3, long j) {
        }

        default void onSeekForwardIncrementChanged(int i3, long j) {
        }

        default void onSessionActivityChanged(int i3, android.app.PendingIntent pendingIntent) {
        }

        default void onSessionExtrasChanged(int i3, android.os.Bundle bundle) {
        }

        default void onSessionResult(int i3, androidx.media3.session.SessionResult sessionResult) {
        }

        default void onShuffleModeEnabledChanged(int i3, boolean z6) {
        }

        default void onSurfaceSizeChanged(int i3, int i9, int i10) {
        }

        default void onTimelineChanged(int i3, androidx.media3.common.Timeline timeline, int i9) {
        }

        default void onTrackSelectionParametersChanged(int i3, androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        }

        default void onTracksChanged(int i3, androidx.media3.common.Tracks tracks) {
        }

        default void onVideoSizeChanged(int i3, androidx.media3.common.VideoSize videoSize) {
        }

        default void onVolumeChanged(int i3, float f9) {
        }

        default void sendCustomCommand(int i3, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        }

        default void sendCustomCommandProgressUpdate(int i3, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, android.os.Bundle bundle2) {
        }

        default void setCustomLayout(int i3, java.util.List<androidx.media3.session.CommandButton> list) {
        }

        default void setMediaButtonPreferences(int i3, java.util.List<androidx.media3.session.CommandButton> list) {
        }
    }

    public static final class ControllerInfo {
        public static final int LEGACY_CONTROLLER_INTERFACE_VERSION = 0;
        public static final java.lang.String LEGACY_CONTROLLER_PACKAGE_NAME = "android.media.session.MediaController";
        public static final int LEGACY_CONTROLLER_VERSION = 0;
        private final android.os.Bundle connectionHints;
        private final androidx.media3.session.MediaSession.ControllerCb controllerCb;
        private final int interfaceVersion;
        private final boolean isPackageNameVerified;
        private final boolean isTrusted;
        private final int libraryVersion;
        private final int maxCommandsForMediaItems;
        private final androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo;

        public ControllerInfo(androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo remoteUserInfo, int i3, int i9, boolean z6, androidx.media3.session.MediaSession.ControllerCb controllerCb, android.os.Bundle bundle, int i10, boolean z9) {
            this.remoteUserInfo = remoteUserInfo;
            this.libraryVersion = i3;
            this.interfaceVersion = i9;
            this.isTrusted = z6;
            this.controllerCb = controllerCb;
            this.connectionHints = bundle;
            this.maxCommandsForMediaItems = i10;
            this.isPackageNameVerified = z9;
        }

        public static androidx.media3.session.MediaSession.ControllerInfo createLegacyControllerInfo() {
            return new androidx.media3.session.MediaSession.ControllerInfo(new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", -1, -1), 0, 0, false, null, android.os.Bundle.EMPTY, 0, false);
        }

        public static androidx.media3.session.MediaSession.ControllerInfo createTestOnlyControllerInfo(java.lang.String str, int i3, int i9, int i10, int i11, boolean z6, android.os.Bundle bundle, boolean z9) {
            return new androidx.media3.session.MediaSession.ControllerInfo(new androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo(str, i3, i9), i10, i11, z6, null, bundle, 0, z9);
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.media3.session.MediaSession.ControllerInfo)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            androidx.media3.session.MediaSession.ControllerInfo controllerInfo = (androidx.media3.session.MediaSession.ControllerInfo) obj;
            androidx.media3.session.MediaSession.ControllerCb controllerCb = this.controllerCb;
            return (controllerCb == null && controllerInfo.controllerCb == null) ? this.remoteUserInfo.equals(controllerInfo.remoteUserInfo) : java.util.Objects.equals(controllerCb, controllerInfo.controllerCb);
        }

        public android.os.Bundle getConnectionHints() {
            return new android.os.Bundle(this.connectionHints);
        }

        public androidx.media3.session.MediaSession.ControllerCb getControllerCb() {
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

        public java.lang.String getPackageName() {
            return this.remoteUserInfo.getPackageName();
        }

        public androidx.media3.session.legacy.MediaSessionManager.RemoteUserInfo getRemoteUserInfo() {
            return this.remoteUserInfo;
        }

        public int getUid() {
            return this.remoteUserInfo.getUid();
        }

        public int hashCode() {
            return java.util.Objects.hash(this.controllerCb, this.remoteUserInfo);
        }

        public boolean isPackageNameVerified() {
            return this.isPackageNameVerified;
        }

        public boolean isTrusted() {
            return this.isTrusted;
        }

        public java.lang.String toString() {
            return "ControllerInfo {pkg=" + this.remoteUserInfo.getPackageName() + ", uid=" + this.remoteUserInfo.getUid() + "}";
        }
    }

    public interface Listener {
        void onNotificationRefreshRequired(androidx.media3.session.MediaSession mediaSession);

        boolean onPlayRequested(androidx.media3.session.MediaSession mediaSession);
    }

    public static final class MediaItemsWithStartPosition {
        public final p076i4.AbstractC2186b0 mediaItems;
        public final int startIndex;
        public final long startPositionMs;

        public MediaItemsWithStartPosition(java.util.List<androidx.media3.common.MediaItem> list, int i3, long j) {
            this.mediaItems = p076i4.AbstractC2186b0.u(list);
            this.startIndex = i3;
            this.startPositionMs = j;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.session.MediaSession.MediaItemsWithStartPosition)) {
                return false;
            }
            androidx.media3.session.MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition = (androidx.media3.session.MediaSession.MediaItemsWithStartPosition) obj;
            return this.mediaItems.equals(mediaItemsWithStartPosition.mediaItems) && this.startIndex == mediaItemsWithStartPosition.startIndex && this.startPositionMs == mediaItemsWithStartPosition.startPositionMs;
        }

        public int hashCode() {
            return com.google.android.gms.internal.play_billing.V0.v(this.startPositionMs) + (((this.mediaItems.hashCode() * 31) + this.startIndex) * 31);
        }
    }

    public interface ProgressReporter {
        void sendProgressUpdate(android.os.Bundle bundle);
    }

    public MediaSession(android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, p076i4.AbstractC2186b0 abstractC2186b0, p076i4.AbstractC2186b0 abstractC2186b1, p076i4.AbstractC2186b0 abstractC2186b2, androidx.media3.session.MediaSession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z6, boolean z9, int i3, boolean z10) {
        synchronized (STATIC_LOCK) {
            java.util.HashMap<java.lang.String, androidx.media3.session.MediaSession> map = SESSION_ID_TO_SESSION_MAP;
            if (map.containsKey(str)) {
                throw new java.lang.IllegalStateException("Session ID must be unique. ID=" + str);
            }
            map.put(str, this);
        }
        this.impl = createImpl(context, str, player, pendingIntent, abstractC2186b0, abstractC2186b1, abstractC2186b2, callback, bundle, bundle2, bitmapLoader, z6, z9, i3, z10);
    }

    public static int getBitmapDimensionLimit(android.content.Context context) {
        return androidx.media3.session.MediaSessionImpl.getBitmapDimensionLimit(context);
    }

    public static androidx.media3.session.MediaSession getSession(android.net.Uri uri) {
        synchronized (STATIC_LOCK) {
            try {
                for (androidx.media3.session.MediaSession mediaSession : SESSION_ID_TO_SESSION_MAP.values()) {
                    if (java.util.Objects.equals(mediaSession.getUri(), uri)) {
                        return mediaSession;
                    }
                }
                return null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void broadcastCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        sessionCommand.getClass();
        bundle.getClass();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(sessionCommand.commandCode == 0, "command must be a custom command");
        this.impl.broadcastCustomCommand(sessionCommand, bundle);
    }

    public final void clearListener() {
        this.impl.clearMediaSessionListener();
    }

    public androidx.media3.session.MediaSessionImpl createImpl(android.content.Context context, java.lang.String str, androidx.media3.common.Player player, android.app.PendingIntent pendingIntent, p076i4.AbstractC2186b0 abstractC2186b0, p076i4.AbstractC2186b0 abstractC2186b1, p076i4.AbstractC2186b0 abstractC2186b2, androidx.media3.session.MediaSession.Callback callback, android.os.Bundle bundle, android.os.Bundle bundle2, androidx.media3.common.util.BitmapLoader bitmapLoader, boolean z6, boolean z9, int i3, boolean z10) {
        return new androidx.media3.session.MediaSessionImpl(this, context, str, player, pendingIntent, abstractC2186b0, abstractC2186b1, abstractC2186b2, callback, bundle, bundle2, bitmapLoader, z6, z9, z10);
    }

    public final androidx.media3.common.util.BitmapLoader getBitmapLoader() {
        return this.impl.getBitmapLoader();
    }

    public final java.util.List<androidx.media3.session.MediaSession.ControllerInfo> getConnectedControllers() {
        return this.impl.getConnectedControllers();
    }

    public final androidx.media3.session.MediaSession.ControllerInfo getControllerForCurrentRequest() {
        return this.impl.getControllerForCurrentRequest();
    }

    public p076i4.AbstractC2186b0 getCustomLayout() {
        return this.impl.getCustomLayout();
    }

    public final java.lang.String getId() {
        return this.impl.getId();
    }

    public androidx.media3.session.MediaSessionImpl getImpl() {
        return this.impl;
    }

    public final android.os.IBinder getLegacyBrowserServiceBinder() {
        return this.impl.getLegacyBrowserServiceBinder();
    }

    public p076i4.AbstractC2186b0 getMediaButtonPreferences() {
        return this.impl.getMediaButtonPreferences();
    }

    public androidx.media3.session.MediaSession.ControllerInfo getMediaNotificationControllerInfo() {
        return this.impl.getMediaNotificationControllerInfo();
    }

    public final android.media.session.MediaSession.Token getPlatformToken() {
        return this.impl.getPlatformToken();
    }

    public final androidx.media3.common.Player getPlayer() {
        return this.impl.getPlayerWrapper().getWrappedPlayer();
    }

    public final android.app.PendingIntent getSessionActivity() {
        return this.impl.getSessionActivity();
    }

    public android.os.Bundle getSessionExtras() {
        return this.impl.getSessionExtras();
    }

    public final boolean getShowPlayButtonIfPlaybackIsSuppressed() {
        return this.impl.shouldPlayIfSuppressed();
    }

    public final androidx.media3.session.SessionToken getToken() {
        return this.impl.getToken();
    }

    public final android.net.Uri getUri() {
        return this.impl.getUri();
    }

    public final void handleControllerConnectionFromService(androidx.media3.session.IMediaController iMediaController, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        this.impl.connectFromService(iMediaController, controllerInfo);
    }

    public final boolean isAutoCompanionController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return this.impl.isAutoCompanionController(controllerInfo);
    }

    public final boolean isAutomotiveController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        return this.impl.isAutomotiveController(controllerInfo);
    }

    public boolean isMediaNotificationController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
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
        } catch (java.lang.Exception unused) {
        }
    }

    public final com.google.common.util.concurrent.J sendCustomCommand(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        controllerInfo.getClass();
        sessionCommand.getClass();
        bundle.getClass();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(sessionCommand.commandCode == 0, "command must be a custom command");
        return this.impl.sendCustomCommand(controllerInfo, sessionCommand, bundle);
    }

    public final void sendError(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionError sessionError) {
        this.impl.sendError(controllerInfo, sessionError);
    }

    public final void setAvailableCommands(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(controllerInfo, "controller must not be null");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(sessionCommands, "sessionCommands must not be null");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(commands, "playerCommands must not be null");
        this.impl.setAvailableCommands(controllerInfo, sessionCommands, commands);
    }

    public final com.google.common.util.concurrent.J setCustomLayout(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List<androidx.media3.session.CommandButton> list) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(controllerInfo, "controller must not be null");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(list, "layout must not be null");
        return this.impl.setCustomLayout(controllerInfo, p076i4.AbstractC2186b0.u(list));
    }

    public final void setLegacyControllerConnectionTimeoutMs(long j) {
        this.impl.setLegacyControllerConnectionTimeoutMs(j);
    }

    public final void setListener(androidx.media3.session.MediaSession.Listener listener) {
        this.impl.setMediaSessionListener(listener);
    }

    public final com.google.common.util.concurrent.J setMediaButtonPreferences(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, java.util.List<androidx.media3.session.CommandButton> list) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(controllerInfo, "controller must not be null");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(list, "media button preferences must not be null");
        return this.impl.setMediaButtonPreferences(controllerInfo, p076i4.AbstractC2186b0.u(list));
    }

    public final void setPlaybackException(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.PlaybackException playbackException) {
        this.impl.setPlaybackException(controllerInfo, playbackException);
    }

    public final void setPlayer(androidx.media3.common.Player player) {
        player.getClass();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(player.canAdvertiseSession());
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(player.getApplicationLooper() == getPlayer().getApplicationLooper());
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(player.getApplicationLooper() == android.os.Looper.myLooper());
        this.impl.setPlayer(player);
    }

    public final void setSessionActivity(android.app.PendingIntent pendingIntent) {
        if (android.os.Build.VERSION.SDK_INT >= 31 && pendingIntent != null) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(androidx.media3.session.MediaSession.Api31.isActivity(pendingIntent));
        }
        this.impl.setSessionActivity(pendingIntent);
    }

    public final void setSessionExtras(android.os.Bundle bundle) {
        this.impl.setSessionExtras(new android.os.Bundle(bundle));
    }

    public final void setSessionPositionUpdateDelayMs(long j) {
        this.impl.setSessionPositionUpdateDelayMsOnHandler(j);
    }

    public final void sendError(androidx.media3.session.SessionError sessionError) {
        this.impl.sendError(sessionError);
    }

    public final void setPlaybackException(androidx.media3.common.PlaybackException playbackException) {
        this.impl.setPlaybackException(playbackException);
    }

    public final void setSessionExtras(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, android.os.Bundle bundle) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(controllerInfo, "controller must not be null");
        this.impl.setSessionExtras(controllerInfo, new android.os.Bundle(bundle));
    }

    public final void setCustomLayout(java.util.List<androidx.media3.session.CommandButton> list) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(list, "layout must not be null");
        this.impl.setCustomLayout(p076i4.AbstractC2186b0.u(list));
    }

    public final void setMediaButtonPreferences(java.util.List<androidx.media3.session.CommandButton> list) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(list, "media button preferences must not be null");
        this.impl.setMediaButtonPreferences(p076i4.AbstractC2186b0.u(list));
    }

    public final void setSessionActivity(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, android.app.PendingIntent pendingIntent) {
        if (android.os.Build.VERSION.SDK_INT >= 31 && pendingIntent != null) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(androidx.media3.session.MediaSession.Api31.isActivity(pendingIntent));
        }
        this.impl.setSessionActivity(controllerInfo, pendingIntent);
    }
}
