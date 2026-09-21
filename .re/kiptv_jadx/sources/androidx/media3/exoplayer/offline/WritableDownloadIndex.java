package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public interface WritableDownloadIndex extends androidx.media3.exoplayer.offline.DownloadIndex {
    void putDownload(androidx.media3.exoplayer.offline.Download download);

    void removeDownload(java.lang.String str);

    void setDownloadingStatesToQueued();

    void setStatesToRemoving();

    void setStopReason(int i3);

    void setStopReason(java.lang.String str, int i3);
}
