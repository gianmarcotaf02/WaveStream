package androidx.media3.exoplayer.video;

import android.media.MediaFormat;
import androidx.media3.common.Format;

public final class b implements VideoFrameMetadataListener {
    @Override
    public final void onVideoFrameAboutToBeRendered(long j, long j9, Format format, MediaFormat mediaFormat) {
        DefaultVideoSink.lambda$new$1(j, j9, format, mediaFormat);
    }
}
