package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
public interface DashSegmentIndex {
    public static final int INDEX_UNBOUNDED = -1;

    long getAvailableSegmentCount(long j, long j9);

    long getDurationUs(long j, long j9);

    long getFirstAvailableSegmentNum(long j, long j9);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long j, long j9);

    long getSegmentCount(long j);

    long getSegmentNum(long j, long j9);

    androidx.media3.exoplayer.dash.manifest.RangedUri getSegmentUrl(long j);

    long getTimeUs(long j);

    boolean isExplicit();
}
