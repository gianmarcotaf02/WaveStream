package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4TimestampData implements androidx.media3.common.Metadata.Entry {
    public static final int TIMESCALE_UNSET = -1;
    private static final int UNIX_EPOCH_TO_MP4_TIME_DELTA_SECONDS = 2082844800;
    public final long creationTimestampSeconds;
    public final long modificationTimestampSeconds;
    public final long timescale;

    public Mp4TimestampData(long j, long j9) {
        this.creationTimestampSeconds = j;
        this.modificationTimestampSeconds = j9;
        this.timescale = -1L;
    }

    public static long unixTimeToMp4TimeSeconds(long j) {
        return (j / 1000) + 2082844800;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.container.Mp4TimestampData)) {
            return false;
        }
        androidx.media3.container.Mp4TimestampData mp4TimestampData = (androidx.media3.container.Mp4TimestampData) obj;
        return this.creationTimestampSeconds == mp4TimestampData.creationTimestampSeconds && this.modificationTimestampSeconds == mp4TimestampData.modificationTimestampSeconds && this.timescale == mp4TimestampData.timescale;
    }

    public int hashCode() {
        return com.google.android.gms.internal.play_billing.V0.v(this.timescale) + ((com.google.android.gms.internal.play_billing.V0.v(this.modificationTimestampSeconds) + ((com.google.android.gms.internal.play_billing.V0.v(this.creationTimestampSeconds) + 527) * 31)) * 31);
    }

    public java.lang.String toString() {
        return "Mp4Timestamp: creation time=" + this.creationTimestampSeconds + ", modification time=" + this.modificationTimestampSeconds + ", timescale=" + this.timescale;
    }

    public Mp4TimestampData(long j, long j9, long j10) {
        this.creationTimestampSeconds = j;
        this.modificationTimestampSeconds = j9;
        this.timescale = j10;
    }
}
