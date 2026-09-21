package androidx.media3.exoplayer.hls;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import java.io.IOException;

final class UnexpectedSampleTimestampException extends IOException {
    public final long lastAcceptedSampleTimeUs;
    public final MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(MediaChunk mediaChunk, long j, long j9) {
        StringBuilder sb = new StringBuilder("Unexpected sample timestamp: ");
        sb.append(Util.usToMs(j9));
        sb.append(" in chunk [");
        sb.append(mediaChunk.startTimeUs);
        sb.append(", ");
        super(Y6.f.g(mediaChunk.endTimeUs, "]", sb));
        this.mediaChunk = mediaChunk;
        this.lastAcceptedSampleTimeUs = j;
        this.rejectedSampleTimeUs = j9;
    }
}
