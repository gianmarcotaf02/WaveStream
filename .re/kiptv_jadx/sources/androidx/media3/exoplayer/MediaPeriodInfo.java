package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class MediaPeriodInfo {
    public final long durationUs;
    public final long endPositionUs;
    public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId id;
    public final boolean isFinal;
    public final boolean isFollowedByTransitionToSameStream;
    public final boolean isLastInTimelinePeriod;
    public final boolean isLastInTimelineWindow;
    public final boolean isPrecededByTransitionFromSameStream;
    public final long liveStreamStartPositionProjectionUs;
    public final long requestedContentPositionUs;
    public final long startPositionUs;

    public MediaPeriodInfo(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j9, long j10, long j11, long j12, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13 = true;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!z12 || z10);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!z11 || z10);
        if (z9 && (z10 || z11 || z12)) {
            z13 = false;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z13);
        this.id = mediaPeriodId;
        this.startPositionUs = j;
        this.liveStreamStartPositionProjectionUs = j9;
        this.requestedContentPositionUs = j10;
        this.endPositionUs = j11;
        this.durationUs = j12;
        this.isPrecededByTransitionFromSameStream = z6;
        this.isFollowedByTransitionToSameStream = z9;
        this.isLastInTimelinePeriod = z10;
        this.isLastInTimelineWindow = z11;
        this.isFinal = z12;
    }

    public androidx.media3.exoplayer.MediaPeriodInfo copyWithRequestedContentPositionUs(long j) {
        return j == this.requestedContentPositionUs ? this : new androidx.media3.exoplayer.MediaPeriodInfo(this.id, this.startPositionUs, this.liveStreamStartPositionProjectionUs, j, this.endPositionUs, this.durationUs, this.isPrecededByTransitionFromSameStream, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public androidx.media3.exoplayer.MediaPeriodInfo copyWithStartPositionUs(long j, long j9) {
        return (j == this.startPositionUs && j9 == this.liveStreamStartPositionProjectionUs) ? this : new androidx.media3.exoplayer.MediaPeriodInfo(this.id, j, j9, this.requestedContentPositionUs, this.endPositionUs, this.durationUs, this.isPrecededByTransitionFromSameStream, this.isFollowedByTransitionToSameStream, this.isLastInTimelinePeriod, this.isLastInTimelineWindow, this.isFinal);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.exoplayer.MediaPeriodInfo.class == obj.getClass()) {
            androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = (androidx.media3.exoplayer.MediaPeriodInfo) obj;
            if (this.startPositionUs == mediaPeriodInfo.startPositionUs && this.requestedContentPositionUs == mediaPeriodInfo.requestedContentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isPrecededByTransitionFromSameStream == mediaPeriodInfo.isPrecededByTransitionFromSameStream && this.isFollowedByTransitionToSameStream == mediaPeriodInfo.isFollowedByTransitionToSameStream && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isLastInTimelineWindow == mediaPeriodInfo.isLastInTimelineWindow && this.isFinal == mediaPeriodInfo.isFinal && java.util.Objects.equals(this.id, mediaPeriodInfo.id)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((this.id.hashCode() + 527) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.requestedContentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isPrecededByTransitionFromSameStream ? 1 : 0)) * 31) + (this.isFollowedByTransitionToSameStream ? 1 : 0)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isLastInTimelineWindow ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
