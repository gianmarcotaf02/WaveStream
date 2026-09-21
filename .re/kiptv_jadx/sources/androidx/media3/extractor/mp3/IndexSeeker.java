package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class IndexSeeker implements androidx.media3.extractor.mp3.Seeker {
    static final long MIN_TIME_BETWEEN_POINTS_US = 100000;
    private final int averageBitrate;
    private final long dataEndPosition;
    private final long dataStartPosition;
    private final androidx.media3.extractor.IndexSeekMap indexSeekMap;

    public IndexSeeker(long j, long j9, long j10) {
        this.indexSeekMap = new androidx.media3.extractor.IndexSeekMap(new long[]{j9}, new long[]{0}, j);
        this.dataStartPosition = j9;
        this.dataEndPosition = j10;
        int i3 = androidx.media3.common.C.RATE_UNSET_INT;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            this.averageBitrate = androidx.media3.common.C.RATE_UNSET_INT;
            return;
        }
        long jScaleLargeValue = androidx.media3.common.util.Util.scaleLargeValue(j9 - j10, 8L, j, java.math.RoundingMode.HALF_UP);
        if (jScaleLargeValue > 0 && jScaleLargeValue <= 2147483647L) {
            i3 = (int) jScaleLargeValue;
        }
        this.averageBitrate = i3;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.averageBitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return this.dataStartPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.indexSeekMap.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        return this.indexSeekMap.getSeekPoints(j);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.indexSeekMap.getTimeUs(j);
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.indexSeekMap.isSeekable();
    }

    public boolean isTimeUsInIndex(long j) {
        return this.indexSeekMap.isTimeUsInIndex(j, 100000L);
    }

    public void maybeAddSeekPoint(long j, long j9) {
        if (isTimeUsInIndex(j)) {
            return;
        }
        this.indexSeekMap.addSeekPoint(j, j9);
    }

    public void setDurationUs(long j) {
        this.indexSeekMap.setDurationUs(j);
    }
}
