package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public class DefaultAnalyticsCollector implements androidx.media3.exoplayer.analytics.AnalyticsCollector {
    private final androidx.media3.common.util.Clock clock;
    private final android.util.SparseArray<androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime> eventTimes;
    private androidx.media3.common.util.HandlerWrapper handler;
    private boolean isSeeking;
    private androidx.media3.common.util.ListenerSet<androidx.media3.exoplayer.analytics.AnalyticsListener> listeners;
    private final androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final androidx.media3.common.Timeline.Period period;
    private androidx.media3.common.Player player;
    private final androidx.media3.common.Timeline.Window window;

    public static final class MediaPeriodQueueTracker {
        private androidx.media3.exoplayer.source.MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private p076i4.AbstractC2186b0 mediaPeriodQueue;
        private p076i4.AbstractC2194f0 mediaPeriodTimelines;
        private final androidx.media3.common.Timeline.Period period;
        private androidx.media3.exoplayer.source.MediaSource.MediaPeriodId playingMediaPeriod;
        private androidx.media3.exoplayer.source.MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(androidx.media3.common.Timeline.Period period) {
            this.period = period;
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            this.mediaPeriodQueue = p076i4.S0.f22832l;
            this.mediaPeriodTimelines = p076i4.X0.f22848n;
        }

        private void addTimelineForMediaPeriodId(p076i4.C2192e0 c2192e0, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                c2192e0.c(mediaPeriodId, timeline);
                return;
            }
            androidx.media3.common.Timeline timeline2 = (androidx.media3.common.Timeline) this.mediaPeriodTimelines.get(mediaPeriodId);
            if (timeline2 != null) {
                c2192e0.c(mediaPeriodId, timeline2);
            }
        }

        private static androidx.media3.exoplayer.source.MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(androidx.media3.common.Player player, p076i4.AbstractC2186b0 abstractC2186b0, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Timeline.Period period) {
            androidx.media3.common.Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            java.lang.Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(androidx.media3.common.util.Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            for (int i3 = 0; i3 < abstractC2186b0.size(); i3++) {
                androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) abstractC2186b0.get(i3);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId2;
                }
            }
            if (abstractC2186b0.isEmpty() && mediaPeriodId != null && isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                return mediaPeriodId;
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Object obj, boolean z6, int i3, int i9, int i10) {
            if (!mediaPeriodId.periodUid.equals(obj)) {
                return false;
            }
            if (z6 && mediaPeriodId.adGroupIndex == i3 && mediaPeriodId.adIndexInAdGroup == i9) {
                return true;
            }
            return !z6 && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i10;
        }

        private void updateMediaPeriodTimelines(androidx.media3.common.Timeline timeline) {
            p076i4.C2192e0 c2192e0 = new p076i4.C2192e0(4);
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(c2192e0, this.playingMediaPeriod, timeline);
                if (!java.util.Objects.equals(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(c2192e0, this.readingMediaPeriod, timeline);
                }
                if (!java.util.Objects.equals(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !java.util.Objects.equals(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(c2192e0, this.currentPlayerMediaPeriod, timeline);
                }
            } else {
                for (int i3 = 0; i3 < this.mediaPeriodQueue.size(); i3++) {
                    addTimelineForMediaPeriodId(c2192e0, (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) this.mediaPeriodQueue.get(i3), timeline);
                }
                if (!this.mediaPeriodQueue.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(c2192e0, this.currentPlayerMediaPeriod, timeline);
                }
            }
            this.mediaPeriodTimelines = c2192e0.a(true);
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) p076i4.AbstractC2230y.l(this.mediaPeriodQueue);
        }

        public androidx.media3.common.Timeline getMediaPeriodIdTimeline(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            return (androidx.media3.common.Timeline) this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public void onPositionDiscontinuity(androidx.media3.common.Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onQueueUpdated(java.util.List<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> list, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.Player player) {
            this.mediaPeriodQueue = p076i4.AbstractC2186b0.u(list);
            if (!list.isEmpty()) {
                this.playingMediaPeriod = list.get(0);
                mediaPeriodId.getClass();
                this.readingMediaPeriod = mediaPeriodId;
            }
            if (this.currentPlayerMediaPeriod == null) {
                this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            }
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }

        public void onTimelineChanged(androidx.media3.common.Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }
    }

    public DefaultAnalyticsCollector(androidx.media3.common.util.Clock clock) {
        clock.getClass();
        this.clock = clock;
        this.listeners = new androidx.media3.common.util.ListenerSet<>(androidx.media3.common.util.Util.getCurrentOrMainLooper());
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        this.period = period;
        this.window = new androidx.media3.common.Timeline.Window();
        this.mediaPeriodQueueTracker = new androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker(period);
        this.eventTimes = new android.util.SparseArray<>();
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateMediaPeriodEventTime(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.player.getClass();
        if (mediaPeriodId != null) {
            return this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null ? generateEventTime(mediaPeriodId) : generateEventTime(androidx.media3.common.Timeline.EMPTY, i3, mediaPeriodId);
        }
        androidx.media3.common.Timeline currentTimeline = this.player.getCurrentTimeline();
        if (i3 >= currentTimeline.getWindowCount()) {
            currentTimeline = androidx.media3.common.Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i3, null);
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime getEventTimeForErrorEvent(androidx.media3.common.PlaybackException playbackException) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        return (!(playbackException instanceof androidx.media3.exoplayer.ExoPlaybackException) || (mediaPeriodId = ((androidx.media3.exoplayer.ExoPlaybackException) playbackException).mediaPeriodId) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(mediaPeriodId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onAudioDecoderInitialized$4(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j9, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j9, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDrmKeysLoaded$65(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.drm.KeyRequestInfo keyRequestInfo, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onDrmKeysLoaded(eventTime);
        analyticsListener.onDrmKeysLoaded(eventTime, keyRequestInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDrmSessionAcquired$64(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onIsLoadingChanged$35(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, boolean z6, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z6);
        analyticsListener.onIsLoadingChanged(eventTime, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onLoadStarted$26(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i3, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData);
        analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPositionDiscontinuity$46(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i3);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoDecoderInitialized$16(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j9, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j9, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onVideoSizeChanged$59(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.VideoSize videoSize, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, 0, videoSize.pixelWidthHeightRatio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlayer$0(androidx.media3.common.Player player, androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener, androidx.media3.common.FlagSet flagSet) {
        analyticsListener.onEvents(player, new androidx.media3.exoplayer.analytics.AnalyticsListener.Events(flagSet, this.eventTimes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseInternal() {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_PLAYER_RELEASED, new androidx.media3.exoplayer.analytics.a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0));
        this.listeners.release();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void addListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        analyticsListener.getClass();
        this.listeners.add(analyticsListener);
    }

    public final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"player"})
    public final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateEventTime(androidx.media3.common.Timeline timeline, int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
        long jElapsedRealtime = this.clock.elapsedRealtime();
        boolean z6 = timeline.equals(this.player.getCurrentTimeline()) && i3 == this.player.getCurrentMediaItemIndex();
        long defaultPositionMs = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.isAd()) {
            if (z6) {
                defaultPositionMs = this.player.getContentPosition();
            } else if (!timeline.isEmpty()) {
                defaultPositionMs = timeline.getWindow(i3, this.window).getDefaultPositionMs();
            }
        } else if (z6 && this.player.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.player.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup) {
            defaultPositionMs = this.player.getCurrentPosition();
        }
        return new androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime(jElapsedRealtime, timeline, i3, mediaPeriodId2, defaultPositionMs, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new androidx.media3.exoplayer.analytics.a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioAttributesChanged(androidx.media3.common.AudioAttributes audioAttributes) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 20, new F.f0(eventTimeGenerateReadingMediaPeriodEventTime, audioAttributes, 5));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioCodecError(java.lang.Exception exc) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_CODEC_ERROR, new androidx.media3.exoplayer.analytics.i(eventTimeGenerateReadingMediaPeriodEventTime, exc, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(java.lang.String str, long j, long j9) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, new androidx.media3.exoplayer.analytics.l(eventTimeGenerateReadingMediaPeriodEventTime, str, j9, j, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderReleased(java.lang.String str) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, new androidx.media3.exoplayer.analytics.e(eventTimeGenerateReadingMediaPeriodEventTime, str, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_DISABLED, new androidx.media3.exoplayer.analytics.b(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_ENABLED, new androidx.media3.exoplayer.analytics.b(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED, new androidx.media3.exoplayer.analytics.r(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioPositionAdvancing(long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING, new androidx.media3.exoplayer.analytics.c(eventTimeGenerateReadingMediaPeriodEventTime, j, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioSessionIdChanged(int i3) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 21, new androidx.media3.exoplayer.analytics.f(eventTimeGenerateReadingMediaPeriodEventTime, i3, 5));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioSinkError(java.lang.Exception exc) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_SINK_ERROR, new androidx.media3.exoplayer.analytics.i(eventTimeGenerateReadingMediaPeriodEventTime, exc, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackInitialized(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED, new androidx.media3.exoplayer.analytics.s(eventTimeGenerateReadingMediaPeriodEventTime, audioTrackConfig, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onAudioTrackReleased(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED, new androidx.media3.exoplayer.analytics.s(eventTimeGenerateReadingMediaPeriodEventTime, audioTrackConfig, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioUnderrun(int i3, long j, long j9) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_AUDIO_UNDERRUN, new androidx.media3.exoplayer.analytics.g(eventTimeGenerateReadingMediaPeriodEventTime, i3, j, j9, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onAvailableCommandsChanged(androidx.media3.common.Player.Commands commands) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 13, new F.f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, commands, 3));
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int i3, long j, long j9) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateLoadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, new androidx.media3.exoplayer.analytics.g(eventTimeGenerateLoadingMediaPeriodEventTime, i3, j, j9, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(java.util.List<androidx.media3.common.text.Cue> list) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new F.f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, list, 9));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceInfoChanged(androidx.media3.common.DeviceInfo deviceInfo) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 29, new F.f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, deviceInfo, 10));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onDeviceVolumeChanged(int i3, boolean z6) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 30, new androidx.media3.exoplayer.analytics.k(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, z6));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1004, new androidx.media3.exoplayer.analytics.p(eventTimeGenerateMediaPeriodEventTime, mediaLoadData, 0));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.drm.KeyRequestInfo keyRequestInfo) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_LOADED, new F.f0(eventTimeGenerateMediaPeriodEventTime, keyRequestInfo, 8));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_REMOVED, new androidx.media3.exoplayer.analytics.a(eventTimeGenerateMediaPeriodEventTime, 1));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_KEYS_RESTORED, new androidx.media3.exoplayer.analytics.a(eventTimeGenerateMediaPeriodEventTime, 2));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, int i9) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, new androidx.media3.exoplayer.analytics.f(eventTimeGenerateMediaPeriodEventTime, i9, 4));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1024, new androidx.media3.exoplayer.analytics.i(eventTimeGenerateMediaPeriodEventTime, exc, 1));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DRM_SESSION_RELEASED, new androidx.media3.exoplayer.analytics.a(eventTimeGenerateMediaPeriodEventTime, 4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDroppedFrames(int i3, long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, new androidx.media3.exoplayer.analytics.m(eventTimeGeneratePlayingMediaPeriodEventTime, i3, j));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onDroppedSeeksWhileScrubbing(int i3) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_DROPPED_SEEKS_WHILE_SCRUBBING, new androidx.media3.exoplayer.analytics.f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z6) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, new androidx.media3.exoplayer.analytics.d(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, z6));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(boolean z6) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 7, new androidx.media3.exoplayer.analytics.d(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, z6));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCanceled(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1002, new androidx.media3.exoplayer.analytics.q(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, 0));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadCompleted(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1001, new androidx.media3.exoplayer.analytics.q(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, 1));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadError(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z6) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1003, new androidx.media3.exoplayer.analytics.j(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, iOException, z6));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onLoadStarted(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i9) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1000, new androidx.media3.exoplayer.analytics.u(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, i9, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onLoadingChanged(boolean z6) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMaxSeekToPreviousPositionChanged(long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 18, new androidx.media3.exoplayer.analytics.c(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j, 3));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaItemTransition(androidx.media3.common.MediaItem mediaItem, int i3) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1, new androidx.media3.common.f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaItem, i3, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onMediaMetadataChanged(androidx.media3.common.MediaMetadata mediaMetadata) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 14, new androidx.media3.exoplayer.analytics.t(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMetadata(androidx.media3.common.Metadata metadata) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 28, new F.f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, metadata, 6));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z6, int i3) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 5, new androidx.media3.exoplayer.analytics.k(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 2, z6));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackParametersChanged(androidx.media3.common.PlaybackParameters playbackParameters) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 12, new F.f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playbackParameters, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i3) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 4, new androidx.media3.exoplayer.analytics.f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 3));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int i3) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 6, new androidx.media3.exoplayer.analytics.f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(androidx.media3.common.PlaybackException playbackException) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new androidx.media3.exoplayer.analytics.n(eventTimeForErrorEvent, playbackException, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerErrorChanged(androidx.media3.common.PlaybackException playbackException) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new androidx.media3.exoplayer.analytics.n(eventTimeForErrorEvent, playbackException, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerStateChanged(boolean z6, int i3) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new androidx.media3.exoplayer.analytics.k(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 0, z6));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaylistMetadataChanged(androidx.media3.common.MediaMetadata mediaMetadata) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 15, new androidx.media3.exoplayer.analytics.t(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPositionDiscontinuity(int i3) {
    }

    @Override // androidx.media3.common.Player.Listener
    public void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void onRendererReadyChanged(final int i3, final int i9, final boolean z6) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_RENDERER_READY_CHANGED, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.o
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onRendererReadyChanged(eventTimeGenerateReadingMediaPeriodEventTime, i3, i9, z6);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRepeatModeChanged(int i3) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 8, new androidx.media3.exoplayer.analytics.f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 6));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekBackIncrementChanged(long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 16, new androidx.media3.exoplayer.analytics.c(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onSeekForwardIncrementChanged(long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 17, new androidx.media3.exoplayer.analytics.c(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onShuffleModeEnabledChanged(boolean z6) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 9, new androidx.media3.exoplayer.analytics.d(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, z6));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean z6) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 23, new androidx.media3.exoplayer.analytics.d(eventTimeGenerateReadingMediaPeriodEventTime, 1, z6));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(final int i3, final int i9) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 24, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.w
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onSurfaceSizeChanged(eventTimeGenerateReadingMediaPeriodEventTime, i3, i9);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(androidx.media3.common.Timeline timeline, int i3) {
        androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        androidx.media3.common.Player player = this.player;
        player.getClass();
        mediaPeriodQueueTracker.onTimelineChanged(player);
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, new androidx.media3.exoplayer.analytics.f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTrackSelectionParametersChanged(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 19, new F.f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, trackSelectionParameters, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onTracksChanged(androidx.media3.common.Tracks tracks) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, new F.f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, tracks, 7));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_UPSTREAM_DISCARDED, new androidx.media3.exoplayer.analytics.p(eventTimeGenerateMediaPeriodEventTime, mediaLoadData, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoCodecError(java.lang.Exception exc) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_CODEC_ERROR, new androidx.media3.exoplayer.analytics.i(eventTimeGenerateReadingMediaPeriodEventTime, exc, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(java.lang.String str, long j, long j9) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED, new androidx.media3.exoplayer.analytics.l(eventTimeGenerateReadingMediaPeriodEventTime, str, j9, j, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderReleased(java.lang.String str) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_DECODER_RELEASED, new androidx.media3.exoplayer.analytics.e(eventTimeGenerateReadingMediaPeriodEventTime, str, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDisabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_DISABLED, new androidx.media3.exoplayer.analytics.b(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoEnabled(androidx.media3.exoplayer.DecoderCounters decoderCounters) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_ENABLED, new androidx.media3.exoplayer.analytics.b(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoFrameProcessingOffset(long j, int i3) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_FRAME_PROCESSING_OFFSET, new androidx.media3.exoplayer.analytics.m(eventTimeGeneratePlayingMediaPeriodEventTime, j, i3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoInputFormatChanged(androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, androidx.media3.exoplayer.analytics.AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, new androidx.media3.exoplayer.analytics.r(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 25, new F.f0(eventTimeGenerateReadingMediaPeriodEventTime, videoSize, 11));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(final float f9) {
        final androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 22, new androidx.media3.common.util.ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.h
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(java.lang.Object obj) {
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onVolumeChanged(eventTimeGenerateReadingMediaPeriodEventTime, f9);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void release() {
        androidx.media3.common.util.HandlerWrapper handlerWrapper = this.handler;
        handlerWrapper.getClass();
        handlerWrapper.post(new D1.RunnableC0239y(9, this));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void removeListener(androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public final void sendEvent(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3, androidx.media3.common.util.ListenerSet.Event<androidx.media3.exoplayer.analytics.AnalyticsListener> event) {
        this.eventTimes.put(i3, eventTime);
        this.listeners.sendEvent(i3, event);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public void setPlayer(androidx.media3.common.Player player, android.os.Looper looper) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        player.getClass();
        this.player = player;
        this.handler = this.clock.createHandler(looper, null);
        this.listeners = this.listeners.copy(looper, this.clock, new F.f0(this, player, 4));
    }

    @java.lang.Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z6) {
        this.listeners.setThrowsWhenUsingWrongThread(z6);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void updateMediaPeriodQueueInfo(java.util.List<androidx.media3.exoplayer.source.MediaSource.MediaPeriodId> list, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        androidx.media3.common.Player player = this.player;
        player.getClass();
        mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, player);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i3) {
        if (i3 == 1) {
            this.isSeeking = false;
        }
        androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        androidx.media3.common.Player player = this.player;
        player.getClass();
        mediaPeriodQueueTracker.onPositionDiscontinuity(player);
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 11, new androidx.media3.exoplayer.analytics.u(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, positionInfo, positionInfo2, i3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onRenderedFirstFrame(java.lang.Object obj, long j) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 26, new androidx.media3.exoplayer.analytics.v(j, eventTimeGenerateReadingMediaPeriodEventTime, obj));
    }

    @Override // androidx.media3.common.Player.Listener
    public void onCues(androidx.media3.common.text.CueGroup cueGroup) {
        androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new F.f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, cueGroup, 12));
    }

    private androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime generateEventTime(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.player.getClass();
        androidx.media3.common.Timeline mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId != null && mediaPeriodIdTimeline != null) {
            return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
        }
        int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
        androidx.media3.common.Timeline currentTimeline = this.player.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = androidx.media3.common.Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, currentMediaItemIndex, null);
    }
}
