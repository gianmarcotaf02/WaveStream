package androidx.media3.exoplayer.offline;

public interface DownloadIndex {
    Download getDownload(String str);

    DownloadCursor getDownloads(int... iArr);
}
