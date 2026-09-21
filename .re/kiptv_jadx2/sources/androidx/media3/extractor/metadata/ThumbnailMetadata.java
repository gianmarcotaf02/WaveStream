package androidx.media3.extractor.metadata;

import androidx.media3.common.Metadata;
import com.google.android.gms.internal.play_billing.V0;

public final class ThumbnailMetadata implements Metadata.Entry {
    public final long presentationTimeUs;

    public ThumbnailMetadata(long j) {
        this.presentationTimeUs = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ThumbnailMetadata.class == obj.getClass() && this.presentationTimeUs == ((ThumbnailMetadata) obj).presentationTimeUs;
    }

    public int hashCode() {
        return V0.v(this.presentationTimeUs) + 527;
    }

    public String toString() {
        return "ThumbnailMetadata: presentationTimeUs=" + this.presentationTimeUs;
    }
}
