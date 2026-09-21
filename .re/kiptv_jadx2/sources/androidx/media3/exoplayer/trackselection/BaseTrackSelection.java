package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.Arrays;
import java.util.List;

public abstract class BaseTrackSelection implements ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final Format[] formats;
    protected final TrackGroup group;
    private int hashCode;
    protected final int length;
    private boolean playWhenReady;
    protected final int[] tracks;
    private final int type;

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    public static int lambda$new$0(Format format, Format format2) {
        return format2.bitrate - format.bitrate;
    }

    @Override
    public void disable() {
    }

    @Override
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
            if (this.group.equals(baseTrackSelection.group) && Arrays.equals(this.tracks, baseTrackSelection.tracks)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int evaluateQueueSize(long j, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override
    public boolean excludeTrack(int i3, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsTrackExcluded = isTrackExcluded(i3, jElapsedRealtime);
        int i9 = 0;
        while (i9 < this.length && !zIsTrackExcluded) {
            zIsTrackExcluded = (i9 == i3 || isTrackExcluded(i9, jElapsedRealtime)) ? false : true;
            i9++;
        }
        if (!zIsTrackExcluded) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i3] = Math.max(jArr[i3], Util.addWithOverflowDefault(jElapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override
    public final Format getFormat(int i3) {
        return this.formats[i3];
    }

    @Override
    public final int getIndexInTrackGroup(int i3) {
        return this.tracks[i3];
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    @Override
    public final Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.tracks) + (System.identityHashCode(this.group) * 31);
        }
        return this.hashCode;
    }

    @Override
    public final int indexOf(Format format) {
        for (int i3 = 0; i3 < this.length; i3++) {
            if (this.formats[i3] == format) {
                return i3;
            }
        }
        return -1;
    }

    @Override
    public boolean isTrackExcluded(int i3, long j) {
        return this.excludeUntilTimes[i3] > j;
    }

    @Override
    public final int length() {
        return this.tracks.length;
    }

    @Override
    public void onPlayWhenReadyChanged(boolean z6) {
        this.playWhenReady = z6;
    }

    @Override
    public void onPlaybackSpeed(float f9) {
    }

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr, int i3) {
        AbstractC1864o0.Y(iArr.length > 0);
        this.type = i3;
        trackGroup.getClass();
        this.group = trackGroup;
        int length = iArr.length;
        this.length = length;
        this.formats = new Format[length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.formats[i9] = trackGroup.getFormat(iArr[i9]);
        }
        Arrays.sort(this.formats, new a(6));
        this.tracks = new int[this.length];
        int i10 = 0;
        while (true) {
            int i11 = this.length;
            if (i10 >= i11) {
                this.excludeUntilTimes = new long[i11];
                this.playWhenReady = false;
                return;
            } else {
                this.tracks[i10] = trackGroup.indexOf(this.formats[i10]);
                i10++;
            }
        }
    }

    @Override
    public final int indexOf(int i3) {
        for (int i9 = 0; i9 < this.length; i9++) {
            if (this.tracks[i9] == i3) {
                return i9;
            }
        }
        return -1;
    }
}
