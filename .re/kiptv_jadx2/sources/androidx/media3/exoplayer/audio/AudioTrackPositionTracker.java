package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.os.Build;
import androidx.media3.common.C;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import java.lang.reflect.Method;

final class AudioTrackPositionTracker {
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final long MAX_LATENCY_US = 10000000;
    private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
    private static final long MAX_POSITION_DRIFT_FOR_SMOOTHING_US = 1000000;
    private static final int MAX_POSITION_SMOOTHING_SPEED_CHANGE_PERCENT = 10;
    private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
    private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
    private static final long RAW_PLAYBACK_HEAD_POSITION_UPDATE_INTERVAL_MS = 5;
    private AudioTimestampPoller audioTimestampPoller;
    private final AudioTrack audioTrack;
    private float audioTrackPlaybackSpeed;
    private final long bufferSizeUs;
    private final Clock clock;
    private long endPlaybackHeadPosition;
    private boolean expectRawPlaybackHeadReset;
    private long forceResetWorkaroundTimeMs;
    private Method getLatencyMethod;
    private final boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastPositionUs;
    private long lastRawPlaybackHeadPositionSampleTimeMs;
    private long lastSystemTimeUs;
    private long latencyUs;
    private final Listener listener;
    private int nextPlayheadOffsetIndex;
    private long onPositionAdvancingFromPositionUs;
    private final int outputSampleRate;
    private int playheadOffsetCount;
    private final long[] playheadOffsets;
    private long rawPlaybackHeadPosition;
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;
    private long sumRawPlaybackHeadPosition;

    public interface Listener {
        void onInvalidLatency(long j);

        void onPositionAdvancing(long j);

        void onPositionFramesMismatch(long j, long j9, long j10, long j11);

        void onSystemTimeUsMismatch(long j, long j9, long j10, long j11);
    }

    public AudioTrackPositionTracker(Listener listener, Clock clock, AudioTrack audioTrack, int i3, int i9, int i10) {
        listener.getClass();
        this.listener = listener;
        this.clock = clock;
        this.audioTrack = audioTrack;
        try {
            this.getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.playheadOffsets = new long[10];
        this.lastSystemTimeUs = C.TIME_UNSET;
        this.lastPositionUs = C.TIME_UNSET;
        this.audioTimestampPoller = new AudioTimestampPoller(audioTrack, listener);
        int sampleRate = audioTrack.getSampleRate();
        this.outputSampleRate = sampleRate;
        boolean zIsEncodingLinearPcm = Util.isEncodingLinearPcm(i3);
        this.isOutputPcm = zIsEncodingLinearPcm;
        this.bufferSizeUs = zIsEncodingLinearPcm ? Util.sampleCountToDurationUs(i10 / i9, sampleRate) : -9223372036854775807L;
        this.rawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.expectRawPlaybackHeadReset = false;
        this.sumRawPlaybackHeadPosition = 0L;
        this.stopTimestampUs = C.TIME_UNSET;
        this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        this.lastLatencySampleTimeUs = 0L;
        this.latencyUs = 0L;
        this.audioTrackPlaybackSpeed = 1.0f;
        this.onPositionAdvancingFromPositionUs = C.TIME_UNSET;
    }

    private long getPlaybackHeadPosition() {
        if (this.stopTimestampUs != C.TIME_UNSET) {
            return Math.min(this.endPlaybackHeadPosition, getSimulatedPlaybackHeadPositionAfterStop());
        }
        long jElapsedRealtime = this.clock.elapsedRealtime();
        if (jElapsedRealtime - this.lastRawPlaybackHeadPositionSampleTimeMs >= 5) {
            updateRawPlaybackHeadPosition(jElapsedRealtime);
            this.lastRawPlaybackHeadPositionSampleTimeMs = jElapsedRealtime;
        }
        return this.rawPlaybackHeadPosition + this.sumRawPlaybackHeadPosition + (this.rawPlaybackHeadWrapCount << 32);
    }

    private long getPlaybackHeadPositionEstimateUs(long j) {
        long mediaDurationForPlayoutDuration;
        if (this.playheadOffsetCount == 0) {
            mediaDurationForPlayoutDuration = this.stopTimestampUs != C.TIME_UNSET ? Util.sampleCountToDurationUs(getSimulatedPlaybackHeadPositionAfterStop(), this.outputSampleRate) : getPlaybackHeadPositionUs();
        } else {
            mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(j + this.smoothedPlayheadOffsetUs, this.audioTrackPlaybackSpeed);
        }
        long jMax = Math.max(0L, mediaDurationForPlayoutDuration - this.latencyUs);
        return this.stopTimestampUs != C.TIME_UNSET ? Math.min(Util.sampleCountToDurationUs(this.endPlaybackHeadPosition, this.outputSampleRate), jMax) : jMax;
    }

    private long getPlaybackHeadPositionUs() {
        return Util.sampleCountToDurationUs(getPlaybackHeadPosition(), this.outputSampleRate);
    }

    private long getSimulatedPlaybackHeadPositionAfterStop() {
        AudioTrack audioTrack = this.audioTrack;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.stopPlaybackHeadPosition;
        }
        return this.stopPlaybackHeadPosition + Util.durationUsToSampleCount(Util.getMediaDurationForPlayoutDuration(Util.msToUs(this.clock.elapsedRealtime()) - this.stopTimestampUs, this.audioTrackPlaybackSpeed), this.outputSampleRate);
    }

    private void maybeSampleSyncParams() {
        long jNanoTime = this.clock.nanoTime() / 1000;
        if (jNanoTime - this.lastPlayheadSampleTimeUs >= 30000) {
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (playbackHeadPositionUs != 0) {
                this.playheadOffsets[this.nextPlayheadOffsetIndex] = Util.getPlayoutDurationForMediaDuration(playbackHeadPositionUs, this.audioTrackPlaybackSpeed) - jNanoTime;
                this.nextPlayheadOffsetIndex = (this.nextPlayheadOffsetIndex + 1) % 10;
                int i3 = this.playheadOffsetCount;
                if (i3 < 10) {
                    this.playheadOffsetCount = i3 + 1;
                }
                this.lastPlayheadSampleTimeUs = jNanoTime;
                this.smoothedPlayheadOffsetUs = 0L;
                int i9 = 0;
                while (true) {
                    int i10 = this.playheadOffsetCount;
                    if (i9 >= i10) {
                        break;
                    }
                    this.smoothedPlayheadOffsetUs = (this.playheadOffsets[i9] / ((long) i10)) + this.smoothedPlayheadOffsetUs;
                    i9++;
                }
            } else {
                return;
            }
        }
        this.audioTimestampPoller.maybePollTimestamp(jNanoTime, this.audioTrackPlaybackSpeed, getPlaybackHeadPositionEstimateUs(jNanoTime), maybeUpdateLatency(jNanoTime));
    }

    private void maybeTriggerOnPositionAdvancingCallback(long j) {
        long j9 = this.onPositionAdvancingFromPositionUs;
        if (j9 == C.TIME_UNSET || j < j9) {
            return;
        }
        long jCurrentTimeMillis = this.clock.currentTimeMillis() - Util.usToMs(Util.getPlayoutDurationForMediaDuration(j - j9, this.audioTrackPlaybackSpeed));
        this.onPositionAdvancingFromPositionUs = C.TIME_UNSET;
        this.listener.onPositionAdvancing(jCurrentTimeMillis);
    }

    private boolean maybeUpdateLatency(long j) {
        Method method;
        long j9 = this.latencyUs;
        if (this.isOutputPcm && (method = this.getLatencyMethod) != null && j - this.lastLatencySampleTimeUs >= 500000) {
            try {
                AudioTrack audioTrack = this.audioTrack;
                audioTrack.getClass();
                long jIntValue = (((long) ((Integer) Util.castNonNull((Integer) method.invoke(audioTrack, null))).intValue()) * 1000) - this.bufferSizeUs;
                this.latencyUs = jIntValue;
                long jMax = Math.max(jIntValue, 0L);
                this.latencyUs = jMax;
                if (jMax > MAX_LATENCY_US) {
                    this.listener.onInvalidLatency(jMax);
                    this.latencyUs = 0L;
                }
            } catch (Exception unused) {
                this.getLatencyMethod = null;
            }
            this.lastLatencySampleTimeUs = j;
        }
        return j9 != this.latencyUs;
    }

    private void resetSyncParams() {
        this.smoothedPlayheadOffsetUs = 0L;
        this.playheadOffsetCount = 0;
        this.nextPlayheadOffsetIndex = 0;
        this.lastPlayheadSampleTimeUs = 0L;
        this.lastPositionUs = C.TIME_UNSET;
        this.lastSystemTimeUs = C.TIME_UNSET;
    }

    private void updateRawPlaybackHeadPosition(long j) {
        AudioTrack audioTrack = this.audioTrack;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (Build.VERSION.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.rawPlaybackHeadPosition > 0 && playState == 3) {
                if (this.forceResetWorkaroundTimeMs == C.TIME_UNSET) {
                    this.forceResetWorkaroundTimeMs = j;
                    return;
                }
                return;
            }
            this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        }
        long j9 = this.rawPlaybackHeadPosition;
        if (j9 > playbackHeadPosition) {
            if (this.expectRawPlaybackHeadReset) {
                this.sumRawPlaybackHeadPosition += j9;
                this.expectRawPlaybackHeadReset = false;
            } else {
                this.rawPlaybackHeadWrapCount++;
            }
        }
        this.rawPlaybackHeadPosition = playbackHeadPosition;
    }

    public void expectRawPlaybackHeadReset() {
        this.expectRawPlaybackHeadReset = true;
        this.audioTimestampPoller.expectTimestampFramePositionReset();
    }

    public long getCurrentPositionUs() {
        AudioTrack audioTrack = this.audioTrack;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            maybeSampleSyncParams();
        }
        long jNanoTime = this.clock.nanoTime() / 1000;
        boolean zHasAdvancingTimestamp = this.audioTimestampPoller.hasAdvancingTimestamp();
        long timestampPositionUs = zHasAdvancingTimestamp ? this.audioTimestampPoller.getTimestampPositionUs(jNanoTime, this.audioTrackPlaybackSpeed) : getPlaybackHeadPositionEstimateUs(jNanoTime);
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState == 1) {
                maybeTriggerOnPositionAdvancingCallback(timestampPositionUs);
            }
            return timestampPositionUs;
        }
        if (zHasAdvancingTimestamp || !this.audioTimestampPoller.isWaitingForAdvancingTimestamp()) {
            maybeTriggerOnPositionAdvancingCallback(timestampPositionUs);
        }
        long j = this.lastSystemTimeUs;
        if (j != C.TIME_UNSET) {
            long j9 = timestampPositionUs - this.lastPositionUs;
            long mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(jNanoTime - j, this.audioTrackPlaybackSpeed);
            long j10 = this.lastPositionUs + mediaDurationForPlayoutDuration;
            long jAbs = Math.abs(j10 - timestampPositionUs);
            if (j9 != 0 && jAbs < 1000000) {
                long j11 = (mediaDurationForPlayoutDuration * 10) / 100;
                timestampPositionUs = Util.constrainValue(timestampPositionUs, j10 - j11, j10 + j11);
            }
        }
        this.lastSystemTimeUs = jNanoTime;
        this.lastPositionUs = timestampPositionUs;
        return timestampPositionUs;
    }

    public void handleEndOfStream(long j) {
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        this.stopTimestampUs = Util.msToUs(this.clock.elapsedRealtime());
        this.endPlaybackHeadPosition = j;
    }

    public boolean isPlaying() {
        AudioTrack audioTrack = this.audioTrack;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public boolean isStalled(long j) {
        return this.forceResetWorkaroundTimeMs != C.TIME_UNSET && j > 0 && this.clock.elapsedRealtime() - this.forceResetWorkaroundTimeMs >= FORCE_RESET_WORKAROUND_TIMEOUT_MS;
    }

    public void pause() {
        resetSyncParams();
        if (this.stopTimestampUs == C.TIME_UNSET) {
            this.audioTimestampPoller.reset();
        }
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
    }

    public void reset() {
        resetSyncParams();
        this.audioTimestampPoller = new AudioTimestampPoller(this.audioTrack, this.listener);
        this.rawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.expectRawPlaybackHeadReset = false;
        this.sumRawPlaybackHeadPosition = 0L;
        this.stopTimestampUs = C.TIME_UNSET;
        this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        this.lastLatencySampleTimeUs = 0L;
        this.latencyUs = 0L;
        this.audioTrackPlaybackSpeed = 1.0f;
        this.onPositionAdvancingFromPositionUs = C.TIME_UNSET;
    }

    public void setAudioTrackPlaybackSpeed(float f9) {
        this.audioTrackPlaybackSpeed = f9;
        this.audioTimestampPoller.reset();
        resetSyncParams();
    }

    public void start() {
        if (this.stopTimestampUs != C.TIME_UNSET) {
            this.stopTimestampUs = Util.msToUs(this.clock.elapsedRealtime());
        }
        this.onPositionAdvancingFromPositionUs = getPlaybackHeadPositionUs();
        this.audioTimestampPoller.reset();
    }
}
