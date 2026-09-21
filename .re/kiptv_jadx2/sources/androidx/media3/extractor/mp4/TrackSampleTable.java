package androidx.media3.extractor.mp4;

import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;

public final class TrackSampleTable {
    public final long durationUs;
    public final int[] flags;
    public final boolean hasOnlySyncSamples;
    public final int maximumSize;
    public final long[] offsets;
    public final int sampleCount;
    public final int[] sizes;
    public final int[] syncSampleIndices;
    public final long[] timestampsUs;
    public final Track track;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i3, long[] jArr2, int[] iArr2, int[] iArr3, boolean z6, long j, int i9) {
        AbstractC1864o0.L(iArr.length == jArr2.length);
        AbstractC1864o0.L(jArr.length == jArr2.length);
        AbstractC1864o0.L(iArr2.length == jArr2.length);
        this.track = track;
        this.offsets = jArr;
        this.sizes = iArr;
        this.maximumSize = i3;
        this.timestampsUs = jArr2;
        this.flags = iArr2;
        this.syncSampleIndices = iArr3;
        this.hasOnlySyncSamples = z6;
        this.durationUs = j;
        this.sampleCount = i9;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | C.BUFFER_FLAG_LAST_SAMPLE;
        }
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long j) {
        if (!hasSampleTableData()) {
            return -1;
        }
        int i3 = 0;
        if (this.hasOnlySyncSamples) {
            return Util.binarySearchFloor(this.timestampsUs, j, true, false);
        }
        int length = this.syncSampleIndices.length - 1;
        int i9 = -1;
        while (i3 <= length) {
            int i10 = ((length - i3) / 2) + i3;
            if (this.timestampsUs[this.syncSampleIndices[i10]] <= j) {
                i3 = i10 + 1;
                i9 = i10;
            } else {
                length = i10 - 1;
            }
        }
        if (i9 == -1) {
            return -1;
        }
        long j9 = this.timestampsUs[this.syncSampleIndices[i9]];
        if (j9 == j) {
            while (i9 > 0 && this.timestampsUs[this.syncSampleIndices[i9 - 1]] == j9) {
                i9--;
            }
        }
        return this.syncSampleIndices[i9];
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long j) {
        if (!hasSampleTableData()) {
            return -1;
        }
        int i3 = 0;
        if (this.hasOnlySyncSamples) {
            return Util.binarySearchCeil(this.timestampsUs, j, true, false);
        }
        int length = this.syncSampleIndices.length - 1;
        int i9 = -1;
        while (i3 <= length) {
            int i10 = ((length - i3) / 2) + i3;
            if (this.timestampsUs[this.syncSampleIndices[i10]] >= j) {
                length = i10 - 1;
                i9 = i10;
            } else {
                i3 = i10 + 1;
            }
        }
        if (i9 == -1) {
            return -1;
        }
        long j9 = this.timestampsUs[this.syncSampleIndices[i9]];
        if (j9 == j) {
            while (true) {
                int[] iArr = this.syncSampleIndices;
                if (i9 >= iArr.length - 1) {
                    break;
                }
                int i11 = i9 + 1;
                if (this.timestampsUs[iArr[i11]] != j9) {
                    break;
                }
                i9 = i11;
            }
        }
        return this.syncSampleIndices[i9];
    }

    public boolean hasSampleTableData() {
        return this.timestampsUs.length > 0;
    }
}
