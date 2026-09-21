package androidx.media3.container;

import androidx.media3.common.Metadata;
import com.google.android.gms.internal.play_billing.V0;

public final class Mp4TimestampData implements Metadata.Entry {
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.creationTimestampSeconds == mp4TimestampData.creationTimestampSeconds && this.modificationTimestampSeconds == mp4TimestampData.modificationTimestampSeconds && this.timescale == mp4TimestampData.timescale;
    }

    public int hashCode() {
        return V0.v(this.timescale) + ((V0.v(this.modificationTimestampSeconds) + ((V0.v(this.creationTimestampSeconds) + 527) * 31)) * 31);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.creationTimestampSeconds + ", modification time=" + this.modificationTimestampSeconds + ", timescale=" + this.timescale;
    }

    public Mp4TimestampData(long j, long j9, long j10) {
        this.creationTimestampSeconds = j;
        this.modificationTimestampSeconds = j9;
        this.timescale = j10;
    }
}
