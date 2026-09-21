package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends androidx.media3.common.Player {

    @java.lang.Deprecated
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;

    @java.lang.Deprecated
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @java.lang.Deprecated
    public static final int DEFAULT_STUCK_BUFFERING_DETECTION_TIMEOUT_MS = 600000;

    @java.lang.Deprecated
    public static final int DEFAULT_STUCK_PLAYING_NOT_ENDING_TIMEOUT_MS = 60000;

    @java.lang.Deprecated
    public static final int DEFAULT_STUCK_SUPPRESSED_DETECTION_TIMEOUT_MS = 600000;

    public interface AudioOffloadListener {
        default void onOffloadedPlayback(boolean z6) {
        }

        default void onSleepingForOffloadChanged(boolean z6) {
        }
    }

    public static final class Builder {
        public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
        public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;
        public static final int DEFAULT_STUCK_BUFFERING_DETECTION_TIMEOUT_MS = 600000;
        public static final int DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS;
        public static final int DEFAULT_STUCK_PLAYING_NOT_ENDING_TIMEOUT_MS = 60000;
        public static final int DEFAULT_STUCK_SUPPRESSED_DETECTION_TIMEOUT_MS = 600000;
        public static boolean experimentalEnableStuckPlayingDetection;
        p068h4.j analyticsCollectorFunction;
        androidx.media3.common.AudioAttributes audioAttributes;
        androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider;
        boolean avoidLoadingWhileEnded;
        p068h4.v bandwidthMeterSupplier;
        boolean buildCalled;
        androidx.media3.common.util.Clock clock;
        final android.content.Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        androidx.media3.exoplayer.LivePlaybackSpeedControl livePlaybackSpeedControl;
        p068h4.v loadControlSupplier;
        android.os.Looper looper;
        long maxSeekToPreviousPositionMs;
        p068h4.v mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;
        androidx.media3.exoplayer.PlaybackLooperProvider playbackLooperProvider;
        java.lang.String playerName;
        int priority;
        androidx.media3.common.PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        p068h4.v renderersFactorySupplier;
        androidx.media3.exoplayer.ScrubbingModeParameters scrubbingModeParameters;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        androidx.media3.exoplayer.SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        int stuckBufferingDetectionTimeoutMs;
        int stuckPlayingDetectionTimeoutMs;
        int stuckPlayingNotEndingTimeoutMs;
        int stuckSuppressedDetectionTimeoutMs;
        androidx.media3.exoplayer.SuitableOutputChecker suitableOutputChecker;
        boolean suppressPlaybackOnUnsuitableOutput;
        p068h4.v trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;
        boolean wakeModeSet;

        static {
            DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS = androidx.media3.common.util.Util.isRunningOnEmulator() ? 30000 : 10000;
            experimentalEnableStuckPlayingDetection = true;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(final android.content.Context context) {
            final int i3 = 0;
            final int i9 = 1;
            this(context, new p068h4.v() { // from class: androidx.media3.exoplayer.h
                @Override // p068h4.v
                public final java.lang.Object get() {
                    switch (i3) {
                        case 0:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$0(context);
                        case 1:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$1(context);
                        case 2:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$3(context);
                        case 3:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$14(context);
                        case 4:
                            return androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.getSingletonInstance(context);
                        default:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$4(context);
                    }
                }
            }, new p068h4.v() { // from class: androidx.media3.exoplayer.h
                @Override // p068h4.v
                public final java.lang.Object get() {
                    switch (i9) {
                        case 0:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$0(context);
                        case 1:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$1(context);
                        case 2:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$3(context);
                        case 3:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$14(context);
                        case 4:
                            return androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.getSingletonInstance(context);
                        default:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$4(context);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$0(android.content.Context context) {
            return new androidx.media3.exoplayer.DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$new$1(android.content.Context context) {
            return new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(context, new androidx.media3.extractor.DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.trackselection.TrackSelector lambda$new$10(androidx.media3.exoplayer.trackselection.TrackSelector trackSelector) {
            return trackSelector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.LoadControl lambda$new$11(androidx.media3.exoplayer.LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.upstream.BandwidthMeter lambda$new$12(androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsCollector lambda$new$13(androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, androidx.media3.common.util.Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.trackselection.TrackSelector lambda$new$14(android.content.Context context) {
            return new androidx.media3.exoplayer.trackselection.DefaultTrackSelector(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$2(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$new$3(android.content.Context context) {
            return new androidx.media3.exoplayer.source.DefaultMediaSourceFactory(context, new androidx.media3.extractor.DefaultExtractorsFactory());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$4(android.content.Context context) {
            return new androidx.media3.exoplayer.DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$new$5(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$6(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$new$7(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$new$8(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$new$9(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsCollector lambda$setAnalyticsCollector$21(androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, androidx.media3.common.util.Clock clock) {
            return analyticsCollector;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.upstream.BandwidthMeter lambda$setBandwidthMeter$20(androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.LoadControl lambda$setLoadControl$19(androidx.media3.exoplayer.LoadControl loadControl) {
            return loadControl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.source.MediaSource.Factory lambda$setMediaSourceFactory$17(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            return factory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.RenderersFactory lambda$setRenderersFactory$16(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ androidx.media3.exoplayer.trackselection.TrackSelector lambda$setTrackSelector$18(androidx.media3.exoplayer.trackselection.TrackSelector trackSelector) {
            return trackSelector;
        }

        public androidx.media3.exoplayer.ExoPlayer build() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.buildCalled = true;
            return new androidx.media3.exoplayer.ExoPlayerImpl(this, null);
        }

        public androidx.media3.exoplayer.SimpleExoPlayer buildSimpleExoPlayer() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.buildCalled = true;
            return new androidx.media3.exoplayer.SimpleExoPlayer(this);
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder experimentalAvoidLoadingWhileEnded(boolean z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.avoidLoadingWhileEnded = z6;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder experimentalSetDynamicSchedulingEnabled(boolean z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.dynamicSchedulingEnabled = z6;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder experimentalSetForegroundModeTimeoutMs(long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.foregroundModeTimeoutMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setAnalyticsCollector(androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            analyticsCollector.getClass();
            this.analyticsCollectorFunction = new androidx.media3.exoplayer.C1552g(0, analyticsCollector);
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            audioAttributes.getClass();
            this.audioAttributes = audioAttributes;
            this.handleAudioFocus = z6;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setAudioOutputProvider(androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            audioOutputProvider.getClass();
            this.audioOutputProvider = audioOutputProvider;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setBandwidthMeter(androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            bandwidthMeter.getClass();
            this.bandwidthMeterSupplier = new androidx.media3.exoplayer.C1556k(bandwidthMeter, 0);
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setClock(androidx.media3.common.util.Clock clock) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setDetachSurfaceTimeoutMs(long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setDeviceVolumeControlEnabled(boolean z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.deviceVolumeControlEnabled = z6;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setHandleAudioBecomingNoisy(boolean z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.handleAudioBecomingNoisy = z6;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setLivePlaybackSpeedControl(androidx.media3.exoplayer.LivePlaybackSpeedControl livePlaybackSpeedControl) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            livePlaybackSpeedControl.getClass();
            this.livePlaybackSpeedControl = livePlaybackSpeedControl;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setLoadControl(androidx.media3.exoplayer.LoadControl loadControl) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            loadControl.getClass();
            this.loadControlSupplier = new androidx.media3.exoplayer.C1551f(loadControl, 0);
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setLooper(android.os.Looper looper) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            looper.getClass();
            this.looper = looper;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setMaxSeekToPreviousPositionMs(long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j >= 0);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setMediaSourceFactory(androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            factory.getClass();
            this.mediaSourceFactorySupplier = new androidx.media3.exoplayer.C1555j(factory, 3);
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setName(java.lang.String str) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!str.equals(androidx.media3.exoplayer.analytics.PlayerId.PRELOAD.name));
            this.playerName = str;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setPauseAtEndOfMediaItems(boolean z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z6;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setPlaybackLooper(android.os.Looper looper) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((this.buildCalled || looper == android.os.Looper.getMainLooper()) ? false : true);
            this.playbackLooperProvider = new androidx.media3.exoplayer.PlaybackLooperProvider(looper);
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setPlaybackLooperProvider(androidx.media3.exoplayer.PlaybackLooperProvider playbackLooperProvider) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.playbackLooperProvider = playbackLooperProvider;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setPriority(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.priority = i3;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setPriorityTaskManager(androidx.media3.common.PriorityTaskManager priorityTaskManager) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setReleaseTimeoutMs(long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.releaseTimeoutMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setRenderersFactory(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            renderersFactory.getClass();
            this.renderersFactorySupplier = new androidx.media3.exoplayer.C1554i(renderersFactory, 0);
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setScrubbingModeParameters(androidx.media3.exoplayer.ScrubbingModeParameters scrubbingModeParameters) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            scrubbingModeParameters.getClass();
            this.scrubbingModeParameters = scrubbingModeParameters;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSeekBackIncrementMs(long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j > 0);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.seekBackIncrementMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSeekForwardIncrementMs(long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j > 0);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.seekForwardIncrementMs = j;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSeekParameters(androidx.media3.exoplayer.SeekParameters seekParameters) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            seekParameters.getClass();
            this.seekParameters = seekParameters;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSkipSilenceEnabled(boolean z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.skipSilenceEnabled = z6;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setStuckBufferingDetectionTimeoutMs(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 > 0);
            this.stuckBufferingDetectionTimeoutMs = i3;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setStuckPlayingDetectionTimeoutMs(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 > 0);
            this.stuckPlayingDetectionTimeoutMs = i3;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setStuckPlayingNotEndingTimeoutMs(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 > 0);
            this.stuckPlayingNotEndingTimeoutMs = i3;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setStuckSuppressedDetectionTimeoutMs(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 > 0);
            this.stuckSuppressedDetectionTimeoutMs = i3;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSuitableOutputChecker(androidx.media3.exoplayer.SuitableOutputChecker suitableOutputChecker) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.suitableOutputChecker = suitableOutputChecker;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setSuppressPlaybackOnUnsuitableOutput(boolean z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z6;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setTrackSelector(androidx.media3.exoplayer.trackselection.TrackSelector trackSelector) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            trackSelector.getClass();
            this.trackSelectorSupplier = new androidx.media3.exoplayer.C1557l(trackSelector, 1);
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setUseLazyPreparation(boolean z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.useLazyPreparation = z6;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setUsePlatformDiagnostics(boolean z6) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.usePlatformDiagnostics = z6;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setVideoChangeFrameRateStrategy(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i3;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setVideoScalingMode(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.videoScalingMode = i3;
            return this;
        }

        public androidx.media3.exoplayer.ExoPlayer.Builder setWakeMode(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.wakeMode = i3;
            this.wakeModeSet = true;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(final android.content.Context context, androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            final int i3 = 2;
            this(context, new androidx.media3.exoplayer.C1554i(renderersFactory, 2), new p068h4.v() { // from class: androidx.media3.exoplayer.h
                @Override // p068h4.v
                public final java.lang.Object get() {
                    switch (i3) {
                        case 0:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$0(context);
                        case 1:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$1(context);
                        case 2:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$3(context);
                        case 3:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$14(context);
                        case 4:
                            return androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.getSingletonInstance(context);
                        default:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$4(context);
                    }
                }
            });
            renderersFactory.getClass();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(final android.content.Context context, androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            final int i3 = 5;
            this(context, new p068h4.v() { // from class: androidx.media3.exoplayer.h
                @Override // p068h4.v
                public final java.lang.Object get() {
                    switch (i3) {
                        case 0:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$0(context);
                        case 1:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$1(context);
                        case 2:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$3(context);
                        case 3:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$14(context);
                        case 4:
                            return androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.getSingletonInstance(context);
                        default:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$4(context);
                    }
                }
            }, new androidx.media3.exoplayer.C1555j(factory, 2));
            factory.getClass();
        }

        public Builder(android.content.Context context, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.exoplayer.source.MediaSource.Factory factory) {
            this(context, new androidx.media3.exoplayer.C1554i(renderersFactory, 1), new androidx.media3.exoplayer.C1555j(factory, 0));
            renderersFactory.getClass();
            factory.getClass();
        }

        public Builder(android.content.Context context, androidx.media3.exoplayer.RenderersFactory renderersFactory, androidx.media3.exoplayer.source.MediaSource.Factory factory, androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, androidx.media3.exoplayer.LoadControl loadControl, androidx.media3.exoplayer.upstream.BandwidthMeter bandwidthMeter, androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector) {
            androidx.media3.exoplayer.C1554i c1554i = new androidx.media3.exoplayer.C1554i(renderersFactory, 3);
            androidx.media3.exoplayer.C1555j c1555j = new androidx.media3.exoplayer.C1555j(factory, 1);
            androidx.media3.exoplayer.C1557l c1557l = new androidx.media3.exoplayer.C1557l(trackSelector, 0);
            androidx.media3.exoplayer.C1551f c1551f = new androidx.media3.exoplayer.C1551f(loadControl, 1);
            int i3 = 1;
            this(context, c1554i, c1555j, c1557l, c1551f, new androidx.media3.exoplayer.C1556k(bandwidthMeter, i3), new androidx.media3.exoplayer.C1552g(i3, analyticsCollector));
            renderersFactory.getClass();
            factory.getClass();
            trackSelector.getClass();
            bandwidthMeter.getClass();
            analyticsCollector.getClass();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private Builder(final android.content.Context context, p068h4.v vVar, p068h4.v vVar2) {
            final int i3 = 3;
            final int i9 = 4;
            this(context, vVar, vVar2, new p068h4.v() { // from class: androidx.media3.exoplayer.h
                @Override // p068h4.v
                public final java.lang.Object get() {
                    switch (i3) {
                        case 0:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$0(context);
                        case 1:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$1(context);
                        case 2:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$3(context);
                        case 3:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$14(context);
                        case 4:
                            return androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.getSingletonInstance(context);
                        default:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$4(context);
                    }
                }
            }, new androidx.media3.exoplayer.C1558m(), new p068h4.v() { // from class: androidx.media3.exoplayer.h
                @Override // p068h4.v
                public final java.lang.Object get() {
                    switch (i9) {
                        case 0:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$0(context);
                        case 1:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$1(context);
                        case 2:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$3(context);
                        case 3:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$14(context);
                        case 4:
                            return androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.getSingletonInstance(context);
                        default:
                            return androidx.media3.exoplayer.ExoPlayer.Builder.lambda$new$4(context);
                    }
                }
            }, new androidx.media3.exoplayer.P(3));
        }

        private Builder(android.content.Context context, p068h4.v vVar, p068h4.v vVar2, p068h4.v vVar3, p068h4.v vVar4, p068h4.v vVar5, p068h4.j jVar) {
            context.getClass();
            this.context = context;
            this.renderersFactorySupplier = vVar;
            this.mediaSourceFactorySupplier = vVar2;
            this.trackSelectorSupplier = vVar3;
            this.loadControlSupplier = vVar4;
            this.bandwidthMeterSupplier = vVar5;
            this.analyticsCollectorFunction = jVar;
            this.looper = androidx.media3.common.util.Util.getCurrentOrMainLooper();
            this.audioAttributes = androidx.media3.common.AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = androidx.media3.exoplayer.SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.maxSeekToPreviousPositionMs = androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
            this.scrubbingModeParameters = androidx.media3.exoplayer.ScrubbingModeParameters.DEFAULT;
            this.livePlaybackSpeedControl = new androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = androidx.media3.common.util.Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.stuckBufferingDetectionTimeoutMs = 600000;
            boolean z6 = experimentalEnableStuckPlayingDetection;
            int i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            this.stuckPlayingDetectionTimeoutMs = z6 ? DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS : Integer.MAX_VALUE;
            this.stuckPlayingNotEndingTimeoutMs = z6 ? 60000 : i3;
            this.stuckSuppressedDetectionTimeoutMs = 600000;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
            this.suitableOutputChecker = new androidx.media3.exoplayer.DefaultSuitableOutputChecker();
            this.avoidLoadingWhileEnded = true;
        }
    }

    public static class PreloadConfiguration {
        public static final androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration DEFAULT = new androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration(androidx.media3.common.C.TIME_UNSET);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j) {
            this.targetPreloadDurationUs = j;
        }
    }

    void addAnalyticsListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener);

    void addAudioCodecParametersChangeListener(androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener, java.util.List<java.lang.String> list);

    void addAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i3, androidx.media3.exoplayer.source.MediaSource mediaSource);

    void addMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource);

    void addMediaSources(int i3, java.util.List<androidx.media3.exoplayer.source.MediaSource> list);

    void addMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list);

    void addVideoCodecParametersChangeListener(androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener, java.util.List<java.lang.String> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener);

    androidx.media3.exoplayer.PlayerMessage createMessage(androidx.media3.exoplayer.PlayerMessage.Target target);

    androidx.media3.exoplayer.analytics.AnalyticsCollector getAnalyticsCollector();

    androidx.media3.exoplayer.DecoderCounters getAudioDecoderCounters();

    androidx.media3.common.Format getAudioFormat();

    androidx.media3.common.util.Clock getClock();

    @java.lang.Deprecated
    androidx.media3.exoplayer.source.TrackGroupArray getCurrentTrackGroups();

    @java.lang.Deprecated
    androidx.media3.exoplayer.trackselection.TrackSelectionArray getCurrentTrackSelections();

    boolean getPauseAtEndOfMediaItems();

    android.os.Looper getPlaybackLooper();

    @Override // androidx.media3.common.Player
    androidx.media3.exoplayer.ExoPlaybackException getPlayerError();

    androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration getPreloadConfiguration();

    androidx.media3.exoplayer.Renderer getRenderer(int i3);

    int getRendererCount();

    int getRendererType(int i3);

    androidx.media3.exoplayer.ScrubbingModeParameters getScrubbingModeParameters();

    androidx.media3.exoplayer.Renderer getSecondaryRenderer(int i3);

    androidx.media3.exoplayer.SeekParameters getSeekParameters();

    androidx.media3.exoplayer.source.ShuffleOrder getShuffleOrder();

    boolean getSkipSilenceEnabled();

    androidx.media3.exoplayer.trackselection.TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    androidx.media3.exoplayer.DecoderCounters getVideoDecoderCounters();

    androidx.media3.common.Format getVideoFormat();

    int getVideoScalingMode();

    boolean isReleased();

    boolean isScrubbingModeEnabled();

    boolean isSleepingForOffload();

    boolean isTunnelingEnabled();

    @java.lang.Deprecated
    void prepare(androidx.media3.exoplayer.source.MediaSource mediaSource);

    @java.lang.Deprecated
    void prepare(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z6, boolean z9);

    @Override // androidx.media3.common.Player
    void release();

    void removeAnalyticsListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener);

    void removeAudioCodecParametersChangeListener(androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener);

    void removeAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener);

    void removeVideoCodecParametersChangeListener(androidx.media3.exoplayer.CodecParametersChangeListener codecParametersChangeListener);

    @Override // androidx.media3.common.Player
    void replaceMediaItem(int i3, androidx.media3.common.MediaItem mediaItem);

    @Override // androidx.media3.common.Player
    void replaceMediaItems(int i3, int i9, java.util.List<androidx.media3.common.MediaItem> list);

    void setAudioCodecParameters(androidx.media3.exoplayer.CodecParameters codecParameters);

    void setAudioSessionId(int i3);

    void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener);

    void setForegroundMode(boolean z6);

    void setHandleAudioBecomingNoisy(boolean z6);

    void setImageOutput(androidx.media3.exoplayer.image.ImageOutput imageOutput);

    void setMaxSeekToPreviousPositionMs(long j);

    void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource);

    void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, long j);

    void setMediaSource(androidx.media3.exoplayer.source.MediaSource mediaSource, boolean z6);

    void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list);

    void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, int i3, long j);

    void setMediaSources(java.util.List<androidx.media3.exoplayer.source.MediaSource> list, boolean z6);

    void setPauseAtEndOfMediaItems(boolean z6);

    void setPreferredAudioDevice(android.media.AudioDeviceInfo audioDeviceInfo);

    void setPreloadConfiguration(androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration);

    void setPriority(int i3);

    void setPriorityTaskManager(androidx.media3.common.PriorityTaskManager priorityTaskManager);

    void setScrubbingModeEnabled(boolean z6);

    void setScrubbingModeParameters(androidx.media3.exoplayer.ScrubbingModeParameters scrubbingModeParameters);

    void setSeekBackIncrementMs(long j);

    void setSeekForwardIncrementMs(long j);

    void setSeekParameters(androidx.media3.exoplayer.SeekParameters seekParameters);

    void setShuffleOrder(androidx.media3.exoplayer.source.ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z6);

    void setVideoChangeFrameRateStrategy(int i3);

    void setVideoCodecParameters(androidx.media3.exoplayer.CodecParameters codecParameters);

    void setVideoEffects(java.util.List<androidx.media3.common.Effect> list);

    void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i3);

    void setVirtualDeviceId(int i3);

    void setWakeMode(int i3);
}
