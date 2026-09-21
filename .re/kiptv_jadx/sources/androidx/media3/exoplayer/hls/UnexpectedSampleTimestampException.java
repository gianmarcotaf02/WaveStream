package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class UnexpectedSampleTimestampException extends java.io.IOException {
    public final long lastAcceptedSampleTimeUs;
    public final androidx.media3.exoplayer.source.chunk.MediaChunk mediaChunk;
    public final long rejectedSampleTimeUs;

    public UnexpectedSampleTimestampException(androidx.media3.exoplayer.source.chunk.MediaChunk mediaChunk, long j, long j9) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected sample timestamp: ");
        sb.append(androidx.media3.common.util.Util.usToMs(j9));
        sb.append(" in chunk [");
        sb.append(mediaChunk.startTimeUs);
        sb.append(", ");
        super(Y6.f.g(mediaChunk.endTimeUs, "]", sb));
        this.mediaChunk = mediaChunk;
        this.lastAcceptedSampleTimeUs = j;
        this.rejectedSampleTimeUs = j9;
    }
}
