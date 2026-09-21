package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.media3.exoplayer.video.VideoFrameMetadataListener {
    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public final void onVideoFrameAboutToBeRendered(long j, long j9, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
        androidx.media3.exoplayer.video.DefaultVideoSink.lambda$new$1(j, j9, format, mediaFormat);
    }
}
