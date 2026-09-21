package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultAudioSink implements androidx.media3.exoplayer.audio.AudioSink {
    private static final int AUDIO_OUTPUT_RETRY_BUFFER_SIZE_THRESHOLD = 1000000;
    private static final int AUDIO_OUTPUT_VOLUME_RAMP_TIME_MS = 20;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    private static final int MINIMUM_REPORT_SKIPPED_SILENCE_DURATION_US = 300000;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final int REPORT_SKIPPED_SILENCE_DELAY_MS = 100;
    private static final java.lang.String TAG = "DefaultAudioSink";
    private static final java.util.concurrent.atomic.AtomicInteger pendingReleaseCount = new java.util.concurrent.atomic.AtomicInteger();
    private long accumulatedSkippedSilenceDurationUs;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters afterDrainParameters;
    private androidx.media3.common.AudioAttributes audioAttributes;
    private final androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener;
    private androidx.media3.exoplayer.audio.AudioOutput audioOutput;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOutputListener audioOutputListener;
    private androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider;
    private androidx.media3.exoplayer.audio.AudioOutputProvider.Listener audioOutputProviderListener;
    private androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline;
    private final androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
    private int audioSessionId;
    private androidx.media3.common.AuxEffectInfo auxEffectInfo;
    private final p076i4.AbstractC2186b0 availableAudioProcessors;
    private final androidx.media3.exoplayer.audio.ChannelMappingAudioProcessor channelMappingAudioProcessor;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration;
    private final android.content.Context context;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private boolean handledOffloadOnPresentationEnded;
    private final androidx.media3.exoplayer.audio.DefaultAudioSink.PendingExceptionHolder<androidx.media3.exoplayer.audio.AudioSink.InitializationException> initializationExceptionPendingExceptionHolder;
    private java.nio.ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;
    private androidx.media3.exoplayer.audio.AudioSink.Listener listener;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters;
    private final java.util.ArrayDeque<androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private int offloadMode;
    private java.nio.ByteBuffer outputBuffer;
    private boolean pendingAudioSessionIdChangeConfirmation;
    private androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration pendingConfiguration;
    private androidx.media3.common.PlaybackParameters playbackParameters;
    private androidx.media3.exoplayer.analytics.PlayerId playerId;
    private boolean playing;
    private final boolean preferAudioOutputPlaybackParameters;
    private android.media.AudioDeviceInfo preferredDevice;
    private android.os.Handler reportSkippedSilenceHandler;
    private boolean skipSilenceEnabled;
    private long skippedOutputFrameCountAtLastPosition;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioOutput;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final androidx.media3.exoplayer.audio.ToFloatPcmAudioProcessor toFloatPcmAudioProcessor;
    private final androidx.media3.common.audio.ToInt16PcmAudioProcessor toInt16PcmAudioProcessor;
    private final androidx.media3.exoplayer.audio.TrimmingAudioProcessor trimmingAudioProcessor;
    private boolean tunneling;
    private int virtualDeviceId;
    private float volume;
    private final androidx.media3.exoplayer.audio.DefaultAudioSink.PendingExceptionHolder<androidx.media3.exoplayer.audio.AudioSink.WriteException> writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    public interface AudioOffloadSupportProvider {
        androidx.media3.exoplayer.audio.AudioOffloadSupport getAudioOffloadSupport(androidx.media3.common.Format format, androidx.media3.common.AudioAttributes audioAttributes);
    }

    public final class AudioOutputListener implements androidx.media3.exoplayer.audio.AudioOutput.Listener {
        private final androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig;

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onOffloadDataRequest() {
            if (equals(androidx.media3.exoplayer.audio.DefaultAudioSink.this.audioOutputListener) && androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener != null && androidx.media3.exoplayer.audio.DefaultAudioSink.this.playing) {
                androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener.onOffloadBufferEmptying();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onOffloadPresentationEnded() {
            if (equals(androidx.media3.exoplayer.audio.DefaultAudioSink.this.audioOutputListener) && androidx.media3.exoplayer.audio.DefaultAudioSink.this.stoppedAudioOutput) {
                androidx.media3.exoplayer.audio.DefaultAudioSink.this.handledOffloadOnPresentationEnded = true;
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onPositionAdvancing(long j) {
            if (equals(androidx.media3.exoplayer.audio.DefaultAudioSink.this.audioOutputListener) && androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener != null) {
                androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener.onPositionAdvancing(j);
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onReleased() {
            androidx.media3.exoplayer.audio.DefaultAudioSink.pendingReleaseCount.getAndDecrement();
            if (androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener != null) {
                androidx.media3.exoplayer.audio.AudioSink.Listener listener = androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener;
                androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig = this.outputConfig;
                listener.onAudioTrackReleased(new androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig(outputConfig.encoding, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.isTunneling, outputConfig.isOffload, outputConfig.bufferSize));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioOutput.Listener
        public void onUnderrun() {
            long jSampleCountToDurationUs;
            if (equals(androidx.media3.exoplayer.audio.DefaultAudioSink.this.audioOutputListener) && androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener != null) {
                if (androidx.media3.exoplayer.audio.DefaultAudioSink.this.configuration.outputPcmFrameSize != -1) {
                    long j = androidx.media3.exoplayer.audio.DefaultAudioSink.this.configuration.outputConfig.bufferSize / androidx.media3.exoplayer.audio.DefaultAudioSink.this.configuration.outputPcmFrameSize;
                    androidx.media3.exoplayer.audio.AudioOutput audioOutput = androidx.media3.exoplayer.audio.DefaultAudioSink.this.audioOutput;
                    audioOutput.getClass();
                    jSampleCountToDurationUs = androidx.media3.common.util.Util.sampleCountToDurationUs(j, audioOutput.getSampleRate());
                } else {
                    jSampleCountToDurationUs = androidx.media3.common.C.TIME_UNSET;
                }
                androidx.media3.exoplayer.audio.DefaultAudioSink.this.listener.onUnderrun(androidx.media3.exoplayer.audio.DefaultAudioSink.this.configuration.outputConfig.bufferSize, androidx.media3.common.util.Util.usToMs(jSampleCountToDurationUs), android.os.SystemClock.elapsedRealtime() - androidx.media3.exoplayer.audio.DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }

        private AudioOutputListener(androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig) {
            this.outputConfig = outputConfig;
        }
    }

    @java.lang.Deprecated
    public interface AudioProcessorChain extends androidx.media3.common.audio.AudioProcessorChain {
    }

    public interface AudioTrackBufferSizeProvider {
        public static final androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider DEFAULT = new androidx.media3.exoplayer.audio.DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i3, int i9, int i10, int i11, int i12, int i13, double d4);
    }

    @java.lang.Deprecated
    public interface AudioTrackProvider {
        public static final androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider DEFAULT = new androidx.media3.exoplayer.audio.DefaultAudioTrackProvider();

        android.media.AudioTrack getAudioTrack(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig, androidx.media3.common.AudioAttributes audioAttributes, int i3, android.content.Context context);

        default int getAudioTrackChannelConfig(int i3) {
            return androidx.media3.common.util.Util.getAudioTrackChannelConfig(i3);
        }
    }

    public static final class Configuration {
        private final androidx.media3.common.Format afterProcessingInputFormat;
        private final androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline;
        private final androidx.media3.common.Format inputFormat;
        private final int inputPcmFrameSize;
        private final androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig;
        private final int outputPcmFrameSize;

        /* JADX INFO: Access modifiers changed from: private */
        public androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig buildAudioTrackConfig() {
            androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig = this.outputConfig;
            return new androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig(outputConfig.encoding, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.isTunneling, outputConfig.isOffload, outputConfig.bufferSize);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration copyWithOutputConfig(androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig) {
            return new androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration(this.inputFormat, this.afterProcessingInputFormat, this.inputPcmFrameSize, this.outputPcmFrameSize, outputConfig, this.audioProcessingPipeline);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long framesToDurationUs(long j) {
            return androidx.media3.common.util.Util.sampleCountToDurationUs(j, this.outputConfig.sampleRate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long inputFramesToDurationUs(long j) {
            return androidx.media3.common.util.Util.sampleCountToDurationUs(j, this.inputFormat.sampleRate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isPcm() {
            return java.util.Objects.equals(this.inputFormat.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_RAW);
        }

        private Configuration(androidx.media3.common.Format format, androidx.media3.common.Format format2, int i3, int i9, androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig, androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline) {
            this.inputFormat = format;
            this.afterProcessingInputFormat = format2;
            this.inputPcmFrameSize = i3;
            this.outputPcmFrameSize = i9;
            this.outputConfig = outputConfig;
            this.audioProcessingPipeline = audioProcessingPipeline;
        }
    }

    public static class DefaultAudioProcessorChain implements androidx.media3.exoplayer.audio.DefaultAudioSink.AudioProcessorChain {
        private final androidx.media3.common.audio.AudioProcessor[] audioProcessors;
        private final androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final androidx.media3.common.audio.SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(androidx.media3.common.audio.AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor(), new androidx.media3.common.audio.SonicAudioProcessor());
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public androidx.media3.common.PlaybackParameters applyPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z6) {
            this.silenceSkippingAudioProcessor.setEnabled(z6);
            return z6;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public androidx.media3.common.audio.AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getMediaDuration(long j) {
            return this.sonicAudioProcessor.isActive() ? this.sonicAudioProcessor.getMediaDuration(j) : j;
        }

        @Override // androidx.media3.common.audio.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }

        public DefaultAudioProcessorChain(androidx.media3.common.audio.AudioProcessor[] audioProcessorArr, androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, androidx.media3.common.audio.SonicAudioProcessor sonicAudioProcessor) {
            androidx.media3.common.audio.AudioProcessor[] audioProcessorArr2 = new androidx.media3.common.audio.AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            java.lang.System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }
    }

    public static final class MediaPositionParameters {
        public final long audioOutputPositionUs;
        public long mediaPositionDriftUs;
        public final long mediaTimeUs;
        public final androidx.media3.common.PlaybackParameters playbackParameters;

        private MediaPositionParameters(androidx.media3.common.PlaybackParameters playbackParameters, long j, long j9) {
            this.playbackParameters = playbackParameters;
            this.mediaTimeUs = j;
            this.audioOutputPositionUs = j9;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    public static final class PendingExceptionHolder<T extends java.lang.Exception> {
        private static final int RETRY_DELAY_MS = 50;
        private static final int RETRY_DURATION_MS = 200;
        private T pendingException;
        private long throwDeadlineMs = androidx.media3.common.C.TIME_UNSET;
        private long earliestNextRetryTimeMs = androidx.media3.common.C.TIME_UNSET;

        public void clear() {
            this.pendingException = null;
            this.throwDeadlineMs = androidx.media3.common.C.TIME_UNSET;
            this.earliestNextRetryTimeMs = androidx.media3.common.C.TIME_UNSET;
        }

        public boolean shouldWaitBeforeRetry() {
            if (this.pendingException == null) {
                return false;
            }
            return androidx.media3.exoplayer.audio.DefaultAudioSink.hasPendingAudioOutputReleases() || android.os.SystemClock.elapsedRealtime() < this.earliestNextRetryTimeMs;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void throwExceptionIfDeadlineIsReached(T t9) throws T {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (this.pendingException == null) {
                this.pendingException = t9;
            }
            if (this.throwDeadlineMs == androidx.media3.common.C.TIME_UNSET && !androidx.media3.exoplayer.audio.DefaultAudioSink.hasPendingAudioOutputReleases()) {
                this.throwDeadlineMs = 200 + jElapsedRealtime;
            }
            long j = this.throwDeadlineMs;
            if (j == androidx.media3.common.C.TIME_UNSET || jElapsedRealtime < j) {
                this.earliestNextRetryTimeMs = jElapsedRealtime + 50;
                return;
            }
            T t10 = this.pendingException;
            if (t10 != t9) {
                t10.addSuppressed(t9);
            }
            T t11 = this.pendingException;
            clear();
            throw t11;
        }
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j) {
        androidx.media3.common.PlaybackParameters playbackParametersApplyPlaybackParameters;
        if (useAudioOutputPlaybackParams()) {
            playbackParametersApplyPlaybackParameters = androidx.media3.common.PlaybackParameters.DEFAULT;
        } else {
            playbackParametersApplyPlaybackParameters = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applyPlaybackParameters(this.playbackParameters) : androidx.media3.common.PlaybackParameters.DEFAULT;
            this.playbackParameters = playbackParametersApplyPlaybackParameters;
        }
        androidx.media3.common.PlaybackParameters playbackParameters = playbackParametersApplyPlaybackParameters;
        this.skipSilenceEnabled = shouldApplyAudioProcessorPlaybackParameters() ? this.audioProcessorChain.applySkipSilenceEnabled(this.skipSilenceEnabled) : false;
        this.mediaPositionParametersCheckpoints.add(new androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters(playbackParameters, java.lang.Math.max(0L, j), this.configuration.framesToDurationUs(getWrittenFrames())));
        setupAudioProcessors();
        androidx.media3.exoplayer.audio.AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(this.skipSilenceEnabled);
        }
    }

    private long applyMediaPositionParameters(long j) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j >= this.mediaPositionParametersCheckpoints.getFirst().audioOutputPositionUs) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters = this.mediaPositionParameters;
        long j9 = j - mediaPositionParameters.audioOutputPositionUs;
        long mediaDurationForPlayoutDuration = androidx.media3.common.util.Util.getMediaDurationForPlayoutDuration(j9, mediaPositionParameters.playbackParameters.speed);
        if (!this.mediaPositionParametersCheckpoints.isEmpty()) {
            androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters2 = this.mediaPositionParameters;
            return mediaPositionParameters2.mediaTimeUs + mediaDurationForPlayoutDuration + mediaPositionParameters2.mediaPositionDriftUs;
        }
        long mediaDuration = this.audioProcessorChain.getMediaDuration(j9);
        androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters3 = this.mediaPositionParameters;
        long j10 = mediaPositionParameters3.mediaTimeUs + mediaDuration;
        mediaPositionParameters3.mediaPositionDriftUs = mediaDuration - mediaDurationForPlayoutDuration;
        return j10;
    }

    private long applySkipping(long j) {
        long skippedOutputFrameCount = this.audioProcessorChain.getSkippedOutputFrameCount();
        long jFramesToDurationUs = j + this.configuration.framesToDurationUs(skippedOutputFrameCount);
        long j9 = this.skippedOutputFrameCountAtLastPosition;
        if (skippedOutputFrameCount > j9) {
            long jFramesToDurationUs2 = this.configuration.framesToDurationUs(skippedOutputFrameCount - j9);
            this.skippedOutputFrameCountAtLastPosition = skippedOutputFrameCount;
            handleSkippedSilence(jFramesToDurationUs2);
        }
        return jFramesToDurationUs;
    }

    private androidx.media3.exoplayer.audio.AudioOutput buildAudioOutput(androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig) throws androidx.media3.exoplayer.audio.AudioSink.InitializationException {
        try {
            return this.audioOutputProvider.getAudioOutput(outputConfig);
        } catch (androidx.media3.exoplayer.audio.AudioOutputProvider.InitializationException e6) {
            androidx.media3.exoplayer.audio.AudioSink.InitializationException initializationException = new androidx.media3.exoplayer.audio.AudioSink.InitializationException(0, outputConfig.sampleRate, outputConfig.channelMask, outputConfig.encoding, outputConfig.bufferSize, this.configuration.inputFormat, outputConfig.isOffload, e6);
            androidx.media3.exoplayer.audio.AudioSink.Listener listener = this.listener;
            if (listener == null) {
                throw initializationException;
            }
            listener.onAudioSinkError(initializationException);
            throw initializationException;
        }
    }

    private androidx.media3.exoplayer.audio.AudioOutput buildAudioOutputWithRetry() throws androidx.media3.exoplayer.audio.AudioSink.InitializationException {
        try {
            return buildAudioOutput(this.configuration.outputConfig);
        } catch (androidx.media3.exoplayer.audio.AudioSink.InitializationException e6) {
            int i3 = this.configuration.outputConfig.bufferSize;
            while (i3 > 1000000) {
                i3 /= 2;
                int i9 = this.configuration.outputPcmFrameSize != -1 ? this.configuration.outputPcmFrameSize : 1;
                int i10 = i3 % i9;
                if (i10 != 0) {
                    i3 = (i9 - i10) + i3;
                }
                androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfigBuild = this.configuration.outputConfig.buildUpon().setBufferSize(i3).build();
                try {
                    androidx.media3.exoplayer.audio.AudioOutput audioOutputBuildAudioOutput = buildAudioOutput(outputConfigBuild);
                    this.configuration = this.configuration.copyWithOutputConfig(outputConfigBuild);
                    return audioOutputBuildAudioOutput;
                } catch (androidx.media3.exoplayer.audio.AudioSink.InitializationException e9) {
                    e6.addSuppressed(e9);
                }
            }
            maybeDisableOffload();
            throw e6;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    private void drainOutputBuffer(long j) throws T, androidx.media3.exoplayer.audio.AudioSink.WriteException {
        androidx.media3.exoplayer.audio.AudioSink.Listener listener;
        if (this.outputBuffer == null || this.writeExceptionPendingExceptionHolder.shouldWaitBeforeRetry()) {
            return;
        }
        int iRemaining = this.outputBuffer.remaining();
        boolean z6 = true;
        try {
            boolean zWrite = this.audioOutput.write(this.outputBuffer, this.inputBufferAccessUnitCount, j);
            this.lastFeedElapsedRealtimeMs = android.os.SystemClock.elapsedRealtime();
            this.writeExceptionPendingExceptionHolder.clear();
            if (this.audioOutput.isOffloadedPlayback()) {
                if (this.writtenEncodedFrames > 0) {
                    this.isWaitingForOffloadEndOfStreamHandled = false;
                }
                if (this.playing && (listener = this.listener) != null && !zWrite && !this.isWaitingForOffloadEndOfStreamHandled) {
                    listener.onOffloadBufferFull();
                }
            }
            if (this.configuration.isPcm()) {
                this.writtenPcmBytes += (long) (iRemaining - this.outputBuffer.remaining());
            }
            if (zWrite) {
                if (!this.configuration.isPcm()) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.outputBuffer == this.inputBuffer);
                    this.writtenEncodedFrames = (((long) this.framesPerEncodedSample) * ((long) this.inputBufferAccessUnitCount)) + this.writtenEncodedFrames;
                }
                this.outputBuffer = null;
            }
        } catch (androidx.media3.exoplayer.audio.AudioOutput.WriteException e6) {
            if (!e6.isRecoverable) {
                z6 = false;
            } else if (getWrittenFrames() <= 0) {
                if (this.audioOutput.isOffloadedPlayback()) {
                    maybeDisableOffload();
                } else {
                    z6 = false;
                }
            }
            androidx.media3.exoplayer.audio.AudioSink.WriteException writeException = new androidx.media3.exoplayer.audio.AudioSink.WriteException(e6.errorCode, this.configuration.inputFormat, z6);
            androidx.media3.exoplayer.audio.AudioSink.Listener listener2 = this.listener;
            if (listener2 != null) {
                listener2.onAudioSinkError(writeException);
            }
            if (e6.isRecoverable) {
                throw writeException;
            }
            this.writeExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(writeException);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private boolean drainToEndOfStream() throws T, androidx.media3.exoplayer.audio.AudioSink.WriteException {
        java.nio.ByteBuffer byteBuffer;
        if (!this.audioProcessingPipeline.isOperational()) {
            drainOutputBuffer(Long.MIN_VALUE);
            return this.outputBuffer == null;
        }
        this.audioProcessingPipeline.queueEndOfStream();
        processBuffers(Long.MIN_VALUE);
        return this.audioProcessingPipeline.isEnded() && ((byteBuffer = this.outputBuffer) == null || !byteBuffer.hasRemaining());
    }

    private static int getDeviceIdFromContext(android.content.Context context) {
        return resolveDefaultVirtualDeviceIds(context.getDeviceId());
    }

    private androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig getFormatConfig(androidx.media3.common.Format format) {
        return getFormatConfig(format, -1);
    }

    public static int getFramesPerEncodedSample(int i3, java.nio.ByteBuffer byteBuffer) {
        if (i3 == 20) {
            return androidx.media3.container.OpusUtil.parseOggPacketAudioSampleCount(byteBuffer);
        }
        if (i3 != 30) {
            switch (i3) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int mpegAudioFrameSampleCount = androidx.media3.extractor.MpegAudioUtil.parseMpegAudioFrameSampleCount(androidx.media3.common.util.Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                    if (mpegAudioFrameSampleCount != -1) {
                        return mpegAudioFrameSampleCount;
                    }
                    throw new java.lang.IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i3) {
                        case 14:
                            int iFindTrueHdSyncframeOffset = androidx.media3.extractor.Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                            if (iFindTrueHdSyncframeOffset == -1) {
                                return 0;
                            }
                            return androidx.media3.extractor.Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return androidx.media3.extractor.Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new java.lang.IllegalStateException(com.google.android.gms.internal.play_billing.M0.l(i3, "Unexpected audio encoding: "));
                    }
                    break;
            }
            return androidx.media3.extractor.Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
        }
        return androidx.media3.extractor.DtsUtil.parseDtsAudioSampleCount(byteBuffer);
    }

    private static int getNonPcmMaximumEncodedRateBytesPerSecond(int i3) {
        int maximumEncodedRateBytesPerSecond = androidx.media3.extractor.ExtractorUtil.getMaximumEncodedRateBytesPerSecond(i3);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(maximumEncodedRateBytesPerSecond != -2147483647);
        return maximumEncodedRateBytesPerSecond;
    }

    private long getSubmittedFrames() {
        return this.configuration.isPcm() ? this.submittedPcmBytes / ((long) this.configuration.inputPcmFrameSize) : this.submittedEncodedFrames;
    }

    private long getWrittenFrames() {
        return this.configuration.isPcm() ? androidx.media3.common.util.Util.ceilDivide(this.writtenPcmBytes, this.configuration.outputPcmFrameSize) : this.writtenEncodedFrames;
    }

    private void handleSkippedSilence(long j) {
        this.accumulatedSkippedSilenceDurationUs += j;
        if (this.reportSkippedSilenceHandler == null) {
            this.reportSkippedSilenceHandler = new android.os.Handler(android.os.Looper.myLooper());
        }
        this.reportSkippedSilenceHandler.removeCallbacksAndMessages(null);
        this.reportSkippedSilenceHandler.postDelayed(new androidx.media3.exoplayer.audio.a(2, this), 100L);
    }

    private boolean hasAudioOutputPendingData(long j) {
        long positionUs = this.audioOutput.getPositionUs();
        androidx.media3.exoplayer.audio.AudioOutput audioOutput = this.audioOutput;
        audioOutput.getClass();
        return j > androidx.media3.common.util.Util.durationUsToSampleCount(positionUs, audioOutput.getSampleRate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasPendingAudioOutputReleases() {
        return pendingReleaseCount.get() > 0;
    }

    private boolean initializeAudioOutput() {
        if (this.initializationExceptionPendingExceptionHolder.shouldWaitBeforeRetry()) {
            return false;
        }
        this.audioOutput = buildAudioOutputWithRetry();
        androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOutputListener audioOutputListener = new androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOutputListener(this.configuration.outputConfig);
        this.audioOutputListener = audioOutputListener;
        this.audioOutput.addListener(audioOutputListener);
        androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener = this.audioOffloadListener;
        if (audioOffloadListener != null) {
            audioOffloadListener.onOffloadedPlayback(this.audioOutput.isOffloadedPlayback());
        }
        if (this.audioOutput.isOffloadedPlayback() && this.configuration.outputConfig.useOffloadGapless) {
            this.audioOutput.setOffloadDelayPadding(this.configuration.inputFormat.encoderDelay, this.configuration.inputFormat.encoderPadding);
        }
        androidx.media3.exoplayer.analytics.PlayerId playerId = this.playerId;
        if (playerId != null) {
            this.audioOutput.setPlayerId(playerId);
        }
        setVolumeInternal();
        int i3 = this.auxEffectInfo.effectId;
        if (i3 != 0) {
            this.audioOutput.attachAuxEffect(i3);
            this.audioOutput.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        android.media.AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
        if (audioDeviceInfo != null) {
            this.audioOutput.setPreferredDevice(audioDeviceInfo);
        }
        this.startMediaTimeUsNeedsInit = true;
        int audioSessionId = this.audioOutput.getAudioSessionId();
        boolean z6 = audioSessionId != this.audioSessionId;
        this.audioSessionId = audioSessionId;
        androidx.media3.exoplayer.audio.AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioTrackInitialized(this.configuration.buildAudioTrackConfig());
            if (z6) {
                this.pendingAudioSessionIdChangeConfirmation = true;
                androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration = this.configuration;
                this.configuration = configuration.copyWithOutputConfig(configuration.outputConfig.buildUpon().setAudioSessionId(this.audioSessionId).build());
                androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration2 = this.pendingConfiguration;
                if (configuration2 != null) {
                    this.pendingConfiguration = configuration2.copyWithOutputConfig(configuration2.outputConfig.buildUpon().setAudioSessionId(this.audioSessionId).build());
                }
                this.listener.onAudioSessionIdChanged(this.audioSessionId);
            }
        }
        return true;
    }

    private boolean isAudioOutputInitialized() {
        return this.audioOutput != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeAddAudioOutputProviderListener$0() {
        androidx.media3.exoplayer.audio.AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onAudioCapabilitiesChanged();
        }
    }

    private void maybeAddAudioOutputProviderListener() {
        if (this.audioOutputProviderListener != null || this.context == null) {
            return;
        }
        androidx.media3.exoplayer.audio.AudioOutputProvider.Listener listener = new androidx.media3.exoplayer.audio.AudioOutputProvider.Listener() { // from class: androidx.media3.exoplayer.audio.p
            @Override // androidx.media3.exoplayer.audio.AudioOutputProvider.Listener
            public final void onFormatSupportChanged() {
                this.f16609a.lambda$maybeAddAudioOutputProviderListener$0();
            }
        };
        this.audioOutputProviderListener = listener;
        this.audioOutputProvider.addListener(listener);
    }

    private void maybeDisableOffload() {
        if (this.configuration.outputConfig.isOffload) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private java.nio.ByteBuffer maybeRampUpVolume(java.nio.ByteBuffer byteBuffer) {
        if (this.configuration.isPcm()) {
            int iDurationUsToSampleCount = (int) androidx.media3.common.util.Util.durationUsToSampleCount(androidx.media3.common.util.Util.msToUs(20L), this.configuration.outputConfig.sampleRate);
            long writtenFrames = getWrittenFrames();
            if (writtenFrames < iDurationUsToSampleCount) {
                return androidx.media3.exoplayer.audio.PcmAudioUtil.rampUpVolume(byteBuffer, this.configuration.outputConfig.encoding, this.configuration.outputPcmFrameSize, (int) writtenFrames, iDurationUsToSampleCount);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportSkippedSilence() {
        if (this.accumulatedSkippedSilenceDurationUs >= 300000) {
            this.listener.onSilenceSkipped();
            this.accumulatedSkippedSilenceDurationUs = 0L;
        }
    }

    private void playPendingData() {
        if (this.stoppedAudioOutput) {
            return;
        }
        this.stoppedAudioOutput = true;
        if (this.audioOutput.isOffloadedPlayback()) {
            this.handledOffloadOnPresentationEnded = false;
        }
        this.audioOutput.stop();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private void processBuffers(long j) throws T, androidx.media3.exoplayer.audio.AudioSink.WriteException {
        drainOutputBuffer(j);
        if (this.outputBuffer != null) {
            return;
        }
        if (!this.audioProcessingPipeline.isOperational()) {
            java.nio.ByteBuffer byteBuffer = this.inputBuffer;
            if (byteBuffer != null) {
                setOutputBuffer(byteBuffer);
                drainOutputBuffer(j);
                return;
            }
            return;
        }
        while (!this.audioProcessingPipeline.isEnded()) {
            do {
                java.nio.ByteBuffer output = this.audioProcessingPipeline.getOutput();
                if (output.hasRemaining()) {
                    setOutputBuffer(output);
                    drainOutputBuffer(j);
                } else {
                    java.nio.ByteBuffer byteBuffer2 = this.inputBuffer;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.audioProcessingPipeline.queueInput(this.inputBuffer);
                    }
                }
            } while (this.outputBuffer == null);
            return;
        }
    }

    private void reconfigureAndFlush() {
        if (this.configuration != null) {
            androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            try {
                this.configuration = new androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration(this.configuration.inputFormat, this.configuration.afterProcessingInputFormat, this.configuration.inputPcmFrameSize, this.configuration.outputPcmFrameSize, this.audioOutputProvider.getOutputConfig(getFormatConfig(this.configuration.afterProcessingInputFormat)), this.configuration.audioProcessingPipeline);
            } catch (androidx.media3.exoplayer.audio.AudioOutputProvider.ConfigurationException e6) {
                throw new java.lang.IllegalStateException(new androidx.media3.exoplayer.audio.AudioSink.ConfigurationException(e6, this.configuration.inputFormat));
            }
        }
        flush();
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters(this.playbackParameters, 0L, 0L);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioOutput = false;
        this.handledEndOfStream = false;
        this.handledOffloadOnPresentationEnded = false;
        this.trimmingAudioProcessor.resetTrimmedFrameCount();
        setupAudioProcessors();
    }

    private static int resolveDefaultVirtualDeviceIds(int i3) {
        if (i3 == 0 || i3 == -1) {
            return -1;
        }
        return i3;
    }

    private void setAudioOutputPlaybackParameters() {
        if (isAudioOutputInitialized()) {
            this.audioOutput.setPlaybackParameters(this.playbackParameters);
            this.playbackParameters = this.audioOutput.getPlaybackParameters();
        }
    }

    private void setAudioProcessorPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters mediaPositionParameters = new androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters(playbackParameters, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        if (isAudioOutputInitialized()) {
            this.afterDrainParameters = mediaPositionParameters;
        } else {
            this.mediaPositionParameters = mediaPositionParameters;
        }
    }

    private void setOutputBuffer(java.nio.ByteBuffer byteBuffer) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.outputBuffer == null);
        if (byteBuffer.hasRemaining()) {
            this.outputBuffer = maybeRampUpVolume(byteBuffer);
        }
    }

    private void setVolumeInternal() {
        if (isAudioOutputInitialized()) {
            this.audioOutput.setVolume(this.volume);
        }
    }

    private void setupAudioProcessors() {
        androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline = this.configuration.audioProcessingPipeline;
        this.audioProcessingPipeline = audioProcessingPipeline;
        audioProcessingPipeline.flush();
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        return (this.tunneling || !this.configuration.isPcm() || shouldUseFloatOutput(this.configuration.inputFormat.pcmEncoding)) ? false : true;
    }

    private boolean shouldUseFloatOutput(int i3) {
        return this.enableFloatOutput && androidx.media3.common.util.Util.isEncodingHighResolutionPcm(i3);
    }

    private boolean useAudioOutputPlaybackParams() {
        androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration = this.configuration;
        return configuration != null && configuration.outputConfig.usePlaybackParameters;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(androidx.media3.common.Format format, int i3, int[] iArr) throws androidx.media3.exoplayer.audio.AudioSink.ConfigurationException {
        androidx.media3.common.Format formatBuild;
        int i9;
        androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline;
        int pcmFrameSize;
        maybeAddAudioOutputProviderListener();
        if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(androidx.media3.common.util.Util.isEncodingLinearPcm(format.pcmEncoding));
            int pcmFrameSize2 = androidx.media3.common.util.Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            p076i4.Y y = new p076i4.Y(4);
            y.d(this.availableAudioProcessors);
            if (shouldUseFloatOutput(format.pcmEncoding)) {
                y.c(this.toFloatPcmAudioProcessor);
            } else {
                y.c(this.toInt16PcmAudioProcessor);
                androidx.media3.common.audio.AudioProcessor[] audioProcessors = this.audioProcessorChain.getAudioProcessors();
                int length = audioProcessors.length;
                p076i4.AbstractC2230y.b(audioProcessors, length);
                y.e(length);
                java.lang.System.arraycopy(audioProcessors, 0, y.f22834a, y.f22835b, length);
                y.f22835b += length;
            }
            androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline2 = new androidx.media3.common.audio.AudioProcessingPipeline(y.f());
            if (audioProcessingPipeline2.equals(this.audioProcessingPipeline)) {
                audioProcessingPipeline2 = this.audioProcessingPipeline;
            }
            this.trimmingAudioProcessor.setTrimFrameCount(format.encoderDelay, format.encoderPadding);
            this.channelMappingAudioProcessor.setChannelMap(iArr);
            try {
                androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormatConfigure = audioProcessingPipeline2.configure(new androidx.media3.common.audio.AudioProcessor.AudioFormat(format));
                formatBuild = format.buildUpon().setPcmEncoding(audioFormatConfigure.encoding).setSampleRate(audioFormatConfigure.sampleRate).setChannelCount(audioFormatConfigure.channelCount).build();
                audioProcessingPipeline = audioProcessingPipeline2;
                pcmFrameSize = androidx.media3.common.util.Util.getPcmFrameSize(audioFormatConfigure.encoding, audioFormatConfigure.channelCount);
                i9 = pcmFrameSize2;
            } catch (androidx.media3.common.audio.AudioProcessor.UnhandledAudioFormatException e6) {
                throw new androidx.media3.exoplayer.audio.AudioSink.ConfigurationException(e6, format);
            }
        } else {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            formatBuild = format;
            i9 = -1;
            audioProcessingPipeline = new androidx.media3.common.audio.AudioProcessingPipeline(p076i4.S0.f22832l);
            pcmFrameSize = -1;
        }
        androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig formatConfig = getFormatConfig(formatBuild, i3 != 0 ? i3 : -1);
        try {
            androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig = this.audioOutputProvider.getOutputConfig(formatConfig);
            if (outputConfig.encoding == 0) {
                throw new androidx.media3.exoplayer.audio.AudioSink.ConfigurationException(com.google.android.gms.internal.play_billing.M0.o(new java.lang.StringBuilder("Invalid output encoding (isOffload="), outputConfig.isOffload, ")"), formatConfig.format);
            }
            if (outputConfig.channelMask == 0) {
                throw new androidx.media3.exoplayer.audio.AudioSink.ConfigurationException(com.google.android.gms.internal.play_billing.M0.o(new java.lang.StringBuilder("Invalid output channel config (isOffload="), outputConfig.isOffload, ")"), formatConfig.format);
            }
            this.offloadDisabledUntilNextConfiguration = false;
            androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration = new androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration(format, formatBuild, i9, pcmFrameSize, outputConfig, audioProcessingPipeline);
            if (isAudioOutputInitialized()) {
                this.pendingConfiguration = configuration;
            } else {
                this.configuration = configuration;
            }
        } catch (androidx.media3.exoplayer.audio.AudioOutputProvider.ConfigurationException e9) {
            throw new androidx.media3.exoplayer.audio.AudioSink.ConfigurationException(e9, format);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            reconfigureAndFlush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        if (isAudioOutputInitialized()) {
            resetSinkStateForFlush();
            this.audioOutputListener = null;
            androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration = this.pendingConfiguration;
            if (configuration != null) {
                this.configuration = configuration;
                this.pendingConfiguration = null;
            }
            pendingReleaseCount.incrementAndGet();
            this.audioOutput.release();
            this.audioOutput = null;
        }
        this.writeExceptionPendingExceptionHolder.clear();
        this.initializationExceptionPendingExceptionHolder.clear();
        this.skippedOutputFrameCountAtLastPosition = 0L;
        this.accumulatedSkippedSilenceDurationUs = 0L;
        android.os.Handler handler = this.reportSkippedSilenceHandler;
        if (handler != null) {
            handler.getClass();
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.common.AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.AudioCapabilities getAudioCapabilities() {
        androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider = this.audioOutputProvider;
        if (audioOutputProvider instanceof androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider) {
            return ((androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider) audioOutputProvider).getAudioCapabilities();
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getAudioTrackBufferSizeUs() {
        if (isAudioOutputInitialized()) {
            return this.configuration.isPcm() ? this.configuration.framesToDurationUs(this.audioOutput.getBufferSizeInFrames()) : androidx.media3.common.util.Util.scaleLargeValue(this.audioOutput.getBufferSizeInFrames(), 1000000L, getNonPcmMaximumEncodedRateBytesPerSecond(this.configuration.outputConfig.encoding), java.math.RoundingMode.DOWN);
        }
        return androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z6) {
        if (!isAudioOutputInitialized() || this.startMediaTimeUsNeedsInit) {
            return Long.MIN_VALUE;
        }
        return applySkipping(applyMediaPositionParameters(java.lang.Math.min(this.audioOutput.getPositionUs(), this.configuration.framesToDurationUs(getWrittenFrames()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.AudioOffloadSupport getFormatOffloadSupport(androidx.media3.common.Format format) {
        if (this.offloadDisabledUntilNextConfiguration) {
            return androidx.media3.exoplayer.audio.AudioOffloadSupport.DEFAULT_UNSUPPORTED;
        }
        androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport formatSupport = this.audioOutputProvider.getFormatSupport(getFormatConfig(format));
        return new androidx.media3.exoplayer.audio.AudioOffloadSupport.Builder().setIsFormatSupported(formatSupport.isFormatSupportedForOffload).setIsGaplessSupported(formatSupport.isGaplessSupportedForOffload).setIsSpeedChangeSupported(formatSupport.isSpeedChangeSupportedForOffload).build();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(androidx.media3.common.Format format) {
        boolean z6;
        if (androidx.media3.common.util.Util.isEncodingLinearPcm(format.pcmEncoding)) {
            boolean zShouldUseFloatOutput = shouldUseFloatOutput(format.pcmEncoding);
            if (!zShouldUseFloatOutput || format.pcmEncoding == 4) {
                z6 = false;
            } else {
                format = format.buildUpon().setPcmEncoding(4).build();
                z6 = true;
            }
            if (!zShouldUseFloatOutput && format.pcmEncoding != 2) {
                format = format.buildUpon().setPcmEncoding(2).build();
                z6 = true;
            }
        } else {
            z6 = false;
        }
        int i3 = this.audioOutputProvider.getFormatSupport(getFormatConfig(format)).supportLevel;
        if (i3 == 1) {
            return 1;
        }
        if (i3 != 2) {
            return 0;
        }
        return z6 ? 1 : 2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.skipSilenceEnabled;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(java.nio.ByteBuffer byteBuffer, long j, int i3) throws T, androidx.media3.exoplayer.audio.AudioSink.WriteException, androidx.media3.exoplayer.audio.AudioSink.InitializationException {
        java.nio.ByteBuffer byteBuffer2 = this.inputBuffer;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            androidx.media3.exoplayer.audio.AudioOutput audioOutput = this.audioOutput;
            if (audioOutput == null || audioOutput.canReuseAudioOutput(this.configuration.outputConfig, getFormatConfig(this.pendingConfiguration.afterProcessingInputFormat), this.pendingConfiguration.outputConfig)) {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                androidx.media3.exoplayer.audio.AudioOutput audioOutput2 = this.audioOutput;
                if (audioOutput2 != null && audioOutput2.isOffloadedPlayback() && this.configuration.outputConfig.useOffloadGapless) {
                    this.audioOutput.setOffloadEndOfStream();
                    this.audioOutput.setOffloadDelayPadding(this.configuration.inputFormat.encoderDelay, this.configuration.inputFormat.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            } else {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
        }
        if (!isAudioOutputInitialized()) {
            try {
                if (!initializeAudioOutput()) {
                    return false;
                }
            } catch (androidx.media3.exoplayer.audio.AudioSink.InitializationException e6) {
                if (e6.isRecoverable) {
                    throw e6;
                }
                this.initializationExceptionPendingExceptionHolder.throwExceptionIfDeadlineIsReached(e6);
                return false;
            }
        }
        this.initializationExceptionPendingExceptionHolder.clear();
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = java.lang.Math.max(0L, j);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (useAudioOutputPlaybackParams()) {
                setAudioOutputPlaybackParameters();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j);
            if (this.playing) {
                play();
            }
        }
        if (this.inputBuffer == null) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(byteBuffer.order() == java.nio.ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.configuration.isPcm() && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(this.configuration.outputConfig.encoding, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainParameters != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                this.afterDrainParameters = null;
            }
            long jInputFramesToDurationUs = this.startMediaTimeUs + this.configuration.inputFramesToDurationUs(getSubmittedFrames() - this.trimmingAudioProcessor.getTrimmedFrameCount());
            if (!this.startMediaTimeUsNeedsSync && java.lang.Math.abs(jInputFramesToDurationUs - j) > 200000) {
                androidx.media3.exoplayer.audio.AudioSink.Listener listener = this.listener;
                if (listener != null) {
                    listener.onAudioSinkError(new androidx.media3.exoplayer.audio.AudioSink.UnexpectedDiscontinuityException(j, jInputFramesToDurationUs));
                }
                this.startMediaTimeUsNeedsSync = true;
            }
            if (this.startMediaTimeUsNeedsSync) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j9 = j - jInputFramesToDurationUs;
                this.startMediaTimeUs += j9;
                this.startMediaTimeUsNeedsSync = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j);
                androidx.media3.exoplayer.audio.AudioSink.Listener listener2 = this.listener;
                if (listener2 != null && j9 != 0) {
                    listener2.onPositionDiscontinuity();
                }
            }
            if (this.configuration.isPcm()) {
                this.submittedPcmBytes += (long) byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames = (((long) this.framesPerEncodedSample) * ((long) i3)) + this.submittedEncodedFrames;
            }
            this.inputBuffer = byteBuffer;
            this.inputBufferAccessUnitCount = i3;
        }
        processBuffers(j);
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            return true;
        }
        if (!this.audioOutput.isStalled()) {
            return false;
        }
        androidx.media3.common.util.Log.w(TAG, "Resetting stalled audio output");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        if (isAudioOutputInitialized()) {
            return !(android.os.Build.VERSION.SDK_INT >= 29 && this.audioOutput.isOffloadedPlayback() && this.handledOffloadOnPresentationEnded) && hasAudioOutputPendingData(getWrittenFrames());
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        if (isAudioOutputInitialized()) {
            return this.handledEndOfStream && !hasPendingData();
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioOutputInitialized()) {
            this.audioOutput.pause();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioOutputInitialized()) {
            this.audioOutput.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() {
        if (!this.handledEndOfStream && isAudioOutputInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        this.audioOutputProvider.release();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        flush();
        p076i4.Z zW = this.availableAudioProcessors.listIterator(0);
        while (zW.hasNext()) {
            ((androidx.media3.common.audio.AudioProcessor) zW.next()).reset();
        }
        this.toInt16PcmAudioProcessor.reset();
        this.toFloatPcmAudioProcessor.reset();
        androidx.media3.common.audio.AudioProcessingPipeline audioProcessingPipeline = this.audioProcessingPipeline;
        if (audioProcessingPipeline != null) {
            audioProcessingPipeline.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioOutputProvider(androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider) {
        if (audioOutputProvider.equals(this.audioOutputProvider)) {
            return;
        }
        this.audioOutputProvider.release();
        this.audioOutputProvider = audioOutputProvider;
        androidx.media3.exoplayer.audio.AudioOutputProvider.Listener listener = this.audioOutputProviderListener;
        if (listener != null) {
            audioOutputProvider.addListener(listener);
        }
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i3) {
        if (this.pendingAudioSessionIdChangeConfirmation) {
            if (this.audioSessionId != i3) {
                return;
            } else {
                this.pendingAudioSessionIdChangeConfirmation = false;
            }
        }
        if (this.audioSessionId != i3) {
            this.audioSessionId = i3;
            this.externalAudioSessionIdProvided = i3 != 0;
            reconfigureAndFlush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(androidx.media3.common.AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i3 = auxEffectInfo.effectId;
        float f9 = auxEffectInfo.sendLevel;
        androidx.media3.exoplayer.audio.AudioOutput audioOutput = this.audioOutput;
        if (audioOutput != null) {
            if (this.auxEffectInfo.effectId != i3) {
                audioOutput.attachAuxEffect(i3);
            }
            if (i3 != 0) {
                this.audioOutput.setAuxEffectSendLevel(f9);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setClock(androidx.media3.common.util.Clock clock) {
        this.audioOutputProvider.setClock(clock);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(androidx.media3.exoplayer.audio.AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadDelayPadding(int i3, int i9) {
        androidx.media3.exoplayer.audio.DefaultAudioSink.Configuration configuration;
        androidx.media3.exoplayer.audio.AudioOutput audioOutput = this.audioOutput;
        if (audioOutput == null || !audioOutput.isOffloadedPlayback() || (configuration = this.configuration) == null || !configuration.outputConfig.useOffloadGapless) {
            return;
        }
        this.audioOutput.setOffloadDelayPadding(i3, i9);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOffloadMode(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(android.os.Build.VERSION.SDK_INT >= 29);
        this.offloadMode = i3;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        if (useAudioOutputPlaybackParams()) {
            this.playbackParameters = playbackParameters;
            setAudioOutputPlaybackParameters();
        } else {
            androidx.media3.common.PlaybackParameters playbackParameters2 = new androidx.media3.common.PlaybackParameters(androidx.media3.common.util.Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), androidx.media3.common.util.Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
            this.playbackParameters = playbackParameters2;
            setAudioProcessorPlaybackParameters(playbackParameters2);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlayerId(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.preferredDevice = audioDeviceInfo;
        androidx.media3.exoplayer.audio.AudioOutput audioOutput = this.audioOutput;
        if (audioOutput != null) {
            audioOutput.setPreferredDevice(audioDeviceInfo);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z6) {
        this.skipSilenceEnabled = z6;
        setAudioProcessorPlaybackParameters(useAudioOutputPlaybackParams() ? androidx.media3.common.PlaybackParameters.DEFAULT : this.playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVirtualDeviceId(int i3) {
        int iResolveDefaultVirtualDeviceIds = resolveDefaultVirtualDeviceIds(i3);
        if (this.virtualDeviceId == iResolveDefaultVirtualDeviceIds) {
            return;
        }
        this.virtualDeviceId = iResolveDefaultVirtualDeviceIds;
        reconfigureAndFlush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f9) {
        if (this.volume != f9) {
            this.volume = f9;
            setVolumeInternal();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(androidx.media3.common.Format format) {
        return getFormatSupport(format) != 0;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.audioProcessorChain"})
    private DefaultAudioSink(androidx.media3.exoplayer.audio.DefaultAudioSink.Builder builder) {
        this.context = builder.context == null ? null : builder.context.getApplicationContext();
        this.audioAttributes = androidx.media3.common.AudioAttributes.DEFAULT;
        this.audioProcessorChain = builder.audioProcessorChain;
        this.enableFloatOutput = builder.enableFloatOutput;
        this.preferAudioOutputPlaybackParameters = builder.enableAudioOutputPlaybackParameters;
        this.offloadMode = 0;
        this.audioOutputProvider = builder.audioOutputProvider;
        androidx.media3.exoplayer.audio.ChannelMappingAudioProcessor channelMappingAudioProcessor = new androidx.media3.exoplayer.audio.ChannelMappingAudioProcessor();
        this.channelMappingAudioProcessor = channelMappingAudioProcessor;
        androidx.media3.exoplayer.audio.TrimmingAudioProcessor trimmingAudioProcessor = new androidx.media3.exoplayer.audio.TrimmingAudioProcessor();
        this.trimmingAudioProcessor = trimmingAudioProcessor;
        this.toInt16PcmAudioProcessor = new androidx.media3.common.audio.ToInt16PcmAudioProcessor();
        this.toFloatPcmAudioProcessor = new androidx.media3.exoplayer.audio.ToFloatPcmAudioProcessor();
        this.availableAudioProcessors = p076i4.AbstractC2186b0.z(trimmingAudioProcessor, channelMappingAudioProcessor);
        this.volume = 1.0f;
        this.audioSessionId = 0;
        this.auxEffectInfo = new androidx.media3.common.AuxEffectInfo(0, 0.0f);
        androidx.media3.common.PlaybackParameters playbackParameters = androidx.media3.common.PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new androidx.media3.exoplayer.audio.DefaultAudioSink.MediaPositionParameters(playbackParameters, 0L, 0L);
        this.playbackParameters = playbackParameters;
        this.skipSilenceEnabled = false;
        this.mediaPositionParametersCheckpoints = new java.util.ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new androidx.media3.exoplayer.audio.DefaultAudioSink.PendingExceptionHolder<>();
        this.writeExceptionPendingExceptionHolder = new androidx.media3.exoplayer.audio.DefaultAudioSink.PendingExceptionHolder<>();
        this.audioOffloadListener = builder.audioOffloadListener;
        this.virtualDeviceId = (android.os.Build.VERSION.SDK_INT < 34 || builder.context == null) ? -1 : getDeviceIdFromContext(builder.context);
    }

    private androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig getFormatConfig(androidx.media3.common.Format format, int i3) {
        return new androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder(format).setAudioAttributes(this.audioAttributes).setEnableHighResolutionPcmOutput(this.enableFloatOutput).setEnablePlaybackParameters(this.preferAudioOutputPlaybackParameters).setEnableOffload(this.offloadMode != 0).setPreferredDevice(this.preferredDevice).setAudioSessionId(this.audioSessionId).setEnableTunneling(this.tunneling).setPreferredBufferSize(i3).setVirtualDeviceId(this.virtualDeviceId).build();
    }

    public static final class Builder {
        private androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities;
        private androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener;
        private androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider;
        private androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider;
        private androidx.media3.common.audio.AudioProcessorChain audioProcessorChain;
        private androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider;
        private androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider audioTrackProvider;
        private boolean buildCalled;
        private final android.content.Context context;
        private boolean enableAudioOutputPlaybackParameters;
        private boolean enableFloatOutput;

        @java.lang.Deprecated
        public Builder() {
            this.context = null;
            this.audioCapabilities = androidx.media3.exoplayer.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink build() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
            this.buildCalled = true;
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new androidx.media3.exoplayer.audio.DefaultAudioSink.DefaultAudioProcessorChain(new androidx.media3.common.audio.AudioProcessor[0]);
            }
            if (this.audioOutputProvider == null) {
                if (this.audioOffloadSupportProvider == null) {
                    this.audioOffloadSupportProvider = new androidx.media3.exoplayer.audio.DefaultAudioOffloadSupportProvider(this.context);
                }
                if (this.audioTrackBufferSizeProvider == null) {
                    this.audioTrackBufferSizeProvider = androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider.DEFAULT;
                }
                this.audioOutputProvider = new androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider.Builder(this.context).setAudioCapabilities(this.context != null ? null : this.audioCapabilities).setAudioOffloadSupportProvider(this.audioOffloadSupportProvider).setAudioTrackBufferSizeProvider(this.audioTrackBufferSizeProvider).setAudioTrackProvider(this.audioTrackProvider).build();
            } else {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.audioOffloadSupportProvider == null);
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.audioTrackBufferSizeProvider == null);
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.audioTrackProvider == null);
            }
            return new androidx.media3.exoplayer.audio.DefaultAudioSink(this);
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioCapabilities(androidx.media3.exoplayer.audio.AudioCapabilities audioCapabilities) {
            audioCapabilities.getClass();
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioOffloadSupportProvider(androidx.media3.exoplayer.audio.DefaultAudioSink.AudioOffloadSupportProvider audioOffloadSupportProvider) {
            this.audioOffloadSupportProvider = audioOffloadSupportProvider;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioOutputProvider(androidx.media3.exoplayer.audio.AudioOutputProvider audioOutputProvider) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Z(this.context != null, "Cannot set AudioOutputProvider without a Context");
            this.audioOutputProvider = audioOutputProvider;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioProcessorChain(androidx.media3.common.audio.AudioProcessorChain audioProcessorChain) {
            audioProcessorChain.getClass();
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioProcessors(androidx.media3.common.audio.AudioProcessor[] audioProcessorArr) {
            audioProcessorArr.getClass();
            return setAudioProcessorChain(new androidx.media3.exoplayer.audio.DefaultAudioSink.DefaultAudioProcessorChain(audioProcessorArr));
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioTrackBufferSizeProvider(androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider audioTrackBufferSizeProvider) {
            this.audioTrackBufferSizeProvider = audioTrackBufferSizeProvider;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setAudioTrackProvider(androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider audioTrackProvider) {
            this.audioTrackProvider = audioTrackProvider;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setEnableAudioOutputPlaybackParameters(boolean z6) {
            this.enableAudioOutputPlaybackParameters = z6;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setEnableAudioTrackPlaybackParams(boolean z6) {
            return setEnableAudioOutputPlaybackParameters(z6);
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setEnableFloatOutput(boolean z6) {
            this.enableFloatOutput = z6;
            return this;
        }

        public androidx.media3.exoplayer.audio.DefaultAudioSink.Builder setExperimentalAudioOffloadListener(androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener audioOffloadListener) {
            this.audioOffloadListener = audioOffloadListener;
            return this;
        }

        public Builder(android.content.Context context) {
            this.context = context;
            this.audioCapabilities = androidx.media3.exoplayer.audio.AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        }
    }
}
