package androidx.media3.exoplayer.analytics;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import java.util.Collections;
import java.util.List;

public final class PlaybackStats {
    public static final PlaybackStats EMPTY = merge(new PlaybackStats[0]);
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
            this.eventTime = eventTime;
            this.exception = exc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public int hashCode() {
            return this.exception.hashCode() + (this.eventTime.hashCode() * 31);
        }
    }

    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;
        public final Format format;

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, Format format) {
            this.eventTime = eventTime;
            this.format = format;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTimeAndFormat.class == obj.getClass()) {
                EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
                if (!this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                    return false;
                }
                Format format = this.format;
                Format format2 = eventTimeAndFormat.format;
                if (format != null) {
                    return format.equals(format2);
                }
                if (format2 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.eventTime.hashCode() * 31;
            Format format = this.format;
            return iHashCode + (format != null ? format.hashCode() : 0);
        }
    }

    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i3) {
            this.eventTime = eventTime;
            this.playbackState = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }
    }

    public PlaybackStats(int i3, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j, int i9, int i10, int i11, int i12, long j9, int i13, int i14, int i15, int i16, int i17, long j10, int i18, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j11, long j12, long j13, long j14, long j15, long j16, int i19, int i20, int i21, long j17, int i22, long j18, long j19, long j20, long j21, long j22, int i23, int i24, int i25, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i3;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = Collections.unmodifiableList(list);
        this.mediaTimeHistory = Collections.unmodifiableList(list2);
        this.firstReportedTimeMs = j;
        this.foregroundPlaybackCount = i9;
        this.abandonedBeforeReadyCount = i10;
        this.endedCount = i11;
        this.backgroundJoiningCount = i12;
        this.totalValidJoinTimeMs = j9;
        this.validJoinTimeCount = i13;
        this.totalPauseCount = i14;
        this.totalPauseBufferCount = i15;
        this.totalSeekCount = i16;
        this.totalRebufferCount = i17;
        this.maxRebufferTimeMs = j10;
        this.adPlaybackCount = i18;
        this.videoFormatHistory = Collections.unmodifiableList(list3);
        this.audioFormatHistory = Collections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j11;
        this.totalVideoFormatHeightTimeProduct = j12;
        this.totalVideoFormatBitrateTimeMs = j13;
        this.totalVideoFormatBitrateTimeProduct = j14;
        this.totalAudioFormatTimeMs = j15;
        this.totalAudioFormatBitrateTimeProduct = j16;
        this.initialVideoFormatHeightCount = i19;
        this.initialVideoFormatBitrateCount = i20;
        this.totalInitialVideoFormatHeight = i21;
        this.totalInitialVideoFormatBitrate = j17;
        this.initialAudioFormatBitrateCount = i22;
        this.totalInitialAudioFormatBitrate = j18;
        this.totalBandwidthTimeMs = j19;
        this.totalBandwidthBytes = j20;
        this.totalDroppedFrames = j21;
        this.totalAudioUnderruns = j22;
        this.fatalErrorPlaybackCount = i23;
        this.fatalErrorCount = i24;
        this.nonFatalErrorCount = i25;
        this.fatalErrorHistory = Collections.unmodifiableList(list5);
        this.nonFatalErrorHistory = Collections.unmodifiableList(list6);
    }

    public static PlaybackStats merge(PlaybackStats... playbackStatsArr) {
        PlaybackStats[] playbackStatsArr2 = playbackStatsArr;
        int i3 = 16;
        long[] jArr = new long[16];
        int length = playbackStatsArr2.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        long j = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = -1;
        long j19 = -1;
        long j20 = -1;
        long jMax = C.TIME_UNSET;
        int i24 = -1;
        long jMin = C.TIME_UNSET;
        long j21 = C.TIME_UNSET;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i25 < length) {
            long j22 = j18;
            PlaybackStats playbackStats = playbackStatsArr2[i25];
            i9 += playbackStats.playbackCount;
            int i28 = 0;
            while (i28 < i3) {
                jArr[i28] = jArr[i28] + playbackStats.playbackStateDurationsMs[i28];
                i28++;
                i3 = 16;
            }
            if (jMin == C.TIME_UNSET) {
                jMin = playbackStats.firstReportedTimeMs;
            } else {
                long j23 = playbackStats.firstReportedTimeMs;
                if (j23 != C.TIME_UNSET) {
                    jMin = Math.min(jMin, j23);
                }
            }
            i10 += playbackStats.foregroundPlaybackCount;
            i26 += playbackStats.abandonedBeforeReadyCount;
            i27 += playbackStats.endedCount;
            i11 += playbackStats.backgroundJoiningCount;
            if (j21 == C.TIME_UNSET) {
                j21 = playbackStats.totalValidJoinTimeMs;
            } else {
                long j24 = playbackStats.totalValidJoinTimeMs;
                if (j24 != C.TIME_UNSET) {
                    j21 += j24;
                }
            }
            i12 += playbackStats.validJoinTimeCount;
            i13 += playbackStats.totalPauseCount;
            i14 += playbackStats.totalPauseBufferCount;
            i15 += playbackStats.totalSeekCount;
            i16 += playbackStats.totalRebufferCount;
            if (jMax == C.TIME_UNSET) {
                jMax = playbackStats.maxRebufferTimeMs;
            } else {
                long j25 = playbackStats.maxRebufferTimeMs;
                if (j25 != C.TIME_UNSET) {
                    jMax = Math.max(jMax, j25);
                }
            }
            i17 += playbackStats.adPlaybackCount;
            j += playbackStats.totalVideoFormatHeightTimeMs;
            j9 += playbackStats.totalVideoFormatHeightTimeProduct;
            j10 += playbackStats.totalVideoFormatBitrateTimeMs;
            j11 += playbackStats.totalVideoFormatBitrateTimeProduct;
            j12 += playbackStats.totalAudioFormatTimeMs;
            j13 += playbackStats.totalAudioFormatBitrateTimeProduct;
            i18 += playbackStats.initialVideoFormatHeightCount;
            i19 += playbackStats.initialVideoFormatBitrateCount;
            if (i24 == -1) {
                i24 = playbackStats.totalInitialVideoFormatHeight;
            } else {
                int i29 = playbackStats.totalInitialVideoFormatHeight;
                if (i29 != -1) {
                    i24 += i29;
                }
            }
            if (j19 == j22) {
                j19 = playbackStats.totalInitialVideoFormatBitrate;
            } else {
                long j26 = playbackStats.totalInitialVideoFormatBitrate;
                if (j26 != j22) {
                    j19 += j26;
                }
            }
            i20 += playbackStats.initialAudioFormatBitrateCount;
            if (j20 == j22) {
                j20 = playbackStats.totalInitialAudioFormatBitrate;
            } else {
                long j27 = playbackStats.totalInitialAudioFormatBitrate;
                if (j27 != j22) {
                    j20 += j27;
                }
            }
            j14 += playbackStats.totalBandwidthTimeMs;
            j15 += playbackStats.totalBandwidthBytes;
            j16 += playbackStats.totalDroppedFrames;
            j17 += playbackStats.totalAudioUnderruns;
            i21 += playbackStats.fatalErrorPlaybackCount;
            i22 += playbackStats.fatalErrorCount;
            i23 += playbackStats.nonFatalErrorCount;
            i25++;
            playbackStatsArr2 = playbackStatsArr;
            j18 = j22;
            i3 = 16;
        }
        long j28 = jMax;
        List list = Collections.EMPTY_LIST;
        return new PlaybackStats(i9, jArr, list, list, jMin, i10, i26, i27, i11, j21, i12, i13, i14, i15, i16, j28, i17, list, list, j, j9, j10, j11, j12, j13, i18, i19, i24, j19, i20, j20, j14, j15, j16, j17, i21, i22, i23, list, list);
    }

    public float getAbandonedBeforeReadyRatio() {
        int i3 = this.abandonedBeforeReadyCount;
        int i9 = this.playbackCount;
        int i10 = this.foregroundPlaybackCount;
        int i11 = i3 - (i9 - i10);
        if (i10 == 0) {
            return 0.0f;
        }
        return i11 / i10;
    }

    public float getAudioUnderrunRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalAudioUnderruns * 1000.0f) / totalPlayTimeMs;
    }

    public float getDroppedFramesRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalDroppedFrames * 1000.0f) / totalPlayTimeMs;
    }

    public float getEndedRatio() {
        int i3 = this.foregroundPlaybackCount;
        if (i3 == 0) {
            return 0.0f;
        }
        return this.endedCount / i3;
    }

    public float getFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.fatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getFatalErrorRatio() {
        int i3 = this.foregroundPlaybackCount;
        if (i3 == 0) {
            return 0.0f;
        }
        return this.fatalErrorPlaybackCount / i3;
    }

    public float getJoinTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalJoinTimeMs() / totalPlayAndWaitTimeMs;
    }

    public int getMeanAudioFormatBitrate() {
        long j = this.totalAudioFormatTimeMs;
        if (j == 0) {
            return -1;
        }
        return (int) (this.totalAudioFormatBitrateTimeProduct / j);
    }

    public int getMeanBandwidth() {
        long j = this.totalBandwidthTimeMs;
        if (j == 0) {
            return -1;
        }
        return (int) ((this.totalBandwidthBytes * 8000) / j);
    }

    public long getMeanElapsedTimeMs() {
        return this.playbackCount == 0 ? C.TIME_UNSET : getTotalElapsedTimeMs() / ((long) this.playbackCount);
    }

    public int getMeanInitialAudioFormatBitrate() {
        int i3 = this.initialAudioFormatBitrateCount;
        if (i3 == 0) {
            return -1;
        }
        return (int) (this.totalInitialAudioFormatBitrate / ((long) i3));
    }

    public int getMeanInitialVideoFormatBitrate() {
        int i3 = this.initialVideoFormatBitrateCount;
        if (i3 == 0) {
            return -1;
        }
        return (int) (this.totalInitialVideoFormatBitrate / ((long) i3));
    }

    public int getMeanInitialVideoFormatHeight() {
        int i3 = this.initialVideoFormatHeightCount;
        if (i3 == 0) {
            return -1;
        }
        return this.totalInitialVideoFormatHeight / i3;
    }

    public long getMeanJoinTimeMs() {
        int i3 = this.validJoinTimeCount;
        return i3 == 0 ? C.TIME_UNSET : this.totalValidJoinTimeMs / ((long) i3);
    }

    public float getMeanNonFatalErrorCount() {
        int i3 = this.foregroundPlaybackCount;
        if (i3 == 0) {
            return 0.0f;
        }
        return this.nonFatalErrorCount / i3;
    }

    public float getMeanPauseBufferCount() {
        int i3 = this.foregroundPlaybackCount;
        if (i3 == 0) {
            return 0.0f;
        }
        return this.totalPauseBufferCount / i3;
    }

    public float getMeanPauseCount() {
        int i3 = this.foregroundPlaybackCount;
        if (i3 == 0) {
            return 0.0f;
        }
        return this.totalPauseCount / i3;
    }

    public long getMeanPausedTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPausedTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanPlayAndWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayAndWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanPlayTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public float getMeanRebufferCount() {
        int i3 = this.foregroundPlaybackCount;
        if (i3 == 0) {
            return 0.0f;
        }
        return this.totalRebufferCount / i3;
    }

    public long getMeanRebufferTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalRebufferTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public float getMeanSeekCount() {
        int i3 = this.foregroundPlaybackCount;
        if (i3 == 0) {
            return 0.0f;
        }
        return this.totalSeekCount / i3;
    }

    public long getMeanSeekTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanSingleRebufferTimeMs() {
        if (this.totalRebufferCount == 0) {
            return C.TIME_UNSET;
        }
        return (getPlaybackStateDurationMs(7) + getPlaybackStateDurationMs(6)) / ((long) this.totalRebufferCount);
    }

    public long getMeanSingleSeekTimeMs() {
        return this.totalSeekCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / ((long) this.totalSeekCount);
    }

    public float getMeanTimeBetweenFatalErrors() {
        return 1.0f / getFatalErrorRate();
    }

    public float getMeanTimeBetweenNonFatalErrors() {
        return 1.0f / getNonFatalErrorRate();
    }

    public float getMeanTimeBetweenRebuffers() {
        return 1.0f / getRebufferRate();
    }

    public int getMeanVideoFormatBitrate() {
        long j = this.totalVideoFormatBitrateTimeMs;
        if (j == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatBitrateTimeProduct / j);
    }

    public int getMeanVideoFormatHeight() {
        long j = this.totalVideoFormatHeightTimeMs;
        if (j == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatHeightTimeProduct / j);
    }

    public long getMeanWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMediaTimeMsAtRealtimeMs(long j) {
        if (this.mediaTimeHistory.isEmpty()) {
            return C.TIME_UNSET;
        }
        int i3 = 0;
        while (i3 < this.mediaTimeHistory.size() && this.mediaTimeHistory.get(i3)[0] <= j) {
            i3++;
        }
        if (i3 == 0) {
            return this.mediaTimeHistory.get(0)[1];
        }
        if (i3 == this.mediaTimeHistory.size()) {
            List<long[]> list = this.mediaTimeHistory;
            return list.get(list.size() - 1)[1];
        }
        int i9 = i3 - 1;
        long j9 = this.mediaTimeHistory.get(i9)[0];
        long j10 = this.mediaTimeHistory.get(i9)[1];
        long j11 = this.mediaTimeHistory.get(i3)[0];
        long j12 = this.mediaTimeHistory.get(i3)[1];
        long j13 = j11 - j9;
        if (j13 == 0) {
            return j10;
        }
        return j10 + ((long) ((j12 - j10) * ((j - j9) / j13)));
    }

    public float getNonFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.nonFatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public int getPlaybackStateAtTime(long j) {
        int i3 = 0;
        for (EventTimeAndPlaybackState eventTimeAndPlaybackState : this.playbackStateHistory) {
            if (eventTimeAndPlaybackState.eventTime.realtimeMs > j) {
                break;
            }
            i3 = eventTimeAndPlaybackState.playbackState;
        }
        return i3;
    }

    public long getPlaybackStateDurationMs(int i3) {
        return this.playbackStateDurationsMs[i3];
    }

    public float getRebufferRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalRebufferCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalRebufferTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getSeekTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalSeekTimeMs() / totalPlayAndWaitTimeMs;
    }

    public long getTotalElapsedTimeMs() {
        long j = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            j += this.playbackStateDurationsMs[i3];
        }
        return j;
    }

    public long getTotalJoinTimeMs() {
        return getPlaybackStateDurationMs(2);
    }

    public long getTotalPausedTimeMs() {
        return getPlaybackStateDurationMs(7) + getPlaybackStateDurationMs(4);
    }

    public long getTotalPlayAndWaitTimeMs() {
        return getTotalWaitTimeMs() + getTotalPlayTimeMs();
    }

    public long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }

    public long getTotalSeekTimeMs() {
        return getPlaybackStateDurationMs(5);
    }

    public long getTotalWaitTimeMs() {
        return getPlaybackStateDurationMs(5) + getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(2);
    }

    public float getWaitTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalWaitTimeMs() / totalPlayAndWaitTimeMs;
    }
}
