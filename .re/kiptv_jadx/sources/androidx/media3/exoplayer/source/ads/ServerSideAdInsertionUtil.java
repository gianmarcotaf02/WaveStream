package androidx.media3.exoplayer.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ServerSideAdInsertionUtil {
    private ServerSideAdInsertionUtil() {
    }

    public static androidx.media3.common.AdPlaybackState addAdGroupToAdPlaybackState(androidx.media3.common.AdPlaybackState adPlaybackState, long j, long j9, long... jArr) {
        long mediaPeriodPositionUsForContent = getMediaPeriodPositionUsForContent(j, -1, adPlaybackState);
        int i3 = adPlaybackState.removedAdGroupCount;
        while (i3 < adPlaybackState.adGroupCount && adPlaybackState.getAdGroup(i3).timeUs != Long.MIN_VALUE && adPlaybackState.getAdGroup(i3).timeUs <= mediaPeriodPositionUsForContent) {
            i3++;
        }
        androidx.media3.common.AdPlaybackState adPlaybackStateWithContentResumeOffsetUs = adPlaybackState.withNewAdGroup(i3, mediaPeriodPositionUsForContent).withIsServerSideInserted(i3, true).withAdCount(i3, jArr.length).withAdDurationsUs(i3, jArr).withContentResumeOffsetUs(i3, j9);
        androidx.media3.common.AdPlaybackState adPlaybackStateWithSkippedAd = adPlaybackStateWithContentResumeOffsetUs;
        for (int i9 = 0; i9 < jArr.length && jArr[i9] == 0; i9++) {
            adPlaybackStateWithSkippedAd = adPlaybackStateWithSkippedAd.withSkippedAd(i3, i9);
        }
        return correctFollowingAdGroupTimes(adPlaybackStateWithSkippedAd, i3, androidx.media3.common.util.Util.sum(jArr), j9);
    }

    private static androidx.media3.common.AdPlaybackState correctFollowingAdGroupTimes(androidx.media3.common.AdPlaybackState adPlaybackState, int i3, long j, long j9) {
        long j10 = (-j) + j9;
        while (true) {
            i3++;
            if (i3 >= adPlaybackState.adGroupCount) {
                return adPlaybackState;
            }
            long j11 = adPlaybackState.getAdGroup(i3).timeUs;
            if (j11 != Long.MIN_VALUE) {
                adPlaybackState = adPlaybackState.withAdGroupTimeUs(i3, j11 + j10);
            }
        }
    }

    public static int getAdCountInGroup(androidx.media3.common.AdPlaybackState adPlaybackState, int i3) {
        int i9 = adPlaybackState.getAdGroup(i3).count;
        if (i9 == -1) {
            return 0;
        }
        return i9;
    }

    public static long getMediaPeriodPositionUs(long j, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.AdPlaybackState adPlaybackState) {
        return mediaPeriodId.isAd() ? getMediaPeriodPositionUsForAd(j, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState) : getMediaPeriodPositionUsForContent(j, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }

    public static long getMediaPeriodPositionUsForAd(long j, int i3, int i9, androidx.media3.common.AdPlaybackState adPlaybackState) {
        int i10;
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
        long j9 = j - adGroup.timeUs;
        int i11 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i10 = 0;
            if (i11 >= i3) {
                break;
            }
            androidx.media3.common.AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i11);
            while (i10 < getAdCountInGroup(adPlaybackState, i11)) {
                j9 -= adGroup2.durationsUs[i10];
                i10++;
            }
            j9 += adGroup2.contentResumeOffsetUs;
            i11++;
        }
        if (i9 < getAdCountInGroup(adPlaybackState, i3)) {
            while (i10 < i9) {
                j9 -= adGroup.durationsUs[i10];
                i10++;
            }
        }
        return j9;
    }

    public static long getMediaPeriodPositionUsForContent(long j, int i3, androidx.media3.common.AdPlaybackState adPlaybackState) {
        if (i3 == -1) {
            i3 = adPlaybackState.adGroupCount;
        }
        long j9 = 0;
        for (int i9 = adPlaybackState.removedAdGroupCount; i9 < i3; i9++) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i9);
            long j10 = adGroup.timeUs;
            if (j10 == Long.MIN_VALUE || j10 > j - j9) {
                break;
            }
            for (int i10 = 0; i10 < getAdCountInGroup(adPlaybackState, i9); i10++) {
                j9 += adGroup.durationsUs[i10];
            }
            long j11 = adGroup.contentResumeOffsetUs;
            j9 -= j11;
            long j12 = adGroup.timeUs;
            long j13 = j - j9;
            if (j11 + j12 > j13) {
                return java.lang.Math.max(j12, j13);
            }
        }
        return j - j9;
    }

    public static long getStreamPositionUs(androidx.media3.common.Player player, java.lang.Object obj) {
        androidx.media3.common.Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        androidx.media3.common.Timeline.Period period = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), new androidx.media3.common.Timeline.Period());
        if (!java.util.Objects.equals(period.getAdsId(), obj)) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        if (!player.isPlayingAd()) {
            return getStreamPositionUsForContent(androidx.media3.common.util.Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs(), -1, period.adPlaybackState);
        }
        return getStreamPositionUsForAd(androidx.media3.common.util.Util.msToUs(player.getCurrentPosition()), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), period.adPlaybackState);
    }

    public static long getStreamPositionUsForAd(long j, int i3, int i9, androidx.media3.common.AdPlaybackState adPlaybackState) {
        int i10;
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i3);
        long j9 = j + adGroup.timeUs;
        int i11 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i10 = 0;
            if (i11 >= i3) {
                break;
            }
            androidx.media3.common.AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i11);
            while (i10 < getAdCountInGroup(adPlaybackState, i11)) {
                j9 += adGroup2.durationsUs[i10];
                i10++;
            }
            j9 -= adGroup2.contentResumeOffsetUs;
            i11++;
        }
        if (i9 < getAdCountInGroup(adPlaybackState, i3)) {
            while (i10 < i9) {
                j9 += adGroup.durationsUs[i10];
                i10++;
            }
        }
        return j9;
    }

    public static long getStreamPositionUsForContent(long j, int i3, androidx.media3.common.AdPlaybackState adPlaybackState) {
        if (i3 == -1) {
            i3 = adPlaybackState.adGroupCount;
        }
        long j9 = 0;
        for (int i9 = adPlaybackState.removedAdGroupCount; i9 < i3; i9++) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i9);
            long j10 = adGroup.timeUs;
            if (j10 == Long.MIN_VALUE || j10 > j) {
                break;
            }
            long j11 = j10 + j9;
            for (int i10 = 0; i10 < getAdCountInGroup(adPlaybackState, i9); i10++) {
                j9 += adGroup.durationsUs[i10];
            }
            long j12 = adGroup.contentResumeOffsetUs;
            j9 -= j12;
            if (adGroup.timeUs + j12 > j) {
                return java.lang.Math.max(j11, j + j9);
            }
        }
        return j + j9;
    }

    public static long getStreamPositionUs(long j, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.common.AdPlaybackState adPlaybackState) {
        if (mediaPeriodId.isAd()) {
            return getStreamPositionUsForAd(j, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        }
        return getStreamPositionUsForContent(j, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }
}
