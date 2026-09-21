package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final class Av1SampleDependencyParser {
    private static final int MAX_BYTES_FROM_KEYFRAME_TO_READ = 500;
    private static final int MAX_OBU_COUNT_FOR_PARTIAL_SKIP = 8;
    private final java.nio.ByteBuffer delayedKeyFrameTruncatedSample = java.nio.ByteBuffer.allocateDirect(500);
    private androidx.media3.container.ObuParser.SequenceHeader sequenceHeader;

    private boolean canSkipObu(androidx.media3.container.ObuParser.Obu obu, boolean z6) {
        androidx.media3.container.ObuParser.SequenceHeader sequenceHeader;
        androidx.media3.container.ObuParser.FrameHeader frameHeader;
        int i3 = obu.type;
        if (i3 == 2 || i3 == 15) {
            return true;
        }
        if (i3 != 3 || z6) {
            return ((i3 != 6 && i3 != 3) || (sequenceHeader = this.sequenceHeader) == null || (frameHeader = androidx.media3.container.ObuParser.FrameHeader.parse(sequenceHeader, obu)) == null || frameHeader.isDependedOn()) ? false : true;
        }
        return false;
    }

    private void emptyDelayedKeyFrameTruncatedSample() {
        java.nio.ByteBuffer byteBuffer = this.delayedKeyFrameTruncatedSample;
        byteBuffer.position(byteBuffer.limit());
    }

    private void updateSequenceHeaders(java.util.List<androidx.media3.container.ObuParser.Obu> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (list.get(i3).type == 1) {
                this.sequenceHeader = androidx.media3.container.ObuParser.SequenceHeader.parse(list.get(i3));
            }
        }
    }

    public void queueInputBuffer(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(java.lang.Math.min(iLimit, iPosition + 500));
        this.delayedKeyFrameTruncatedSample.clear();
        this.delayedKeyFrameTruncatedSample.put(byteBuffer);
        this.delayedKeyFrameTruncatedSample.flip();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
    }

    public void reset() {
        this.sequenceHeader = null;
        emptyDelayedKeyFrameTruncatedSample();
    }

    public int sampleLimitAfterSkippingNonReferenceFrame(java.nio.ByteBuffer byteBuffer, boolean z6) {
        if (this.delayedKeyFrameTruncatedSample.hasRemaining()) {
            updateSequenceHeaders(androidx.media3.container.ObuParser.split(this.delayedKeyFrameTruncatedSample));
            emptyDelayedKeyFrameTruncatedSample();
        }
        java.util.List<androidx.media3.container.ObuParser.Obu> listSplit = androidx.media3.container.ObuParser.split(byteBuffer);
        updateSequenceHeaders(listSplit);
        int size = listSplit.size() - 1;
        int i3 = 0;
        while (size >= 0 && canSkipObu(listSplit.get(size), z6)) {
            if (listSplit.get(size).type == 6 || listSplit.get(size).type == 3) {
                i3++;
            }
            size--;
        }
        if (i3 > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? listSplit.get(size).payload.limit() : byteBuffer.position();
    }
}
