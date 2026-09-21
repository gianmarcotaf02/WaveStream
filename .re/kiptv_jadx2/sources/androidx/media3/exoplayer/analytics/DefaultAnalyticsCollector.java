package androidx.media3.exoplayer.analytics;

import D1.RunnableC0239y;
import F.f0;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2194f0;
import p076i4.AbstractC2230y;
import p076i4.C2192e0;
import p076i4.S0;
import p076i4.X0;
import p076i4.Z;

public class DefaultAnalyticsCollector implements AnalyticsCollector {
    private final Clock clock;
    private final SparseArray<AnalyticsListener.EventTime> eventTimes;
    private HandlerWrapper handler;
    private boolean isSeeking;
    private ListenerSet<AnalyticsListener> listeners;
    private final MediaPeriodQueueTracker mediaPeriodQueueTracker;
    private final Timeline.Period period;
    private Player player;
    private final Timeline.Window window;

    public static final class MediaPeriodQueueTracker {
        private MediaSource.MediaPeriodId currentPlayerMediaPeriod;
        private AbstractC2186b0 mediaPeriodQueue;
        private AbstractC2194f0 mediaPeriodTimelines;
        private final Timeline.Period period;
        private MediaSource.MediaPeriodId playingMediaPeriod;
        private MediaSource.MediaPeriodId readingMediaPeriod;

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.period = period;
            Z z6 = AbstractC2186b0.f22868i;
            this.mediaPeriodQueue = S0.f22832l;
            this.mediaPeriodTimelines = X0.f22848n;
        }

        private void addTimelineForMediaPeriodId(C2192e0 c2192e0, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                c2192e0.c(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = (Timeline) this.mediaPeriodTimelines.get(mediaPeriodId);
            if (timeline2 != null) {
                c2192e0.c(mediaPeriodId, timeline2);
            }
        }

        private static MediaSource.MediaPeriodId findCurrentPlayerMediaPeriodInQueue(Player player, AbstractC2186b0 abstractC2186b0, MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            for (int i3 = 0; i3 < abstractC2186b0.size(); i3++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) abstractC2186b0.get(i3);
                if (isMatchingMediaPeriod(mediaPeriodId2, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId2;
                }
            }
            if (abstractC2186b0.isEmpty() && mediaPeriodId != null && isMatchingMediaPeriod(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                return mediaPeriodId;
            }
            return null;
        }

        private static boolean isMatchingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Object obj, boolean z6, int i3, int i9, int i10) {
            if (!mediaPeriodId.periodUid.equals(obj)) {
                return false;
            }
            if (z6 && mediaPeriodId.adGroupIndex == i3 && mediaPeriodId.adIndexInAdGroup == i9) {
                return true;
            }
            return !z6 && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == i10;
        }

        private void updateMediaPeriodTimelines(Timeline timeline) {
            C2192e0 c2192e0 = new C2192e0(4);
            if (this.mediaPeriodQueue.isEmpty()) {
                addTimelineForMediaPeriodId(c2192e0, this.playingMediaPeriod, timeline);
                if (!Objects.equals(this.readingMediaPeriod, this.playingMediaPeriod)) {
                    addTimelineForMediaPeriodId(c2192e0, this.readingMediaPeriod, timeline);
                }
                if (!Objects.equals(this.currentPlayerMediaPeriod, this.playingMediaPeriod) && !Objects.equals(this.currentPlayerMediaPeriod, this.readingMediaPeriod)) {
                    addTimelineForMediaPeriodId(c2192e0, this.currentPlayerMediaPeriod, timeline);
                }
            } else {
                for (int i3 = 0; i3 < this.mediaPeriodQueue.size(); i3++) {
                    addTimelineForMediaPeriodId(c2192e0, (MediaSource.MediaPeriodId) this.mediaPeriodQueue.get(i3), timeline);
                }
                if (!this.mediaPeriodQueue.contains(this.currentPlayerMediaPeriod)) {
                    addTimelineForMediaPeriodId(c2192e0, this.currentPlayerMediaPeriod, timeline);
                }
            }
            this.mediaPeriodTimelines = c2192e0.a(true);
        }

        public MediaSource.MediaPeriodId getCurrentPlayerMediaPeriod() {
            return this.currentPlayerMediaPeriod;
        }

        public MediaSource.MediaPeriodId getLoadingMediaPeriod() {
            if (this.mediaPeriodQueue.isEmpty()) {
                return null;
            }
            return (MediaSource.MediaPeriodId) AbstractC2230y.l(this.mediaPeriodQueue);
        }

        public Timeline getMediaPeriodIdTimeline(MediaSource.MediaPeriodId mediaPeriodId) {
            return (Timeline) this.mediaPeriodTimelines.get(mediaPeriodId);
        }

        public MediaSource.MediaPeriodId getPlayingMediaPeriod() {
            return this.playingMediaPeriod;
        }

        public MediaSource.MediaPeriodId getReadingMediaPeriod() {
            return this.readingMediaPeriod;
        }

        public void onPositionDiscontinuity(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
        }

        public void onQueueUpdated(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId, Player player) {
            this.mediaPeriodQueue = AbstractC2186b0.u(list);
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

        public void onTimelineChanged(Player player) {
            this.currentPlayerMediaPeriod = findCurrentPlayerMediaPeriodInQueue(player, this.mediaPeriodQueue, this.playingMediaPeriod, this.period);
            updateMediaPeriodTimelines(player.getCurrentTimeline());
        }
    }

    public DefaultAnalyticsCollector(Clock clock) {
        clock.getClass();
        this.clock = clock;
        this.listeners = new ListenerSet<>(Util.getCurrentOrMainLooper());
        Timeline.Period period = new Timeline.Period();
        this.period = period;
        this.window = new Timeline.Window();
        this.mediaPeriodQueueTracker = new MediaPeriodQueueTracker(period);
        this.eventTimes = new SparseArray<>();
    }

    private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getLoadingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateMediaPeriodEventTime(int i3, MediaSource.MediaPeriodId mediaPeriodId) {
        this.player.getClass();
        if (mediaPeriodId != null) {
            return this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId) != null ? generateEventTime(mediaPeriodId) : generateEventTime(Timeline.EMPTY, i3, mediaPeriodId);
        }
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (i3 >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, i3, null);
    }

    private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getPlayingMediaPeriod());
    }

    private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getReadingMediaPeriod());
    }

    private AnalyticsListener.EventTime getEventTimeForErrorEvent(PlaybackException playbackException) {
        MediaSource.MediaPeriodId mediaPeriodId;
        return (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? generateCurrentPlayerMediaPeriodEventTime() : generateEventTime(mediaPeriodId);
    }

    public static void lambda$onAudioDecoderInitialized$4(AnalyticsListener.EventTime eventTime, String str, long j, long j9, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j9, j);
    }

    public static void lambda$onDrmKeysLoaded$65(AnalyticsListener.EventTime eventTime, KeyRequestInfo keyRequestInfo, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmKeysLoaded(eventTime);
        analyticsListener.onDrmKeysLoaded(eventTime, keyRequestInfo);
    }

    public static void lambda$onDrmSessionAcquired$64(AnalyticsListener.EventTime eventTime, int i3, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i3);
    }

    public static void lambda$onIsLoadingChanged$35(AnalyticsListener.EventTime eventTime, boolean z6, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z6);
        analyticsListener.onIsLoadingChanged(eventTime, z6);
    }

    public static void lambda$onLoadStarted$26(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i3, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData);
        analyticsListener.onLoadStarted(eventTime, loadEventInfo, mediaLoadData, i3);
    }

    public static void lambda$onPositionDiscontinuity$46(AnalyticsListener.EventTime eventTime, int i3, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i3);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i3);
    }

    public static void lambda$onVideoDecoderInitialized$16(AnalyticsListener.EventTime eventTime, String str, long j, long j9, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j9, j);
    }

    public static void lambda$onVideoSizeChanged$59(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, 0, videoSize.pixelWidthHeightRatio);
    }

    public void lambda$setPlayer$0(Player player, AnalyticsListener analyticsListener, FlagSet flagSet) {
        analyticsListener.onEvents(player, new AnalyticsListener.Events(flagSet, this.eventTimes));
    }

    public void releaseInternal() {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, AnalyticsListener.EVENT_PLAYER_RELEASED, new a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0));
        this.listeners.release();
    }

    @Override
    public void addListener(AnalyticsListener analyticsListener) {
        analyticsListener.getClass();
        this.listeners.add(analyticsListener);
    }

    public final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return generateEventTime(this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod());
    }

    @RequiresNonNull({"player"})
    public final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int i3, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
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
        return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, i3, mediaPeriodId2, defaultPositionMs, this.player.getCurrentTimeline(), this.player.getCurrentMediaItemIndex(), this.mediaPeriodQueueTracker.getCurrentPlayerMediaPeriod(), this.player.getCurrentPosition(), this.player.getTotalBufferedDuration());
    }

    @Override
    public final void notifySeekStarted() {
        if (this.isSeeking) {
            return;
        }
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.isSeeking = true;
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new a(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3));
    }

    @Override
    public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 20, new f0(eventTimeGenerateReadingMediaPeriodEventTime, audioAttributes, 5));
    }

    @Override
    public final void onAudioCodecError(Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_CODEC_ERROR, new i(eventTimeGenerateReadingMediaPeriodEventTime, exc, 2));
    }

    @Override
    public final void onAudioDecoderInitialized(String str, long j, long j9) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, new l(eventTimeGenerateReadingMediaPeriodEventTime, str, j9, j, 0));
    }

    @Override
    public final void onAudioDecoderReleased(String str) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, new e(eventTimeGenerateReadingMediaPeriodEventTime, str, 0));
    }

    @Override
    public final void onAudioDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_DISABLED, new b(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters, 1));
    }

    @Override
    public final void onAudioEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_ENABLED, new b(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters, 0));
    }

    @Override
    public final void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED, new r(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, 1));
    }

    @Override
    public final void onAudioPositionAdvancing(long j) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING, new c(eventTimeGenerateReadingMediaPeriodEventTime, j, 1));
    }

    @Override
    public final void onAudioSessionIdChanged(int i3) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 21, new f(eventTimeGenerateReadingMediaPeriodEventTime, i3, 5));
    }

    @Override
    public final void onAudioSinkError(Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_SINK_ERROR, new i(eventTimeGenerateReadingMediaPeriodEventTime, exc, 3));
    }

    @Override
    public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED, new s(eventTimeGenerateReadingMediaPeriodEventTime, audioTrackConfig, 0));
    }

    @Override
    public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED, new s(eventTimeGenerateReadingMediaPeriodEventTime, audioTrackConfig, 1));
    }

    @Override
    public final void onAudioUnderrun(int i3, long j, long j9) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_AUDIO_UNDERRUN, new g(eventTimeGenerateReadingMediaPeriodEventTime, i3, j, j9, 1));
    }

    @Override
    public void onAvailableCommandsChanged(Player.Commands commands) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 13, new f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, commands, 3));
    }

    @Override
    public final void onBandwidthSample(int i3, long j, long j9) {
        AnalyticsListener.EventTime eventTimeGenerateLoadingMediaPeriodEventTime = generateLoadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateLoadingMediaPeriodEventTime, AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, new g(eventTimeGenerateLoadingMediaPeriodEventTime, i3, j, j9, 0));
    }

    @Override
    public void onCues(List<Cue> list) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, list, 9));
    }

    @Override
    public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 29, new f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, deviceInfo, 10));
    }

    @Override
    public void onDeviceVolumeChanged(int i3, boolean z6) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 30, new k(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, z6));
    }

    @Override
    public final void onDownstreamFormatChanged(int i3, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1004, new p(eventTimeGenerateMediaPeriodEventTime, mediaLoadData, 0));
    }

    @Override
    public void onDrmKeysLoaded(int i3, MediaSource.MediaPeriodId mediaPeriodId, KeyRequestInfo keyRequestInfo) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_LOADED, new f0(eventTimeGenerateMediaPeriodEventTime, keyRequestInfo, 8));
    }

    @Override
    public final void onDrmKeysRemoved(int i3, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_REMOVED, new a(eventTimeGenerateMediaPeriodEventTime, 1));
    }

    @Override
    public final void onDrmKeysRestored(int i3, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_KEYS_RESTORED, new a(eventTimeGenerateMediaPeriodEventTime, 2));
    }

    @Override
    public final void onDrmSessionAcquired(int i3, MediaSource.MediaPeriodId mediaPeriodId, int i9) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED, new f(eventTimeGenerateMediaPeriodEventTime, i9, 4));
    }

    @Override
    public final void onDrmSessionManagerError(int i3, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1024, new i(eventTimeGenerateMediaPeriodEventTime, exc, 1));
    }

    @Override
    public final void onDrmSessionReleased(int i3, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_DRM_SESSION_RELEASED, new a(eventTimeGenerateMediaPeriodEventTime, 4));
    }

    @Override
    public final void onDroppedFrames(int i3, long j) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, new m(eventTimeGeneratePlayingMediaPeriodEventTime, i3, j));
    }

    @Override
    public void onDroppedSeeksWhileScrubbing(int i3) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, AnalyticsListener.EVENT_DROPPED_SEEKS_WHILE_SCRUBBING, new f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 2));
    }

    @Override
    public void onEvents(Player player, Player.Events events) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z6) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, new d(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, z6));
    }

    @Override
    public void onIsPlayingChanged(boolean z6) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 7, new d(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, z6));
    }

    @Override
    public final void onLoadCanceled(int i3, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1002, new q(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, 0));
    }

    @Override
    public final void onLoadCompleted(int i3, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1001, new q(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, 1));
    }

    @Override
    public final void onLoadError(int i3, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z6) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1003, new j(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, iOException, z6));
    }

    @Override
    public final void onLoadStarted(int i3, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i9) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, 1000, new u(eventTimeGenerateMediaPeriodEventTime, loadEventInfo, mediaLoadData, i9, 1));
    }

    @Override
    public void onLoadingChanged(boolean z6) {
    }

    @Override
    public void onMaxSeekToPreviousPositionChanged(long j) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 18, new c(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j, 3));
    }

    @Override
    public final void onMediaItemTransition(MediaItem mediaItem, int i3) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1, new androidx.media3.common.f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaItem, i3, 1));
    }

    @Override
    public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 14, new t(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata, 1));
    }

    @Override
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 28, new f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, metadata, 6));
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z6, int i3) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 5, new k(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 2, z6));
    }

    @Override
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 12, new f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playbackParameters, 1));
    }

    @Override
    public final void onPlaybackStateChanged(int i3) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 4, new f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 3));
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i3) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 6, new f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 1));
    }

    @Override
    public final void onPlayerError(PlaybackException playbackException) {
        AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new n(eventTimeForErrorEvent, playbackException, 1));
    }

    @Override
    public void onPlayerErrorChanged(PlaybackException playbackException) {
        AnalyticsListener.EventTime eventTimeForErrorEvent = getEventTimeForErrorEvent(playbackException);
        sendEvent(eventTimeForErrorEvent, 10, new n(eventTimeForErrorEvent, playbackException, 0));
    }

    @Override
    public final void onPlayerStateChanged(boolean z6, int i3) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new k(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 0, z6));
    }

    @Override
    public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 15, new t(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata, 0));
    }

    @Override
    public void onPositionDiscontinuity(int i3) {
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    @Override
    public void onRendererReadyChanged(final int i3, final int i9, final boolean z6) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_RENDERER_READY_CHANGED, new ListenerSet.Event() {
            @Override
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRendererReadyChanged(eventTimeGenerateReadingMediaPeriodEventTime, i3, i9, z6);
            }
        });
    }

    @Override
    public final void onRepeatModeChanged(int i3) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 8, new f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 6));
    }

    @Override
    public void onSeekBackIncrementChanged(long j) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 16, new c(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j, 2));
    }

    @Override
    public void onSeekForwardIncrementChanged(long j) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 17, new c(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, j, 0));
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z6) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 9, new d(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, z6));
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z6) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 23, new d(eventTimeGenerateReadingMediaPeriodEventTime, 1, z6));
    }

    @Override
    public final void onSurfaceSizeChanged(final int i3, final int i9) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 24, new ListenerSet.Event() {
            @Override
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(eventTimeGenerateReadingMediaPeriodEventTime, i3, i9);
            }
        });
    }

    @Override
    public final void onTimelineChanged(Timeline timeline, int i3) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        Player player = this.player;
        player.getClass();
        mediaPeriodQueueTracker.onTimelineChanged(player);
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, new f(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, i3, 0));
    }

    @Override
    public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 19, new f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, trackSelectionParameters, 2));
    }

    @Override
    public void onTracksChanged(Tracks tracks) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, new f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, tracks, 7));
    }

    @Override
    public final void onUpstreamDiscarded(int i3, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeGenerateMediaPeriodEventTime = generateMediaPeriodEventTime(i3, mediaPeriodId);
        sendEvent(eventTimeGenerateMediaPeriodEventTime, AnalyticsListener.EVENT_UPSTREAM_DISCARDED, new p(eventTimeGenerateMediaPeriodEventTime, mediaLoadData, 1));
    }

    @Override
    public final void onVideoCodecError(Exception exc) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_CODEC_ERROR, new i(eventTimeGenerateReadingMediaPeriodEventTime, exc, 0));
    }

    @Override
    public final void onVideoDecoderInitialized(String str, long j, long j9) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED, new l(eventTimeGenerateReadingMediaPeriodEventTime, str, j9, j, 1));
    }

    @Override
    public final void onVideoDecoderReleased(String str) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_DECODER_RELEASED, new e(eventTimeGenerateReadingMediaPeriodEventTime, str, 1));
    }

    @Override
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_DISABLED, new b(eventTimeGeneratePlayingMediaPeriodEventTime, decoderCounters, 2));
    }

    @Override
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_ENABLED, new b(eventTimeGenerateReadingMediaPeriodEventTime, decoderCounters, 3));
    }

    @Override
    public final void onVideoFrameProcessingOffset(long j, int i3) {
        AnalyticsListener.EventTime eventTimeGeneratePlayingMediaPeriodEventTime = generatePlayingMediaPeriodEventTime();
        sendEvent(eventTimeGeneratePlayingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_FRAME_PROCESSING_OFFSET, new m(eventTimeGeneratePlayingMediaPeriodEventTime, j, i3));
    }

    @Override
    public final void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, new r(eventTimeGenerateReadingMediaPeriodEventTime, format, decoderReuseEvaluation, 0));
    }

    @Override
    public final void onVideoSizeChanged(VideoSize videoSize) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 25, new f0(eventTimeGenerateReadingMediaPeriodEventTime, videoSize, 11));
    }

    @Override
    public final void onVolumeChanged(final float f9) {
        final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 22, new ListenerSet.Event() {
            @Override
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(eventTimeGenerateReadingMediaPeriodEventTime, f9);
            }
        });
    }

    @Override
    public void release() {
        HandlerWrapper handlerWrapper = this.handler;
        handlerWrapper.getClass();
        handlerWrapper.post(new RunnableC0239y(9, this));
    }

    @Override
    public void removeListener(AnalyticsListener analyticsListener) {
        this.listeners.remove(analyticsListener);
    }

    public final void sendEvent(AnalyticsListener.EventTime eventTime, int i3, ListenerSet.Event<AnalyticsListener> event) {
        this.eventTimes.put(i3, eventTime);
        this.listeners.sendEvent(i3, event);
    }

    @Override
    public void setPlayer(Player player, Looper looper) {
        AbstractC1864o0.Y(this.player == null || this.mediaPeriodQueueTracker.mediaPeriodQueue.isEmpty());
        player.getClass();
        this.player = player;
        this.handler = this.clock.createHandler(looper, null);
        this.listeners = this.listeners.copy(looper, this.clock, new f0(this, player, 4));
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z6) {
        this.listeners.setThrowsWhenUsingWrongThread(z6);
    }

    @Override
    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        Player player = this.player;
        player.getClass();
        mediaPeriodQueueTracker.onQueueUpdated(list, mediaPeriodId, player);
    }

    @Override
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i3) {
        if (i3 == 1) {
            this.isSeeking = false;
        }
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.mediaPeriodQueueTracker;
        Player player = this.player;
        player.getClass();
        mediaPeriodQueueTracker.onPositionDiscontinuity(player);
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 11, new u(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, positionInfo, positionInfo2, i3));
    }

    @Override
    public final void onRenderedFirstFrame(Object obj, long j) {
        AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = generateReadingMediaPeriodEventTime();
        sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 26, new v(j, eventTimeGenerateReadingMediaPeriodEventTime, obj));
    }

    @Override
    public void onCues(CueGroup cueGroup) {
        AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 27, new f0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, cueGroup, 12));
    }

    private AnalyticsListener.EventTime generateEventTime(MediaSource.MediaPeriodId mediaPeriodId) {
        this.player.getClass();
        Timeline mediaPeriodIdTimeline = mediaPeriodId == null ? null : this.mediaPeriodQueueTracker.getMediaPeriodIdTimeline(mediaPeriodId);
        if (mediaPeriodId != null && mediaPeriodIdTimeline != null) {
            return generateEventTime(mediaPeriodIdTimeline, mediaPeriodIdTimeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId);
        }
        int currentMediaItemIndex = this.player.getCurrentMediaItemIndex();
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.getWindowCount()) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, currentMediaItemIndex, null);
    }
}
