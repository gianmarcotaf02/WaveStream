package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class ExoPlayerImpl extends androidx.media3.common.BasePlayer implements androidx.media3.exoplayer.ExoPlayer {
    private static final java.lang.String TAG = "ExoPlayerImpl";
    private final androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector;
    private final android.content.Context applicationContext;
    private final android.os.Looper applicationLooper;
    private androidx.media3.common.AudioAttributes audioAttributes;
    private final androidx.media3.common.audio.AudioBecomingNoisyManager audioBecomingNoisyManager;
    private androidx.media3.exoplayer.DecoderCounters audioDecoderCounters;
    private androidx.media3.common.Format audioFormat;
    private final androidx.media3.exoplayer.ExoPlayerImpl.CodecParameterListenerManager audioListenerManager;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener> audioOffloadListeners;
    private final androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Integer> audioSessionIdState;
    private androidx.media3.common.Player.Commands availableCommands;
    private final androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter;
    private androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener;
    private final androidx.media3.common.util.Clock clock;
    private final androidx.media3.exoplayer.ExoPlayerImpl.ComponentListener componentListener;
    private final androidx.media3.common.util.ConditionVariable constructorFinished = new androidx.media3.common.util.ConditionVariable();
    private androidx.media3.common.text.CueGroup currentCueGroup;
    private final long detachSurfaceTimeoutMs;
    private androidx.media3.common.DeviceInfo deviceInfo;
    private p076i4.AbstractC2214p0 disabledTrackTypesWithoutScrubbingMode;
    final androidx.media3.exoplayer.trackselection.TrackSelectorResult emptyTrackSelectorResult;
    private boolean foregroundMode;
    private final androidx.media3.exoplayer.ExoPlayerImpl.FrameMetadataListener frameMetadataListener;
    private boolean hasNotifiedFullWrongThreadWarning;
    private final androidx.media3.exoplayer.ExoPlayerImplInternal internalPlayer;
    private boolean isPriorityTaskManagerRegistered;
    private final androidx.media3.common.util.ListenerSet<androidx.media3.common.Player.Listener> listeners;
    private int maskingWindowIndex;
    private long maskingWindowPositionMs;
    private long maxSeekToPreviousPositionMs;
    private androidx.media3.common.MediaMetadata mediaMetadata;
    private final androidx.media3.exoplayer.source.MediaSource.Factory mediaSourceFactory;
    private final java.util.List<androidx.media3.exoplayer.ExoPlayerImpl.MediaSourceHolderSnapshot> mediaSourceHolderSnapshots;
    private android.view.Surface ownedSurface;
    private boolean pauseAtEndOfMediaItems;
    private boolean pendingDiscontinuity;
    private int pendingDiscontinuityReason;
    private int pendingOperationAcks;
    private final androidx.media3.common.Timeline.Period period;
    final androidx.media3.common.Player.Commands permanentAvailableCommands;
    private androidx.media3.exoplayer.PlaybackInfo playbackInfo;
    private final androidx.media3.common.util.HandlerWrapper playbackInfoUpdateHandler;
    private final androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private boolean playerReleased;
    private androidx.media3.common.MediaMetadata playlistMetadata;
    private androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration;
    private int priority;
    private androidx.media3.common.PriorityTaskManager priorityTaskManager;
    private final androidx.media3.exoplayer.Renderer[] renderers;
    private int repeatMode;
    private boolean scrubbingModeEnabled;
    private androidx.media3.exoplayer.ScrubbingModeParameters scrubbingModeParameters;
    private final androidx.media3.exoplayer.Renderer[] secondaryRenderers;
    private long seekBackIncrementMs;
    private long seekForwardIncrementMs;
    private androidx.media3.exoplayer.SeekParameters seekParameters;
    private boolean shuffleModeEnabled;
    private androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder;
    private boolean skipSilenceEnabled;
    private androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView sphericalGLSurfaceView;
    private androidx.media3.common.MediaMetadata staticAndDynamicMediaMetadata;
    private final androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager;
    private final androidx.media3.common.util.StuckPlayerDetector stuckPlayerDetector;
    private final androidx.media3.exoplayer.SuitableOutputChecker suitableOutputChecker;
    private android.view.SurfaceHolder surfaceHolder;
    private boolean surfaceHolderSurfaceIsVideoOutput;
    private androidx.media3.common.util.Size surfaceSize;
    private android.view.TextureView textureView;
    private boolean throwsWhenUsingWrongThread;
    private final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector;
    private float unmuteVolume;
    private final boolean useLazyPreparation;
    private int videoChangeFrameRateStrategy;
    private androidx.media3.exoplayer.DecoderCounters videoDecoderCounters;
    private androidx.media3.common.Format videoFormat;
    private androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener;
    private final androidx.media3.exoplayer.ExoPlayerImpl.CodecParameterListenerManager videoListenerManager;
    private java.lang.Object videoOutput;
    private int videoScalingMode;
    private androidx.media3.common.VideoSize videoSize;
    private final androidx.media3.exoplayer.ExoPlayerImpl.VirtualDeviceIdChangeListener virtualDeviceIdChangeListener;
    private float volume;
    private final androidx.media3.common.util.WakeLockManager wakeLockManager;
    private final androidx.media3.common.util.WifiLockManager wifiLockManager;
    private final androidx.media3.common.Player wrappingPlayer;

    public static final class Api31 {
        private Api31() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$registerMediaMetricsListener$0(android.content.Context context, boolean z6, androidx.media3.exoplayer.ExoPlayerImpl exoPlayerImpl, androidx.media3.exoplayer.analytics.PlayerId playerId) {
            androidx.media3.exoplayer.analytics.MediaMetricsListener mediaMetricsListenerCreate = androidx.media3.exoplayer.analytics.MediaMetricsListener.create(context);
            if (mediaMetricsListenerCreate == null) {
                androidx.media3.common.util.Log.w(androidx.media3.exoplayer.ExoPlayerImpl.TAG, "MediaMetricsService unavailable.");
                return;
            }
            if (z6) {
                exoPlayerImpl.addAnalyticsListener(mediaMetricsListenerCreate);
            }
            playerId.setLogSessionId(mediaMetricsListenerCreate.getLogSessionId());
        }

        public static void registerMediaMetricsListener(final android.content.Context context, final androidx.media3.exoplayer.ExoPlayerImpl exoPlayerImpl, final boolean z6, final androidx.media3.exoplayer.analytics.PlayerId playerId) {
            exoPlayerImpl.getClock().createHandler(exoPlayerImpl.getPlaybackLooper(), null).post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.z
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.ExoPlayerImpl.Api31.lambda$registerMediaMetricsListener$0(context, z6, exoPlayerImpl, playerId);
                }
            });
        }
    }

    public final class CodecParameterListenerManager {
        private androidx.media3.exoplayer.CodecParameters lastNotifiedParameters;
        private final java.util.Map<androidx.media3.exoplayer.CodecParametersChangeListener, java.util.List<java.lang.String>> listeners;
        private final int trackType;

        /* JADX INFO: Access modifiers changed from: private */
        public void addListener(androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener, java.util.List<java.lang.String> list) {
            this.listeners.put(codecParametersChangeListener, list);
            updateAndSendSubscribedKeysToRenderer();
            codecParametersChangeListener.onCodecParametersChanged(createFilteredCodecParameters(this.lastNotifiedParameters, list));
        }

        private androidx.media3.exoplayer.CodecParameters createFilteredCodecParameters(androidx.media3.exoplayer.CodecParameters codecParameters, java.util.List<java.lang.String> list) {
            androidx.media3.exoplayer.CodecParameters.Builder builderBuildUpon = codecParameters.buildUpon();
            java.util.HashSet hashSet = new java.util.HashSet(list);
            for (java.lang.String str : codecParameters.keySet()) {
                if (!hashSet.contains(str)) {
                    builderBuildUpon.remove(str);
                }
            }
            return builderBuildUpon.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onParametersChanged(androidx.media3.exoplayer.CodecParameters codecParameters) {
            for (java.util.Map.Entry entry : new java.util.HashMap(this.listeners).entrySet()) {
                androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener = (androidx.media3.exoplayer.CodecParametersChangeListener) entry.getKey();
                java.util.List<java.lang.String> list = (java.util.List) entry.getValue();
                androidx.media3.exoplayer.CodecParameters codecParametersCreateFilteredCodecParameters = createFilteredCodecParameters(codecParameters, list);
                if (!codecParametersCreateFilteredCodecParameters.equals(createFilteredCodecParameters(this.lastNotifiedParameters, list))) {
                    codecParametersChangeListener.onCodecParametersChanged(codecParametersCreateFilteredCodecParameters);
                }
            }
            this.lastNotifiedParameters = codecParameters;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeListener(androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener) {
            if (this.listeners.remove(codecParametersChangeListener) != null) {
                updateAndSendSubscribedKeysToRenderer();
            }
        }

        private void updateAndSendSubscribedKeysToRenderer() {
            int i3 = p076i4.AbstractC2214p0.j;
            p076i4.C2212o0 c2212o0 = new p076i4.C2212o0(4);
            for (java.util.List<java.lang.String> list : this.listeners.values()) {
                list.getClass();
                c2212o0.d(list);
            }
            androidx.media3.exoplayer.ExoPlayerImpl.this.sendRendererMessage(this.trackType, 22, c2212o0.g());
        }

        private CodecParameterListenerManager(int i3) {
            this.trackType = i3;
            this.listeners = new java.util.HashMap();
            this.lastNotifiedParameters = androidx.media3.exoplayer.CodecParameters.EMPTY;
        }
    }

    public final class ComponentListener implements androidx.media3.exoplayer.video.VideoRendererEventListener, androidx.media3.exoplayer.audio.AudioRendererEventListener, androidx.media3.exoplayer.text.TextOutput, androidx.media3.exoplayer.metadata.MetadataOutput, android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener, androidx.media3.common.audio.AudioBecomingNoisyManager.Listener, androidx.media3.exoplayer.StreamVolumeManager.Listener, androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener, androidx.media3.common.util.StuckPlayerDetector.Callback {
        private ComponentListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ java.lang.Integer lambda$onAudioSessionIdChanged$2(int i3, java.lang.Integer num) {
            return java.lang.Integer.valueOf(i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ java.lang.Integer lambda$onAudioSessionIdChanged$3(int i3, java.lang.Integer num) {
            return java.lang.Integer.valueOf(i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMetadata$6(androidx.media3.common.Player.Listener listener) {
            listener.onMediaMetadataChanged(androidx.media3.exoplayer.ExoPlayerImpl.this.mediaMetadata);
        }

        @Override // androidx.media3.common.audio.AudioBecomingNoisyManager.Listener
        public void onAudioBecomingNoisy() {
            androidx.media3.exoplayer.ExoPlayerImpl.this.updatePlayWhenReady(false, 3);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioCodecError(java.lang.Exception exc) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioCodecParametersChanged(androidx.media3.exoplayer.CodecParameters codecParameters) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.audioListenerManager.onParametersChanged(codecParameters);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(java.lang.String str, long j, long j9) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioDecoderInitialized(str, j, j9);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(java.lang.String str) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioDisabled(decoderCounters);
            androidx.media3.exoplayer.ExoPlayerImpl.this.audioFormat = null;
            androidx.media3.exoplayer.ExoPlayerImpl.this.audioDecoderCounters = null;
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.audioDecoderCounters = decoderCounters;
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioEnabled(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.audioFormat = format;
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long j) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioPositionAdvancing(j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioSessionIdChanged(int i3) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.audioSessionIdState.updateStateAsync(new androidx.media3.exoplayer.C1565t(i3, 1), new androidx.media3.exoplayer.C1565t(i3, 2));
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioSinkError(java.lang.Exception exc) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioTrackReleased(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onAudioUnderrun(int i3, long j, long j9) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onAudioUnderrun(i3, j, j9);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public void onCues(java.util.List<androidx.media3.common.text.Cue> list) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(27, new androidx.media3.exoplayer.C1560o(6, list));
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onDroppedFrames(int i3, long j) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onDroppedFrames(i3, j);
        }

        @Override // androidx.media3.exoplayer.metadata.MetadataOutput
        public void onMetadata(androidx.media3.common.Metadata metadata) {
            androidx.media3.exoplayer.ExoPlayerImpl exoPlayerImpl = androidx.media3.exoplayer.ExoPlayerImpl.this;
            exoPlayerImpl.staticAndDynamicMediaMetadata = exoPlayerImpl.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(metadata).build();
            androidx.media3.common.MediaMetadata mediaMetadataBuildUpdatedMediaMetadata = androidx.media3.exoplayer.ExoPlayerImpl.this.buildUpdatedMediaMetadata();
            if (!mediaMetadataBuildUpdatedMediaMetadata.equals(androidx.media3.exoplayer.ExoPlayerImpl.this.mediaMetadata)) {
                androidx.media3.exoplayer.ExoPlayerImpl.this.mediaMetadata = mediaMetadataBuildUpdatedMediaMetadata;
                androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.queueEvent(14, new androidx.media3.exoplayer.C1560o(4, this));
            }
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.queueEvent(28, new androidx.media3.exoplayer.C1560o(5, metadata));
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.flushEvents();
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onRenderedFirstFrame(java.lang.Object obj, long j) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onRenderedFirstFrame(obj, j);
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.videoOutput == obj) {
                androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(26, new D1.C0223h(8));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(boolean z6) {
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.skipSilenceEnabled == z6) {
                return;
            }
            androidx.media3.exoplayer.ExoPlayerImpl.this.skipSilenceEnabled = z6;
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(23, new androidx.media3.exoplayer.C1562q(z6, 2));
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener
        public void onSleepingForOffloadChanged(boolean z6) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.updateWakeAndWifiLock();
        }

        @Override // androidx.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int i3) {
            androidx.media3.common.DeviceInfo deviceInfoCreateDeviceInfo = androidx.media3.exoplayer.ExoPlayerImpl.createDeviceInfo(androidx.media3.exoplayer.ExoPlayerImpl.this.streamVolumeManager);
            if (deviceInfoCreateDeviceInfo.equals(androidx.media3.exoplayer.ExoPlayerImpl.this.deviceInfo)) {
                return;
            }
            androidx.media3.exoplayer.ExoPlayerImpl.this.deviceInfo = deviceInfoCreateDeviceInfo;
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(29, new androidx.media3.exoplayer.C1560o(8, deviceInfoCreateDeviceInfo));
        }

        @Override // androidx.media3.exoplayer.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(final int i3, final boolean z6) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(30, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.A
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    ((androidx.media3.common.Player.Listener) obj).onDeviceVolumeChanged(i3, z6);
                }
            });
        }

        @Override // androidx.media3.common.util.StuckPlayerDetector.Callback
        public void onStuckPlayerDetected(androidx.media3.common.util.StuckPlayerException stuckPlayerException) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.stopInternal(androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(stuckPlayerException, 1003));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i3, int i9) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.setSurfaceTextureInternal(surfaceTexture);
            androidx.media3.exoplayer.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i3, i9);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.setVideoOutputInternal(null);
            androidx.media3.exoplayer.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i3, int i9) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i3, i9);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoCodecError(java.lang.Exception exc) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoCodecError(exc);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoCodecParametersChanged(androidx.media3.exoplayer.CodecParameters codecParameters) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoListenerManager.onParametersChanged(codecParameters);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(java.lang.String str, long j, long j9) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoDecoderInitialized(str, j, j9);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDecoderReleased(java.lang.String str) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoDecoderReleased(str);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoDisabled(decoderCounters);
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoFormat = null;
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoDecoderCounters = null;
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoDecoderCounters = decoderCounters;
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoEnabled(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long j, int i3) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoFrameProcessingOffset(j, i3);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoFormat = format;
            androidx.media3.exoplayer.ExoPlayerImpl.this.analyticsCollector.onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.videoSize = videoSize;
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(25, new androidx.media3.exoplayer.C1560o(7, videoSize));
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(android.view.Surface surface) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.setVideoOutputInternal(surface);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(android.view.Surface surface) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.setVideoOutputInternal(null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i3, int i9, int i10) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(i9, i10);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                androidx.media3.exoplayer.ExoPlayerImpl.this.setVideoOutputInternal(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.surfaceHolderSurfaceIsVideoOutput) {
                androidx.media3.exoplayer.ExoPlayerImpl.this.setVideoOutputInternal(null);
            }
            androidx.media3.exoplayer.ExoPlayerImpl.this.maybeNotifySurfaceSizeChanged(0, 0);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public void onCues(androidx.media3.common.text.CueGroup cueGroup) {
            androidx.media3.exoplayer.ExoPlayerImpl.this.currentCueGroup = cueGroup;
            androidx.media3.exoplayer.ExoPlayerImpl.this.listeners.sendEvent(27, new androidx.media3.exoplayer.C1560o(3, cueGroup));
        }
    }

    public static final class FrameMetadataListener implements androidx.media3.exoplayer.video.VideoFrameMetadataListener, androidx.media3.exoplayer.video.spherical.CameraMotionListener, androidx.media3.exoplayer.PlayerMessage.Target {
        public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
        public static final int MSG_SET_SPHERICAL_SURFACE_VIEW = 10000;
        public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;
        private androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener;
        private androidx.media3.exoplayer.video.spherical.CameraMotionListener internalCameraMotionListener;
        private androidx.media3.exoplayer.video.VideoFrameMetadataListener internalVideoFrameMetadataListener;
        private androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener;

        private FrameMetadataListener() {
        }

        @Override // androidx.media3.exoplayer.PlayerMessage.Target
        public void handleMessage(int i3, java.lang.Object obj) {
            if (i3 == 7) {
                this.videoFrameMetadataListener = (androidx.media3.exoplayer.video.VideoFrameMetadataListener) obj;
                return;
            }
            if (i3 == 8) {
                this.cameraMotionListener = (androidx.media3.exoplayer.video.spherical.CameraMotionListener) obj;
                return;
            }
            if (i3 != 10000) {
                return;
            }
            androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView sphericalGLSurfaceView = (androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.internalVideoFrameMetadataListener = null;
                this.internalCameraMotionListener = null;
            } else {
                this.internalVideoFrameMetadataListener = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.internalCameraMotionListener = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotion(long j, float[] fArr) {
            androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotion(j, fArr);
            }
            androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotion(j, fArr);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
            androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener = this.internalCameraMotionListener;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotionReset();
            }
            androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener2 = this.cameraMotionListener;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotionReset();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long j, long j9, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
            long j10;
            long j11;
            androidx.media3.common.Format format2;
            android.media.MediaFormat mediaFormat2;
            androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener = this.internalVideoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j9, format, mediaFormat);
                mediaFormat2 = mediaFormat;
                format2 = format;
                j11 = j9;
                j10 = j;
            } else {
                j10 = j;
                j11 = j9;
                format2 = format;
                mediaFormat2 = mediaFormat;
            }
            androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener2 = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(j10, j11, format2, mediaFormat2);
            }
        }
    }

    public static final class MediaSourceHolderSnapshot implements androidx.media3.exoplayer.MediaSourceInfoHolder {
        private final androidx.media3.exoplayer.source.MediaSource mediaSource;
        private androidx.media3.common.Timeline timeline;
        private final java.lang.Object uid;

        public MediaSourceHolderSnapshot(java.lang.Object obj, androidx.media3.exoplayer.source.MaskingMediaSource maskingMediaSource) {
            this.uid = obj;
            this.mediaSource = maskingMediaSource;
            this.timeline = maskingMediaSource.getTimeline();
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public androidx.media3.common.Timeline getTimeline() {
            return this.timeline;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public java.lang.Object getUid() {
            return this.uid;
        }

        public void updateTimeline(androidx.media3.common.Timeline timeline) {
            this.timeline = timeline;
        }
    }

    public final class VirtualDeviceIdChangeListener {
        private final java.lang.ref.WeakReference<android.content.Context> contextReference;
        private final java.util.function.IntConsumer listener;

        /* JADX INFO: Access modifiers changed from: private */
        public void onVirtualDeviceIdChanged(int i3) {
            if (androidx.media3.exoplayer.ExoPlayerImpl.this.playerReleased) {
                return;
            }
            androidx.media3.exoplayer.ExoPlayerImpl.this.sendRendererMessage(1, 19, java.lang.Integer.valueOf(i3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            android.content.Context context = this.contextReference.get();
            if (context == null) {
                return;
            }
            context.unregisterDeviceIdChangeListener(this.listener);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.B, java.util.function.IntConsumer] */
        private VirtualDeviceIdChangeListener(android.content.Context context) {
            this.contextReference = new java.lang.ref.WeakReference<>(context);
            ?? r9 = new java.util.function.IntConsumer() { // from class: androidx.media3.exoplayer.B
                @Override // java.util.function.IntConsumer
                public final void accept(int i3) {
                    this.f16477a.onVirtualDeviceIdChanged(i3);
                }
            };
            this.listener = r9;
            androidx.media3.common.util.HandlerWrapper handlerWrapperCreateHandler = androidx.media3.exoplayer.ExoPlayerImpl.this.clock.createHandler(androidx.media3.exoplayer.ExoPlayerImpl.this.applicationLooper, null);
            java.util.Objects.requireNonNull(handlerWrapperCreateHandler);
            context.registerDeviceIdChangeListener(new androidx.media3.exoplayer.ExecutorC1550e(1, handlerWrapperCreateHandler), r9);
        }
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.exoplayer");
    }

    public ExoPlayerImpl(androidx.media3.exoplayer.ExoPlayer.Builder builder, androidx.media3.common.Player player) {
        android.os.Looper looper;
        androidx.media3.common.util.Clock clock;
        int i3 = 2;
        int i9 = 1;
        try {
            androidx.media3.common.util.Log.i(TAG, "Init " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + "]");
            this.applicationContext = builder.context.getApplicationContext();
            this.analyticsCollector = (androidx.media3.exoplayer.analytics.AnalyticsCollector) builder.analyticsCollectorFunction.apply(builder.clock);
            this.priority = builder.priority;
            this.priorityTaskManager = builder.priorityTaskManager;
            this.audioAttributes = builder.audioAttributes;
            this.videoScalingMode = builder.videoScalingMode;
            this.videoChangeFrameRateStrategy = builder.videoChangeFrameRateStrategy;
            this.skipSilenceEnabled = builder.skipSilenceEnabled;
            this.detachSurfaceTimeoutMs = builder.detachSurfaceTimeoutMs;
            androidx.media3.exoplayer.ExoPlayerImpl.ComponentListener componentListener = new androidx.media3.exoplayer.ExoPlayerImpl.ComponentListener();
            this.componentListener = componentListener;
            this.frameMetadataListener = new androidx.media3.exoplayer.ExoPlayerImpl.FrameMetadataListener();
            android.os.Handler handler = new android.os.Handler(builder.looper);
            androidx.media3.exoplayer.RenderersFactory renderersFactory = (androidx.media3.exoplayer.RenderersFactory) builder.renderersFactorySupplier.get();
            android.os.Handler handler2 = handler;
            androidx.media3.exoplayer.Renderer[] rendererArrCreateRenderers = renderersFactory.createRenderers(handler2, componentListener, componentListener, componentListener, componentListener);
            this.renderers = rendererArrCreateRenderers;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(rendererArrCreateRenderers.length > 0);
            this.secondaryRenderers = new androidx.media3.exoplayer.Renderer[rendererArrCreateRenderers.length];
            int i10 = 0;
            while (true) {
                androidx.media3.exoplayer.Renderer[] rendererArr = this.secondaryRenderers;
                if (i10 >= rendererArr.length) {
                    break;
                }
                androidx.media3.exoplayer.Renderer renderer = this.renderers[i10];
                androidx.media3.exoplayer.ExoPlayerImpl.ComponentListener componentListener2 = this.componentListener;
                android.os.Handler handler3 = handler2;
                handler2 = handler3;
                rendererArr[i10] = renderersFactory.createSecondaryRenderer(renderer, handler3, componentListener2, componentListener2, componentListener2, componentListener2);
                i10++;
            }
            androidx.media3.exoplayer.trackselection.TrackSelector trackSelector = (androidx.media3.exoplayer.trackselection.TrackSelector) builder.trackSelectorSupplier.get();
            this.trackSelector = trackSelector;
            this.mediaSourceFactory = (androidx.media3.exoplayer.source.MediaSource.Factory) builder.mediaSourceFactorySupplier.get();
            androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter = (androidx.media3.exoplayer.upstream.BandwidthMeter) builder.bandwidthMeterSupplier.get();
            this.bandwidthMeter = bandwidthMeter;
            this.useLazyPreparation = builder.useLazyPreparation;
            this.seekParameters = builder.seekParameters;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.scrubbingModeParameters = builder.scrubbingModeParameters;
            this.pauseAtEndOfMediaItems = builder.pauseAtEndOfMediaItems;
            android.os.Looper looper2 = builder.looper;
            this.applicationLooper = looper2;
            androidx.media3.common.util.Clock clock2 = builder.clock;
            this.clock = clock2;
            androidx.media3.common.Player player2 = player == null ? this : player;
            this.wrappingPlayer = player2;
            this.listeners = new androidx.media3.common.util.ListenerSet<>(looper2, clock2, new androidx.media3.exoplayer.x(this, i9));
            this.audioOffloadListeners = new java.util.concurrent.CopyOnWriteArraySet<>();
            this.mediaSourceHolderSnapshots = new java.util.ArrayList();
            this.shuffleOrder = new androidx.media3.exoplayer.source.ShuffleOrder.DefaultShuffleOrder(0);
            this.preloadConfiguration = androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration.DEFAULT;
            androidx.media3.exoplayer.Renderer[] rendererArr2 = this.renderers;
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = new androidx.media3.exoplayer.trackselection.TrackSelectorResult(new androidx.media3.exoplayer.RendererConfiguration[rendererArr2.length], new androidx.media3.exoplayer.trackselection.ExoTrackSelection[rendererArr2.length], androidx.media3.common.Tracks.EMPTY, null);
            this.emptyTrackSelectorResult = trackSelectorResult;
            this.period = new androidx.media3.common.Timeline.Period();
            androidx.media3.common.Player.Commands commandsBuild = new androidx.media3.common.Player.Commands.Builder().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).addIf(29, trackSelector.isSetParametersSupported()).addIf(23, builder.deviceVolumeControlEnabled).addIf(25, builder.deviceVolumeControlEnabled).addIf(33, builder.deviceVolumeControlEnabled).addIf(26, builder.deviceVolumeControlEnabled).addIf(34, builder.deviceVolumeControlEnabled).build();
            this.permanentAvailableCommands = commandsBuild;
            this.availableCommands = new androidx.media3.common.Player.Commands.Builder().addAll(commandsBuild).add(4).add(10).build();
            this.playbackInfoUpdateHandler = clock2.createHandler(looper2, null);
            androidx.media3.exoplayer.x xVar = new androidx.media3.exoplayer.x(this, i3);
            this.playbackInfoUpdateListener = xVar;
            this.playbackInfo = androidx.media3.exoplayer.PlaybackInfo.createDummy(trackSelectorResult);
            this.analyticsCollector.setPlayer(player2, looper2);
            androidx.media3.exoplayer.analytics.PlayerId playerId = new androidx.media3.exoplayer.analytics.PlayerId(builder.playerName);
            androidx.media3.exoplayer.ExoPlayerImplInternal exoPlayerImplInternal = new androidx.media3.exoplayer.ExoPlayerImplInternal(this.applicationContext, this.renderers, this.secondaryRenderers, trackSelector, trackSelectorResult, (androidx.media3.exoplayer.LoadControl) builder.loadControlSupplier.get(), bandwidthMeter, this.repeatMode, this.shuffleModeEnabled, this.analyticsCollector, this.seekParameters, builder.livePlaybackSpeedControl, builder.releaseTimeoutMs, this.pauseAtEndOfMediaItems, builder.dynamicSchedulingEnabled, looper2, clock2, xVar, playerId, builder.playbackLooperProvider, this.preloadConfiguration, this.frameMetadataListener, builder.avoidLoadingWhileEnded);
            this.internalPlayer = exoPlayerImplInternal;
            android.os.Looper playbackLooper = exoPlayerImplInternal.getPlaybackLooper();
            this.volume = 1.0f;
            this.repeatMode = 0;
            androidx.media3.common.MediaMetadata mediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
            this.mediaMetadata = mediaMetadata;
            this.playlistMetadata = mediaMetadata;
            this.staticAndDynamicMediaMetadata = mediaMetadata;
            this.maskingWindowIndex = -1;
            this.currentCueGroup = androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
            this.throwsWhenUsingWrongThread = true;
            addListener(this.analyticsCollector);
            bandwidthMeter.addEventListener(new android.os.Handler(looper2), this.analyticsCollector);
            addAudioOffloadListener(this.componentListener);
            long j = builder.foregroundModeTimeoutMs;
            if (j > 0) {
                exoPlayerImplInternal.experimentalSetForegroundModeTimeoutMs(j);
            }
            int i11 = android.os.Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                androidx.media3.exoplayer.ExoPlayerImpl.Api31.registerMediaMetricsListener(this.applicationContext, this, builder.usePlatformDiagnostics, playerId);
            }
            androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Integer> backgroundThreadStateHandler = new androidx.media3.common.util.BackgroundThreadStateHandler<>(0, playbackLooper, looper2, clock2, new androidx.media3.exoplayer.x(this, 3));
            android.os.Looper looper3 = looper2;
            this.audioSessionIdState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new androidx.media3.exoplayer.RunnableC1546a(2, this));
            androidx.media3.common.audio.AudioBecomingNoisyManager audioBecomingNoisyManager = new androidx.media3.common.audio.AudioBecomingNoisyManager(builder.context, playbackLooper, builder.looper, this.componentListener, clock2);
            this.audioBecomingNoisyManager = audioBecomingNoisyManager;
            audioBecomingNoisyManager.setEnabled(builder.handleAudioBecomingNoisy);
            if (builder.suppressPlaybackOnUnsuitableOutput) {
                androidx.media3.exoplayer.SuitableOutputChecker suitableOutputChecker = builder.suitableOutputChecker;
                this.suitableOutputChecker = suitableOutputChecker;
                suitableOutputChecker.enable(new androidx.media3.exoplayer.x(this, 4), this.applicationContext, looper3, playbackLooper, clock2);
                looper3 = looper3;
                playbackLooper = playbackLooper;
            } else {
                this.suitableOutputChecker = null;
            }
            if (builder.deviceVolumeControlEnabled) {
                android.os.Looper looper4 = playbackLooper;
                looper = looper4;
                clock = clock2;
                this.streamVolumeManager = new androidx.media3.exoplayer.StreamVolumeManager(builder.context, this.componentListener, this.audioAttributes.getVolumeControlStream(), looper4, looper3, clock2);
            } else {
                looper = playbackLooper;
                clock = clock2;
                this.streamVolumeManager = null;
            }
            int i12 = builder.wakeModeSet ? builder.wakeMode : (builder.stuckBufferingDetectionTimeoutMs == Integer.MAX_VALUE || builder.stuckPlayingDetectionTimeoutMs == Integer.MAX_VALUE || builder.stuckPlayingNotEndingTimeoutMs == Integer.MAX_VALUE || builder.stuckSuppressedDetectionTimeoutMs == Integer.MAX_VALUE) ? 0 : 1;
            androidx.media3.common.util.WakeLockManager wakeLockManager = new androidx.media3.common.util.WakeLockManager(builder.context, looper, clock);
            this.wakeLockManager = wakeLockManager;
            wakeLockManager.setEnabled(i12 != 0);
            androidx.media3.common.util.WifiLockManager wifiLockManager = new androidx.media3.common.util.WifiLockManager(builder.context, looper, clock);
            this.wifiLockManager = wifiLockManager;
            wifiLockManager.setEnabled(i12 == 2);
            this.deviceInfo = androidx.media3.common.DeviceInfo.UNKNOWN;
            this.videoSize = androidx.media3.common.VideoSize.UNKNOWN;
            this.surfaceSize = androidx.media3.common.util.Size.UNKNOWN;
            this.virtualDeviceIdChangeListener = i11 >= 34 ? new androidx.media3.exoplayer.ExoPlayerImpl.VirtualDeviceIdChangeListener(builder.context) : null;
            this.audioListenerManager = new androidx.media3.exoplayer.ExoPlayerImpl.CodecParameterListenerManager(1);
            this.videoListenerManager = new androidx.media3.exoplayer.ExoPlayerImpl.CodecParameterListenerManager(2);
            this.stuckPlayerDetector = new androidx.media3.common.util.StuckPlayerDetector(this, this.componentListener, clock, builder.stuckBufferingDetectionTimeoutMs, builder.stuckPlayingDetectionTimeoutMs, builder.stuckPlayingNotEndingTimeoutMs, builder.stuckSuppressedDetectionTimeoutMs);
            exoPlayerImplInternal.setScrubbingModeParameters(this.scrubbingModeParameters);
            exoPlayerImplInternal.setAudioAttributes(this.audioAttributes, builder.handleAudioFocus);
            sendRendererMessage(1, 3, this.audioAttributes);
            sendRendererMessage(2, 4, java.lang.Integer.valueOf(this.videoScalingMode));
            sendRendererMessage(2, 5, java.lang.Integer.valueOf(this.videoChangeFrameRateStrategy));
            sendRendererMessage(1, 9, java.lang.Boolean.valueOf(this.skipSilenceEnabled));
            sendRendererMessage(6, 8, this.frameMetadataListener);
            sendRendererMessage(16, java.lang.Integer.valueOf(this.priority));
            androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider = builder.audioOutputProvider;
            if (audioOutputProvider != null) {
                sendRendererMessage(1, 20, audioOutputProvider);
            }
        } finally {
            this.constructorFinished.open();
        }
    }

    private static androidx.media3.common.TrackSelectionParameters addDisabledTrackTypes(androidx.media3.common.TrackSelectionParameters trackSelectionParameters, p076i4.AbstractC2214p0 abstractC2214p0) {
        androidx.media3.common.TrackSelectionParameters.Builder builderBuildUpon = trackSelectionParameters.buildUpon();
        p076i4.j1 j1VarQ = abstractC2214p0.iterator();
        while (j1VarQ.hasNext()) {
            builderBuildUpon.setTrackTypeDisabled(((java.lang.Integer) j1VarQ.next()).intValue(), true);
        }
        return builderBuildUpon.build();
    }

    private java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> addMediaSourceHolders(int i3, java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder = new androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder(list.get(i9), this.useLazyPreparation);
            arrayList.add(mediaSourceHolder);
            this.mediaSourceHolderSnapshots.add(i9 + i3, new androidx.media3.exoplayer.ExoPlayerImpl.MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndInsert(i3, arrayList.size());
        return arrayList;
    }

    private androidx.media3.exoplayer.PlaybackInfo addMediaSourcesInternal(androidx.media3.exoplayer.PlaybackInfo playbackInfo, int i3, java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        androidx.media3.common.Timeline timeline = playbackInfo.timeline;
        this.pendingOperationAcks++;
        java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> listAddMediaSourceHolders = addMediaSourceHolders(i3, list);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(timeline, timelineCreateMaskingTimeline, getCurrentWindowIndexInternal(playbackInfo), getContentPositionInternal(playbackInfo)));
        this.internalPlayer.addMediaSources(i3, listAddMediaSourceHolders, this.shuffleOrder);
        return playbackInfoMaskTimelineAndPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.common.MediaMetadata buildUpdatedMediaMetadata() {
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.staticAndDynamicMediaMetadata;
        }
        return this.staticAndDynamicMediaMetadata.buildUpon().populate(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem.mediaMetadata).build();
    }

    private boolean canUpdateMediaSourcesWithMediaItems(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list) {
        if (i9 - i3 != list.size()) {
            return false;
        }
        for (int i10 = i3; i10 < i9; i10++) {
            if (!this.mediaSourceHolderSnapshots.get(i10).mediaSource.canUpdateMediaItem(list.get(i10 - i3))) {
                return false;
            }
        }
        return true;
    }

    private int computePlaybackSuppressionReason(boolean z6) {
        if (this.scrubbingModeEnabled) {
            return 4;
        }
        androidx.media3.exoplayer.SuitableOutputChecker suitableOutputChecker = this.suitableOutputChecker;
        if (suitableOutputChecker == null || suitableOutputChecker.isSelectedOutputSuitableForPlayback()) {
            return (this.playbackInfo.playbackSuppressionReason != 1 || z6) ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.common.DeviceInfo createDeviceInfo(androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager) {
        return new androidx.media3.common.DeviceInfo.Builder(0).setMinVolume(streamVolumeManager != null ? streamVolumeManager.getMinVolume() : 0).setMaxVolume(streamVolumeManager != null ? streamVolumeManager.getMaxVolume() : 0).build();
    }

    private androidx.media3.common.Timeline createMaskingTimeline() {
        return new androidx.media3.exoplayer.PlaylistTimeline(this.mediaSourceHolderSnapshots, this.shuffleOrder);
    }

    private java.util.List<androidx.media3.exoplayer.source.MediaSource> createMediaSources(java.util.List<androidx.media3.common.MediaItem> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(this.mediaSourceFactory.createMediaSource(list.get(i3)));
        }
        return arrayList;
    }

    private androidx.media3.exoplayer.PlayerMessage createMessageInternal(androidx.media3.exoplayer.PlayerMessage.Target target) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        androidx.media3.exoplayer.ExoPlayerImplInternal exoPlayerImplInternal = this.internalPlayer;
        androidx.media3.common.Timeline timeline = this.playbackInfo.timeline;
        if (currentWindowIndexInternal == -1) {
            currentWindowIndexInternal = 0;
        }
        return new androidx.media3.exoplayer.PlayerMessage(exoPlayerImplInternal, target, timeline, currentWindowIndexInternal, this.clock, exoPlayerImplInternal.getPlaybackLooper());
    }

    private android.util.Pair<java.lang.Boolean, java.lang.Integer> evaluateMediaItemTransitionReason(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.exoplayer.PlaybackInfo playbackInfo2, boolean z6, int i3, boolean z9, boolean z10) {
        androidx.media3.common.Timeline timeline = playbackInfo2.timeline;
        androidx.media3.common.Timeline timeline2 = playbackInfo.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return new android.util.Pair<>(java.lang.Boolean.FALSE, -1);
        }
        int i9 = 3;
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return new android.util.Pair<>(java.lang.Boolean.TRUE, 3);
        }
        if (timeline.getWindow(timeline.getPeriodByUid(playbackInfo2.periodId.periodUid, this.period).windowIndex, this.window).uid.equals(timeline2.getWindow(timeline2.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window).uid)) {
            if (z6 && i3 == 0 && playbackInfo2.periodId.windowSequenceNumber < playbackInfo.periodId.windowSequenceNumber) {
                return new android.util.Pair<>(java.lang.Boolean.TRUE, 0);
            }
            return (z6 && i3 == 1 && z10) ? new android.util.Pair<>(java.lang.Boolean.TRUE, 2) : new android.util.Pair<>(java.lang.Boolean.FALSE, -1);
        }
        if (z6 && i3 == 0) {
            i9 = 1;
        } else if (z6 && i3 == 1) {
            i9 = 2;
        } else if (!z9) {
            throw new java.lang.IllegalStateException();
        }
        return new android.util.Pair<>(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i9));
    }

    private long getContentPositionInternal(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        if (!playbackInfo.periodId.isAd()) {
            return androidx.media3.common.util.Util.usToMs(getCurrentPositionUsInternal(playbackInfo));
        }
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period);
        if (playbackInfo.requestedContentPositionUs == androidx.media3.common.C.TIME_UNSET) {
            return playbackInfo.timeline.getWindow(getCurrentWindowIndexInternal(playbackInfo), this.window).getDefaultPositionMs();
        }
        return androidx.media3.common.util.Util.usToMs(playbackInfo.requestedContentPositionUs) + this.period.getPositionInWindowMs();
    }

    private long getCurrentPositionUsInternal(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        if (playbackInfo.timeline.isEmpty()) {
            return androidx.media3.common.util.Util.msToUs(this.maskingWindowPositionMs);
        }
        long estimatedPositionUs = playbackInfo.sleepingForOffload ? playbackInfo.getEstimatedPositionUs() : playbackInfo.positionUs;
        return playbackInfo.periodId.isAd() ? estimatedPositionUs : periodPositionUsToWindowPositionUs(playbackInfo.timeline, playbackInfo.periodId, estimatedPositionUs);
    }

    private int getCurrentWindowIndexInternal(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        return playbackInfo.timeline.isEmpty() ? this.maskingWindowIndex : playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex;
    }

    private android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPositionUsAfterTimelineChanged(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2, int i3, long j) {
        boolean zIsEmpty = timeline.isEmpty();
        long j9 = androidx.media3.common.C.TIME_UNSET;
        if (zIsEmpty || timeline2.isEmpty()) {
            boolean z6 = !timeline.isEmpty() && timeline2.isEmpty();
            int i9 = z6 ? -1 : i3;
            if (!z6) {
                j9 = j;
            }
            return maskWindowPositionMsOrGetPeriodPositionUs(timeline2, i9, j9);
        }
        android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i3, androidx.media3.common.util.Util.msToUs(j));
        java.lang.Object obj = ((android.util.Pair) androidx.media3.common.util.Util.castNonNull(periodPositionUs)).first;
        if (timeline2.getIndexOfPeriod(obj) != -1) {
            return periodPositionUs;
        }
        int iResolveSubsequentPeriod = androidx.media3.exoplayer.ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, obj, timeline, timeline2);
        return iResolveSubsequentPeriod != -1 ? maskWindowPositionMsOrGetPeriodPositionUs(timeline2, iResolveSubsequentPeriod, timeline2.getWindow(iResolveSubsequentPeriod, this.window).getDefaultPositionMs()) : maskWindowPositionMsOrGetPeriodPositionUs(timeline2, -1, androidx.media3.common.C.TIME_UNSET);
    }

    private androidx.media3.common.Player.PositionInfo getPositionInfo(long j) {
        java.lang.Object obj;
        androidx.media3.common.MediaItem mediaItem;
        java.lang.Object obj2;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int currentPeriodIndex = getCurrentPeriodIndex();
        if (this.playbackInfo.timeline.isEmpty()) {
            obj = null;
            mediaItem = null;
            obj2 = null;
        } else {
            androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
            java.lang.Object obj3 = playbackInfo.periodId.periodUid;
            playbackInfo.timeline.getPeriodByUid(obj3, this.period);
            currentPeriodIndex = this.playbackInfo.timeline.getIndexOfPeriod(obj3);
            obj2 = obj3;
            obj = this.playbackInfo.timeline.getWindow(currentMediaItemIndex, this.window).uid;
            mediaItem = this.window.mediaItem;
        }
        int i3 = currentPeriodIndex;
        long jUsToMs = androidx.media3.common.util.Util.usToMs(j);
        long jUsToMs2 = this.playbackInfo.periodId.isAd() ? androidx.media3.common.util.Util.usToMs(getRequestedContentPositionUs(this.playbackInfo)) : jUsToMs;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
        return new androidx.media3.common.Player.PositionInfo(obj, currentMediaItemIndex, mediaItem, obj2, i3, jUsToMs, jUsToMs2, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
    }

    private androidx.media3.common.Player.PositionInfo getPreviousPositionInfo(int i3, androidx.media3.exoplayer.PlaybackInfo playbackInfo, int i9) {
        int i10;
        int i11;
        java.lang.Object obj;
        androidx.media3.common.MediaItem mediaItem;
        java.lang.Object obj2;
        long requestedContentPositionUs;
        long requestedContentPositionUs2;
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        if (playbackInfo.timeline.isEmpty()) {
            i10 = i9;
            i11 = i10;
            obj = null;
            mediaItem = null;
            obj2 = null;
        } else {
            java.lang.Object obj3 = playbackInfo.periodId.periodUid;
            playbackInfo.timeline.getPeriodByUid(obj3, period);
            int i12 = period.windowIndex;
            int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(obj3);
            java.lang.Object obj4 = playbackInfo.timeline.getWindow(i12, this.window).uid;
            mediaItem = this.window.mediaItem;
            obj2 = obj3;
            i11 = indexOfPeriod;
            obj = obj4;
            i10 = i12;
        }
        if (i3 == 0) {
            if (playbackInfo.periodId.isAd()) {
                androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
                requestedContentPositionUs = period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                requestedContentPositionUs2 = getRequestedContentPositionUs(playbackInfo);
            } else {
                requestedContentPositionUs = playbackInfo.periodId.nextAdGroupIndex != -1 ? getRequestedContentPositionUs(this.playbackInfo) : period.positionInWindowUs + period.durationUs;
                requestedContentPositionUs2 = requestedContentPositionUs;
            }
        } else if (playbackInfo.periodId.isAd()) {
            requestedContentPositionUs = playbackInfo.positionUs;
            requestedContentPositionUs2 = getRequestedContentPositionUs(playbackInfo);
        } else {
            requestedContentPositionUs = period.positionInWindowUs + playbackInfo.positionUs;
            requestedContentPositionUs2 = requestedContentPositionUs;
        }
        long jUsToMs = androidx.media3.common.util.Util.usToMs(requestedContentPositionUs);
        long jUsToMs2 = androidx.media3.common.util.Util.usToMs(requestedContentPositionUs2);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
        return new androidx.media3.common.Player.PositionInfo(obj, i10, mediaItem, obj2, i11, jUsToMs, jUsToMs2, mediaPeriodId2.adGroupIndex, mediaPeriodId2.adIndexInAdGroup);
    }

    private static long getRequestedContentPositionUs(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, period);
        return playbackInfo.requestedContentPositionUs == androidx.media3.common.C.TIME_UNSET ? playbackInfo.timeline.getWindow(period.windowIndex, window).getDefaultPositionUs() : period.getPositionInWindowUs() + playbackInfo.requestedContentPositionUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handlePlaybackInfo, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        int i3;
        long j;
        boolean z6;
        long jPeriodPositionUsToWindowPositionUs;
        int i9 = this.pendingOperationAcks - playbackInfoUpdate.operationAcks;
        this.pendingOperationAcks = i9;
        boolean z9 = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.pendingDiscontinuityReason = playbackInfoUpdate.discontinuityReason;
            this.pendingDiscontinuity = true;
        }
        if (i9 == 0) {
            androidx.media3.common.Timeline timeline = playbackInfoUpdate.playbackInfo.timeline;
            int currentMediaItemIndex = -1;
            if (!this.playbackInfo.timeline.isEmpty() && timeline.isEmpty()) {
                this.maskingWindowIndex = -1;
                this.maskingWindowPositionMs = 0L;
            }
            if (!timeline.isEmpty()) {
                java.util.List<androidx.media3.common.Timeline> childTimelines = ((androidx.media3.exoplayer.PlaylistTimeline) timeline).getChildTimelines();
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(childTimelines.size() == this.mediaSourceHolderSnapshots.size());
                for (int i10 = 0; i10 < childTimelines.size(); i10++) {
                    this.mediaSourceHolderSnapshots.get(i10).updateTimeline(childTimelines.get(i10));
                }
            }
            boolean z10 = this.pendingDiscontinuity;
            long j9 = androidx.media3.common.C.TIME_UNSET;
            if (z10) {
                boolean z11 = playbackInfoUpdate.playbackInfo.timeline.isEmpty() && this.playbackInfo.timeline.isEmpty();
                boolean zEquals = playbackInfoUpdate.playbackInfo.periodId.equals(this.playbackInfo.periodId);
                boolean z12 = playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs == this.playbackInfo.positionUs;
                if (z11 || (zEquals && z12)) {
                    z9 = false;
                }
                if (z9) {
                    currentMediaItemIndex = getCurrentMediaItemIndex();
                    if (timeline.isEmpty() || playbackInfoUpdate.playbackInfo.periodId.isAd()) {
                        jPeriodPositionUsToWindowPositionUs = playbackInfoUpdate.playbackInfo.discontinuityStartPositionUs;
                    } else {
                        androidx.media3.exoplayer.PlaybackInfo playbackInfo = playbackInfoUpdate.playbackInfo;
                        jPeriodPositionUsToWindowPositionUs = periodPositionUsToWindowPositionUs(timeline, playbackInfo.periodId, playbackInfo.discontinuityStartPositionUs);
                    }
                    j9 = jPeriodPositionUsToWindowPositionUs;
                }
                z6 = z9;
                long j10 = j9;
                i3 = currentMediaItemIndex;
                j = j10;
            } else {
                i3 = -1;
                j = -9223372036854775807L;
                z6 = false;
            }
            this.pendingDiscontinuity = false;
            updatePlaybackInfo(playbackInfoUpdate.playbackInfo, 1, z6, this.pendingDiscontinuityReason, j, i3, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(androidx.media3.common.Player.Listener listener, androidx.media3.common.FlagSet flagSet) {
        listener.onEvents(this.wrappingPlayer, new androidx.media3.common.Player.Events(flagSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.playbackInfoUpdateHandler.post(new androidx.media3.exoplayer.RunnableC1548c(this, playbackInfoUpdate, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        int iGenerateAudioSessionIdV21 = androidx.media3.common.util.Util.generateAudioSessionIdV21(this.applicationContext);
        if (this.audioSessionIdState.get().intValue() != iGenerateAudioSessionIdV21) {
            this.audioSessionIdState.setStateInBackground(java.lang.Integer.valueOf(iGenerateAudioSessionIdV21));
            sendRendererMessage(1, 10, java.lang.Integer.valueOf(iGenerateAudioSessionIdV21));
            sendRendererMessage(2, 10, java.lang.Integer.valueOf(iGenerateAudioSessionIdV21));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$release$9(androidx.media3.common.Player.Listener listener) {
        listener.onPlayerError(androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(new androidx.media3.exoplayer.ExoTimeoutException(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer lambda$setAudioSessionId$13(int i3, java.lang.Integer num) {
        if (i3 == 0) {
            i3 = num.intValue();
        }
        return java.lang.Integer.valueOf(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Integer lambda$setAudioSessionId$14(int i3, java.lang.Integer num) {
        if (i3 == 0) {
            i3 = androidx.media3.common.util.Util.generateAudioSessionIdV21(this.applicationContext);
        }
        return java.lang.Integer.valueOf(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaylistMetadata$11(androidx.media3.common.Player.Listener listener) {
        listener.onPlaylistMetadataChanged(this.playlistMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateAvailableCommands$31(androidx.media3.common.Player.Listener listener) {
        listener.onAvailableCommandsChanged(this.availableCommands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$17(androidx.media3.exoplayer.PlaybackInfo playbackInfo, int i3, androidx.media3.common.Player.Listener listener) {
        listener.onTimelineChanged(playbackInfo.timeline, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$18(int i3, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, androidx.media3.common.Player.Listener listener) {
        listener.onPositionDiscontinuity(i3);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$20(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlayerErrorChanged(playbackInfo.playbackError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$21(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlayerError(playbackInfo.playbackError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$22(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onTracksChanged(playbackInfo.trackSelectorResult.tracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$24(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onLoadingChanged(playbackInfo.isLoading);
        listener.onIsLoadingChanged(playbackInfo.isLoading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$25(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlayerStateChanged(playbackInfo.playWhenReady, playbackInfo.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$26(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlaybackStateChanged(playbackInfo.playbackState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$27(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlayWhenReadyChanged(playbackInfo.playWhenReady, playbackInfo.playWhenReadyChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$28(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlaybackSuppressionReasonChanged(playbackInfo.playbackSuppressionReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$29(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onIsPlayingChanged(playbackInfo.isPlaying());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updatePlaybackInfo$30(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Player.Listener listener) {
        listener.onPlaybackParametersChanged(playbackInfo.playbackParameters);
    }

    private static androidx.media3.exoplayer.PlaybackInfo maskPlaybackState(androidx.media3.exoplayer.PlaybackInfo playbackInfo, int i3) {
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlaybackState = playbackInfo.copyWithPlaybackState(i3);
        return (i3 == 1 || i3 == 4) ? playbackInfoCopyWithPlaybackState.copyWithIsLoading(false) : playbackInfoCopyWithPlaybackState;
    }

    private androidx.media3.exoplayer.PlaybackInfo maskTimelineAndPosition(androidx.media3.exoplayer.PlaybackInfo playbackInfo, androidx.media3.common.Timeline timeline, android.util.Pair<java.lang.Object, java.lang.Long> pair) {
        java.util.List<androidx.media3.common.Metadata> list;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(timeline.isEmpty() || pair != null);
        androidx.media3.common.Timeline timeline2 = playbackInfo.timeline;
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithTimeline = playbackInfo.copyWithTimeline(timeline);
        if (timeline.isEmpty()) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId dummyPeriodForEmptyTimeline = androidx.media3.exoplayer.PlaybackInfo.getDummyPeriodForEmptyTimeline();
            long jMsToUs = androidx.media3.common.util.Util.msToUs(this.maskingWindowPositionMs);
            androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray = androidx.media3.exoplayer.source.TrackGroupArray.EMPTY;
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = this.emptyTrackSelectorResult;
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfoCopyWithTimeline.copyWithNewPosition(dummyPeriodForEmptyTimeline, jMsToUs, jMsToUs, jMsToUs, 0L, trackGroupArray, trackSelectorResult, p076i4.S0.f22832l).copyWithLoadingMediaPeriodId(dummyPeriodForEmptyTimeline);
            playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
            return playbackInfoCopyWithLoadingMediaPeriodId;
        }
        java.lang.Object obj = playbackInfoCopyWithTimeline.periodId.periodUid;
        boolean zEquals = obj.equals(((android.util.Pair) androidx.media3.common.util.Util.castNonNull(pair)).first);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = !zEquals ? new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(pair.first) : playbackInfoCopyWithTimeline.periodId;
        long jLongValue = ((java.lang.Long) pair.second).longValue();
        long jMsToUs2 = androidx.media3.common.util.Util.msToUs(contentPositionInternal);
        if (!timeline2.isEmpty()) {
            jMsToUs2 -= timeline2.getPeriodByUid(obj, this.period).getPositionInWindowUs();
            if (zEquals && jMsToUs2 - jLongValue == 1 && jMsToUs2 == timeline2.getPeriodByUid(obj, this.period).durationUs) {
                jMsToUs2--;
            }
        }
        if (!zEquals || jLongValue < jMsToUs2) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!mediaPeriodId2.isAd());
            androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray2 = !zEquals ? androidx.media3.exoplayer.source.TrackGroupArray.EMPTY : playbackInfoCopyWithTimeline.trackGroups;
            androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult2 = !zEquals ? this.emptyTrackSelectorResult : playbackInfoCopyWithTimeline.trackSelectorResult;
            if (zEquals) {
                list = playbackInfoCopyWithTimeline.staticMetadata;
            } else {
                p076i4.Z z9 = p076i4.AbstractC2186b0.f22868i;
                list = p076i4.S0.f22832l;
            }
            androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId2 = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId2, jLongValue, jLongValue, jLongValue, 0L, trackGroupArray2, trackSelectorResult2, list).copyWithLoadingMediaPeriodId(mediaPeriodId2);
            playbackInfoCopyWithLoadingMediaPeriodId2.bufferedPositionUs = jLongValue;
            return playbackInfoCopyWithLoadingMediaPeriodId2;
        }
        if (jLongValue != jMsToUs2) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!mediaPeriodId3.isAd());
            long jMax = java.lang.Math.max(0L, playbackInfoCopyWithTimeline.totalBufferedDurationUs - (jLongValue - jMsToUs2));
            long j = playbackInfoCopyWithTimeline.bufferedPositionUs;
            if (playbackInfoCopyWithTimeline.loadingMediaPeriodId.equals(playbackInfoCopyWithTimeline.periodId)) {
                j = jLongValue + jMax;
            }
            androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithNewPosition = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId3, jLongValue, jLongValue, jLongValue, jMax, playbackInfoCopyWithTimeline.trackGroups, playbackInfoCopyWithTimeline.trackSelectorResult, playbackInfoCopyWithTimeline.staticMetadata);
            playbackInfoCopyWithNewPosition.bufferedPositionUs = j;
            return playbackInfoCopyWithNewPosition;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(playbackInfoCopyWithTimeline.loadingMediaPeriodId.periodUid);
        if (indexOfPeriod != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex) {
            return playbackInfoCopyWithTimeline;
        }
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        long adDurationUs = mediaPeriodId.isAd() ? this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) : this.period.durationUs;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId4 = mediaPeriodId;
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId3 = playbackInfoCopyWithTimeline.copyWithNewPosition(mediaPeriodId4, playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.discontinuityStartPositionUs, adDurationUs - playbackInfoCopyWithTimeline.positionUs, playbackInfoCopyWithTimeline.trackGroups, playbackInfoCopyWithTimeline.trackSelectorResult, playbackInfoCopyWithTimeline.staticMetadata).copyWithLoadingMediaPeriodId(mediaPeriodId4);
        playbackInfoCopyWithLoadingMediaPeriodId3.bufferedPositionUs = adDurationUs;
        return playbackInfoCopyWithLoadingMediaPeriodId3;
    }

    private android.util.Pair<java.lang.Object, java.lang.Long> maskWindowPositionMsOrGetPeriodPositionUs(androidx.media3.common.Timeline timeline, int i3, long j) {
        if (timeline.isEmpty()) {
            this.maskingWindowIndex = i3;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                j = 0;
            }
            this.maskingWindowPositionMs = j;
            return null;
        }
        if (i3 == -1 || i3 >= timeline.getWindowCount()) {
            i3 = timeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j = timeline.getWindow(i3, this.window).getDefaultPositionMs();
        }
        return timeline.getPeriodPositionUs(this.window, this.period, i3, androidx.media3.common.util.Util.msToUs(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifySurfaceSizeChanged(final int i3, final int i9) {
        if (i3 == this.surfaceSize.getWidth() && i9 == this.surfaceSize.getHeight()) {
            return;
        }
        this.surfaceSize = new androidx.media3.common.util.Size(i3, i9);
        this.listeners.sendEvent(24, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.s
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.common.Player.Listener) obj).onSurfaceSizeChanged(i3, i9);
            }
        });
        sendRendererMessage(2, 14, new androidx.media3.common.util.Size(i3, i9));
    }

    private void maybeUpdatePlaybackSuppressionReason() {
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        updatePlayWhenReady(playbackInfo.playWhenReady, playbackInfo.playWhenReadyChangeReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioSessionIdChanged(int i3, int i9) {
        verifyApplicationThread();
        sendRendererMessage(1, 10, java.lang.Integer.valueOf(i9));
        sendRendererMessage(2, 10, java.lang.Integer.valueOf(i9));
        this.listeners.sendEvent(21, new androidx.media3.exoplayer.w(i9, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSelectedOutputSuitabilityChanged(boolean z6) {
        if (this.playerReleased) {
            return;
        }
        if (!z6) {
            maybeUpdatePlaybackSuppressionReason();
        } else if (this.playbackInfo.playbackSuppressionReason == 3) {
            maybeUpdatePlaybackSuppressionReason();
        }
    }

    private long periodPositionUsToWindowPositionUs(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return this.period.getPositionInWindowUs() + j;
    }

    private androidx.media3.exoplayer.PlaybackInfo removeMediaItemsInternal(androidx.media3.exoplayer.PlaybackInfo playbackInfo, int i3, int i9) {
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(playbackInfo);
        long contentPositionInternal = getContentPositionInternal(playbackInfo);
        androidx.media3.common.Timeline timeline = playbackInfo.timeline;
        this.pendingOperationAcks++;
        removeMediaSourceHolders(i3, i9);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(timeline, timelineCreateMaskingTimeline, currentWindowIndexInternal, contentPositionInternal));
        int i10 = playbackInfoMaskTimelineAndPosition.playbackState;
        if (i10 != 1 && i10 != 4 && currentWindowIndexInternal >= i3 && currentWindowIndexInternal < i9) {
            if (androidx.media3.exoplayer.ExoPlayerImplInternal.resolveSubsequentPeriod(this.window, this.period, this.repeatMode, this.shuffleModeEnabled, playbackInfo.periodId.periodUid, timeline, timelineCreateMaskingTimeline) == -1) {
                playbackInfoMaskTimelineAndPosition = maskPlaybackState(playbackInfoMaskTimelineAndPosition, 4);
            }
        }
        this.internalPlayer.removeMediaSources(i3, i9, this.shuffleOrder);
        return playbackInfoMaskTimelineAndPosition;
    }

    private void removeMediaSourceHolders(int i3, int i9) {
        for (int i10 = i9 - 1; i10 >= i3; i10--) {
            this.mediaSourceHolderSnapshots.remove(i10);
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i3, i9);
    }

    private void removeSurfaceCallbacks() {
        if (this.sphericalGLSurfaceView != null) {
            createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(null).send();
            this.sphericalGLSurfaceView.removeVideoSurfaceListener(this.componentListener);
            this.sphericalGLSurfaceView = null;
        }
        android.view.TextureView textureView = this.textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.componentListener) {
                androidx.media3.common.util.Log.w(TAG, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener(null);
            }
            this.textureView = null;
        }
        android.view.SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.componentListener);
            this.surfaceHolder = null;
        }
    }

    private void sendRendererMessage(int i3, java.lang.Object obj) {
        sendRendererMessage(-1, i3, obj);
    }

    private java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> setMediaSourceHolders(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, int i3) {
        this.mediaSourceHolderSnapshots.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder mediaSourceHolder = new androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder(list.get(i9), this.useLazyPreparation);
            arrayList.add(mediaSourceHolder);
            this.mediaSourceHolderSnapshots.add(i9, new androidx.media3.exoplayer.ExoPlayerImpl.MediaSourceHolderSnapshot(mediaSourceHolder.uid, mediaSourceHolder.mediaSource));
        }
        this.shuffleOrder = this.shuffleOrder.cloneAndSet(arrayList.size(), i3);
        return arrayList;
    }

    private void setMediaSourcesInternal(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, int i3, long j, boolean z6) {
        long j9;
        int i9;
        int i10;
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        long currentPosition = getCurrentPosition();
        this.pendingOperationAcks++;
        java.util.List<androidx.media3.exoplayer.MediaSourceList.MediaSourceHolder> mediaSourceHolders = setMediaSourceHolders(list, i3);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        if (!timelineCreateMaskingTimeline.isEmpty() && i3 >= timelineCreateMaskingTimeline.getWindowCount()) {
            throw new androidx.media3.common.IllegalSeekPositionException(timelineCreateMaskingTimeline, i3, j);
        }
        if (z6) {
            int firstWindowIndex = timelineCreateMaskingTimeline.getFirstWindowIndex(this.shuffleModeEnabled);
            j9 = androidx.media3.common.C.TIME_UNSET;
            i9 = firstWindowIndex;
        } else if (i3 == -1) {
            i9 = currentWindowIndexInternal;
            j9 = currentPosition;
        } else {
            j9 = j;
            i9 = i3;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, timelineCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(timelineCreateMaskingTimeline, i9, j9));
        if (playbackInfoMaskTimelineAndPosition.playbackState == 1) {
            i10 = 1;
        } else {
            i10 = 4;
            if (!timelineCreateMaskingTimeline.isEmpty()) {
                if (i9 == -1) {
                    i10 = playbackInfoMaskTimelineAndPosition.playbackState;
                } else if (i9 < timelineCreateMaskingTimeline.getWindowCount()) {
                    i10 = 2;
                }
            }
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskPlaybackState = maskPlaybackState(playbackInfoMaskTimelineAndPosition, i10);
        this.internalPlayer.setMediaSources(mediaSourceHolders, i9, androidx.media3.common.util.Util.msToUs(j9), this.shuffleOrder);
        updatePlaybackInfo(playbackInfoMaskPlaybackState, 0, (this.playbackInfo.periodId.periodUid.equals(playbackInfoMaskPlaybackState.periodId.periodUid) || this.playbackInfo.timeline.isEmpty()) ? false : true, 4, getCurrentPositionUsInternal(playbackInfoMaskPlaybackState), -1, false);
    }

    private void setNonVideoOutputSurfaceHolderInternal(android.view.SurfaceHolder surfaceHolder) {
        this.surfaceHolderSurfaceIsVideoOutput = false;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        android.view.Surface surface = this.surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            android.graphics.Rect surfaceFrame = this.surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurfaceTextureInternal(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        setVideoOutputInternal(surface);
        this.ownedSurface = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoOutputInternal(java.lang.Object obj) {
        java.lang.Object obj2 = this.videoOutput;
        boolean z6 = (obj2 == null || obj2 == obj) ? false : true;
        boolean videoOutput = this.internalPlayer.setVideoOutput(obj, z6 ? this.detachSurfaceTimeoutMs : androidx.media3.common.C.TIME_UNSET);
        if (z6) {
            java.lang.Object obj3 = this.videoOutput;
            android.view.Surface surface = this.ownedSurface;
            if (obj3 == surface) {
                surface.release();
                this.ownedSurface = null;
            }
        }
        this.videoOutput = obj;
        if (videoOutput) {
            return;
        }
        stopInternal(androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(new androidx.media3.exoplayer.ExoTimeoutException(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal(androidx.media3.exoplayer.ExoPlaybackException exoPlaybackException) {
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfo.copyWithLoadingMediaPeriodId(playbackInfo.periodId);
        playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
        playbackInfoCopyWithLoadingMediaPeriodId.totalBufferedDurationUs = 0L;
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskPlaybackState = maskPlaybackState(playbackInfoCopyWithLoadingMediaPeriodId, 1);
        if (exoPlaybackException != null) {
            playbackInfoMaskPlaybackState = playbackInfoMaskPlaybackState.copyWithPlaybackError(exoPlaybackException);
        }
        this.pendingOperationAcks++;
        this.internalPlayer.stop();
        updatePlaybackInfo(playbackInfoMaskPlaybackState, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    private void updateAvailableCommands() {
        androidx.media3.common.Player.Commands commands = this.availableCommands;
        androidx.media3.common.Player.Commands availableCommands = androidx.media3.common.util.Util.getAvailableCommands(this.wrappingPlayer, this.permanentAvailableCommands);
        this.availableCommands = availableCommands;
        if (availableCommands.equals(commands)) {
            return;
        }
        this.listeners.queueEvent(13, new androidx.media3.exoplayer.x(this, 5));
    }

    private void updateMediaSourcesWithMediaItems(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list) {
        this.pendingOperationAcks++;
        this.internalPlayer.updateMediaSourcesWithMediaItems(i3, i9, list);
        for (int i10 = i3; i10 < i9; i10++) {
            androidx.media3.exoplayer.ExoPlayerImpl.MediaSourceHolderSnapshot mediaSourceHolderSnapshot = this.mediaSourceHolderSnapshots.get(i10);
            mediaSourceHolderSnapshot.updateTimeline(androidx.media3.exoplayer.source.TimelineWithUpdatedMediaItem.create(mediaSourceHolderSnapshot.getTimeline(), list.get(i10 - i3)));
        }
        updatePlaybackInfo(this.playbackInfo.copyWithTimeline(createMaskingTimeline()), 0, false, 4, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayWhenReady(boolean z6, int i3) {
        int iComputePlaybackSuppressionReason = computePlaybackSuppressionReason(z6);
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithEstimatedPosition = this.playbackInfo;
        if (playbackInfoCopyWithEstimatedPosition.playWhenReady == z6 && playbackInfoCopyWithEstimatedPosition.playbackSuppressionReason == iComputePlaybackSuppressionReason && playbackInfoCopyWithEstimatedPosition.playWhenReadyChangeReason == i3) {
            return;
        }
        this.pendingOperationAcks++;
        if (playbackInfoCopyWithEstimatedPosition.sleepingForOffload) {
            playbackInfoCopyWithEstimatedPosition = playbackInfoCopyWithEstimatedPosition.copyWithEstimatedPosition();
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlayWhenReady = playbackInfoCopyWithEstimatedPosition.copyWithPlayWhenReady(z6, i3, iComputePlaybackSuppressionReason);
        this.internalPlayer.setPlayWhenReady(z6, i3, iComputePlaybackSuppressionReason);
        updatePlaybackInfo(playbackInfoCopyWithPlayWhenReady, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    private void updatePlaybackInfo(final androidx.media3.exoplayer.PlaybackInfo playbackInfo, final int i3, boolean z6, final int i9, long j, int i10, boolean z9) {
        androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = this.playbackInfo;
        this.playbackInfo = playbackInfo;
        boolean zEquals = playbackInfo2.timeline.equals(playbackInfo.timeline);
        android.util.Pair<java.lang.Boolean, java.lang.Integer> pairEvaluateMediaItemTransitionReason = evaluateMediaItemTransitionReason(playbackInfo, playbackInfo2, z6, i9, !zEquals, z9);
        boolean zBooleanValue = ((java.lang.Boolean) pairEvaluateMediaItemTransitionReason.first).booleanValue();
        final int iIntValue = ((java.lang.Integer) pairEvaluateMediaItemTransitionReason.second).intValue();
        final androidx.media3.common.MediaItem mediaItem = null;
        if (zBooleanValue) {
            if (!playbackInfo.timeline.isEmpty()) {
                mediaItem = playbackInfo.timeline.getWindow(playbackInfo.timeline.getPeriodByUid(playbackInfo.periodId.periodUid, this.period).windowIndex, this.window).mediaItem;
            }
            this.staticAndDynamicMediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
        }
        if (zBooleanValue || !playbackInfo2.staticMetadata.equals(playbackInfo.staticMetadata)) {
            this.staticAndDynamicMediaMetadata = this.staticAndDynamicMediaMetadata.buildUpon().populateFromMetadata(playbackInfo.staticMetadata).build();
        }
        androidx.media3.common.MediaMetadata mediaMetadataBuildUpdatedMediaMetadata = buildUpdatedMediaMetadata();
        boolean zEquals2 = mediaMetadataBuildUpdatedMediaMetadata.equals(this.mediaMetadata);
        this.mediaMetadata = mediaMetadataBuildUpdatedMediaMetadata;
        boolean z10 = playbackInfo2.playWhenReady != playbackInfo.playWhenReady;
        boolean z11 = playbackInfo2.playbackState != playbackInfo.playbackState;
        if (z11 || z10) {
            updateWakeAndWifiLock();
        }
        boolean z12 = playbackInfo2.isLoading;
        boolean z13 = playbackInfo.isLoading;
        boolean z14 = z12 != z13;
        if (z14) {
            updatePriorityTaskManagerForIsLoadingChange(z13);
        }
        if (!zEquals) {
            final int i11 = 0;
            this.listeners.queueEvent(0, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.n
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.Player.Listener listener = (androidx.media3.common.Player.Listener) obj;
                    switch (i11) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$17((androidx.media3.exoplayer.PlaybackInfo) playbackInfo, i3, listener);
                            break;
                        default:
                            listener.onMediaItemTransition((androidx.media3.common.MediaItem) playbackInfo, i3);
                            break;
                    }
                }
            });
        }
        if (z6) {
            final androidx.media3.common.Player.PositionInfo previousPositionInfo = getPreviousPositionInfo(i9, playbackInfo2, i10);
            final androidx.media3.common.Player.PositionInfo positionInfo = getPositionInfo(j);
            this.listeners.queueEvent(11, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.y
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$18(i9, previousPositionInfo, positionInfo, (androidx.media3.common.Player.Listener) obj);
                }
            });
        }
        if (zBooleanValue) {
            final int i12 = 1;
            this.listeners.queueEvent(1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.n
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    androidx.media3.common.Player.Listener listener = (androidx.media3.common.Player.Listener) obj;
                    switch (i12) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$17((androidx.media3.exoplayer.PlaybackInfo) mediaItem, iIntValue, listener);
                            break;
                        default:
                            listener.onMediaItemTransition((androidx.media3.common.MediaItem) mediaItem, iIntValue);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.playbackError != playbackInfo.playbackError) {
            final int i13 = 7;
            this.listeners.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.p
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i13) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
            if (playbackInfo.playbackError != null) {
                final int i14 = 8;
                this.listeners.queueEvent(10, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.p
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(java.lang.Object obj) {
                        switch (i14) {
                            case 0:
                                androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                                break;
                            case 1:
                                androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                                break;
                            case 2:
                                androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                                break;
                            case 3:
                                androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                                break;
                            case 4:
                                androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                                break;
                            case 5:
                                androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                                break;
                            case 6:
                                androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                                break;
                            case 7:
                                androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                                break;
                            case 8:
                                androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                                break;
                            default:
                                androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                                break;
                        }
                    }
                });
            }
        }
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult = playbackInfo2.trackSelectorResult;
        androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        if (trackSelectorResult != trackSelectorResult2) {
            this.trackSelector.onSelectionActivated(trackSelectorResult2.info);
            final int i15 = 9;
            this.listeners.queueEvent(2, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.p
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i15) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.listeners.queueEvent(14, new androidx.media3.exoplayer.C1560o(0, this.mediaMetadata));
        }
        if (z14) {
            final int i16 = 0;
            this.listeners.queueEvent(3, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.p
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i16) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (z11 || z10) {
            final int i17 = 1;
            this.listeners.queueEvent(-1, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.p
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i17) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (z11) {
            final int i18 = 2;
            this.listeners.queueEvent(4, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.p
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i18) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (z10 || playbackInfo2.playWhenReadyChangeReason != playbackInfo.playWhenReadyChangeReason) {
            final int i19 = 3;
            this.listeners.queueEvent(5, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.p
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i19) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.playbackSuppressionReason != playbackInfo.playbackSuppressionReason) {
            final int i20 = 4;
            this.listeners.queueEvent(6, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.p
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i20) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.isPlaying() != playbackInfo.isPlaying()) {
            final int i21 = 5;
            this.listeners.queueEvent(7, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.p
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i21) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        if (!playbackInfo2.playbackParameters.equals(playbackInfo.playbackParameters)) {
            final int i22 = 6;
            this.listeners.queueEvent(12, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.p
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(java.lang.Object obj) {
                    switch (i22) {
                        case 0:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$24(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 1:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$25(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 2:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$26(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 3:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$27(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 4:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$28(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 5:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$29(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 6:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$30(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 7:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$20(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        case 8:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$21(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                        default:
                            androidx.media3.exoplayer.ExoPlayerImpl.lambda$updatePlaybackInfo$22(playbackInfo, (androidx.media3.common.Player.Listener) obj);
                            break;
                    }
                }
            });
        }
        updateAvailableCommands();
        this.listeners.flushEvents();
        if (playbackInfo2.sleepingForOffload != playbackInfo.sleepingForOffload) {
            java.util.Iterator<androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener> it = this.audioOffloadListeners.iterator();
            while (it.hasNext()) {
                it.next().onSleepingForOffloadChanged(playbackInfo.sleepingForOffload);
            }
        }
    }

    private void updatePriorityTaskManagerForIsLoadingChange(boolean z6) {
        androidx.media3.common.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            if (z6 && !this.isPriorityTaskManagerRegistered) {
                priorityTaskManager.add(this.priority);
                this.isPriorityTaskManagerRegistered = true;
            } else {
                if (z6 || !this.isPriorityTaskManagerRegistered) {
                    return;
                }
                priorityTaskManager.remove(this.priority);
                this.isPriorityTaskManagerRegistered = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWakeAndWifiLock() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.wakeLockManager.setStayAwake(getPlayWhenReady() && !isSleepingForOffload());
                this.wifiLockManager.setStayAwake(getPlayWhenReady());
                return;
            } else if (playbackState != 4) {
                throw new java.lang.IllegalStateException();
            }
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
    }

    private void verifyApplicationThread() {
        this.constructorFinished.blockUninterruptible();
        if (java.lang.Thread.currentThread() != getApplicationLooper().getThread()) {
            java.lang.String invariant = androidx.media3.common.util.Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", java.lang.Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.throwsWhenUsingWrongThread) {
                throw new java.lang.IllegalStateException(invariant);
            }
            androidx.media3.common.util.Log.w(TAG, invariant, this.hasNotifiedFullWrongThreadWarning ? null : new java.lang.IllegalStateException());
            this.hasNotifiedFullWrongThreadWarning = true;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAnalyticsListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector = this.analyticsCollector;
        analyticsListener.getClass();
        analyticsCollector.addListener(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioCodecParametersChangeListener(androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener, java.util.List<java.lang.String> list) {
        verifyApplicationThread();
        codecParametersChangeListener.getClass();
        list.getClass();
        this.audioListenerManager.addListener(codecParametersChangeListener, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.audioOffloadListeners.add(audioOffloadListener);
    }

    @Override // androidx.media3.common.Player
    public void addListener(androidx.media3.common.Player.Listener listener) {
        androidx.media3.common.util.ListenerSet<androidx.media3.common.Player.Listener> listenerSet = this.listeners;
        listener.getClass();
        listenerSet.add(listener);
    }

    @Override // androidx.media3.common.Player
    public void addMediaItems(int i3, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        addMediaSources(i3, createMediaSources(list));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(java.util.Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        verifyApplicationThread();
        addMediaSources(this.mediaSourceHolderSnapshots.size(), list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addVideoCodecParametersChangeListener(androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener, java.util.List<java.lang.String> list) {
        verifyApplicationThread();
        codecParametersChangeListener.getClass();
        list.getClass();
        this.videoListenerManager.addListener(codecParametersChangeListener, list);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearAuxEffectInfo() {
        verifyApplicationThread();
        setAuxEffectInfo(new androidx.media3.common.AuxEffectInfo(0, 0.0f));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        if (this.cameraMotionListener != cameraMotionListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(null).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void clearVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        if (this.videoFrameMetadataListener != videoFrameMetadataListener) {
            return;
        }
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(null).send();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface() {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(null);
        maybeNotifySurfaceSizeChanged(0, 0);
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null || surfaceHolder != this.surfaceHolder) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        clearVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // androidx.media3.common.Player
    public void clearVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null || textureView != this.textureView) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.PlayerMessage createMessage(androidx.media3.exoplayer.PlayerMessage.Target target) {
        verifyApplicationThread();
        return createMessageInternal(target);
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void decreaseDeviceVolume() {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(1);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.analytics.AnalyticsCollector getAnalyticsCollector() {
        verifyApplicationThread();
        return this.analyticsCollector;
    }

    @Override // androidx.media3.common.Player
    public android.os.Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        verifyApplicationThread();
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.DecoderCounters getAudioDecoderCounters() {
        verifyApplicationThread();
        return this.audioDecoderCounters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.Format getAudioFormat() {
        verifyApplicationThread();
        return this.audioFormat;
    }

    @Override // androidx.media3.common.Player
    public int getAudioSessionId() {
        verifyApplicationThread();
        return this.audioSessionIdState.get().intValue();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Player.Commands getAvailableCommands() {
        verifyApplicationThread();
        return this.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public long getBufferedPosition() {
        verifyApplicationThread();
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.loadingMediaPeriodId.equals(playbackInfo.periodId) ? androidx.media3.common.util.Util.usToMs(this.playbackInfo.bufferedPositionUs) : getDuration();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.util.Clock getClock() {
        return this.clock;
    }

    @Override // androidx.media3.common.Player
    public long getContentBufferedPosition() {
        verifyApplicationThread();
        if (this.playbackInfo.timeline.isEmpty()) {
            return this.maskingWindowPositionMs;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.loadingMediaPeriodId.windowSequenceNumber != playbackInfo.periodId.windowSequenceNumber) {
            return playbackInfo.timeline.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
        }
        long j = playbackInfo.bufferedPositionUs;
        if (this.playbackInfo.loadingMediaPeriodId.isAd()) {
            androidx.media3.exoplayer.PlaybackInfo playbackInfo2 = this.playbackInfo;
            androidx.media3.common.Timeline.Period periodByUid = playbackInfo2.timeline.getPeriodByUid(playbackInfo2.loadingMediaPeriodId.periodUid, this.period);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.playbackInfo.loadingMediaPeriodId.adGroupIndex);
            j = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.durationUs : adGroupTimeUs;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfo3 = this.playbackInfo;
        return androidx.media3.common.util.Util.usToMs(periodPositionUsToWindowPositionUs(playbackInfo3.timeline, playbackInfo3.loadingMediaPeriodId, j));
    }

    @Override // androidx.media3.common.Player
    public long getContentPosition() {
        verifyApplicationThread();
        return getContentPositionInternal(this.playbackInfo);
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdGroupIndex() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adGroupIndex;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public int getCurrentAdIndexInAdGroup() {
        verifyApplicationThread();
        if (isPlayingAd()) {
            return this.playbackInfo.periodId.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.text.CueGroup getCurrentCues() {
        verifyApplicationThread();
        return this.currentCueGroup;
    }

    @Override // androidx.media3.common.Player
    public int getCurrentMediaItemIndex() {
        verifyApplicationThread();
        int currentWindowIndexInternal = getCurrentWindowIndexInternal(this.playbackInfo);
        if (currentWindowIndexInternal == -1) {
            return 0;
        }
        return currentWindowIndexInternal;
    }

    @Override // androidx.media3.common.Player
    public int getCurrentPeriodIndex() {
        verifyApplicationThread();
        if (!this.playbackInfo.timeline.isEmpty()) {
            androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
            return playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
        }
        int i3 = this.maskingWindowIndex;
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    @Override // androidx.media3.common.Player
    public long getCurrentPosition() {
        verifyApplicationThread();
        return androidx.media3.common.util.Util.usToMs(getCurrentPositionUsInternal(this.playbackInfo));
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Timeline getCurrentTimeline() {
        verifyApplicationThread();
        return this.playbackInfo.timeline;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.source.TrackGroupArray getCurrentTrackGroups() {
        verifyApplicationThread();
        return this.playbackInfo.trackGroups;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.trackselection.TrackSelectionArray getCurrentTrackSelections() {
        verifyApplicationThread();
        return new androidx.media3.exoplayer.trackselection.TrackSelectionArray(this.playbackInfo.trackSelectorResult.selections);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.Tracks getCurrentTracks() {
        verifyApplicationThread();
        return this.playbackInfo.trackSelectorResult.tracks;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.DeviceInfo getDeviceInfo() {
        verifyApplicationThread();
        return this.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public int getDeviceVolume() {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.getVolume();
        }
        return 0;
    }

    @Override // androidx.media3.common.Player
    public long getDuration() {
        verifyApplicationThread();
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        return androidx.media3.common.util.Util.usToMs(this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
    }

    @Override // androidx.media3.common.Player
    public long getMaxSeekToPreviousPosition() {
        verifyApplicationThread();
        return this.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getMediaMetadata() {
        verifyApplicationThread();
        return this.mediaMetadata;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        verifyApplicationThread();
        return this.pauseAtEndOfMediaItems;
    }

    @Override // androidx.media3.common.Player
    public boolean getPlayWhenReady() {
        verifyApplicationThread();
        return this.playbackInfo.playWhenReady;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public android.os.Looper getPlaybackLooper() {
        return this.internalPlayer.getPlaybackLooper();
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        verifyApplicationThread();
        return this.playbackInfo.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackState() {
        verifyApplicationThread();
        return this.playbackInfo.playbackState;
    }

    @Override // androidx.media3.common.Player
    public int getPlaybackSuppressionReason() {
        verifyApplicationThread();
        return this.playbackInfo.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.MediaMetadata getPlaylistMetadata() {
        verifyApplicationThread();
        return this.playlistMetadata;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration getPreloadConfiguration() {
        return this.preloadConfiguration;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.Renderer getRenderer(int i3) {
        verifyApplicationThread();
        return this.renderers[i3];
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererCount() {
        verifyApplicationThread();
        return this.renderers.length;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getRendererType(int i3) {
        verifyApplicationThread();
        return this.renderers[i3].getTrackType();
    }

    @Override // androidx.media3.common.Player
    public int getRepeatMode() {
        verifyApplicationThread();
        return this.repeatMode;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.ScrubbingModeParameters getScrubbingModeParameters() {
        verifyApplicationThread();
        return this.scrubbingModeParameters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.Renderer getSecondaryRenderer(int i3) {
        verifyApplicationThread();
        return this.secondaryRenderers[i3];
    }

    @Override // androidx.media3.common.Player
    public long getSeekBackIncrement() {
        verifyApplicationThread();
        return this.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public long getSeekForwardIncrement() {
        verifyApplicationThread();
        return this.seekForwardIncrementMs;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.SeekParameters getSeekParameters() {
        verifyApplicationThread();
        return this.seekParameters;
    }

    @Override // androidx.media3.common.Player
    public boolean getShuffleModeEnabled() {
        verifyApplicationThread();
        return this.shuffleModeEnabled;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.source.ShuffleOrder getShuffleOrder() {
        verifyApplicationThread();
        return this.shuffleOrder;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean getSkipSilenceEnabled() {
        verifyApplicationThread();
        return this.skipSilenceEnabled;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.util.Size getSurfaceSize() {
        verifyApplicationThread();
        return this.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public long getTotalBufferedDuration() {
        verifyApplicationThread();
        return androidx.media3.common.util.Util.usToMs(this.playbackInfo.totalBufferedDurationUs);
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThread();
        androidx.media3.common.TrackSelectionParameters parameters = this.trackSelector.getParameters();
        return this.scrubbingModeEnabled ? parameters.buildUpon().setDisabledTrackTypes(this.disabledTrackTypesWithoutScrubbingMode).build() : parameters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.trackselection.TrackSelector getTrackSelector() {
        verifyApplicationThread();
        return this.trackSelector;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getVideoChangeFrameRateStrategy() {
        verifyApplicationThread();
        return this.videoChangeFrameRateStrategy;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.exoplayer.DecoderCounters getVideoDecoderCounters() {
        verifyApplicationThread();
        return this.videoDecoderCounters;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public androidx.media3.common.Format getVideoFormat() {
        verifyApplicationThread();
        return this.videoFormat;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public int getVideoScalingMode() {
        verifyApplicationThread();
        return this.videoScalingMode;
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.common.VideoSize getVideoSize() {
        verifyApplicationThread();
        return this.videoSize;
    }

    @Override // androidx.media3.common.Player
    public float getVolume() {
        verifyApplicationThread();
        return this.volume;
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void increaseDeviceVolume() {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(1);
        }
    }

    @Override // androidx.media3.common.Player
    public boolean isDeviceMuted() {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            return streamVolumeManager.isMuted();
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    public boolean isLoading() {
        verifyApplicationThread();
        return this.playbackInfo.isLoading;
    }

    @Override // androidx.media3.common.Player
    public boolean isPlayingAd() {
        verifyApplicationThread();
        return this.playbackInfo.periodId.isAd();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isReleased() {
        verifyApplicationThread();
        return this.playerReleased;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isScrubbingModeEnabled() {
        verifyApplicationThread();
        return this.scrubbingModeEnabled;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isSleepingForOffload() {
        verifyApplicationThread();
        return this.playbackInfo.sleepingForOffload;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public boolean isTunnelingEnabled() {
        verifyApplicationThread();
        for (androidx.media3.exoplayer.RendererConfiguration rendererConfiguration : this.playbackInfo.trackSelectorResult.rendererConfigurations) {
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    public void moveMediaItems(int i3, int i9, int i10) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0 && i3 <= i9 && i10 >= 0);
        int size = this.mediaSourceHolderSnapshots.size();
        int iMin = java.lang.Math.min(i9, size);
        int iMin2 = java.lang.Math.min(i10, size - (iMin - i3));
        if (i3 >= size || i3 == iMin || i3 == iMin2) {
            return;
        }
        androidx.media3.common.Timeline currentTimeline = getCurrentTimeline();
        this.pendingOperationAcks++;
        androidx.media3.common.util.Util.moveItems(this.mediaSourceHolderSnapshots, i3, iMin, iMin2);
        this.shuffleOrder = this.shuffleOrder.cloneAndMove(i3, iMin, iMin2);
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfo, timelineCreateMaskingTimeline, getPeriodPositionUsAfterTimelineChanged(currentTimeline, timelineCreateMaskingTimeline, getCurrentWindowIndexInternal(playbackInfo), getContentPositionInternal(this.playbackInfo)));
        this.internalPlayer.moveMediaSources(i3, iMin, iMin2, this.shuffleOrder);
        updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.Player
    public void mute() {
        verifyApplicationThread();
        if (this.volume != 0.0f) {
            setVolume(0.0f);
        }
    }

    @Override // androidx.media3.common.Player
    public void prepare() {
        verifyApplicationThread();
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != 1) {
            return;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlaybackError = playbackInfo.copyWithPlaybackError(null);
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskPlaybackState = maskPlaybackState(playbackInfoCopyWithPlaybackError, playbackInfoCopyWithPlaybackError.timeline.isEmpty() ? 4 : 2);
        this.pendingOperationAcks++;
        this.internalPlayer.prepare();
        updatePlaybackInfo(playbackInfoMaskPlaybackState, 1, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.Player
    public void release() {
        androidx.media3.common.util.Log.i(TAG, "Release " + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + androidx.media3.common.util.Util.DEVICE_DEBUG_INFO + "] [" + androidx.media3.common.MediaLibraryInfo.registeredModules() + "]");
        verifyApplicationThread();
        this.audioBecomingNoisyManager.setEnabled(false);
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.release();
        }
        this.wakeLockManager.setStayAwake(false);
        this.wifiLockManager.setStayAwake(false);
        androidx.media3.exoplayer.SuitableOutputChecker suitableOutputChecker = this.suitableOutputChecker;
        if (suitableOutputChecker != null) {
            suitableOutputChecker.disable();
        }
        androidx.media3.exoplayer.ExoPlayerImpl.VirtualDeviceIdChangeListener virtualDeviceIdChangeListener = this.virtualDeviceIdChangeListener;
        if (virtualDeviceIdChangeListener != null && android.os.Build.VERSION.SDK_INT >= 34) {
            virtualDeviceIdChangeListener.release();
        }
        this.stuckPlayerDetector.release();
        if (!this.internalPlayer.release()) {
            this.listeners.sendEvent(10, new androidx.media3.exoplayer.C1566u());
        }
        this.listeners.release();
        this.playbackInfoUpdateHandler.removeCallbacksAndMessages(null);
        this.bandwidthMeter.removeEventListener(this.analyticsCollector);
        androidx.media3.exoplayer.PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.sleepingForOffload) {
            this.playbackInfo = playbackInfo.copyWithEstimatedPosition();
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskPlaybackState = maskPlaybackState(this.playbackInfo, 1);
        this.playbackInfo = playbackInfoMaskPlaybackState;
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithLoadingMediaPeriodId = playbackInfoMaskPlaybackState.copyWithLoadingMediaPeriodId(playbackInfoMaskPlaybackState.periodId);
        this.playbackInfo = playbackInfoCopyWithLoadingMediaPeriodId;
        playbackInfoCopyWithLoadingMediaPeriodId.bufferedPositionUs = playbackInfoCopyWithLoadingMediaPeriodId.positionUs;
        this.playbackInfo.totalBufferedDurationUs = 0L;
        this.analyticsCollector.release();
        removeSurfaceCallbacks();
        android.view.Surface surface = this.ownedSurface;
        if (surface != null) {
            surface.release();
            this.ownedSurface = null;
        }
        if (this.isPriorityTaskManagerRegistered) {
            androidx.media3.common.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            priorityTaskManager.getClass();
            priorityTaskManager.remove(this.priority);
            this.isPriorityTaskManagerRegistered = false;
        }
        this.currentCueGroup = androidx.media3.common.text.CueGroup.EMPTY_TIME_ZERO;
        this.playerReleased = true;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAnalyticsListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        verifyApplicationThread();
        androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector = this.analyticsCollector;
        analyticsListener.getClass();
        analyticsCollector.removeListener(analyticsListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioCodecParametersChangeListener(androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener) {
        verifyApplicationThread();
        codecParametersChangeListener.getClass();
        this.audioListenerManager.removeListener(codecParametersChangeListener);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener) {
        verifyApplicationThread();
        this.audioOffloadListeners.remove(audioOffloadListener);
    }

    @Override // androidx.media3.common.Player
    public void removeListener(androidx.media3.common.Player.Listener listener) {
        verifyApplicationThread();
        androidx.media3.common.util.ListenerSet<androidx.media3.common.Player.Listener> listenerSet = this.listeners;
        listener.getClass();
        listenerSet.remove(listener);
    }

    @Override // androidx.media3.common.Player
    public void removeMediaItems(int i3, int i9) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0 && i9 >= i3);
        int size = this.mediaSourceHolderSnapshots.size();
        int iMin = java.lang.Math.min(i9, size);
        if (i3 >= size || i3 == iMin) {
            return;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoRemoveMediaItemsInternal = removeMediaItemsInternal(this.playbackInfo, i3, iMin);
        updatePlaybackInfo(playbackInfoRemoveMediaItemsInternal, 0, !playbackInfoRemoveMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(playbackInfoRemoveMediaItemsInternal), -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void removeVideoCodecParametersChangeListener(androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener) {
        verifyApplicationThread();
        codecParametersChangeListener.getClass();
        this.videoListenerManager.removeListener(codecParametersChangeListener);
    }

    @Override // androidx.media3.common.Player
    public void replaceMediaItems(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0 && i9 >= i3);
        int size = this.mediaSourceHolderSnapshots.size();
        if (i3 > size) {
            return;
        }
        int iMin = java.lang.Math.min(i9, size);
        if (canUpdateMediaSourcesWithMediaItems(i3, iMin, list)) {
            updateMediaSourcesWithMediaItems(i3, iMin, list);
            return;
        }
        java.util.List<androidx.media3.exoplayer.source.MediaSource> listCreateMediaSources = createMediaSources(list);
        if (this.playbackInfo.timeline.isEmpty()) {
            setMediaSources(listCreateMediaSources, this.maskingWindowIndex == -1);
        } else {
            androidx.media3.exoplayer.PlaybackInfo playbackInfoRemoveMediaItemsInternal = removeMediaItemsInternal(addMediaSourcesInternal(this.playbackInfo, iMin, listCreateMediaSources), i3, iMin);
            updatePlaybackInfo(playbackInfoRemoveMediaItemsInternal, 0, !playbackInfoRemoveMediaItemsInternal.periodId.periodUid.equals(this.playbackInfo.periodId.periodUid), 4, getCurrentPositionUsInternal(playbackInfoRemoveMediaItemsInternal), -1, false);
        }
    }

    @Override // androidx.media3.common.BasePlayer
    public void seekTo(int i3, long j, int i9, boolean z6) {
        verifyApplicationThread();
        if (i3 == -1) {
            return;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
        androidx.media3.common.Timeline timeline = this.playbackInfo.timeline;
        if (timeline.isEmpty() || i3 < timeline.getWindowCount()) {
            this.analyticsCollector.notifySeekStarted();
            this.pendingOperationAcks++;
            if (isPlayingAd()) {
                androidx.media3.common.util.Log.w(TAG, "seekTo ignored because an ad is playing");
                androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new androidx.media3.exoplayer.ExoPlayerImplInternal.PlaybackInfoUpdate(this.playbackInfo);
                playbackInfoUpdate.incrementPendingOperationAcks(1);
                this.playbackInfoUpdateListener.onPlaybackInfoUpdate(playbackInfoUpdate);
                return;
            }
            androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskPlaybackState = this.playbackInfo;
            int i10 = playbackInfoMaskPlaybackState.playbackState;
            if (i10 == 3 || (i10 == 4 && !timeline.isEmpty())) {
                playbackInfoMaskPlaybackState = maskPlaybackState(this.playbackInfo, 2);
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(playbackInfoMaskPlaybackState, timeline, maskWindowPositionMsOrGetPeriodPositionUs(timeline, i3, j));
            this.internalPlayer.seekTo(timeline, i3, androidx.media3.common.util.Util.msToUs(j));
            updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, true, 1, getCurrentPositionUsInternal(playbackInfoMaskTimelineAndPosition), currentMediaItemIndex, z6);
        }
    }

    @Override // androidx.media3.common.Player
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z6) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        if (!java.util.Objects.equals(this.audioAttributes, audioAttributes)) {
            this.audioAttributes = audioAttributes;
            sendRendererMessage(1, 3, audioAttributes);
            androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
            if (streamVolumeManager != null) {
                streamVolumeManager.setStreamType(audioAttributes.getVolumeControlStream());
            }
            this.listeners.queueEvent(20, new androidx.media3.exoplayer.C1560o(1, audioAttributes));
        }
        this.internalPlayer.setAudioAttributes(this.audioAttributes, z6);
        this.listeners.flushEvents();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAudioCodecParameters(androidx.media3.exoplayer.CodecParameters codecParameters) {
        verifyApplicationThread();
        codecParameters.getClass();
        sendRendererMessage(1, 21, codecParameters);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAudioSessionId(int i3) {
        verifyApplicationThread();
        if (this.audioSessionIdState.get().intValue() == i3) {
            return;
        }
        this.audioSessionIdState.updateStateAsync(new androidx.media3.exoplayer.C1565t(i3, 0), new androidx.media3.exoplayer.Q(this, i3, 3));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 6, auxEffectInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener) {
        verifyApplicationThread();
        this.cameraMotionListener = cameraMotionListener;
        createMessageInternal(this.frameMetadataListener).setType(8).setPayload(cameraMotionListener).send();
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceMuted(boolean z6) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z6, 1);
        }
    }

    @Override // androidx.media3.common.Player
    @java.lang.Deprecated
    public void setDeviceVolume(int i3) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i3, 1);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setForegroundMode(boolean z6) {
        verifyApplicationThread();
        if (this.foregroundMode != z6) {
            this.foregroundMode = z6;
            if (this.internalPlayer.setForegroundMode(z6)) {
                return;
            }
            stopInternal(androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(new androidx.media3.exoplayer.ExoTimeoutException(2), 1003));
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z6) {
        verifyApplicationThread();
        if (this.playerReleased) {
            return;
        }
        this.audioBecomingNoisyManager.setEnabled(z6);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(androidx.media3.exoplayer.image.ImageOutput imageOutput) {
        verifyApplicationThread();
        sendRendererMessage(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMaxSeekToPreviousPositionMs(long j) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j >= 0);
        if (this.maxSeekToPreviousPositionMs == j) {
            return;
        }
        this.maxSeekToPreviousPositionMs = j;
        this.listeners.sendEvent(18, new androidx.media3.exoplayer.v(j, 1));
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, boolean z6) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), z6);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSources(java.util.Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        verifyApplicationThread();
        setMediaSources(list, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z6) {
        verifyApplicationThread();
        if (this.pauseAtEndOfMediaItems == z6) {
            return;
        }
        this.pauseAtEndOfMediaItems = z6;
        this.internalPlayer.setPauseAtEndOfWindow(z6);
    }

    @Override // androidx.media3.common.Player
    public void setPlayWhenReady(boolean z6) {
        verifyApplicationThread();
        updatePlayWhenReady(z6, 1);
    }

    @Override // androidx.media3.common.Player
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        verifyApplicationThread();
        if (playbackParameters == null) {
            playbackParameters = androidx.media3.common.PlaybackParameters.DEFAULT;
        }
        if (this.playbackInfo.playbackParameters.equals(playbackParameters)) {
            return;
        }
        androidx.media3.exoplayer.PlaybackInfo playbackInfoCopyWithPlaybackParameters = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        this.pendingOperationAcks++;
        this.internalPlayer.setPlaybackParameters(playbackParameters);
        updatePlaybackInfo(playbackInfoCopyWithPlaybackParameters, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.common.Player
    public void setPlaylistMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
        verifyApplicationThread();
        mediaMetadata.getClass();
        if (mediaMetadata.equals(this.playlistMetadata)) {
            return;
        }
        this.playlistMetadata = mediaMetadata;
        this.listeners.sendEvent(15, new androidx.media3.exoplayer.x(this, 0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreferredAudioDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        verifyApplicationThread();
        sendRendererMessage(1, 12, audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPreloadConfiguration(androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        verifyApplicationThread();
        if (this.preloadConfiguration.equals(preloadConfiguration)) {
            return;
        }
        this.preloadConfiguration = preloadConfiguration;
        this.internalPlayer.setPreloadConfiguration(preloadConfiguration);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriority(int i3) {
        verifyApplicationThread();
        if (this.priority == i3) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            androidx.media3.common.PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            priorityTaskManager.getClass();
            priorityTaskManager.add(i3);
            priorityTaskManager.remove(this.priority);
        }
        this.priority = i3;
        sendRendererMessage(16, java.lang.Integer.valueOf(i3));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setPriorityTaskManager(androidx.media3.common.PriorityTaskManager priorityTaskManager) {
        verifyApplicationThread();
        if (java.util.Objects.equals(this.priorityTaskManager, priorityTaskManager)) {
            return;
        }
        if (this.isPriorityTaskManagerRegistered) {
            androidx.media3.common.PriorityTaskManager priorityTaskManager2 = this.priorityTaskManager;
            priorityTaskManager2.getClass();
            priorityTaskManager2.remove(this.priority);
        }
        if (priorityTaskManager == null || !isLoading()) {
            this.isPriorityTaskManagerRegistered = false;
        } else {
            priorityTaskManager.add(this.priority);
            this.isPriorityTaskManagerRegistered = true;
        }
        this.priorityTaskManager = priorityTaskManager;
    }

    @Override // androidx.media3.common.Player
    public void setRepeatMode(int i3) {
        verifyApplicationThread();
        if (this.repeatMode != i3) {
            this.repeatMode = i3;
            this.internalPlayer.setRepeatMode(i3);
            this.listeners.queueEvent(8, new androidx.media3.exoplayer.w(i3, 0));
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setScrubbingModeEnabled(boolean z6) {
        androidx.media3.common.TrackSelectionParameters trackSelectionParametersBuild;
        verifyApplicationThread();
        if (z6 == this.scrubbingModeEnabled) {
            return;
        }
        this.scrubbingModeEnabled = z6;
        if (!this.scrubbingModeParameters.disabledTrackTypes.isEmpty() && this.trackSelector.isSetParametersSupported()) {
            androidx.media3.common.TrackSelectionParameters parameters = this.trackSelector.getParameters();
            if (z6) {
                this.disabledTrackTypesWithoutScrubbingMode = parameters.disabledTrackTypes;
                trackSelectionParametersBuild = addDisabledTrackTypes(parameters, this.scrubbingModeParameters.disabledTrackTypes);
            } else {
                trackSelectionParametersBuild = parameters.buildUpon().setDisabledTrackTypes(this.disabledTrackTypesWithoutScrubbingMode).build();
                this.disabledTrackTypesWithoutScrubbingMode = null;
            }
            if (!trackSelectionParametersBuild.equals(parameters)) {
                this.trackSelector.setParameters(trackSelectionParametersBuild);
            }
        }
        this.internalPlayer.setScrubbingModeEnabled(z6);
        maybeUpdatePlaybackSuppressionReason();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setScrubbingModeParameters(androidx.media3.exoplayer.ScrubbingModeParameters scrubbingModeParameters) {
        verifyApplicationThread();
        if (this.scrubbingModeParameters.equals(scrubbingModeParameters)) {
            return;
        }
        androidx.media3.exoplayer.ScrubbingModeParameters scrubbingModeParameters2 = this.scrubbingModeParameters;
        this.scrubbingModeParameters = scrubbingModeParameters;
        this.internalPlayer.setScrubbingModeParameters(scrubbingModeParameters);
        if (this.scrubbingModeEnabled && this.trackSelector.isSetParametersSupported() && !scrubbingModeParameters2.disabledTrackTypes.equals(scrubbingModeParameters.disabledTrackTypes)) {
            androidx.media3.common.TrackSelectionParameters trackSelectionParametersAddDisabledTrackTypes = addDisabledTrackTypes(getTrackSelectionParameters(), scrubbingModeParameters.disabledTrackTypes);
            if (trackSelectionParametersAddDisabledTrackTypes.equals(this.trackSelector.getParameters())) {
                return;
            }
            this.trackSelector.setParameters(trackSelectionParametersAddDisabledTrackTypes);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekBackIncrementMs(long j) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j > 0);
        if (this.seekBackIncrementMs == j) {
            return;
        }
        this.seekBackIncrementMs = j;
        this.listeners.sendEvent(16, new androidx.media3.exoplayer.v(j, 0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekForwardIncrementMs(long j) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j > 0);
        if (this.seekForwardIncrementMs == j) {
            return;
        }
        this.seekForwardIncrementMs = j;
        this.listeners.sendEvent(17, new androidx.media3.exoplayer.v(j, 2));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSeekParameters(androidx.media3.exoplayer.SeekParameters seekParameters) {
        verifyApplicationThread();
        if (seekParameters == null) {
            seekParameters = androidx.media3.exoplayer.SeekParameters.DEFAULT;
        }
        if (this.seekParameters.equals(seekParameters)) {
            return;
        }
        this.seekParameters = seekParameters;
        this.internalPlayer.setSeekParameters(seekParameters);
    }

    @Override // androidx.media3.common.Player
    public void setShuffleModeEnabled(boolean z6) {
        verifyApplicationThread();
        if (this.shuffleModeEnabled != z6) {
            this.shuffleModeEnabled = z6;
            this.internalPlayer.setShuffleModeEnabled(z6);
            this.listeners.queueEvent(9, new androidx.media3.exoplayer.C1562q(z6, 1));
            updateAvailableCommands();
            this.listeners.flushEvents();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(shuffleOrder.getLength() == this.mediaSourceHolderSnapshots.size());
        this.shuffleOrder = shuffleOrder;
        androidx.media3.common.Timeline timelineCreateMaskingTimeline = createMaskingTimeline();
        androidx.media3.exoplayer.PlaybackInfo playbackInfoMaskTimelineAndPosition = maskTimelineAndPosition(this.playbackInfo, timelineCreateMaskingTimeline, maskWindowPositionMsOrGetPeriodPositionUs(timelineCreateMaskingTimeline, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.pendingOperationAcks++;
        this.internalPlayer.setShuffleOrder(shuffleOrder);
        updatePlaybackInfo(playbackInfoMaskTimelineAndPosition, 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setSkipSilenceEnabled(boolean z6) {
        verifyApplicationThread();
        if (this.skipSilenceEnabled == z6) {
            return;
        }
        this.skipSilenceEnabled = z6;
        sendRendererMessage(1, 9, java.lang.Boolean.valueOf(z6));
        this.listeners.sendEvent(23, new androidx.media3.exoplayer.C1562q(z6, 0));
    }

    public void setThrowsWhenUsingWrongThread(boolean z6) {
        this.throwsWhenUsingWrongThread = z6;
        this.listeners.setThrowsWhenUsingWrongThread(z6);
        androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector = this.analyticsCollector;
        if (analyticsCollector instanceof androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector) {
            ((androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector) analyticsCollector).setThrowsWhenUsingWrongThread(z6);
        }
    }

    @Override // androidx.media3.common.Player
    public void setTrackSelectionParameters(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        androidx.media3.common.TrackSelectionParameters trackSelectionParametersAddDisabledTrackTypes;
        verifyApplicationThread();
        if (this.trackSelector.isSetParametersSupported()) {
            androidx.media3.common.TrackSelectionParameters trackSelectionParameters2 = getTrackSelectionParameters();
            if (this.scrubbingModeEnabled) {
                this.disabledTrackTypesWithoutScrubbingMode = trackSelectionParameters.disabledTrackTypes;
                trackSelectionParametersAddDisabledTrackTypes = addDisabledTrackTypes(trackSelectionParameters, this.scrubbingModeParameters.disabledTrackTypes);
            } else {
                trackSelectionParametersAddDisabledTrackTypes = trackSelectionParameters;
            }
            if (!trackSelectionParametersAddDisabledTrackTypes.equals(this.trackSelector.getParameters())) {
                this.trackSelector.setParameters(trackSelectionParametersAddDisabledTrackTypes);
            }
            if (trackSelectionParameters2.equals(trackSelectionParameters)) {
                return;
            }
            this.listeners.sendEvent(19, new androidx.media3.exoplayer.C1560o(2, trackSelectionParameters));
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoChangeFrameRateStrategy(int i3) {
        verifyApplicationThread();
        if (this.videoChangeFrameRateStrategy == i3) {
            return;
        }
        this.videoChangeFrameRateStrategy = i3;
        sendRendererMessage(2, 5, java.lang.Integer.valueOf(i3));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoCodecParameters(androidx.media3.exoplayer.CodecParameters codecParameters) {
        verifyApplicationThread();
        codecParameters.getClass();
        sendRendererMessage(2, 21, codecParameters);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoEffects(java.util.List<androidx.media3.common.Effect> list) {
        verifyApplicationThread();
        try {
            java.lang.Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(androidx.media3.common.VideoFrameProcessor.Factory.class);
            sendRendererMessage(2, 13, list);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e6) {
            throw new java.lang.IllegalStateException("Could not find required lib-effect dependencies.", e6);
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        verifyApplicationThread();
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        createMessageInternal(this.frameMetadataListener).setType(7).setPayload(videoFrameMetadataListener).send();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVideoScalingMode(int i3) {
        verifyApplicationThread();
        this.videoScalingMode = i3;
        sendRendererMessage(2, 4, java.lang.Integer.valueOf(i3));
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        removeSurfaceCallbacks();
        setVideoOutputInternal(surface);
        int i3 = surface == null ? 0 : -1;
        maybeNotifySurfaceSizeChanged(i3, i3);
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        verifyApplicationThread();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.surfaceHolderSurfaceIsVideoOutput = true;
        this.surfaceHolder = surfaceHolder;
        surfaceHolder.addCallback(this.componentListener);
        android.view.Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setVideoOutputInternal(surface);
            android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            maybeNotifySurfaceSizeChanged(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.common.Player
    public void setVideoSurfaceView(android.view.SurfaceView surfaceView) {
        verifyApplicationThread();
        if (surfaceView instanceof androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer) {
            removeSurfaceCallbacks();
            setVideoOutputInternal(surfaceView);
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView)) {
                setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            removeSurfaceCallbacks();
            this.sphericalGLSurfaceView = (androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView) surfaceView;
            createMessageInternal(this.frameMetadataListener).setType(10000).setPayload(this.sphericalGLSurfaceView).send();
            this.sphericalGLSurfaceView.addVideoSurfaceListener(this.componentListener);
            setVideoOutputInternal(this.sphericalGLSurfaceView.getVideoSurface());
            setNonVideoOutputSurfaceHolderInternal(surfaceView.getHolder());
        }
    }

    @Override // androidx.media3.common.Player
    public void setVideoTextureView(android.view.TextureView textureView) {
        verifyApplicationThread();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        removeSurfaceCallbacks();
        this.textureView = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            androidx.media3.common.util.Log.w(TAG, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.componentListener);
        android.graphics.SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            setVideoOutputInternal(null);
            maybeNotifySurfaceSizeChanged(0, 0);
        } else {
            setSurfaceTextureInternal(surfaceTexture);
            maybeNotifySurfaceSizeChanged(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setVirtualDeviceId(int i3) {
        verifyApplicationThread();
        sendRendererMessage(1, 19, java.lang.Integer.valueOf(i3));
    }

    @Override // androidx.media3.common.Player
    public void setVolume(float f9) {
        verifyApplicationThread();
        final float fConstrainValue = androidx.media3.common.util.Util.constrainValue(f9, 0.0f, 1.0f);
        float f10 = this.volume;
        if (f10 == fConstrainValue) {
            return;
        }
        if (fConstrainValue != 0.0f) {
            f10 = fConstrainValue;
        }
        this.unmuteVolume = f10;
        this.volume = fConstrainValue;
        this.internalPlayer.setVolume(fConstrainValue);
        this.listeners.sendEvent(22, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.r
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.common.Player.Listener) obj).onVolumeChanged(fConstrainValue);
            }
        });
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setWakeMode(int i3) {
        verifyApplicationThread();
        if (i3 == 0) {
            this.wakeLockManager.setEnabled(false);
            this.wifiLockManager.setEnabled(false);
        } else if (i3 == 1) {
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(false);
        } else {
            if (i3 != 2) {
                return;
            }
            this.wakeLockManager.setEnabled(true);
            this.wifiLockManager.setEnabled(true);
        }
    }

    @Override // androidx.media3.common.Player
    public void stop() {
        verifyApplicationThread();
        stopInternal(null);
        this.currentCueGroup = new androidx.media3.common.text.CueGroup(p076i4.S0.f22832l, this.playbackInfo.positionUs);
    }

    @Override // androidx.media3.common.Player
    public void unmute() {
        verifyApplicationThread();
        if (this.volume == 0.0f) {
            float f9 = this.unmuteVolume;
            if (f9 != 0.0f) {
                setVolume(f9);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRendererMessage(int i3, int i9, java.lang.Object obj) {
        for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
            if (i3 == -1 || renderer.getTrackType() == i3) {
                createMessageInternal(renderer).setType(i9).setPayload(obj).send();
            }
        }
        for (androidx.media3.exoplayer.Renderer renderer2 : this.secondaryRenderers) {
            if (renderer2 != null && (i3 == -1 || renderer2.getTrackType() == i3)) {
                createMessageInternal(renderer2).setType(i9).setPayload(obj).send();
            }
        }
    }

    @Override // androidx.media3.common.Player
    public androidx.media3.exoplayer.ExoPlaybackException getPlayerError() {
        verifyApplicationThread();
        return this.playbackInfo.playbackError;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSource(int i3, androidx.media3.exoplayer.source.MediaSource mediaSource) {
        verifyApplicationThread();
        addMediaSources(i3, java.util.Collections.singletonList(mediaSource));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void addMediaSources(int i3, java.util.List<androidx.media3.exoplayer.source.MediaSource> list) {
        verifyApplicationThread();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
        int iMin = java.lang.Math.min(i3, this.mediaSourceHolderSnapshots.size());
        if (this.playbackInfo.timeline.isEmpty()) {
            setMediaSources(list, this.maskingWindowIndex == -1);
        } else {
            updatePlaybackInfo(addMediaSourcesInternal(this.playbackInfo, iMin, list), 0, false, 5, androidx.media3.common.C.TIME_UNSET, -1, false);
        }
    }

    @Override // androidx.media3.common.Player
    public void setMediaItems(java.util.List<androidx.media3.common.MediaItem> list, int i3, long j) {
        verifyApplicationThread();
        setMediaSources(createMediaSources(list), i3, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, long j) {
        verifyApplicationThread();
        setMediaSources(java.util.Collections.singletonList(mediaSource), 0, j);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, boolean z6) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, -1, androidx.media3.common.C.TIME_UNSET, z6);
    }

    @Override // androidx.media3.common.Player
    public void decreaseDeviceVolume(int i3) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.decreaseVolume(i3);
        }
    }

    @Override // androidx.media3.common.Player
    public void increaseDeviceVolume(int i3) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.increaseVolume(i3);
        }
    }

    @Override // androidx.media3.common.Player
    public void setDeviceMuted(boolean z6, int i3) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setMuted(z6, i3);
        }
    }

    @Override // androidx.media3.common.Player
    public void setDeviceVolume(int i3, int i9) {
        verifyApplicationThread();
        androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = this.streamVolumeManager;
        if (streamVolumeManager != null) {
            streamVolumeManager.setVolume(i3, i9);
        }
    }

    @Override // androidx.media3.common.Player
    public void clearVideoSurface(android.view.Surface surface) {
        verifyApplicationThread();
        if (surface == null || surface != this.videoOutput) {
            return;
        }
        clearVideoSurface();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, int i3, long j) {
        verifyApplicationThread();
        setMediaSourcesInternal(list, i3, j, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z6) {
        verifyApplicationThread();
        setMediaSources(java.util.Collections.singletonList(mediaSource), z6);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public void prepare(androidx.media3.exoplayer.source.MediaSource mediaSource) {
        verifyApplicationThread();
        setMediaSource(mediaSource);
        prepare();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    @java.lang.Deprecated
    public void prepare(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z6, boolean z9) {
        verifyApplicationThread();
        setMediaSource(mediaSource, z6);
        prepare();
    }
}
