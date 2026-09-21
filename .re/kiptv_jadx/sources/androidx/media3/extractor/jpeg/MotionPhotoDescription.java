package androidx.media3.extractor.jpeg;

/* JADX INFO: loaded from: classes.dex */
final class MotionPhotoDescription {
    public final java.util.List<androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem> items;
    public final long photoPresentationTimestampUs;

    public static final class ContainerItem {
        public final long length;
        public final java.lang.String mime;
        public final long padding;
        public final java.lang.String semantic;

        public ContainerItem(java.lang.String str, java.lang.String str2, long j, long j9) {
            this.mime = str;
            this.semantic = str2;
            this.length = j;
            this.padding = j9;
        }
    }

    public MotionPhotoDescription(long j, java.util.List<androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem> list) {
        this.photoPresentationTimestampUs = j;
        this.items = list;
    }

    public androidx.media3.extractor.metadata.MotionPhotoMetadata getMotionPhotoMetadata(long j) {
        long j9;
        androidx.media3.extractor.metadata.MotionPhotoMetadata motionPhotoMetadata = null;
        if (this.items.size() < 2) {
            return null;
        }
        boolean z6 = true;
        int size = this.items.size() - 1;
        long j10 = j;
        long j11 = -1;
        long j12 = -1;
        long j13 = -1;
        long j14 = -1;
        while (size >= 0) {
            androidx.media3.extractor.jpeg.MotionPhotoDescription.ContainerItem containerItem = this.items.get(size);
            boolean z9 = (containerItem.mime.equals(androidx.media3.common.MimeTypes.VIDEO_MP4) || containerItem.mime.equals(androidx.media3.common.MimeTypes.VIDEO_QUICK_TIME)) ? z6 : false;
            if (size == 0) {
                j10 -= containerItem.padding;
                j9 = 0;
            } else {
                j9 = j10 - containerItem.length;
            }
            long j15 = j10;
            j10 = j9;
            if (z9 && j10 != j15) {
                j14 = j15 - j10;
                j13 = j10;
            }
            if (size == 0) {
                j12 = j15;
                j11 = j10;
            }
            size--;
            motionPhotoMetadata = motionPhotoMetadata;
            z6 = true;
        }
        return (j13 == -1 || j14 == -1 || j11 == -1 || j12 == -1) ? motionPhotoMetadata : new androidx.media3.extractor.metadata.MotionPhotoMetadata(j11, j12, this.photoPresentationTimestampUs, j13, j14);
    }
}
