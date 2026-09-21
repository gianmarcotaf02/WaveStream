package androidx.media3.extractor.metadata;

/* JADX INFO: loaded from: classes.dex */
public final class ThumbnailMetadata implements androidx.media3.common.Metadata.Entry {
    public final long presentationTimeUs;

    public ThumbnailMetadata(long j) {
        this.presentationTimeUs = j;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && androidx.media3.extractor.metadata.ThumbnailMetadata.class == obj.getClass() && this.presentationTimeUs == ((androidx.media3.extractor.metadata.ThumbnailMetadata) obj).presentationTimeUs;
    }

    public int hashCode() {
        return com.google.android.gms.internal.play_billing.V0.v(this.presentationTimeUs) + 527;
    }

    public java.lang.String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.presentationTimeUs;
    }
}
