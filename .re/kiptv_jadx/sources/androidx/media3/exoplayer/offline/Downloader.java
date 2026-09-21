package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j, long j9, float f9);
    }

    void cancel();

    void download(androidx.media3.exoplayer.offline.Downloader.ProgressListener progressListener);

    void remove();
}
