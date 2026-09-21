package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class MlltFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final java.lang.String ID = "MLLT";
    public final int bytesBetweenReference;
    public final int[] bytesDeviations;
    public final int millisecondsBetweenReference;
    public final int[] millisecondsDeviations;
    public final int mpegFramesBetweenReference;

    public MlltFrame(int i3, int i9, int i10, int[] iArr, int[] iArr2) {
        super(ID);
        this.mpegFramesBetweenReference = i3;
        this.bytesBetweenReference = i9;
        this.millisecondsBetweenReference = i10;
        this.bytesDeviations = iArr;
        this.millisecondsDeviations = iArr2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.id3.MlltFrame.class == obj.getClass()) {
            androidx.media3.extractor.metadata.id3.MlltFrame mlltFrame = (androidx.media3.extractor.metadata.id3.MlltFrame) obj;
            if (this.mpegFramesBetweenReference == mlltFrame.mpegFramesBetweenReference && this.bytesBetweenReference == mlltFrame.bytesBetweenReference && this.millisecondsBetweenReference == mlltFrame.millisecondsBetweenReference && java.util.Arrays.equals(this.bytesDeviations, mlltFrame.bytesDeviations) && java.util.Arrays.equals(this.millisecondsDeviations, mlltFrame.millisecondsDeviations)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.millisecondsDeviations) + ((java.util.Arrays.hashCode(this.bytesDeviations) + ((((((527 + this.mpegFramesBetweenReference) * 31) + this.bytesBetweenReference) * 31) + this.millisecondsBetweenReference) * 31)) * 31);
    }
}
