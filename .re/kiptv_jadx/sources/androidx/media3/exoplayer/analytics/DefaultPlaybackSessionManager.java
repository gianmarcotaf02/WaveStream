package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultPlaybackSessionManager implements androidx.media3.exoplayer.analytics.PlaybackSessionManager {
    public static final p068h4.v DEFAULT_SESSION_ID_GENERATOR = new androidx.media3.exoplayer.analytics.x(0);
    private static final java.util.Random RANDOM = new java.util.Random();
    private static final int SESSION_ID_LENGTH = 12;
    private java.lang.String currentSessionId;
    private androidx.media3.common.Timeline currentTimeline;
    private long lastRemovedCurrentWindowSequenceNumber;
    private androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener listener;
    private final androidx.media3.common.Timeline.Period period;
    private final p068h4.v sessionIdGenerator;
    private final java.util.HashMap<java.lang.String, androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor> sessions;
    private final androidx.media3.common.Timeline.Window window;

    public final class SessionDescriptor {
        private androidx.media3.exoplayer.source.MediaSource.MediaPeriodId adMediaPeriodId;
        private boolean isActive;
        private boolean isCreated;
        private final java.lang.String sessionId;
        private int windowIndex;
        private long windowSequenceNumber;

        public SessionDescriptor(java.lang.String str, int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            this.sessionId = str;
            this.windowIndex = i3;
            this.windowSequenceNumber = mediaPeriodId == null ? -1L : mediaPeriodId.windowSequenceNumber;
            if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
                return;
            }
            this.adMediaPeriodId = mediaPeriodId;
        }

        private int resolveWindowIndexToNewTimeline(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2, int i3) {
            if (i3 >= timeline.getWindowCount()) {
                if (i3 < timeline2.getWindowCount()) {
                    return i3;
                }
                return -1;
            }
            timeline.getWindow(i3, androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this.window);
            for (int i9 = androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this.window.firstPeriodIndex; i9 <= androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this.window.lastPeriodIndex; i9++) {
                int indexOfPeriod = timeline2.getIndexOfPeriod(timeline.getUidOfPeriod(i9));
                if (indexOfPeriod != -1) {
                    return timeline2.getPeriod(indexOfPeriod, androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this.period).windowIndex;
                }
            }
            return -1;
        }

        public boolean belongsToSession(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (mediaPeriodId != null) {
                long j = mediaPeriodId.windowSequenceNumber;
                if (j != -1) {
                    androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = this.adMediaPeriodId;
                    if (mediaPeriodId2 == null) {
                        return !mediaPeriodId.isAd() && mediaPeriodId.windowSequenceNumber == this.windowSequenceNumber;
                    }
                    return j == mediaPeriodId2.windowSequenceNumber && mediaPeriodId.adGroupIndex == mediaPeriodId2.adGroupIndex && mediaPeriodId.adIndexInAdGroup == mediaPeriodId2.adIndexInAdGroup;
                }
            }
            return i3 == this.windowIndex;
        }

        public boolean isFinishedAtEventTime(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId == null) {
                return this.windowIndex != eventTime.windowIndex;
            }
            long j = this.windowSequenceNumber;
            if (j == -1) {
                return false;
            }
            if (mediaPeriodId.windowSequenceNumber > j) {
                return true;
            }
            if (this.adMediaPeriodId == null) {
                return false;
            }
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
            int indexOfPeriod2 = eventTime.timeline.getIndexOfPeriod(this.adMediaPeriodId.periodUid);
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            if (mediaPeriodId2.windowSequenceNumber < this.adMediaPeriodId.windowSequenceNumber || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!mediaPeriodId2.isAd()) {
                int i3 = eventTime.mediaPeriodId.nextAdGroupIndex;
                return i3 == -1 || i3 > this.adMediaPeriodId.adGroupIndex;
            }
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            int i9 = mediaPeriodId3.adGroupIndex;
            int i10 = mediaPeriodId3.adIndexInAdGroup;
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId4 = this.adMediaPeriodId;
            int i11 = mediaPeriodId4.adGroupIndex;
            return i9 > i11 || (i9 == i11 && i10 > mediaPeriodId4.adIndexInAdGroup);
        }

        public void maybeSetWindowSequenceNumber(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (this.windowSequenceNumber != -1 || i3 != this.windowIndex || mediaPeriodId == null || mediaPeriodId.windowSequenceNumber < androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.this.getMinWindowSequenceNumber()) {
                return;
            }
            this.windowSequenceNumber = mediaPeriodId.windowSequenceNumber;
        }

        public boolean tryResolvingToNewTimeline(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline timeline2) {
            int iResolveWindowIndexToNewTimeline = resolveWindowIndexToNewTimeline(timeline, timeline2, this.windowIndex);
            this.windowIndex = iResolveWindowIndexToNewTimeline;
            if (iResolveWindowIndexToNewTimeline == -1) {
                return false;
            }
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = this.adMediaPeriodId;
            return mediaPeriodId == null || timeline2.getIndexOfPeriod(mediaPeriodId.periodUid) != -1;
        }
    }

    public DefaultPlaybackSessionManager() {
        this(DEFAULT_SESSION_ID_GENERATOR);
    }

    private void clearCurrentSession(androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor) {
        if (sessionDescriptor.windowSequenceNumber != -1 && sessionDescriptor.isCreated) {
            this.lastRemovedCurrentWindowSequenceNumber = sessionDescriptor.windowSequenceNumber;
        }
        this.currentSessionId = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String generateDefaultSessionId() {
        byte[] bArr = new byte[12];
        RANDOM.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMinWindowSequenceNumber() {
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
        return (sessionDescriptor == null || sessionDescriptor.windowSequenceNumber == -1) ? this.lastRemovedCurrentWindowSequenceNumber + 1 : sessionDescriptor.windowSequenceNumber;
    }

    private androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor getOrAddSession(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = null;
        long j = Long.MAX_VALUE;
        for (androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor2 : this.sessions.values()) {
            sessionDescriptor2.maybeSetWindowSequenceNumber(i3, mediaPeriodId);
            if (sessionDescriptor2.belongsToSession(i3, mediaPeriodId)) {
                long j9 = sessionDescriptor2.windowSequenceNumber;
                if (j9 == -1 || j9 < j) {
                    sessionDescriptor = sessionDescriptor2;
                    j = j9;
                } else if (j9 == j && ((androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor) androidx.media3.common.util.Util.castNonNull(sessionDescriptor)).adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId != null) {
                    sessionDescriptor = sessionDescriptor2;
                }
            }
        }
        if (sessionDescriptor != null) {
            return sessionDescriptor;
        }
        java.lang.String str = (java.lang.String) this.sessionIdGenerator.get();
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor3 = new androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor(str, i3, mediaPeriodId);
        this.sessions.put(str, sessionDescriptor3);
        return sessionDescriptor3;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"listener"})
    private void updateCurrentSession(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        if (eventTime.timeline.isEmpty()) {
            java.lang.String str = this.currentSessionId;
            if (str != null) {
                androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = this.sessions.get(str);
                sessionDescriptor.getClass();
                clearCurrentSession(sessionDescriptor);
                return;
            }
            return;
        }
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor2 = this.sessions.get(this.currentSessionId);
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        this.currentSessionId = orAddSession.sessionId;
        updateSessions(eventTime);
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId == null || !mediaPeriodId.isAd()) {
            return;
        }
        if (sessionDescriptor2 != null && sessionDescriptor2.windowSequenceNumber == eventTime.mediaPeriodId.windowSequenceNumber && sessionDescriptor2.adMediaPeriodId != null && sessionDescriptor2.adMediaPeriodId.adGroupIndex == eventTime.mediaPeriodId.adGroupIndex && sessionDescriptor2.adMediaPeriodId.adIndexInAdGroup == eventTime.mediaPeriodId.adIndexInAdGroup) {
            return;
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        this.listener.onAdPlaybackStarted(eventTime, getOrAddSession(eventTime.windowIndex, new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber)).sessionId, orAddSession.sessionId);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized boolean belongsToSession(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str) {
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = this.sessions.get(str);
        if (sessionDescriptor == null) {
            return false;
        }
        sessionDescriptor.maybeSetWindowSequenceNumber(eventTime.windowIndex, eventTime.mediaPeriodId);
        return sessionDescriptor.belongsToSession(eventTime.windowIndex, eventTime.mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void finishAllSessions(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener listener;
        try {
            java.lang.String str = this.currentSessionId;
            if (str != null) {
                androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = this.sessions.get(str);
                sessionDescriptor.getClass();
                clearCurrentSession(sessionDescriptor);
            }
            java.util.Iterator<androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor next = it.next();
                it.remove();
                if (next.isCreated && (listener = this.listener) != null) {
                    listener.onSessionFinished(eventTime, next.sessionId, false);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized java.lang.String getActiveSessionId() {
        return this.currentSessionId;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized java.lang.String getSessionForMediaPeriodId(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return getOrAddSession(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, mediaPeriodId).sessionId;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public void setListener(androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener listener) {
        this.listener = listener;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessions(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        this.listener.getClass();
        if (eventTime.timeline.isEmpty()) {
            return;
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
        if (mediaPeriodId != null) {
            long j = mediaPeriodId.windowSequenceNumber;
            if (j != -1 && j < getMinWindowSequenceNumber()) {
                return;
            }
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor sessionDescriptor = this.sessions.get(this.currentSessionId);
            if (sessionDescriptor != null && sessionDescriptor.windowSequenceNumber == -1 && sessionDescriptor.windowIndex != eventTime.windowIndex) {
                return;
            }
        }
        androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor orAddSession = getOrAddSession(eventTime.windowIndex, eventTime.mediaPeriodId);
        if (this.currentSessionId == null) {
            this.currentSessionId = orAddSession.sessionId;
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
        if (mediaPeriodId2 != null && mediaPeriodId2.isAd()) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId3 = eventTime.mediaPeriodId;
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId4 = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(mediaPeriodId3.periodUid, mediaPeriodId3.windowSequenceNumber, mediaPeriodId3.adGroupIndex);
            androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor orAddSession2 = getOrAddSession(eventTime.windowIndex, mediaPeriodId4);
            if (!orAddSession2.isCreated) {
                orAddSession2.isCreated = true;
                eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period);
                this.listener.onSessionCreated(new androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime(eventTime.realtimeMs, eventTime.timeline, eventTime.windowIndex, mediaPeriodId4, java.lang.Math.max(0L, androidx.media3.common.util.Util.usToMs(this.period.getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex)) + this.period.getPositionInWindowMs()), eventTime.currentTimeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs), orAddSession2.sessionId);
            }
        }
        if (!orAddSession.isCreated) {
            orAddSession.isCreated = true;
            this.listener.onSessionCreated(eventTime, orAddSession.sessionId);
        }
        if (orAddSession.sessionId.equals(this.currentSessionId) && !orAddSession.isActive) {
            orAddSession.isActive = true;
            this.listener.onSessionActive(eventTime, orAddSession.sessionId);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithDiscontinuity(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3) {
        try {
            this.listener.getClass();
            boolean z6 = i3 == 0;
            java.util.Iterator<androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor next = it.next();
                if (next.isFinishedAtEventTime(eventTime)) {
                    it.remove();
                    boolean zEquals = next.sessionId.equals(this.currentSessionId);
                    if (zEquals) {
                        clearCurrentSession(next);
                    }
                    if (next.isCreated) {
                        this.listener.onSessionFinished(eventTime, next.sessionId, z6 && zEquals && next.isActive);
                    }
                }
            }
            updateCurrentSession(eventTime);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager
    public synchronized void updateSessionsWithTimelineChange(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime) {
        try {
            this.listener.getClass();
            androidx.media3.common.Timeline timeline = this.currentTimeline;
            this.currentTimeline = eventTime.timeline;
            java.util.Iterator<androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor> it = this.sessions.values().iterator();
            while (it.hasNext()) {
                androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.SessionDescriptor next = it.next();
                if (!next.tryResolvingToNewTimeline(timeline, this.currentTimeline) || next.isFinishedAtEventTime(eventTime)) {
                    it.remove();
                    if (next.sessionId.equals(this.currentSessionId)) {
                        clearCurrentSession(next);
                    }
                    if (next.isCreated) {
                        this.listener.onSessionFinished(eventTime, next.sessionId, false);
                    }
                }
            }
            updateCurrentSession(eventTime);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public DefaultPlaybackSessionManager(p068h4.v vVar) {
        this.sessionIdGenerator = vVar;
        this.window = new androidx.media3.common.Timeline.Window();
        this.period = new androidx.media3.common.Timeline.Period();
        this.sessions = new java.util.HashMap<>();
        this.currentTimeline = androidx.media3.common.Timeline.EMPTY;
        this.lastRemovedCurrentWindowSequenceNumber = -1L;
    }
}
