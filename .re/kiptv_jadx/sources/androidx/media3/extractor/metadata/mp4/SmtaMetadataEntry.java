package androidx.media3.extractor.metadata.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class SmtaMetadataEntry implements androidx.media3.common.Metadata.Entry {
    public final float captureFrameRate;
    public final int svcTemporalLayerCount;

    public SmtaMetadataEntry(float f9, int i3) {
        this.captureFrameRate = f9;
        this.svcTemporalLayerCount = i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry.class == obj.getClass()) {
            androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry smtaMetadataEntry = (androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry) obj;
            if (this.captureFrameRate == smtaMetadataEntry.captureFrameRate && this.svcTemporalLayerCount == smtaMetadataEntry.svcTemporalLayerCount) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((java.lang.Float.valueOf(this.captureFrameRate).hashCode() + 527) * 31) + this.svcTemporalLayerCount;
    }

    public java.lang.String toString() {
        return "smta: captureFrameRate=" + this.captureFrameRate + ", svcTemporalLayerCount=" + this.svcTemporalLayerCount;
    }
}
