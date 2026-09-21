package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public final class BaseMediaChunkOutput implements androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider {
    private static final java.lang.String TAG = "BaseMediaChunkOutput";
    private final androidx.media3.exoplayer.source.SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i3 = 0;
        while (true) {
            androidx.media3.exoplayer.source.SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i3 >= sampleQueueArr.length) {
                return iArr;
            }
            iArr[i3] = sampleQueueArr[i3].getWriteIndex();
            i3++;
        }
    }

    public void setSampleOffsetUs(long j) {
        for (androidx.media3.exoplayer.source.SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j);
        }
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider
    public androidx.media3.extractor.TrackOutput track(int i3, int i9) {
        int i10 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i10 >= iArr.length) {
                androidx.media3.common.util.Log.e(TAG, "Unmatched track of type: " + i9);
                return new androidx.media3.extractor.DiscardingTrackOutput();
            }
            if (i9 == iArr[i10]) {
                return this.sampleQueues[i10];
            }
            i10++;
        }
    }
}
