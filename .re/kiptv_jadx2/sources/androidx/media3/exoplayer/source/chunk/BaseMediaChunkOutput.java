package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.TrackOutput;

public final class BaseMediaChunkOutput implements ChunkExtractor.TrackOutputProvider {
    private static final String TAG = "BaseMediaChunkOutput";
    private final SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i3 = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i3 >= sampleQueueArr.length) {
                return iArr;
            }
            iArr[i3] = sampleQueueArr[i3].getWriteIndex();
            i3++;
        }
    }

    public void setSampleOffsetUs(long j) {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j);
        }
    }

    @Override
    public TrackOutput track(int i3, int i9) {
        int i10 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i10 >= iArr.length) {
                Log.e(TAG, "Unmatched track of type: " + i9);
                return new DiscardingTrackOutput();
            }
            if (i9 == iArr[i10]) {
                return this.sampleQueues[i10];
            }
            i10++;
        }
    }
}
