package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class FlacSeekTableSeekMap implements androidx.media3.extractor.SeekMap {
    private final long firstFrameOffset;
    private final androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata;

    public FlacSeekTableSeekMap(androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata, long j) {
        this.flacStreamMetadata = flacStreamMetadata;
        this.firstFrameOffset = j;
    }

    private androidx.media3.extractor.SeekPoint getSeekPoint(long j, long j9) {
        return new androidx.media3.extractor.SeekPoint((j * 1000000) / ((long) this.flacStreamMetadata.sampleRate), this.firstFrameOffset + j9);
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.flacStreamMetadata.getDurationUs();
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        this.flacStreamMetadata.seekTable.getClass();
        androidx.media3.extractor.FlacStreamMetadata flacStreamMetadata = this.flacStreamMetadata;
        androidx.media3.extractor.FlacStreamMetadata.SeekTable seekTable = flacStreamMetadata.seekTable;
        long[] jArr = seekTable.pointSampleNumbers;
        long[] jArr2 = seekTable.pointOffsets;
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(jArr, flacStreamMetadata.getSampleNumber(j), true, false);
        androidx.media3.extractor.SeekPoint seekPoint = getSeekPoint(iBinarySearchFloor == -1 ? 0L : jArr[iBinarySearchFloor], iBinarySearchFloor != -1 ? jArr2[iBinarySearchFloor] : 0L);
        if (seekPoint.timeUs == j || iBinarySearchFloor == jArr.length - 1) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i3 = iBinarySearchFloor + 1;
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, getSeekPoint(jArr[i3], jArr2[i3]));
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
