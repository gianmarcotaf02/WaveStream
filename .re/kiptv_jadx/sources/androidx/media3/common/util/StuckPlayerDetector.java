package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class StuckPlayerDetector {
    private static final int MSG_STUCK_BUFFERING_TIMEOUT = 1;
    private static final int MSG_STUCK_PLAYING_NOT_ENDING_TIMEOUT = 3;
    private static final int MSG_STUCK_PLAYING_TIMEOUT = 2;
    private static final int MSG_STUCK_SUPPRESSED_TIMEOUT = 4;
    private final androidx.media3.common.util.StuckPlayerDetector.Callback callback;
    private final androidx.media3.common.util.Clock clock;
    private final androidx.media3.common.util.HandlerWrapper handler;
    private final androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
    private final androidx.media3.common.Player player;
    private final androidx.media3.common.Player.Listener playerListener;
    private final androidx.media3.common.util.StuckPlayerDetector.StuckBufferingDetector stuckBufferingDetector;
    private final androidx.media3.common.util.StuckPlayerDetector.StuckPlayingDetector stuckPlayingDetector;
    private final androidx.media3.common.util.StuckPlayerDetector.StuckPlayingNotEndingDetector stuckPlayingNotEndingDetector;
    private final androidx.media3.common.util.StuckPlayerDetector.StuckSuppressedDetector stuckSuppressedDetector;

    public interface Callback {
        void onStuckPlayerDetected(androidx.media3.common.util.StuckPlayerException stuckPlayerException);
    }

    public final class StuckBufferingDetector {
        private int adGroupIndex;
        private int adIndexInAdGroup;
        private long bufferedDurationInOtherPeriodsMs;
        private long bufferedPositionInPeriodMs;
        private boolean isBuffering;
        private java.lang.Object periodUid;
        private long startRealtimeMs;
        private final int stuckBufferingTimeoutMs;

        public StuckBufferingDetector(int i3) {
            this.stuckBufferingTimeoutMs = i3;
        }

        public void update() {
            if (androidx.media3.common.util.StuckPlayerDetector.this.player.getPlaybackState() != 2 || !androidx.media3.common.util.StuckPlayerDetector.this.player.getPlayWhenReady() || androidx.media3.common.util.StuckPlayerDetector.this.player.getPlaybackSuppressionReason() != 0) {
                if (this.isBuffering) {
                    androidx.media3.common.util.StuckPlayerDetector.this.handler.removeMessages(1);
                }
                this.isBuffering = false;
                return;
            }
            androidx.media3.common.Timeline currentTimeline = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentTimeline();
            java.lang.Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentPeriodIndex());
            int currentAdGroupIndex = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentAdIndexInAdGroup();
            long bufferedPosition = androidx.media3.common.util.StuckPlayerDetector.this.player.getBufferedPosition();
            long jMax = java.lang.Math.max(0L, androidx.media3.common.util.StuckPlayerDetector.this.player.getTotalBufferedDuration() - java.lang.Math.max(0L, bufferedPosition - androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentPosition()));
            if (uidOfPeriod != null && currentAdGroupIndex == -1) {
                bufferedPosition -= currentTimeline.getPeriodByUid(uidOfPeriod, androidx.media3.common.util.StuckPlayerDetector.this.period).getPositionInWindowMs();
            }
            long jElapsedRealtime = androidx.media3.common.util.StuckPlayerDetector.this.clock.elapsedRealtime();
            if (this.isBuffering && java.util.Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup && bufferedPosition == this.bufferedPositionInPeriodMs && jMax == this.bufferedDurationInOtherPeriodsMs) {
                if (jElapsedRealtime - this.startRealtimeMs >= this.stuckBufferingTimeoutMs) {
                    androidx.media3.common.util.StuckPlayerDetector.this.callback.onStuckPlayerDetected(new androidx.media3.common.util.StuckPlayerException(1, this.stuckBufferingTimeoutMs));
                    return;
                }
                return;
            }
            this.isBuffering = true;
            this.startRealtimeMs = jElapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            this.bufferedPositionInPeriodMs = bufferedPosition;
            this.bufferedDurationInOtherPeriodsMs = jMax;
            androidx.media3.common.util.StuckPlayerDetector.this.handler.removeMessages(1);
            androidx.media3.common.util.StuckPlayerDetector.this.handler.sendEmptyMessageDelayed(1, this.stuckBufferingTimeoutMs);
        }
    }

    public final class StuckPlayingDetector {
        private int adGroupIndex;
        private int adIndexInAdGroup;
        private long currentPositionInPeriodMs;
        private boolean isPlaying;
        private java.lang.Object periodUid;
        private long startRealtimeMs;
        private final int stuckPlayingTimeoutMs;

        public StuckPlayingDetector(int i3) {
            this.stuckPlayingTimeoutMs = i3;
        }

        public void update() {
            if (!androidx.media3.common.util.StuckPlayerDetector.this.player.isPlaying()) {
                if (this.isPlaying) {
                    androidx.media3.common.util.StuckPlayerDetector.this.handler.removeMessages(2);
                }
                this.isPlaying = false;
                return;
            }
            androidx.media3.common.Timeline currentTimeline = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentTimeline();
            java.lang.Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentPeriodIndex());
            int currentAdGroupIndex = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentAdIndexInAdGroup();
            long currentPosition = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentPosition();
            if (uidOfPeriod != null && currentAdGroupIndex == -1) {
                currentPosition -= currentTimeline.getPeriodByUid(uidOfPeriod, androidx.media3.common.util.StuckPlayerDetector.this.period).getPositionInWindowMs();
            }
            long jElapsedRealtime = androidx.media3.common.util.StuckPlayerDetector.this.clock.elapsedRealtime();
            if (this.isPlaying && java.util.Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup && currentPosition == this.currentPositionInPeriodMs) {
                if (jElapsedRealtime - this.startRealtimeMs >= this.stuckPlayingTimeoutMs) {
                    androidx.media3.common.util.StuckPlayerDetector.this.callback.onStuckPlayerDetected(new androidx.media3.common.util.StuckPlayerException(2, this.stuckPlayingTimeoutMs));
                    return;
                }
                return;
            }
            this.isPlaying = true;
            this.startRealtimeMs = jElapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            this.currentPositionInPeriodMs = currentPosition;
            androidx.media3.common.util.StuckPlayerDetector.this.handler.removeMessages(2);
            androidx.media3.common.util.StuckPlayerDetector.this.handler.sendEmptyMessageDelayed(2, this.stuckPlayingTimeoutMs);
        }
    }

    public final class StuckPlayingNotEndingDetector {
        private int adGroupIndex;
        private int adIndexInAdGroup;
        private boolean isPlayingAndReachedDuration;
        private java.lang.Object periodUid;
        private long startRealtimeMs;
        private final int stuckPlayingNotEndingTimeoutMs;

        public StuckPlayingNotEndingDetector(int i3) {
            this.stuckPlayingNotEndingTimeoutMs = i3;
        }

        public void update() {
            long duration;
            androidx.media3.common.Timeline currentTimeline = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentTimeline();
            java.lang.Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentPeriodIndex());
            int currentAdGroupIndex = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentAdIndexInAdGroup();
            long currentPosition = androidx.media3.common.util.StuckPlayerDetector.this.player.getCurrentPosition();
            if (uidOfPeriod == null || currentAdGroupIndex != -1) {
                duration = currentAdGroupIndex != -1 ? androidx.media3.common.util.StuckPlayerDetector.this.player.getDuration() : -9223372036854775807L;
            } else {
                currentTimeline.getPeriodByUid(uidOfPeriod, androidx.media3.common.util.StuckPlayerDetector.this.period);
                currentPosition -= androidx.media3.common.util.StuckPlayerDetector.this.period.getPositionInWindowMs();
                duration = androidx.media3.common.util.StuckPlayerDetector.this.period.getDurationMs();
            }
            boolean zIsPlaying = androidx.media3.common.util.StuckPlayerDetector.this.player.isPlaying();
            if (!zIsPlaying || duration == androidx.media3.common.C.TIME_UNSET || currentPosition < duration) {
                androidx.media3.common.util.StuckPlayerDetector.this.handler.removeMessages(3);
                if (zIsPlaying && duration != androidx.media3.common.C.TIME_UNSET) {
                    androidx.media3.common.util.StuckPlayerDetector.this.handler.sendEmptyMessageDelayed(3, (int) java.lang.Math.ceil((duration - currentPosition) / androidx.media3.common.util.StuckPlayerDetector.this.player.getPlaybackParameters().speed));
                }
                this.isPlayingAndReachedDuration = false;
                return;
            }
            long jElapsedRealtime = androidx.media3.common.util.StuckPlayerDetector.this.clock.elapsedRealtime();
            if (this.isPlayingAndReachedDuration && java.util.Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup) {
                if (jElapsedRealtime - this.startRealtimeMs >= this.stuckPlayingNotEndingTimeoutMs) {
                    androidx.media3.common.util.StuckPlayerDetector.this.callback.onStuckPlayerDetected(new androidx.media3.common.util.StuckPlayerException(3, this.stuckPlayingNotEndingTimeoutMs));
                    return;
                }
                return;
            }
            this.isPlayingAndReachedDuration = true;
            this.startRealtimeMs = jElapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            androidx.media3.common.util.StuckPlayerDetector.this.handler.removeMessages(3);
            androidx.media3.common.util.StuckPlayerDetector.this.handler.sendEmptyMessageDelayed(3, this.stuckPlayingNotEndingTimeoutMs);
        }
    }

    public final class StuckSuppressedDetector {
        private boolean isSuppressed;
        private long startRealtimeMs;
        private final int stuckSuppressedTimeoutMs;
        private int suppressionReason;

        public StuckSuppressedDetector(int i3) {
            this.stuckSuppressedTimeoutMs = i3;
        }

        public void update() {
            int playbackSuppressionReason = androidx.media3.common.util.StuckPlayerDetector.this.player.getPlaybackSuppressionReason();
            if (!androidx.media3.common.util.StuckPlayerDetector.this.player.getPlayWhenReady() || androidx.media3.common.util.StuckPlayerDetector.this.player.getPlaybackState() == 1 || androidx.media3.common.util.StuckPlayerDetector.this.player.getPlaybackState() == 4 || playbackSuppressionReason == 0 || playbackSuppressionReason == 1) {
                if (this.isSuppressed) {
                    androidx.media3.common.util.StuckPlayerDetector.this.handler.removeMessages(4);
                }
                this.isSuppressed = false;
                return;
            }
            long jElapsedRealtime = androidx.media3.common.util.StuckPlayerDetector.this.clock.elapsedRealtime();
            if (this.isSuppressed && this.suppressionReason == playbackSuppressionReason) {
                if (jElapsedRealtime - this.startRealtimeMs >= this.stuckSuppressedTimeoutMs) {
                    androidx.media3.common.util.StuckPlayerDetector.this.callback.onStuckPlayerDetected(new androidx.media3.common.util.StuckPlayerException(4, this.stuckSuppressedTimeoutMs));
                }
            } else {
                this.isSuppressed = true;
                this.startRealtimeMs = jElapsedRealtime;
                this.suppressionReason = playbackSuppressionReason;
                androidx.media3.common.util.StuckPlayerDetector.this.handler.removeMessages(4);
                androidx.media3.common.util.StuckPlayerDetector.this.handler.sendEmptyMessageDelayed(4, this.stuckSuppressedTimeoutMs);
            }
        }
    }

    public StuckPlayerDetector(androidx.media3.common.Player player, androidx.media3.common.util.StuckPlayerDetector.Callback callback, androidx.media3.common.util.Clock clock, int i3, int i9, int i10, int i11) {
        this.player = player;
        this.callback = callback;
        this.clock = clock;
        this.handler = clock.createHandler(player.getApplicationLooper(), new androidx.media3.common.util.b(1, this));
        this.stuckBufferingDetector = new androidx.media3.common.util.StuckPlayerDetector.StuckBufferingDetector(i3);
        this.stuckPlayingDetector = new androidx.media3.common.util.StuckPlayerDetector.StuckPlayingDetector(i9);
        this.stuckPlayingNotEndingDetector = new androidx.media3.common.util.StuckPlayerDetector.StuckPlayingNotEndingDetector(i10);
        this.stuckSuppressedDetector = new androidx.media3.common.util.StuckPlayerDetector.StuckSuppressedDetector(i11);
        androidx.media3.common.Player.Listener listener = new androidx.media3.common.Player.Listener() { // from class: androidx.media3.common.util.StuckPlayerDetector.1
            @Override // androidx.media3.common.Player.Listener
            public void onEvents(androidx.media3.common.Player player2, androidx.media3.common.Player.Events events) {
                androidx.media3.common.util.StuckPlayerDetector.this.onPlayerEvents();
            }
        };
        this.playerListener = listener;
        player.addListener(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(android.os.Message message) {
        int i3 = message.what;
        if (i3 == 1) {
            this.stuckBufferingDetector.update();
            return true;
        }
        if (i3 == 2) {
            this.stuckPlayingDetector.update();
            return true;
        }
        if (i3 == 3) {
            this.stuckPlayingNotEndingDetector.update();
            return true;
        }
        if (i3 != 4) {
            return false;
        }
        this.stuckSuppressedDetector.update();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerEvents() {
        this.stuckBufferingDetector.update();
        this.stuckPlayingDetector.update();
        this.stuckPlayingNotEndingDetector.update();
        this.stuckSuppressedDetector.update();
    }

    public void release() {
        this.handler.removeCallbacksAndMessages(null);
        this.player.removeListener(this.playerListener);
    }
}
