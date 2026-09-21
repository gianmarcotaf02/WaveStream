package androidx.media3.exoplayer.offline;

public interface WritableDownloadIndex extends DownloadIndex {
    void putDownload(Download download);

    void removeDownload(String str);

    void setDownloadingStatesToQueued();

    void setStatesToRemoving();

    void setStopReason(int i3);

    void setStopReason(String str, int i3);
}
