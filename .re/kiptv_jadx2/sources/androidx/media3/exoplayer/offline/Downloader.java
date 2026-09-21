package androidx.media3.exoplayer.offline;

public interface Downloader {

    public interface ProgressListener {
        void onProgress(long j, long j9, float f9);
    }

    void cancel();

    void download(ProgressListener progressListener);

    void remove();
}
