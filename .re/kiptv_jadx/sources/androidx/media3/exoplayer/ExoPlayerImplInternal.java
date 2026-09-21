package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class ExoPlayerImplInternal implements android.os.Handler.Callback, androidx.media3.exoplayer.source.MediaPeriod.Callback, androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener, androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener, androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener, androidx.media3.exoplayer.PlayerMessage.Sender, androidx.media3.common.audio.AudioFocusManager.PlayerControl, androidx.media3.exoplayer.video.VideoFrameMetadataListener {
    private static final long BUFFERING_MAXIMUM_INTERVAL_MS = androidx.media3.common.util.Util.usToMs(androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
    private static final long DURATION_TO_ADVANCE_READING_THRESHOLD_US = 10000000;
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_AUDIO_FOCUS_PLAYER_COMMAND = 33;
    private static final int MSG_AUDIO_FOCUS_VOLUME_MULTIPLIER = 34;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 29;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_RENDERER_CAPABILITIES_CHANGED = 26;
    private static final int MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE = 37;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_AUDIO_ATTRIBUTES = 31;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_IMAGE_METADATA_LISTENER = 39;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_PRELOAD_CONFIGURATION = 28;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SCRUBBING_MODE_ENABLED = 36;
    private static final int MSG_SET_SCRUBBING_MODE_PARAMETERS = 38;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 35;
    private static final int MSG_SET_VIDEO_OUTPUT = 30;
    private static final int MSG_SET_VOLUME = 32;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final int MSG_UPDATE_MEDIA_SOURCES_WITH_MEDIA_ITEMS = 27;
    private static final long PLAYBACK_BUFFER_EMPTY_THRESHOLD_US = 500000;
    private static final int PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final long READY_MAXIMUM_INTERVAL_MS = 1000;
    private static final java.lang.String TAG = "ExoPlayerImplInternal";
    private final androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector;
    private final androidx.media3.common.util.HandlerWrapper applicationLooperHandler;
    private final androidx.media3.common.audio.AudioFocusManager audioFocusManager;
    private final boolean avoidLoadingWhileEnded;
    private final long backBufferDurationUs;
    private final androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter;
    private final androidx.media3.common.util.Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private int droppedSeeksWhileScrubbing;
    private final boolean dynamicSchedulingEnabled;
    private final androidx.media3.exoplayer.trackselection.TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final androidx.media3.common.util.HandlerWrapper handler;
    private final boolean hasSecondaryRenderers;
    private boolean isPrewarmingDisabledUntilNextTransition;
    private boolean isRebuffering;
    private final androidx.media3.exoplayer.LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final androidx.media3.exoplayer.LoadControl loadControl;
    private final androidx.media3.exoplayer.DefaultMediaClock mediaClock;
    private final androidx.media3.exoplayer.MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition pendingInitialSeekPosition;
    private final java.util.ArrayList<androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private androidx.media3.exoplayer.ExoPlaybackException pendingRecoverableRendererError;
    private final androidx.media3.common.Timeline.Period period;
    private androidx.media3.exoplayer.PlaybackInfo playbackInfo;
    private androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate;
    private final androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final android.os.Looper playbackLooper;
    private final androidx.media3.exoplayer.PlaybackLooperProvider playbackLooperProvider;
    private final androidx.media3.exoplayer.analytics.PlayerId playerId;
    private androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration;
    private final androidx.media3.exoplayer.MediaPeriodQueue queue;
    private androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition queuedSeekWhileScrubbing;
    private final long releaseTimeoutMs;
    private boolean releasedOnApplicationThread;
    private final androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilities;
    private long rendererPositionElapsedRealtimeUs;
    private long rendererPositionUs;
    private final boolean[] rendererReportedReady;
    private final androidx.media3.exoplayer.RendererHolder[] renderers;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private boolean scrubbingModeEnabled;
    private androidx.media3.exoplayer.SeekParameters scrubbingModeSeekParameters;
    private boolean seekIsPendingWhileScrubbing;
    private androidx.media3.exoplayer.SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector;
    private final androidx.media3.common.Timeline.Window window;
    private long prewarmingMediaPeriodDiscontinuity = androidx.media3.common.C.TIME_UNSET;
    private float volume = 1.0f;
    private androidx.media3.exoplayer.ScrubbingModeParameters scrubbingModeParameters = androidx.media3.exoplayer.ScrubbingModeParameters.DEFAULT;
    private long playbackMaybeBecameStuckAtMs = androidx.media3.common.C.TIME_UNSET;
    private long lastRebufferRealtimeMs = androidx.media3.common.C.TIME_UNSET;
    private androidx.media3.common.Timeline lastPreloadPoolInvalidationTimeline = androidx.media3.common.Timeline.EMPTY;

    public static final class MediaSourceListUpdateMessage {
        private final java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> list, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder, int i3, long j) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i3;
            this.positionUs = j;
        }
    }

    public static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i3, int i9, int i10, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
            this.fromIndex = i3;
            this.toIndex = i9;
            this.newFromIndex = i10;
            this.shuffleOrder = shuffleOrder;
        }
    }

    public static final class PendingMessageInfo implements java.lang.Comparable<androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo> {
        public final androidx.media3.exoplayer.PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public java.lang.Object resolvedPeriodUid;

        public PendingMessageInfo(androidx.media3.exoplayer.PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        public void setResolvedPosition(int i3, long j, java.lang.Object obj) {
            this.resolvedPeriodIndex = i3;
            this.resolvedPeriodTimeUs = j;
            this.resolvedPeriodUid = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo) {
            java.lang.Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i3 = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i3 != 0 ? i3 : java.lang.Long.compare(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }
    }

    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public int operationAcks;
        public androidx.media3.exoplayer.PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void incrementPendingOperationAcks(int i3) {
            this.hasPendingChange |= i3 > 0;
            this.operationAcks += i3;
        }

        public void setPlaybackInfo(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i3) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i3;
        }
    }

    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate);
    }

    public static final class PositionUpdateForPlaylistChange {
        private final int discontinuityReason;
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId periodId;
        private final boolean periodPositionChanged;
        public final long periodPositionUs;
        private final boolean reportDiscontinuity;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j9, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, int i3) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j;
            this.requestedContentPositionUs = j9;
            this.forceBufferingState = z6;
            this.endPlayback = z9;
            this.setTargetLiveOffset = z10;
            this.periodPositionChanged = z11;
            this.reportDiscontinuity = z12;
            this.discontinuityReason = i3;
        }
    }

    public static final class SeekPosition {
        public final androidx.media3.common.Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(androidx.media3.common.Timeline timeline, int i3, long j) {
            this.timeline = timeline;
            this.windowIndex = i3;
            this.windowPositionUs = j;
        }
    }

    public ExoPlayerImplInternal(android.content.Context context, androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.Renderer[] rendererArr2, androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, androidx.media3.exoplayer.LoadControl loadControl, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, int i3, boolean z6, androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, androidx.media3.exoplayer.SeekParameters seekParameters, androidx.media3.exoplayer.LivePlaybackSpeedControl livePlaybackSpeedControl, long j, boolean z9, boolean z10, android.os.Looper looper, androidx.media3.common.util.Clock clock, androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.exoplayer.PlaybackLooperProvider playbackLooperProvider, androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration, final androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener, boolean z11) {
        this.playbackInfoUpdateListener = playbackInfoUpdateListener;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.bandwidthMeter = bandwidthMeter;
        this.repeatMode = i3;
        this.shuffleModeEnabled = z6;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl;
        this.releaseTimeoutMs = j;
        this.setForegroundModeTimeoutMs = j;
        this.pauseAtEndOfWindow = z9;
        this.dynamicSchedulingEnabled = z10;
        this.clock = clock;
        this.playerId = playerId;
        this.preloadConfiguration = preloadConfiguration;
        this.analyticsCollector = analyticsCollector;
        this.avoidLoadingWhileEnded = z11;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs(playerId);
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe(playerId);
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCreateDummy = androidx.media3.exoplayer.PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = playbackInfoCreateDummy;
        this.playbackInfoUpdate = new androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate(playbackInfoCreateDummy);
        this.rendererCapabilities = new androidx.media3.exoplayer.RendererCapabilities[rendererArr.length];
        this.rendererReportedReady = new boolean[rendererArr.length];
        androidx.media3.exoplayer.RendererCapabilities.Listener rendererCapabilitiesListener = trackSelector.getRendererCapabilitiesListener();
        this.renderers = new androidx.media3.exoplayer.RendererHolder[rendererArr.length];
        boolean z12 = false;
        for (int i9 = 0; i9 < rendererArr.length; i9++) {
            rendererArr[i9].init(i9, playerId, clock);
            this.rendererCapabilities[i9] = rendererArr[i9].getCapabilities();
            if (rendererCapabilitiesListener != null) {
                this.rendererCapabilities[i9].setListener(rendererCapabilitiesListener);
            }
            androidx.media3.exoplayer.Renderer renderer = rendererArr2[i9];
            if (renderer != null) {
                renderer.init(i9, playerId, clock);
                z12 = true;
            }
            this.renderers[i9] = new androidx.media3.exoplayer.RendererHolder(rendererArr[i9], rendererArr2[i9], i9);
        }
        this.hasSecondaryRenderers = z12;
        this.mediaClock = new androidx.media3.exoplayer.DefaultMediaClock(this, clock);
        this.pendingMessages = new java.util.ArrayList<>();
        this.window = new androidx.media3.common.Timeline.Window();
        this.period = new androidx.media3.common.Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        androidx.media3.common.util.HandlerWrapper handlerWrapperCreateHandler = clock.createHandler(looper, null);
        this.applicationLooperHandler = handlerWrapperCreateHandler;
        this.queue = new androidx.media3.exoplayer.MediaPeriodQueue(analyticsCollector, handlerWrapperCreateHandler, new androidx.media3.exoplayer.C1560o(9, this), preloadConfiguration);
        this.mediaSourceList = new androidx.media3.exoplayer.MediaSourceList(this, analyticsCollector, handlerWrapperCreateHandler, playerId);
        androidx.media3.exoplayer.PlaybackLooperProvider playbackLooperProvider2 = playbackLooperProvider == null ? new androidx.media3.exoplayer.PlaybackLooperProvider() : playbackLooperProvider;
        this.playbackLooperProvider = playbackLooperProvider2;
        android.os.Looper looperObtainLooper = playbackLooperProvider2.obtainLooper();
        this.playbackLooper = looperObtainLooper;
        androidx.media3.common.util.HandlerWrapper handlerWrapperCreateHandler2 = clock.createHandler(looperObtainLooper, this);
        this.handler = handlerWrapperCreateHandler2;
        this.audioFocusManager = new androidx.media3.common.audio.AudioFocusManager(context, looperObtainLooper, this);
        handlerWrapperCreateHandler2.obtainMessage(35, new androidx.media3.exoplayer.video.VideoFrameMetadataListener() { // from class: androidx.media3.exoplayer.E
            @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
            public final void onVideoFrameAboutToBeRendered(long j9, long j10, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
                this.f16482h.lambda$new$0(videoFrameMetadataListener, j9, j10, format, mediaFormat);
            }
        }).sendToTarget();
        handlerWrapperCreateHandler2.obtainMessage(39, new androidx.media3.exoplayer.image.ImageMetadataListener() { // from class: androidx.media3.exoplayer.F
            @Override // androidx.media3.exoplayer.image.ImageMetadataListener
            public final void onImageAboutToBeAvailable(long j9, androidx.media3.common.Format format) {
                this.f16484a.lambda$new$1(j9, format);
            }
        }).sendToTarget();
    }

    private void addMediaItemsInternal(androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i3) throws java.lang.Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        androidx.media3.exoplayer.MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i3 == -1) {
            i3 = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i3, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void allowRenderersToRenderStartOfStreams() {
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
        for (int i3 = 0; i3 < this.renderers.length; i3++) {
            if (trackSelectorResult.isRendererEnabled(i3)) {
                this.renderers[i3].enableMayRenderStartOfStream();
            }
        }
    }

    private void applyScrubbingModeParameters() {
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setScrubbingMode(this.scrubbingModeEnabled ? this.scrubbingModeParameters : null);
        }
    }

    private boolean areRenderersPrewarming() {
        if (!this.hasSecondaryRenderers) {
            return false;
        }
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            if (rendererHolder.isPrewarming()) {
                return true;
            }
        }
        return false;
    }

    private void attemptRendererErrorRecovery() {
        reselectTracksInternalAndSeek();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.exoplayer.MediaPeriodHolder createMediaPeriodHolder(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo, long j) {
        return new androidx.media3.exoplayer.MediaPeriodHolder(this.rendererCapabilities, j, this.trackSelector, this.loadControl.getAllocator(this.playerId), this.mediaSourceList, mediaPeriodInfo, this.emptyTrackSelectorResult, this.preloadConfiguration.targetPreloadDurationUs);
    }

    private void deliverMessage(androidx.media3.exoplayer.PlayerMessage playerMessage) {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void disableAndResetPrewarmingRenderers() {
        if (this.hasSecondaryRenderers && areRenderersPrewarming()) {
            for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
                int enabledRendererCount = rendererHolder.getEnabledRendererCount();
                rendererHolder.disablePrewarming(this.mediaClock);
                this.enabledRendererCount -= enabledRendererCount - rendererHolder.getEnabledRendererCount();
            }
            this.prewarmingMediaPeriodDiscontinuity = androidx.media3.common.C.TIME_UNSET;
        }
    }

    private void disableRenderer(int i3) {
        int enabledRendererCount = this.renderers[i3].getEnabledRendererCount();
        this.renderers[i3].disable(this.mediaClock);
        maybeTriggerOnRendererReadyChanged(i3, false);
        this.enabledRendererCount -= enabledRendererCount;
    }

    private void disableRenderers() {
        for (int i3 = 0; i3 < this.renderers.length; i3++) {
            disableRenderer(i3);
        }
        this.prewarmingMediaPeriodDiscontinuity = androidx.media3.common.C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:109:0x019b  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01af  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:140:0x014a A[EDGE_INSN: B:140:0x014a->B:90:0x014a BREAK  A[LOOP:1: B:84:0x0137->B:89:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0125  */
    /* JADX WARN: Code duplicated, block: B:83:0x0136  */
    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0144  */
    /* JADX WARN: Code duplicated, block: B:92:0x0150  */
    private void doSomeWork() {
        boolean z6;
        boolean z9;
        long j;
        boolean z10;
        boolean z11;
        boolean z12;
        androidx.media3.exoplayer.PlaybackInfo playbackInfo;
        int i3;
        int i9;
        androidx.media3.exoplayer.RendererHolder[] rendererHolderArr;
        androidx.media3.exoplayer.PlaybackInfo playbackInfo2;
        long jUptimeMillis = this.clock.uptimeMillis();
        this.handler.removeMessages(2);
        if (!this.avoidLoadingWhileEnded) {
            updatePeriods();
        }
        int i10 = this.playbackInfo.playbackState;
        if (i10 == 1 || i10 == 4) {
            return;
        }
        if (this.avoidLoadingWhileEnded) {
            updatePeriods();
        }
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            scheduleNextWork(jUptimeMillis);
            return;
        }
        androidx.media3.common.util.TraceUtil.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (playingPeriod.prepared) {
            this.rendererPositionElapsedRealtimeUs = androidx.media3.common.util.Util.msToUs(this.clock.elapsedRealtime());
            playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            z6 = true;
            z9 = true;
            int i11 = 0;
            while (true) {
                androidx.media3.exoplayer.RendererHolder[] rendererHolderArr2 = this.renderers;
                if (i11 >= rendererHolderArr2.length) {
                    break;
                }
                androidx.media3.exoplayer.RendererHolder rendererHolder = rendererHolderArr2[i11];
                if (rendererHolder.getEnabledRendererCount() == 0) {
                    maybeTriggerOnRendererReadyChanged(i11, false);
                } else {
                    rendererHolder.render(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs);
                    z6 = z6 && rendererHolder.isEnded();
                    boolean zAllowsPlayback = rendererHolder.allowsPlayback(playingPeriod);
                    maybeTriggerOnRendererReadyChanged(i11, zAllowsPlayback);
                    z9 = z9 && zAllowsPlayback;
                    if (!zAllowsPlayback) {
                        maybeThrowRendererStreamError(i11);
                    }
                }
                i11++;
            }
        } else {
            playingPeriod.mediaPeriod.maybeThrowPrepareError();
            z6 = true;
            z9 = true;
        }
        long j9 = playingPeriod.info.durationUs;
        if (z6 && playingPeriod.prepared) {
            if (j9 != androidx.media3.common.C.TIME_UNSET) {
                j = -9223372036854775807L;
                if (j9 <= this.playbackInfo.positionUs) {
                }
                if (z10 && this.pendingPauseAtEndOfPeriod) {
                    this.pendingPauseAtEndOfPeriod = false;
                    setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
                }
                if (!z10 && playingPeriod.info.isFinal) {
                    setState(4);
                    stopRenderers();
                } else if (this.playbackInfo.playbackState != 2 && shouldTransitionToReadyState(z9)) {
                    setState(3);
                    this.pendingRecoverableRendererError = null;
                    if (shouldPlayWhenReady()) {
                        updateRebufferingState(false, false);
                        this.mediaClock.start();
                        startRenderers();
                    }
                } else if (this.playbackInfo.playbackState == 3 && (this.enabledRendererCount != 0 ? !z9 : !isTimelineReady())) {
                    updateRebufferingState(shouldPlayWhenReady(), false);
                    setState(2);
                    if (this.isRebuffering) {
                        notifyTrackSelectionRebuffer();
                        this.livePlaybackSpeedControl.notifyRebuffer();
                    }
                    stopRenderers();
                }
                if (this.playbackInfo.playbackState == 2) {
                    i9 = 0;
                    while (true) {
                        rendererHolderArr = this.renderers;
                        if (i9 >= rendererHolderArr.length) {
                            break;
                        }
                        if (rendererHolderArr[i9].isReadingFromPeriod(playingPeriod)) {
                            maybeThrowRendererStreamError(i9);
                        }
                        i9++;
                    }
                    playbackInfo2 = this.playbackInfo;
                    if (!playbackInfo2.isLoading || playbackInfo2.totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US || !isLoadingPossible(this.queue.getLoadingPeriod()) || !shouldPlayWhenReady()) {
                        this.playbackMaybeBecameStuckAtMs = j;
                    } else if (this.playbackMaybeBecameStuckAtMs == j) {
                        this.playbackMaybeBecameStuckAtMs = this.clock.elapsedRealtime();
                    } else if (this.clock.elapsedRealtime() - this.playbackMaybeBecameStuckAtMs >= 4000) {
                        throw new androidx.media3.common.util.StuckPlayerException(0, PLAYBACK_STUCK_AFTER_MS);
                    }
                } else {
                    this.playbackMaybeBecameStuckAtMs = j;
                }
                if (shouldPlayWhenReady() || this.playbackInfo.playbackState != 3) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                z12 = !this.offloadSchedulingEnabled && this.requestForRendererSleep && z11;
                playbackInfo = this.playbackInfo;
                if (playbackInfo.sleepingForOffload != z12) {
                    this.playbackInfo = playbackInfo.copyWithSleepingForOffload(z12);
                }
                this.requestForRendererSleep = false;
                if (!z12 && (i3 = this.playbackInfo.playbackState) != 4 && (z11 || i3 == 2 || (i3 == 3 && this.enabledRendererCount != 0))) {
                    scheduleNextWork(jUptimeMillis);
                }
                androidx.media3.common.util.TraceUtil.endSection();
            }
            j = -9223372036854775807L;
            z10 = true;
            if (z10) {
                this.pendingPauseAtEndOfPeriod = false;
                setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
            }
            if (!z10) {
                if (this.playbackInfo.playbackState != 2) {
                    if (this.playbackInfo.playbackState == 3) {
                        updateRebufferingState(shouldPlayWhenReady(), false);
                        setState(2);
                        if (this.isRebuffering) {
                            notifyTrackSelectionRebuffer();
                            this.livePlaybackSpeedControl.notifyRebuffer();
                        }
                        stopRenderers();
                    }
                } else if (this.playbackInfo.playbackState == 3) {
                    updateRebufferingState(shouldPlayWhenReady(), false);
                    setState(2);
                    if (this.isRebuffering) {
                        notifyTrackSelectionRebuffer();
                        this.livePlaybackSpeedControl.notifyRebuffer();
                    }
                    stopRenderers();
                }
            } else if (this.playbackInfo.playbackState != 2) {
                if (this.playbackInfo.playbackState == 3) {
                    updateRebufferingState(shouldPlayWhenReady(), false);
                    setState(2);
                    if (this.isRebuffering) {
                        notifyTrackSelectionRebuffer();
                        this.livePlaybackSpeedControl.notifyRebuffer();
                    }
                    stopRenderers();
                }
            } else if (this.playbackInfo.playbackState == 3) {
                updateRebufferingState(shouldPlayWhenReady(), false);
                setState(2);
                if (this.isRebuffering) {
                    notifyTrackSelectionRebuffer();
                    this.livePlaybackSpeedControl.notifyRebuffer();
                }
                stopRenderers();
            }
            if (this.playbackInfo.playbackState == 2) {
                i9 = 0;
                while (true) {
                    rendererHolderArr = this.renderers;
                    if (i9 >= rendererHolderArr.length) {
                        break;
                        break;
                    } else {
                        if (rendererHolderArr[i9].isReadingFromPeriod(playingPeriod)) {
                            maybeThrowRendererStreamError(i9);
                        }
                        i9++;
                    }
                }
                playbackInfo2 = this.playbackInfo;
                if (!playbackInfo2.isLoading) {
                    this.playbackMaybeBecameStuckAtMs = j;
                } else {
                    this.playbackMaybeBecameStuckAtMs = j;
                }
            } else {
                this.playbackMaybeBecameStuckAtMs = j;
            }
            if (shouldPlayWhenReady()) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (this.offloadSchedulingEnabled) {
            }
            playbackInfo = this.playbackInfo;
            if (playbackInfo.sleepingForOffload != z12) {
                this.playbackInfo = playbackInfo.copyWithSleepingForOffload(z12);
            }
            this.requestForRendererSleep = false;
            if (!z12) {
                scheduleNextWork(jUptimeMillis);
            }
            androidx.media3.common.util.TraceUtil.endSection();
        }
        j = -9223372036854775807L;
        z10 = false;
        if (z10) {
            this.pendingPauseAtEndOfPeriod = false;
            setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
        }
        if (!z10) {
            if (this.playbackInfo.playbackState != 2) {
                if (this.playbackInfo.playbackState == 3) {
                    updateRebufferingState(shouldPlayWhenReady(), false);
                    setState(2);
                    if (this.isRebuffering) {
                        notifyTrackSelectionRebuffer();
                        this.livePlaybackSpeedControl.notifyRebuffer();
                    }
                    stopRenderers();
                }
            } else if (this.playbackInfo.playbackState == 3) {
                updateRebufferingState(shouldPlayWhenReady(), false);
                setState(2);
                if (this.isRebuffering) {
                    notifyTrackSelectionRebuffer();
                    this.livePlaybackSpeedControl.notifyRebuffer();
                }
                stopRenderers();
            }
        } else if (this.playbackInfo.playbackState != 2) {
            if (this.playbackInfo.playbackState == 3) {
                updateRebufferingState(shouldPlayWhenReady(), false);
                setState(2);
                if (this.isRebuffering) {
                    notifyTrackSelectionRebuffer();
                    this.livePlaybackSpeedControl.notifyRebuffer();
                }
                stopRenderers();
            }
        } else if (this.playbackInfo.playbackState == 3) {
            updateRebufferingState(shouldPlayWhenReady(), false);
            setState(2);
            if (this.isRebuffering) {
                notifyTrackSelectionRebuffer();
                this.livePlaybackSpeedControl.notifyRebuffer();
            }
            stopRenderers();
        }
        if (this.playbackInfo.playbackState == 2) {
            i9 = 0;
            while (true) {
                rendererHolderArr = this.renderers;
                if (i9 >= rendererHolderArr.length) {
                    break;
                    break;
                } else {
                    if (rendererHolderArr[i9].isReadingFromPeriod(playingPeriod)) {
                        maybeThrowRendererStreamError(i9);
                    }
                    i9++;
                }
            }
            playbackInfo2 = this.playbackInfo;
            if (!playbackInfo2.isLoading) {
                this.playbackMaybeBecameStuckAtMs = j;
            } else {
                this.playbackMaybeBecameStuckAtMs = j;
            }
        } else {
            this.playbackMaybeBecameStuckAtMs = j;
        }
        if (shouldPlayWhenReady()) {
            z11 = false;
        } else {
            z11 = false;
        }
        if (this.offloadSchedulingEnabled) {
        }
        playbackInfo = this.playbackInfo;
        if (playbackInfo.sleepingForOffload != z12) {
            this.playbackInfo = playbackInfo.copyWithSleepingForOffload(z12);
        }
        this.requestForRendererSleep = false;
        if (!z12) {
            scheduleNextWork(jUptimeMillis);
        }
        androidx.media3.common.util.TraceUtil.endSection();
    }

    private void enableRenderer(androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder, int i3, boolean z6, long j) {
        androidx.media3.exoplayer.RendererHolder rendererHolder = this.renderers[i3];
        if (rendererHolder.isRendererEnabled()) {
            return;
        }
        boolean z9 = mediaPeriodHolder == this.queue.getPlayingPeriod();
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = mediaPeriodHolder.getTrackSelectorResult();
        androidx.media3.exoplayer.RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i3];
        androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = trackSelectorResult.selections[i3];
        boolean z10 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z11 = !z6 && z10;
        this.enabledRendererCount++;
        rendererHolder.enable(rendererConfiguration, exoTrackSelection, mediaPeriodHolder.sampleStreams[i3], this.rendererPositionUs, z11, z9, j, mediaPeriodHolder.getRendererOffset(), mediaPeriodHolder.info.id, this.mediaClock);
        rendererHolder.handleMessage(11, new androidx.media3.exoplayer.Renderer.WakeupListener() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal.1
            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onSleep() {
                androidx.media3.exoplayer.ExoPlayerImplInternal.this.requestForRendererSleep = true;
            }

            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public void onWakeup() {
                if (androidx.media3.exoplayer.ExoPlayerImplInternal.this.isDynamicSchedulingEnabled() || androidx.media3.exoplayer.ExoPlayerImplInternal.this.offloadSchedulingEnabled) {
                    androidx.media3.exoplayer.ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
                }
            }
        }, mediaPeriodHolder);
        if (z10 && z9) {
            rendererHolder.start();
        }
    }

    private void enableRenderers() {
        enableRenderers(new boolean[this.renderers.length], this.queue.getReadingPeriod().getStartPositionRendererTime());
    }

    private p076i4.AbstractC2186b0 extractMetadataFromTrackSelectionArray(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        p076i4.Y y = new p076i4.Y(4);
        boolean z6 = false;
        for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                androidx.media3.common.Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                if (metadata == null) {
                    y.c(new androidx.media3.common.Metadata(new androidx.media3.common.Metadata.Entry[0]));
                } else {
                    y.c(metadata);
                    z6 = true;
                }
            }
        }
        if (z6) {
            return y.f();
        }
        p076i4.Z z9 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.S0.f22832l;
    }

    private long getCurrentLiveOffsetUs() {
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        return getLiveOffsetUs(playbackInfo.timeline, playbackInfo.periodId.periodUid, playbackInfo.positionUs);
    }

    private long getDurationToMediaPeriodUs(androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(mediaPeriodHolder.prepared);
        return (long) ((mediaPeriodHolder.getStartPositionRendererTime() - this.rendererPositionUs) / this.mediaClock.getPlaybackParameters().speed);
    }

    private long getDynamicSchedulingWakeUpIntervalMs() {
        long jMin = this.playbackInfo.playbackState == 3 ? 1000L : BUFFERING_MAXIMUM_INTERVAL_MS;
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            jMin = java.lang.Math.min(jMin, androidx.media3.common.util.Util.usToMs(rendererHolder.getMinDurationToProgressUs(this.rendererPositionUs, this.rendererPositionElapsedRealtimeUs)));
        }
        if (!this.playbackInfo.isPlaying()) {
            return jMin;
        }
        androidx.media3.exoplayer.MediaPeriodHolder next = this.queue.getPlayingPeriod() != null ? this.queue.getPlayingPeriod().getNext() : null;
        if (next != null) {
            return (((float) androidx.media3.common.util.Util.msToUs(jMin)) * this.playbackInfo.playbackParameters.speed) + ((float) this.rendererPositionUs) >= ((float) next.getStartPositionRendererTime()) ? java.lang.Math.min(jMin, BUFFERING_MAXIMUM_INTERVAL_MS) : jMin;
        }
        return jMin;
    }

    private long getLiveOffsetUs(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        androidx.media3.common.Timeline.Window window = this.window;
        if (window.windowStartTimeMs != androidx.media3.common.C.TIME_UNSET && window.isLive()) {
            androidx.media3.common.Timeline.Window window2 = this.window;
            if (window2.isDynamic) {
                return androidx.media3.common.util.Util.msToUs(window2.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (this.period.getPositionInWindowUs() + j);
            }
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    private long getMaxRendererReadPositionUs(androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        long rendererOffset = mediaPeriodHolder.getRendererOffset();
        if (!mediaPeriodHolder.prepared) {
            return rendererOffset;
        }
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.RendererHolder[] rendererHolderArr = this.renderers;
            if (i3 >= rendererHolderArr.length) {
                return rendererOffset;
            }
            if (rendererHolderArr[i3].isReadingFromPeriod(mediaPeriodHolder)) {
                long readingPositionUs = this.renderers[i3].getReadingPositionUs(mediaPeriodHolder);
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = java.lang.Math.max(readingPositionUs, rendererOffset);
            }
            i3++;
        }
    }

    private android.util.Pair<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId, java.lang.Long> getPlaceholderFirstMediaPeriodPositionUs(androidx.media3.common.Timeline timeline) {
        if (timeline.isEmpty()) {
            return android.util.Pair.create(androidx.media3.exoplayer.PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), androidx.media3.common.C.TIME_UNSET);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, periodPositionUs.first, 0L);
        long jLongValue = ((java.lang.Long) periodPositionUs.second).longValue();
        if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            timeline.getPeriodByUid(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
            jLongValue = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? this.period.getAdResumePositionUs() : 0L;
        }
        return android.util.Pair.create(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange, java.lang.Long.valueOf(jLongValue));
    }

    private androidx.media3.exoplayer.SeekParameters getSeekParameters(long j) {
        androidx.media3.exoplayer.ScrubbingModeParameters scrubbingModeParameters;
        java.lang.Double d4;
        if (!this.scrubbingModeEnabled || j == androidx.media3.common.C.TIME_UNSET || (d4 = (scrubbingModeParameters = this.scrubbingModeParameters).fractionalSeekToleranceBefore) == null || scrubbingModeParameters.fractionalSeekToleranceAfter == null) {
            return this.seekParameters;
        }
        double d6 = j;
        double dDoubleValue = d4.doubleValue() * d6;
        java.math.RoundingMode roundingMode = java.math.RoundingMode.FLOOR;
        long jD = p091k4.c.d(dDoubleValue, roundingMode);
        long jD2 = p091k4.c.d(this.scrubbingModeParameters.fractionalSeekToleranceAfter.doubleValue() * d6, roundingMode);
        androidx.media3.exoplayer.SeekParameters seekParameters = this.scrubbingModeSeekParameters;
        if (seekParameters == null || seekParameters.toleranceBeforeUs != jD || seekParameters.toleranceAfterUs != jD2) {
            this.scrubbingModeSeekParameters = new androidx.media3.exoplayer.SeekParameters(jD, jD2);
        }
        return this.scrubbingModeSeekParameters;
    }

    private long getStaticSchedulingWakeUpIntervalMs() {
        if (this.playbackInfo.playbackState != 3 || shouldPlayWhenReady()) {
            return BUFFERING_MAXIMUM_INTERVAL_MS;
        }
        return 1000L;
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private void handleAudioFocusPlayerCommandInternal(int i3) {
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(playbackInfo.playWhenReady, i3, playbackInfo.playbackSuppressionReason, playbackInfo.playWhenReadyChangeReason);
    }

    private void handleAudioFocusVolumeMultiplierChange() {
        setVolumeInternal(this.volume);
    }

    private void handleContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        } else if (this.queue.isPreloading(mediaPeriod)) {
            maybeContinuePreloading();
        }
    }

    private void handleIoException(java.io.IOException iOException, int i3) {
        androidx.media3.exoplayer.ExoPlaybackException exoPlaybackExceptionCreateForSource = androidx.media3.exoplayer.ExoPlaybackException.createForSource(iOException, i3);
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(playingPeriod.info.id);
        }
        androidx.media3.common.util.Log.e(TAG, "Playback error", exoPlaybackExceptionCreateForSource);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackExceptionCreateForSource);
    }

    private void handleLoadingMediaPeriodChanged(boolean z6) {
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.id;
        boolean zEquals = this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (!zEquals) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        playbackInfo.bufferedPositionUs = loadingPeriod == null ? playbackInfo.positionUs : loadingPeriod.getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((!zEquals || z6) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.info.id, loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private void handleLoadingPeriodPrepared(androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder) {
        if (!mediaPeriodHolder.prepared) {
            float f9 = this.mediaClock.getPlaybackParameters().speed;
            androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
            mediaPeriodHolder.handlePrepared(f9, playbackInfo.timeline, playbackInfo.playWhenReady);
        }
        updateLoadControlTrackSelection(mediaPeriodHolder.info.id, mediaPeriodHolder.getTrackGroups(), mediaPeriodHolder.getTrackSelectorResult());
        if (mediaPeriodHolder == this.queue.getPlayingPeriod()) {
            resetRendererPosition(mediaPeriodHolder.info.startPositionUs, true);
            enableRenderers();
            mediaPeriodHolder.allRenderersInCorrectState = true;
            androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = this.playbackInfo;
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.periodId;
            long j = mediaPeriodHolder.info.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j, playbackInfo2.requestedContentPositionUs, j, false, 5);
        }
        maybeContinueLoading();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0163  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:85:0x0189  */
    /* JADX WARN: Code duplicated, block: B:86:0x018b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b7  */
    private void handleMediaSourceListInfoRefreshed(androidx.media3.common.Timeline timeline, boolean z6) throws java.lang.Throwable {
        androidx.media3.common.Timeline timeline2;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        boolean z9;
        long j;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2;
        long j9;
        int i3;
        androidx.media3.common.Timeline timeline3 = timeline;
        androidx.media3.exoplayer.ExoPlayerImplInternal.PositionUpdateForPlaylistChange positionUpdateForPlaylistChangeResolvePositionForPlaylistChange = resolvePositionForPlaylistChange(timeline3, this.playbackInfo, this.pendingInitialSeekPosition, this.queue, this.repeatMode, this.shuffleModeEnabled, z6, this.window, this.period);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId3 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodId;
        long jSeekToPeriodPosition = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodPositionUs;
        try {
            if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.endPlayback) {
                if (this.playbackInfo.playbackState != 1) {
                    setState(4);
                }
                resetInternal(false, false, false, true);
            }
            for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
                rendererHolder.setTimeline(timeline3);
            }
            try {
                if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodPositionChanged) {
                    i3 = 2;
                    z9 = false;
                    if (!timeline3.isEmpty()) {
                        for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
                            if (playingPeriod.info.id.equals(mediaPeriodId3)) {
                                playingPeriod.info = this.queue.getUpdatedMediaPeriodInfo(timeline3, playingPeriod.info);
                                playingPeriod.updateClipping();
                            }
                        }
                        jSeekToPeriodPosition = seekToPeriodPosition(mediaPeriodId3, jSeekToPeriodPosition, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.forceBufferingState);
                    }
                } else {
                    try {
                        long maxRendererReadPositionUs = 0;
                        long maxRendererReadPositionUs2 = this.queue.getReadingPeriod() == null ? 0L : getMaxRendererReadPositionUs(this.queue.getReadingPeriod());
                        if (areRenderersPrewarming() && this.queue.getPrewarmingPeriod() != null) {
                            maxRendererReadPositionUs = getMaxRendererReadPositionUs(this.queue.getPrewarmingPeriod());
                        }
                        try {
                            try {
                                i3 = 2;
                                z9 = false;
                                try {
                                    int iUpdateQueuedPeriods = this.queue.updateQueuedPeriods(timeline, this.rendererPositionUs, maxRendererReadPositionUs2, maxRendererReadPositionUs);
                                    timeline3 = timeline;
                                    if ((iUpdateQueuedPeriods & 1) != 0) {
                                        seekToCurrentPosition(false);
                                    } else if ((iUpdateQueuedPeriods & 2) != 0) {
                                        disableAndResetPrewarmingRenderers();
                                    }
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    timeline3 = timeline;
                                    timeline2 = timeline3;
                                    mediaPeriodId = mediaPeriodId3;
                                    androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
                                    androidx.media3.common.Timeline timeline4 = playbackInfo.timeline;
                                    androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId4 = playbackInfo.periodId;
                                    if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset) {
                                        j = jSeekToPeriodPosition;
                                    } else {
                                        j = androidx.media3.common.C.TIME_UNSET;
                                    }
                                    mediaPeriodId2 = mediaPeriodId;
                                    updatePlaybackSpeedSettingsForNewPeriod(timeline2, mediaPeriodId2, timeline4, mediaPeriodId4, j, false);
                                    if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodPositionChanged) {
                                        long j10 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.requestedContentPositionUs;
                                        if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.reportDiscontinuity) {
                                            j9 = jSeekToPeriodPosition;
                                        } else {
                                            j9 = this.playbackInfo.discontinuityStartPositionUs;
                                        }
                                        this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId2, jSeekToPeriodPosition, j10, j9, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.reportDiscontinuity, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.discontinuityReason);
                                    } else {
                                        long j11 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.requestedContentPositionUs;
                                        if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.reportDiscontinuity) {
                                            j9 = jSeekToPeriodPosition;
                                        } else {
                                            j9 = this.playbackInfo.discontinuityStartPositionUs;
                                        }
                                        this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId2, jSeekToPeriodPosition, j11, j9, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.reportDiscontinuity, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.discontinuityReason);
                                    }
                                    resetPendingPauseAtEndOfPeriod();
                                    resolvePendingMessagePositions(timeline2, this.playbackInfo.timeline);
                                    this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline2);
                                    if (!timeline2.isEmpty()) {
                                        this.pendingInitialSeekPosition = null;
                                    }
                                    handleLoadingMediaPeriodChanged(z9);
                                    this.handler.sendEmptyMessage(2);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                timeline3 = timeline;
                                z9 = false;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            timeline3 = timeline;
                            z9 = false;
                            timeline2 = timeline3;
                            mediaPeriodId = mediaPeriodId3;
                            androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = this.playbackInfo;
                            androidx.media3.common.Timeline timeline5 = playbackInfo2.timeline;
                            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId5 = playbackInfo2.periodId;
                            if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset) {
                                j = jSeekToPeriodPosition;
                            } else {
                                j = androidx.media3.common.C.TIME_UNSET;
                            }
                            mediaPeriodId2 = mediaPeriodId;
                            updatePlaybackSpeedSettingsForNewPeriod(timeline2, mediaPeriodId2, timeline5, mediaPeriodId5, j, false);
                            if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodPositionChanged || positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.requestedContentPositionUs != this.playbackInfo.requestedContentPositionUs) {
                                long j12 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.requestedContentPositionUs;
                                if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.reportDiscontinuity) {
                                    j9 = jSeekToPeriodPosition;
                                } else {
                                    j9 = this.playbackInfo.discontinuityStartPositionUs;
                                }
                                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId2, jSeekToPeriodPosition, j12, j9, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.reportDiscontinuity, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.discontinuityReason);
                            }
                            resetPendingPauseAtEndOfPeriod();
                            resolvePendingMessagePositions(timeline2, this.playbackInfo.timeline);
                            this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline2);
                            if (!timeline2.isEmpty()) {
                                this.pendingInitialSeekPosition = null;
                            }
                            handleLoadingMediaPeriodChanged(z9);
                            this.handler.sendEmptyMessage(2);
                            throw th;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                    }
                }
                androidx.media3.exoplayer.PlaybackInfo playbackInfo3 = this.playbackInfo;
                updatePlaybackSpeedSettingsForNewPeriod(timeline3, mediaPeriodId3, playbackInfo3.timeline, playbackInfo3.periodId, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset ? jSeekToPeriodPosition : androidx.media3.common.C.TIME_UNSET, false);
                androidx.media3.common.Timeline timeline6 = timeline3;
                if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodPositionChanged || positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.requestedContentPositionUs != this.playbackInfo.requestedContentPositionUs) {
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId3, jSeekToPeriodPosition, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.requestedContentPositionUs, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.reportDiscontinuity ? jSeekToPeriodPosition : this.playbackInfo.discontinuityStartPositionUs, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.reportDiscontinuity, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.discontinuityReason);
                }
                resetPendingPauseAtEndOfPeriod();
                resolvePendingMessagePositions(timeline6, this.playbackInfo.timeline);
                this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline6);
                if (!timeline6.isEmpty()) {
                    this.pendingInitialSeekPosition = null;
                }
                handleLoadingMediaPeriodChanged(z9);
                this.handler.sendEmptyMessage(i3);
            } catch (java.lang.Throwable th5) {
                th = th5;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            timeline2 = timeline3;
            mediaPeriodId = mediaPeriodId3;
            z9 = false;
        }
    }

    private void handlePeriodPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.getClass();
            handleLoadingPeriodPrepared(loadingPeriod);
            return;
        }
        androidx.media3.exoplayer.MediaPeriodHolder preloadHolderByMediaPeriod = this.queue.getPreloadHolderByMediaPeriod(mediaPeriod);
        if (preloadHolderByMediaPeriod != null) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!preloadHolderByMediaPeriod.prepared);
            float f9 = this.mediaClock.getPlaybackParameters().speed;
            androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
            preloadHolderByMediaPeriod.handlePrepared(f9, playbackInfo.timeline, playbackInfo.playWhenReady);
            if (this.queue.isPreloading(mediaPeriod)) {
                maybeContinuePreloading();
            }
        }
    }

    private void handlePlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters, boolean z6) {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z6);
    }

    private androidx.media3.exoplayer.PlaybackInfo handlePositionDiscontinuity(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j9, long j10, boolean z6, int i3) {
        java.util.List<androidx.media3.common.Metadata> list;
        androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray;
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray2 = playbackInfo.trackGroups;
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        java.util.List<androidx.media3.common.Metadata> list2 = playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            androidx.media3.exoplayer.source.TrackGroupArray trackGroups = playingPeriod == null ? androidx.media3.exoplayer.source.TrackGroupArray.EMPTY : playingPeriod.getTrackGroups();
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult3 = playingPeriod == null ? this.emptyTrackSelectorResult : playingPeriod.getTrackSelectorResult();
            p076i4.AbstractC2186b0 abstractC2186b0ExtractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult3.selections);
            if (playingPeriod != null) {
                androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = playingPeriod.info;
                if (mediaPeriodInfo.requestedContentPositionUs != j9) {
                    playingPeriod.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(j9);
                }
            }
            maybeUpdateOffloadScheduling();
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult3;
            list = abstractC2186b0ExtractMetadataFromTrackSelectionArray;
        } else {
            if (!mediaPeriodId.equals(this.playbackInfo.periodId)) {
                trackGroupArray2 = androidx.media3.exoplayer.source.TrackGroupArray.EMPTY;
                trackSelectorResult2 = this.emptyTrackSelectorResult;
                p076i4.Z z9 = p076i4.AbstractC2186b0.f22868i;
                list2 = p076i4.S0.f22832l;
            }
            list = list2;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
        }
        if (z6) {
            this.playbackInfoUpdate.setPositionDiscontinuity(i3);
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j, j9, j10, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, list);
    }

    private boolean hasReadingPeriodFinishedReading() {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (!readingPeriod.prepared) {
            return false;
        }
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.RendererHolder[] rendererHolderArr = this.renderers;
            if (i3 >= rendererHolderArr.length) {
                return true;
            }
            if (!rendererHolderArr[i3].hasFinishedReadingFromPeriod(readingPeriod)) {
                return false;
            }
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDynamicSchedulingEnabled() {
        if (this.dynamicSchedulingEnabled) {
            return true;
        }
        return this.scrubbingModeEnabled && this.scrubbingModeParameters.shouldEnableDynamicScheduling;
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z6, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2, androidx.media3.common.Timeline.Period period, long j9) {
        if (!z6 && j == j9 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            if (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)) {
                return (period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true;
            }
            if (mediaPeriodId2.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId2.adGroupIndex)) {
                return true;
            }
        }
        return false;
    }

    private boolean isLoadingPossible(androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder) {
        return (mediaPeriodHolder == null || mediaPeriodHolder.hasLoadingError() || mediaPeriodHolder.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private boolean isRendererPrewarmingMediaPeriod(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        if (this.queue.getPrewarmingPeriod() == null || !this.queue.getPrewarmingPeriod().info.id.equals(mediaPeriodId)) {
            return false;
        }
        return this.renderers[i3].isPrewarmingPeriod(this.queue.getPrewarmingPeriod());
    }

    private boolean isTimelineReady() {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j = playingPeriod.info.durationUs;
        if (playingPeriod.prepared) {
            return j == androidx.media3.common.C.TIME_UNSET || this.playbackInfo.positionUs < j || !shouldPlayWhenReady();
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Timeline.Period period) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        androidx.media3.common.Timeline timeline = playbackInfo.timeline;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeTriggerOnRendererReadyChanged$2(int i3, boolean z6) {
        this.analyticsCollector.onRendererReadyChanged(i3, this.renderers[i3].getTrackType(), z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener, long j, long j9, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
        videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j9, format, mediaFormat);
        onVideoFrameAboutToBeRendered(j, j9, format, mediaFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(long j, androidx.media3.common.Format format) {
        if (this.seekIsPendingWhileScrubbing) {
            this.handler.obtainMessage(MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessageToTargetThread$4(androidx.media3.exoplayer.PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (androidx.media3.exoplayer.ExoPlaybackException e6) {
            androidx.media3.common.util.Log.e(TAG, "Unexpected error delivering message on external thread.", e6);
            throw new java.lang.RuntimeException(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setScrubbingModeEnabledInternal$3(int i3) {
        this.analyticsCollector.onDroppedSeeksWhileScrubbing(i3);
    }

    private void maybeContinueLoading() {
        boolean zShouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = zShouldContinueLoading;
        if (zShouldContinueLoading) {
            androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.getClass();
            loadingPeriod.continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(loadingPeriod.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().speed).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
        }
        updateIsLoading();
    }

    private void maybeContinuePreloading() {
        this.queue.maybeUpdatePreloadMediaPeriodHolder();
        androidx.media3.exoplayer.MediaPeriodHolder preloadingPeriod = this.queue.getPreloadingPeriod();
        if (preloadingPeriod != null) {
            if ((!preloadingPeriod.prepareCalled || preloadingPeriod.prepared) && !preloadingPeriod.mediaPeriod.isLoading()) {
                if (this.loadControl.shouldContinuePreloading(this.playerId, this.playbackInfo.timeline, preloadingPeriod.info.id, preloadingPeriod.prepared ? preloadingPeriod.mediaPeriod.getBufferedPositionUs() : 0L)) {
                    if (preloadingPeriod.prepareCalled) {
                        preloadingPeriod.continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(preloadingPeriod.toPeriodTime(this.rendererPositionUs)).setPlaybackSpeed(this.mediaClock.getPlaybackParameters().speed).setLastRebufferRealtimeMs(this.lastRebufferRealtimeMs).build());
                    } else {
                        preloadingPeriod.prepare(this, preloadingPeriod.info.startPositionUs);
                    }
                }
            }
        }
    }

    private void maybeHandlePrewarmingTransition() {
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            rendererHolder.maybeHandlePrewarmingTransition();
        }
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private void maybePrewarmRenderers() {
        androidx.media3.exoplayer.MediaPeriodHolder prewarmingPeriod = this.queue.getPrewarmingPeriod();
        if (prewarmingPeriod == null) {
            return;
        }
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = prewarmingPeriod.getTrackSelectorResult();
        for (int i3 = 0; i3 < this.renderers.length; i3++) {
            if (trackSelectorResult.isRendererEnabled(i3) && this.renderers[i3].hasSecondary() && !this.renderers[i3].isPrewarming()) {
                this.renderers[i3].startPrewarming();
                enableRenderer(prewarmingPeriod, i3, false, prewarmingPeriod.getStartPositionRendererTime());
            }
        }
        if (areRenderersPrewarming()) {
            this.prewarmingMediaPeriodDiscontinuity = prewarmingPeriod.mediaPeriod.readDiscontinuity();
            if (prewarmingPeriod.isFullyBuffered()) {
                return;
            }
            this.queue.removeAfter(prewarmingPeriod);
            handleLoadingMediaPeriodChanged(false);
            maybeContinueLoading();
        }
    }

    private void maybeThrowRendererStreamError(int i3) {
        androidx.media3.exoplayer.RendererHolder rendererHolder = this.renderers[i3];
        try {
            androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            playingPeriod.getClass();
            rendererHolder.maybeThrowStreamError(playingPeriod);
        } catch (java.io.IOException | java.lang.RuntimeException e6) {
            int trackType = rendererHolder.getTrackType();
            if (trackType != 3 && trackType != 5) {
                throw e6;
            }
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = this.queue.getPlayingPeriod().getTrackSelectorResult();
            androidx.media3.common.util.Log.e(TAG, "Disabling track due to error: " + androidx.media3.common.Format.toLogString(trackSelectorResult.selections[i3].getSelectedFormat()), e6);
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult2 = new androidx.media3.exoplayer.trackselection.TrackSelectorResult((androidx.media3.exoplayer.RendererConfiguration[]) trackSelectorResult.rendererConfigurations.clone(), (androidx.media3.exoplayer.trackselection.ExoTrackSelection[]) trackSelectorResult.selections.clone(), trackSelectorResult.tracks, trackSelectorResult.info);
            trackSelectorResult2.rendererConfigurations[i3] = null;
            trackSelectorResult2.selections[i3] = null;
            disableRenderer(i3);
            this.queue.getPlayingPeriod().applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, false);
        }
    }

    private void maybeTriggerOnRendererReadyChanged(final int i3, final boolean z6) {
        boolean[] zArr = this.rendererReportedReady;
        if (zArr[i3] != z6) {
            zArr[i3] = z6;
            this.applicationLooperHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.D
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16480h.lambda$maybeTriggerOnRendererReadyChanged$2(i3, z6);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeTriggerPendingMessages(long j, long j9) {
        if (this.pendingMessages.isEmpty() || this.playbackInfo.periodId.isAd()) {
            return;
        }
        if (this.deliverPendingMessageAtStartPositionRequired) {
            j--;
            this.deliverPendingMessageAtStartPositionRequired = false;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
        int iMin = java.lang.Math.min(this.nextPendingMessageIndexHint, this.pendingMessages.size());
        androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo = iMin > 0 ? this.pendingMessages.get(iMin - 1) : null;
        while (pendingMessageInfo != null) {
            int i3 = pendingMessageInfo.resolvedPeriodIndex;
            if (i3 <= indexOfPeriod && (i3 != indexOfPeriod || pendingMessageInfo.resolvedPeriodTimeUs <= j)) {
                break;
            }
            int i9 = iMin - 1;
            pendingMessageInfo = i9 > 0 ? this.pendingMessages.get(iMin - 2) : null;
            iMin = i9;
        }
        if (iMin < this.pendingMessages.size()) {
            androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo2 = this.pendingMessages.get(iMin);
            while (pendingMessageInfo2 != null && pendingMessageInfo2.resolvedPeriodUid != null) {
                int i10 = pendingMessageInfo2.resolvedPeriodIndex;
                if (i10 >= indexOfPeriod && (i10 != indexOfPeriod || pendingMessageInfo2.resolvedPeriodTimeUs > j)) {
                    break;
                }
                iMin++;
                pendingMessageInfo2 = iMin < this.pendingMessages.size() ? this.pendingMessages.get(iMin) : null;
            }
            while (pendingMessageInfo2 != null && pendingMessageInfo2.resolvedPeriodUid != null && pendingMessageInfo2.resolvedPeriodIndex == indexOfPeriod) {
                long j10 = pendingMessageInfo2.resolvedPeriodTimeUs;
                if (j10 <= j || j10 > j9) {
                    break;
                }
                try {
                    sendMessageToTarget(pendingMessageInfo2.message);
                    if (pendingMessageInfo2.message.getDeleteAfterDelivery() || pendingMessageInfo2.message.isCanceled()) {
                        this.pendingMessages.remove(iMin);
                    } else {
                        iMin++;
                    }
                    pendingMessageInfo2 = iMin < this.pendingMessages.size() ? this.pendingMessages.get(iMin) : null;
                } catch (java.lang.Throwable th) {
                    if (pendingMessageInfo2.message.getDeleteAfterDelivery() || pendingMessageInfo2.message.isCanceled()) {
                        this.pendingMessages.remove(iMin);
                    }
                    throw th;
                }
            }
            this.nextPendingMessageIndexHint = iMin;
        }
    }

    private boolean maybeUpdateLoadingPeriod() {
        androidx.media3.exoplayer.MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        boolean z6 = false;
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolderEnqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(nextMediaPeriodInfo);
            if (!mediaPeriodHolderEnqueueNextMediaPeriodHolder.prepareCalled) {
                mediaPeriodHolderEnqueueNextMediaPeriodHolder.prepare(this, nextMediaPeriodInfo.startPositionUs);
            } else if (mediaPeriodHolderEnqueueNextMediaPeriodHolder.prepared) {
                this.handler.obtainMessage(8, mediaPeriodHolderEnqueueNextMediaPeriodHolder.mediaPeriod).sendToTarget();
            }
            if (this.queue.getPlayingPeriod() == mediaPeriodHolderEnqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.startPositionUs, true);
            }
            handleLoadingMediaPeriodChanged(false);
            z6 = true;
        }
        if (!this.shouldContinueLoading) {
            maybeContinueLoading();
            return z6;
        }
        this.shouldContinueLoading = isLoadingPossible(this.queue.getLoadingPeriod());
        updateIsLoading();
        return z6;
    }

    private void maybeUpdateOffloadScheduling() {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod;
        boolean z6;
        if (this.queue.getPlayingPeriod() == this.queue.getReadingPeriod() && (playingPeriod = this.queue.getPlayingPeriod()) != null) {
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
            boolean z9 = false;
            int i3 = 0;
            boolean z10 = false;
            while (true) {
                if (i3 >= this.renderers.length) {
                    z6 = true;
                    break;
                }
                if (trackSelectorResult.isRendererEnabled(i3)) {
                    if (this.renderers[i3].getTrackType() != 1) {
                        z6 = false;
                        break;
                    } else if (trackSelectorResult.rendererConfigurations[i3].offloadModePreferred != 0) {
                        z10 = true;
                    }
                }
                i3++;
            }
            if (z10 && z6) {
                z9 = true;
            }
            setOffloadSchedulingEnabled(z9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    private void maybeUpdatePlayingPeriod() {
        boolean z6;
        boolean z9 = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z9) {
                maybeNotifyPlaybackInfoChanged();
            }
            this.isPrewarmingDisabledUntilNextTransition = false;
            androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolderAdvancePlayingPeriod = this.queue.advancePlayingPeriod();
            mediaPeriodHolderAdvancePlayingPeriod.getClass();
            if (this.playbackInfo.periodId.periodUid.equals(mediaPeriodHolderAdvancePlayingPeriod.info.id.periodUid)) {
                androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
                if (mediaPeriodId.adGroupIndex == -1) {
                    androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodHolderAdvancePlayingPeriod.info.id;
                    if (mediaPeriodId2.adGroupIndex != -1 || mediaPeriodId.nextAdGroupIndex == mediaPeriodId2.nextAdGroupIndex) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolderAdvancePlayingPeriod.info;
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodInfo.id;
            long j = mediaPeriodInfo.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId3, j, mediaPeriodInfo.requestedContentPositionUs, j, !z6, 0);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            if (areRenderersPrewarming() && mediaPeriodHolderAdvancePlayingPeriod == this.queue.getPrewarmingPeriod()) {
                maybeHandlePrewarmingTransition();
            }
            if (this.playbackInfo.playbackState == 3) {
                startRenderers();
            }
            allowRenderersToRenderStartOfStreams();
            z9 = true;
        }
    }

    private void maybeUpdatePreloadPeriods(boolean z6) {
        if (this.preloadConfiguration.targetPreloadDurationUs == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        if (z6 || !this.playbackInfo.timeline.equals(this.lastPreloadPoolInvalidationTimeline)) {
            androidx.media3.common.Timeline timeline = this.playbackInfo.timeline;
            this.lastPreloadPoolInvalidationTimeline = timeline;
            this.queue.invalidatePreloadPool(timeline);
        }
        maybeContinuePreloading();
    }

    private void maybeUpdatePrewarmingPeriod() {
        androidx.media3.exoplayer.MediaPeriodHolder prewarmingPeriod;
        if (this.pendingPauseAtEndOfPeriod || !this.hasSecondaryRenderers || this.isPrewarmingDisabledUntilNextTransition || areRenderersPrewarming() || (prewarmingPeriod = this.queue.getPrewarmingPeriod()) == null || prewarmingPeriod != this.queue.getReadingPeriod() || prewarmingPeriod.getNext() == null || !prewarmingPeriod.getNext().prepared || getDurationToMediaPeriodUs(prewarmingPeriod.getNext()) > DURATION_TO_ADVANCE_READING_THRESHOLD_US) {
            return;
        }
        this.queue.advancePrewarmingPeriod();
        maybePrewarmRenderers();
    }

    private void maybeUpdateReadingPeriod() {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return;
        }
        int i3 = 0;
        if (readingPeriod.getNext() == null || this.pendingPauseAtEndOfPeriod) {
            if (readingPeriod.info.isFinal || this.pendingPauseAtEndOfPeriod) {
                androidx.media3.exoplayer.RendererHolder[] rendererHolderArr = this.renderers;
                int length = rendererHolderArr.length;
                while (i3 < length) {
                    androidx.media3.exoplayer.RendererHolder rendererHolder = rendererHolderArr[i3];
                    if (rendererHolder.isReadingFromPeriod(readingPeriod) && rendererHolder.hasReadPeriodToEnd(readingPeriod)) {
                        long j = readingPeriod.info.durationUs;
                        rendererHolder.setCurrentStreamFinal(readingPeriod, (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
                    }
                    i3++;
                }
                return;
            }
            return;
        }
        if (hasReadingPeriodFinishedReading()) {
            if (areRenderersPrewarming() && this.queue.getPrewarmingPeriod() == this.queue.getReadingPeriod()) {
                return;
            }
            if (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime()) {
                if (!readingPeriod.getNext().prepared || getDurationToMediaPeriodUs(readingPeriod.getNext()) <= DURATION_TO_ADVANCE_READING_THRESHOLD_US) {
                    androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                    androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolderAdvanceReadingPeriod = this.queue.advanceReadingPeriod();
                    androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult2 = mediaPeriodHolderAdvanceReadingPeriod.getTrackSelectorResult();
                    androidx.media3.common.Timeline timeline = this.playbackInfo.timeline;
                    updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodHolderAdvanceReadingPeriod.info.id, timeline, readingPeriod.info.id, androidx.media3.common.C.TIME_UNSET, false);
                    if (mediaPeriodHolderAdvanceReadingPeriod.prepared && ((this.hasSecondaryRenderers && this.prewarmingMediaPeriodDiscontinuity != androidx.media3.common.C.TIME_UNSET) || mediaPeriodHolderAdvanceReadingPeriod.mediaPeriod.readDiscontinuity() != androidx.media3.common.C.TIME_UNSET)) {
                        this.prewarmingMediaPeriodDiscontinuity = androidx.media3.common.C.TIME_UNSET;
                        boolean z6 = this.hasSecondaryRenderers && !this.isPrewarmingDisabledUntilNextTransition;
                        if (z6) {
                            for (int i9 = 0; i9 < this.renderers.length; i9++) {
                                if (trackSelectorResult2.isRendererEnabled(i9) && this.renderers[i9].getTrackType() != -2 && !androidx.media3.common.MimeTypes.allSamplesAreSyncSamples(trackSelectorResult2.selections[i9].getSelectedFormat().sampleMimeType, trackSelectorResult2.selections[i9].getSelectedFormat().codecs) && !this.renderers[i9].isPrewarming()) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        if (!z6) {
                            setAllNonPrewarmingRendererStreamsFinal(mediaPeriodHolderAdvanceReadingPeriod.getStartPositionRendererTime());
                            if (mediaPeriodHolderAdvanceReadingPeriod.isFullyBuffered()) {
                                return;
                            }
                            this.queue.removeAfter(mediaPeriodHolderAdvanceReadingPeriod);
                            handleLoadingMediaPeriodChanged(false);
                            maybeContinueLoading();
                            return;
                        }
                    }
                    androidx.media3.exoplayer.RendererHolder[] rendererHolderArr2 = this.renderers;
                    int length2 = rendererHolderArr2.length;
                    while (i3 < length2) {
                        rendererHolderArr2[i3].maybeSetOldStreamToFinal(trackSelectorResult, trackSelectorResult2, mediaPeriodHolderAdvanceReadingPeriod.getStartPositionRendererTime());
                        i3++;
                    }
                }
            }
        }
    }

    private void maybeUpdateReadingRenderers() {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null || this.queue.getPlayingPeriod() == readingPeriod || readingPeriod.allRenderersInCorrectState || !updateRenderersForTransition()) {
            return;
        }
        this.queue.getReadingPeriod().allRenderersInCorrectState = true;
    }

    private void mediaSourceListUpdateRequestedInternal() throws java.lang.Throwable {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    private void moveMediaItemsInternal(androidx.media3.exoplayer.ExoPlayerImplInternal.MoveMediaItemsMessage moveMediaItemsMessage) throws java.lang.Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder), false);
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z6) {
        for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z6);
                }
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    private void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared(this.playerId);
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        updatePlayWhenReadyWithAudioFocus();
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void releaseInternal(androidx.media3.common.util.ConditionVariable conditionVariable) {
        try {
            resetInternal(true, false, true, false);
            releaseRenderers();
            this.loadControl.onReleased(this.playerId);
            this.audioFocusManager.release();
            this.trackSelector.release();
            setState(1);
        } finally {
            this.handler.removeCallbacksAndMessages(null);
            this.playbackLooperProvider.releaseLooper();
            conditionVariable.open();
        }
    }

    private void releaseRenderers() {
        for (int i3 = 0; i3 < this.renderers.length; i3++) {
            this.rendererCapabilities[i3].clearListener();
            this.renderers[i3].release();
        }
    }

    private void removeMediaItemsInternal(int i3, int i9, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) throws java.lang.Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i3, i9, shuffleOrder), false);
    }

    private void reselectTracksInternal() {
        int i3;
        float f9 = this.mediaClock.getPlaybackParameters().speed;
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = null;
        boolean z6 = true;
        while (playingPeriod != null && playingPeriod.prepared) {
            androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResultSelectTracks = playingPeriod.selectTracks(f9, playbackInfo.timeline, playbackInfo.playWhenReady);
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult2 = playingPeriod == this.queue.getPlayingPeriod() ? trackSelectorResultSelectTracks : trackSelectorResult;
            if (!trackSelectorResultSelectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                if (z6) {
                    androidx.media3.exoplayer.MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    boolean z9 = (this.queue.removeAfter(playingPeriod2) & 1) != 0;
                    boolean[] zArr = new boolean[this.renderers.length];
                    trackSelectorResult2.getClass();
                    long jApplyTrackSelection = playingPeriod2.applyTrackSelection(trackSelectorResult2, this.playbackInfo.positionUs, z9, zArr);
                    androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = this.playbackInfo;
                    boolean z10 = (playbackInfo2.playbackState == 4 || jApplyTrackSelection == playbackInfo2.positionUs) ? false : true;
                    androidx.media3.exoplayer.PlaybackInfo playbackInfo3 = this.playbackInfo;
                    i3 = 4;
                    this.playbackInfo = handlePositionDiscontinuity(playbackInfo3.periodId, jApplyTrackSelection, playbackInfo3.requestedContentPositionUs, playbackInfo3.discontinuityStartPositionUs, z10, 5);
                    if (z10) {
                        resetRendererPosition(jApplyTrackSelection, true);
                    }
                    disableAndResetPrewarmingRenderers();
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i9 = 0;
                    while (true) {
                        androidx.media3.exoplayer.RendererHolder[] rendererHolderArr = this.renderers;
                        if (i9 >= rendererHolderArr.length) {
                            break;
                        }
                        int enabledRendererCount = rendererHolderArr[i9].getEnabledRendererCount();
                        zArr2[i9] = this.renderers[i9].isRendererEnabled();
                        this.renderers[i9].maybeDisableOrResetPosition(playingPeriod2.sampleStreams[i9], this.mediaClock, this.rendererPositionUs, zArr[i9]);
                        if (enabledRendererCount - this.renderers[i9].getEnabledRendererCount() > 0) {
                            maybeTriggerOnRendererReadyChanged(i9, false);
                        }
                        this.enabledRendererCount -= enabledRendererCount - this.renderers[i9].getEnabledRendererCount();
                        i9++;
                    }
                    enableRenderers(zArr2, this.rendererPositionUs);
                    playingPeriod2.allRenderersInCorrectState = true;
                } else {
                    i3 = 4;
                    this.queue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        long jMax = java.lang.Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs));
                        if (this.hasSecondaryRenderers && areRenderersPrewarming() && this.queue.getPrewarmingPeriod() == playingPeriod) {
                            disableAndResetPrewarmingRenderers();
                        }
                        playingPeriod.applyTrackSelection(trackSelectorResultSelectTracks, jMax, false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != i3) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            trackSelectorResult = trackSelectorResult2;
            if (playingPeriod == readingPeriod) {
                z6 = false;
            }
            playingPeriod = playingPeriod.getNext();
        }
    }

    private void reselectTracksInternalAndSeek() {
        reselectTracksInternal();
        seekToCurrentPosition(true);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009d A[PHI: r2 r6 r8
  0x009d: PHI (r2v2 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId) = 
  (r2v1 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId)
  (r2v16 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId)
 binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e4 A[PHI: r0
  0x00e4: PHI (r0v12 androidx.media3.common.Timeline) = 
  (r0v11 androidx.media3.common.Timeline)
  (r0v11 androidx.media3.common.Timeline)
  (r0v18 androidx.media3.common.Timeline)
  (r0v18 androidx.media3.common.Timeline)
 binds: [B:34:0x00aa, B:36:0x00ae, B:38:0x00bf, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    private void resetInternal(boolean z6, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        androidx.media3.common.Timeline timeline;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        java.util.List list;
        this.handler.removeMessages(2);
        this.seekIsPendingWhileScrubbing = false;
        if (this.queuedSeekWhileScrubbing != null) {
            this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            this.queuedSeekWhileScrubbing = null;
        }
        this.pendingRecoverableRendererError = null;
        updateRebufferingState(false, true);
        this.mediaClock.stop();
        this.rendererPositionUs = androidx.media3.exoplayer.MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        try {
            disableRenderers();
        } catch (androidx.media3.exoplayer.ExoPlaybackException | java.lang.RuntimeException e6) {
            androidx.media3.common.util.Log.e(TAG, "Disable failed.", e6);
        }
        if (z6) {
            for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
                try {
                    rendererHolder.reset();
                } catch (java.lang.RuntimeException e9) {
                    androidx.media3.common.util.Log.e(TAG, "Reset failed.", e9);
                }
            }
        }
        this.enabledRendererCount = 0;
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
        long jLongValue = playbackInfo.positionUs;
        long j = (this.playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod(this.playbackInfo, this.period)) ? this.playbackInfo.requestedContentPositionUs : this.playbackInfo.positionUs;
        if (z9) {
            this.pendingInitialSeekPosition = null;
            android.util.Pair<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId, java.lang.Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
            mediaPeriodId2 = (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            jLongValue = ((java.lang.Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            boolean zEquals = mediaPeriodId2.equals(this.playbackInfo.periodId);
            j = androidx.media3.common.C.TIME_UNSET;
            z12 = zEquals ? false : true;
        }
        long j9 = jLongValue;
        long j10 = j;
        this.queue.clear();
        this.shouldContinueLoading = false;
        androidx.media3.common.Timeline timelineCopyWithPlaceholderTimeline = this.playbackInfo.timeline;
        if (z10 && (timelineCopyWithPlaceholderTimeline instanceof androidx.media3.exoplayer.PlaylistTimeline)) {
            timelineCopyWithPlaceholderTimeline = ((androidx.media3.exoplayer.PlaylistTimeline) timelineCopyWithPlaceholderTimeline).copyWithPlaceholderTimeline(this.mediaSourceList.getShuffleOrder());
            if (mediaPeriodId2.adGroupIndex != -1) {
                timelineCopyWithPlaceholderTimeline.getPeriodByUid(mediaPeriodId2.periodUid, this.period);
                if (timelineCopyWithPlaceholderTimeline.getWindow(this.period.windowIndex, this.window).isLive()) {
                    timeline = timelineCopyWithPlaceholderTimeline;
                    mediaPeriodId = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber);
                } else {
                    timeline = timelineCopyWithPlaceholderTimeline;
                    mediaPeriodId = mediaPeriodId2;
                }
            } else {
                timeline = timelineCopyWithPlaceholderTimeline;
                mediaPeriodId = mediaPeriodId2;
            }
        } else {
            timeline = timelineCopyWithPlaceholderTimeline;
            mediaPeriodId = mediaPeriodId2;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = this.playbackInfo;
        int i3 = playbackInfo2.playbackState;
        androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException = z11 ? null : playbackInfo2.playbackError;
        androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray = z12 ? androidx.media3.exoplayer.source.TrackGroupArray.EMPTY : playbackInfo2.trackGroups;
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = z12 ? this.emptyTrackSelectorResult : playbackInfo2.trackSelectorResult;
        if (z12) {
            p076i4.Z z13 = p076i4.AbstractC2186b0.f22868i;
            list = p076i4.S0.f22832l;
        } else {
            list = playbackInfo2.staticMetadata;
        }
        this.playbackInfo = new androidx.media3.exoplayer.PlaybackInfo(timeline, mediaPeriodId, j10, j9, i3, exoPlaybackException, false, trackGroupArray, trackSelectorResult, list, mediaPeriodId, playbackInfo2.playWhenReady, playbackInfo2.playWhenReadyChangeReason, playbackInfo2.playbackSuppressionReason, playbackInfo2.playbackParameters, j9, 0L, j9, 0L, false);
        if (z10) {
            this.queue.releasePreloadPool();
            this.mediaSourceList.release();
        }
    }

    private void resetPendingPauseAtEndOfPeriod() {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private void resetRendererPosition(long j, boolean z6) {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j + androidx.media3.exoplayer.MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : playingPeriod.toRendererTime(j);
        this.rendererPositionUs = rendererTime;
        this.mediaClock.resetPosition(rendererTime);
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            rendererHolder.resetPosition(playingPeriod, this.rendererPositionUs, z6);
        }
        notifyTrackSelectionDiscontinuity();
    }

    private static void resolvePendingMessageEndOfStreamPosition(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        int i3 = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, window).lastPeriodIndex;
        java.lang.Object obj = timeline.getPeriod(i3, period, true).uid;
        long j = period.durationUs;
        pendingMessageInfo.setResolvedPosition(i3, j != androidx.media3.common.C.TIME_UNSET ? j - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean resolvePendingMessagePosition(androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo, androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2, int i3, boolean z6, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        java.lang.Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            android.util.Pair<java.lang.Object, java.lang.Long> pairResolveSeekPositionUs = resolveSeekPositionUs(timeline, new androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getMediaItemIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? androidx.media3.common.C.TIME_UNSET : androidx.media3.common.util.Util.msToUs(pendingMessageInfo.message.getPositionMs())), false, i3, z6, window, period);
            if (pairResolveSeekPositionUs == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(pairResolveSeekPositionUs.first), ((java.lang.Long) pairResolveSeekPositionUs.second).longValue(), pairResolveSeekPositionUs.first);
            if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            }
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            return true;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        timeline2.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period);
        if (period.isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid)) {
            android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, period.getPositionInWindowUs() + pendingMessageInfo.resolvedPeriodTimeUs);
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(periodPositionUs.first), ((java.lang.Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private void resolvePendingMessagePositions(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        int size = this.pendingMessages.size() - 1;
        while (size >= 0) {
            androidx.media3.common.Timeline timeline3 = timeline;
            androidx.media3.common.Timeline timeline4 = timeline2;
            if (!resolvePendingMessagePosition(this.pendingMessages.get(size), timeline3, timeline4, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
            size--;
            timeline = timeline3;
            timeline2 = timeline4;
        }
        java.util.Collections.sort(this.pendingMessages);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0245  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c0  */
    private static androidx.media3.exoplayer.ExoPlayerImplInternal.PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition seekPosition, androidx.media3.exoplayer.MediaPeriodQueue mediaPeriodQueue, int i3, boolean z6, boolean z9, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        int i9;
        androidx.media3.common.Timeline.Period period2;
        androidx.media3.common.Timeline timeline2;
        int firstWindowIndex;
        long jConstrainValue;
        boolean z10;
        boolean z11;
        boolean z12;
        int firstWindowIndex2;
        boolean z13;
        long j;
        int i10;
        int i11;
        long jMin;
        long j9;
        int i12;
        int i13;
        long jLongValue;
        int firstWindowIndex3;
        boolean z14;
        boolean z15;
        boolean z16;
        androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = playbackInfo;
        if (timeline.isEmpty()) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId dummyPeriodForEmptyTimeline = androidx.media3.exoplayer.PlaybackInfo.getDummyPeriodForEmptyTimeline();
            boolean z17 = (dummyPeriodForEmptyTimeline.equals(playbackInfo2.periodId) && playbackInfo2.positionUs == 0) ? false : true;
            return new androidx.media3.exoplayer.ExoPlayerImplInternal.PositionUpdateForPlaylistChange(dummyPeriodForEmptyTimeline, 0L, androidx.media3.common.C.TIME_UNSET, false, true, false, z17, z17 && z9 && !playbackInfo2.timeline.isEmpty() && !playbackInfo2.timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, period).isPlaceholder, 4);
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.periodId;
        java.lang.Object obj = mediaPeriodId.periodUid;
        boolean zIsUsingPlaceholderPeriod = isUsingPlaceholderPeriod(playbackInfo2, period);
        long jLongValue2 = (playbackInfo2.periodId.isAd() || zIsUsingPlaceholderPeriod) ? playbackInfo2.requestedContentPositionUs : playbackInfo2.positionUs;
        if (seekPosition != null) {
            i9 = -1;
            timeline2 = timeline;
            android.util.Pair<java.lang.Object, java.lang.Long> pairResolveSeekPositionUs = resolveSeekPositionUs(timeline2, seekPosition, true, i3, z6, window, period);
            if (pairResolveSeekPositionUs == null) {
                firstWindowIndex3 = timeline2.getFirstWindowIndex(z6);
                jLongValue = jLongValue2;
                z14 = false;
                z15 = false;
                z16 = true;
            } else {
                if (seekPosition.windowPositionUs == androidx.media3.common.C.TIME_UNSET) {
                    firstWindowIndex3 = timeline2.getPeriodByUid(pairResolveSeekPositionUs.first, period).windowIndex;
                    jLongValue = jLongValue2;
                    z14 = false;
                } else {
                    obj = pairResolveSeekPositionUs.first;
                    jLongValue = ((java.lang.Long) pairResolveSeekPositionUs.second).longValue();
                    firstWindowIndex3 = -1;
                    z14 = true;
                }
                z15 = playbackInfo2.playbackState == 4;
                z16 = false;
            }
            z12 = z14;
            z10 = z15;
            z11 = z16;
            jLongValue2 = jLongValue;
            period2 = period;
            firstWindowIndex = firstWindowIndex3;
        } else {
            i9 = -1;
            period2 = period;
            timeline2 = timeline;
            if (playbackInfo2.timeline.isEmpty()) {
                firstWindowIndex = timeline2.getFirstWindowIndex(z6);
            } else if (timeline2.getIndexOfPeriod(obj) == -1) {
                int iResolveSubsequentPeriod = resolveSubsequentPeriod(window, period2, i3, z6, obj, playbackInfo2.timeline, timeline2);
                if (iResolveSubsequentPeriod == -1) {
                    timeline2 = timeline2;
                    firstWindowIndex2 = timeline2.getFirstWindowIndex(z6);
                    z13 = true;
                } else {
                    timeline2 = timeline2;
                    firstWindowIndex2 = iResolveSubsequentPeriod;
                    z13 = false;
                }
                firstWindowIndex = firstWindowIndex2;
                obj = obj;
                period2 = period2;
                z11 = z13;
                z10 = false;
                z12 = false;
            } else if (jLongValue2 == androidx.media3.common.C.TIME_UNSET) {
                firstWindowIndex = timeline2.getPeriodByUid(obj, period2).windowIndex;
                obj = obj;
            } else if (zIsUsingPlaceholderPeriod) {
                playbackInfo2.timeline.getPeriodByUid(mediaPeriodId.periodUid, period2);
                if (playbackInfo2.timeline.getWindow(period2.windowIndex, window).firstPeriodIndex == playbackInfo2.timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) {
                    period2 = period2;
                    android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline2.getPeriodPositionUs(window, period2, timeline2.getPeriodByUid(obj, period2).windowIndex, period2.getPositionInWindowUs() + jLongValue2);
                    obj = periodPositionUs.first;
                    jConstrainValue = ((java.lang.Long) periodPositionUs.second).longValue();
                } else {
                    period2 = period2;
                    if (timeline2.getPeriodByUid(obj, period2).durationUs != androidx.media3.common.C.TIME_UNSET) {
                        obj = obj;
                        jConstrainValue = androidx.media3.common.util.Util.constrainValue(jLongValue2, 0L, period2.durationUs - 1);
                    } else {
                        obj = obj;
                        jConstrainValue = jLongValue2;
                    }
                }
                jLongValue2 = jConstrainValue;
                firstWindowIndex = -1;
                z10 = false;
                z11 = false;
                z12 = true;
            } else {
                obj = obj;
                firstWindowIndex = -1;
                z10 = false;
                z11 = false;
                z12 = false;
            }
            z10 = false;
            z11 = false;
            z12 = false;
        }
        if (firstWindowIndex != i9) {
            android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs2 = timeline2.getPeriodPositionUs(window, period2, firstWindowIndex, androidx.media3.common.C.TIME_UNSET);
            obj = periodPositionUs2.first;
            jLongValue2 = ((java.lang.Long) periodPositionUs2.second).longValue();
            j = -9223372036854775807L;
        } else {
            j = jLongValue2;
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline2, obj, jLongValue2);
        int i14 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex;
        boolean z18 = i14 == i9 || ((i13 = mediaPeriodId.nextAdGroupIndex) != i9 && i14 >= i13);
        boolean zEquals = mediaPeriodId.periodUid.equals(obj);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = ((zEquals && !mediaPeriodId.isAd() && !mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd() && z18) || isIgnorableServerSideAdInsertionPeriodChange(zIsUsingPlaceholderPeriod, mediaPeriodId, jLongValue2, mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange, timeline2.getPeriodByUid(obj, period2), j)) ? mediaPeriodId : mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        if (!mediaPeriodId2.isAd()) {
            if (zEquals && mediaPeriodId.isAd()) {
                androidx.media3.common.AdPlaybackState.AdGroup adGroup = timeline2.getPeriodByUid(obj, period2).adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex);
                long j10 = adGroup.contentResumeOffsetUs;
                long j11 = playbackInfo2.requestedContentPositionUs;
                if (j11 != androidx.media3.common.C.TIME_UNSET) {
                    long j12 = adGroup.timeUs;
                    if (j12 == Long.MIN_VALUE || j12 + j10 > j11) {
                        i10 = adGroup.count;
                        i11 = mediaPeriodId.adIndexInAdGroup;
                        if (i10 <= i11 && adGroup.states[i11] == 2) {
                            long j13 = timeline2.getPeriodByUid(obj, period2).durationUs;
                            playbackInfo2 = playbackInfo;
                            jMin = j13 != androidx.media3.common.C.TIME_UNSET ? java.lang.Math.min(j13 - 1, jLongValue2 + j10) : jLongValue2 + j10;
                            j9 = jMin;
                        }
                    }
                } else {
                    i10 = adGroup.count;
                    i11 = mediaPeriodId.adIndexInAdGroup;
                    if (i10 <= i11) {
                    }
                }
            }
            playbackInfo2 = playbackInfo;
            jMin = jLongValue2;
            j9 = j;
        } else if (mediaPeriodId2.equals(mediaPeriodId)) {
            jLongValue2 = playbackInfo2.positionUs;
            jMin = jLongValue2;
            j9 = j;
        } else {
            timeline2.getPeriodByUid(mediaPeriodId2.periodUid, period2);
            j9 = j;
            jMin = mediaPeriodId2.adIndexInAdGroup == period2.getFirstAdIndexToPlay(mediaPeriodId2.adGroupIndex) ? period2.getAdResumePositionUs() : 0L;
        }
        boolean z19 = (mediaPeriodId2.equals(playbackInfo2.periodId) && jMin == playbackInfo2.positionUs) ? false : true;
        int i15 = timeline2.getIndexOfPeriod(playbackInfo2.periodId.periodUid) == -1 ? 4 : 3;
        if (!mediaPeriodId2.periodUid.equals(playbackInfo2.periodId.periodUid) || mediaPeriodId2.adGroupIndex == -1) {
            i12 = i15;
        } else {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup2 = timeline2.getPeriodByUid(mediaPeriodId2.periodUid, period2).adPlaybackState.getAdGroup(mediaPeriodId2.adGroupIndex);
            int i16 = mediaPeriodId2.adIndexInAdGroup;
            int[] iArr = adGroup2.states;
            if (i16 >= iArr.length || iArr[i16] != 2) {
                i12 = 0;
            } else {
                i12 = i15;
            }
        }
        return new androidx.media3.exoplayer.ExoPlayerImplInternal.PositionUpdateForPlaylistChange(mediaPeriodId2, jMin, j9, z10, z11, z12, z19, z19 && z9 && !playbackInfo2.timeline.isEmpty() && !playbackInfo2.timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, period2).isPlaceholder, i12);
    }

    private static android.util.Pair<java.lang.Object, java.lang.Long> resolveSeekPositionUs(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition seekPosition, boolean z6, int i3, boolean z9, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        androidx.media3.common.Timeline timeline2;
        int iResolveSubsequentPeriod;
        androidx.media3.common.Timeline timeline3 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        if (timeline3.isEmpty()) {
            timeline2 = timeline3;
            timeline2 = timeline;
        }
        try {
            timeline2 = timeline3;
            android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline2.getPeriodPositionUs(window, period, seekPosition.windowIndex, seekPosition.windowPositionUs);
            androidx.media3.common.Timeline timeline4 = timeline2;
            if (timeline.equals(timeline4)) {
                return periodPositionUs;
            }
            if (timeline.getIndexOfPeriod(periodPositionUs.first) != -1) {
                return (timeline4.getPeriodByUid(periodPositionUs.first, period).isPlaceholder && timeline4.getWindow(period.windowIndex, window).firstPeriodIndex == timeline4.getIndexOfPeriod(periodPositionUs.first)) ? timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(periodPositionUs.first, period).windowIndex, seekPosition.windowPositionUs) : periodPositionUs;
            }
            if (z6 && (iResolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i3, z9, periodPositionUs.first, timeline4, timeline)) != -1) {
                return timeline.getPeriodPositionUs(window, period, iResolveSubsequentPeriod, androidx.media3.common.C.TIME_UNSET);
            }
            return null;
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    public static int resolveSubsequentPeriod(androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period, int i3, boolean z6, java.lang.Object obj, androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2) {
        androidx.media3.common.Timeline.Period period2;
        java.lang.Object obj2 = timeline.getWindow(timeline.getPeriodByUid(obj, period).windowIndex, window).uid;
        int i9 = 0;
        for (int i10 = 0; i10 < timeline2.getWindowCount(); i10++) {
            if (timeline2.getWindow(i10, window).uid.equals(obj2)) {
                return i10;
            }
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        while (i9 < periodCount && indexOfPeriod2 == -1) {
            androidx.media3.common.Timeline.Window window2 = window;
            period2 = period;
            int i11 = i3;
            boolean z9 = z6;
            androidx.media3.common.Timeline timeline3 = timeline;
            nextPeriodIndex = timeline3.getNextPeriodIndex(nextPeriodIndex, period2, window2, i11, z9);
            if (nextPeriodIndex == -1) {
                if (indexOfPeriod2 == -1) {
                    return -1;
                }
                return timeline2.getPeriod(indexOfPeriod2, period2).windowIndex;
            }
            indexOfPeriod2 = timeline2.getIndexOfPeriod(timeline3.getUidOfPeriod(nextPeriodIndex));
            i9++;
            timeline = timeline3;
            period = period2;
            window = window2;
            i3 = i11;
            z6 = z9;
        }
        period2 = period;
        if (indexOfPeriod2 == -1) {
            return -1;
        }
        return timeline2.getPeriod(indexOfPeriod2, period2).windowIndex;
    }

    private void scheduleNextWork(long j) {
        this.handler.sendEmptyMessageAtTime(2, j + (isDynamicSchedulingEnabled() ? getDynamicSchedulingWakeUpIntervalMs() : getStaticSchedulingWakeUpIntervalMs()));
    }

    private void seekToCurrentPosition(boolean z6) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.id;
        long jSeekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (jSeekToPeriodPosition != this.playbackInfo.positionUs) {
            androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, playbackInfo.requestedContentPositionUs, playbackInfo.discontinuityStartPositionUs, z6, 5);
        }
    }

    private void seekToInternal(androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition seekPosition) throws java.lang.Throwable {
        long jLongValue;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        long j;
        boolean z6;
        long jMax;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        long j9;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2;
        long adjustedSeekPositionUs;
        androidx.media3.exoplayer.PlaybackInfo playbackInfo;
        int i3;
        int i9;
        long j10;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId3;
        long j11;
        androidx.media3.exoplayer.ExoPlayerImplInternal exoPlayerImplInternal = this;
        if (exoPlayerImplInternal.seekIsPendingWhileScrubbing) {
            if (exoPlayerImplInternal.queuedSeekWhileScrubbing != null) {
                exoPlayerImplInternal.droppedSeeksWhileScrubbing++;
                exoPlayerImplInternal.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            exoPlayerImplInternal.queuedSeekWhileScrubbing = seekPosition;
            return;
        }
        exoPlayerImplInternal.playbackInfoUpdate.incrementPendingOperationAcks(1);
        android.util.Pair<java.lang.Object, java.lang.Long> pairResolveSeekPositionUs = resolveSeekPositionUs(exoPlayerImplInternal.playbackInfo.timeline, seekPosition, true, exoPlayerImplInternal.repeatMode, exoPlayerImplInternal.shuffleModeEnabled, exoPlayerImplInternal.window, exoPlayerImplInternal.period);
        if (pairResolveSeekPositionUs == null) {
            android.util.Pair<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId, java.lang.Long> placeholderFirstMediaPeriodPositionUs = exoPlayerImplInternal.getPlaceholderFirstMediaPeriodPositionUs(exoPlayerImplInternal.playbackInfo.timeline);
            mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            jLongValue = ((java.lang.Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            z6 = !exoPlayerImplInternal.playbackInfo.timeline.isEmpty();
            jMax = -9223372036854775807L;
            j = 0;
        } else {
            java.lang.Object obj = pairResolveSeekPositionUs.first;
            jLongValue = ((java.lang.Long) pairResolveSeekPositionUs.second).longValue();
            long j12 = seekPosition.windowPositionUs == androidx.media3.common.C.TIME_UNSET ? -9223372036854775807L : jLongValue;
            mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = exoPlayerImplInternal.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(exoPlayerImplInternal.playbackInfo.timeline, obj, jLongValue);
            if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                exoPlayerImplInternal.playbackInfo.timeline.getPeriodByUid(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, exoPlayerImplInternal.period);
                jLongValue = exoPlayerImplInternal.period.getFirstAdIndexToPlay(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) == mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup ? exoPlayerImplInternal.period.getAdResumePositionUs() : 0L;
                androidx.media3.common.AdPlaybackState.AdGroup adGroup = exoPlayerImplInternal.period.adPlaybackState.getAdGroup(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex);
                j = 0;
                jMax = java.lang.Math.max(j12, adGroup.timeUs + adGroup.contentResumeOffsetUs);
                z6 = true;
            } else {
                j = 0;
                z6 = seekPosition.windowPositionUs == androidx.media3.common.C.TIME_UNSET;
                jMax = j12;
            }
        }
        try {
            if (!exoPlayerImplInternal.playbackInfo.timeline.isEmpty()) {
                if (pairResolveSeekPositionUs == null) {
                    if (exoPlayerImplInternal.playbackInfo.playbackState != 1) {
                        exoPlayerImplInternal.setState(4);
                    }
                    exoPlayerImplInternal.resetInternal(false, true, false, true);
                } else {
                    if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(exoPlayerImplInternal.playbackInfo.periodId)) {
                        try {
                            androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = exoPlayerImplInternal.queue.getPlayingPeriod();
                            adjustedSeekPositionUs = (playingPeriod == null || !playingPeriod.prepared || jLongValue == j) ? jLongValue : playingPeriod.mediaPeriod.getAdjustedSeekPositionUs(jLongValue, exoPlayerImplInternal.getSeekParameters(exoPlayerImplInternal.window.durationUs));
                            mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                            try {
                                if (androidx.media3.common.util.Util.usToMs(adjustedSeekPositionUs) == androidx.media3.common.util.Util.usToMs(exoPlayerImplInternal.playbackInfo.positionUs) && ((i3 = (playbackInfo = exoPlayerImplInternal.playbackInfo).playbackState) == 2 || i3 == 3)) {
                                    long j13 = playbackInfo.positionUs;
                                    i9 = 2;
                                    z6 = z6;
                                    j10 = j13;
                                    mediaPeriodId3 = mediaPeriodId2;
                                    j11 = j13;
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                z6 = z6;
                                mediaPeriodId = mediaPeriodId2;
                                j9 = jLongValue;
                                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId, j9, jMax, j9, z6, 2);
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            z6 = z6;
                            mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                        }
                    } else {
                        mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                        adjustedSeekPositionUs = jLongValue;
                    }
                    try {
                        long jSeekToPeriodPosition = exoPlayerImplInternal.seekToPeriodPosition(mediaPeriodId2, adjustedSeekPositionUs, exoPlayerImplInternal.playbackInfo.playbackState == 4);
                        z6 |= jLongValue != jSeekToPeriodPosition;
                        try {
                            androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = exoPlayerImplInternal.playbackInfo;
                            androidx.media3.common.Timeline timeline = playbackInfo2.timeline;
                            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId4 = mediaPeriodId2;
                            long j14 = jMax;
                            try {
                                exoPlayerImplInternal.updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId4, timeline, playbackInfo2.periodId, j14, true);
                                mediaPeriodId3 = mediaPeriodId4;
                                jMax = j14;
                                j11 = jSeekToPeriodPosition;
                                i9 = 2;
                                j10 = j11;
                                exoPlayerImplInternal = this;
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                mediaPeriodId = mediaPeriodId4;
                                jMax = j14;
                                j9 = jSeekToPeriodPosition;
                                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId, j9, jMax, j9, z6, 2);
                                throw th;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            mediaPeriodId = mediaPeriodId2;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        mediaPeriodId = mediaPeriodId2;
                        j9 = jLongValue;
                        exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId, j9, jMax, j9, z6, 2);
                        throw th;
                    }
                }
                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId3, j11, jMax, j10, z6, i9);
            }
            exoPlayerImplInternal.pendingInitialSeekPosition = seekPosition;
            z6 = z6;
            mediaPeriodId3 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
            j11 = jLongValue;
            i9 = 2;
            j10 = j11;
            exoPlayerImplInternal = this;
            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId3, j11, jMax, j10, z6, i9);
        } catch (java.lang.Throwable th6) {
            th = th6;
            z6 = z6;
            mediaPeriodId = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        }
    }

    private long seekToPeriodPosition(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z6) {
        return seekToPeriodPosition(mediaPeriodId, j, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z6);
    }

    private void sendMessageInternal(androidx.media3.exoplayer.PlayerMessage playerMessage) {
        if (playerMessage.getPositionMs() == androidx.media3.common.C.TIME_UNSET) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo(playerMessage));
            return;
        }
        androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo pendingMessageInfo = new androidx.media3.exoplayer.ExoPlayerImplInternal.PendingMessageInfo(playerMessage);
        androidx.media3.common.Timeline timeline = this.playbackInfo.timeline;
        if (!resolvePendingMessagePosition(pendingMessageInfo, timeline, timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
            playerMessage.markAsProcessed(false);
        } else {
            this.pendingMessages.add(pendingMessageInfo);
            java.util.Collections.sort(this.pendingMessages);
        }
    }

    private void sendMessageToTarget(androidx.media3.exoplayer.PlayerMessage playerMessage) {
        if (playerMessage.getLooper() != this.playbackLooper) {
            this.handler.obtainMessage(15, playerMessage).sendToTarget();
            return;
        }
        deliverMessage(playerMessage);
        int i3 = this.playbackInfo.playbackState;
        if (i3 == 3 || i3 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void sendMessageToTargetThread(androidx.media3.exoplayer.PlayerMessage playerMessage) {
        android.os.Looper looper = playerMessage.getLooper();
        if (looper.getThread().isAlive()) {
            this.clock.createHandler(looper, null).post(new androidx.media3.exoplayer.RunnableC1548c(this, playerMessage, 3));
        } else {
            androidx.media3.common.util.Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        }
    }

    private void setAllNonPrewarmingRendererStreamsFinal(long j) {
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setAllNonPrewarmingRendererStreamsFinal(j);
        }
    }

    private void setAudioAttributesInternal(androidx.media3.common.AudioAttributes audioAttributes, boolean z6) {
        this.trackSelector.setAudioAttributes(audioAttributes);
        androidx.media3.common.audio.AudioFocusManager audioFocusManager = this.audioFocusManager;
        if (!z6) {
            audioAttributes = null;
        }
        audioFocusManager.setAudioAttributes(audioAttributes);
        updatePlayWhenReadyWithAudioFocus();
    }

    private void setForegroundModeInternal(boolean z6, androidx.media3.common.util.ConditionVariable conditionVariable) {
        if (this.foregroundMode != z6) {
            this.foregroundMode = z6;
            if (!z6) {
                for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
                    rendererHolder.reset();
                }
            }
        }
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    private void setImageMetadataListenerInternal(androidx.media3.exoplayer.image.ImageMetadataListener imageMetadataListener) {
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setImageMetadataListener(imageMetadataListener);
        }
    }

    private void setMediaClockPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.handler.removeMessages(16);
        this.mediaClock.setPlaybackParameters(playbackParameters);
    }

    private void setMediaItemsInternal(androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws java.lang.Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition(new androidx.media3.exoplayer.PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void setOffloadSchedulingEnabled(boolean z6) {
        if (z6 == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z6;
        if (z6 || !this.playbackInfo.sleepingForOffload) {
            return;
        }
        this.handler.sendEmptyMessage(2);
    }

    private void setPauseAtEndOfWindowInternal(boolean z6) {
        this.pauseAtEndOfWindow = z6;
        resetPendingPauseAtEndOfPeriod();
        if (!this.pendingPauseAtEndOfPeriod || this.queue.getReadingPeriod() == this.queue.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setPlayWhenReadyInternal(boolean z6, int i3, boolean z9, int i9) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z9 ? 1 : 0);
        updatePlayWhenReadyWithAudioFocus(z6, i3, i9);
    }

    private void setPlaybackParametersInternal(androidx.media3.common.PlaybackParameters playbackParameters) {
        setMediaClockPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setPreloadConfigurationInternal(androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        this.queue.updatePreloadConfiguration(this.playbackInfo.timeline, preloadConfiguration);
    }

    private void setRepeatModeInternal(int i3) {
        this.repeatMode = i3;
        int iUpdateRepeatMode = this.queue.updateRepeatMode(this.playbackInfo.timeline, i3);
        if ((iUpdateRepeatMode & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((iUpdateRepeatMode & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setScrubbingModeEnabledInternal(boolean z6) throws java.lang.Throwable {
        if (!z6) {
            if (this.queuedSeekWhileScrubbing != null && this.seekIsPendingWhileScrubbing && !this.handler.hasMessages(MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE)) {
                this.droppedSeeksWhileScrubbing++;
            }
            int i3 = this.droppedSeeksWhileScrubbing;
            if (i3 > 0) {
                this.applicationLooperHandler.post(new androidx.media3.exoplayer.C(this, i3, 0));
            }
            this.droppedSeeksWhileScrubbing = 0;
            this.seekIsPendingWhileScrubbing = false;
            this.handler.removeMessages(MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE);
            androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition seekPosition = this.queuedSeekWhileScrubbing;
            if (seekPosition != null) {
                seekToInternal(seekPosition);
                this.queuedSeekWhileScrubbing = null;
                this.seekIsPendingWhileScrubbing = false;
            }
        }
        this.scrubbingModeEnabled = z6;
        applyScrubbingModeParameters();
    }

    private void setScrubbingModeParametersInternal(androidx.media3.exoplayer.ScrubbingModeParameters scrubbingModeParameters) {
        this.scrubbingModeParameters = scrubbingModeParameters;
        applyScrubbingModeParameters();
    }

    private void setSeekParametersInternal(androidx.media3.exoplayer.SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setShuffleModeEnabledInternal(boolean z6) {
        this.shuffleModeEnabled = z6;
        int iUpdateShuffleModeEnabled = this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z6);
        if ((iUpdateShuffleModeEnabled & 1) != 0) {
            seekToCurrentPosition(true);
        } else if ((iUpdateShuffleModeEnabled & 2) != 0) {
            disableAndResetPrewarmingRenderers();
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleOrderInternal(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) throws java.lang.Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder), false);
    }

    private void setState(int i3) {
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i3) {
            if (i3 != 2) {
                this.playbackMaybeBecameStuckAtMs = androidx.media3.common.C.TIME_UNSET;
            }
            if (i3 != 3 && playbackInfo.sleepingForOffload) {
                this.playbackInfo = playbackInfo.copyWithSleepingForOffload(false);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackState(i3);
        }
    }

    private void setVideoFrameMetadataListenerInternal(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }
    }

    private void setVideoOutputInternal(java.lang.Object obj, androidx.media3.common.util.ConditionVariable conditionVariable) {
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setVideoOutput(obj);
        }
        int i3 = this.playbackInfo.playbackState;
        if (i3 == 3 || i3 == 2) {
            this.handler.sendEmptyMessage(2);
        }
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    private void setVolumeInternal(float f9) {
        this.volume = f9;
        float volumeMultiplier = this.audioFocusManager.getVolumeMultiplier() * f9;
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setVolume(volumeMultiplier);
        }
    }

    private boolean shouldAdvancePlayingPeriod() {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod;
        androidx.media3.exoplayer.MediaPeriodHolder next;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && next.allRenderersInCorrectState;
    }

    private boolean shouldContinueLoading() {
        if (!isLoadingPossible(this.queue.getLoadingPeriod())) {
            return false;
        }
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        androidx.media3.exoplayer.LoadControl.Parameters parameters = new androidx.media3.exoplayer.LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, loadingPeriod.info.id, loadingPeriod == this.queue.getPlayingPeriod() ? loadingPeriod.toPeriodTime(this.rendererPositionUs) : loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, loadingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : androidx.media3.common.C.TIME_UNSET, this.lastRebufferRealtimeMs);
        boolean zShouldContinueLoading = this.loadControl.shouldContinueLoading(parameters);
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (zShouldContinueLoading || !playingPeriod.prepared || totalBufferedDurationUs >= PLAYBACK_BUFFER_EMPTY_THRESHOLD_US) {
            return zShouldContinueLoading;
        }
        if (this.backBufferDurationUs <= 0 && !this.retainBackBufferFromKeyframe) {
            return zShouldContinueLoading;
        }
        playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs, false);
        return this.loadControl.shouldContinueLoading(parameters);
    }

    private boolean shouldPlayWhenReady() {
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    private boolean shouldSkipKeyFrameReset(androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder, long j) {
        if (!this.playbackInfo.timeline.isEmpty() && mediaPeriodHolder.info.id.equals(this.playbackInfo.periodId)) {
            long rendererTime = mediaPeriodHolder.toRendererTime(j);
            boolean zSupportsResetPositionWithoutKeyFrameReset = true;
            for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
                if (rendererHolder.isRendererEnabled()) {
                    zSupportsResetPositionWithoutKeyFrameReset &= rendererHolder.supportsResetPositionWithoutKeyFrameReset(mediaPeriodHolder, rendererTime);
                }
            }
            if (!zSupportsResetPositionWithoutKeyFrameReset) {
                return false;
            }
            androidx.media3.exoplayer.source.MediaPeriod mediaPeriod = mediaPeriodHolder.mediaPeriod;
            long j9 = this.playbackInfo.positionUs;
            androidx.media3.exoplayer.SeekParameters seekParameters = androidx.media3.exoplayer.SeekParameters.PREVIOUS_SYNC;
            if (mediaPeriod.getAdjustedSeekPositionUs(j9, seekParameters) == mediaPeriodHolder.mediaPeriod.getAdjustedSeekPositionUs(j, seekParameters)) {
                return true;
            }
        }
        return false;
    }

    private boolean shouldTransitionToReadyState(boolean z6) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        boolean z9 = false;
        if (!z6) {
            return false;
        }
        if (!this.playbackInfo.isLoading) {
            return true;
        }
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, playingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : androidx.media3.common.C.TIME_UNSET;
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z10 = loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal;
        if (loadingPeriod.info.id.isAd() && !loadingPeriod.prepared) {
            z9 = true;
        }
        if (z10 || z9) {
            return true;
        }
        return this.loadControl.shouldStartPlayback(new androidx.media3.exoplayer.LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, playingPeriod.info.id, playingPeriod.toPeriodTime(this.rendererPositionUs), getTotalBufferedDurationUs(loadingPeriod.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, targetLiveOffsetUs, this.lastRebufferRealtimeMs));
    }

    private boolean shouldUseLivePlaybackSpeedControl(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && !timeline.isEmpty()) {
            timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
            if (this.window.isLive()) {
                androidx.media3.common.Timeline.Window window = this.window;
                if (window.isDynamic && window.windowStartTimeMs != androidx.media3.common.C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    private void startRenderers() {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = playingPeriod.getTrackSelectorResult();
        for (int i3 = 0; i3 < this.renderers.length; i3++) {
            if (trackSelectorResult.isRendererEnabled(i3)) {
                this.renderers[i3].start();
            }
        }
    }

    private void stopInternal(boolean z6, boolean z9) {
        resetInternal(z6 || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z9 ? 1 : 0);
        this.loadControl.onStopped(this.playerId);
        this.audioFocusManager.updateAudioFocus(this.playbackInfo.playWhenReady, 1);
        setState(1);
    }

    private void stopRenderers() {
        this.mediaClock.stop();
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            rendererHolder.stop();
        }
    }

    private void updateIsLoading() {
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z6 = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        if (z6 != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z6);
        }
    }

    private void updateLoadControlTrackSelection(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult) {
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        loadingPeriod.getClass();
        this.loadControl.onTracksSelected(new androidx.media3.exoplayer.LoadControl.Parameters(this.playerId, this.playbackInfo.timeline, mediaPeriodId, loadingPeriod == this.queue.getPlayingPeriod() ? loadingPeriod.toPeriodTime(this.rendererPositionUs) : loadingPeriod.toPeriodTime(this.rendererPositionUs) - loadingPeriod.info.startPositionUs, getTotalBufferedDurationUs(loadingPeriod.getBufferedPositionUs()), this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.playWhenReady, this.isRebuffering, shouldUseLivePlaybackSpeedControl(this.playbackInfo.timeline, loadingPeriod.info.id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : androidx.media3.common.C.TIME_UNSET, this.lastRebufferRealtimeMs), trackGroupArray, trackSelectorResult.selections);
    }

    private void updateMediaSourcesWithMediaItemsInternal(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list) throws java.lang.Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.updateMediaSourcesWithMediaItems(i3, i9, list), false);
    }

    private void updatePeriods() {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        boolean zMaybeUpdateLoadingPeriod = maybeUpdateLoadingPeriod();
        maybeUpdatePrewarmingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
        maybeUpdatePreloadPeriods(zMaybeUpdateLoadingPeriod);
    }

    private static int updatePlayWhenReadyChangeReason(int i3, int i9) {
        if (i3 == -1) {
            return 2;
        }
        if (i9 == 2) {
            return 1;
        }
        return i9;
    }

    private void updatePlayWhenReadyWithAudioFocus() {
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReadyWithAudioFocus(playbackInfo.playWhenReady, playbackInfo.playbackSuppressionReason, playbackInfo.playWhenReadyChangeReason);
    }

    private void updatePlaybackPositions() {
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long discontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != androidx.media3.common.C.TIME_UNSET) {
            if (!playingPeriod.isFullyBuffered()) {
                this.queue.removeAfter(playingPeriod);
                handleLoadingMediaPeriodChanged(false);
                maybeContinueLoading();
            }
            resetRendererPosition(discontinuity, true);
            if (discontinuity != this.playbackInfo.positionUs) {
                androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
                long j = discontinuity;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, j, playbackInfo.requestedContentPositionUs, j, true, 5);
            }
        } else {
            long jSyncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = jSyncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(jSyncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            if (this.mediaClock.hasSkippedSilenceSinceLastCall()) {
                boolean z6 = !this.playbackInfoUpdate.positionDiscontinuity;
                androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = this.playbackInfo;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo2.periodId, periodTime, playbackInfo2.requestedContentPositionUs, periodTime, z6, 6);
            } else {
                this.playbackInfo.updatePositionUs(periodTime);
            }
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        androidx.media3.exoplayer.PlaybackInfo playbackInfo3 = this.playbackInfo;
        if (playbackInfo3.playWhenReady && playbackInfo3.playbackState == 3 && shouldUseLivePlaybackSpeedControl(playbackInfo3.timeline, playbackInfo3.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), this.playbackInfo.totalBufferedDurationUs);
            if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                setMediaClockPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2, long j, boolean z6) {
        if (!shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            androidx.media3.common.PlaybackParameters playbackParameters = mediaPeriodId.isAd() ? androidx.media3.common.PlaybackParameters.DEFAULT : this.playbackInfo.playbackParameters;
            if (this.mediaClock.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            setMediaClockPlaybackParameters(playbackParameters);
            handlePlaybackParameters(this.playbackInfo.playbackParameters, playbackParameters.speed, false, false);
            return;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        this.livePlaybackSpeedControl.setLiveConfiguration((androidx.media3.common.MediaItem.LiveConfiguration) androidx.media3.common.util.Util.castNonNull(this.window.liveConfiguration));
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j));
            return;
        }
        if (!java.util.Objects.equals(!timeline2.isEmpty() ? timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid : null, this.window.uid) || z6) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(androidx.media3.common.C.TIME_UNSET);
        }
    }

    private static int updatePlaybackSuppressionReason(int i3, int i9, boolean z6) {
        if (i3 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return z6 ? 4 : 0;
        }
        return i9;
    }

    private void updateRebufferingState(boolean z6, boolean z9) {
        this.isRebuffering = z6;
        this.lastRebufferRealtimeMs = (!z6 || z9) ? androidx.media3.common.C.TIME_UNSET : this.clock.elapsedRealtime();
    }

    private boolean updateRenderersForTransition() {
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        boolean z6 = true;
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.RendererHolder[] rendererHolderArr = this.renderers;
            if (i3 >= rendererHolderArr.length) {
                break;
            }
            int enabledRendererCount = rendererHolderArr[i3].getEnabledRendererCount();
            int iReplaceStreamsOrDisableRendererForTransition = this.renderers[i3].replaceStreamsOrDisableRendererForTransition(readingPeriod, trackSelectorResult, this.mediaClock);
            if ((iReplaceStreamsOrDisableRendererForTransition & 2) != 0 && this.offloadSchedulingEnabled) {
                setOffloadSchedulingEnabled(false);
            }
            this.enabledRendererCount -= enabledRendererCount - this.renderers[i3].getEnabledRendererCount();
            z6 &= (iReplaceStreamsOrDisableRendererForTransition & 1) != 0;
            i3++;
        }
        if (z6) {
            for (int i9 = 0; i9 < this.renderers.length; i9++) {
                if (trackSelectorResult.isRendererEnabled(i9) && !this.renderers[i9].isReadingFromPeriod(readingPeriod)) {
                    enableRenderer(readingPeriod, i9, false, readingPeriod.getStartPositionRendererTime());
                }
            }
        }
        return z6;
    }

    private void updateTrackSelectionPlaybackSpeed(float f9) {
        for (androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f9);
                }
            }
        }
    }

    public void addMediaSources(int i3, java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> list, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i3, 0, new androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage(list, shuffleOrder, -1, androidx.media3.common.C.TIME_UNSET)).sendToTarget();
    }

    @Override // androidx.media3.common.audio.AudioFocusManager.PlayerControl
    public void executePlayerCommand(int i3) {
        this.handler.obtainMessage(33, i3, 0).sendToTarget();
    }

    public void experimentalSetForegroundModeTimeoutMs(long j) {
        this.setForegroundModeTimeoutMs = j;
    }

    public android.os.Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) throws java.lang.Throwable {
        int i3;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod;
        int i9;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z6 = message.arg1 != 0;
                    int i11 = message.arg2;
                    setPlayWhenReadyInternal(z6, i11 >> 4, true, i11 & 15);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((androidx.media3.common.PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((androidx.media3.exoplayer.SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal((androidx.media3.common.util.ConditionVariable) message.obj);
                    return true;
                case 8:
                    handlePeriodPrepared((androidx.media3.exoplayer.source.MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((androidx.media3.exoplayer.source.MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (androidx.media3.common.util.ConditionVariable) message.obj);
                    break;
                case 14:
                    sendMessageInternal((androidx.media3.exoplayer.PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((androidx.media3.exoplayer.PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((androidx.media3.common.PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((androidx.media3.exoplayer.ExoPlayerImplInternal.MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (androidx.media3.exoplayer.source.ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((androidx.media3.exoplayer.source.ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                case 26:
                    reselectTracksInternalAndSeek();
                    break;
                case 27:
                    updateMediaSourcesWithMediaItemsInternal(message.arg1, message.arg2, (java.util.List) message.obj);
                    break;
                case 28:
                    setPreloadConfigurationInternal((androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration) message.obj);
                    break;
                case 29:
                    prepareInternal();
                    break;
                case 30:
                    android.util.Pair pair = (android.util.Pair) message.obj;
                    setVideoOutputInternal(pair.first, (androidx.media3.common.util.ConditionVariable) pair.second);
                    break;
                case 31:
                    setAudioAttributesInternal((androidx.media3.common.AudioAttributes) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    setVolumeInternal(((java.lang.Float) message.obj).floatValue());
                    break;
                case 33:
                    handleAudioFocusPlayerCommandInternal(message.arg1);
                    break;
                case 34:
                    handleAudioFocusVolumeMultiplierChange();
                    break;
                case 35:
                    setVideoFrameMetadataListenerInternal((androidx.media3.exoplayer.video.VideoFrameMetadataListener) message.obj);
                    break;
                case 36:
                    setScrubbingModeEnabledInternal(((java.lang.Boolean) message.obj).booleanValue());
                    break;
                case MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE /* 37 */:
                    this.seekIsPendingWhileScrubbing = false;
                    androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition seekPosition = this.queuedSeekWhileScrubbing;
                    if (seekPosition != null) {
                        seekToInternal(seekPosition);
                        this.queuedSeekWhileScrubbing = null;
                    }
                    break;
                case 38:
                    setScrubbingModeParametersInternal((androidx.media3.exoplayer.ScrubbingModeParameters) message.obj);
                    break;
                case 39:
                    setImageMetadataListenerInternal((androidx.media3.exoplayer.image.ImageMetadataListener) message.obj);
                    break;
            }
        } catch (androidx.media3.common.ParserException e6) {
            int i12 = e6.dataType;
            if (i12 == 1) {
                i9 = e6.contentIsMalformed ? androidx.media3.common.PlaybackException.ERROR_CODE_PARSING_CONTAINER_MALFORMED : androidx.media3.common.PlaybackException.ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED;
            } else {
                if (i12 == 4) {
                    i9 = e6.contentIsMalformed ? androidx.media3.common.PlaybackException.ERROR_CODE_PARSING_MANIFEST_MALFORMED : androidx.media3.common.PlaybackException.ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED;
                }
                handleIoException(e6, i10);
            }
            i10 = i9;
            handleIoException(e6, i10);
        } catch (androidx.media3.datasource.DataSourceException e9) {
            handleIoException(e9, e9.reason);
        } catch (androidx.media3.exoplayer.ExoPlaybackException e10) {
            e = e10;
            if (e.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null && e.mediaPeriodId == null) {
                e = e.copyWithMediaPeriodId(readingPeriod.info.id);
            }
            if (e.type == 1 && (mediaPeriodId = e.mediaPeriodId) != null && isRendererPrewarmingMediaPeriod(e.rendererIndex, mediaPeriodId)) {
                this.isPrewarmingDisabledUntilNextTransition = true;
                disableAndResetPrewarmingRenderers();
                androidx.media3.exoplayer.MediaPeriodHolder prewarmingPeriod = this.queue.getPrewarmingPeriod();
                androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
                if (this.queue.getPlayingPeriod() != prewarmingPeriod) {
                    while (playingPeriod != null && playingPeriod.getNext() != prewarmingPeriod) {
                        playingPeriod = playingPeriod.getNext();
                    }
                }
                this.queue.removeAfter(playingPeriod);
                if (this.playbackInfo.playbackState != 4) {
                    maybeContinueLoading();
                    this.handler.sendEmptyMessage(2);
                }
            } else {
                androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException = this.pendingRecoverableRendererError;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                }
                if (e.type == 1 && this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                    while (this.queue.getPlayingPeriod() != this.queue.getReadingPeriod()) {
                        this.queue.advancePlayingPeriod();
                    }
                    androidx.media3.exoplayer.MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.T(playingPeriod2);
                    maybeNotifyPlaybackInfoChanged();
                    androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = playingPeriod2.info;
                    androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodInfo.id;
                    long j = mediaPeriodInfo.startPositionUs;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId2, j, mediaPeriodInfo.requestedContentPositionUs, j, true, 0);
                }
                if (e.isRecoverable && (this.pendingRecoverableRendererError == null || (i3 = e.errorCode) == 5004 || i3 == 5003)) {
                    androidx.media3.common.util.Log.w(TAG, "Recoverable renderer error", e);
                    if (this.pendingRecoverableRendererError == null) {
                        this.pendingRecoverableRendererError = e;
                    }
                    androidx.media3.common.util.HandlerWrapper handlerWrapper = this.handler;
                    handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, e));
                } else {
                    androidx.media3.common.util.Log.e(TAG, "Playback error", e);
                    stopInternal(true, false);
                    this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
                }
            }
        } catch (androidx.media3.exoplayer.drm.DrmSession.DrmSessionException e11) {
            handleIoException(e11, e11.errorCode);
        } catch (androidx.media3.exoplayer.source.BehindLiveWindowException e12) {
            handleIoException(e12, 1002);
        } catch (java.io.IOException e13) {
            handleIoException(e13, 2000);
        } catch (java.lang.RuntimeException e14) {
            androidx.media3.exoplayer.ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(e14, ((e14 instanceof java.lang.IllegalStateException) || (e14 instanceof java.lang.IllegalArgumentException)) ? 1004 : 1000);
            androidx.media3.common.util.Log.e(TAG, "Playback error", exoPlaybackExceptionCreateForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackExceptionCreateForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    public void moveMediaSources(int i3, int i9, int i10, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(19, new androidx.media3.exoplayer.ExoPlayerImplInternal.MoveMediaItemsMessage(i3, i9, i10, shuffleOrder)).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessage(22);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onRendererCapabilitiesChanged(androidx.media3.exoplayer.Renderer renderer) {
        this.handler.sendEmptyMessage(26);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(10);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j, long j9, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
        if (this.seekIsPendingWhileScrubbing) {
            this.handler.obtainMessage(MSG_SEEK_COMPLETED_IN_SCRUBBING_MODE).sendToTarget();
        }
    }

    public void prepare() {
        this.handler.obtainMessage(29).sendToTarget();
    }

    public boolean release() {
        if (this.releasedOnApplicationThread || !this.playbackLooper.getThread().isAlive()) {
            return true;
        }
        this.releasedOnApplicationThread = true;
        androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable(this.clock);
        this.handler.obtainMessage(7, conditionVariable).sendToTarget();
        return conditionVariable.blockUninterruptible(this.releaseTimeoutMs);
    }

    public void removeMediaSources(int i3, int i9, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i3, i9, shuffleOrder).sendToTarget();
    }

    public void seekTo(androidx.media3.common.Timeline timeline, int i3, long j) {
        this.handler.obtainMessage(3, new androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition(timeline, i3, j)).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Sender
    public void sendMessage(androidx.media3.exoplayer.PlayerMessage playerMessage) {
        if (!this.releasedOnApplicationThread && this.playbackLooper.getThread().isAlive()) {
            this.handler.obtainMessage(14, playerMessage).sendToTarget();
        } else {
            androidx.media3.common.util.Log.w(TAG, "Ignoring messages sent after release.");
            playerMessage.markAsProcessed(false);
        }
    }

    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z6) {
        this.handler.obtainMessage(31, z6 ? 1 : 0, 0, audioAttributes).sendToTarget();
    }

    public boolean setForegroundMode(boolean z6) {
        if (this.releasedOnApplicationThread || !this.playbackLooper.getThread().isAlive()) {
            return true;
        }
        if (z6) {
            this.handler.obtainMessage(13, 1, 0).sendToTarget();
            return true;
        }
        androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable(this.clock);
        this.handler.obtainMessage(13, 0, 0, conditionVariable).sendToTarget();
        return conditionVariable.blockUninterruptible(this.setForegroundModeTimeoutMs);
    }

    public void setMediaSources(java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> list, int i3, long j, androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new androidx.media3.exoplayer.ExoPlayerImplInternal.MediaSourceListUpdateMessage(list, shuffleOrder, i3, j)).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z6) {
        this.handler.obtainMessage(23, z6 ? 1 : 0, 0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z6, int i3, int i9) {
        this.handler.obtainMessage(1, z6 ? 1 : 0, i3 | (i9 << 4)).sendToTarget();
    }

    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setPreloadConfiguration(androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.handler.obtainMessage(28, preloadConfiguration).sendToTarget();
    }

    public void setRepeatMode(int i3) {
        this.handler.obtainMessage(11, i3, 0).sendToTarget();
    }

    public void setScrubbingModeEnabled(boolean z6) {
        this.handler.obtainMessage(36, java.lang.Boolean.valueOf(z6)).sendToTarget();
    }

    public void setScrubbingModeParameters(androidx.media3.exoplayer.ScrubbingModeParameters scrubbingModeParameters) {
        this.handler.obtainMessage(38, scrubbingModeParameters).sendToTarget();
    }

    public void setSeekParameters(androidx.media3.exoplayer.SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z6) {
        this.handler.obtainMessage(12, z6 ? 1 : 0, 0).sendToTarget();
    }

    public void setShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public boolean setVideoOutput(java.lang.Object obj, long j) {
        if (!this.releasedOnApplicationThread && this.playbackLooper.getThread().isAlive()) {
            androidx.media3.common.util.ConditionVariable conditionVariable = new androidx.media3.common.util.ConditionVariable(this.clock);
            this.handler.obtainMessage(30, new android.util.Pair(obj, conditionVariable)).sendToTarget();
            if (j != androidx.media3.common.C.TIME_UNSET) {
                return conditionVariable.blockUninterruptible(j);
            }
        }
        return true;
    }

    public void setVolume(float f9) {
        this.handler.obtainMessage(32, java.lang.Float.valueOf(f9)).sendToTarget();
    }

    @Override // androidx.media3.common.audio.AudioFocusManager.PlayerControl
    public void setVolumeMultiplier(float f9) {
        this.handler.sendEmptyMessage(34);
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    public void updateMediaSourcesWithMediaItems(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list) {
        this.handler.obtainMessage(27, i3, i9, list).sendToTarget();
    }

    private long getTotalBufferedDurationUs(long j) {
        androidx.media3.exoplayer.MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return java.lang.Math.max(0L, j - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void handlePlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters, float f9, boolean z6, boolean z9) {
        if (z6) {
            if (z9) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
            rendererHolder.setPlaybackSpeed(f9, playbackParameters.speed);
        }
    }

    private void updatePlayWhenReadyWithAudioFocus(boolean z6, int i3, int i9) {
        updatePlayWhenReadyWithAudioFocus(z6, this.audioFocusManager.updateAudioFocus(z6, this.playbackInfo.playbackState), i3, i9);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    private void enableRenderers(boolean[] zArr, long j) {
        long j9;
        androidx.media3.exoplayer.MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i3 = 0; i3 < this.renderers.length; i3++) {
            if (!trackSelectorResult.isRendererEnabled(i3)) {
                this.renderers[i3].reset();
            }
        }
        int i9 = 0;
        while (i9 < this.renderers.length) {
            if (!trackSelectorResult.isRendererEnabled(i9) || this.renderers[i9].isReadingFromPeriod(readingPeriod)) {
                j9 = j;
            } else {
                j9 = j;
                enableRenderer(readingPeriod, i9, zArr[i9], j9);
            }
            i9++;
            j = j9;
        }
    }

    private long seekToPeriodPosition(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z6, boolean z9) {
        stopRenderers();
        boolean z10 = true;
        updateRebufferingState(false, true);
        if (z9 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        androidx.media3.exoplayer.MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        androidx.media3.exoplayer.MediaPeriodHolder next = playingPeriod;
        while (next != null && !mediaPeriodId.equals(next.info.id)) {
            next = next.getNext();
        }
        if (z6 || playingPeriod != next || (next != null && next.toRendererTime(j) < 0)) {
            disableRenderers();
            if (next != null) {
                while (this.queue.getPlayingPeriod() != next) {
                    this.queue.advancePlayingPeriod();
                }
                this.queue.removeAfter(next);
                next.setRendererOffset(androidx.media3.exoplayer.MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                enableRenderers();
                next.allRenderersInCorrectState = true;
            }
        }
        disableAndResetPrewarmingRenderers();
        if (this.scrubbingModeEnabled) {
            for (androidx.media3.exoplayer.RendererHolder rendererHolder : this.renderers) {
                if (rendererHolder.isRendererEnabled() && (rendererHolder.getTrackType() == 2 || rendererHolder.getTrackType() == 4)) {
                    this.seekIsPendingWhileScrubbing = true;
                    break;
                }
            }
        }
        if (next != null) {
            this.queue.removeAfter(next);
            if (!next.prepared) {
                next.info = next.info.copyWithStartPositionUs(j, androidx.media3.common.C.TIME_UNSET);
            } else if (next.hasEnabledTracks) {
                if (this.scrubbingModeEnabled && this.scrubbingModeParameters.allowSkippingKeyFrameReset && shouldSkipKeyFrameReset(next, j)) {
                    z10 = false;
                } else {
                    j = next.mediaPeriod.seekToUs(j);
                    next.mediaPeriod.discardBuffer(j - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
                }
            }
            resetRendererPosition(j, z10);
            maybeContinueLoading();
        } else {
            this.queue.clear();
            resetRendererPosition(j, true);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private void updatePlayWhenReadyWithAudioFocus(boolean z6, int i3, int i9, int i10) {
        boolean z9 = z6 && i3 != -1;
        int iUpdatePlayWhenReadyChangeReason = updatePlayWhenReadyChangeReason(i3, i10);
        int iUpdatePlaybackSuppressionReason = updatePlaybackSuppressionReason(i3, i9, this.scrubbingModeEnabled);
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playWhenReady == z9 && playbackInfo.playbackSuppressionReason == iUpdatePlaybackSuppressionReason && playbackInfo.playWhenReadyChangeReason == iUpdatePlayWhenReadyChangeReason) {
            return;
        }
        this.playbackInfo = playbackInfo.copyWithPlayWhenReady(z9, iUpdatePlayWhenReadyChangeReason, iUpdatePlaybackSuppressionReason);
        updateRebufferingState(false, false);
        notifyTrackSelectionPlayWhenReadyChanged(z9);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = this.playbackInfo;
            if (playbackInfo2.sleepingForOffload) {
                this.playbackInfo = playbackInfo2.copyWithSleepingForOffload(false);
            }
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            return;
        }
        int i11 = this.playbackInfo.playbackState;
        if (i11 == 3) {
            this.mediaClock.start();
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (i11 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }
}
