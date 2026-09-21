package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
final class MimeTypeResolver {
    private MimeTypeResolver() {
    }

    public static java.lang.String getContainerMimeType(androidx.media3.common.Format format) {
        java.lang.String str = format.sampleMimeType;
        if (androidx.media3.common.MimeTypes.isVideo(str)) {
            return androidx.media3.common.MimeTypes.VIDEO_MP4;
        }
        if (androidx.media3.common.MimeTypes.isAudio(str)) {
            return androidx.media3.common.MimeTypes.AUDIO_MP4;
        }
        if (!androidx.media3.common.MimeTypes.isImage(str)) {
            return androidx.media3.common.MimeTypes.APPLICATION_MP4;
        }
        if (java.util.Objects.equals(str, androidx.media3.common.MimeTypes.IMAGE_HEIC)) {
            return androidx.media3.common.MimeTypes.IMAGE_HEIF;
        }
        return java.util.Objects.equals(str, androidx.media3.common.MimeTypes.IMAGE_AVIF) ? androidx.media3.common.MimeTypes.IMAGE_AVIF : androidx.media3.common.MimeTypes.APPLICATION_MP4;
    }

    public static java.lang.String getContainerMimeType(java.util.List<androidx.media3.extractor.mp4.TrackSampleTable> list) {
        java.util.Iterator<androidx.media3.extractor.mp4.TrackSampleTable> it = list.iterator();
        boolean z6 = false;
        java.lang.String str = null;
        while (it.hasNext()) {
            java.lang.String str2 = it.next().track.format.sampleMimeType;
            if (androidx.media3.common.MimeTypes.isVideo(str2)) {
                return androidx.media3.common.MimeTypes.VIDEO_MP4;
            }
            if (androidx.media3.common.MimeTypes.isAudio(str2)) {
                z6 = true;
            } else if (androidx.media3.common.MimeTypes.isImage(str2)) {
                if (java.util.Objects.equals(str2, androidx.media3.common.MimeTypes.IMAGE_HEIC)) {
                    str = androidx.media3.common.MimeTypes.IMAGE_HEIF;
                } else if (java.util.Objects.equals(str2, androidx.media3.common.MimeTypes.IMAGE_AVIF)) {
                    str = androidx.media3.common.MimeTypes.IMAGE_AVIF;
                }
            }
        }
        if (z6) {
            return androidx.media3.common.MimeTypes.AUDIO_MP4;
        }
        return str != null ? str : androidx.media3.common.MimeTypes.APPLICATION_MP4;
    }
}
