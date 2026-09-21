package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class MediaExtractorCompat {
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    private final androidx.media3.exoplayer.MediaExtractorCompatInternal delegate;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }

    public MediaExtractorCompat(android.content.Context context) {
        this(new androidx.media3.extractor.DefaultExtractorsFactory(), new androidx.media3.datasource.DefaultDataSource.Factory(context));
    }

    public boolean advance() {
        return this.delegate.advance();
    }

    public androidx.media3.exoplayer.upstream.Allocator getAllocator() {
        return this.delegate.getAllocator();
    }

    public long getCachedDuration() {
        return this.delegate.getCachedDuration();
    }

    public androidx.media3.common.DrmInitData getDrmInitData() {
        return this.delegate.getDrmInitData();
    }

    public android.media.metrics.LogSessionId getLogSessionId() {
        return this.delegate.getLogSessionId();
    }

    public android.os.PersistableBundle getMetrics() {
        return this.delegate.getMetrics();
    }

    public java.util.Map<java.util.UUID, byte[]> getPsshInfo() {
        return this.delegate.getPsshInfo();
    }

    public boolean getSampleCryptoInfo(android.media.MediaCodec.CryptoInfo cryptoInfo) {
        return this.delegate.getSampleCryptoInfo(cryptoInfo);
    }

    public int getSampleFlags() {
        return this.delegate.getSampleFlags();
    }

    public long getSampleSize() {
        return this.delegate.getSampleSize();
    }

    public long getSampleTime() {
        return this.delegate.getSampleTime();
    }

    public int getSampleTrackIndex() {
        return this.delegate.getSampleTrackIndex();
    }

    public int getTrackCount() {
        return this.delegate.getTrackCount();
    }

    public android.media.MediaFormat getTrackFormat(int i3) {
        return this.delegate.getTrackFormat(i3);
    }

    public boolean hasCacheReachedEndOfStream() {
        return this.delegate.hasCacheReachedEndOfStream();
    }

    public int readSampleData(java.nio.ByteBuffer byteBuffer, int i3) {
        return this.delegate.readSampleData(byteBuffer, i3);
    }

    public void release() {
        this.delegate.release();
    }

    public void seekTo(long j, int i3) {
        this.delegate.seekTo(j, i3);
    }

    public void selectTrack(int i3) {
        this.delegate.selectTrack(i3);
    }

    public void setDataSource(android.net.Uri uri, long j) throws androidx.media3.common.ParserException {
        this.delegate.setDataSource(uri, j);
    }

    public void setLogSessionId(android.media.metrics.LogSessionId logSessionId) {
        this.delegate.setLogSessionId(logSessionId);
    }

    public void unselectTrack(int i3) {
        this.delegate.unselectTrack(i3);
    }

    public MediaExtractorCompat(androidx.media3.extractor.ExtractorsFactory extractorsFactory, androidx.media3.datasource.DataSource.Factory factory) {
        this.delegate = new androidx.media3.exoplayer.MediaExtractorCompatInternal(new androidx.media3.exoplayer.source.BundledExtractorsAdapter(extractorsFactory), factory);
    }

    public void setDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor) throws androidx.media3.common.ParserException {
        this.delegate.setDataSource(assetFileDescriptor);
    }

    public void setDataSource(java.io.FileDescriptor fileDescriptor) throws androidx.media3.common.ParserException {
        this.delegate.setDataSource(fileDescriptor);
    }

    public void setDataSource(java.io.FileDescriptor fileDescriptor, long j, long j9) throws androidx.media3.common.ParserException {
        this.delegate.setDataSource(fileDescriptor, j, j9);
    }

    public void setDataSource(android.content.Context context, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> map) throws androidx.media3.common.ParserException {
        this.delegate.setDataSource(context, uri, map);
    }

    public void setDataSource(java.lang.String str) throws androidx.media3.common.ParserException {
        this.delegate.setDataSource(str);
    }

    public void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) throws androidx.media3.common.ParserException {
        this.delegate.setDataSource(str, map);
    }

    public void setDataSource(android.media.MediaDataSource mediaDataSource) throws androidx.media3.common.ParserException {
        this.delegate.setDataSource(mediaDataSource);
    }
}
