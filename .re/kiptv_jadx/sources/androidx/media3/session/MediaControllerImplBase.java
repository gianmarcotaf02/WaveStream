package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerImplBase implements androidx.media3.session.MediaController.MediaControllerImpl {
    private static final long RELEASE_TIMEOUT_MS = 30000;
    public static final java.lang.String TAG = "MCImplBase";
    private final boolean allowDeviceVolumeCommandsForLocalPlayback;
    private p076i4.AbstractC2194f0 commandButtonsForMediaItemsMap;
    private androidx.media3.session.SessionToken connectedToken;
    private final android.os.Bundle connectionHints;
    private final android.content.Context context;
    protected final androidx.media3.session.MediaControllerStub controllerStub;
    private long currentPositionMs;
    private p076i4.AbstractC2186b0 customLayoutOriginal;
    private final android.os.IBinder.DeathRecipient deathRecipient;
    private final android.os.Handler fallbackPlaybackInfoUpdateHandler;
    private final androidx.media3.session.MediaControllerImplBase.FlushCommandQueueHandler flushCommandQueueHandler;
    private androidx.media3.session.IMediaSession iSession;
    private final androidx.media3.session.MediaController instance;
    private androidx.media3.common.Player.Commands intersectedPlayerCommands;
    private long lastSetPlayWhenReadyCalledTimeMs;
    private final androidx.media3.common.util.ListenerSet<androidx.media3.common.Player.Listener> listeners;
    private p076i4.AbstractC2186b0 mediaButtonPreferencesOriginal;
    private final android.util.SparseArray<androidx.media3.session.MediaController.ProgressListener> pendingCustomActionProgressListeners;
    private final p136q.C2662f pendingMaskingSequencedFutureNumbers;
    private androidx.media3.session.PlayerInfo pendingPlayerInfo;
    private android.media.session.MediaController platformController;
    private androidx.media3.common.Player.Commands playerCommandsFromPlayer;
    private androidx.media3.common.Player.Commands playerCommandsFromSession;
    private boolean released;
    private p076i4.AbstractC2186b0 resolvedCustomLayout;
    private p076i4.AbstractC2186b0 resolvedMediaButtonPreferences;
    protected final androidx.media3.session.SequencedFutureManager sequencedFutureManager;
    private androidx.media3.session.MediaControllerImplBase.SessionServiceConnection serviceConnection;
    private android.app.PendingIntent sessionActivity;
    private android.os.Bundle sessionExtras;
    private final androidx.media3.session.MediaControllerImplBase.SurfaceCallback surfaceCallback;
    private final androidx.media3.session.SessionToken token;
    private android.view.Surface videoSurface;
    private android.view.SurfaceHolder videoSurfaceHolder;
    private android.view.TextureView videoTextureView;
    private androidx.media3.session.PlayerInfo playerInfo = androidx.media3.session.PlayerInfo.DEFAULT;
    private androidx.media3.common.util.Size surfaceSize = androidx.media3.common.util.Size.UNKNOWN;
    private androidx.media3.session.SessionCommands sessionCommands = androidx.media3.session.SessionCommands.EMPTY;

    public class FlushCommandQueueHandler {
        private static final int MSG_FLUSH_COMMAND_QUEUE = 1;
        private final android.os.Handler handler;

        public FlushCommandQueueHandler(android.os.Looper looper) {
            this.handler = new android.os.Handler(looper, new androidx.media3.session.Z(0, this));
        }

        private void flushCommandQueue() {
            if (androidx.media3.session.MediaControllerImplBase.this.iSession == null || !androidx.media3.session.MediaControllerImplBase.this.iSession.asBinder().isBinderAlive()) {
                return;
            }
            try {
                androidx.media3.session.MediaControllerImplBase.this.iSession.flushCommandQueue(androidx.media3.session.MediaControllerImplBase.this.controllerStub);
            } catch (android.os.RemoteException e6) {
                androidx.media3.common.util.Log.w(androidx.media3.session.MediaControllerImplBase.TAG, "Error in sending flushCommandQueue", e6);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean handleMessage(android.os.Message message) {
            if (message.what == 1) {
                flushCommandQueue();
            }
            return true;
        }

        public void release() {
            if (this.handler.hasMessages(1)) {
                flushCommandQueue();
            }
            this.handler.removeCallbacksAndMessages(null);
        }

        public void sendFlushCommandQueueMessage() {
            if (androidx.media3.session.MediaControllerImplBase.this.iSession == null || this.handler.hasMessages(1)) {
                return;
            }
            this.handler.sendEmptyMessage(1);
        }
    }

    public static final class PeriodInfo {
        private final int index;
        private final long periodPositionUs;

        public PeriodInfo(int i3, long j) {
            this.index = i3;
            this.periodPositionUs = j;
        }

        public static /* synthetic */ int access$100(androidx.media3.session.MediaControllerImplBase.PeriodInfo periodInfo) {
            return periodInfo.index;
        }

        public static /* synthetic */ long access$200(androidx.media3.session.MediaControllerImplBase.PeriodInfo periodInfo) {
            return periodInfo.periodPositionUs;
        }
    }

    public interface RemoteSessionTask {
        void run(androidx.media3.session.IMediaSession iMediaSession, int i3);
    }

    public class SessionServiceConnection implements android.content.ServiceConnection {
        private final android.os.Bundle connectionHints;

        public SessionServiceConnection(android.os.Bundle bundle) {
            this.connectionHints = bundle;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(android.content.ComponentName componentName) {
            androidx.media3.session.MediaController mediaControllerImplBase = androidx.media3.session.MediaControllerImplBase.this.getInstance();
            androidx.media3.session.MediaController mediaControllerImplBase2 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
            java.util.Objects.requireNonNull(mediaControllerImplBase2);
            mediaControllerImplBase.runOnApplicationLooper(new androidx.media3.session.k1(1, mediaControllerImplBase2));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            androidx.media3.session.MediaController mediaControllerImplBase;
            androidx.media3.session.k1 k1Var;
            try {
                try {
                    if (androidx.media3.session.MediaControllerImplBase.this.token.getPackageName().equals(componentName.getPackageName())) {
                        androidx.media3.session.IMediaSessionService iMediaSessionServiceAsInterface = androidx.media3.session.IMediaSessionService.Stub.asInterface(iBinder);
                        if (iMediaSessionServiceAsInterface != null) {
                            iMediaSessionServiceAsInterface.connect(androidx.media3.session.MediaControllerImplBase.this.controllerStub, new androidx.media3.session.ConnectionRequest(androidx.media3.session.MediaControllerImplBase.this.getContext().getPackageName(), android.os.Process.myPid(), this.connectionHints, androidx.media3.session.MediaControllerImplBase.this.instance.getMaxCommandsForMediaItems()).toBundle());
                            return;
                        } else {
                            androidx.media3.common.util.Log.e(androidx.media3.session.MediaControllerImplBase.TAG, "Service interface is missing.");
                            mediaControllerImplBase = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                            androidx.media3.session.MediaController mediaControllerImplBase2 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                            java.util.Objects.requireNonNull(mediaControllerImplBase2);
                            k1Var = new androidx.media3.session.k1(1, mediaControllerImplBase2);
                        }
                    } else {
                        androidx.media3.common.util.Log.e(androidx.media3.session.MediaControllerImplBase.TAG, "Expected connection to " + androidx.media3.session.MediaControllerImplBase.this.token.getPackageName() + " but is connected to " + componentName);
                        mediaControllerImplBase = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                        androidx.media3.session.MediaController mediaControllerImplBase3 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                        java.util.Objects.requireNonNull(mediaControllerImplBase3);
                        k1Var = new androidx.media3.session.k1(1, mediaControllerImplBase3);
                    }
                    mediaControllerImplBase.runOnApplicationLooper(k1Var);
                } catch (android.os.RemoteException unused) {
                    androidx.media3.common.util.Log.w(androidx.media3.session.MediaControllerImplBase.TAG, "Service " + componentName + " has died prematurely");
                    androidx.media3.session.MediaController mediaControllerImplBase4 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                    androidx.media3.session.MediaController mediaControllerImplBase5 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                    java.util.Objects.requireNonNull(mediaControllerImplBase5);
                    mediaControllerImplBase4.runOnApplicationLooper(new androidx.media3.session.k1(1, mediaControllerImplBase5));
                }
            } catch (java.lang.Throwable th) {
                androidx.media3.session.MediaController mediaControllerImplBase6 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                androidx.media3.session.MediaController mediaControllerImplBase7 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
                java.util.Objects.requireNonNull(mediaControllerImplBase7);
                mediaControllerImplBase6.runOnApplicationLooper(new androidx.media3.session.k1(1, mediaControllerImplBase7));
                throw th;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            androidx.media3.session.MediaController mediaControllerImplBase = androidx.media3.session.MediaControllerImplBase.this.getInstance();
            androidx.media3.session.MediaController mediaControllerImplBase2 = androidx.media3.session.MediaControllerImplBase.this.getInstance();
            java.util.Objects.requireNonNull(mediaControllerImplBase2);
            mediaControllerImplBase.runOnApplicationLooper(new androidx.media3.session.k1(1, mediaControllerImplBase2));
        }
    }

    public class SurfaceCallback implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener {
        private SurfaceCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfaceTextureSizeChanged$1(int i3, int i9, androidx.media3.session.IMediaSession iMediaSession, int i10) {
            iMediaSession.onSurfaceSizeChanged(androidx.media3.session.MediaControllerImplBase.this.controllerStub, i10, i3, i9);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$surfaceChanged$0(int i3, int i9, androidx.media3.session.IMediaSession iMediaSession, int i10) {
            iMediaSession.onSurfaceSizeChanged(androidx.media3.session.MediaControllerImplBase.this.controllerStub, i10, i3, i9);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i3, int i9) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoTextureView == null || androidx.media3.session.MediaControllerImplBase.this.videoTextureView.getSurfaceTexture() != surfaceTexture) {
                return;
            }
            androidx.media3.session.MediaControllerImplBase.this.videoSurface = new android.view.Surface(surfaceTexture);
            androidx.media3.session.MediaControllerImplBase mediaControllerImplBase = androidx.media3.session.MediaControllerImplBase.this;
            mediaControllerImplBase.setVideoSurfaceWithSize(mediaControllerImplBase.videoSurface, i3, i9);
            androidx.media3.session.MediaControllerImplBase.this.onSurfaceSizeChanged(i3, i9);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoTextureView != null && androidx.media3.session.MediaControllerImplBase.this.videoTextureView.getSurfaceTexture() == surfaceTexture) {
                androidx.media3.session.MediaControllerImplBase.this.videoSurface = null;
                androidx.media3.session.MediaControllerImplBase.this.setVideoSurfaceWithSize(null, 0, 0);
                androidx.media3.session.MediaControllerImplBase.this.onSurfaceSizeChanged(0, 0);
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i3, int i9) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoTextureView != null && androidx.media3.session.MediaControllerImplBase.this.videoTextureView.getSurfaceTexture() == surfaceTexture && androidx.media3.session.MediaControllerImplBase.this.isConnected()) {
                if (androidx.media3.session.MediaControllerImplBase.this.getSessionInterfaceVersion() >= 8) {
                    androidx.media3.session.MediaControllerImplBase.this.dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.C1568a0(this, i3, i9, 1));
                }
                androidx.media3.session.MediaControllerImplBase.this.onSurfaceSizeChanged(i3, i9);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i3, int i9, int i10) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoSurfaceHolder == surfaceHolder && androidx.media3.session.MediaControllerImplBase.this.isConnected()) {
                if (androidx.media3.session.MediaControllerImplBase.this.getSessionInterfaceVersion() >= 8) {
                    androidx.media3.session.MediaControllerImplBase.this.dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.C1568a0(this, i9, i10, 0));
                }
                androidx.media3.session.MediaControllerImplBase.this.onSurfaceSizeChanged(i9, i10);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoSurfaceHolder != surfaceHolder) {
                return;
            }
            androidx.media3.session.MediaControllerImplBase.this.videoSurface = surfaceHolder.getSurface();
            android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            androidx.media3.session.MediaControllerImplBase mediaControllerImplBase = androidx.media3.session.MediaControllerImplBase.this;
            mediaControllerImplBase.setVideoSurfaceWithSize(mediaControllerImplBase.videoSurface, surfaceFrame.width(), surfaceFrame.height());
            androidx.media3.session.MediaControllerImplBase.this.onSurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
            if (androidx.media3.session.MediaControllerImplBase.this.videoSurfaceHolder != surfaceHolder) {
                return;
            }
            androidx.media3.session.MediaControllerImplBase.this.videoSurface = null;
            androidx.media3.session.MediaControllerImplBase.this.setVideoSurfaceWithSize(null, 0, 0);
            androidx.media3.session.MediaControllerImplBase.this.onSurfaceSizeChanged(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaControllerImplBase(android.content.Context context, androidx.media3.session.MediaController mediaController, androidx.media3.session.SessionToken sessionToken, android.os.Bundle bundle, android.os.Looper looper, boolean z6) {
        this.allowDeviceVolumeCommandsForLocalPlayback = z6;
        p076i4.S0 s9 = p076i4.S0.f22832l;
        this.customLayoutOriginal = s9;
        this.mediaButtonPreferencesOriginal = s9;
        this.resolvedMediaButtonPreferences = s9;
        this.resolvedCustomLayout = s9;
        this.commandButtonsForMediaItemsMap = p076i4.X0.f22848n;
        androidx.media3.common.Player.Commands commands = androidx.media3.common.Player.Commands.EMPTY;
        this.playerCommandsFromSession = commands;
        this.playerCommandsFromPlayer = commands;
        this.intersectedPlayerCommands = createIntersectedCommandsWithControllerOverrides(commands, commands);
        this.listeners = new androidx.media3.common.util.ListenerSet<>(looper, androidx.media3.common.util.Clock.DEFAULT, new androidx.media3.session.C1595o(this, 17));
        this.fallbackPlaybackInfoUpdateHandler = new android.os.Handler(looper);
        this.instance = mediaController;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(context, "context must not be null");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(sessionToken, "token must not be null");
        this.context = context;
        this.sequencedFutureManager = new androidx.media3.session.SequencedFutureManager();
        this.controllerStub = new androidx.media3.session.MediaControllerStub(this);
        this.pendingMaskingSequencedFutureNumbers = new p136q.C2662f(0);
        this.token = sessionToken;
        this.connectionHints = bundle;
        this.deathRecipient = new android.os.IBinder.DeathRecipient() { // from class: androidx.media3.session.X
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                this.f16966a.lambda$new$1();
            }
        };
        this.surfaceCallback = new androidx.media3.session.MediaControllerImplBase.SurfaceCallback();
        this.sessionExtras = android.os.Bundle.EMPTY;
        this.serviceConnection = sessionToken.getType() != 0 ? new androidx.media3.session.MediaControllerImplBase.SessionServiceConnection(bundle) : null;
        this.flushCommandQueueHandler = new androidx.media3.session.MediaControllerImplBase.FlushCommandQueueHandler(looper);
        this.currentPositionMs = androidx.media3.common.C.TIME_UNSET;
        this.lastSetPlayWhenReadyCalledTimeMs = androidx.media3.common.C.TIME_UNSET;
        this.pendingCustomActionProgressListeners = new android.util.SparseArray<>();
    }

    private void addMediaItemsInternal(int i3, java.util.List<androidx.media3.common.MediaItem> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.playerInfo.timeline.isEmpty()) {
            setMediaItemsInternal(list, -1, androidx.media3.common.C.TIME_UNSET, false);
        } else {
            updatePlayerInfo(maskPlayerInfoForAddedItems(this.playerInfo, java.lang.Math.min(i3, this.playerInfo.timeline.getWindowCount()), list, getCurrentPosition(), getContentPosition()), 0, null, null, this.playerInfo.timeline.isEmpty() ? 3 : null);
        }
    }

    private void clearSurfacesAndCallbacks() {
        android.view.TextureView textureView = this.videoTextureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
            this.videoTextureView = null;
        }
        android.view.SurfaceHolder surfaceHolder = this.videoSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.surfaceCallback);
            this.videoSurfaceHolder = null;
        }
        if (this.videoSurface != null) {
            this.videoSurface = null;
        }
    }

    private static int convertRepeatModeForNavigation(int i3) {
        if (i3 == 1) {
            return 0;
        }
        return i3;
    }

    private androidx.media3.common.Player.Commands createIntersectedCommandsWithControllerOverrides(androidx.media3.common.Player.Commands commands, androidx.media3.common.Player.Commands commands2) {
        androidx.media3.common.Player.Commands commandsIntersect = androidx.media3.session.MediaUtils.intersect(commands, commands2);
        boolean z6 = this.playerInfo.deviceInfo.playbackType == 0 && !this.allowDeviceVolumeCommandsForLocalPlayback;
        return (!commandsIntersect.contains(32) || (z6 && commandsIntersect.containsAny(25, 33, 26, 34))) ? commandsIntersect.buildUpon().add(32).removeIf(25, z6).removeIf(33, z6).removeIf(26, z6).removeIf(34, z6).build() : commandsIntersect;
    }

    private static androidx.media3.common.Timeline createMaskingTimeline(java.util.List<androidx.media3.common.Timeline.Window> list, java.util.List<androidx.media3.common.Timeline.Period> list2) {
        p076i4.Y y = new p076i4.Y(4);
        y.d(list);
        p076i4.S0 s0F = y.f();
        p076i4.Y y9 = new p076i4.Y(4);
        y9.d(list2);
        return new androidx.media3.common.Timeline.RemotableTimeline(s0F, y9.f(), androidx.media3.session.MediaUtils.generateUnshuffledIndices(list.size()));
    }

    private static androidx.media3.common.Timeline.Period createNewPeriod(int i3) {
        return new androidx.media3.common.Timeline.Period().set(null, null, i3, androidx.media3.common.C.TIME_UNSET, 0L, androidx.media3.common.AdPlaybackState.NONE, true);
    }

    private static androidx.media3.common.Timeline.Window createNewWindow(androidx.media3.common.MediaItem mediaItem) {
        return new androidx.media3.common.Timeline.Window().set(0, mediaItem, null, 0L, 0L, 0L, true, false, null, 0L, androidx.media3.common.C.TIME_UNSET, -1, -1, 0L);
    }

    private com.google.common.util.concurrent.J dispatchRemoteSessionTask(androidx.media3.session.IMediaSession iMediaSession, androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask, boolean z6) {
        if (iMediaSession == null) {
            return com.google.common.util.concurrent.D.z(new androidx.media3.session.SessionResult(-4));
        }
        notifyPlatformControllerAboutMedia3ChangeRequest();
        androidx.media3.session.SequencedFutureManager.SequencedFuture sequencedFutureCreateSequencedFuture = this.sequencedFutureManager.createSequencedFuture(new androidx.media3.session.SessionResult(1));
        int sequenceNumber = sequencedFutureCreateSequencedFuture.getSequenceNumber();
        if (z6) {
            if (this.pendingMaskingSequencedFutureNumbers.isEmpty()) {
                this.pendingPlayerInfo = this.playerInfo;
            }
            this.pendingMaskingSequencedFutureNumbers.add(java.lang.Integer.valueOf(sequenceNumber));
        }
        try {
            remoteSessionTask.run(iMediaSession, sequenceNumber);
            return sequencedFutureCreateSequencedFuture;
        } catch (android.os.RemoteException e6) {
            androidx.media3.common.util.Log.w(TAG, "Cannot connect to the service or the session is gone", e6);
            this.pendingMaskingSequencedFutureNumbers.remove(java.lang.Integer.valueOf(sequenceNumber));
            this.sequencedFutureManager.setFutureResult(sequenceNumber, new androidx.media3.session.SessionResult(-100));
            return sequencedFutureCreateSequencedFuture;
        }
    }

    private void dispatchRemoteSessionTaskWithPlayerCommand(androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask) {
        this.flushCommandQueueHandler.sendFlushCommandQueueMessage();
        dispatchRemoteSessionTask(this.iSession, remoteSessionTask, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask) {
        this.flushCommandQueueHandler.sendFlushCommandQueueMessage();
        com.google.common.util.concurrent.J jDispatchRemoteSessionTask = dispatchRemoteSessionTask(this.iSession, remoteSessionTask, true);
        try {
            androidx.media3.session.LegacyConversions.getFutureResult(jDispatchRemoteSessionTask, androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } catch (java.util.concurrent.ExecutionException e6) {
            throw new java.lang.IllegalStateException(e6);
        } catch (java.util.concurrent.TimeoutException e9) {
            if (jDispatchRemoteSessionTask instanceof androidx.media3.session.SequencedFutureManager.SequencedFuture) {
                int sequenceNumber = ((androidx.media3.session.SequencedFutureManager.SequencedFuture) jDispatchRemoteSessionTask).getSequenceNumber();
                this.pendingMaskingSequencedFutureNumbers.remove(java.lang.Integer.valueOf(sequenceNumber));
                this.sequencedFutureManager.setFutureResult(sequenceNumber, new androidx.media3.session.SessionResult(-1));
            }
            androidx.media3.common.util.Log.w(TAG, "Synchronous command takes too long on the session side.", e9);
        }
    }

    private com.google.common.util.concurrent.J dispatchRemoteSessionTaskWithSessionCommand(int i3, androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask) {
        return dispatchRemoteSessionTaskWithSessionCommandInternal(i3, null, remoteSessionTask);
    }

    private com.google.common.util.concurrent.J dispatchRemoteSessionTaskWithSessionCommandInternal(int i3, androidx.media3.session.SessionCommand sessionCommand, androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask) {
        return dispatchRemoteSessionTask(sessionCommand != null ? getSessionInterfaceWithSessionCommandIfAble(sessionCommand) : getSessionInterfaceWithSessionCommandIfAble(i3), remoteSessionTask, false);
    }

    private static int getCurrentMediaItemIndexInternal(androidx.media3.session.PlayerInfo playerInfo) {
        return playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
    }

    private static int getNewPeriodIndexWithoutRemovedPeriods(androidx.media3.common.Timeline timeline, int i3, int i9, int i10) {
        if (i3 == -1) {
            return i3;
        }
        while (i9 < i10) {
            androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
            timeline.getWindow(i9, window);
            i3 -= (window.lastPeriodIndex - window.firstPeriodIndex) + 1;
            i9++;
        }
        return i3;
    }

    private androidx.media3.session.MediaControllerImplBase.PeriodInfo getPeriodInfo(androidx.media3.common.Timeline timeline, int i3, long j) {
        if (timeline.isEmpty()) {
            return null;
        }
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        if (i3 == -1 || i3 >= timeline.getWindowCount()) {
            i3 = timeline.getFirstWindowIndex(getShuffleModeEnabled());
            j = timeline.getWindow(i3, window).getDefaultPositionMs();
        }
        return getPeriodInfo(timeline, window, period, i3, androidx.media3.common.util.Util.msToUs(j));
    }

    private static androidx.media3.common.Timeline.Period getPeriodWithNewWindowIndex(androidx.media3.common.Timeline timeline, int i3, int i9) {
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        timeline.getPeriod(i3, period);
        period.windowIndex = i9;
        return period;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSessionInterfaceVersion() {
        androidx.media3.session.SessionToken sessionToken = this.connectedToken;
        sessionToken.getClass();
        return sessionToken.getInterfaceVersion();
    }

    private boolean isPlayerCommandAvailable(int i3) {
        if (this.intersectedPlayerCommands.contains(i3)) {
            return true;
        }
        Y6.f.p(i3, "Controller isn't allowed to call command= ", TAG);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMediaItem$34(androidx.media3.common.MediaItem mediaItem, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.addMediaItem(this.controllerStub, i3, mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMediaItem$35(int i3, androidx.media3.common.MediaItem mediaItem, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.addMediaItemWithIndex(this.controllerStub, i9, i3, mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ android.os.Bundle lambda$addMediaItems$36(androidx.media3.common.MediaItem mediaItem) {
        return mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMediaItems$37(java.util.List list, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.addMediaItems(this.controllerStub, i3, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.C1615y(this, 5))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ android.os.Bundle lambda$addMediaItems$38(androidx.media3.common.MediaItem mediaItem) {
        return mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMediaItems$39(int i3, java.util.List list, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.addMediaItemsWithIndex(this.controllerStub, i9, i3, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.C1615y(this, 1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearMediaItems$42(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.clearMediaItems(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decreaseDeviceVolume$70(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.decreaseDeviceVolume(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decreaseDeviceVolume$71(int i3, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i3, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decreaseDeviceVolume$72(int i3, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.decreaseDeviceVolumeWithFlags(this.controllerStub, i9, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decreaseDeviceVolume$73(int i3, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i3, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increaseDeviceVolume$66(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.increaseDeviceVolume(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increaseDeviceVolume$67(int i3, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i3, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increaseDeviceVolume$68(int i3, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.increaseDeviceVolumeWithFlags(this.controllerStub, i9, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$increaseDeviceVolume$69(int i3, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i3, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moveMediaItem$43(int i3, int i9, androidx.media3.session.IMediaSession iMediaSession, int i10) {
        iMediaSession.moveMediaItem(this.controllerStub, i10, i3, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moveMediaItems$44(int i3, int i9, int i10, androidx.media3.session.IMediaSession iMediaSession, int i11) {
        iMediaSession.moveMediaItems(this.controllerStub, i11, i3, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mute$58(float f9, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        if (getSessionInterfaceVersion() >= 6) {
            iMediaSession.mute(this.controllerStub, i3);
        } else {
            iMediaSession.setVolume(this.controllerStub, i3, f9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(androidx.media3.common.Player.Listener listener, androidx.media3.common.FlagSet flagSet) {
        listener.onEvents(getInstance(), new androidx.media3.common.Player.Events(flagSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        androidx.media3.session.MediaController mediaControllerImplBase = getInstance();
        androidx.media3.session.MediaController mediaControllerImplBase2 = getInstance();
        java.util.Objects.requireNonNull(mediaControllerImplBase2);
        mediaControllerImplBase.runOnApplicationLooper(new androidx.media3.session.k1(1, mediaControllerImplBase2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$100(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onVolumeChanged(playerInfo.volume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$101(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onAudioAttributesChanged(playerInfo.audioAttributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$102(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onAudioSessionIdChanged(playerInfo.audioSessionId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$103(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onCues(playerInfo.cueGroup.cues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$104(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onCues(playerInfo.cueGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$105(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceInfoChanged(playerInfo.deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$106(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(playerInfo.deviceVolume, playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$107(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onVideoSizeChanged(playerInfo.videoSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$108(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onSeekBackIncrementChanged(playerInfo.seekBackIncrementMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$109(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onSeekForwardIncrementChanged(playerInfo.seekForwardIncrementMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$110(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onMaxSeekToPreviousPositionChanged(playerInfo.maxSeekToPreviousPositionMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$111(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onTrackSelectionParametersChanged(playerInfo.trackSelectionParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$84(androidx.media3.session.PlayerInfo playerInfo, java.lang.Integer num, androidx.media3.common.Player.Listener listener) {
        listener.onTimelineChanged(playerInfo.timeline, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$85(androidx.media3.session.PlayerInfo playerInfo, java.lang.Integer num, androidx.media3.common.Player.Listener listener) {
        listener.onPositionDiscontinuity(playerInfo.oldPositionInfo, playerInfo.newPositionInfo, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$86(androidx.media3.common.MediaItem mediaItem, java.lang.Integer num, androidx.media3.common.Player.Listener listener) {
        listener.onMediaItemTransition(mediaItem, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$89(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onTracksChanged(playerInfo.currentTracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$90(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onMediaMetadataChanged(playerInfo.mediaMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$91(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onIsLoadingChanged(playerInfo.isLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$92(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlaybackStateChanged(playerInfo.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$93(androidx.media3.session.PlayerInfo playerInfo, java.lang.Integer num, androidx.media3.common.Player.Listener listener) {
        listener.onPlayWhenReadyChanged(playerInfo.playWhenReady, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$94(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlaybackSuppressionReasonChanged(playerInfo.playbackSuppressionReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$95(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onIsPlayingChanged(playerInfo.isPlaying);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$96(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlaybackParametersChanged(playerInfo.playbackParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$97(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onRepeatModeChanged(playerInfo.repeatMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$98(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onShuffleModeEnabledChanged(playerInfo.shuffleModeEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyPlayerInfoListenersWithReasons$99(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlaylistMetadataChanged(playerInfo.playlistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromPlayer$120(androidx.media3.common.Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.intersectedPlayerCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromPlayer$121(androidx.media3.session.MediaController.Listener listener) {
        listener.onCustomLayoutChanged(getInstance(), this.resolvedCustomLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromPlayer$122(androidx.media3.session.MediaController.Listener listener) {
        listener.onMediaButtonPreferencesChanged(getInstance(), this.resolvedMediaButtonPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromSession$116(androidx.media3.common.Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.intersectedPlayerCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromSession$117(androidx.media3.session.SessionCommands sessionCommands, androidx.media3.session.MediaController.Listener listener) {
        listener.onAvailableSessionCommandsChanged(getInstance(), sessionCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromSession$118(androidx.media3.session.MediaController.Listener listener) {
        listener.onCustomLayoutChanged(getInstance(), this.resolvedCustomLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAvailableCommandsChangedFromSession$119(androidx.media3.session.MediaController.Listener listener) {
        listener.onMediaButtonPreferencesChanged(getInstance(), this.resolvedMediaButtonPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCustomCommand$115(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, int i3, androidx.media3.session.MediaController.Listener listener) {
        com.google.common.util.concurrent.J jOnCustomCommand = listener.onCustomCommand(getInstance(), sessionCommand, bundle);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(jOnCustomCommand, "ControllerCallback#onCustomCommand() must not return null");
        sendControllerResultWhenReady(i3, jOnCustomCommand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$127(androidx.media3.session.SessionError sessionError, androidx.media3.session.MediaController.Listener listener) {
        listener.onError(getInstance(), sessionError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onExtrasChanged$125(android.os.Bundle bundle, boolean z6, boolean z9, androidx.media3.session.MediaController.Listener listener) {
        listener.onExtrasChanged(getInstance(), bundle);
        if (z6) {
            listener.onCustomLayoutChanged(getInstance(), this.resolvedCustomLayout);
        }
        if (z9) {
            listener.onMediaButtonPreferencesChanged(getInstance(), this.resolvedMediaButtonPreferences);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCustomLayout$123(boolean z6, boolean z9, int i3, androidx.media3.session.MediaController.Listener listener) {
        com.google.common.util.concurrent.J jOnSetCustomLayout = listener.onSetCustomLayout(getInstance(), this.resolvedCustomLayout);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(jOnSetCustomLayout, "MediaController.Listener#onSetCustomLayout() must not return null");
        if (z6) {
            listener.onCustomLayoutChanged(getInstance(), this.resolvedCustomLayout);
        }
        if (z9) {
            listener.onMediaButtonPreferencesChanged(getInstance(), this.resolvedMediaButtonPreferences);
        }
        sendControllerResultWhenReady(i3, jOnSetCustomLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetMediaButtonPreferences$124(boolean z6, boolean z9, int i3, androidx.media3.session.MediaController.Listener listener) {
        com.google.common.util.concurrent.J jOnSetCustomLayout = listener.onSetCustomLayout(getInstance(), this.resolvedCustomLayout);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(jOnSetCustomLayout, "MediaController.Listener#onSetCustomLayout() must not return null");
        if (z6) {
            listener.onCustomLayoutChanged(getInstance(), this.resolvedCustomLayout);
        }
        if (z9) {
            listener.onMediaButtonPreferencesChanged(getInstance(), this.resolvedMediaButtonPreferences);
        }
        sendControllerResultWhenReady(i3, jOnSetCustomLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetSessionActivity$126(android.app.PendingIntent pendingIntent, androidx.media3.session.MediaController.Listener listener) {
        listener.onSessionActivityChanged(getInstance(), pendingIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pause$6(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.pause(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$play$5(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.play(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare$7(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.prepare(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$4() {
        androidx.media3.session.MediaControllerImplBase.SessionServiceConnection sessionServiceConnection = this.serviceConnection;
        if (sessionServiceConnection != null) {
            this.context.unbindService(sessionServiceConnection);
            this.serviceConnection = null;
        }
        this.controllerStub.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeMediaItem$40(int i3, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.removeMediaItem(this.controllerStub, i9, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeMediaItems$41(int i3, int i9, androidx.media3.session.IMediaSession iMediaSession, int i10) {
        iMediaSession.removeMediaItems(this.controllerStub, i10, i3, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$replaceMediaItem$45(int i3, androidx.media3.common.MediaItem mediaItem, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        if (getSessionInterfaceVersion() >= 2) {
            iMediaSession.replaceMediaItem(this.controllerStub, i9, i3, mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion()));
        } else {
            iMediaSession.addMediaItemWithIndex(this.controllerStub, i9, i3 + 1, mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion()));
            iMediaSession.removeMediaItem(this.controllerStub, i9, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ android.os.Bundle lambda$replaceMediaItems$46(androidx.media3.common.MediaItem mediaItem) {
        return mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$replaceMediaItems$47(java.util.List list, int i3, int i9, androidx.media3.session.IMediaSession iMediaSession, int i10) {
        androidx.media3.common.BundleListRetriever bundleListRetriever = new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.C1615y(this, 2)));
        if (getSessionInterfaceVersion() >= 2) {
            iMediaSession.replaceMediaItems(this.controllerStub, i10, i3, i9, bundleListRetriever);
        } else {
            iMediaSession.addMediaItemsWithIndex(this.controllerStub, i10, i9, bundleListRetriever);
            iMediaSession.removeMediaItems(this.controllerStub, i10, i3, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekBack$12(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.seekBack(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekForward$13(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.seekForward(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekTo$10(long j, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.seekTo(this.controllerStub, i3, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekTo$11(int i3, long j, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.seekToWithMediaItemIndex(this.controllerStub, i9, i3, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToDefaultPosition$8(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.seekToDefaultPosition(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToDefaultPosition$9(int i3, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.seekToDefaultPositionWithMediaItemIndex(this.controllerStub, i9, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToNext$51(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.seekToNext(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToNextMediaItem$49(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.seekToNextMediaItem(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToPrevious$50(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.seekToPrevious(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToPreviousMediaItem$48(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.seekToPreviousMediaItem(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendControllerResultWhenReady$114(com.google.common.util.concurrent.J j, int i3) {
        androidx.media3.session.SessionResult sessionResult;
        try {
            sessionResult = (androidx.media3.session.SessionResult) j.get();
            com.google.android.gms.internal.play_billing.AbstractC1864o0.U(sessionResult, "SessionResult must not be null");
        } catch (java.lang.InterruptedException e6) {
            e = e6;
            androidx.media3.common.util.Log.w(TAG, "Session operation failed", e);
            sessionResult = new androidx.media3.session.SessionResult(-1);
        } catch (java.util.concurrent.CancellationException e9) {
            androidx.media3.common.util.Log.w(TAG, "Session operation cancelled", e9);
            sessionResult = new androidx.media3.session.SessionResult(1);
        } catch (java.util.concurrent.ExecutionException e10) {
            e = e10;
            androidx.media3.common.util.Log.w(TAG, "Session operation failed", e);
            sessionResult = new androidx.media3.session.SessionResult(-1);
        }
        sendControllerResult(i3, sessionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCustomCommand$21(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.onCustomCommand(this.controllerStub, i3, sessionCommand.toBundle(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCustomCommand$22(androidx.media3.session.MediaController.ProgressListener progressListener, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        if (progressListener != null) {
            this.pendingCustomActionProgressListeners.put(i3, progressListener);
        }
        iMediaSession.onCustomCommandWithProgressUpdate(this.controllerStub, i3, sessionCommand.toBundle(), bundle, progressListener != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioAttributes$78(androidx.media3.common.AudioAttributes audioAttributes, boolean z6, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setAudioAttributes(this.controllerStub, i3, audioAttributes.toBundle(), z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceMuted$74(boolean z6, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setDeviceMuted(this.controllerStub, i3, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceMuted$75(boolean z6, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(this.playerInfo.deviceVolume, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceMuted$76(boolean z6, int i3, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.setDeviceMutedWithFlags(this.controllerStub, i9, z6, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceMuted$77(boolean z6, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(this.playerInfo.deviceVolume, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceVolume$62(int i3, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.setDeviceVolume(this.controllerStub, i9, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceVolume$63(int i3, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i3, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceVolume$64(int i3, int i9, androidx.media3.session.IMediaSession iMediaSession, int i10) {
        iMediaSession.setDeviceVolumeWithFlags(this.controllerStub, i10, i3, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDeviceVolume$65(int i3, androidx.media3.common.Player.Listener listener) {
        listener.onDeviceVolumeChanged(i3, this.playerInfo.deviceMuted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFutureResult$112() {
        androidx.media3.session.PlayerInfo playerInfo = this.pendingPlayerInfo;
        if (playerInfo != null) {
            onPlayerInfoChanged(playerInfo, androidx.media3.session.PlayerInfo.BundlingExclusions.NONE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFutureResult$113(int i3) {
        this.pendingMaskingSequencedFutureNumbers.remove(java.lang.Integer.valueOf(i3));
        this.pendingCustomActionProgressListeners.delete(i3);
        androidx.media3.session.SessionToken sessionToken = this.connectedToken;
        if (sessionToken == null || sessionToken.getInterfaceVersion() >= 5 || !this.pendingMaskingSequencedFutureNumbers.isEmpty()) {
            return;
        }
        this.fallbackPlaybackInfoUpdateHandler.postDelayed(new androidx.media3.session.C(this, 0), 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItem$23(androidx.media3.common.MediaItem mediaItem, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setMediaItem(this.controllerStub, i3, mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItem$24(androidx.media3.common.MediaItem mediaItem, long j, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setMediaItemWithStartPosition(this.controllerStub, i3, mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion()), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItem$25(androidx.media3.common.MediaItem mediaItem, boolean z6, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setMediaItemWithResetPosition(this.controllerStub, i3, mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion()), z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ android.os.Bundle lambda$setMediaItems$26(androidx.media3.common.MediaItem mediaItem) {
        return mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItems$27(java.util.List list, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setMediaItems(this.controllerStub, i3, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.C1615y(this, 4))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ android.os.Bundle lambda$setMediaItems$28(androidx.media3.common.MediaItem mediaItem) {
        return mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItems$29(java.util.List list, boolean z6, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setMediaItemsWithResetPosition(this.controllerStub, i3, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.C1615y(this, 0))), z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ android.os.Bundle lambda$setMediaItems$30(androidx.media3.common.MediaItem mediaItem) {
        return mediaItem.toBundleIncludeLocalConfiguration(getSessionInterfaceVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMediaItems$31(java.util.List list, int i3, long j, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.setMediaItemsWithStartIndex(this.controllerStub, i9, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList(list, new androidx.media3.session.C1615y(this, 3))), i3, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlayWhenReady$14(boolean z6, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setPlayWhenReady(this.controllerStub, i3, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaybackParameters$15(androidx.media3.common.PlaybackParameters playbackParameters, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setPlaybackParameters(this.controllerStub, i3, playbackParameters.toBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaybackSpeed$17(float f9, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setPlaybackSpeed(this.controllerStub, i3, f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaylistMetadata$32(androidx.media3.common.MediaMetadata mediaMetadata, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setPlaylistMetadata(this.controllerStub, i3, mediaMetadata.toBundle(getSessionInterfaceVersion()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRating$19(java.lang.String str, androidx.media3.common.Rating rating, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setRatingWithMediaId(this.controllerStub, i3, str, rating.toBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRating$20(androidx.media3.common.Rating rating, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setRating(this.controllerStub, i3, rating.toBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRepeatMode$52(int i3, androidx.media3.session.IMediaSession iMediaSession, int i9) {
        iMediaSession.setRepeatMode(this.controllerStub, i9, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setShuffleModeEnabled$54(boolean z6, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setShuffleModeEnabled(this.controllerStub, i3, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrackSelectionParameters$82(androidx.media3.common.TrackSelectionParameters trackSelectionParameters, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setTrackSelectionParameters(this.controllerStub, i3, trackSelectionParameters.toBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoSurfaceWithSize$80(android.view.Surface surface, int i3, int i9, androidx.media3.session.IMediaSession iMediaSession, int i10) {
        iMediaSession.setVideoSurfaceWithSize(this.controllerStub, i10, surface, i3, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVideoSurfaceWithSize$81(android.view.Surface surface, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setVideoSurface(this.controllerStub, i3, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVolume$56(float f9, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.setVolume(this.controllerStub, i3, f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$2(androidx.media3.session.IMediaSession iMediaSession, int i3) {
        iMediaSession.stop(this.controllerStub, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unmute$60(float f9, androidx.media3.session.IMediaSession iMediaSession, int i3) {
        if (getSessionInterfaceVersion() >= 6) {
            iMediaSession.unmute(this.controllerStub, i3);
        } else {
            iMediaSession.setVolume(this.controllerStub, i3, f9);
        }
    }

    private static androidx.media3.session.PlayerInfo maskPlayerInfoForAddedItems(androidx.media3.session.PlayerInfo playerInfo, int i3, java.util.List<androidx.media3.common.MediaItem> list, long j, long j9) {
        int size;
        androidx.media3.common.Timeline timeline = playerInfo.timeline;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size2 = 0;
        for (int i9 = 0; i9 < timeline.getWindowCount(); i9++) {
            arrayList.add(timeline.getWindow(i9, new androidx.media3.common.Timeline.Window()));
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(i10 + i3, createNewWindow(list.get(i10)));
        }
        rebuildPeriods(timeline, arrayList, arrayList2);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline(arrayList, arrayList2);
        if (playerInfo.timeline.isEmpty()) {
            size = 0;
        } else {
            int i11 = playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
            size2 = i11 >= i3 ? list.size() + i11 : i11;
            int i12 = playerInfo.sessionPositionInfo.positionInfo.periodIndex;
            size = i12 >= i3 ? list.size() + i12 : i12;
        }
        return maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, size2, size, j, j9, 5);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    private static androidx.media3.session.PlayerInfo maskPlayerInfoForRemovedItems(androidx.media3.session.PlayerInfo playerInfo, int i3, int i9, boolean z6, long j, long j9) {
        int i10;
        androidx.media3.common.Timeline timeline;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.media3.session.PlayerInfo playerInfoMaskTimelineAndPositionInfo;
        androidx.media3.common.Timeline timeline2 = playerInfo.timeline;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i17 = 0; i17 < timeline2.getWindowCount(); i17++) {
            if (i17 < i3 || i17 >= i9) {
                arrayList.add(timeline2.getWindow(i17, new androidx.media3.common.Timeline.Window()));
            }
        }
        rebuildPeriods(timeline2, arrayList, arrayList2);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline(arrayList, arrayList2);
        int newPeriodIndexWithoutRemovedPeriods = 0;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(playerInfo);
        int i18 = playerInfo.sessionPositionInfo.positionInfo.periodIndex;
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        boolean z9 = currentMediaItemIndexInternal >= i3 && currentMediaItemIndexInternal < i9;
        if (timelineCreateMaskingTimeline.isEmpty()) {
            i10 = currentMediaItemIndexInternal;
            timeline = timeline2;
            i11 = i3;
            i12 = i9;
            i14 = -1;
        } else {
            if (!z9) {
                i10 = currentMediaItemIndexInternal;
                timeline = timeline2;
                i11 = i3;
                i12 = i9;
                if (i10 >= i12) {
                    i15 = i10 - (i12 - i11);
                    newPeriodIndexWithoutRemovedPeriods = getNewPeriodIndexWithoutRemovedPeriods(timeline, i18, i11, i12);
                } else {
                    i13 = i18;
                    i14 = i10;
                }
                if (z9) {
                    i16 = 4;
                    playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, i14, i13, j, j9, 4);
                } else if (i14 == -1) {
                    playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO, androidx.media3.session.SessionPositionInfo.DEFAULT, 4);
                    i16 = 4;
                } else if (z6) {
                    i16 = 4;
                    playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, i14, i13, j, j9, 4);
                } else {
                    i16 = 4;
                    androidx.media3.common.Timeline.Window window2 = timelineCreateMaskingTimeline.getWindow(i14, new androidx.media3.common.Timeline.Window());
                    long defaultPositionMs = window2.getDefaultPositionMs();
                    long durationMs = window2.getDurationMs();
                    androidx.media3.common.Player.PositionInfo positionInfo = new androidx.media3.common.Player.PositionInfo(null, i14, window2.mediaItem, null, i13, defaultPositionMs, defaultPositionMs, -1, -1);
                    playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, positionInfo, new androidx.media3.session.SessionPositionInfo(positionInfo, false, android.os.SystemClock.elapsedRealtime(), durationMs, defaultPositionMs, androidx.media3.session.MediaUtils.calculateBufferedPercentage(defaultPositionMs, durationMs), 0L, androidx.media3.common.C.TIME_UNSET, durationMs, defaultPositionMs), 4);
                }
                int i19 = playerInfoMaskTimelineAndPositionInfo.playbackState;
                return i19 != 1 ? playerInfoMaskTimelineAndPositionInfo : playerInfoMaskTimelineAndPositionInfo;
            }
            int iResolveSubsequentMediaItemIndex = resolveSubsequentMediaItemIndex(playerInfo.repeatMode, playerInfo.shuffleModeEnabled, currentMediaItemIndexInternal, timeline2, i3, i9);
            i10 = currentMediaItemIndexInternal;
            timeline = timeline2;
            i11 = i3;
            i12 = i9;
            if (iResolveSubsequentMediaItemIndex == -1) {
                iResolveSubsequentMediaItemIndex = timelineCreateMaskingTimeline.getFirstWindowIndex(playerInfo.shuffleModeEnabled);
            } else if (iResolveSubsequentMediaItemIndex >= i12) {
                iResolveSubsequentMediaItemIndex -= i12 - i11;
            }
            i15 = iResolveSubsequentMediaItemIndex;
            newPeriodIndexWithoutRemovedPeriods = timelineCreateMaskingTimeline.getWindow(i15, window).firstPeriodIndex;
            i14 = i15;
        }
        i13 = newPeriodIndexWithoutRemovedPeriods;
        if (z9) {
            i16 = 4;
            playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, i14, i13, j, j9, 4);
        } else if (i14 == -1) {
            playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, androidx.media3.session.SessionPositionInfo.DEFAULT_POSITION_INFO, androidx.media3.session.SessionPositionInfo.DEFAULT, 4);
            i16 = 4;
        } else if (z6) {
            i16 = 4;
            playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, i14, i13, j, j9, 4);
        } else {
            i16 = 4;
            androidx.media3.common.Timeline.Window window3 = timelineCreateMaskingTimeline.getWindow(i14, new androidx.media3.common.Timeline.Window());
            long defaultPositionMs2 = window3.getDefaultPositionMs();
            long durationMs2 = window3.getDurationMs();
            androidx.media3.common.Player.PositionInfo positionInfo2 = new androidx.media3.common.Player.PositionInfo(null, i14, window3.mediaItem, null, i13, defaultPositionMs2, defaultPositionMs2, -1, -1);
            playerInfoMaskTimelineAndPositionInfo = maskTimelineAndPositionInfo(playerInfo, timelineCreateMaskingTimeline, positionInfo2, new androidx.media3.session.SessionPositionInfo(positionInfo2, false, android.os.SystemClock.elapsedRealtime(), durationMs2, defaultPositionMs2, androidx.media3.session.MediaUtils.calculateBufferedPercentage(defaultPositionMs2, durationMs2), 0L, androidx.media3.common.C.TIME_UNSET, durationMs2, defaultPositionMs2), 4);
        }
        int i110 = playerInfoMaskTimelineAndPositionInfo.playbackState;
        return i110 != 1 ? playerInfoMaskTimelineAndPositionInfo : playerInfoMaskTimelineAndPositionInfo;
    }

    private androidx.media3.session.PlayerInfo maskPositionInfo(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Timeline timeline, androidx.media3.session.MediaControllerImplBase.PeriodInfo periodInfo) {
        int i3 = playerInfo.sessionPositionInfo.positionInfo.periodIndex;
        int i9 = periodInfo.index;
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        timeline.getPeriod(i3, period);
        androidx.media3.common.Timeline.Period period2 = new androidx.media3.common.Timeline.Period();
        timeline.getPeriod(i9, period2);
        boolean z6 = i3 != i9;
        long j = periodInfo.periodPositionUs;
        long jMsToUs = androidx.media3.common.util.Util.msToUs(getCurrentPosition()) - period.getPositionInWindowUs();
        if (!z6 && j == jMsToUs) {
            return playerInfo;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(playerInfo.sessionPositionInfo.positionInfo.adGroupIndex == -1);
        androidx.media3.common.Player.PositionInfo positionInfo = new androidx.media3.common.Player.PositionInfo(null, period.windowIndex, playerInfo.sessionPositionInfo.positionInfo.mediaItem, null, i3, androidx.media3.common.util.Util.usToMs(period.positionInWindowUs + jMsToUs), androidx.media3.common.util.Util.usToMs(period.positionInWindowUs + jMsToUs), -1, -1);
        timeline.getPeriod(i9, period2);
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        timeline.getWindow(period2.windowIndex, window);
        long jUsToMs = androidx.media3.common.util.Util.usToMs(period2.positionInWindowUs + j);
        androidx.media3.common.Player.PositionInfo positionInfo2 = new androidx.media3.common.Player.PositionInfo(null, period2.windowIndex, window.mediaItem, null, i9, jUsToMs, jUsToMs, -1, -1);
        androidx.media3.session.PlayerInfo playerInfoCopyWithPositionInfos = playerInfo.copyWithPositionInfos(positionInfo, positionInfo2, 1);
        if (z6 || j < jMsToUs) {
            return playerInfoCopyWithPositionInfos.copyWithSessionPositionInfo(new androidx.media3.session.SessionPositionInfo(positionInfo2, false, android.os.SystemClock.elapsedRealtime(), window.getDurationMs(), jUsToMs, androidx.media3.session.MediaUtils.calculateBufferedPercentage(jUsToMs, window.getDurationMs()), 0L, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, jUsToMs));
        }
        long jMax = java.lang.Math.max(0L, androidx.media3.common.util.Util.msToUs(playerInfoCopyWithPositionInfos.sessionPositionInfo.totalBufferedDurationMs) - (j - jMsToUs));
        long jUsToMs2 = androidx.media3.common.util.Util.usToMs(period2.positionInWindowUs + j + jMax);
        return playerInfoCopyWithPositionInfos.copyWithSessionPositionInfo(new androidx.media3.session.SessionPositionInfo(positionInfo2, false, android.os.SystemClock.elapsedRealtime(), window.getDurationMs(), jUsToMs2, androidx.media3.session.MediaUtils.calculateBufferedPercentage(jUsToMs2, window.getDurationMs()), androidx.media3.common.util.Util.usToMs(jMax), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, jUsToMs2));
    }

    private static androidx.media3.session.PlayerInfo maskTimelineAndPositionInfo(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Timeline timeline, int i3, int i9, long j, long j9, int i10) {
        androidx.media3.common.MediaItem mediaItem = timeline.getWindow(i3, new androidx.media3.common.Timeline.Window()).mediaItem;
        androidx.media3.common.Player.PositionInfo positionInfo = playerInfo.sessionPositionInfo.positionInfo;
        androidx.media3.common.Player.PositionInfo positionInfo2 = new androidx.media3.common.Player.PositionInfo(null, i3, mediaItem, null, i9, j, j9, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        boolean z6 = playerInfo.sessionPositionInfo.isPlayingAd;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        androidx.media3.session.SessionPositionInfo sessionPositionInfo = playerInfo.sessionPositionInfo;
        return maskTimelineAndPositionInfo(playerInfo, timeline, positionInfo2, new androidx.media3.session.SessionPositionInfo(positionInfo2, z6, jElapsedRealtime, sessionPositionInfo.durationMs, sessionPositionInfo.bufferedPositionMs, sessionPositionInfo.bufferedPercentage, sessionPositionInfo.totalBufferedDurationMs, sessionPositionInfo.currentLiveOffsetMs, sessionPositionInfo.contentDurationMs, sessionPositionInfo.contentBufferedPositionMs), i10);
    }

    private void moveMediaItemsInternal(int i3, int i9, int i10) {
        int i11;
        int i12;
        androidx.media3.common.Timeline timeline = this.playerInfo.timeline;
        int windowCount = timeline.getWindowCount();
        int iMin = java.lang.Math.min(i9, windowCount);
        int i13 = iMin - i3;
        int iMin2 = java.lang.Math.min(i10, windowCount - i13);
        if (i3 >= windowCount || i3 == iMin || i3 == iMin2) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i14 = 0; i14 < windowCount; i14++) {
            arrayList.add(timeline.getWindow(i14, new androidx.media3.common.Timeline.Window()));
        }
        androidx.media3.common.util.Util.moveItems(arrayList, i3, iMin, iMin2);
        rebuildPeriods(timeline, arrayList, arrayList2);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline(arrayList, arrayList2);
        if (timelineCreateMaskingTimeline.isEmpty()) {
            return;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (currentMediaItemIndex >= i3 && currentMediaItemIndex < iMin) {
            i12 = (currentMediaItemIndex - i3) + iMin2;
        } else {
            if (iMin > currentMediaItemIndex || iMin2 <= currentMediaItemIndex) {
                if (iMin <= currentMediaItemIndex || iMin2 > currentMediaItemIndex) {
                    i11 = currentMediaItemIndex;
                } else {
                    i12 = currentMediaItemIndex + i13;
                }
                androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
                updatePlayerInfo(maskTimelineAndPositionInfo(this.playerInfo, timelineCreateMaskingTimeline, i11, timelineCreateMaskingTimeline.getWindow(i11, window).firstPeriodIndex + (this.playerInfo.sessionPositionInfo.positionInfo.periodIndex - timeline.getWindow(currentMediaItemIndex, window).firstPeriodIndex), getCurrentPosition(), getContentPosition(), 5), 0, null, null, null);
            }
            i12 = currentMediaItemIndex - i13;
        }
        i11 = i12;
        androidx.media3.common.Timeline.Window window2 = new androidx.media3.common.Timeline.Window();
        updatePlayerInfo(maskTimelineAndPositionInfo(this.playerInfo, timelineCreateMaskingTimeline, i11, timelineCreateMaskingTimeline.getWindow(i11, window2).firstPeriodIndex + (this.playerInfo.sessionPositionInfo.positionInfo.periodIndex - timeline.getWindow(currentMediaItemIndex, window2).firstPeriodIndex), getCurrentPosition(), getContentPosition(), 5), 0, null, null, null);
    }

    private void notifyPlayerInfoListenersWithReasons(androidx.media3.session.PlayerInfo playerInfo, final androidx.media3.session.PlayerInfo playerInfo2, final java.lang.Integer num, final java.lang.Integer num2, final java.lang.Integer num3, java.lang.Integer num4) {
        if (num != null) {
            final int i3 = 0;
            this.listeners.queueEvent(0, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.J
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i3) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$84(playerInfo2, num, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$85(playerInfo2, num, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$93(playerInfo2, num, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i9 = 1;
            this.listeners.queueEvent(11, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.J
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i9) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$84(playerInfo2, num3, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$85(playerInfo2, num3, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$93(playerInfo2, num3, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        androidx.media3.common.MediaItem currentMediaItem = playerInfo2.getCurrentMediaItem();
        if (num4 != null) {
            this.listeners.queueEvent(1, new androidx.media3.session.C1585j(currentMediaItem, num4, 7));
        }
        androidx.media3.common.PlaybackException playbackException = playerInfo.playerError;
        androidx.media3.common.PlaybackException playbackException2 = playerInfo2.playerError;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.errorInfoEquals(playbackException2))) {
            this.listeners.queueEvent(10, new androidx.media3.session.L(0, playbackException2));
            if (playbackException2 != null) {
                this.listeners.queueEvent(10, new androidx.media3.session.L(1, playbackException2));
            }
        }
        if (!playerInfo.currentTracks.equals(playerInfo2.currentTracks)) {
            final int i10 = 18;
            this.listeners.queueEvent(2, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i10) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!playerInfo.mediaMetadata.equals(playerInfo2.mediaMetadata)) {
            final int i11 = 19;
            this.listeners.queueEvent(14, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i11) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.isLoading != playerInfo2.isLoading) {
            final int i12 = 20;
            this.listeners.queueEvent(3, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i12) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.playbackState != playerInfo2.playbackState) {
            final int i13 = 21;
            this.listeners.queueEvent(4, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i13) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i14 = 2;
            this.listeners.queueEvent(5, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.J
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i14) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$84(playerInfo2, num2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$85(playerInfo2, num2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$93(playerInfo2, num2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.playbackSuppressionReason != playerInfo2.playbackSuppressionReason) {
            final int i15 = 0;
            this.listeners.queueEvent(6, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i15) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.isPlaying != playerInfo2.isPlaying) {
            final int i16 = 1;
            this.listeners.queueEvent(7, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i16) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!playerInfo.playbackParameters.equals(playerInfo2.playbackParameters)) {
            final int i17 = 2;
            this.listeners.queueEvent(12, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i17) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.repeatMode != playerInfo2.repeatMode) {
            final int i18 = 3;
            this.listeners.queueEvent(8, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i18) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.shuffleModeEnabled != playerInfo2.shuffleModeEnabled) {
            final int i19 = 4;
            this.listeners.queueEvent(9, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i19) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!playerInfo.playlistMetadata.equals(playerInfo2.playlistMetadata)) {
            final int i20 = 5;
            this.listeners.queueEvent(15, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i20) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.volume != playerInfo2.volume) {
            final int i21 = 6;
            this.listeners.queueEvent(22, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i21) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!playerInfo.audioAttributes.equals(playerInfo2.audioAttributes)) {
            final int i22 = 7;
            this.listeners.queueEvent(20, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i22) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.audioSessionId != playerInfo2.audioSessionId) {
            final int i23 = 8;
            this.listeners.queueEvent(21, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i23) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!playerInfo.cueGroup.cues.equals(playerInfo2.cueGroup.cues)) {
            final int i24 = 9;
            this.listeners.queueEvent(27, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i24) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
            final int i25 = 10;
            this.listeners.queueEvent(27, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i25) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!playerInfo.deviceInfo.equals(playerInfo2.deviceInfo)) {
            final int i26 = 11;
            this.listeners.queueEvent(29, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i26) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.deviceVolume != playerInfo2.deviceVolume || playerInfo.deviceMuted != playerInfo2.deviceMuted) {
            final int i27 = 12;
            this.listeners.queueEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i27) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!playerInfo.videoSize.equals(playerInfo2.videoSize)) {
            final int i28 = 13;
            this.listeners.queueEvent(25, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i28) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.seekBackIncrementMs != playerInfo2.seekBackIncrementMs) {
            final int i29 = 14;
            this.listeners.queueEvent(16, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i29) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.seekForwardIncrementMs != playerInfo2.seekForwardIncrementMs) {
            final int i30 = 15;
            this.listeners.queueEvent(17, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i30) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playerInfo.maxSeekToPreviousPositionMs != playerInfo2.maxSeekToPreviousPositionMs) {
            final int i31 = 16;
            this.listeners.queueEvent(18, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i31) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!playerInfo.trackSelectionParameters.equals(playerInfo2.trackSelectionParameters)) {
            final int i32 = 17;
            this.listeners.queueEvent(19, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.session.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i32) {
                        case 0:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$94(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$95(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$96(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$97(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$98(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$101(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$102(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 9:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 10:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$104(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 11:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$105(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 12:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$106(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 13:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$107(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 14:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$108(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 15:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$109(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 16:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$110(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 17:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$111(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 18:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$89(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 19:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$90(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 20:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.session.MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$92(playerInfo2, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        this.listeners.flushEvents();
    }

    private static void rebuildPeriods(androidx.media3.common.Timeline timeline, java.util.List<androidx.media3.common.Timeline.Window> list, java.util.List<androidx.media3.common.Timeline.Period> list2) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.common.Timeline.Window window = list.get(i3);
            int i9 = window.firstPeriodIndex;
            int i10 = window.lastPeriodIndex;
            if (i9 == -1 || i10 == -1) {
                window.firstPeriodIndex = list2.size();
                window.lastPeriodIndex = list2.size();
                list2.add(createNewPeriod(i3));
            } else {
                window.firstPeriodIndex = list2.size();
                window.lastPeriodIndex = (i10 - i9) + list2.size();
                while (i9 <= i10) {
                    list2.add(getPeriodWithNewWindowIndex(timeline, i9, i3));
                    i9++;
                }
            }
        }
    }

    private void removeMediaItemsInternal(int i3, int i9) {
        int windowCount = this.playerInfo.timeline.getWindowCount();
        int iMin = java.lang.Math.min(i9, windowCount);
        if (i3 >= windowCount || i3 == iMin || windowCount == 0) {
            return;
        }
        boolean z6 = getCurrentMediaItemIndex() >= i3 && getCurrentMediaItemIndex() < iMin;
        androidx.media3.session.PlayerInfo playerInfoMaskPlayerInfoForRemovedItems = maskPlayerInfoForRemovedItems(this.playerInfo, i3, iMin, false, getCurrentPosition(), getContentPosition());
        int i10 = this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
        updatePlayerInfo(playerInfoMaskPlayerInfoForRemovedItems, 0, null, z6 ? 4 : null, i10 >= i3 && i10 < iMin ? 3 : null);
    }

    private void replaceMediaItemsInternal(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list) {
        int windowCount = this.playerInfo.timeline.getWindowCount();
        if (i3 > windowCount) {
            return;
        }
        if (this.playerInfo.timeline.isEmpty()) {
            setMediaItemsInternal(list, -1, androidx.media3.common.C.TIME_UNSET, false);
            return;
        }
        int iMin = java.lang.Math.min(i9, windowCount);
        androidx.media3.session.PlayerInfo playerInfoMaskPlayerInfoForRemovedItems = maskPlayerInfoForRemovedItems(maskPlayerInfoForAddedItems(this.playerInfo, iMin, list, getCurrentPosition(), getContentPosition()), i3, iMin, true, getCurrentPosition(), getContentPosition());
        int i10 = this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex;
        boolean z6 = i10 >= i3 && i10 < iMin;
        updatePlayerInfo(playerInfoMaskPlayerInfoForRemovedItems, 0, null, z6 ? 4 : null, z6 ? 3 : null);
    }

    private boolean requestConnectToService() {
        int i3 = android.os.Build.VERSION.SDK_INT >= 29 ? 4097 : 1;
        android.content.Intent intent = new android.content.Intent(androidx.media3.session.MediaSessionService.SERVICE_INTERFACE);
        intent.setClassName(this.token.getPackageName(), this.token.getServiceName());
        try {
            if (this.context.bindService(intent, this.serviceConnection, i3)) {
                return true;
            }
            androidx.media3.common.util.Log.w(TAG, "bind to " + this.token + " failed");
            return false;
        } catch (java.lang.SecurityException e6) {
            androidx.media3.common.util.Log.w(TAG, "bind to " + this.token + " not allowed", e6);
            return false;
        }
    }

    private boolean requestConnectToSession(android.os.Bundle bundle) {
        java.lang.Object binder = this.token.getBinder();
        binder.getClass();
        try {
            androidx.media3.session.IMediaSession.Stub.asInterface((android.os.IBinder) binder).connect(this.controllerStub, this.sequencedFutureManager.obtainNextSequenceNumber(), new androidx.media3.session.ConnectionRequest(this.context.getPackageName(), android.os.Process.myPid(), bundle, this.instance.getMaxCommandsForMediaItems()).toBundle());
            return true;
        } catch (android.os.RemoteException e6) {
            androidx.media3.common.util.Log.w(TAG, "Failed to call connection request.", e6);
            return false;
        }
    }

    private p076i4.AbstractC2186b0 resolveCustomLayout(java.util.List<androidx.media3.session.CommandButton> list, java.util.List<androidx.media3.session.CommandButton> list2, android.os.Bundle bundle, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        return resolveCustomLayout(list, list2, bundle, sessionCommands, commands, getSessionInterfaceVersion());
    }

    private static p076i4.AbstractC2186b0 resolveMediaButtonPreferences(java.util.List<androidx.media3.session.CommandButton> list, java.util.List<androidx.media3.session.CommandButton> list2, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands, android.os.Bundle bundle) {
        if (list.isEmpty()) {
            list = androidx.media3.session.CommandButton.getMediaButtonPreferencesFromCustomLayout(list2, commands, bundle);
        }
        return androidx.media3.session.CommandButton.copyWithUnavailableButtonsDisabled(list, sessionCommands, commands);
    }

    private static int resolveSubsequentMediaItemIndex(int i3, boolean z6, int i9, androidx.media3.common.Timeline timeline, int i10, int i11) {
        int windowCount = timeline.getWindowCount();
        for (int i12 = 0; i12 < windowCount && (i9 = timeline.getNextWindowIndex(i9, i3, z6)) != -1; i12++) {
            if (i9 < i10 || i9 >= i11) {
                return i9;
            }
        }
        return -1;
    }

    private void seekToInternal(int i3, long j) {
        int i9;
        int i10;
        androidx.media3.session.PlayerInfo playerInfoMaskPositionInfo;
        androidx.media3.common.Timeline timeline = this.playerInfo.timeline;
        if ((timeline.isEmpty() || i3 < timeline.getWindowCount()) && !isPlayingAd()) {
            int i11 = getPlaybackState() == 1 ? 1 : 2;
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            androidx.media3.session.PlayerInfo playerInfoCopyWithPlaybackState = playerInfo.copyWithPlaybackState(i11, playerInfo.playerError);
            androidx.media3.session.MediaControllerImplBase.PeriodInfo periodInfo = getPeriodInfo(timeline, i3, j);
            if (periodInfo == null) {
                i9 = 1;
                i10 = 2;
                androidx.media3.common.Player.PositionInfo positionInfo = new androidx.media3.common.Player.PositionInfo(null, i3, null, null, i3, j == androidx.media3.common.C.TIME_UNSET ? 0L : j, j == androidx.media3.common.C.TIME_UNSET ? 0L : j, -1, -1);
                androidx.media3.session.PlayerInfo playerInfo2 = this.playerInfo;
                androidx.media3.common.Timeline timeline2 = playerInfo2.timeline;
                boolean z6 = this.playerInfo.sessionPositionInfo.isPlayingAd;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                androidx.media3.session.SessionPositionInfo sessionPositionInfo = this.playerInfo.sessionPositionInfo;
                playerInfoMaskPositionInfo = maskTimelineAndPositionInfo(playerInfo2, timeline2, positionInfo, new androidx.media3.session.SessionPositionInfo(positionInfo, z6, jElapsedRealtime, sessionPositionInfo.durationMs, j == androidx.media3.common.C.TIME_UNSET ? 0L : j, 0, 0L, sessionPositionInfo.currentLiveOffsetMs, sessionPositionInfo.contentDurationMs, j == androidx.media3.common.C.TIME_UNSET ? 0L : j), 1);
            } else {
                i9 = 1;
                i10 = 2;
                playerInfoMaskPositionInfo = maskPositionInfo(playerInfoCopyWithPlaybackState, timeline, periodInfo);
            }
            int i12 = (this.playerInfo.timeline.isEmpty() || playerInfoMaskPositionInfo.sessionPositionInfo.positionInfo.mediaItemIndex == this.playerInfo.sessionPositionInfo.positionInfo.mediaItemIndex) ? 0 : i9;
            if (i12 == 0 && playerInfoMaskPositionInfo.sessionPositionInfo.positionInfo.positionMs == this.playerInfo.sessionPositionInfo.positionInfo.positionMs) {
                return;
            }
            updatePlayerInfo(playerInfoMaskPositionInfo, null, null, java.lang.Integer.valueOf(i9), i12 != 0 ? java.lang.Integer.valueOf(i10) : null);
        }
    }

    private void seekToInternalByOffset(long j) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != androidx.media3.common.C.TIME_UNSET) {
            currentPosition = java.lang.Math.min(currentPosition, duration);
        }
        seekToInternal(getCurrentMediaItemIndex(), java.lang.Math.max(currentPosition, 0L));
    }

    private void sendControllerResult(int i3, androidx.media3.session.SessionResult sessionResult) {
        androidx.media3.session.IMediaSession iMediaSession = this.iSession;
        if (iMediaSession == null) {
            return;
        }
        try {
            iMediaSession.onControllerResult(this.controllerStub, i3, sessionResult.toBundle());
        } catch (android.os.RemoteException unused) {
            androidx.media3.common.util.Log.w(TAG, "Error in sending");
        }
    }

    private void sendControllerResultWhenReady(final int i3, final com.google.common.util.concurrent.J j) {
        j.addListener(new java.lang.Runnable() { // from class: androidx.media3.session.T
            @Override // java.lang.Runnable
            public final void run() {
                this.f16947h.lambda$sendControllerResultWhenReady$114(j, i3);
            }
        }, com.google.common.util.concurrent.z.f19464h);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r26v0 ??, still in use, count: 1, list:
          (r26v0 ?? I:androidx.media3.common.Player$PositionInfo) from 0x013b: CONSTRUCTOR (r25v0 ?? I:androidx.media3.session.SessionPositionInfo) = 
          (r26v0 ?? I:androidx.media3.common.Player$PositionInfo)
          (r27v0 ?? I:boolean)
          (r28v0 ?? I:long)
          (r30v0 ?? I:long)
          (r32v0 ?? I:long)
          (r34v0 ?? I:int)
          (r35v0 ?? I:long)
          (r37v0 ?? I:long)
          (r39v0 ?? I:long)
          (r41v0 ?? I:long)
         A[MD:(androidx.media3.common.Player$PositionInfo, boolean, long, long, long, int, long, long, long, long):void (m)] (LINE:316) call: androidx.media3.session.SessionPositionInfo.<init>(androidx.media3.common.Player$PositionInfo, boolean, long, long, long, int, long, long, long, long):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private void setMediaItemsInternal(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r26v0 ??, still in use, count: 1, list:
          (r26v0 ?? I:androidx.media3.common.Player$PositionInfo) from 0x013b: CONSTRUCTOR (r25v0 ?? I:androidx.media3.session.SessionPositionInfo) = 
          (r26v0 ?? I:androidx.media3.common.Player$PositionInfo)
          (r27v0 ?? I:boolean)
          (r28v0 ?? I:long)
          (r30v0 ?? I:long)
          (r32v0 ?? I:long)
          (r34v0 ?? I:int)
          (r35v0 ?? I:long)
          (r37v0 ?? I:long)
          (r39v0 ?? I:long)
          (r41v0 ?? I:long)
         A[MD:(androidx.media3.common.Player$PositionInfo, boolean, long, long, long, int, long, long, long, long):void (m)] (LINE:316) call: androidx.media3.session.SessionPositionInfo.<init>(androidx.media3.common.Player$PositionInfo, boolean, long, long, long, int, long, long, long, long):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r44v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoSurfaceWithSize(android.view.Surface surface, int i3, int i9) {
        if (isConnected()) {
            if (getSessionInterfaceVersion() >= 8) {
                dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.G(i3, i9, 0, this, surface));
            } else {
                dispatchRemoteSessionTaskWithPlayerCommandAndWaitForFuture(new androidx.media3.session.C1585j(this, surface, 5));
            }
        }
    }

    private void updatePlayerInfo(androidx.media3.session.PlayerInfo playerInfo, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        androidx.media3.session.PlayerInfo playerInfo2 = this.playerInfo;
        this.playerInfo = playerInfo;
        notifyPlayerInfoListenersWithReasons(playerInfo2, playerInfo, num, num2, num3, num4);
    }

    private void updateSessionPositionInfoIfNeeded(androidx.media3.session.SessionPositionInfo sessionPositionInfo) {
        if (this.pendingMaskingSequencedFutureNumbers.isEmpty()) {
            androidx.media3.session.SessionPositionInfo sessionPositionInfo2 = this.playerInfo.sessionPositionInfo;
            if (sessionPositionInfo2.eventTimeMs >= sessionPositionInfo.eventTimeMs || !androidx.media3.session.MediaUtils.areSessionPositionInfosInSamePeriodOrAd(sessionPositionInfo, sessionPositionInfo2)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithSessionPositionInfo(sessionPositionInfo);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addListener(androidx.media3.common.Player.Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItem(androidx.media3.common.MediaItem mediaItem) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.I(this, mediaItem, 1));
            addMediaItemsInternal(getCurrentTimeline().getWindowCount(), java.util.Collections.singletonList(mediaItem));
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.D(0, list, this));
            addMediaItemsInternal(getCurrentTimeline().getWindowCount(), list);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearMediaItems() {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 13));
            removeMediaItemsInternal(0, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurface() {
        if (isPlayerCommandAvailable(27)) {
            clearSurfacesAndCallbacks();
            setVideoSurfaceWithSize(null, 0, 0);
            onSurfaceSizeChanged(0, 0);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        if (isPlayerCommandAvailable(27) && surfaceHolder != null && this.videoSurfaceHolder == surfaceHolder) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        if (isPlayerCommandAvailable(27)) {
            clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoTextureView(android.view.TextureView textureView) {
        if (isPlayerCommandAvailable(27) && textureView != null && this.videoTextureView == textureView) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void connect() {
        boolean zRequestConnectToService;
        if (this.token.getType() == 0) {
            this.serviceConnection = null;
            zRequestConnectToService = requestConnectToSession(this.connectionHints);
        } else {
            this.serviceConnection = new androidx.media3.session.MediaControllerImplBase.SessionServiceConnection(this.connectionHints);
            zRequestConnectToService = requestConnectToService();
        }
        if (zRequestConnectToService) {
            return;
        }
        androidx.media3.session.MediaController mediaControllerImplBase = getInstance();
        androidx.media3.session.MediaController mediaControllerImplBase2 = getInstance();
        java.util.Objects.requireNonNull(mediaControllerImplBase2);
        mediaControllerImplBase.runOnApplicationLooper(new androidx.media3.session.k1(1, mediaControllerImplBase2));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void decreaseDeviceVolume() {
        if (isPlayerCommandAvailable(26)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 7));
            int i3 = this.playerInfo.deviceVolume - 1;
            if (i3 >= getDeviceInfo().minVolume) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i3, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.session.C1593n(i3, 4, this));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        return this.playerInfo.audioAttributes;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getAudioSessionId() {
        return this.playerInfo.audioSessionId;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.Player.Commands getAvailableCommands() {
        return this.intersectedPlayerCommands;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.SessionCommands getAvailableSessionCommands() {
        return this.sessionCommands;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.IMediaController getBinder() {
        return this.controllerStub;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.legacy.MediaBrowserCompat getBrowserCompat() {
        return null;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getBufferedPercentage() {
        return this.playerInfo.sessionPositionInfo.bufferedPercentage;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getBufferedPosition() {
        return this.playerInfo.sessionPositionInfo.bufferedPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public p076i4.AbstractC2186b0 getCommandButtonsForMediaItem(androidx.media3.common.MediaItem mediaItem) {
        androidx.media3.session.SessionCommand sessionCommand;
        p076i4.AbstractC2186b0 abstractC2186b0 = mediaItem.mediaMetadata.supportedCommands;
        androidx.media3.session.SessionCommands availableSessionCommands = getAvailableSessionCommands();
        p076i4.AbstractC2230y.d(4, "initialCapacity");
        java.lang.Object[] objArrCopyOf = new java.lang.Object[4];
        int i3 = 0;
        for (int i9 = 0; i9 < abstractC2186b0.size(); i9++) {
            androidx.media3.session.CommandButton commandButton = (androidx.media3.session.CommandButton) this.commandButtonsForMediaItemsMap.get(abstractC2186b0.get(i9));
            if (commandButton != null && (sessionCommand = commandButton.sessionCommand) != null && availableSessionCommands.contains(sessionCommand)) {
                int i10 = i3 + 1;
                int iB = p076i4.V.b(objArrCopyOf.length, i10);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i3] = commandButton;
                i3 = i10;
            }
        }
        return p076i4.AbstractC2186b0.r(objArrCopyOf, i3);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.session.SessionToken getConnectedToken() {
        return this.connectedToken;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public android.os.Bundle getConnectionHints() {
        return this.connectionHints;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentBufferedPosition() {
        return this.playerInfo.sessionPositionInfo.contentBufferedPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentDuration() {
        return this.playerInfo.sessionPositionInfo.contentDurationMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getContentPosition() {
        androidx.media3.session.SessionPositionInfo sessionPositionInfo = this.playerInfo.sessionPositionInfo;
        return !sessionPositionInfo.isPlayingAd ? getCurrentPosition() : sessionPositionInfo.positionInfo.contentPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public android.content.Context getContext() {
        return this.context;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentAdGroupIndex() {
        return this.playerInfo.sessionPositionInfo.positionInfo.adGroupIndex;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentAdIndexInAdGroup() {
        return this.playerInfo.sessionPositionInfo.positionInfo.adIndexInAdGroup;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.text.CueGroup getCurrentCues() {
        return this.playerInfo.cueGroup;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getCurrentLiveOffset() {
        return this.playerInfo.sessionPositionInfo.currentLiveOffsetMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentMediaItemIndex() {
        return getCurrentMediaItemIndexInternal(this.playerInfo);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getCurrentPeriodIndex() {
        return this.playerInfo.sessionPositionInfo.positionInfo.periodIndex;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getCurrentPosition() {
        long updatedCurrentPositionMs = androidx.media3.session.MediaUtils.getUpdatedCurrentPositionMs(this.playerInfo, this.currentPositionMs, this.lastSetPlayWhenReadyCalledTimeMs, getInstance().getTimeDiffMs());
        this.currentPositionMs = updatedCurrentPositionMs;
        return updatedCurrentPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.Timeline getCurrentTimeline() {
        return this.playerInfo.timeline;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.Tracks getCurrentTracks() {
        return this.playerInfo.currentTracks;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public p076i4.AbstractC2186b0 getCustomLayout() {
        return this.resolvedCustomLayout;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.DeviceInfo getDeviceInfo() {
        return this.playerInfo.deviceInfo;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getDeviceVolume() {
        return this.playerInfo.deviceVolume;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getDuration() {
        return this.playerInfo.sessionPositionInfo.durationMs;
    }

    public androidx.media3.session.MediaController getInstance() {
        return this.instance;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getMaxSeekToPreviousPosition() {
        return this.playerInfo.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public p076i4.AbstractC2186b0 getMediaButtonPreferences() {
        return this.resolvedMediaButtonPreferences;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.MediaMetadata getMediaMetadata() {
        return this.playerInfo.mediaMetadata;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getNextMediaItemIndex() {
        if (this.playerInfo.timeline.isEmpty()) {
            return -1;
        }
        return this.playerInfo.timeline.getNextWindowIndex(getCurrentMediaItemIndex(), convertRepeatModeForNavigation(this.playerInfo.repeatMode), this.playerInfo.shuffleModeEnabled);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean getPlayWhenReady() {
        return this.playerInfo.playWhenReady;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.playerInfo.playbackParameters;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPlaybackState() {
        return this.playerInfo.playbackState;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPlaybackSuppressionReason() {
        return this.playerInfo.playbackSuppressionReason;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.PlaybackException getPlayerError() {
        return this.playerInfo.playerError;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        return this.playerInfo.playlistMetadata;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getPreviousMediaItemIndex() {
        if (this.playerInfo.timeline.isEmpty()) {
            return -1;
        }
        return this.playerInfo.timeline.getPreviousWindowIndex(getCurrentMediaItemIndex(), convertRepeatModeForNavigation(this.playerInfo.repeatMode), this.playerInfo.shuffleModeEnabled);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public int getRepeatMode() {
        return this.playerInfo.repeatMode;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getSeekBackIncrement() {
        return this.playerInfo.seekBackIncrementMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getSeekForwardIncrement() {
        return this.playerInfo.seekForwardIncrementMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public android.app.PendingIntent getSessionActivity() {
        return this.sessionActivity;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public android.os.Bundle getSessionExtras() {
        return this.sessionExtras;
    }

    public androidx.media3.session.IMediaSession getSessionInterfaceWithSessionCommandIfAble(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 != 0);
        if (this.sessionCommands.contains(i3)) {
            return this.iSession;
        }
        Y6.f.p(i3, "Controller isn't allowed to call command, commandCode=", TAG);
        return null;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean getShuffleModeEnabled() {
        return this.playerInfo.shuffleModeEnabled;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.util.Size getSurfaceSize() {
        return this.surfaceSize;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public long getTotalBufferedDuration() {
        return this.playerInfo.sessionPositionInfo.totalBufferedDurationMs;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        return this.playerInfo.trackSelectionParameters;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public androidx.media3.common.VideoSize getVideoSize() {
        return this.playerInfo.videoSize;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public float getVolume() {
        return this.playerInfo.volume;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void increaseDeviceVolume() {
        if (isPlayerCommandAvailable(26)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 16));
            int i3 = this.playerInfo.deviceVolume + 1;
            int i9 = getDeviceInfo().maxVolume;
            if (i9 == 0 || i3 <= i9) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i3, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.session.C1593n(i3, 9, this));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isConnected() {
        return this.iSession != null;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isDeviceMuted() {
        return this.playerInfo.deviceMuted;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isLoading() {
        return this.playerInfo.isLoading;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isPlaying() {
        return this.playerInfo.isPlaying;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public boolean isPlayingAd() {
        return this.playerInfo.sessionPositionInfo.isPlayingAd;
    }

    public boolean isReleased() {
        return this.released;
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void moveMediaItem(int i3, int i9) {
        if (isPlayerCommandAvailable(20)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0 && i9 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1609v(this, i3, i9, 0));
            moveMediaItemsInternal(i3, i3 + 1, i9);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void moveMediaItems(final int i3, final int i9, final int i10) {
        if (isPlayerCommandAvailable(20)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0 && i3 <= i9 && i10 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.P
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i11) {
                    this.f16927h.lambda$moveMediaItems$44(i3, i9, i10, iMediaSession, i11);
                }
            });
            moveMediaItemsInternal(i3, i9, i10);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void mute() {
        if (isPlayerCommandAvailable(24)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 5));
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.volume != 0.0f) {
                this.playerInfo = playerInfo.copyWithVolume(0.0f);
                this.listeners.queueEvent(22, new androidx.media3.session.C1605t(0));
                this.listeners.flushEvents();
            }
        }
    }

    public void notifyPeriodicSessionPositionInfoChanged(androidx.media3.session.SessionPositionInfo sessionPositionInfo) {
        if (isConnected()) {
            updateSessionPositionInfoIfNeeded(sessionPositionInfo);
        }
    }

    public void notifyPlatformControllerAboutMedia3ChangeRequest() {
        android.media.session.MediaController mediaController;
        if (android.os.Build.VERSION.SDK_INT < 31 || (mediaController = this.platformController) == null) {
            return;
        }
        mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (android.os.Bundle) null);
    }

    public void onAvailableCommandsChangedFromPlayer(androidx.media3.common.Player.Commands commands) {
        boolean z6;
        boolean z9;
        if (isConnected() && !java.util.Objects.equals(this.playerCommandsFromPlayer, commands)) {
            this.playerCommandsFromPlayer = commands;
            androidx.media3.common.Player.Commands commands2 = this.intersectedPlayerCommands;
            androidx.media3.common.Player.Commands commandsCreateIntersectedCommandsWithControllerOverrides = createIntersectedCommandsWithControllerOverrides(this.playerCommandsFromSession, commands);
            this.intersectedPlayerCommands = commandsCreateIntersectedCommandsWithControllerOverrides;
            if (java.util.Objects.equals(commandsCreateIntersectedCommandsWithControllerOverrides, commands2)) {
                z6 = false;
                z9 = false;
            } else {
                p076i4.AbstractC2186b0 abstractC2186b0 = this.resolvedMediaButtonPreferences;
                p076i4.AbstractC2186b0 abstractC2186b1 = this.resolvedCustomLayout;
                p076i4.AbstractC2186b0 abstractC2186b0ResolveMediaButtonPreferences = resolveMediaButtonPreferences(this.mediaButtonPreferencesOriginal, this.customLayoutOriginal, this.sessionCommands, this.intersectedPlayerCommands, this.sessionExtras);
                this.resolvedMediaButtonPreferences = abstractC2186b0ResolveMediaButtonPreferences;
                this.resolvedCustomLayout = resolveCustomLayout(abstractC2186b0ResolveMediaButtonPreferences, this.customLayoutOriginal, this.sessionExtras, this.sessionCommands, this.intersectedPlayerCommands);
                z6 = !this.resolvedMediaButtonPreferences.equals(abstractC2186b0);
                z9 = !this.resolvedCustomLayout.equals(abstractC2186b1);
                this.listeners.sendEvent(13, new androidx.media3.session.C1595o(this, 2));
            }
            if (z9) {
                getInstance().notifyControllerListener(new androidx.media3.session.C1595o(this, 3));
            }
            if (z6) {
                getInstance().notifyControllerListener(new androidx.media3.session.C1595o(this, 4));
            }
        }
    }

    public void onAvailableCommandsChangedFromSession(androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        boolean z6;
        androidx.media3.session.MediaControllerImplBase mediaControllerImplBase;
        androidx.media3.session.SessionCommands sessionCommands2;
        boolean z9;
        if (isConnected()) {
            boolean zEquals = java.util.Objects.equals(this.playerCommandsFromSession, commands);
            boolean zEquals2 = java.util.Objects.equals(this.sessionCommands, sessionCommands);
            if (!zEquals || !zEquals2) {
                this.sessionCommands = sessionCommands;
                boolean z10 = false;
                if (zEquals) {
                    z6 = false;
                } else {
                    this.playerCommandsFromSession = commands;
                    androidx.media3.common.Player.Commands commands2 = this.intersectedPlayerCommands;
                    androidx.media3.common.Player.Commands commandsCreateIntersectedCommandsWithControllerOverrides = createIntersectedCommandsWithControllerOverrides(commands, this.playerCommandsFromPlayer);
                    this.intersectedPlayerCommands = commandsCreateIntersectedCommandsWithControllerOverrides;
                    z6 = !java.util.Objects.equals(commandsCreateIntersectedCommandsWithControllerOverrides, commands2);
                }
                if (!zEquals2 || z6) {
                    p076i4.AbstractC2186b0 abstractC2186b0 = this.resolvedMediaButtonPreferences;
                    p076i4.AbstractC2186b0 abstractC2186b1 = this.resolvedCustomLayout;
                    p076i4.AbstractC2186b0 abstractC2186b0ResolveMediaButtonPreferences = resolveMediaButtonPreferences(this.mediaButtonPreferencesOriginal, this.customLayoutOriginal, sessionCommands, this.intersectedPlayerCommands, this.sessionExtras);
                    this.resolvedMediaButtonPreferences = abstractC2186b0ResolveMediaButtonPreferences;
                    mediaControllerImplBase = this;
                    sessionCommands2 = sessionCommands;
                    mediaControllerImplBase.resolvedCustomLayout = mediaControllerImplBase.resolveCustomLayout(abstractC2186b0ResolveMediaButtonPreferences, this.customLayoutOriginal, this.sessionExtras, sessionCommands2, this.intersectedPlayerCommands);
                    z9 = !mediaControllerImplBase.resolvedMediaButtonPreferences.equals(abstractC2186b0);
                    z10 = !mediaControllerImplBase.resolvedCustomLayout.equals(abstractC2186b1);
                } else {
                    mediaControllerImplBase = this;
                    sessionCommands2 = sessionCommands;
                    z9 = false;
                }
                if (z6) {
                    mediaControllerImplBase.listeners.sendEvent(13, new androidx.media3.session.C1595o(this, 21));
                }
                if (!zEquals2) {
                    getInstance().notifyControllerListener(new androidx.media3.session.C1585j(this, sessionCommands2, 1));
                }
                if (z10) {
                    getInstance().notifyControllerListener(new androidx.media3.session.C1595o(this, 0));
                }
                if (z9) {
                    getInstance().notifyControllerListener(new androidx.media3.session.C1595o(this, 1));
                }
            }
        }
    }

    public void onConnected(androidx.media3.session.ConnectionState connectionState) {
        if (this.iSession != null) {
            androidx.media3.common.util.Log.e(TAG, "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
            getInstance().release();
            return;
        }
        this.iSession = connectionState.sessionBinder;
        this.playerInfo = connectionState.playerInfo;
        this.sessionActivity = connectionState.sessionActivity;
        this.sessionCommands = connectionState.sessionCommands;
        androidx.media3.common.Player.Commands commands = connectionState.playerCommandsFromSession;
        this.playerCommandsFromSession = commands;
        androidx.media3.common.Player.Commands commands2 = connectionState.playerCommandsFromPlayer;
        this.playerCommandsFromPlayer = commands2;
        androidx.media3.common.Player.Commands commandsCreateIntersectedCommandsWithControllerOverrides = createIntersectedCommandsWithControllerOverrides(commands, commands2);
        this.intersectedPlayerCommands = commandsCreateIntersectedCommandsWithControllerOverrides;
        p076i4.AbstractC2186b0 abstractC2186b0 = connectionState.customLayout;
        this.customLayoutOriginal = abstractC2186b0;
        p076i4.AbstractC2186b0 abstractC2186b1 = connectionState.mediaButtonPreferences;
        this.mediaButtonPreferencesOriginal = abstractC2186b1;
        p076i4.AbstractC2186b0 abstractC2186b0ResolveMediaButtonPreferences = resolveMediaButtonPreferences(abstractC2186b1, abstractC2186b0, this.sessionCommands, commandsCreateIntersectedCommandsWithControllerOverrides, connectionState.sessionExtras);
        this.resolvedMediaButtonPreferences = abstractC2186b0ResolveMediaButtonPreferences;
        this.resolvedCustomLayout = resolveCustomLayout(abstractC2186b0ResolveMediaButtonPreferences, this.customLayoutOriginal, connectionState.sessionExtras, this.sessionCommands, this.intersectedPlayerCommands, connectionState.sessionInterfaceVersion);
        p076i4.C2192e0 c2192e0 = new p076i4.C2192e0(4);
        for (int i3 = 0; i3 < connectionState.commandButtonsForMediaItems.size(); i3++) {
            androidx.media3.session.CommandButton commandButton = (androidx.media3.session.CommandButton) connectionState.commandButtonsForMediaItems.get(i3);
            androidx.media3.session.SessionCommand sessionCommand = commandButton.sessionCommand;
            if (sessionCommand != null && sessionCommand.commandCode == 0) {
                c2192e0.c(sessionCommand.customAction, commandButton);
            }
        }
        this.commandButtonsForMediaItemsMap = c2192e0.a(true);
        android.media.session.MediaSession.Token platformToken = connectionState.platformToken;
        if (platformToken == null) {
            platformToken = this.token.getPlatformToken();
        }
        android.media.session.MediaSession.Token token = platformToken;
        if (token != null) {
            this.platformController = new android.media.session.MediaController(this.context, token);
        }
        try {
            connectionState.sessionBinder.asBinder().linkToDeath(this.deathRecipient, 0);
            this.connectedToken = new androidx.media3.session.SessionToken(this.token.getUid(), 0, connectionState.libraryVersion, connectionState.sessionInterfaceVersion, this.token.getPackageName(), connectionState.sessionBinder, connectionState.tokenExtras, token);
            this.sessionExtras = connectionState.sessionExtras;
            getInstance().notifyAccepted();
        } catch (android.os.RemoteException unused) {
            getInstance().release();
        }
    }

    public void onCustomCommand(int i3, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        if (isConnected()) {
            getInstance().notifyControllerListener(new androidx.media3.session.U(i3, sessionCommand, bundle, this));
        }
    }

    public void onCustomCommandProgressUpdate(int i3, androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, android.os.Bundle bundle2) {
        androidx.media3.session.MediaController.ProgressListener progressListener;
        if (isConnected() && (progressListener = this.pendingCustomActionProgressListeners.get(i3)) != null) {
            progressListener.onProgress(getInstance(), sessionCommand, bundle, bundle2);
        }
    }

    public void onError(int i3, androidx.media3.session.SessionError sessionError) {
        if (isConnected()) {
            getInstance().notifyControllerListener(new androidx.media3.session.C1585j(this, sessionError, 9));
        }
    }

    public void onExtrasChanged(android.os.Bundle bundle) {
        if (isConnected()) {
            p076i4.AbstractC2186b0 abstractC2186b0 = this.resolvedMediaButtonPreferences;
            p076i4.AbstractC2186b0 abstractC2186b1 = this.resolvedCustomLayout;
            this.sessionExtras = bundle;
            p076i4.AbstractC2186b0 abstractC2186b0ResolveMediaButtonPreferences = resolveMediaButtonPreferences(this.mediaButtonPreferencesOriginal, this.customLayoutOriginal, this.sessionCommands, this.intersectedPlayerCommands, bundle);
            this.resolvedMediaButtonPreferences = abstractC2186b0ResolveMediaButtonPreferences;
            this.resolvedCustomLayout = resolveCustomLayout(abstractC2186b0ResolveMediaButtonPreferences, this.customLayoutOriginal, this.sessionExtras, this.sessionCommands, this.intersectedPlayerCommands);
            getInstance().notifyControllerListener(new androidx.media3.session.M(this, !this.resolvedCustomLayout.equals(abstractC2186b1), bundle, !this.resolvedMediaButtonPreferences.equals(abstractC2186b0)));
        }
    }

    public void onPlayerInfoChanged(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusions) {
        androidx.media3.session.PlayerInfo playerInfo2;
        androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusions2;
        if (isConnected()) {
            boolean z6 = getSessionInterfaceVersion() < 6;
            androidx.media3.session.PlayerInfo playerInfo3 = this.pendingPlayerInfo;
            if (playerInfo3 != null) {
                androidx.media3.common.Player.Commands commands = this.intersectedPlayerCommands;
                androidx.media3.session.SessionToken sessionToken = this.connectedToken;
                sessionToken.getClass();
                this.pendingPlayerInfo = androidx.media3.session.MediaUtils.mergePlayerInfo(playerInfo3, playerInfo, bundlingExclusions, commands, z6, sessionToken);
                if (!this.pendingMaskingSequencedFutureNumbers.isEmpty()) {
                    return;
                }
                androidx.media3.session.PlayerInfo playerInfo4 = this.pendingPlayerInfo;
                androidx.media3.session.PlayerInfo.BundlingExclusions bundlingExclusions3 = androidx.media3.session.PlayerInfo.BundlingExclusions.NONE;
                this.pendingPlayerInfo = null;
                playerInfo2 = playerInfo4;
                bundlingExclusions2 = bundlingExclusions3;
            } else {
                playerInfo2 = playerInfo;
                bundlingExclusions2 = bundlingExclusions;
            }
            androidx.media3.session.PlayerInfo playerInfo5 = this.playerInfo;
            androidx.media3.common.Player.Commands commands2 = this.intersectedPlayerCommands;
            androidx.media3.session.SessionToken sessionToken2 = this.connectedToken;
            sessionToken2.getClass();
            androidx.media3.session.PlayerInfo playerInfoMergePlayerInfo = androidx.media3.session.MediaUtils.mergePlayerInfo(playerInfo5, playerInfo2, bundlingExclusions2, commands2, z6, sessionToken2);
            this.playerInfo = playerInfoMergePlayerInfo;
            java.lang.Integer numValueOf = (playerInfo5.oldPositionInfo.equals(playerInfo2.oldPositionInfo) && playerInfo5.newPositionInfo.equals(playerInfo2.newPositionInfo)) ? null : java.lang.Integer.valueOf(playerInfoMergePlayerInfo.discontinuityReason);
            boolean zEquals = java.util.Objects.equals(playerInfo5.getCurrentMediaItem(), playerInfoMergePlayerInfo.getCurrentMediaItem());
            java.lang.Integer numValueOf2 = !zEquals ? java.lang.Integer.valueOf(playerInfoMergePlayerInfo.mediaItemTransitionReason) : null;
            if (zEquals && numValueOf != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == 1)) {
                if (playerInfo5.newPositionInfo.mediaItemIndex != playerInfoMergePlayerInfo.newPositionInfo.mediaItemIndex) {
                    numValueOf2 = java.lang.Integer.valueOf(numValueOf.intValue() != 0 ? 2 : 1);
                } else if (playerInfo5.repeatMode != 0 && numValueOf.intValue() == 0 && playerInfo5.oldPositionInfo.adGroupIndex == -1 && playerInfoMergePlayerInfo.newPositionInfo.adGroupIndex == -1) {
                    numValueOf2 = 0;
                }
            }
            java.lang.Integer numValueOf3 = !playerInfo5.timeline.equals(playerInfoMergePlayerInfo.timeline) ? java.lang.Integer.valueOf(playerInfoMergePlayerInfo.timelineChangeReason) : null;
            int i3 = playerInfo5.playWhenReadyChangeReason;
            int i9 = playerInfoMergePlayerInfo.playWhenReadyChangeReason;
            notifyPlayerInfoListenersWithReasons(playerInfo5, playerInfoMergePlayerInfo, numValueOf3, (i3 == i9 && playerInfo5.playWhenReady == playerInfoMergePlayerInfo.playWhenReady) ? null : java.lang.Integer.valueOf(i9), numValueOf, numValueOf2);
        }
    }

    public void onRenderedFirstFrame() {
        this.listeners.sendEvent(26, new D1.C0223h(8));
    }

    public void onSetCustomLayout(int i3, java.util.List<androidx.media3.session.CommandButton> list) {
        if (isConnected()) {
            p076i4.AbstractC2186b0 abstractC2186b0 = this.resolvedMediaButtonPreferences;
            p076i4.AbstractC2186b0 abstractC2186b1 = this.resolvedCustomLayout;
            this.customLayoutOriginal = p076i4.AbstractC2186b0.u(list);
            p076i4.AbstractC2186b0 abstractC2186b0ResolveMediaButtonPreferences = resolveMediaButtonPreferences(this.mediaButtonPreferencesOriginal, list, this.sessionCommands, this.intersectedPlayerCommands, this.sessionExtras);
            this.resolvedMediaButtonPreferences = abstractC2186b0ResolveMediaButtonPreferences;
            this.resolvedCustomLayout = resolveCustomLayout(abstractC2186b0ResolveMediaButtonPreferences, list, this.sessionExtras, this.sessionCommands, this.intersectedPlayerCommands);
            getInstance().notifyControllerListener(new androidx.media3.session.S(this, !this.resolvedCustomLayout.equals(abstractC2186b1), !this.resolvedMediaButtonPreferences.equals(abstractC2186b0), i3, 1));
        }
    }

    public void onSetMediaButtonPreferences(int i3, java.util.List<androidx.media3.session.CommandButton> list) {
        if (isConnected()) {
            p076i4.AbstractC2186b0 abstractC2186b0 = this.resolvedMediaButtonPreferences;
            p076i4.AbstractC2186b0 abstractC2186b1 = this.resolvedCustomLayout;
            this.mediaButtonPreferencesOriginal = p076i4.AbstractC2186b0.u(list);
            p076i4.AbstractC2186b0 abstractC2186b0ResolveMediaButtonPreferences = resolveMediaButtonPreferences(list, this.customLayoutOriginal, this.sessionCommands, this.intersectedPlayerCommands, this.sessionExtras);
            this.resolvedMediaButtonPreferences = abstractC2186b0ResolveMediaButtonPreferences;
            this.resolvedCustomLayout = resolveCustomLayout(abstractC2186b0ResolveMediaButtonPreferences, this.customLayoutOriginal, this.sessionExtras, this.sessionCommands, this.intersectedPlayerCommands);
            getInstance().notifyControllerListener(new androidx.media3.session.S(this, !this.resolvedCustomLayout.equals(abstractC2186b1), !this.resolvedMediaButtonPreferences.equals(abstractC2186b0), i3, 0));
        }
    }

    public void onSetSessionActivity(int i3, android.app.PendingIntent pendingIntent) {
        if (!isConnected() || java.util.Objects.equals(this.sessionActivity, pendingIntent)) {
            return;
        }
        this.sessionActivity = pendingIntent;
        getInstance().notifyControllerListener(new androidx.media3.session.C1585j(this, pendingIntent, 8));
    }

    public void onSurfaceSizeChanged(int i3, int i9) {
        if (this.surfaceSize.getWidth() == i3 && this.surfaceSize.getHeight() == i9) {
            return;
        }
        this.surfaceSize = new androidx.media3.common.util.Size(i3, i9);
        this.listeners.sendEvent(24, new androidx.media3.session.C1601r(i3, i9, 0));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void pause() {
        if (isPlayerCommandAvailable(1)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 15));
            setPlayWhenReady(false, 1);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void play() {
        if (!isPlayerCommandAvailable(1)) {
            androidx.media3.common.util.Log.w(TAG, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        } else {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 18));
            setPlayWhenReady(true, 1);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void prepare() {
        if (isPlayerCommandAvailable(2)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 20));
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.playbackState == 1) {
                updatePlayerInfo(playerInfo.copyWithPlaybackState(playerInfo.timeline.isEmpty() ? 4 : 2, null), null, null, null, null);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void release() {
        androidx.media3.session.IMediaSession iMediaSession = this.iSession;
        if (this.released) {
            return;
        }
        this.released = true;
        this.connectedToken = null;
        this.fallbackPlaybackInfoUpdateHandler.removeCallbacksAndMessages(null);
        clearSurfacesAndCallbacks();
        this.flushCommandQueueHandler.release();
        this.iSession = null;
        if (iMediaSession != null && iMediaSession.asBinder().isBinderAlive()) {
            int iObtainNextSequenceNumber = this.sequencedFutureManager.obtainNextSequenceNumber();
            try {
                iMediaSession.asBinder().unlinkToDeath(this.deathRecipient, 0);
                iMediaSession.release(this.controllerStub, iObtainNextSequenceNumber);
            } catch (android.os.RemoteException unused) {
            }
        }
        this.listeners.release();
        this.sequencedFutureManager.lazyRelease(30000L, new androidx.media3.session.C(this, 1));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeListener(androidx.media3.common.Player.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeMediaItem(int i3) {
        if (isPlayerCommandAvailable(20)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1593n(i3, 8, this));
            removeMediaItemsInternal(i3, i3 + 1);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void removeMediaItems(int i3, int i9) {
        if (isPlayerCommandAvailable(20)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0 && i9 >= i3);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1609v(this, i3, i9, 1));
            removeMediaItemsInternal(i3, i9);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void replaceMediaItem(int i3, androidx.media3.common.MediaItem mediaItem) {
        if (isPlayerCommandAvailable(20)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.B(this, i3, mediaItem, 0));
            replaceMediaItemsInternal(i3, i3 + 1, p076i4.AbstractC2186b0.y(mediaItem));
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void replaceMediaItems(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0 && i3 <= i9);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.G(i3, i9, 1, this, list));
            replaceMediaItemsInternal(i3, i9, list);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekBack() {
        if (isPlayerCommandAvailable(11)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 14));
            seekToInternalByOffset(-getSeekBackIncrement());
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekForward() {
        if (isPlayerCommandAvailable(12)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 8));
            seekToInternalByOffset(getSeekForwardIncrement());
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekTo(long j) {
        if (isPlayerCommandAvailable(5)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.F(this, j));
            seekToInternal(getCurrentMediaItemIndex(), j);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToDefaultPosition() {
        if (isPlayerCommandAvailable(4)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 9));
            seekToInternal(getCurrentMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToNext() {
        if (isPlayerCommandAvailable(9)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 12));
            androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
            if (currentTimeline.isEmpty() || isPlayingAd()) {
                return;
            }
            if (hasNextMediaItem()) {
                seekToInternal(getNextMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
                return;
            }
            androidx.media3.common.Timeline.Window window = currentTimeline.getWindow(getCurrentMediaItemIndex(), new androidx.media3.common.Timeline.Window());
            if (window.isDynamic && window.isLive()) {
                seekToInternal(getCurrentMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToNextMediaItem() {
        if (isPlayerCommandAvailable(8)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 6));
            if (getNextMediaItemIndex() != -1) {
                seekToInternal(getNextMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToPrevious() {
        if (isPlayerCommandAvailable(7)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 11));
            androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
            if (currentTimeline.isEmpty() || isPlayingAd()) {
                return;
            }
            boolean zHasPreviousMediaItem = hasPreviousMediaItem();
            androidx.media3.common.Timeline.Window window = currentTimeline.getWindow(getCurrentMediaItemIndex(), new androidx.media3.common.Timeline.Window());
            if (window.isDynamic && window.isLive()) {
                if (zHasPreviousMediaItem) {
                    seekToInternal(getPreviousMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
                }
            } else if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
                seekToInternal(getCurrentMediaItemIndex(), 0L);
            } else {
                seekToInternal(getPreviousMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToPreviousMediaItem() {
        if (isPlayerCommandAvailable(6)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 10));
            if (getPreviousMediaItemIndex() != -1) {
                seekToInternal(getPreviousMediaItemIndex(), androidx.media3.common.C.TIME_UNSET);
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.J sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle) {
        return getSessionInterfaceVersion() >= 7 ? sendCustomCommand(sessionCommand, bundle, null) : dispatchRemoteSessionTaskWithSessionCommand(sessionCommand, new androidx.media3.session.C1583i(this, sessionCommand, bundle, 3));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z6) {
        if (isPlayerCommandAvailable(35)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1613x(1, this, audioAttributes, z6));
            if (this.playerInfo.audioAttributes.equals(audioAttributes)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithAudioAttributes(audioAttributes);
            this.listeners.queueEvent(20, new androidx.media3.session.A(audioAttributes));
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void setDeviceMuted(boolean z6) {
        if (isPlayerCommandAvailable(26)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1607u(this, z6, 3));
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.deviceMuted != z6) {
                this.playerInfo = playerInfo.copyWithDeviceVolume(playerInfo.deviceVolume, z6);
                this.listeners.queueEvent(30, new androidx.media3.session.C1607u(this, z6, 4));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    @java.lang.Deprecated
    public void setDeviceVolume(int i3) {
        if (isPlayerCommandAvailable(25)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1593n(i3, 2, this));
            androidx.media3.common.DeviceInfo deviceInfo = getDeviceInfo();
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.deviceVolume == i3 || deviceInfo.minVolume > i3) {
                return;
            }
            int i9 = deviceInfo.maxVolume;
            if (i9 == 0 || i3 <= i9) {
                this.playerInfo = playerInfo.copyWithDeviceVolume(i3, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.session.C1593n(i3, 3, this));
                this.listeners.flushEvents();
            }
        }
    }

    public <T> void setFutureResult(final int i3, T t9) {
        this.sequencedFutureManager.setFutureResult(i3, t9);
        getInstance().runOnApplicationLooper(new java.lang.Runnable() { // from class: androidx.media3.session.W
            @Override // java.lang.Runnable
            public final void run() {
                this.f16960h.lambda$setFutureResult$113(i3);
            }
        });
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem) {
        if (isPlayerCommandAvailable(31)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.I(this, mediaItem, 0));
            setMediaItemsInternal(java.util.Collections.singletonList(mediaItem), -1, androidx.media3.common.C.TIME_UNSET, true);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.D(1, list, this));
            setMediaItemsInternal(list, -1, androidx.media3.common.C.TIME_UNSET, true);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlayWhenReady(boolean z6) {
        if (isPlayerCommandAvailable(1)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1607u(this, z6, 0));
            setPlayWhenReady(z6, 1);
        } else if (z6) {
            androidx.media3.common.util.Log.w(TAG, "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        if (isPlayerCommandAvailable(13)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1585j(this, playbackParameters, 4));
            if (this.playerInfo.playbackParameters.equals(playbackParameters)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithPlaybackParameters(playbackParameters);
            this.listeners.queueEvent(12, new androidx.media3.session.E(0, playbackParameters));
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaybackSpeed(float f9) {
        if (isPlayerCommandAvailable(13)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1597p(this, f9, 1));
            androidx.media3.common.PlaybackParameters playbackParameters = this.playerInfo.playbackParameters;
            if (playbackParameters.speed != f9) {
                androidx.media3.common.PlaybackParameters playbackParametersWithSpeed = playbackParameters.withSpeed(f9);
                this.playerInfo = this.playerInfo.copyWithPlaybackParameters(playbackParametersWithSpeed);
                this.listeners.queueEvent(12, new androidx.media3.session.E(1, playbackParametersWithSpeed));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        if (isPlayerCommandAvailable(19)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1585j(this, mediaMetadata, 6));
            if (this.playerInfo.playlistMetadata.equals(mediaMetadata)) {
                return;
            }
            this.playerInfo = this.playerInfo.copyWithPlaylistMetadata(mediaMetadata);
            this.listeners.queueEvent(15, new androidx.media3.session.H(0, mediaMetadata));
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.J setRating(java.lang.String str, androidx.media3.common.Rating rating) {
        return dispatchRemoteSessionTaskWithSessionCommand(androidx.media3.session.SessionCommand.COMMAND_CODE_SESSION_SET_RATING, new androidx.media3.session.C1583i(this, str, rating, 2));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setRepeatMode(int i3) {
        if (isPlayerCommandAvailable(15)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1593n(i3, 1, this));
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.repeatMode != i3) {
                this.playerInfo = playerInfo.copyWithRepeatMode(i3);
                this.listeners.queueEvent(8, new androidx.media3.session.C1611w(i3, 0));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setShuffleModeEnabled(boolean z6) {
        if (isPlayerCommandAvailable(14)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1607u(this, z6, 2));
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.shuffleModeEnabled != z6) {
                this.playerInfo = playerInfo.copyWithShuffleModeEnabled(z6);
                this.listeners.queueEvent(9, new androidx.media3.session.Q(z6, 0));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        if (isPlayerCommandAvailable(29)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1585j(this, trackSelectionParameters, 2));
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            if (trackSelectionParameters != playerInfo.trackSelectionParameters) {
                this.playerInfo = playerInfo.copyWithTrackSelectionParameters(trackSelectionParameters);
                this.listeners.queueEvent(19, new androidx.media3.session.C1617z(trackSelectionParameters));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurface(android.view.Surface surface) {
        if (isPlayerCommandAvailable(27)) {
            clearSurfacesAndCallbacks();
            this.videoSurface = surface;
            int i3 = surface == null ? 0 : -1;
            setVideoSurfaceWithSize(surface, i3, i3);
            onSurfaceSizeChanged(i3, i3);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        if (isPlayerCommandAvailable(27)) {
            if (surfaceHolder == null) {
                clearVideoSurface();
                return;
            }
            if (this.videoSurfaceHolder == surfaceHolder) {
                return;
            }
            clearSurfacesAndCallbacks();
            this.videoSurfaceHolder = surfaceHolder;
            surfaceHolder.addCallback(this.surfaceCallback);
            android.view.Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                this.videoSurface = null;
                setVideoSurfaceWithSize(null, 0, 0);
                onSurfaceSizeChanged(0, 0);
            } else {
                this.videoSurface = surface;
                android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                setVideoSurfaceWithSize(surface, surfaceFrame.width(), surfaceFrame.height());
                onSurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        if (isPlayerCommandAvailable(27)) {
            setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVideoTextureView(android.view.TextureView textureView) {
        if (isPlayerCommandAvailable(27)) {
            if (textureView == null) {
                clearVideoSurface();
                return;
            }
            if (this.videoTextureView == textureView) {
                return;
            }
            clearSurfacesAndCallbacks();
            this.videoTextureView = textureView;
            textureView.setSurfaceTextureListener(this.surfaceCallback);
            android.graphics.SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture == null) {
                setVideoSurfaceWithSize(null, 0, 0);
                onSurfaceSizeChanged(0, 0);
            } else {
                android.view.Surface surface = new android.view.Surface(surfaceTexture);
                this.videoSurface = surface;
                setVideoSurfaceWithSize(surface, textureView.getWidth(), textureView.getHeight());
                onSurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setVolume(float f9) {
        if (isPlayerCommandAvailable(24)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1597p(this, f9, 2));
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.volume != f9) {
                this.playerInfo = playerInfo.copyWithVolume(f9);
                this.listeners.queueEvent(22, new androidx.media3.session.C1599q(f9, 1));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void stop() {
        if (isPlayerCommandAvailable(3)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1595o(this, 19));
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            androidx.media3.session.SessionPositionInfo sessionPositionInfo = this.playerInfo.sessionPositionInfo;
            androidx.media3.common.Player.PositionInfo positionInfo = sessionPositionInfo.positionInfo;
            boolean z6 = sessionPositionInfo.isPlayingAd;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            androidx.media3.session.SessionPositionInfo sessionPositionInfo2 = this.playerInfo.sessionPositionInfo;
            long j = sessionPositionInfo2.durationMs;
            long j9 = sessionPositionInfo2.positionInfo.positionMs;
            int iCalculateBufferedPercentage = androidx.media3.session.MediaUtils.calculateBufferedPercentage(j9, j);
            androidx.media3.session.SessionPositionInfo sessionPositionInfo3 = this.playerInfo.sessionPositionInfo;
            androidx.media3.session.PlayerInfo playerInfoCopyWithSessionPositionInfo = playerInfo.copyWithSessionPositionInfo(new androidx.media3.session.SessionPositionInfo(positionInfo, z6, jElapsedRealtime, j, j9, iCalculateBufferedPercentage, 0L, sessionPositionInfo3.currentLiveOffsetMs, sessionPositionInfo3.contentDurationMs, sessionPositionInfo3.positionInfo.positionMs));
            this.playerInfo = playerInfoCopyWithSessionPositionInfo;
            if (playerInfoCopyWithSessionPositionInfo.playbackState != 1) {
                this.playerInfo = playerInfoCopyWithSessionPositionInfo.copyWithPlaybackState(1, playerInfoCopyWithSessionPositionInfo.playerError);
                this.listeners.queueEvent(4, new androidx.media3.session.C1605t(1));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void unmute() {
        if (isPlayerCommandAvailable(24)) {
            float f9 = this.playerInfo.unmuteVolume;
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1597p(this, f9, 0));
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            float f10 = playerInfo.volume;
            if (f10 == playerInfo.unmuteVolume || f10 != 0.0f) {
                return;
            }
            this.playerInfo = playerInfo.copyWithVolume(f9);
            this.listeners.queueEvent(22, new androidx.media3.session.C1599q(f9, 0));
            this.listeners.flushEvents();
        }
    }

    private com.google.common.util.concurrent.J dispatchRemoteSessionTaskWithSessionCommand(androidx.media3.session.SessionCommand sessionCommand, androidx.media3.session.MediaControllerImplBase.RemoteSessionTask remoteSessionTask) {
        return dispatchRemoteSessionTaskWithSessionCommandInternal(0, sessionCommand, remoteSessionTask);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.J setRating(androidx.media3.common.Rating rating) {
        return dispatchRemoteSessionTaskWithSessionCommand(androidx.media3.session.SessionCommand.COMMAND_CODE_SESSION_SET_RATING, new androidx.media3.session.C1585j(this, rating, 3));
    }

    private static p076i4.AbstractC2186b0 resolveCustomLayout(java.util.List<androidx.media3.session.CommandButton> list, java.util.List<androidx.media3.session.CommandButton> list2, android.os.Bundle bundle, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands, int i3) {
        if (!list2.isEmpty()) {
            return androidx.media3.session.CommandButton.copyWithUnavailableButtonsDisabled(list2, sessionCommands, commands);
        }
        boolean z6 = false;
        boolean z9 = (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || commands.containsAny(6, 7)) ? false : true;
        if (!bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT") && !commands.containsAny(8, 9)) {
            z6 = true;
        }
        return androidx.media3.session.CommandButton.getCustomLayoutFromMediaButtonPreferences(list, z9, z6, i3);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItems(int i3, java.util.List<androidx.media3.common.MediaItem> list) {
        if (isPlayerCommandAvailable(20)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.V(this, i3, list));
            addMediaItemsInternal(i3, list);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekTo(int i3, long j) {
        if (isPlayerCommandAvailable(10)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.Y(i3, j, this));
            seekToInternal(i3, j);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void seekToDefaultPosition(int i3) {
        if (isPlayerCommandAvailable(10)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1593n(i3, 0, this));
            seekToInternal(i3, androidx.media3.common.C.TIME_UNSET);
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public com.google.common.util.concurrent.J sendCustomCommand(androidx.media3.session.SessionCommand sessionCommand, android.os.Bundle bundle, androidx.media3.session.MediaController.ProgressListener progressListener) {
        if (getSessionInterfaceVersion() < 7) {
            return sendCustomCommand(sessionCommand, bundle);
        }
        return dispatchRemoteSessionTaskWithSessionCommand(sessionCommand, new androidx.media3.session.C1587k(this, progressListener, sessionCommand, bundle));
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z6) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1613x(2, this, list, z6));
            setMediaItemsInternal(list, -1, androidx.media3.common.C.TIME_UNSET, z6);
        }
    }

    private void setPlayWhenReady(boolean z6, int i3) {
        int playbackSuppressionReason = getPlaybackSuppressionReason();
        if (playbackSuppressionReason == 1) {
            playbackSuppressionReason = 0;
        }
        androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
        if (playerInfo.playWhenReady == z6 && playerInfo.playbackSuppressionReason == playbackSuppressionReason) {
            return;
        }
        this.currentPositionMs = androidx.media3.session.MediaUtils.getUpdatedCurrentPositionMs(playerInfo, this.currentPositionMs, this.lastSetPlayWhenReadyCalledTimeMs, getInstance().getTimeDiffMs());
        this.lastSetPlayWhenReadyCalledTimeMs = android.os.SystemClock.elapsedRealtime();
        updatePlayerInfo(this.playerInfo.copyWithPlayWhenReady(z6, i3, playbackSuppressionReason), null, java.lang.Integer.valueOf(i3), null, null);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void addMediaItem(int i3, androidx.media3.common.MediaItem mediaItem) {
        if (isPlayerCommandAvailable(20)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.B(this, i3, mediaItem, 1));
            addMediaItemsInternal(i3, java.util.Collections.singletonList(mediaItem));
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void clearVideoSurface(android.view.Surface surface) {
        if (isPlayerCommandAvailable(27) && surface != null && this.videoSurface == surface) {
            clearVideoSurface();
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(final androidx.media3.common.MediaItem mediaItem, final long j) {
        if (isPlayerCommandAvailable(31)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.N
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i3) {
                    this.f16919h.lambda$setMediaItem$24(mediaItem, j, iMediaSession, i3);
                }
            });
            setMediaItemsInternal(java.util.Collections.singletonList(mediaItem), -1, j, false);
        }
    }

    private static androidx.media3.session.PlayerInfo maskTimelineAndPositionInfo(androidx.media3.session.PlayerInfo playerInfo, androidx.media3.common.Timeline timeline, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.session.SessionPositionInfo sessionPositionInfo, int i3) {
        return new androidx.media3.session.PlayerInfo.Builder(playerInfo).setTimeline(timeline).setOldPositionInfo(playerInfo.sessionPositionInfo.positionInfo).setNewPositionInfo(positionInfo).setSessionPositionInfo(sessionPositionInfo).setDiscontinuityReason(i3).build();
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setDeviceMuted(final boolean z6, final int i3) {
        if (isPlayerCommandAvailable(34)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.O
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i9) {
                    this.f16923h.lambda$setDeviceMuted$76(z6, i3, iMediaSession, i9);
                }
            });
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.deviceMuted != z6) {
                this.playerInfo = playerInfo.copyWithDeviceVolume(playerInfo.deviceVolume, z6);
                this.listeners.queueEvent(30, new androidx.media3.session.C1607u(this, z6, 1));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItems(final java.util.List<androidx.media3.common.MediaItem> list, final int i3, final long j) {
        if (isPlayerCommandAvailable(20)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.MediaControllerImplBase.RemoteSessionTask() { // from class: androidx.media3.session.s
                @Override // androidx.media3.session.MediaControllerImplBase.RemoteSessionTask
                public final void run(androidx.media3.session.IMediaSession iMediaSession, int i9) {
                    this.f17104h.lambda$setMediaItems$31(list, i3, j, iMediaSession, i9);
                }
            });
            setMediaItemsInternal(list, i3, j, false);
        }
    }

    private static androidx.media3.session.MediaControllerImplBase.PeriodInfo getPeriodInfo(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period, int i3, long j) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.R(i3, timeline.getWindowCount());
        timeline.getWindow(i3, window);
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = window.getDefaultPositionUs();
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return null;
            }
        }
        int i9 = window.firstPeriodIndex;
        timeline.getPeriod(i9, period);
        while (i9 < window.lastPeriodIndex && period.positionInWindowUs != j) {
            int i10 = i9 + 1;
            if (timeline.getPeriod(i10, period).positionInWindowUs > j) {
                break;
            }
            i9 = i10;
        }
        timeline.getPeriod(i9, period);
        return new androidx.media3.session.MediaControllerImplBase.PeriodInfo(i9, j - period.positionInWindowUs);
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void decreaseDeviceVolume(int i3) {
        if (isPlayerCommandAvailable(34)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1593n(i3, 5, this));
            int i9 = this.playerInfo.deviceVolume - 1;
            if (i9 >= getDeviceInfo().minVolume) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i9, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.session.C1593n(i9, 6, this));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void increaseDeviceVolume(int i3) {
        if (isPlayerCommandAvailable(34)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1593n(i3, 10, this));
            int i9 = this.playerInfo.deviceVolume + 1;
            int i10 = getDeviceInfo().maxVolume;
            if (i10 == 0 || i9 <= i10) {
                androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
                this.playerInfo = playerInfo.copyWithDeviceVolume(i9, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.session.C1593n(i9, 11, this));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setDeviceVolume(int i3, int i9) {
        if (isPlayerCommandAvailable(33)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1609v(this, i3, i9, 2));
            androidx.media3.common.DeviceInfo deviceInfo = getDeviceInfo();
            androidx.media3.session.PlayerInfo playerInfo = this.playerInfo;
            if (playerInfo.deviceVolume == i3 || deviceInfo.minVolume > i3) {
                return;
            }
            int i10 = deviceInfo.maxVolume;
            if (i10 == 0 || i3 <= i10) {
                this.playerInfo = playerInfo.copyWithDeviceVolume(i3, playerInfo.deviceMuted);
                this.listeners.queueEvent(30, new androidx.media3.session.C1593n(i3, 7, this));
                this.listeners.flushEvents();
            }
        }
    }

    @Override // androidx.media3.session.MediaController.MediaControllerImpl
    public void setMediaItem(androidx.media3.common.MediaItem mediaItem, boolean z6) {
        if (isPlayerCommandAvailable(31)) {
            dispatchRemoteSessionTaskWithPlayerCommand(new androidx.media3.session.C1613x(0, this, mediaItem, z6));
            setMediaItemsInternal(java.util.Collections.singletonList(mediaItem), -1, androidx.media3.common.C.TIME_UNSET, z6);
        }
    }

    public androidx.media3.session.IMediaSession getSessionInterfaceWithSessionCommandIfAble(androidx.media3.session.SessionCommand sessionCommand) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(sessionCommand.commandCode == 0);
        if (!this.sessionCommands.contains(sessionCommand) && !androidx.media3.session.CommandButton.isPredefinedCustomCommandButtonCode(sessionCommand.customAction)) {
            androidx.media3.common.util.Log.w(TAG, "Controller isn't allowed to call custom session command:" + sessionCommand.customAction);
            return null;
        }
        return this.iSession;
    }
}
