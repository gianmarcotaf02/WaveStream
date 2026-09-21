package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public interface ProgressiveMediaExtractor {

    public interface Factory {
        androidx.media3.exoplayer.source.ProgressiveMediaExtractor createProgressiveMediaExtractor(androidx.media3.exoplayer.analytics.PlayerId playerId);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    default java.lang.String getUnderlyingImplementationName() {
        return null;
    }

    void init(androidx.media3.common.DataReader dataReader, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, long j9, androidx.media3.extractor.ExtractorOutput extractorOutput);

    int read(androidx.media3.extractor.PositionHolder positionHolder);

    void release();

    void seek(long j, long j9);
}
