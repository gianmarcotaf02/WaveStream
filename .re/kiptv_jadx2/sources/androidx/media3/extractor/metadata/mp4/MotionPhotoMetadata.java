package androidx.media3.extractor.metadata.mp4;

import androidx.media3.common.Metadata;
import com.google.android.gms.internal.play_billing.V0;

@Deprecated
public class MotionPhotoMetadata implements Metadata.Entry {
    public final long photoPresentationTimestampUs;
    public final long photoSize;
    public final long photoStartPosition;
    public final long videoSize;
    public final long videoStartPosition;

    public MotionPhotoMetadata(long j, long j9, long j10, long j11, long j12) {
        this.photoStartPosition = j;
        this.photoSize = j9;
        this.photoPresentationTimestampUs = j10;
        this.videoStartPosition = j11;
        this.videoSize = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.photoStartPosition == motionPhotoMetadata.photoStartPosition && this.photoSize == motionPhotoMetadata.photoSize && this.photoPresentationTimestampUs == motionPhotoMetadata.photoPresentationTimestampUs && this.videoStartPosition == motionPhotoMetadata.videoStartPosition && this.videoSize == motionPhotoMetadata.videoSize) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return V0.v(this.videoSize) + ((V0.v(this.videoStartPosition) + ((V0.v(this.photoPresentationTimestampUs) + ((V0.v(this.photoSize) + ((V0.v(this.photoStartPosition) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.photoStartPosition + ", photoSize=" + this.photoSize + ", photoPresentationTimestampUs=" + this.photoPresentationTimestampUs + ", videoStartPosition=" + this.videoStartPosition + ", videoSize=" + this.videoSize;
    }
}
