package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public interface MediaSource {

    public static final class MediaPeriodId {
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final int nextAdGroupIndex;
        public final java.lang.Object periodUid;
        public final long windowSequenceNumber;

        public MediaPeriodId(java.lang.Object obj) {
            this(obj, -1L);
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId copyWithPeriodUid(java.lang.Object obj) {
            return this.periodUid.equals(obj) ? this : new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(obj, this.adGroupIndex, this.adIndexInAdGroup, this.windowSequenceNumber, this.nextAdGroupIndex);
        }

        public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId copyWithWindowSequenceNumber(long j) {
            return this.windowSequenceNumber == j ? this : new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(this.periodUid, this.adGroupIndex, this.adIndexInAdGroup, j, this.nextAdGroupIndex);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.exoplayer.source.MediaSource.MediaPeriodId)) {
                return false;
            }
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) obj;
            return this.periodUid.equals(mediaPeriodId.periodUid) && this.adGroupIndex == mediaPeriodId.adGroupIndex && this.adIndexInAdGroup == mediaPeriodId.adIndexInAdGroup && this.windowSequenceNumber == mediaPeriodId.windowSequenceNumber && this.nextAdGroupIndex == mediaPeriodId.nextAdGroupIndex;
        }

        public int hashCode() {
            return ((((((((this.periodUid.hashCode() + 527) * 31) + this.adGroupIndex) * 31) + this.adIndexInAdGroup) * 31) + ((int) this.windowSequenceNumber)) * 31) + this.nextAdGroupIndex;
        }

        public boolean isAd() {
            return this.adGroupIndex != -1;
        }

        public MediaPeriodId(java.lang.Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public MediaPeriodId(java.lang.Object obj, long j, int i3) {
            this(obj, -1, -1, j, i3);
        }

        public MediaPeriodId(java.lang.Object obj, int i3, int i9, long j) {
            this(obj, i3, i9, j, -1);
        }

        private MediaPeriodId(java.lang.Object obj, int i3, int i9, long j, int i10) {
            this.periodUid = obj;
            this.adGroupIndex = i3;
            this.adIndexInAdGroup = i9;
            this.windowSequenceNumber = j;
            this.nextAdGroupIndex = i10;
        }
    }

    public interface MediaSourceCaller {
        void onSourceInfoRefreshed(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline);
    }

    void addDrmEventListener(android.os.Handler handler, androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener);

    void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener);

    default boolean canUpdateMediaItem(androidx.media3.common.MediaItem mediaItem) {
        return false;
    }

    androidx.media3.exoplayer.source.MediaPeriod createPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.upstream.Allocator allocator, long j);

    void disable(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller);

    void enable(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller);

    default androidx.media3.common.Timeline getInitialTimeline() {
        return null;
    }

    androidx.media3.common.MediaItem getMediaItem();

    default boolean isSingleWindow() {
        return true;
    }

    void maybeThrowSourceInfoRefreshError();

    void prepareSource(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller, androidx.media3.datasource.TransferListener transferListener, androidx.media3.exoplayer.analytics.PlayerId playerId);

    void releasePeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod);

    void releaseSource(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller);

    void removeDrmEventListener(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener);

    void removeEventListener(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener);

    default void updateMediaItem(androidx.media3.common.MediaItem mediaItem) {
    }

    public interface Factory {
        public static final androidx.media3.exoplayer.source.MediaSource.Factory UNSUPPORTED = androidx.media3.exoplayer.source.MediaSourceFactory.UNSUPPORTED;

        androidx.media3.exoplayer.source.MediaSource createMediaSource(androidx.media3.common.MediaItem mediaItem);

        @java.lang.Deprecated
        default androidx.media3.exoplayer.source.MediaSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z6) {
            return this;
        }

        default androidx.media3.exoplayer.source.MediaSource.Factory experimentalSetCodecsToParseWithinGopSampleDependencies(int i3) {
            return this;
        }

        int[] getSupportedTypes();

        default androidx.media3.exoplayer.source.MediaSource.Factory setCmcdConfigurationFactory(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory factory) {
            return this;
        }

        androidx.media3.exoplayer.source.MediaSource.Factory setDrmSessionManagerProvider(androidx.media3.exoplayer.drm.DrmSessionManagerProvider drmSessionManagerProvider);

        androidx.media3.exoplayer.source.MediaSource.Factory setLoadErrorHandlingPolicy(androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy);

        default androidx.media3.exoplayer.source.MediaSource.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            return this;
        }

        default androidx.media3.exoplayer.source.MediaSource.Factory setDownloadExecutor(p068h4.v vVar) {
            return this;
        }
    }
}
